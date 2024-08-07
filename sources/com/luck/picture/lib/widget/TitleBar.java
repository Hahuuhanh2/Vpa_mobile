package com.luck.picture.lib.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.luck.picture.lib.R$color;
import com.luck.picture.lib.R$drawable;
import com.luck.picture.lib.R$id;
import com.luck.picture.lib.R$layout;
import com.luck.picture.lib.R$string;
import ke.b;
import p3.l0;
import xe.c;

public class TitleBar extends RelativeLayout implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public RelativeLayout f8150a;

    /* renamed from: b  reason: collision with root package name */
    public ImageView f8151b;

    /* renamed from: c  reason: collision with root package name */
    public ImageView f8152c;

    /* renamed from: d  reason: collision with root package name */
    public ImageView f8153d;

    /* renamed from: e  reason: collision with root package name */
    public MarqueeTextView f8154e;

    /* renamed from: f  reason: collision with root package name */
    public TextView f8155f;

    /* renamed from: n  reason: collision with root package name */
    public View f8156n;

    /* renamed from: o  reason: collision with root package name */
    public View f8157o;

    /* renamed from: p  reason: collision with root package name */
    public ke.a f8158p;

    /* renamed from: q  reason: collision with root package name */
    public View f8159q;

    /* renamed from: r  reason: collision with root package name */
    public RelativeLayout f8160r;

    /* renamed from: s  reason: collision with root package name */
    public a f8161s;

    public static class a {
        public void a() {
            throw null;
        }

        public void b(View view) {
        }

        public void c() {
        }
    }

    public TitleBar(Context context) {
        super(context);
        a();
    }

    public final void a() {
        int i10;
        Context context;
        LayoutInflater.from(getContext()).inflate(R$layout.ps_title_bar, this);
        setClickable(true);
        setFocusable(true);
        this.f8158p = b.a().b();
        this.f8159q = findViewById(R$id.top_status_bar);
        this.f8160r = (RelativeLayout) findViewById(R$id.rl_title_bar);
        this.f8151b = (ImageView) findViewById(R$id.ps_iv_left_back);
        this.f8150a = (RelativeLayout) findViewById(R$id.ps_rl_album_bg);
        this.f8153d = (ImageView) findViewById(R$id.ps_iv_delete);
        this.f8157o = findViewById(R$id.ps_rl_album_click);
        this.f8154e = (MarqueeTextView) findViewById(R$id.ps_tv_title);
        this.f8152c = (ImageView) findViewById(R$id.ps_iv_arrow);
        this.f8155f = (TextView) findViewById(R$id.ps_tv_cancel);
        this.f8156n = findViewById(R$id.title_bar_line);
        this.f8151b.setOnClickListener(this);
        this.f8155f.setOnClickListener(this);
        this.f8150a.setOnClickListener(this);
        this.f8160r.setOnClickListener(this);
        this.f8157o.setOnClickListener(this);
        setBackgroundColor(k1.a.getColor(getContext(), R$color.ps_color_grey));
        if (TextUtils.isEmpty(this.f8158p.G)) {
            if (this.f8158p.f12517a == 3) {
                context = getContext();
                i10 = R$string.ps_all_audio;
            } else {
                context = getContext();
                i10 = R$string.ps_camera_roll;
            }
            setTitle(context.getString(i10));
            return;
        }
        setTitle(this.f8158p.G);
    }

    public ImageView getImageArrow() {
        return this.f8152c;
    }

    public ImageView getImageDelete() {
        return this.f8153d;
    }

    public View getTitleBarLine() {
        return this.f8156n;
    }

    public TextView getTitleCancelView() {
        return this.f8155f;
    }

    public String getTitleText() {
        return this.f8154e.getText().toString();
    }

    public final void onClick(View view) {
        a aVar;
        int id2 = view.getId();
        if (id2 == R$id.ps_iv_left_back || id2 == R$id.ps_tv_cancel) {
            a aVar2 = this.f8161s;
            if (aVar2 != null) {
                aVar2.a();
            }
        } else if (id2 == R$id.ps_rl_album_bg || id2 == R$id.ps_rl_album_click) {
            a aVar3 = this.f8161s;
            if (aVar3 != null) {
                aVar3.b(this);
            }
        } else if (id2 == R$id.rl_title_bar && (aVar = this.f8161s) != null) {
            aVar.c();
        }
    }

    public void setOnTitleBarListener(a aVar) {
        this.f8161s = aVar;
    }

    public void setTitle(String str) {
        this.f8154e.setText(str);
    }

    public void setTitleBarStyle() {
        if (this.f8158p.f12538u) {
            this.f8159q.getLayoutParams().height = c.g(getContext());
        }
        this.f8158p.U.c().getClass();
        this.f8160r.getLayoutParams().height = c.a(getContext(), 48.0f);
        View view = this.f8156n;
        if (view != null) {
            view.setVisibility(8);
        }
        if (l0.s()) {
            this.f8154e.setText((CharSequence) null);
        }
        this.f8158p.getClass();
        this.f8155f.setVisibility(0);
        if (l0.s()) {
            this.f8155f.setText((CharSequence) null);
        }
        this.f8153d.setBackgroundResource(R$drawable.ps_ic_delete);
    }

    public TitleBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public TitleBar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a();
    }
}
