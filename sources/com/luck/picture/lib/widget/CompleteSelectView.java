package com.luck.picture.lib.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.luck.picture.lib.R$anim;
import com.luck.picture.lib.R$color;
import com.luck.picture.lib.R$drawable;
import com.luck.picture.lib.R$id;
import com.luck.picture.lib.R$layout;
import com.luck.picture.lib.R$string;
import ke.a;
import ke.b;
import p3.l0;

public class CompleteSelectView extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public TextView f8136a;

    /* renamed from: b  reason: collision with root package name */
    public TextView f8137b;

    /* renamed from: c  reason: collision with root package name */
    public Animation f8138c;

    /* renamed from: d  reason: collision with root package name */
    public a f8139d;

    public CompleteSelectView(Context context) {
        super(context);
        a();
    }

    public final void a() {
        LayoutInflater.from(getContext()).inflate(R$layout.ps_complete_selected_layout, this);
        setOrientation(0);
        this.f8136a = (TextView) findViewById(R$id.ps_tv_select_num);
        this.f8137b = (TextView) findViewById(R$id.ps_tv_complete);
        setGravity(16);
        this.f8138c = AnimationUtils.loadAnimation(getContext(), R$anim.ps_anim_modal_in);
        this.f8139d = b.a().b();
    }

    public void setCompleteSelectViewStyle() {
        ve.b bVar = this.f8139d.U;
        bVar.b().getClass();
        if (l0.s()) {
            if (l0.r()) {
                this.f8137b.setText(String.format((String) null, new Object[]{Integer.valueOf(this.f8139d.a()), Integer.valueOf(this.f8139d.f12525h)}));
            } else {
                this.f8137b.setText((CharSequence) null);
            }
        }
        bVar.a().getClass();
    }

    public void setSelectedChange(boolean z10) {
        ve.b bVar = this.f8139d.U;
        l0 b10 = bVar.b();
        if (this.f8139d.a() > 0) {
            setEnabled(true);
            b10.getClass();
            setBackgroundResource(R$drawable.ps_ic_trans_1px);
            if (!l0.s()) {
                this.f8137b.setText(getContext().getString(R$string.ps_completed));
            } else if (l0.r()) {
                this.f8137b.setText(String.format((String) null, new Object[]{Integer.valueOf(this.f8139d.a()), Integer.valueOf(this.f8139d.f12525h)}));
            } else {
                this.f8137b.setText((CharSequence) null);
            }
            this.f8137b.setTextColor(k1.a.getColor(getContext(), R$color.ps_color_fa632d));
            bVar.a().getClass();
            if (this.f8136a.getVisibility() == 8 || this.f8136a.getVisibility() == 4) {
                this.f8136a.setVisibility(0);
            }
            if (!TextUtils.equals(j7.a.E0(Integer.valueOf(this.f8139d.a())), this.f8136a.getText())) {
                this.f8136a.setText(j7.a.E0(Integer.valueOf(this.f8139d.a())));
                this.f8139d.getClass();
                this.f8136a.startAnimation(this.f8138c);
                return;
            }
            return;
        }
        if (z10) {
            b10.getClass();
        }
        this.f8139d.getClass();
        setEnabled(false);
        b10.getClass();
        setBackgroundResource(R$drawable.ps_ic_trans_1px);
        this.f8137b.setTextColor(k1.a.getColor(getContext(), R$color.ps_color_9b));
        this.f8136a.setVisibility(8);
        if (!l0.s()) {
            this.f8137b.setText(getContext().getString(R$string.ps_please_select));
        } else if (l0.r()) {
            this.f8137b.setText(String.format((String) null, new Object[]{Integer.valueOf(this.f8139d.a()), Integer.valueOf(this.f8139d.f12525h)}));
        } else {
            this.f8137b.setText((CharSequence) null);
        }
    }

    public CompleteSelectView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public CompleteSelectView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a();
    }
}
