package yuan.bwie.com.huayuan;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by CZ on 2017/11/30.
 */
public class BallViewDemo extends View {
    //定义一个画笔
    private Paint mPaint;
    //自定义坐标
    private int cx = 200;
    private int cy = 200;

    public BallViewDemo(Context context) {
        super(context);
    }

    public BallViewDemo(Context context, AttributeSet attrs) {
        super(context, attrs);
        //定义画笔
        mPaint = new Paint();
        //设置字体颜色
        mPaint.setColor(Color.RED);
        //填充空心
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setAntiAlias(true);
        //图形宽
        mPaint.setStrokeWidth(10);
    }

    public BallViewDemo(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()){
            //按下
            case MotionEvent.ACTION_DOWN:
                //图形坐标
                System.out.println("exent ACTION_DOWN =" +event.getRawX()+"  "+event.getRawY());
                break;
            //移动
            case MotionEvent.ACTION_MOVE:
                //图形坐标
                System.out.println("exent ACTION_MOVE =" +event.getRawX()+"  "+event.getRawY());
                cx = (int) event.getX();
                cy = (int) event.getY();
                invalidate();
                break;
            //抬起
            case MotionEvent.ACTION_UP:
                //图形坐标
                System.out.println("exent ACTION_UP =" +event.getRawX()+"  "+event.getRawY());
                break;
        }
        return true;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //画布   
        canvas.drawCircle(cx,cy,30,mPaint);
    }
}

