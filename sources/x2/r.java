package x2;

import c3.f;
import ek.g;
import java.util.concurrent.atomic.AtomicBoolean;
import sk.j;
import sk.k;

/* compiled from: SharedSQLiteStatement.kt */
public abstract class r {

    /* renamed from: a  reason: collision with root package name */
    public final n f16991a;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicBoolean f16992b = new AtomicBoolean(false);

    /* renamed from: c  reason: collision with root package name */
    public final g f16993c = j7.a.b0(new a(this));

    /* compiled from: SharedSQLiteStatement.kt */
    public static final class a extends k implements rk.a<f> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ r f16994a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(r rVar) {
            super(0);
            this.f16994a = rVar;
        }

        public final Object invoke() {
            return this.f16994a.b();
        }
    }

    public r(n nVar) {
        j.f(nVar, "database");
        this.f16991a = nVar;
    }

    public final f a() {
        this.f16991a.a();
        if (this.f16992b.compareAndSet(false, true)) {
            return (f) this.f16993c.getValue();
        }
        return b();
    }

    public final f b() {
        String c10 = c();
        n nVar = this.f16991a;
        nVar.getClass();
        j.f(c10, "sql");
        nVar.a();
        nVar.b();
        return nVar.g().P().u(c10);
    }

    public abstract String c();

    public final void d(f fVar) {
        j.f(fVar, "statement");
        if (fVar == ((f) this.f16993c.getValue())) {
            this.f16992b.set(false);
        }
    }
}
