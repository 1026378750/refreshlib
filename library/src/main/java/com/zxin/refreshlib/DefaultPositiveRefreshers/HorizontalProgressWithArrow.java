package com.zxin.refreshlib.DefaultPositiveRefreshers;

/**
 * Created by Administrator on 2017/3/25.
 */

public class HorizontalProgressWithArrow extends OverlayProgressWithArrow {

    public HorizontalProgressWithArrow(){
        super(30);
    }

    @Override
    protected int getSize() {
        if(width == 0 && null != circleImageView){
            width=circleImageView.getWidth();
        }
        return width;
    }
}
