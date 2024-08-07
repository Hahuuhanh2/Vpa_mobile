package x3;

import c3.f;
import x2.d;
import x2.n;

/* compiled from: WorkProgressDao_Impl */
public final class r implements q {

    /* renamed from: a  reason: collision with root package name */
    public final n f17016a;

    /* renamed from: b  reason: collision with root package name */
    public final b f17017b;

    /* renamed from: c  reason: collision with root package name */
    public final c f17018c;

    /* compiled from: WorkProgressDao_Impl */
    public class a extends d {
        public a(n nVar) {
            super(nVar, 1);
        }

        public final String c() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }

        public final void e(f fVar, Object obj) {
            p pVar = (p) obj;
            fVar.m0(1);
            byte[] b10 = androidx.work.c.b((androidx.work.c) null);
            if (b10 == null) {
                fVar.m0(2);
            } else {
                fVar.M(2, b10);
            }
        }
    }

    /* compiled from: WorkProgressDao_Impl */
    public class b extends x2.r {
        public b(n nVar) {
            super(nVar);
        }

        public final String c() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    /* compiled from: WorkProgressDao_Impl */
    public class c extends x2.r {
        public c(n nVar) {
            super(nVar);
        }

        public final String c() {
            return "DELETE FROM WorkProgress";
        }
    }

    public r(n nVar) {
        this.f17016a = nVar;
        new a(nVar);
        this.f17017b = new b(nVar);
        this.f17018c = new c(nVar);
    }

    public final void a(String str) {
        this.f17016a.b();
        f a10 = this.f17017b.a();
        if (str == null) {
            a10.m0(1);
        } else {
            a10.p(1, str);
        }
        this.f17016a.c();
        try {
            a10.t();
            this.f17016a.n();
        } finally {
            this.f17016a.j();
            this.f17017b.d(a10);
        }
    }

    public final void b() {
        this.f17016a.b();
        f a10 = this.f17018c.a();
        this.f17016a.c();
        try {
            a10.t();
            this.f17016a.n();
        } finally {
            this.f17016a.j();
            this.f17018c.d(a10);
        }
    }
}
