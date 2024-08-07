package p3;

import d3.c;
import o3.a;
import x2.n;

/* compiled from: WorkDatabase.kt */
public final class b extends n.b {

    /* renamed from: a  reason: collision with root package name */
    public final a f13919a;

    public b(j7.a aVar) {
        this.f13919a = aVar;
    }

    public final void a(c cVar) {
        cVar.k();
        try {
            cVar.o("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < " + (this.f13919a.a() - z.f14039a) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            cVar.I();
        } finally {
            cVar.X();
        }
    }
}
