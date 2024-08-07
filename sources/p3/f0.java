package p3;

import d3.c;
import y2.b;

/* compiled from: WorkDatabase_AutoMigration_18_19_Impl */
public final class f0 extends b {
    public f0() {
        super(18, 19);
    }

    public final void a(c cVar) {
        cVar.o("ALTER TABLE `WorkSpec` ADD COLUMN `stop_reason` INTEGER NOT NULL DEFAULT -256");
    }
}
