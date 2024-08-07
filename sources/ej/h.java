package ej;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.i;
import androidx.lifecycle.n;
import ng.k;
import ng.q;
import p3.l0;
import r2.l;

/* compiled from: ViewComponentManager */
public final class h implements hj.b<Object> {

    /* renamed from: a  reason: collision with root package name */
    public volatile q f20090a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f20091b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final View f20092c;

    /* compiled from: ViewComponentManager */
    public interface b {
        k E();
    }

    public h(View view) {
        this.f20092c = view;
    }

    public final Object a() {
        Class<hj.b> cls = hj.b.class;
        Context context = this.f20092c.getContext();
        while ((context instanceof ContextWrapper) && !cls.isInstance(context)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (context == j7.a.F(context.getApplicationContext())) {
            l0.q(false, "%s, Hilt view cannot be created using the application context. Use a Hilt Fragment or Activity context.", this.f20092c.getClass());
            context = null;
        }
        if (context instanceof hj.b) {
            k E = ((b) l0.X(b.class, (hj.b) context)).E();
            View view = this.f20092c;
            E.getClass();
            view.getClass();
            E.getClass();
            Class<View> cls2 = View.class;
            return new q(E.f21577a);
        }
        throw new IllegalStateException(String.format("%s, Hilt view must be attached to an @AndroidEntryPoint Fragment or Activity.", new Object[]{this.f20092c.getClass()}));
    }

    public final Object d() {
        if (this.f20090a == null) {
            synchronized (this.f20091b) {
                if (this.f20090a == null) {
                    this.f20090a = (q) a();
                }
            }
        }
        return this.f20090a;
    }

    /* compiled from: ViewComponentManager */
    public static final class a extends ContextWrapper {

        /* renamed from: a  reason: collision with root package name */
        public LayoutInflater f20093a;

        /* renamed from: b  reason: collision with root package name */
        public LayoutInflater f20094b;

        /* renamed from: ej.h$a$a  reason: collision with other inner class name */
        /* compiled from: ViewComponentManager */
        public class C0279a implements n {
            public C0279a() {
            }

            public final void q(l lVar, i.a aVar) {
                if (aVar == i.a.ON_DESTROY) {
                    a aVar2 = a.this;
                    aVar2.getClass();
                    aVar2.f20093a = null;
                    aVar2.f20094b = null;
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Context context, Fragment fragment) {
            super(context);
            context.getClass();
            C0279a aVar = new C0279a();
            this.f20093a = null;
            fragment.getClass();
            fragment.U.a(aVar);
        }

        public final Object getSystemService(String str) {
            if (!"layout_inflater".equals(str)) {
                return getBaseContext().getSystemService(str);
            }
            if (this.f20094b == null) {
                if (this.f20093a == null) {
                    this.f20093a = (LayoutInflater) getBaseContext().getSystemService("layout_inflater");
                }
                this.f20094b = this.f20093a.cloneInContext(this);
            }
            return this.f20094b;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a(android.view.LayoutInflater r2, androidx.fragment.app.Fragment r3) {
            /*
                r1 = this;
                r2.getClass()
                android.content.Context r0 = r2.getContext()
                r0.getClass()
                r1.<init>(r0)
                ej.h$a$a r0 = new ej.h$a$a
                r0.<init>()
                r1.f20093a = r2
                r3.getClass()
                androidx.lifecycle.o r2 = r3.U
                r2.a(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ej.h.a.<init>(android.view.LayoutInflater, androidx.fragment.app.Fragment):void");
        }
    }
}
