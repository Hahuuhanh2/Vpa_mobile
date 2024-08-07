package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.a;
import com.google.android.material.R$id;
import com.google.android.material.R$layout;
import com.google.android.material.R$styleable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import l8.h;
import l8.k;
import l8.m;
import w1.d0;
import w1.q0;

class RadialViewGroup extends ConstraintLayout {

    /* renamed from: x  reason: collision with root package name */
    public final a f7142x;

    /* renamed from: y  reason: collision with root package name */
    public int f7143y;

    /* renamed from: z  reason: collision with root package name */
    public h f7144z;

    public RadialViewGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            view.setId(d0.e.a());
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f7142x);
            handler.post(this.f7142x);
        }
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        q();
    }

    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f7142x);
            handler.post(this.f7142x);
        }
    }

    public void q() {
        int i10;
        a aVar = new a();
        aVar.e(this);
        HashMap hashMap = new HashMap();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getId() != R$id.circle_center && !"skip".equals(childAt.getTag())) {
                int i12 = (Integer) childAt.getTag(R$id.material_clock_level);
                if (i12 == null) {
                    i12 = 1;
                }
                if (!hashMap.containsKey(i12)) {
                    hashMap.put(i12, new ArrayList());
                }
                ((List) hashMap.get(i12)).add(childAt);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            List<View> list = (List) entry.getValue();
            if (((Integer) entry.getKey()).intValue() == 2) {
                i10 = Math.round(((float) this.f7143y) * 0.66f);
            } else {
                i10 = this.f7143y;
            }
            float f10 = 0.0f;
            for (View id2 : list) {
                int id3 = id2.getId();
                int i13 = R$id.circle_center;
                a.b bVar = aVar.h(id3).f1951e;
                bVar.A = i13;
                bVar.B = i10;
                bVar.C = f10;
                f10 += 360.0f / ((float) list.size());
            }
        }
        aVar.b(this);
    }

    public final void setBackgroundColor(int i10) {
        this.f7144z.n(ColorStateList.valueOf(i10));
    }

    public RadialViewGroup(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        LayoutInflater.from(context).inflate(R$layout.material_radial_view_group, this);
        h hVar = new h();
        this.f7144z = hVar;
        k kVar = new k(0.5f);
        m mVar = hVar.f12778a.f12798a;
        mVar.getClass();
        m.a aVar = new m.a(mVar);
        aVar.f12841e = kVar;
        aVar.f12842f = kVar;
        aVar.f12843g = kVar;
        aVar.f12844h = kVar;
        hVar.setShapeAppearanceModel(new m(aVar));
        this.f7144z.n(ColorStateList.valueOf(-1));
        h hVar2 = this.f7144z;
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        d0.d.q(this, hVar2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.RadialViewGroup, i10, 0);
        this.f7143y = obtainStyledAttributes.getDimensionPixelSize(R$styleable.RadialViewGroup_materialCircleRadius, 0);
        this.f7142x = new a(this);
        obtainStyledAttributes.recycle();
    }
}
