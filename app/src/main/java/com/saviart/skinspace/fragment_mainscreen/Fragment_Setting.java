package com.saviart.skinspace.fragment_mainscreen;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import android.view.LayoutInflater;
import  android.view.View;
import  android.view.ViewGroup;
import android.support.annotation.NonNull;

import com.saviart.skinspace.R;

public class Fragment_Setting extends Fragment {
    View view;
    public Fragment_Setting(){
    }


    @NonNull
    @Override
    public  View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceStage) {
        view = inflater.inflate(R.layout.fragment_setting,container,false);
        return view;
    }

}
