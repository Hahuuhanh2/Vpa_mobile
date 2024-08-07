package x3;

import android.database.Cursor;
import c3.f;
import java.util.ArrayList;
import sk.j;
import x2.d;
import x2.n;
import x2.p;
import x2.r;

/* compiled from: SystemIdInfoDao_Impl */
public final class k implements j {

    /* renamed from: a  reason: collision with root package name */
    public final n f17006a;

    /* renamed from: b  reason: collision with root package name */
    public final a f17007b;

    /* renamed from: c  reason: collision with root package name */
    public final b f17008c;

    /* renamed from: d  reason: collision with root package name */
    public final c f17009d;

    /* compiled from: SystemIdInfoDao_Impl */
    public class a extends d {
        public a(n nVar) {
            super(nVar, 1);
        }

        public final String c() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
        }

        public final void e(f fVar, Object obj) {
            i iVar = (i) obj;
            String str = iVar.f17003a;
            if (str == null) {
                fVar.m0(1);
            } else {
                fVar.p(1, str);
            }
            fVar.H(2, (long) iVar.f17004b);
            fVar.H(3, (long) iVar.f17005c);
        }
    }

    /* compiled from: SystemIdInfoDao_Impl */
    public class b extends r {
        public b(n nVar) {
            super(nVar);
        }

        public final String c() {
            return "DELETE FROM SystemIdInfo where work_spec_id=? AND generation=?";
        }
    }

    /* compiled from: SystemIdInfoDao_Impl */
    public class c extends r {
        public c(n nVar) {
            super(nVar);
        }

        public final String c() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public k(n nVar) {
        this.f17006a = nVar;
        this.f17007b = new a(nVar);
        this.f17008c = new b(nVar);
        this.f17009d = new c(nVar);
    }

    public final ArrayList a() {
        String str;
        p i10 = p.i(0, "SELECT DISTINCT work_spec_id FROM SystemIdInfo");
        this.f17006a.b();
        Cursor m02 = j7.a.m0(this.f17006a, i10);
        try {
            ArrayList arrayList = new ArrayList(m02.getCount());
            while (m02.moveToNext()) {
                if (m02.isNull(0)) {
                    str = null;
                } else {
                    str = m02.getString(0);
                }
                arrayList.add(str);
            }
            return arrayList;
        } finally {
            m02.close();
            i10.q();
        }
    }

    public final void b(l lVar) {
        g(lVar.f17011b, lVar.f17010a);
    }

    public final void c(i iVar) {
        this.f17006a.b();
        this.f17006a.c();
        try {
            this.f17007b.f(iVar);
            this.f17006a.n();
        } finally {
            this.f17006a.j();
        }
    }

    public final void d(String str) {
        this.f17006a.b();
        f a10 = this.f17009d.a();
        if (str == null) {
            a10.m0(1);
        } else {
            a10.p(1, str);
        }
        this.f17006a.c();
        try {
            a10.t();
            this.f17006a.n();
        } finally {
            this.f17006a.j();
            this.f17009d.d(a10);
        }
    }

    public final i e(l lVar) {
        j.f(lVar, "id");
        return f(lVar.f17011b, lVar.f17010a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: x3.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r7v1 */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: type inference failed for: r7v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final x3.i f(int r6, java.lang.String r7) {
        /*
            r5 = this;
            r0 = 2
            java.lang.String r1 = "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?"
            x2.p r1 = x2.p.i(r0, r1)
            r2 = 1
            if (r7 != 0) goto L_0x000e
            r1.m0(r2)
            goto L_0x0011
        L_0x000e:
            r1.p(r2, r7)
        L_0x0011:
            long r6 = (long) r6
            r1.H(r0, r6)
            x2.n r6 = r5.f17006a
            r6.b()
            x2.n r6 = r5.f17006a
            r7 = 0
            android.database.Cursor r6 = j7.a.m0(r6, r1)
            java.lang.String r0 = "work_spec_id"
            int r0 = al.g0.R(r6, r0)     // Catch:{ all -> 0x0059 }
            java.lang.String r2 = "generation"
            int r2 = al.g0.R(r6, r2)     // Catch:{ all -> 0x0059 }
            java.lang.String r3 = "system_id"
            int r3 = al.g0.R(r6, r3)     // Catch:{ all -> 0x0059 }
            boolean r4 = r6.moveToFirst()     // Catch:{ all -> 0x0059 }
            if (r4 == 0) goto L_0x0052
            boolean r4 = r6.isNull(r0)     // Catch:{ all -> 0x0059 }
            if (r4 == 0) goto L_0x0040
            goto L_0x0044
        L_0x0040:
            java.lang.String r7 = r6.getString(r0)     // Catch:{ all -> 0x0059 }
        L_0x0044:
            int r0 = r6.getInt(r2)     // Catch:{ all -> 0x0059 }
            int r2 = r6.getInt(r3)     // Catch:{ all -> 0x0059 }
            x3.i r3 = new x3.i     // Catch:{ all -> 0x0059 }
            r3.<init>(r7, r0, r2)     // Catch:{ all -> 0x0059 }
            r7 = r3
        L_0x0052:
            r6.close()
            r1.q()
            return r7
        L_0x0059:
            r7 = move-exception
            r6.close()
            r1.q()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: x3.k.f(int, java.lang.String):x3.i");
    }

    public final void g(int i10, String str) {
        this.f17006a.b();
        f a10 = this.f17008c.a();
        if (str == null) {
            a10.m0(1);
        } else {
            a10.p(1, str);
        }
        a10.H(2, (long) i10);
        this.f17006a.c();
        try {
            a10.t();
            this.f17006a.n();
        } finally {
            this.f17006a.j();
            this.f17008c.d(a10);
        }
    }
}
