package com.google.android.material.datepicker;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f6132a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ long f6133b;

    public /* synthetic */ c(d dVar, long j10) {
        this.f6132a = dVar;
        this.f6133b = j10;
    }

    public final void run() {
        d dVar = this.f6132a;
        long j10 = this.f6133b;
        dVar.getClass();
        String b10 = f.b(j10);
        dVar.f6137a.setError(String.format(dVar.f6141e, new Object[]{b10.replace(' ', 160)}));
        dVar.a();
    }
}
