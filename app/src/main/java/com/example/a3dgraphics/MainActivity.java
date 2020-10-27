package com.example.a3dgraphics;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bitmap bg = Bitmap.createBitmap(720, 1280, Bitmap.Config.ARGB_8888);

        ImageView imageView = findViewById(R.id.imageView);
        imageView.setBackground(new BitmapDrawable(bg));

        Canvas canvas = new Canvas((bg));

        Paint darkBlue = new Paint();
        darkBlue.setColor(Color.rgb(25, 118, 210));

        Paint lightBlue = new Paint();
        lightBlue.setColor(Color.rgb(33, 150, 243));

        Paint border = new Paint();
        border.setColor(Color.rgb(0, 0, 0));

        canvas.drawRect(100, 300, 500, 500, lightBlue);

        Path path = new Path();
        path.moveTo(200, 200);
        path.lineTo(100, 300);
        path.lineTo(600, 200);
        path.lineTo(200, 200);
        path.close();
        canvas.drawPath(path, darkBlue);

        Path path2 = new Path();
        path2.moveTo(500, 300);
        path2.lineTo(100, 300);
        path2.lineTo(600, 200);
        path2.lineTo(500, 300);
        path2.close();
        canvas.drawPath(path2, darkBlue);

        Path path3 = new Path();
        path3.moveTo(600, 200);
        path3.lineTo(500, 300);
        path3.lineTo(600, 400);
        path3.lineTo(600, 200);
        path3.close();
        canvas.drawPath(path3, darkBlue);

        Path path4 = new Path();
        path4.moveTo(500, 300);
        path4.lineTo(500, 500);
        path4.lineTo(600, 400);
        path4.lineTo(500, 300);
        path4.close();
        canvas.drawPath(path4, darkBlue);

        canvas.drawLine(100, 300, 500, 300, border);
        canvas.drawLine(100, 500, 500, 500, border);
        canvas.drawLine(100, 300, 100, 500, border);
        canvas.drawLine(500, 300, 500, 500, border);
        canvas.drawLine(100, 300, 200, 200, border);
        canvas.drawLine(500, 300, 600, 200, border);
        canvas.drawLine(200, 200, 600, 200, border);
        canvas.drawLine(600, 200, 600, 400, border);
        canvas.drawLine(500, 500, 600, 400, border);

        Paint lightOrange = new Paint();
        lightOrange.setColor(Color.rgb(255, 152, 0));

        Paint darkOrange = new Paint();
        darkOrange.setColor(Color.rgb(245, 124, 0));

        canvas.drawRect(200, 800, 500, 1100, lightOrange);
        canvas.drawOval(200, 700, 500, 900, darkOrange);
        canvas.drawOval(200, 1000, 500, 1200, darkOrange);

    }
}