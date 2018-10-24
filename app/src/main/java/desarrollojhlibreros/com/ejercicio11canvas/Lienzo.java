package desarrollojhlibreros.com.ejercicio11canvas;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.view.View;

public class Lienzo extends View {

    Paint p;
    int x, y;

    public Lienzo(Context context) {
        super(context);
    }


    protected void onDraw(Canvas c){
        super.onDraw(c); // Canvas pinta atributos
        p = new Paint(); // Paint asigna atributos
        x = c.getWidth(); // También: getMeasuredWidth() o getRight(), x=480
        y = c.getHeight(); // También: getMeasuredHeight() o getBottom(), y=762
        p.setColor(Color.WHITE); // Fondo blanco
        c.drawPaint(p);
        p.setColor(Color.BLACK); // Texto negro
        p.setTextSize(20);
        c.drawText("x0=" + x/2 + ", y0=" + y/2, x/2 + 20, y/2-20, p);
        p.setColor(Color.rgb(0, 0, 255)); // Ejes azules
        c.drawLine(x/2, 0, x/2, y, p);
        c.drawLine(0, y/2, x, y/2, p);


        //Texto de Ejes cordenados
        p.setTextAlign(Paint.Align.RIGHT);
        p.setTypeface(Typeface.SERIF);
        c.drawText("Eje X", x-5, y/2-10, p);
        p.setTextAlign(Paint.Align.CENTER);
        p.setTypeface(Typeface.DEFAULT_BOLD);
        c.drawText("Eje Y", x/2+30, 20, p);


        //Circulo En tercer cuadrante
        p.setColor(Color.argb(100, 200, 100, 100));
        c.drawCircle(x/2-120, y/2+120, 100, p);

       // RectF rectangulo1 = new RectF(100, 100, 300, 300);
        //c.drawOval(rectangulo1, p);

        ///////////////////////////////drawRect simple////////////////////////////////////////
        p.setStyle(Paint.Style.STROKE);
        p.setColor(Color.argb(100, 110, 20, 140));
        c.drawOval(200,200,200,200,p);

        ///////////////////////////////drawRect simple////////////////////////////////////////
        p.setColor(Color.argb(100, 200, 100, 100));
        Rect rectangle = new Rect(110, 110, 10, 10);
        c.drawRect(rectangle, p);

        ///////////////////////////////drawRoundRect////////////////////////////////////////
        p.setStyle(Paint.Style.STROKE);
        p.setColor(Color.argb(100, 100, 50, 80));
        c.drawRoundRect(150,150,150,150,150,150,p);
    }
}
