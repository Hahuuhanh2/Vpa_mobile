package p3;

import d3.c;
import y2.b;

/* compiled from: WorkDatabaseMigrations.kt */
public final class k extends b {

    /* renamed from: c  reason: collision with root package name */
    public static final k f13947c = new k();

    public k() {
        super(4, 5);
    }

    public final void a(c cVar) {
        cVar.o("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
        cVar.o("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
    }
}
