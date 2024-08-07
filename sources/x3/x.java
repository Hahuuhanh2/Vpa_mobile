package x3;

import android.database.Cursor;
import c3.f;
import java.util.ArrayList;
import java.util.Set;
import sk.j;
import x2.d;
import x2.n;
import x2.p;
import x2.r;

/* compiled from: WorkTagDao_Impl */
public final class x implements w {

    /* renamed from: a  reason: collision with root package name */
    public final n f17060a;

    /* renamed from: b  reason: collision with root package name */
    public final a f17061b;

    /* compiled from: WorkTagDao_Impl */
    public class a extends d {
        public a(n nVar) {
            super(nVar, 1);
        }

        public final String c() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }

        public final void e(f fVar, Object obj) {
            v vVar = (v) obj;
            String str = vVar.f17058a;
            if (str == null) {
                fVar.m0(1);
            } else {
                fVar.p(1, str);
            }
            String str2 = vVar.f17059b;
            if (str2 == null) {
                fVar.m0(2);
            } else {
                fVar.p(2, str2);
            }
        }
    }

    /* compiled from: WorkTagDao_Impl */
    public class b extends r {
        public b(n nVar) {
            super(nVar);
        }

        public final String c() {
            return "DELETE FROM worktag WHERE work_spec_id=?";
        }
    }

    public x(n nVar) {
        this.f17060a = nVar;
        this.f17061b = new a(nVar);
        new b(nVar);
    }

    public final ArrayList a(String str) {
        String str2;
        p i10 = p.i(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
        if (str == null) {
            i10.m0(1);
        } else {
            i10.p(1, str);
        }
        this.f17060a.b();
        Cursor m02 = j7.a.m0(this.f17060a, i10);
        try {
            ArrayList arrayList = new ArrayList(m02.getCount());
            while (m02.moveToNext()) {
                if (m02.isNull(0)) {
                    str2 = null;
                } else {
                    str2 = m02.getString(0);
                }
                arrayList.add(str2);
            }
            return arrayList;
        } finally {
            m02.close();
            i10.q();
        }
    }

    public final void b(String str, Set<String> set) {
        j.f(set, "tags");
        for (String vVar : set) {
            c(new v(vVar, str));
        }
    }

    public final void c(v vVar) {
        this.f17060a.b();
        this.f17060a.c();
        try {
            this.f17061b.f(vVar);
            this.f17060a.n();
        } finally {
            this.f17060a.j();
        }
    }
}
