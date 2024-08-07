package p3;

import d3.c;
import y2.b;

/* compiled from: WorkDatabaseMigrations.kt */
public final class j extends b {

    /* renamed from: c  reason: collision with root package name */
    public static final j f13933c = new j();

    public j() {
        super(3, 4);
    }

    public final void a(c cVar) {
        cVar.o("\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ");
    }
}
