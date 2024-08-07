package com.airbnb.lottie;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class o implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ WeakReference f4872a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f4873b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f4874c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ String f4875d;

    public /* synthetic */ o(WeakReference weakReference, Context context, int i10, String str) {
        this.f4872a = weakReference;
        this.f4873b = context;
        this.f4874c = i10;
        this.f4875d = str;
    }

    public final Object call() {
        WeakReference weakReference = this.f4872a;
        Context context = this.f4873b;
        int i10 = this.f4874c;
        String str = this.f4875d;
        Context context2 = (Context) weakReference.get();
        if (context2 != null) {
            context = context2;
        }
        return p.e(i10, context, str);
    }
}
