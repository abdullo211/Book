package com.application.book.Settings;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.support.v4.app.Fragment;
import android.support.v7.widget.AppCompatSpinner;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.application.book.MainActivity;
import com.application.book.R;

import java.util.ArrayList;
import java.util.HashMap;

import at.markushi.ui.CircleButton;


public class SettingFragment extends Fragment {


    SeekBar seekBar;
    ImageView brightenes_image;

    CircleButton white_btn;
    CircleButton black_btn;
    CircleButton yellow_btn;
    CircleButton brown_btn;
    MainActivity activity;

    AppCompatSpinner text_size_spinner;
    AppCompatSpinner font_spinner;

    TextSizeAdapter textSizeAdapter;
    FontAdapter fontAdapter;

    ArrayList<TextSize> textSizeArrayList;
    ArrayList<Font> fontArrayList;

    SharedPreferences settingPrefs;
    SharedPreferences.Editor editor;
    Bitmap image;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.fragment_settings, null);
        settingPrefs = getContext().getSharedPreferences("settings", Context.MODE_PRIVATE);
        editor = settingPrefs.edit();
        activity = (MainActivity) getActivity();
        seekBar = (SeekBar) rootview.findViewById(R.id.brighteness_seekbar);
        brightenes_image = (ImageView) rootview.findViewById(R.id.brighteness_image);
        white_btn = (CircleButton) rootview.findViewById(R.id.text_color_white);
        black_btn = (CircleButton) rootview.findViewById(R.id.text_color_black);
        yellow_btn = (CircleButton) rootview.findViewById(R.id.text_color_yellow);
        brown_btn = (CircleButton) rootview.findViewById(R.id.text_color_brown_mode);
        text_size_spinner = (AppCompatSpinner) rootview.findViewById(R.id.text_size_spinner);
        font_spinner = (AppCompatSpinner) rootview.findViewById(R.id.font_spinner);
        textSizeArrayList = new ArrayList<>();
        fontArrayList = new ArrayList<>();



        final int fontNumber=settingPrefs.getInt("fontNumber",0);
        float textSize = settingPrefs.getFloat("textSize", getContext().getResources().getDimension(R.dimen.textsize_medium));


        fontArrayList.add(new Font("Garamond",Typeface.createFromAsset(getContext().getAssets(),"garamond.ttf")));
        fontArrayList.add(new Font("Serif",Typeface.create("serif-light", Typeface.NORMAL)));
        fontArrayList.add(new Font("Helvetica",Typeface.createFromAsset(getContext().getAssets(),"helvetica.ttf")));
        fontAdapter = new FontAdapter(fontArrayList, getContext());

        font_spinner.setAdapter(fontAdapter);

        font_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                activity.changeTypface(fontArrayList.get(position).typeface);
                editor.putInt("fontNumber",position);
                editor.apply();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });




        activity.textSize=textSize;
        if (textSize == getContext().getResources().getDimension(R.dimen.textsize_medium)) {

            textSizeArrayList.add(new TextSize(getContext().getResources().getDimension(R.dimen.textsize_medium), "Medium"));
            textSizeArrayList.add(new TextSize(getContext().getResources().getDimension(R.dimen.textsize_low), "Low"));
            textSizeArrayList.add(new TextSize(getContext().getResources().getDimension(R.dimen.textsize_high), "High"));
        } else if (textSize == getContext().getResources().getDimension(R.dimen.textsize_high)) {
            textSizeArrayList.add(new TextSize(getContext().getResources().getDimension(R.dimen.textsize_high), "High"));
            textSizeArrayList.add(new TextSize(getContext().getResources().getDimension(R.dimen.textsize_medium), "Medium"));
            textSizeArrayList.add(new TextSize(getContext().getResources().getDimension(R.dimen.textsize_low), "Low"));
        } else {
            textSizeArrayList.add(new TextSize(getContext().getResources().getDimension(R.dimen.textsize_low), "Low"));
            textSizeArrayList.add(new TextSize(getContext().getResources().getDimension(R.dimen.textsize_medium), "Medium"));
            textSizeArrayList.add(new TextSize(getContext().getResources().getDimension(R.dimen.textsize_high), "High"));
        }

        textSizeAdapter = new TextSizeAdapter(textSizeArrayList, getContext());
        text_size_spinner.setAdapter(textSizeAdapter);
        text_size_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
              activity.textSize=  textSizeArrayList.get(position).textSize;
                activity.changeTypface(fontArrayList.get(font_spinner.getSelectedItemPosition()).typeface);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });





        white_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.changeBgColor(Color.WHITE, Color.BLACK);
                activity.color = 0;
            }
        });
        brown_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.changeBgColor(Color.parseColor("#e5d398"), Color.BLACK);
                activity.color = 1;
            }
        });
        black_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.changeBgColor(Color.BLACK, Color.WHITE);
                activity.color = 2;
            }
        });
        yellow_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.changeBgColor(Color.parseColor("#FBF0D9"), Color.BLACK);
                activity.color = 3;
            }
        });


        brightenes_image.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Onclick", Toast.LENGTH_SHORT).show();
                if (v.getBackground() == getResources().getDrawable(R.drawable.brightness_whole_64x64)) {
                    brightenes_image.setBackground(getResources().getDrawable(R.drawable.brightness_half));
                } else if (v.getBackground() == getResources().getDrawable(R.drawable.brightness_half)) {
                    brightenes_image.setBackground(getResources().getDrawable(R.drawable.brightenes_full));
                } else if (v.getBackground() == getResources().getDrawable(R.drawable.brightenes_full)) {
                    brightenes_image.setBackground(getResources().getDrawable(R.drawable.brightness_auto));
                } else if (v.getBackground() == getResources().getDrawable(R.drawable.brightness_auto)) {
                    brightenes_image.setBackground(getResources().getDrawable(R.drawable.brightness_whole_64x64));
                }
            }
        });

        seekBar.setMax(255);

        float curBrightnessValue = 0;
        try {
            curBrightnessValue = android.provider.Settings.System.getInt(
                    getContext().getContentResolver(),
                    android.provider.Settings.System.SCREEN_BRIGHTNESS);
        } catch (Settings.SettingNotFoundException e) {
            e.printStackTrace();
        }

        int screen_brightness = (int) curBrightnessValue;
        seekBar.setProgress(screen_brightness);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progress = 0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progresValue,
                                          boolean fromUser) {
                progress = progresValue;
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                 /*   if (progress < 122) {

                        brightenes_image.setBackground(getResources().getDrawable(R.drawable.brightness_auto));
                    } else if (progresValue > 122 && progresValue < 140) {
                        brightenes_image.setBackground(getResources().getDrawable(R.drawable.brightness_half));
                    } else if (progress > 240) {

                        brightenes_image.setBackground(getResources().getDrawable(R.drawable.brightenes_full));
                    }
                    */


                    image = adjustedContrast( BitmapFactory.decodeResource(getResources(), R.drawable.brightenes_full), (float)(progress-255));
                    brightenes_image.setImageBitmap(image);

                }
                try{
                Settings.System.putInt(getContext().getContentResolver(),
                        Settings.System.SCREEN_BRIGHTNESS,
                        progress);}catch (Exception ignored){}
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        return rootview;
    }





    private Bitmap adjustedContrast(Bitmap src, double value)
    {
        // image size
        int width = src.getWidth();
        int height = src.getHeight();
        // create output bitmap

        // create a mutable empty bitmap
        Bitmap bmOut = Bitmap.createBitmap(width, height, src.getConfig());

        // create a canvas so that we can draw the bmOut Bitmap from source bitmap
        Canvas c = new Canvas();
        c.setBitmap(bmOut);

        // draw bitmap to bmOut from src bitmap so we can modify it
        c.drawBitmap(src, 0, 0, new Paint(Color.BLACK));


        // color information
        int A, R, G, B;
        int pixel;
        // get contrast value
        double contrast = Math.pow((100 + value) / 100, 2);

        // scan through all pixels
        for(int x = 0; x < width; ++x) {
            for(int y = 0; y < height; ++y) {
                // get pixel color
                pixel = src.getPixel(x, y);
                A = Color.alpha(pixel);
                // apply filter contrast for every channel R, G, B
                R = Color.red(pixel);
                R = (int)(((((R / 255.0) - 0.5) * contrast) + 0.5) * 255.0);
                if(R < 0) { R = 0; }
                else if(R > 255) { R = 255; }

                G = Color.green(pixel);
                G = (int)(((((G / 255.0) - 0.5) * contrast) + 0.5) * 255.0);
                if(G < 0) { G = 0; }
                else if(G > 255) { G = 255; }

                B = Color.blue(pixel);
                B = (int)(((((B / 255.0) - 0.5) * contrast) + 0.5) * 255.0);
                if(B < 0) { B = 0; }
                else if(B > 255) { B = 255; }

                // set new pixel color to output bitmap
                bmOut.setPixel(x, y, Color.argb(A, R, G, B));
            }
        }
        return bmOut;
    }

    /**
     *
     * @param bmp input bitmap
     * @param contrast 0..10 1 is default
     * @param brightness -255..255 0 is default
     * @return new bitmap
     */
    public static Bitmap changeBitmapContrastBrightness(Bitmap bmp, float contrast, float brightness)
    {
        ColorMatrix cm = new ColorMatrix(new float[]
                {
                        contrast, 0, 0, 0, brightness,
                        0, contrast, 0, 0, brightness,
                        0, 0, contrast, 0, brightness,
                        0, 0, 0, 1, 0
                });

        Bitmap ret = Bitmap.createBitmap(bmp.getWidth(), bmp.getHeight(), bmp.getConfig());

        Canvas canvas = new Canvas(ret);

        Paint paint = new Paint();
        paint.setColorFilter(new ColorMatrixColorFilter(cm));
        canvas.drawBitmap(bmp, 0, 0, paint);

        return ret;
    }






}
