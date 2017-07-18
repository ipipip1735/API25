package mine.animation;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ViewAnimator;

import java.util.Set;

/**
 * Created by Administrator on 2016/7/14.
 */
public class AnimationActivity extends AppCompatActivity {


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        System.out.println("*******  Example  on  Create  Menu!  *********");
//        getMenuInflater().inflate(R.menu.menu, menu);
//        return super.onCreateOptionsMenu(menu);
        return true;
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        System.out.println("*******  Example  on  Prepare  Menu!!!  *********");
        return super.onPrepareOptionsMenu(menu);
    }


    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        System.out.println("**********  Example  onCreate  ***********");

        setContentView(R.layout.activity_animation);
        if (bundle == null) {
            System.out.println("Example bundle is empty");
        } else {
            System.out.println("bundle's total is " + bundle.size());
            Set<String> keySet = bundle.keySet();
            for (String i : keySet) {
                System.out.println(i);
            }
        }


    }

    @Override
    protected void onNewIntent(Intent intent) {
        System.out.println("****  Example  onNewIntent  *****");
        super.onNewIntent(intent);
    }


    @Override
    protected void onStart() {
        System.out.println("****Example**onStart*****");
        super.onStart();

    }


    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        System.out.println("****  Example  onRestoreInstanceState  *****");
        super.onRestoreInstanceState(savedInstanceState);
    }


    @Override
    protected void onRestart() {
        System.out.println("****Example**onRestart*****");
        super.onRestart();
    }

    @Override
    protected void onResume() {
        System.out.println("****Example**onResume*****");
        super.onResume();
    }

    @Override
    protected void onPause() {
        System.out.println("****Example**onPause*****");
        super.onPause();
    }


    @Override
    public void onBackPressed() {
        System.out.println("********Example***onBackPressed**********");
        super.onBackPressed();
    }


    @Override
    protected void onStop() {
        System.out.println("****Example**onStop*****");
        super.onStop();
    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        System.out.println("****  Example   onSaveInstanceState  *****");
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onDestroy() {
        System.out.println("****Example**onDestroy*****");
        super.onDestroy();
    }


    public void start(View view) {
        System.out.println("********start******");
//        frame();
//        property();
//        valueAnimator();
//        objectAnimator();
//        keyFrame();
//        TypeEvalutors();
//        LayoutTransition();

    }

    public void stop(View view) {
        System.out.println("********stop******");
    }


    private void tween() {
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
//        imageView.setImageResource(R.drawable.cd);
        ImageView image = (ImageView) findViewById(R.id.image);

//        Animation hyperspaceJump = AnimationUtils.loadAnimation(this, R.anim.tween);
//        imageView.startAnimation(hyperspaceJump);
    }


    private void frame() {
        System.out.println("*****  frame  ******");
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
//        imageView.setBackgroundResource(R.drawable.frame);


        AnimationDrawable animationDrawable = (AnimationDrawable) imageView.getBackground();
        animationDrawable.start();


    }

    private void property() {
        System.out.println("***** property ******");

        ImageView imageView = (ImageView) findViewById(R.id.imageView);


//        AnimatorSet set = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.property);
//        set.setTarget(imageView);
//        set.start();

    }


    private void valueAnimator() {
        System.out.println("***** property ******");

        ImageView imageView = (ImageView) findViewById(R.id.imageView);

        ValueAnimator va = ValueAnimator.ofInt(0, 300);
        va.setDuration(3000);
        va.setTarget(imageView);
        va.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                int i = (int) animation.getAnimatedValue();
                System.out.println(i);

            }
        });

        va.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {
                System.out.println("******onAnimationStart*****");
            }

            @Override
            public void onAnimationEnd(Animator animation) {
                System.out.println("******onAnimationEnd*****");
            }

            @Override
            public void onAnimationCancel(Animator animation) {
                System.out.println("******onAnimationCancel*****");
            }

            @Override
            public void onAnimationRepeat(Animator animation) {

                System.out.println("******onAnimationRepeat*****");
            }
        });
        va.start();


    }

    private void objectAnimator() {


//        ImageView imageView = (ImageView) findViewById(R.id.imageView);
//        imageView.animate()
//                .x(50f)
//                .y(100f)
//                .alpha(0.5f)
//                .start();
//        System.out.println("***animate****");

        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        PropertyValuesHolder x = PropertyValuesHolder.ofFloat("x", 250f, 50f, 350f, 10f);
        PropertyValuesHolder y = PropertyValuesHolder.ofFloat("y", 350f);
        ObjectAnimator.ofPropertyValuesHolder(imageView, x, y).setDuration(5000).start();


    }


    private void keyFrame() {

        System.out.println("*****keyFrame*****");

        ImageView imageView = (ImageView) findViewById(R.id.imageView);

        AccelerateInterpolator aInterpolator = new AccelerateInterpolator();
        DecelerateInterpolator dInterpolator = new DecelerateInterpolator();
        Keyframe keyframe0 = Keyframe.ofFloat(0f, 10f);
        keyframe0.setInterpolator(aInterpolator);
        Keyframe keyframe1 = Keyframe.ofFloat(0.5f, 450f);
        keyframe1.setInterpolator(dInterpolator);
        Keyframe keyframe4 = Keyframe.ofFloat(1f, 50f);

//        PropertyValuesHolder x = PropertyValuesHolder.ofKeyframe("x", keyframe0, keyframe1, keyframe4);
//        PropertyValuesHolder y = PropertyValuesHolder.ofKeyframe("y", keyframe0, keyframe1, keyframe4);
//        ObjectAnimator.ofPropertyValuesHolder(imageView, x, y).setDuration(5000).start();


    }


    private void TypeEvalutors() {

        System.out.println("*****TypeEvalutors*****");

        ImageView imageView = (ImageView) findViewById(R.id.imageView);


        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(imageView, "alpha", 1f, 0.1f, 1f);
        objectAnimator.setEvaluator(new TypeEvaluator() {
            @Override
            public Object evaluate(float fraction, Object startValue, Object endValue) {
                System.out.println("***********  fraction is " + fraction + "***********");
                System.out.println("***********  startValue is " + startValue + "***********");
                System.out.println("***********  endValue is " + endValue + "***********");
                return 0.8f;
            }
        });
        objectAnimator.start();


    }

    private int x = 20;

    private void LayoutTransition() {
        LayoutTransition layoutTransition = new LayoutTransition();
        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(null, "X", 0f, 90f);
        layoutTransition.setAnimator(LayoutTransition.APPEARING, objectAnimator);

        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.ll);
        linearLayout.setLayoutTransition(layoutTransition);

        Button b1 = new Button(this);
        linearLayout.addView(b1);




    }


}