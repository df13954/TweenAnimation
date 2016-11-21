# 购物车的一个小动画


![image](https://github.com/rongdongliu/TweenAnimation/blob/master/img/animation.gif)

```
//把作为显示的控件设置  target.startAnimation（  mAnimation）

private void initAnim() {
        mAnimation = AnimationUtils.loadAnimation(this, R.anim.cart_anim);
        mAnimation.setAnimationListener(new Animation.AnimationListener() {

            @Override
            public void onAnimationStart(Animation animation) {
                target.setVisibility(View.VISIBLE);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                //动画结束的时候
                //商品数据+1
                //完成之后，这个 车 图片，隐藏
                target.setVisibility(View.GONE);
            }
        });
    }
	
//cart_anim xml文件，描述了动画的详细过程
```


