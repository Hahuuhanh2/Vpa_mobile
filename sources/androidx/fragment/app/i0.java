package androidx.fragment.app;

import a3.c;
import a3.d;
import a3.e;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.a0;
import androidx.lifecycle.e0;
import androidx.lifecycle.f;
import androidx.lifecycle.f0;
import androidx.lifecycle.i;
import androidx.lifecycle.o;
import androidx.lifecycle.y;
import r2.w;
import r2.x;
import s2.b;

/* compiled from: FragmentViewLifecycleOwner */
public final class i0 implements f, e, x {

    /* renamed from: a  reason: collision with root package name */
    public final Fragment f2648a;

    /* renamed from: b  reason: collision with root package name */
    public final w f2649b;

    /* renamed from: c  reason: collision with root package name */
    public final Runnable f2650c;

    /* renamed from: d  reason: collision with root package name */
    public f0.b f2651d;

    /* renamed from: e  reason: collision with root package name */
    public o f2652e = null;

    /* renamed from: f  reason: collision with root package name */
    public d f2653f = null;

    public i0(Fragment fragment, w wVar, d.d dVar) {
        this.f2648a = fragment;
        this.f2649b = wVar;
        this.f2650c = dVar;
    }

    public final o B() {
        c();
        return this.f2652e;
    }

    public final void a(i.a aVar) {
        this.f2652e.f(aVar);
    }

    public final void c() {
        if (this.f2652e == null) {
            this.f2652e = new o(this);
            d dVar = new d(this);
            this.f2653f = dVar;
            dVar.a();
            this.f2650c.run();
        }
    }

    public final f0.b f() {
        f0.b f10 = this.f2648a.f();
        if (!f10.equals(this.f2648a.X)) {
            this.f2651d = f10;
            return f10;
        }
        if (this.f2651d == null) {
            Application application = null;
            Context context = this.f2648a.d0().getApplicationContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                } else if (context instanceof Application) {
                    application = (Application) context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            Fragment fragment = this.f2648a;
            this.f2651d = new a0(application, fragment, fragment.f2448f);
        }
        return this.f2651d;
    }

    public final b g() {
        Application application;
        Context applicationContext = this.f2648a.d0().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            } else if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            } else {
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
        }
        b bVar = new b();
        if (application != null) {
            bVar.f14601a.put(e0.f2756a, application);
        }
        bVar.f14601a.put(y.f2839a, this.f2648a);
        bVar.f14601a.put(y.f2840b, this);
        Bundle bundle = this.f2648a.f2448f;
        if (bundle != null) {
            bVar.f14601a.put(y.f2841c, bundle);
        }
        return bVar;
    }

    public final w n() {
        c();
        return this.f2649b;
    }

    public final c q() {
        c();
        return this.f2653f.f89b;
    }
}
