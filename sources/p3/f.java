package p3;

import d3.c;
import y2.b;

/* compiled from: WorkDatabaseMigrations.kt */
public final class f extends b {

    /* renamed from: c  reason: collision with root package name */
    public static final f f13925c = new f();

    public f() {
        super(12, 13);
    }

    public final void a(c cVar) {
        cVar.o("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
        cVar.o("UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL");
    }
}
