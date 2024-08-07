package ej;

import androidx.activity.ComponentActivity;
import androidx.lifecycle.f0;
import dj.d;
import ng.k;
import ng.l;
import p3.l0;
import r2.v;
import r2.x;

/* compiled from: ActivityRetainedComponentManager */
public final class c implements hj.b<aj.a> {

    /* renamed from: a  reason: collision with root package name */
    public final ComponentActivity f20077a;

    /* renamed from: b  reason: collision with root package name */
    public final ComponentActivity f20078b;

    /* renamed from: c  reason: collision with root package name */
    public volatile aj.a f20079c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f20080d = new Object();

    /* compiled from: ActivityRetainedComponentManager */
    public interface a {
        k d();
    }

    /* compiled from: ActivityRetainedComponentManager */
    public static final class b extends v {

        /* renamed from: d  reason: collision with root package name */
        public final aj.a f20081d;

        public b(l lVar) {
            this.f20081d = lVar;
        }

        public final void b() {
            ((d) ((C0278c) l0.X(C0278c.class, this.f20081d)).a()).a();
        }
    }

    /* renamed from: ej.c$c  reason: collision with other inner class name */
    /* compiled from: ActivityRetainedComponentManager */
    public interface C0278c {
        zi.a a();
    }

    public c(ComponentActivity componentActivity) {
        this.f20077a = componentActivity;
        this.f20078b = componentActivity;
    }

    public final Object d() {
        if (this.f20079c == null) {
            synchronized (this.f20080d) {
                if (this.f20079c == null) {
                    this.f20079c = ((b) new f0((x) this.f20077a, (f0.b) new b(this.f20078b)).a(b.class)).f20081d;
                }
            }
        }
        return this.f20079c;
    }
}
