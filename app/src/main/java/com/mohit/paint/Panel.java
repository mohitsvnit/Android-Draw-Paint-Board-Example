package com.mohit.paint;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import java.text.AttributedCharacterIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes;

/**
 * Created by mohit on 6/6/16.
 */
public class Panel extends View {

    private Paint redPaint;
    private float sx = 0;
    private float sy = 0;
    private int touchTolerant = 10;

    List<Circle> list;

    public Panel(Context context, AttributeSet attributeSet) {
        super(context);

        list = new ArrayList<>();

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        for(int i = 0; i < list.size();i++) {
            Circle circle = list.get(i);
            canvas.drawCircle(circle.getCircleX(),circle.getCircleY(),circle.getRadius(),circle.getRedPaint());
        }


    }
    @Override
    public boolean onTouchEvent(MotionEvent event) {

        int id = event.getAction();
        Circle circle;
        switch (id){
            case MotionEvent.ACTION_DOWN:
                //Toast.makeText(getContext(),"Khupach",Toast.LENGTH_SHORT).show();
                sx = event.getX();
                sy = event.getY();
                circle = new Circle(sx,sy);
                list.add(circle);
                break;
            case MotionEvent.ACTION_UP:
                circle = new Circle(event.getX(),event.getY());
                list.add(circle);
                break;
            case MotionEvent.ACTION_MOVE:
              //  Toast.makeText(getContext(),"Finger is moving",Toast.LENGTH_SHORT).show();
                circle = new Circle(event.getX(),event.getY());
                list.add(circle);
                break;


        }
        invalidate();
        return true;
    }


}
