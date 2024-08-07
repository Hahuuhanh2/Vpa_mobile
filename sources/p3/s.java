package p3;

import android.content.Context;
import d3.c;
import y2.b;

/* compiled from: WorkDatabaseMigrations.kt */
public final class s extends b {

    /* renamed from: c  reason: collision with root package name */
    public final Context f14022c;

    public s(Context context, int i10, int i11) {
        super(i10, i11);
        this.f14022c = context;
    }

    public final void a(c cVar) {
        if (this.f17389b >= 10) {
            cVar.d("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
            return;
        }
        this.f14022c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
    }
}
