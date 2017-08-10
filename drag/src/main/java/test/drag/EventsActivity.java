package test.drag;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.DragEvent;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;

import java.util.Set;

/**
 * Created by Administrator on 2016/5/4.
 */
public class EventsActivity extends AppCompatActivity {

    private ImageView imageView;
    private ImageView targetImageView;


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        System.out.println("*******  Example  onCreateMenu!  *********");
//        getMenuInflater().inflate(R.menu.menu, menu);
//        return super.onCreateOptionsMenu(menu);
        return true;
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        System.out.println("*******  Example  onPrepareMenu!!!  *********");
        return super.onPrepareOptionsMenu(menu);
    }


    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        System.out.println("**********  Example  onCreate  ***********");

        setContentView(R.layout.activity_example);
        if (bundle == null) {
            System.out.println("Example bundle is empty");
        } else {
            System.out.println("bundle's total is " + bundle.size());
            Set<String> keySet = bundle.keySet();
            for (String i : keySet) {
                System.out.println(i);
            }
        }


        this.imageView = (ImageView) findViewById(R.id.imageView);
        this.targetImageView = (ImageView) findViewById(R.id.targetImageView);


    }

    @Override
    protected void onNewIntent(Intent intent) {
        System.out.println("****  Example  onNewIntent  *****");
        super.onNewIntent(intent);
    }


    @Override
    protected void onStart() {
        System.out.println("****Example  onStart*****");
        super.onStart();

    }


    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        System.out.println("****  Example  onRestoreInstanceState  *****");
        super.onRestoreInstanceState(savedInstanceState);
    }


    @Override
    protected void onRestart() {
        System.out.println("****  Example  onRestart  *****");
        super.onRestart();
    }

    @Override
    protected void onResume() {
        System.out.println("****  Example  onResume  ***");
        super.onResume();
    }

    @Override
    protected void onPause() {
        System.out.println("****  Example  onPause  ***");
        super.onPause();
    }


    @Override
    public void onBackPressed() {
        System.out.println("********  Example  onBackPressed  **********");
        super.onBackPressed();
    }


    @Override
    protected void onStop() {
        System.out.println("****  Example  onStop  *****");
        super.onStop();
    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        System.out.println("****  Example   onSaveInstanceState  *****");
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onDestroy() {
        System.out.println("****  Example  onDestroy  *****");
        super.onDestroy();
    }


// button callback
    public void start(View view) {
        System.out.println("######  start  ######");

    }

    public void stop(View view) {
        System.out.println("######  stop  ######");

    }


// drag event








}


