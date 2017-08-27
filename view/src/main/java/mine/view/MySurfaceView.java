package mine.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;

/**
 * Created by Administrator on 2017/7/18.
 */

public class MySurfaceView extends SurfaceView {

//    private SurfaceHolder mSurfaceHolder;
//    private Context mContext;

//    public float mx;
//    public float my;

    public MySurfaceView(Context context, AttributeSet attrs) {
        super(context, attrs);
        System.out.println("**********  MySurfaceView.Constructor1  ***********");
//        mSurfaceHolder = getHolder();
//        mSurfaceHolder.addCallback();
//        this.mContext = context;
//        mx = 100f;
//        my = 100f;
//        setOnTouchListener(new OnTouchListener() {
//            @Override
//            public boolean onTouch(View v, MotionEvent event) {
//                System.out.println(" on touch ");
//                mx = event.getX();
//                my = event.getY();
//
//                return true;
//            }
//        });
    }

    public MySurfaceView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        System.out.println("**********  MySurfaceView.Constructor2  ***********");
    }

    public MySurfaceView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        System.out.println("**********  MySurfaceView.Constructor3  ***********");
    }


//    @Override
//    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
//        System.out.println("**********  MySurfaceView.onMeasure  ***********");
//        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
//        System.out.println(getMeasuredWidth());
//        System.out.println(getMeasuredHeight());
//    }


//    @Override
//    protected void onDraw(Canvas canvas) {
//        System.out.println("**********  MySurfaceView.onDraw  ***********");
////        super.onDraw(canvas);
////        canvas = mSurfaceHolder.lockCanvas();
////        System.out.println("my canvas is " + canvas);
////        System.out.println(mx);
////        System.out.println(my);
////        Paint p = new Paint();
////        p.setColor(mContext.getColor(R.color.AliceBlue));
////        canvas.drawCircle(mx, my, 100f, p);
////        mSurfaceHolder.unlockCanvasAndPost(canvas);
////        postInvalidate();
//        ToolClass.showThread();
//
//
//    }




}

