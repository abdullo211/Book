package com.application.book;

import android.Manifest;
import android.annotation.TargetApi;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.AsyncTask;
import android.os.Build;
import android.os.SystemClock;
import android.support.v4.app.ActivityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.SlidingPaneLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.application.book.Library.PageTurnLayout;
import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.ashokvarma.bottomnavigation.BottomNavigationItem;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    String[] texts;
    String[] titles;
    public int mPages;
    ArrayList<String[]> list;
    String[] strings;
    public TextView[] views;
    public LinearLayout[] layouts;
    public PageTurnLayout layout;
    public int maxLinesOnPage;
    ViewPager pager;
    public TabsPagerAdapter adapter;
    public  int color=0;
    public float textSize;
    SlidingPaneLayout slidingPaneLayout;

    SharedPreferences shPrefs;
    SharedPreferences.Editor editor;
    public Typeface typeface;

    public TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        Log.d("Device size",getResources().getString(R.string.size));

        final BottomNavigationBar bnview = (BottomNavigationBar) findViewById(R.id.bottom_navigation_bar);

        bnview
                .addItem(new BottomNavigationItem(R.drawable.info, "Info"))
                .addItem(new BottomNavigationItem(R.drawable.settings, "Settings"))
                .addItem(new BottomNavigationItem(R.drawable.list, "Contents"))


                .initialise();
        pager = (ViewPager) findViewById(R.id.pager);

        pager.setOffscreenPageLimit(4);
        adapter = new TabsPagerAdapter(getSupportFragmentManager());
        pager.setAdapter(adapter);
        bnview.setTabSelectedListener(new BottomNavigationBar.OnTabSelectedListener() {
            @Override
            public void onTabSelected(int position) {

                pager.setCurrentItem(position);

            }

            @Override
            public void onTabUnselected(int position) {

            }

            @Override
            public void onTabReselected(int position) {

            }
        });

        pager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                bnview.selectTab(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });


        typeface = Typeface.createFromAsset(getAssets(), "garamond.ttf");
        layout = (PageTurnLayout) findViewById(R.id.layout);
        String arr = readFromFile();
        try {
            JSONArray mainArray = new JSONArray(arr);
            JSONObject firstBook = mainArray.getJSONObject(0);
            String title = firstBook.getString("name");
            String author = firstBook.getString("author");

            Log.d("String",mainArray.toString());

            JSONArray contents = firstBook.getJSONArray("contents");
            texts = new String[contents.length()];
            titles = new String[contents.length()];
            for (int i = 0; i < contents.length(); i++) {
                JSONObject object = contents.getJSONObject(i);
                texts[i] ="\n"+"***"+object.getString("title")+"***"+"\n"+ object.getString("text");
                titles[i] = object.getString("title");
            }


        } catch (JSONException e) {
            e.printStackTrace();
        }


        ///    hasPermission();


    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        if (requestCode == 101) {
            if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                //start audio recording or whatever you planned to do
            } else if (grantResults[0] == PackageManager.PERMISSION_DENIED) {
                if (ActivityCompat.shouldShowRequestPermissionRationale(this, Manifest.permission.WRITE_SETTINGS)) {
                    //Show an explanation to the user *asynchronously*
                    AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    builder.setMessage("This permission is important to record audio.")
                            .setTitle("Important permission required");
                    builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.WRITE_SETTINGS}, 101);
                        }
                    });
                    ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.RECORD_AUDIO}, 101);
                } else {
                    //Never ask again and handle your app without permission.
                }
            }
        }
    }


    @TargetApi(Build.VERSION_CODES.M)
    private void hasPermission() {
        int hasWriteContactsPermission = checkSelfPermission(Manifest.permission.WRITE_SETTINGS);
        if (hasWriteContactsPermission != PackageManager.PERMISSION_GRANTED) {
            requestPermissions(new String[]{Manifest.permission.WRITE_SETTINGS},
                    101);
            return;
        }

    }


    public void Paginatate(Typeface typeface) {


        Pagination[] paginations = new Pagination[titles.length];
        WindowManager wm = (WindowManager) getApplicationContext().getSystemService(Context.WINDOW_SERVICE);
        Display display = wm.getDefaultDisplay();
        DisplayMetrics metrics = new DisplayMetrics();
        display.getMetrics(metrics);
        int padding = (int) getResources().getDimension(R.dimen.padding);
        int width = metrics.widthPixels-padding;
        int height = metrics.heightPixels-padding;

       // height = (int) (height - 0.25* height-padding);

        TextPaint paint = new TextPaint();
        paint=textView.getPaint();
        paint.setTypeface(typeface);
        paint.setTextSize(textSize);
        int pages = 0;
        list = new ArrayList<>();
        int i = 0;

        mPages=0;
        while (i < titles.length) {

            paginations[i] = new Pagination(texts[i], textView.getWidth(), (int) Math.round(0.7* textView.getHeight()), paint, 2,1, true);
            pages = paginations[i].size();

            mPages += pages;
            strings = new String[pages];
            int j = 0;
            while (j < pages) {
                strings[j] = ((String) paginations[i].get(j));
                j += 1;
                maxLinesOnPage = paginations[i].lines;
            }


            list.add(strings);
            i += 1;
        }


    }


    public void savePrefs(){
        shPrefs=getApplicationContext().getSharedPreferences("Books",MODE_PRIVATE);
        editor=shPrefs.edit();
        editor.putInt("color",color);
        editor.putFloat("textSize",textSize);
        editor.apply();

    }


    public void savePageNumber(){
        shPrefs=getApplicationContext().getSharedPreferences("Books",MODE_PRIVATE);
        editor=shPrefs.edit();
        editor.putInt("pageNumeber",layout.mCurrentPage);
        editor.apply();
    }
    public void resetPageNumber(){
        shPrefs=getApplicationContext().getSharedPreferences("Books",MODE_PRIVATE);
        layout.mCurrentPage= shPrefs.getInt("pageNumeber",0);
        long downTime = SystemClock.uptimeMillis();
        long eventTime = SystemClock.uptimeMillis() + 100;
        float x = 30.0f;
        float y = 30.0f;

        int metaState = 0;
        MotionEvent down = MotionEvent.obtain(
                downTime,
                eventTime,
                MotionEvent.ACTION_DOWN,
                x,
                y,
                metaState
        );

        MotionEvent up = MotionEvent.obtain(
                downTime,
                eventTime,
                MotionEvent.ACTION_UP,
                x,
                y,
                metaState
        );

        layout.dispatchTouchEvent(down);
        layout.dispatchTouchEvent(up);
    }


    @Override
    protected void onPause() {
        savePageNumber();
        super.onPause();
    }

    public void readPrefs(){
        shPrefs=getApplicationContext().getSharedPreferences("Books",MODE_PRIVATE);
        color=shPrefs.getInt("color",0);
        textSize=shPrefs.getFloat("textSize", getResources().getDimension(R.dimen.textsize_medium));
       switch (color){
            case 0:  changeBgColor(Color.WHITE,Color.BLACK);break;
            case 1:  changeBgColor(Color.parseColor("#e5d398"),Color.BLACK);break;
            case 2:  changeBgColor(Color.BLACK,Color.WHITE);break;
            case 3:  changeBgColor(Color.parseColor("#FBF0D9"),Color.BLACK);break;
        }



    }




    public class Task extends AsyncTask {
        public ProgressDialog loadingDialog;
        public TextView[] pagesNumbers;
        public Typeface typeface;

        public Task(Typeface typeface) {
            this.typeface = typeface;
        }

        @Override
        protected void onPreExecute() {
            textView= (TextView) findViewById(R.id.first_text);
            textView.setVisibility(View.VISIBLE);
            this.loadingDialog = new ProgressDialog(MainActivity.this);
            this.loadingDialog.setCancelable(false);
            this.loadingDialog.setMessage("Loading...");
            this.loadingDialog.show();
            try {
                this.loadingDialog.show();
            } catch (Exception ignored) {
            }
            super.onPreExecute();
        }


        @Override
        protected Object doInBackground(Object[] params) {
            Paginatate(typeface);
            return null;
        }

        @Override
        protected void onPostExecute(Object o) {

            views = new TextView[mPages];
            layouts = new LinearLayout[mPages];

            int l = 0;
            layout.removeAllViews();
            adapter.bookmarkFragment.bookmarkList=new ArrayList<>();
            adapter.bookmarkFragment.bookmarkList.clear();
            adapter.bookmarkFragment.adapter  = new BookmarkFragment.Bookmark.BookmarkAdapter(adapter.bookmarkFragment,  adapter.bookmarkFragment.bookmarkList,adapter.bookmarkFragment.getContext());
            adapter.bookmarkFragment.listView.setAdapter( adapter.bookmarkFragment.adapter);
            for (int i = 0; i < list.size(); i++) {
                adapter.bookmarkFragment.bookmarkList.add(new BookmarkFragment.Bookmark(titles[i],l));
                adapter.bookmarkFragment.adapter.notifyDataSetChanged();


                strings=null;
                strings = list.get(i);
                for (String string : strings) {
                    LinearLayout.LayoutParams lparams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
                    layouts[l] = new LinearLayout(getApplicationContext());
                    views[l] = new TextView(getApplicationContext());
                    views[l].setLayoutParams(textView.getLayoutParams());
                    layouts[l].setLayoutParams(lparams);
                    views[l].setTextSize(textSize);
                    views[l].setLineSpacing(1f,1f);
                    views[l].setTypeface(typeface);
                    views[l].setTextColor(Color.parseColor("#000000"));
                    views[l].setBackgroundColor(Color.parseColor("#ffffff"));
                    int padding = (int) getResources().getDimension(R.dimen.padding);
                    views[l].setPadding(padding, padding, padding, padding);
                    views[l].setText(string);
                    layouts[l].addView(views[l]);
                    layout.addView(layouts[l]);
                    l++;

                }

            }
            readPrefs();

            textView.setVisibility(View.GONE);
            adapter.info.setSeekbarLayout();
            loadingDialog.hide();
            super.onPostExecute(o);
            resetPageNumber();
        }
    }

    private String readFromFile() {

        String ret = "";

        try {
            InputStream inputStream = openFileInput("book.txt");

            if (inputStream != null) {
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                String receiveString = "";
                StringBuilder stringBuilder = new StringBuilder();

                while ((receiveString = bufferedReader.readLine()) != null) {
                    stringBuilder.append(receiveString);
                }

                inputStream.close();
                ret = stringBuilder.toString();
            }
        } catch (FileNotFoundException e) {

        } catch (IOException e) {

        }

        return ret;
    }


    @Override
    public void onBackPressed() {
        savePrefs();
        super.onBackPressed();
    }

    public void changeBgColor(int bgColor, int txtcolor ){

        if (txtcolor==Color.WHITE){

            txtcolor=Color.parseColor("#FFFAFAFA");
        }

        for (int i=0;i<views.length;i++){
            try{
            views[i].setTextColor(txtcolor);
            views[i].setBackgroundColor(bgColor);}catch (NullPointerException ignored){}
        }
        if (bgColor==Color.WHITE){
            bgColor=Color.parseColor("#FFCFCFCF");
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            getWindow().setStatusBarColor(bgColor);
        }
            savePrefs();

    }


    public void changeTypface(Typeface typeface){
        Task task=new Task(typeface);

        if (task.getStatus()!= AsyncTask.Status.RUNNING){
            task.execute();
        }


    }


}