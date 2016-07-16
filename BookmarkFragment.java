package com.application.book;


import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import android.os.SystemClock;
import android.support.v4.app.Fragment;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatImageButton;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.ListViewCompat;
import android.text.Layout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.application.book.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;


public class BookmarkFragment extends Fragment {

    public ListViewCompat listView;
    public Bookmark.BookmarkAdapter adapter;
    public ArrayList<Bookmark> bookmarkList;
    MainActivity activity;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rootView = inflater.inflate(R.layout.fragment_bookmarks, null);
        activity = (MainActivity) getActivity();
        listView = (ListViewCompat) rootView.findViewById(R.id.bookmark_list);
        bookmarkList = new ArrayList<>();


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                activity.layout.mCurrentPage = bookmarkList.get(position).bookmarkPageNumber;


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
        });


        return rootView;
    }


    public static class Bookmark {
        public String name;
        public int bookmarkPageNumber;


        public Bookmark(String name, int bookmarkPageNumber) {
            this.name = name;
            this.bookmarkPageNumber = bookmarkPageNumber;
        }


        public static class BookmarkAdapter extends BaseAdapter {
            public ArrayList<Bookmark> list;
            public Context mContext;
            public BookmarkFragment fragment;

            public BookmarkAdapter(BookmarkFragment fragment, ArrayList<Bookmark> list, Context mContext) {
                this.list = list;
                this.mContext = mContext;
                this.fragment = fragment;
            }

            @Override
            public int getCount() {
                return list.size();
            }

            @Override
            public Object getItem(int i) {
                return list.get(i);
            }

            @Override
            public long getItemId(int i) {
                return list.get(i).hashCode();
            }

            @Override
            public View getView(final int i, View view, ViewGroup viewGroup) {

                LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View v = inflater.inflate(R.layout.text_view_bookmarks, null);
                AppCompatTextView number = (AppCompatTextView) v.findViewById(R.id.number_bookmark);
                AppCompatTextView name = (AppCompatTextView) v.findViewById(R.id.bookmark_name);
                name.setText(list.get(i).name);
                number.setText((list.get(i).bookmarkPageNumber+1)+"");


                return v;
            }
        }
    }
}
