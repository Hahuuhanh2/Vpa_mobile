package com.luck.picture.lib.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.luck.picture.lib.R$id;
import com.luck.picture.lib.widget.BottomNavBar;

public class PreviewBottomNavBar extends BottomNavBar {
    public PreviewBottomNavBar(Context context) {
        super(context);
    }

    public final void a() {
        this.f8130a.setVisibility(8);
        this.f8131b.setOnClickListener(this);
        TextView textView = this.f8131b;
        this.f8133d.getClass();
        textView.setVisibility(8);
    }

    public TextView getEditor() {
        return this.f8131b;
    }

    public final void onClick(View view) {
        BottomNavBar.b bVar;
        super.onClick(view);
        if (view.getId() == R$id.ps_tv_editor && (bVar = this.f8134e) != null) {
            bVar.b();
        }
    }

    public void setBottomNavBarStyle() {
        super.setBottomNavBarStyle();
        this.f8133d.U.a().getClass();
    }

    public PreviewBottomNavBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PreviewBottomNavBar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
