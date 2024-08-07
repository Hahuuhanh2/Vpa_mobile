package com.airbnb.lottie;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class l implements e0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f4865a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f4866b;

    public /* synthetic */ l(String str, AtomicBoolean atomicBoolean) {
        this.f4865a = str;
        this.f4866b = atomicBoolean;
    }

    public final void onResult(Object obj) {
        String str = this.f4865a;
        AtomicBoolean atomicBoolean = this.f4866b;
        i iVar = (i) obj;
        p.f4876a.remove(str);
        atomicBoolean.set(true);
    }
}
