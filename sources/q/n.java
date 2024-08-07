package q;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import q.b;
import q.l;
import r2.p;
import r2.v;

/* compiled from: BiometricViewModel */
public final class n extends v {
    public p<Integer> A;
    public p<CharSequence> B;

    /* renamed from: d  reason: collision with root package name */
    public Executor f14224d;

    /* renamed from: e  reason: collision with root package name */
    public l.a f14225e;

    /* renamed from: f  reason: collision with root package name */
    public l.d f14226f;

    /* renamed from: g  reason: collision with root package name */
    public l.c f14227g;

    /* renamed from: h  reason: collision with root package name */
    public b f14228h;

    /* renamed from: i  reason: collision with root package name */
    public o f14229i;

    /* renamed from: j  reason: collision with root package name */
    public c f14230j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f14231k;

    /* renamed from: l  reason: collision with root package name */
    public int f14232l = 0;

    /* renamed from: m  reason: collision with root package name */
    public boolean f14233m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f14234n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f14235o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f14236p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f14237q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f14238r;

    /* renamed from: s  reason: collision with root package name */
    public p<l.b> f14239s;

    /* renamed from: t  reason: collision with root package name */
    public p<d> f14240t;

    /* renamed from: u  reason: collision with root package name */
    public p<CharSequence> f14241u;

    /* renamed from: v  reason: collision with root package name */
    public p<Boolean> f14242v;

    /* renamed from: w  reason: collision with root package name */
    public p<Boolean> f14243w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f14244x = true;

    /* renamed from: y  reason: collision with root package name */
    public p<Boolean> f14245y;

    /* renamed from: z  reason: collision with root package name */
    public int f14246z = 0;

    /* compiled from: BiometricViewModel */
    public static final class a extends b.c {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<n> f14247a;

        public a(n nVar) {
            this.f14247a = new WeakReference<>(nVar);
        }

        public final void a(int i10, CharSequence charSequence) {
            if (this.f14247a.get() != null && !this.f14247a.get().f14235o && this.f14247a.get().f14234n) {
                this.f14247a.get().f(new d(i10, charSequence));
            }
        }

        public final void b() {
            if (this.f14247a.get() != null && this.f14247a.get().f14234n) {
                n nVar = this.f14247a.get();
                if (nVar.f14242v == null) {
                    nVar.f14242v = new p<>();
                }
                n.j(nVar.f14242v, Boolean.TRUE);
            }
        }

        public final void c(l.b bVar) {
            boolean z10;
            if (this.f14247a.get() != null && this.f14247a.get().f14234n) {
                int i10 = -1;
                if (bVar.f14207b == -1) {
                    l.c cVar = bVar.f14206a;
                    int d10 = this.f14247a.get().d();
                    if ((d10 & 32767) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10 && !c.a(d10)) {
                        i10 = 2;
                    }
                    bVar = new l.b(cVar, i10);
                }
                n nVar = this.f14247a.get();
                if (nVar.f14239s == null) {
                    nVar.f14239s = new p<>();
                }
                n.j(nVar.f14239s, bVar);
            }
        }
    }

    /* compiled from: BiometricViewModel */
    public static class b implements Executor {

        /* renamed from: a  reason: collision with root package name */
        public final Handler f14248a = new Handler(Looper.getMainLooper());

        public final void execute(Runnable runnable) {
            this.f14248a.post(runnable);
        }
    }

    /* compiled from: BiometricViewModel */
    public static class c implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<n> f14249a;

        public c(n nVar) {
            this.f14249a = new WeakReference<>(nVar);
        }

        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (this.f14249a.get() != null) {
                this.f14249a.get().i(true);
            }
        }
    }

    public static <T> void j(p<T> pVar, T t10) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            pVar.j(t10);
        } else {
            pVar.k(t10);
        }
    }

    public final int d() {
        l.d dVar = this.f14226f;
        if (dVar == null) {
            return 0;
        }
        l.c cVar = this.f14227g;
        int i10 = dVar.f14217e;
        if (i10 != 0) {
            return i10;
        }
        if (cVar != null) {
            return 15;
        }
        return 255;
    }

    public final CharSequence e() {
        CharSequence charSequence = this.f14231k;
        if (charSequence != null) {
            return charSequence;
        }
        l.d dVar = this.f14226f;
        if (dVar == null) {
            return null;
        }
        CharSequence charSequence2 = dVar.f14215c;
        if (charSequence2 != null) {
            return charSequence2;
        }
        return "";
    }

    public final void f(d dVar) {
        if (this.f14240t == null) {
            this.f14240t = new p<>();
        }
        j(this.f14240t, dVar);
    }

    public final void g(CharSequence charSequence) {
        if (this.B == null) {
            this.B = new p<>();
        }
        j(this.B, charSequence);
    }

    public final void h(int i10) {
        if (this.A == null) {
            this.A = new p<>();
        }
        j(this.A, Integer.valueOf(i10));
    }

    public final void i(boolean z10) {
        if (this.f14243w == null) {
            this.f14243w = new p<>();
        }
        j(this.f14243w, Boolean.valueOf(z10));
    }
}
