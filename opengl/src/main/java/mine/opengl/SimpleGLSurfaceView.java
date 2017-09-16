package mine.opengl;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;

/**
 * Created by Administrator on 2017/8/30.
 */

public class SimpleGLSurfaceView extends GLSurfaceView {

    private final SimpleRenderer mRenderer;

    public SimpleGLSurfaceView(Context context) {
        super(context);
        System.out.println("**********  SimpleGLSurfaceView.Constructor1  ***********");

        setEGLContextClientVersion(2);
        mRenderer = new SimpleRenderer();
        setRenderer(mRenderer);
        setRenderMode(GLSurfaceView.RENDERMODE_WHEN_DIRTY);

    }

    public SimpleGLSurfaceView(Context context, AttributeSet attrs) {
        super(context, attrs);
        System.out.println("**********  SimpleGLSurfaceView.Constructor2  ***********");

        mRenderer = new SimpleRenderer();
    }
}
