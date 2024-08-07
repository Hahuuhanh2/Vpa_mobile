package ej;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.fragment.app.Fragment;
import ej.h;
import hj.b;
import ng.m;
import ng.n;
import p3.l0;

/* compiled from: FragmentComponentManager */
public final class f implements b<Object> {

    /* renamed from: a  reason: collision with root package name */
    public volatile n f20085a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f20086b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final Fragment f20087c;

    /* compiled from: FragmentComponentManager */
    public interface a {
        m M();
    }

    public f(Fragment fragment) {
        this.f20087c = fragment;
    }

    public static final Context b(h.a aVar) {
        Context context;
        while (true) {
            boolean z10 = context instanceof ContextWrapper;
            context = aVar;
            if (!z10 || (context instanceof Activity)) {
                return context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    public final Object a() {
        if (this.f20087c.s() != null) {
            l0.q(this.f20087c.s() instanceof b, "Hilt Fragments must be attached to an @AndroidEntryPoint Activity. Found: %s", this.f20087c.s().getClass());
            m M = ((a) l0.X(a.class, this.f20087c.s())).M();
            Fragment fragment = this.f20087c;
            M.getClass();
            fragment.getClass();
            M.getClass();
            Class<Fragment> cls = Fragment.class;
            return new n(M.f21581a, M.f21582b, M.f21583c);
        }
        throw new NullPointerException("Hilt Fragments must be attached before creating the component.");
    }

    public final Object d() {
        if (this.f20085a == null) {
            synchronized (this.f20086b) {
                if (this.f20085a == null) {
                    this.f20085a = (n) a();
                }
            }
        }
        return this.f20085a;
    }
}
