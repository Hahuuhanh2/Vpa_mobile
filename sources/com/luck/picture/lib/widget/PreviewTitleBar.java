package com.luck.picture.lib.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.luck.picture.lib.R$drawable;

public class PreviewTitleBar extends TitleBar {
    public PreviewTitleBar(Context context) {
        super(context);
    }

    public void setTitleBarStyle() {
        super.setTitleBarStyle();
        this.f8158p.U.c().getClass();
        this.f8150a.setOnClickListener((View.OnClickListener) null);
        this.f8157o.setOnClickListener((View.OnClickListener) null);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f8150a.getLayoutParams();
        layoutParams.removeRule(17);
        layoutParams.addRule(14);
        this.f8150a.setBackgroundResource(R$drawable.ps_ic_trans_1px);
        this.f8155f.setVisibility(8);
        this.f8152c.setVisibility(8);
        this.f8157o.setVisibility(8);
    }

    public PreviewTitleBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PreviewTitleBar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
