package p3;

import d3.c;
import y2.b;

/* compiled from: WorkDatabaseMigrations.kt */
public final class m extends b {

    /* renamed from: c  reason: collision with root package name */
    public static final m f13969c = new m();

    public m() {
        super(7, 8);
    }

    public final void a(c cVar) {
        cVar.o("\n    CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec`(`period_start_time`)\n    ");
    }
}
