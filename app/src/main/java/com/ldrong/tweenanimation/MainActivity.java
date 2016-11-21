package com.ldrong.tweenanimation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
*
* @author ldr
* created at 2016/6/21 11:37
* @Description: 类的描述 -补间动画
*/
public class MainActivity extends AppCompatActivity {

    @Bind(R.id.btn)
    Button btn;
    @Bind(R.id.activity_main)
    RelativeLayout activityMain;
    @Bind(R.id.img)
    ImageView img;
    @Bind(R.id.count)
    TextView count;
    private Animation mAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initAnim();


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //加入的点击操作
                img.startAnimation(mAnimation);
            }
        });
    }

    private void initAnim() {
        mAnimation = AnimationUtils.loadAnimation(this, R.anim.cart_anim);
        mAnimation.setAnimationListener(new Animation.AnimationListener() {

            @Override
            public void onAnimationStart(Animation animation) {
                img.setVisibility(View.VISIBLE);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                //动画结束的时候
                //商品数据+1
                //完成之后，这个 车 图片，隐藏
                img.setVisibility(View.GONE);
            }
        });
    }


}
