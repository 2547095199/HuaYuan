package yuan.bwie.com.flowlayout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by CZ on 2017/11/30.
 */
public class CustomstView extends LinearLayout {

    private ImageView imageView;
    private TextView tijiao;

    public CustomstView(Context context) {
        super(context);
    }

    public CustomstView(final Context context, final AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.item_coustomstview, this);
        imageView = (ImageView) findViewById(R.id.fanhui);
        tijiao = (TextView) findViewById(R.id.tijiao);
        imageView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "返回", Toast.LENGTH_SHORT).show();
            }
        });

        tijiao.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "提交", Toast.LENGTH_SHORT).show();
            }
        });

    }

    public CustomstView(final Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

    }

    public void setSubmitClick(OnClickListener onClickListener) {
        imageView.setOnClickListener(onClickListener);
    }
}
