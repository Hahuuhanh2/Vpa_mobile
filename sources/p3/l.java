package p3;

import d3.c;
import y2.b;

/* compiled from: WorkDatabaseMigrations.kt */
public final class l extends b {

    /* renamed from: c  reason: collision with root package name */
    public static final l f13949c = new l();

    public l() {
        super(6, 7);
    }

    public final void a(c cVar) {
        cVar.o("\n    CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress`\n    BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
    }
}
