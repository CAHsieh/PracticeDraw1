package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.util.AttributeSet;

public class Practice11PieChartView extends MyView {

    final float[] angleRate = new float[]{0.005f, 0.02f, 0.02f, 0.18f, 0.285f, 0.34f, 0.15f};
    final int[] mColor = new int[]{
            Color.DKGRAY,
            Color.MAGENTA,
            Color.GRAY,
            Color.GREEN,
            Color.BLUE,
            Color.RED,
            Color.YELLOW,
    };

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图

        //餅圖主體
        float sum = 0;
        for (int i = 0; i < 7; i++) {
            paint.setColor(mColor[i]);
            if (i == 5) {
                //Lollipop往左上角的效果
                canvas.drawArc(165, 15, 715, 565, sum, angleRate[i] * 360 - 1, true, paint);
            } else {
                canvas.drawArc(185, 35, 735, 585, sum, angleRate[i] * 360 - 1, true, paint);
            }
            sum += angleRate[i] * 360;
        }

        paint.setColor(Color.WHITE);
        paint.setTextSize(30);
        //text
        canvas.drawText("Froyo", 800, 320, paint);
        canvas.drawText("Gingebread", 800, 360, paint);
        canvas.drawText("Ice Cream Sandwich", 800, 400, paint);
        canvas.drawText("Jelly Bean", 800, 550, paint);
        canvas.drawText("KitKat", 80, 580, paint);
        canvas.drawText("Lollipop", 25, 35, paint);
        canvas.drawText("Marshmallow", 800, 200, paint);

        paint.setStrokeWidth(2);
        //line Froyo
        canvas.drawLine(735, 312, 795, 312, paint);

        //line Gingebread
        float[] point1 = {735, 330, 755, 330, 755, 330, 775, 355, 775, 355, 795, 355};
        canvas.drawLines(point1, paint);

        //line Ice Cream Sandwich
        float[] point2 = {730, 365, 755, 365, 755, 365, 775, 395, 775, 395, 795, 395};
        canvas.drawLines(point2, paint);

        //line Jelly Bean
        float[] point3 = {640, 515, 660, 550, 660, 550, 795, 550};
        canvas.drawLines(point3, paint);

        //line KitKat
        float[] point4 = {180, 578, 315, 578, 315, 576, 333, 555};
        canvas.drawLines(point4, paint);

        //line Lollipop
        float[] point5 = {155, 37, 280, 37, 280, 37, 293, 58};
        canvas.drawLines(point5, paint);

        //line Marshmallow
        float[] point6 = {720, 218, 740, 198, 740, 198, 795, 198};
        canvas.drawLines(point6, paint);

    }
}
