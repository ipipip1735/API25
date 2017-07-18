package mine.animation;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CanvasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canvas);
    }



    public void start(View view) {
        System.out.println("********start******");
        drawPic();
    }

    public void stop(View view) {
        System.out.println("********stop******");
    }





    private void drawPic() {

        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.ll);
        linearLayout.setBackgroundColor(Color.DKGRAY);


        Bitmap bitmap = Bitmap.createBitmap(600, 600, Bitmap.Config.ARGB_8888);

        Paint paint = new Paint();
        paint.setColor(getResources().getColor(R.color.colorAccent, null));

        Canvas c = new Canvas(bitmap);
//        c.drawColor(Color.BLACK);
        c.drawRect(25, 50, 400, 600, paint);

        BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), bitmap);



        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setImageDrawable(bitmapDrawable);
        imageView.setScaleX(2);




        TextView textView = new TextView(this);
        textView.setText("ok");
        linearLayout.addView(textView);




//        System.out.println(imageView.getX());
//        System.out.println(imageView.getY());
//        System.out.println(imageView.getScaleX());
//        System.out.println(imageView.getScaleY());



    }

}


class MyView extends View {

    public MyView(Context context) {
        super(context);
    }

    protected void onDraw(Canvas canvas) {
        System.out.println("***********onDraw********");
        System.out.println(canvas);

    }

}
