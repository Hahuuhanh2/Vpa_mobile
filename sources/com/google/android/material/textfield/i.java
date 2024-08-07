package com.google.android.material.textfield;

import android.widget.AutoCompleteTextView;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class i implements AutoCompleteTextView.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k f7032a;

    public /* synthetic */ i(k kVar) {
        this.f7032a = kVar;
    }

    public final void onDismiss() {
        k kVar = this.f7032a;
        kVar.f7042m = true;
        kVar.f7044o = System.currentTimeMillis();
        kVar.t(false);
    }
}
