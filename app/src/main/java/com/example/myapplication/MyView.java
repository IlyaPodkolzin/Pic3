package com.example.myapplication;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;

import static java.lang.Math.pow;

public class MyView extends View {
    public MyView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        //super.onDraw(canvas);
        Paint pencil = new Paint();

        pencil.setColor(Color.parseColor("#02591c"));
        canvas.drawRect(0, 400, 720, 600, pencil);

        pencil.setColor(Color.parseColor("#79553d"));
        canvas.drawRect(100, 250, 300, 500, pencil);

        pencil.setColor(Color.BLACK);
        pencil.setStyle(Paint.Style.STROKE);
        pencil.setStrokeWidth(5);
        canvas.drawRect(100, 250, 300, 500, pencil);

        Path path = new Path();
        path.moveTo(100, 250);
        path.lineTo(200, 200);
        path.lineTo(300, 250);
        pencil.setColor(Color.parseColor("#79553d"));
        pencil.setStyle(Paint.Style.FILL);
        canvas.drawPath(path, pencil);

        pencil.setColor(Color.BLACK);
        pencil.setStyle(Paint.Style.STROKE);
        pencil.setStrokeWidth(5);
        path.lineTo(100, 250);
        canvas.drawPath(path, pencil);

        canvas.drawCircle(200, 225, 10, pencil);

        canvas.drawRect(125, 325, 175, 425, pencil);

        canvas.drawRect(225, 325, 285, 500, pencil);

        pencil.setStyle(Paint.Style.FILL);
        pencil.setColor(Color.parseColor("#79553d"));
        canvas.drawRect(450, 470, 470, 520, pencil);


        pencil.setColor(Color.GREEN);
        canvas.drawOval(400, 150, 520, 470, pencil);

        pencil.setColor(Color.YELLOW);
        canvas.drawCircle(0, 0, 100, pencil);

        pencil.setStyle(Paint.Style.STROKE);
        for (int i = 0; i < 10; i++) {
            int x = 100 - 10 * i;
            double y = Math.sqrt(10000 - Math.pow(x, 2));
        }
    }
}
