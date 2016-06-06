package com.mohit.paint;

import android.graphics.Color;
import android.graphics.Paint;
import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by mohit on 6/6/16.
 */
public class Circle{
    private float radius = 9;
    private float circleX;
    private float circleY;
    private Paint redPaint;
    static int color = Color.RED;

    Circle(float x, float y){
        this.circleX = x;
        this.circleY = y;
        redPaint = new Paint();
        redPaint.setAntiAlias(true);
        redPaint.setColor(color);
    }

    public float getRadius() {
        return radius;
    }

    public float getCircleY() {
        return circleY;
    }

    public float getCircleX() {
        return circleX;
    }

    public Paint getRedPaint() {
        return redPaint;
    }

}
