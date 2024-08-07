package com.smarteist.autoimageslider.IndicatorView;

import sf.b;

/* compiled from: IndicatorManager */
public final class a implements b.a {

    /* renamed from: a  reason: collision with root package name */
    public wf.a f19273a;

    /* renamed from: b  reason: collision with root package name */
    public rf.a f19274b;

    /* renamed from: c  reason: collision with root package name */
    public C0260a f19275c;

    /* renamed from: com.smarteist.autoimageslider.IndicatorView.a$a  reason: collision with other inner class name */
    /* compiled from: IndicatorManager */
    public interface C0260a {
    }

    public a(C0260a aVar) {
        this.f19275c = aVar;
        wf.a aVar2 = new wf.a();
        this.f19273a = aVar2;
        if (aVar2.f23375a == null) {
            aVar2.f23375a = new yf.a();
        }
        this.f19274b = new rf.a(aVar2.f23375a, this);
    }

    public final yf.a a() {
        wf.a aVar = this.f19273a;
        if (aVar.f23375a == null) {
            aVar.f23375a = new yf.a();
        }
        return aVar.f23375a;
    }

    public final void b(tf.a aVar) {
        this.f19273a.f23376b.f23444a = aVar;
        C0260a aVar2 = this.f19275c;
        if (aVar2 != null) {
            ((PageIndicatorView) aVar2).invalidate();
        }
    }
}
