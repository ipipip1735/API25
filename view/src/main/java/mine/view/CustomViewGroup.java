package mine.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.Px;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;


/**
 * Created by Administrator on 2017/7/25.
 */

public class CustomViewGroup extends ViewGroup {

    private int mLeftWidth;

    public CustomViewGroup(Context context) {
        super(context);
        System.out.println("**********  CustomViewGroup.Constructor  ***********");
    }

    public CustomViewGroup(Context context, AttributeSet attrs) {
        super(context, attrs);
        System.out.println("**********  CustomViewGroup.Constructor''  ***********");
//        TypedArray a = context.getTheme().obtainStyledAttributes(
//                attrs,
//                R.styleable.PieChart,
//                0, 0
//        );
//        a.recycle();
    }

    public CustomViewGroup(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        System.out.println("**********  CustomViewGroup.Constructor'''  ***********");
    }

    public CustomViewGroup(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        System.out.println("**********  CustomViewGroup.Constructor''''  ***********");
    }


    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        System.out.println("**********  CustomViewGroup.onMeasure  ***********");
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        System.out.println(widthMeasureSpec);
        System.out.println(heightMeasureSpec);
        setMeasuredDimension(700, 800);
        measureChildWithMargins(getChildAt(0), 600, 0, 700, 0);

    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        System.out.println("**********  CustomViewGroup.onLayout  ***********");

        View child = getChildAt(0);
//        System.out.println(child.get);
        System.out.println(child.getMeasuredWidth());
        System.out.println(child.getMeasuredHeight());
        child.layout(20, 20, 150, 450);
//        final int count = getChildCount();
//
//        // These are the far left and right edges in which we are performing layout.
//        int leftPos = getPaddingLeft();
//        int rightPos = right - left - getPaddingRight();
//
//        // This is the middle region inside of the gutter.
//        final int middleLeft = leftPos + mLeftWidth;
//        final int middleRight = rightPos - mRightWidth;


    }


    @Override
    public LayoutParams generateLayoutParams(AttributeSet attrs) {
        return new CustomLayoutParams(getContext(), attrs);
    }

//    @Override
//    protected LayoutParams generateDefaultLayoutParams() {
//        return super.generateDefaultLayoutParams();
//    }


    static public class CustomLayoutParams extends ViewGroup.MarginLayoutParams {


        String labelYY;

        public CustomLayoutParams(Context c, AttributeSet attrs) {

            super(c, attrs);
            System.out.println("**********  CustomLayoutParams.Constructor''  ***********");
            TypedArray a = c.obtainStyledAttributes(attrs, R.styleable.CustomViewGroup);
            labelYY = a.getString(R.styleable.CustomViewGroup_labelYY);
            System.out.println(labelYY);
        }

        public CustomLayoutParams(@Px int width, @Px int height) {
            super(width, height);
            System.out.println("**********  CustomLayoutParams.Constructor'-'  ***********");
        }
        public CustomLayoutParams(MarginLayoutParams source) {
            super(source);
            System.out.println("**********  CustomLayoutParams.Constructor'  ***********");
        }

        public CustomLayoutParams(LayoutParams source) {
            super(source);
            System.out.println("**********  CustomLayoutParams.Constructor'-  ***********");
        }
    }


}
