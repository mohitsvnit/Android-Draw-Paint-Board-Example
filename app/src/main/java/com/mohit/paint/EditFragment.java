package com.mohit.paint;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;

public class EditFragment extends Fragment implements View.OnClickListener{

    CheckBox rcb;
    CheckBox gcb;
    CheckBox bcb;

    public EditFragment() {
        // Required empty public constructor
    }
 @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_edit,container,false);
        rcb = (CheckBox) view.findViewById(R.id.checkBox);
        gcb = (CheckBox) view.findViewById(R.id.checkBox2);
        bcb = (CheckBox) view.findViewById(R.id.checkBox3);
        rcb.setOnClickListener(this);
        gcb.setOnClickListener(this);
        bcb.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        if(v == rcb){
            gcb.setChecked(false);
            bcb.setChecked(false);
            rcb.setChecked(true);
            Circle.color = Color.RED;
        }
        else if(v == bcb){
            gcb.setChecked(false);
            bcb.setChecked(true);
            rcb.setChecked(false);
            Circle.color = Color.BLUE;
        }
        else if(v == gcb){
            gcb.setChecked(true);
            bcb.setChecked(false);
            rcb.setChecked(false);
            Circle.color = Color.GREEN;
        }
    }
}
