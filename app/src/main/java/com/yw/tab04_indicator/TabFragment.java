package com.yw.tab04_indicator;

import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by jiahe008 on 2016/5/31.
 */
public class TabFragment extends Fragment {

    private static String TITLE = "title";

    public static TabFragment newInstance(String title){
        TabFragment instance = new TabFragment();
        Bundle bundle = new Bundle();
        bundle.putString(TITLE, title);
        instance.setArguments(bundle);
        return instance;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag, container, false);
        TextView textView = (TextView) view.findViewById(R.id.textview);
        textView.setText(getArguments().getString(TITLE));
        return view;
    }


}
