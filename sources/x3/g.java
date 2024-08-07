package x3;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase;
import j7.a;
import x2.n;
import x2.p;

/* compiled from: PreferenceDao_Impl */
public final class g implements e {

    /* renamed from: a  reason: collision with root package name */
    public final n f17001a;

    /* renamed from: b  reason: collision with root package name */
    public final f f17002b;

    public g(WorkDatabase workDatabase) {
        this.f17001a = workDatabase;
        this.f17002b = new f(workDatabase);
    }

    public final Long a(String str) {
        p i10 = p.i(1, "SELECT long_value FROM Preference where `key`=?");
        i10.p(1, str);
        this.f17001a.b();
        Long l10 = null;
        Cursor m02 = a.m0(this.f17001a, i10);
        try {
            if (m02.moveToFirst()) {
                if (!m02.isNull(0)) {
                    l10 = Long.valueOf(m02.getLong(0));
                }
            }
            return l10;
        } finally {
            m02.close();
            i10.q();
        }
    }

    public final void b(d dVar) {
        this.f17001a.b();
        this.f17001a.c();
        try {
            this.f17002b.f(dVar);
            this.f17001a.n();
        } finally {
            this.f17001a.j();
        }
    }
}
