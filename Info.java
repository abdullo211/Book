package com.application.book;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;

public class Info extends Fragment {

    LinearLayout mainLayout;
    public SeekBar changePageBar;
    public LinearLayoutCompat seekbarLayout;
    MainActivity activity;
    public TextView maxPage;
    public TextView thisPage;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_info, null);
        activity = (MainActivity) getActivity();
        mainLayout = (LinearLayout) rootView.findViewById(R.id.info_layout);
        changePageBar = (SeekBar) rootView.findViewById(R.id.change_page_seekbar);
        seekbarLayout = (LinearLayoutCompat) rootView.findViewById(R.id.seekbar_layout);
        maxPage = (TextView) rootView.findViewById(R.id.maxPages_txt);
        thisPage = (TextView) rootView.findViewById(R.id.thisPage_txt);

        return rootView;
    }


    public void setSeekbarLayout() {

try{        changePageBar.setMax(activity.views.length - 1);
        maxPage.setText("/" + (activity.views.length));
        thisPage.setText("" + (activity.layout.mCurrentPage + 1));}catch (NullPointerException ignored){}

        changePageBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                activity.layout.mCurrentPage = progress;

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

                activity.layout.dispatchTouchEvent(down);
                activity.layout.dispatchTouchEvent(up);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                mainLayout.setVisibility(View.INVISIBLE);


            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                mainLayout.setVisibility(View.VISIBLE);

            }
        });
    }


}
