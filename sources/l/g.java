package l;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
import w1.q0;
import w1.r0;
import w1.s0;

/* compiled from: ViewPropertyAnimatorCompatSet */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<q0> f12618a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public long f12619b = -1;

    /* renamed from: c  reason: collision with root package name */
    public Interpolator f12620c;

    /* renamed from: d  reason: collision with root package name */
    public r0 f12621d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f12622e;

    /* renamed from: f  reason: collision with root package name */
    public final a f12623f = new a();

    /* compiled from: ViewPropertyAnimatorCompatSet */
    public class a extends s0 {

        /* renamed from: a  reason: collision with root package name */
        public boolean f12624a = false;

        /* renamed from: b  reason: collision with root package name */
        public int f12625b = 0;

        public a() {
        }

        public final void a() {
            int i10 = this.f12625b + 1;
            this.f12625b = i10;
            if (i10 == g.this.f12618a.size()) {
                r0 r0Var = g.this.f12621d;
                if (r0Var != null) {
                    r0Var.a();
                }
                this.f12625b = 0;
                this.f12624a = false;
                g.this.f12622e = false;
            }
        }

        public final void c() {
            if (!this.f12624a) {
                this.f12624a = true;
                r0 r0Var = g.this.f12621d;
                if (r0Var != null) {
                    r0Var.c();
                }
            }
        }
    }

    public final void a() {
        if (this.f12622e) {
            Iterator<q0> it = this.f12618a.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
            this.f12622e = false;
        }
    }

    public final void b() {
        View view;
        if (!this.f12622e) {
            Iterator<q0> it = this.f12618a.iterator();
            while (it.hasNext()) {
                q0 next = it.next();
                long j10 = this.f12619b;
                if (j10 >= 0) {
                    next.c(j10);
                }
                Interpolator interpolator = this.f12620c;
                if (!(interpolator == null || (view = next.f16349a.get()) == null)) {
                    view.animate().setInterpolator(interpolator);
                }
                if (this.f12621d != null) {
                    next.d(this.f12623f);
                }
                View view2 = next.f16349a.get();
                if (view2 != null) {
                    view2.animate().start();
                }
            }
            this.f12622e = true;
        }
    }
}
