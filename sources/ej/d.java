package ej;

import com.vpa.daugia.di.Hilt_App;
import hj.b;
import ng.p;

/* compiled from: ApplicationComponentManager */
public final class d implements b<Object> {

    /* renamed from: a  reason: collision with root package name */
    public volatile p f20082a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f20083b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final e f20084c;

    public d(Hilt_App.a aVar) {
        this.f20084c = aVar;
    }

    public final Object d() {
        if (this.f20082a == null) {
            synchronized (this.f20083b) {
                if (this.f20082a == null) {
                    this.f20082a = ((Hilt_App.a) this.f20084c).a();
                }
            }
        }
        return this.f20082a;
    }
}
