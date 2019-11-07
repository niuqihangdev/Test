package com.example.dell.test;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

/**
 * Created by dell on 2019/11/1.
 */

public class fenshu extends LinearLayout {
    public fenshu(Context context, AttributeSet attrs){
        super(context,attrs);
        LayoutInflater.from(context).inflate(R.layout.fenshu,this);
    }
}
