package com.airbnb.lottie;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class m implements e0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f4867a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f4868b;

    public /* synthetic */ m(String str, AtomicBoolean atomicBoolean) {
        this.f4867a = str;
        this.f4868b = atomicBoolean;
    }

    public final void onResult(Object obj) {
        String str = this.f4867a;
        AtomicBoolean atomicBoolean = this.f4868b;
        Throwable th2 = (Throwable) obj;
        p.f4876a.remove(str);
        atomicBoolean.set(true);
    }
}
