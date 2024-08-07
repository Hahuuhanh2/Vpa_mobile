package com.luck.picture.lib.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.luck.picture.lib.R$color;
import com.luck.picture.lib.R$id;
import com.luck.picture.lib.R$layout;
import com.luck.picture.lib.R$string;
import java.util.regex.Pattern;
import p3.l0;
import xe.c;

public class BottomNavBar extends RelativeLayout implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public TextView f8130a;

    /* renamed from: b  reason: collision with root package name */
    public TextView f8131b;

    /* renamed from: c  reason: collision with root package name */
    public CheckBox f8132c;

    /* renamed from: d  reason: collision with root package name */
    public ke.a f8133d;

    /* renamed from: e  reason: collision with root package name */
    public b f8134e;

    public class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            BottomNavBar bottomNavBar = BottomNavBar.this;
            bottomNavBar.f8133d.f12541x = z10;
            bottomNavBar.f8132c.setChecked(z10);
            b bVar = BottomNavBar.this.f8134e;
            if (bVar != null) {
                bVar.a();
                if (z10 && BottomNavBar.this.f8133d.a() == 0) {
                    BottomNavBar.this.f8134e.c();
                }
            }
        }
    }

    public static class b {
        public void a() {
            throw null;
        }

        public void b() {
        }

        public void c() {
        }

        public void d() {
        }
    }

    public BottomNavBar(Context context) {
        super(context);
        b();
    }

    public void a() {
    }

    public final void b() {
        View.inflate(getContext(), R$layout.ps_bottom_nav_bar, this);
        setClickable(true);
        setFocusable(true);
        this.f8133d = ke.b.a().b();
        this.f8130a = (TextView) findViewById(R$id.ps_tv_preview);
        this.f8131b = (TextView) findViewById(R$id.ps_tv_editor);
        this.f8132c = (CheckBox) findViewById(R$id.cb_original);
        this.f8130a.setOnClickListener(this);
        this.f8131b.setVisibility(8);
        setBackgroundColor(k1.a.getColor(getContext(), R$color.ps_color_grey));
        this.f8132c.setChecked(this.f8133d.f12541x);
        this.f8132c.setOnCheckedChangeListener(new a());
        a();
    }

    public void onClick(View view) {
        if (this.f8134e != null && view.getId() == R$id.ps_tv_preview) {
            this.f8134e.d();
        }
    }

    public void setBottomNavBarStyle() {
        this.f8133d.getClass();
        m9.b a10 = this.f8133d.U.a();
        this.f8133d.getClass();
        a10.getClass();
        getLayoutParams().height = c.a(getContext(), 46.0f);
        if (l0.s()) {
            this.f8130a.setText((CharSequence) null);
        }
        if (l0.s()) {
            this.f8131b.setText((CharSequence) null);
        }
        if (l0.s()) {
            this.f8132c.setText((CharSequence) null);
        }
    }

    public void setOnBottomNavBarListener(b bVar) {
        this.f8134e = bVar;
    }

    public void setOriginalCheck() {
        this.f8132c.setChecked(this.f8133d.f12541x);
    }

    public void setSelectedChange() {
        this.f8133d.getClass();
        this.f8132c.setText(getContext().getString(R$string.ps_default_original_image));
        m9.b a10 = this.f8133d.U.a();
        if (this.f8133d.a() > 0) {
            this.f8130a.setEnabled(true);
            a10.getClass();
            this.f8130a.setTextColor(k1.a.getColor(getContext(), R$color.ps_color_fa632d));
            if (!l0.s()) {
                this.f8130a.setText(getContext().getString(R$string.ps_preview_num, new Object[]{Integer.valueOf(this.f8133d.a())}));
            } else if (Pattern.compile("\\([^)]*\\)").matcher((CharSequence) null).find()) {
                this.f8130a.setText(String.format((String) null, new Object[]{Integer.valueOf(this.f8133d.a())}));
            } else {
                this.f8130a.setText((CharSequence) null);
            }
        } else {
            this.f8130a.setEnabled(false);
            a10.getClass();
            this.f8130a.setTextColor(k1.a.getColor(getContext(), R$color.ps_color_9b));
            if (l0.s()) {
                this.f8130a.setText((CharSequence) null);
            } else {
                this.f8130a.setText(getContext().getString(R$string.ps_preview));
            }
        }
    }

    public BottomNavBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    public BottomNavBar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        b();
    }
}
