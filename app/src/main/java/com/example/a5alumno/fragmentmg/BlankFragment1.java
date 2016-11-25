package com.example.a5alumno.fragmentmg;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class BlankFragment1 extends Fragment {

private Button btnUpdate;
    public BlankFragment1() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //btnUpdate=(Button) getView().findViewById(R.id.btnUpdateFrag2);


        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank_fragment1, container, false);

    }

}
