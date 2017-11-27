package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.util.AttributeSet;

public class Practice10HistogramView extends MyView {

    final String[] text = new String[]{
            "Froyo", "GB", "IC S", "JB", "KitKat", "L", "M"
    };
    final int[] textOffset = new int[]{4, 3, 3, 3, 4, 2, 2};
    final float[] rectOffset = new float[]{0.99f, 0.97f, 0.97f, 0.55f, 0.30f, 0.20f, 0.65f};

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图

        paint.setColor(Color.WHITE);

        paint.setStrokeWidth(2);
        //line1
        canvas.drawLine(100, 20, 100, 540, paint);

        //line2
        canvas.drawLine(100, 540, 950, 540, paint);

        final float width = 850f / 7f;
        final float offset = width * 0.1f;
        final float textSize = 25;
        float startX = 110;


        paint.setTextSize(textSize);
        //text1
        for (int i = 0; i < 7; i++) {
            canvas.drawText(text[i], startX + offset + (width - textOffset[i] * textSize) / 2, 570, paint);
            startX += width;
        }

        paint.setTextSize(47);
        //text2
        canvas.drawText("直方圖", 440, 670, paint);


        final float bottomY = 540;
        final float topY = 20;
        final float rectWidth = width * 0.8f;
        final float height = 520;
        startX = 110;

        paint.setColor(Color.GREEN);
        //rect
        for (int i = 0; i < 7; i++) {
            canvas.drawRect(startX + offset, topY + rectOffset[i] * height, startX + rectWidth, bottomY, paint);
            startX += width;
        }
    }
}
