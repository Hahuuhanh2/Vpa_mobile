package com.ots.base.utils.customview;

import af.e;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import ej.h;
import hj.b;

public abstract class Hilt_DebugView extends LinearLayout implements b {

    /* renamed from: a  reason: collision with root package name */
    public h f8260a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f8261b;

    public Hilt_DebugView(Context context) {
        super(context);
        if (!this.f8261b) {
            this.f8261b = true;
            ((e) d()).a((DebugView) this);
        }
    }

    public final Object d() {
        if (this.f8260a == null) {
            this.f8260a = new h(this);
        }
        return this.f8260a.d();
    }

    public Hilt_DebugView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.f8261b) {
            this.f8261b = true;
            ((e) d()).a((DebugView) this);
        }
    }
}
