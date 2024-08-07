package p3;

import d3.c;
import y2.b;

/* compiled from: WorkDatabaseMigrations.kt */
public final class n extends b {

    /* renamed from: c  reason: collision with root package name */
    public static final n f13972c = new n();

    public n() {
        super(8, 9);
    }

    public final void a(c cVar) {
        cVar.o("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
    }
}
