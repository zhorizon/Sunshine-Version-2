package com.example.android.sunshine.app;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/**
 * Created by Cencil on 9/18/2015.
 */
public class MyView extends View {
    public MyView(Context context) {
        super(context);
    }

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyView(Context context, AttributeSet attrs, int defaultStyle) {
        super(context, attrs, defaultStyle);
    }

    @Override
    public void onMeasure(int wMeasureSpec, int hMeasureSpec) {
        int hSpecMode = MeasureSpec.getMode(hMeasureSpec);
        int hSpecSize = MeasureSpec.getSize(hMeasureSpec);
        int myHeight = hSpecSize;

        if (hSpecMode == MeasureSpec.EXACTLY)
            myHeight = hSpecSize;
        else if (hSpecMode == MeasureSpec.AT_MOST) {
            // Wrap content
        }

        int wSpecMode = MeasureSpec.getMode(wMeasureSpec);
        int wSpecSize = MeasureSpec.getSize(wMeasureSpec);
        int myWidth = wSpecSize;

        if (wSpecMode == MeasureSpec.EXACTLY)
            myWidth = wSpecSize;
        else if (wSpecMode == MeasureSpec.AT_MOST) {
            // Wrap content
        }

        setMeasuredDimension(myWidth, myHeight);
    }

    @Override
    protected void onDraw(Canvas canvas) {
//        canvas.drawCircle(0, 0, 10);
    }

    @Override
    public boolean dispatchPopulateAccessibilityEvent (AccessibilityEvent ev) {
//        ev.getText().add(windSpeedDir);
        return true;
    }
}
