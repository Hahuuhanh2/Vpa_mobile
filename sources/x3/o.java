package x3;

import android.database.Cursor;
import c3.f;
import java.util.ArrayList;
import x2.d;
import x2.n;
import x2.p;

/* compiled from: WorkNameDao_Impl */
public final class o implements n {

    /* renamed from: a  reason: collision with root package name */
    public final n f17014a;

    /* renamed from: b  reason: collision with root package name */
    public final a f17015b;

    /* compiled from: WorkNameDao_Impl */
    public class a extends d {
        public a(n nVar) {
            super(nVar, 1);
        }

        public final String c() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }

        public final void e(f fVar, Object obj) {
            m mVar = (m) obj;
            String str = mVar.f17012a;
            if (str == null) {
                fVar.m0(1);
            } else {
                fVar.p(1, str);
            }
            String str2 = mVar.f17013b;
            if (str2 == null) {
                fVar.m0(2);
            } else {
                fVar.p(2, str2);
            }
        }
    }

    public o(n nVar) {
        this.f17014a = nVar;
        this.f17015b = new a(nVar);
    }

    public final void a(m mVar) {
        this.f17014a.b();
        this.f17014a.c();
        try {
            this.f17015b.f(mVar);
            this.f17014a.n();
        } finally {
            this.f17014a.j();
        }
    }

    public final ArrayList b(String str) {
        String str2;
        p i10 = p.i(1, "SELECT name FROM workname WHERE work_spec_id=?");
        if (str == null) {
            i10.m0(1);
        } else {
            i10.p(1, str);
        }
        this.f17014a.b();
        Cursor m02 = j7.a.m0(this.f17014a, i10);
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
}
