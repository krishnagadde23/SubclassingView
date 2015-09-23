package com.example.kgadde.subclassingview;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

/**
 * Created by 2016kgadde on 9/23/2015.
 */
public class MyTextView extends TextView
{
    private int mValue;
    public MyTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setUpAttributes(attrs);
        setText(mValue+"");
    }
    private void setUpAttributes(AttributeSet attrs)
    {
        TypedArray a = getContext().getTheme().obtainStyledAttributes(attrs, R.styleable.MyTextView, 0, 0);
        try {
            mValue = a.getInt(R.styleable.MyTextView_initialValue, 0);
        } finally {
            a.recycle();
        }

    }
    public void incrementandUpdate() {
        mValue++;
        setText(mValue+"");
    }
}
