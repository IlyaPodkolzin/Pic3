package com.example.myapplication;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;

import static java.lang.Math.max;
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

        pencil.setStyle(Paint.Style.FILL);
        for (int i = 0; i < 11; i++) {
            canvas.rotate(7 * i);
            int x = 100 - 2 * i;
            int y = 5 + 3 * i;
            canvas.drawRect(x, y, x + 100, y + 2, pencil);
            canvas.rotate(-7 * i);
        }

        pencil.setColor(Color.GRAY);
        canvas.drawRect(570, 440, 700, 460, pencil);
        canvas.drawRect(600, 460, 625, 500, pencil);
        canvas.drawRect(645, 460, 670, 500, pencil);

        pencil.setColor(Color.BLUE);
        for (int i = 0; i < 6; i++) {
            canvas.drawRect(125 + 10 * i, 325, 127 + 10 * i, 425, pencil);
        }

        for (int i = 0; i < 11; i++) {
            canvas.drawRect(125, 325 + 10 * i, 175, 327 + 10 * i, pencil);
        }
    }
}
