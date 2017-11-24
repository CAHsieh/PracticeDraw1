package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by CAMac on 2017/11/24.
 */

public class MyView extends View {

    protected Paint paint = new Paint();

    public MyView(Context context) {
        super(context);
        paint.setAntiAlias(true);
    }

    public MyView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        paint.setAntiAlias(true);
    }

    public MyView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        paint.setAntiAlias(true);
    }
}
