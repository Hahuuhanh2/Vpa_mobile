package x3;

import android.database.Cursor;
import c3.f;
import java.util.ArrayList;
import x2.d;
import x2.n;
import x2.p;

/* compiled from: DependencyDao_Impl */
public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    public final n f16997a;

    /* renamed from: b  reason: collision with root package name */
    public final a f16998b;

    /* compiled from: DependencyDao_Impl */
    public class a extends d {
        public a(n nVar) {
            super(nVar, 1);
        }

        public final String c() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        public final void e(f fVar, Object obj) {
            a aVar = (a) obj;
            String str = aVar.f16995a;
            if (str == null) {
                fVar.m0(1);
            } else {
                fVar.p(1, str);
            }
            String str2 = aVar.f16996b;
            if (str2 == null) {
                fVar.m0(2);
            } else {
                fVar.p(2, str2);
            }
        }
    }

    public c(n nVar) {
        this.f16997a = nVar;
        this.f16998b = new a(nVar);
    }

    public final ArrayList a(String str) {
        String str2;
        p i10 = p.i(1, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
        if (str == null) {
            i10.m0(1);
        } else {
            i10.p(1, str);
        }
        this.f16997a.b();
        Cursor m02 = j7.a.m0(this.f16997a, i10);
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

    public final boolean b(String str) {
        boolean z10 = true;
        p i10 = p.i(1, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
        if (str == null) {
            i10.m0(1);
        } else {
            i10.p(1, str);
        }
        this.f16997a.b();
        boolean z11 = false;
        Cursor m02 = j7.a.m0(this.f16997a, i10);
        try {
            if (m02.moveToFirst()) {
                if (m02.getInt(0) == 0) {
                    z10 = false;
                }
                z11 = z10;
            }
            return z11;
        } finally {
            m02.close();
            i10.q();
        }
    }

    public final void c(a aVar) {
        this.f16997a.b();
        this.f16997a.c();
        try {
            this.f16998b.f(aVar);
            this.f16997a.n();
        } finally {
            this.f16997a.j();
        }
    }

    public final boolean d(String str) {
        boolean z10 = true;
        p i10 = p.i(1, "SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?");
        if (str == null) {
            i10.m0(1);
        } else {
            i10.p(1, str);
        }
        this.f16997a.b();
        boolean z11 = false;
        Cursor m02 = j7.a.m0(this.f16997a, i10);
        try {
            if (m02.moveToFirst()) {
                if (m02.getInt(0) == 0) {
                    z10 = false;
                }
                z11 = z10;
            }
            return z11;
        } finally {
            m02.close();
            i10.q();
        }
    }
}
