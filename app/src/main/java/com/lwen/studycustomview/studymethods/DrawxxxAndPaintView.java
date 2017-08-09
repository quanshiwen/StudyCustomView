package com.lwen.studycustomview.studymethods;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * @Author Lwen
 * @Date 2017/8/8/0008 9:41
 * @Describe ${TODO}
 */

public class DrawxxxAndPaintView extends View {

    private Paint mPaint;

    public DrawxxxAndPaintView(Context context) {
        this(context,null);
    }

    public DrawxxxAndPaintView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initPaint();
    }

    private void initPaint() {
        mPaint = new Paint();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //绘制一个圆
        canvas.drawCircle(300,300,200,mPaint);
    }
}
