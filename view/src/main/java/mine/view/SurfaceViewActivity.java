package mine.view;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;

import java.util.Random;

/**
 * Created by Administrator on 2017/8/27.
 */

public class SurfaceViewActivity extends AppCompatActivity implements SurfaceHolder.Callback {

    //    private SurfaceHolder mSurfaceHolder;
    private static final String TAG = "Svetlin SurfaceView";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surface);
        SurfaceView surfaceView = (SurfaceView) findViewById(R.id.msfv);
        surfaceView.getHolder().addCallback(this);

//        SurfaceView view = new SurfaceView(this);
        surfaceView.setZOrderOnTop(true);
//        setContentView(view);
//        view.getHolder().addCallback(this);
    }


    @Override
    public void surfaceCreated(SurfaceHolder holder) {

        final SurfaceHolder h = holder;
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("--");
                    Canvas canvas = h.lockCanvas();
                    canvas.drawRGB(255, 128, 128);
                    Paint p = new Paint();
                    p.setColor(getColor(R.color.AliceBlue));
                    canvas.drawCircle(100f, 100f, 100f, p);
                    h.unlockCanvasAndPost(canvas);
                }

            }
        }).start();

    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int frmt, int w, int h) {


    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {
    }


}




