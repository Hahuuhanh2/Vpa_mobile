package e4;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;
import z.k;

/* compiled from: BaseKeyframeAnimation */
public abstract class a<K, A> {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f9094a = new ArrayList(1);

    /* renamed from: b  reason: collision with root package name */
    public boolean f9095b = false;

    /* renamed from: c  reason: collision with root package name */
    public final c<K> f9096c;

    /* renamed from: d  reason: collision with root package name */
    public float f9097d = 0.0f;

    /* renamed from: e  reason: collision with root package name */
    public k f9098e;

    /* renamed from: f  reason: collision with root package name */
    public A f9099f = null;

    /* renamed from: g  reason: collision with root package name */
    public float f9100g = -1.0f;

    /* renamed from: h  reason: collision with root package name */
    public float f9101h = -1.0f;

    /* renamed from: e4.a$a  reason: collision with other inner class name */
    /* compiled from: BaseKeyframeAnimation */
    public interface C0097a {
        void a();
    }

    /* compiled from: BaseKeyframeAnimation */
    public static final class b<T> implements c<T> {
        public final boolean a(float f10) {
            throw new IllegalStateException("not implemented");
        }

        public final o4.a<T> b() {
            throw new IllegalStateException("not implemented");
        }

        public final boolean c(float f10) {
            return false;
        }

        public final float d() {
            return 1.0f;
        }

        public final float e() {
            return 0.0f;
        }

        public final boolean isEmpty() {
            return true;
        }
    }

    /* compiled from: BaseKeyframeAnimation */
    public interface c<T> {
        boolean a(float f10);

        o4.a<T> b();

        boolean c(float f10);

        float d();

        float e();

        boolean isEmpty();
    }

    /* compiled from: BaseKeyframeAnimation */
    public static final class d<T> implements c<T> {

        /* renamed from: a  reason: collision with root package name */
        public final List<? extends o4.a<T>> f9102a;

        /* renamed from: b  reason: collision with root package name */
        public o4.a<T> f9103b;

        /* renamed from: c  reason: collision with root package name */
        public o4.a<T> f9104c = null;

        /* renamed from: d  reason: collision with root package name */
        public float f9105d = -1.0f;

        public d(List<? extends o4.a<T>> list) {
            this.f9102a = list;
            this.f9103b = f(0.0f);
        }

        public final boolean a(float f10) {
            o4.a<T> aVar = this.f9104c;
            o4.a<T> aVar2 = this.f9103b;
            if (aVar == aVar2 && this.f9105d == f10) {
                return true;
            }
            this.f9104c = aVar2;
            this.f9105d = f10;
            return false;
        }

        public final o4.a<T> b() {
            return this.f9103b;
        }

        public final boolean c(float f10) {
            boolean z10;
            o4.a<T> aVar = this.f9103b;
            if (f10 < aVar.b() || f10 >= aVar.a()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                return !this.f9103b.c();
            }
            this.f9103b = f(f10);
            return true;
        }

        public final float d() {
            List<? extends o4.a<T>> list = this.f9102a;
            return ((o4.a) list.get(list.size() - 1)).a();
        }

        public final float e() {
            return ((o4.a) this.f9102a.get(0)).b();
        }

        public final o4.a<T> f(float f10) {
            List<? extends o4.a<T>> list = this.f9102a;
            o4.a<T> aVar = (o4.a) list.get(list.size() - 1);
            if (f10 >= aVar.b()) {
                return aVar;
            }
            int size = this.f9102a.size() - 2;
            while (true) {
                boolean z10 = false;
                if (size < 1) {
                    return (o4.a) this.f9102a.get(0);
                }
                o4.a<T> aVar2 = (o4.a) this.f9102a.get(size);
                if (this.f9103b != aVar2) {
                    if (f10 >= aVar2.b() && f10 < aVar2.a()) {
                        z10 = true;
                    }
                    if (z10) {
                        return aVar2;
                    }
                }
                size--;
            }
        }

        public final boolean isEmpty() {
            return false;
        }
    }

    /* compiled from: BaseKeyframeAnimation */
    public static final class e<T> implements c<T> {

        /* renamed from: a  reason: collision with root package name */
        public final o4.a<T> f9106a;

        /* renamed from: b  reason: collision with root package name */
        public float f9107b = -1.0f;

        public e(List<? extends o4.a<T>> list) {
            this.f9106a = (o4.a) list.get(0);
        }

        public final boolean a(float f10) {
            if (this.f9107b == f10) {
                return true;
            }
            this.f9107b = f10;
            return false;
        }

        public final o4.a<T> b() {
            return this.f9106a;
        }

        public final boolean c(float f10) {
            return !this.f9106a.c();
        }

        public final float d() {
            return this.f9106a.a();
        }

        public final float e() {
            return this.f9106a.b();
        }

        public final boolean isEmpty() {
            return false;
        }
    }

    public a(List<? extends o4.a<K>> list) {
        c<K> cVar;
        c<K> cVar2;
        if (list.isEmpty()) {
            cVar = new b<>();
        } else {
            if (list.size() == 1) {
                cVar2 = new e<>(list);
            } else {
                cVar2 = new d<>(list);
            }
            cVar = cVar2;
        }
        this.f9096c = cVar;
    }

    public final void a(C0097a aVar) {
        this.f9094a.add(aVar);
    }

    public final o4.a<K> b() {
        o4.a<K> b10 = this.f9096c.b();
        m9.b.v();
        return b10;
    }

    public float c() {
        if (this.f9101h == -1.0f) {
            this.f9101h = this.f9096c.d();
        }
        return this.f9101h;
    }

    public final float d() {
        o4.a b10 = b();
        if (b10 == null || b10.c()) {
            return 0.0f;
        }
        return b10.f13706d.getInterpolation(e());
    }

    public final float e() {
        if (this.f9095b) {
            return 0.0f;
        }
        o4.a b10 = b();
        if (b10.c()) {
            return 0.0f;
        }
        return (this.f9097d - b10.b()) / (b10.a() - b10.b());
    }

    public A f() {
        A a10;
        float e10 = e();
        if (this.f9098e == null && this.f9096c.a(e10)) {
            return this.f9099f;
        }
        o4.a b10 = b();
        Interpolator interpolator = b10.f13707e;
        if (interpolator == null || b10.f13708f == null) {
            a10 = g(b10, d());
        } else {
            a10 = h(b10, e10, interpolator.getInterpolation(e10), b10.f13708f.getInterpolation(e10));
        }
        this.f9099f = a10;
        return a10;
    }

    public abstract A g(o4.a<K> aVar, float f10);

    public A h(o4.a<K> aVar, float f10, float f11, float f12) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public void i() {
        for (int i10 = 0; i10 < this.f9094a.size(); i10++) {
            ((C0097a) this.f9094a.get(i10)).a();
        }
    }

    public void j(float f10) {
        if (!this.f9096c.isEmpty()) {
            if (this.f9100g == -1.0f) {
                this.f9100g = this.f9096c.e();
            }
            float f11 = this.f9100g;
            if (f10 < f11) {
                if (f11 == -1.0f) {
                    this.f9100g = this.f9096c.e();
                }
                f10 = this.f9100g;
            } else if (f10 > c()) {
                f10 = c();
            }
            if (f10 != this.f9097d) {
                this.f9097d = f10;
                if (this.f9096c.c(f10)) {
                    i();
                }
            }
        }
    }

    public final void k(k kVar) {
        k kVar2 = this.f9098e;
        if (kVar2 != null) {
            kVar2.f17755b = null;
        }
        this.f9098e = kVar;
        if (kVar != null) {
            kVar.f17755b = this;
        }
    }
}
