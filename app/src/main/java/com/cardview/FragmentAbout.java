package com.cardview;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentAbout extends Fragment {

    View v3;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        v3 = inflater.inflate(R.layout.fragment_about_layout, container, false);
        return v3;
    }
}