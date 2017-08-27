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
//        setContentView(R.layout.activity_surface);
//        SurfaceView surfaceView = (SurfaceView) findViewById(R.id.msfv);
//        surfaceView.getHolder().addCallback(this);

        SurfaceView view = new SurfaceView(this);
        setContentView(view);
        view.getHolder().addCallback(this);
    }


    @Override
    public void surfaceCreated(SurfaceHolder holder) {
        tryDrawing(holder);
    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int frmt, int w, int h) {
        tryDrawing(holder);
    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {}

    private void tryDrawing(SurfaceHolder holder) {
        Log.i(TAG, "Trying to draw...");

        Canvas canvas = holder.lockCanvas();
        if (canvas == null) {
            Log.e(TAG, "Cannot draw onto the canvas as it's null");
        } else {
            drawMyStuff(canvas);
            holder.unlockCanvasAndPost(canvas);
        }
    }

    private void drawMyStuff(final Canvas canvas) {
        Random random = new Random();
        Log.i(TAG, "Drawing...");
        canvas.drawRGB(255, 128, 128);
        Paint p = new Paint();
        p.setColor(getColor(R.color.AliceBlue));
        canvas.drawCircle(100f, 100f, 100f, p);
    }
}




