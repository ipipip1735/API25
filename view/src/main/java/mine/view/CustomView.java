package mine.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Administrator on 2017/7/18.
 */

public class CustomView extends View {

    public boolean mShowText;
    public Paint mTextPaint;
    public String mText;
    public int mAscent;
    public String labelYY;


    public CustomView(Context context) {
        super(context);
        System.out.println("**********  CustomView.Constructor  ***********");

    }

    public CustomView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initLabelView();
        System.out.println("**********  CustomView.Constructor''  ***********");
        TypedArray a = context.obtainStyledAttributes(
                attrs,
                R.styleable.CustomViewGroup,
                0, 0
        );
        labelYY = a.getString(R.styleable.CustomViewGroup_labelYY);
        System.out.println(labelYY);
        a.recycle();



//        for (int i = 0; i< attrs.getAttributeCount(); i++) {
//            System.out.println(attrs.getAttributeName(i));
//
//        }

//        System.out.println(attrs.getAttributeValue(5));


    }

    public CustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        System.out.println("**********  CustomView.Constructor'''  ***********");
    }

    public CustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        System.out.println("**********  CustomView.Constructor''''  ***********");
    }


//    public boolean isShowText() {
//        System.out.println("**********  CustomView.isShowText  ***********");
//        return mShowText;
//    }
//
//    public void setShowText(boolean showText) {
//        System.out.println("**********  CustomView.setShowText  ***********");
//        mShowText = showText;
//        invalidate();
//        requestLayout();
//    }


    private final void initLabelView() {
//        System.out.println("**********  initLabelView  ***********");
//        mText = "okkkkkk";
//        mTextPaint = new Paint();
////        mTextPaint.setTextSize(16 * getResources().getDisplayMetrics().density);
//        mTextPaint.setTextSize(70);
//        mTextPaint.setColor(Color.YELLOW);


    }


    /**
     * @see android.view.View#measure(int, int)
     */
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        System.out.println("**********  CustomView.onMeasure  ***********");
//        setMeasuredDimension(measureWidth(widthMeasureSpec),
//                measureHeight(heightMeasureSpec));


        setMeasuredDimension(550, 550);

    }



    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        System.out.println("**********  CustomView.onLayout  ***********");
        System.out.println(changed);
        System.out.println(left);
        System.out.println(top);
        System.out.println(right);
        System.out.println(bottom);
        System.out.println(getLayoutParams());

//        setTop(50);
//        setBottom(250);
//        System.out.println(getMeasuredHeight());
    }




    /**
     * Determines the width of this view
     *
     * @param measureSpec A measureSpec packed into an int
     * @return The width of the view, honoring constraints from measureSpec
     */
//    private int measureWidth(int measureSpec) {
//        System.out.println("**********  CustomView.measureWidth  ***********");
//        int result = 0;
//        int specMode = MeasureSpec.getMode(measureSpec);
//        int specSize = MeasureSpec.getSize(measureSpec);
//        if (specMode == MeasureSpec.EXACTLY) {
//            // We were told how big to be
//            result = specSize;
//        } else {
//            // Measure the text
//            result = (int) mTextPaint.measureText(mText) + getPaddingLeft()
//                    + getPaddingRight();
//            if (specMode == MeasureSpec.AT_MOST) {
//                // Respect AT_MOST value if that was what is called for by measureSpec
//                result = Math.min(result, specSize);
//            }
//        }
//        return result;
//    }

    /**
     * Determines the height of this view
     *
     * @param measureSpec A measureSpec packed into an int
     * @return The height of the view, honoring constraints from measureSpec
     */
//    private int measureHeight(int measureSpec) {
//        System.out.println("**********  CustomView.measureHeight  ***********");
//        int result = 0;
//        int specMode = MeasureSpec.getMode(measureSpec);
//        int specSize = MeasureSpec.getSize(measureSpec);
//        mAscent = (int) mTextPaint.ascent();
//        if (specMode == MeasureSpec.EXACTLY) {
//            // We were told how big to be
//            result = specSize;
//        } else {
//            // Measure the text (beware: ascent is a negative number)
//            result = (int) (-mAscent + mTextPaint.descent()) + getPaddingTop()
//                    + getPaddingBottom();
//            if (specMode == MeasureSpec.AT_MOST) {
//                // Respect AT_MOST value if that was what is called for by measureSpec
//                result = Math.min(result, specSize);
//            }
//        }
//        return result;
//    }


    /**
     * Render the text
     *
     * @see android.view.View#onDraw(android.graphics.Canvas)
     */
    @Override
    protected void onDraw(Canvas canvas) {
        System.out.println("**********  CustomView.onDraw  ***********");
        super.onDraw(canvas);
//        canvas.drawText(mText, getPaddingLeft(), getPaddingTop() - mAscent, mTextPaint);

//        System.out.println(getPaddingLeft());
//        System.out.println(getPaddingTop() - mAscent);
//        canvas.drawText(mText, getPaddingLeft(), getPaddingTop() - mAscent, mTextPaint);
//        canvas.drawText(mText, 0, 0, mTextPaint);


        mText = "okkkkkk";
        mTextPaint = new Paint();
//        mTextPaint.setTextSize(16 * getResources().getDisplayMetrics().density);
        mTextPaint.setTextSize(70);
        mTextPaint.setColor(Color.YELLOW);

        canvas.drawText("kkkkk", 0, 50, this.mTextPaint);
    }





}
