package com.google.android.material.textfield;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class h implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k f7031a;

    public /* synthetic */ h(k kVar) {
        this.f7031a = kVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z10;
        k kVar = this.f7031a;
        kVar.getClass();
        if (motionEvent.getAction() == 1) {
            long currentTimeMillis = System.currentTimeMillis() - kVar.f7044o;
            if (currentTimeMillis < 0 || currentTimeMillis > 300) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                kVar.f7042m = false;
            }
            kVar.u();
            kVar.f7042m = true;
            kVar.f7044o = System.currentTimeMillis();
        }
        return false;
    }
}
