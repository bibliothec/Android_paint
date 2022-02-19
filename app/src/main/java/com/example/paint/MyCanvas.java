package com.example.paint;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import androidx.annotation.Nullable;

public class MyCanvas extends View {

    private Path path;
    private Paint paint;

    public MyCanvas(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        //constructor
        path=new Path();  //

        paint=new Paint(); //set paint info
        paint.setColor(Color.BLUE); //set color
        paint.setStyle(Paint.Style.STROKE); // draw
        paint.setStrokeWidth(10);// width
    }

    //prepare draw
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(path,paint);
    }

    //sousa

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        //get coordinate
        float x=event.getX();
        float y=event.getY();
        //when touch
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                path.moveTo(x,y);
                invalidate();
                break;
            case MotionEvent.ACTION_MOVE:
                path.lineTo(x,y);
                invalidate();
                break;
            case MotionEvent.ACTION_UP:
                break;
        }
        return true;
        //return super.onTouchEvent(event);
    }


    //clear
    public void clearCanvas(){
        path.reset();
        invalidate();
    }
}
