package mine.opengl;

import android.content.Intent;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;

import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        System.out.println("**********  Example.onCreate  ***********");

        setContentView(R.layout.activity_main);

        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.linearLayout3);
        MyGLSurfaceView myGLSurfaceView = new MyGLSurfaceView(this);
        viewGroup.addView(myGLSurfaceView);


    }


    @Override
    protected void onNewIntent(Intent intent) {
        System.out.println("**********  Example.onNewIntent  ***********");
        super.onNewIntent(intent);
    }


    @Override
    protected void onStart() {
        System.out.println("**********  Example.onStart  ***********");
        super.onStart();
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        System.out.println("**********  Example.onRestoreInstanceState  ***********");
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    protected void onRestart() {
        System.out.println("**********  Example.onRestart  ***********");
        super.onRestart();
    }

    @Override
    protected void onResume() {
        System.out.println("**********  Example.onResume  ***********");
        super.onResume();
    }

    @Override
    protected void onPause() {
        System.out.println("**********  Example.onPause  ***********");
        super.onPause();
    }

    @Override
    public void onBackPressed() {
        System.out.println("**********  Example.onBackPressed  ***********");
        super.onBackPressed();
    }


    @Override
    protected void onStop() {
        System.out.println("**********  Example.onStop  ***********");
        super.onStop();
    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        System.out.println("**********  Example.onSaveInstanceState  ***********");
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onDestroy() {
        System.out.println("**********  Example.onDestroy  ***********");
        super.onDestroy();
    }



// button event functions


    public void init(View view) {
        System.out.println("------>>  init  <<------");

    }
    public void start(View view) {
        System.out.println("------>>  start  <<------");

    }
    public void restart(View view) {
        System.out.println("------>>  restart  <<------");

    }
    public void stop(View view) {
        System.out.println("------>>  stop  <<------");

    }


    public void bind(View view) {
        System.out.println("------>>  bind  <<------");

    }
    public void unbind(View view) {
        System.out.println("------>>  unbind  <<------");

    }
    public void info(View view) {
        System.out.println("------>>  info  <<------");

    }

// private functions

    private void typeArrayTrail() {

    }









}



