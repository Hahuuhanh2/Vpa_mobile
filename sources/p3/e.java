package p3;

import d3.c;
import y2.b;

/* compiled from: WorkDatabaseMigrations.kt */
public final class e extends b {

    /* renamed from: c  reason: collision with root package name */
    public static final e f13924c = new e();

    public e() {
        super(11, 12);
    }

    public final void a(c cVar) {
        cVar.o("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
    }
}
