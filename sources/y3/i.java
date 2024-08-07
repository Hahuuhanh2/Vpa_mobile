package y3;

import androidx.work.impl.WorkDatabase;
import x3.d;

/* compiled from: IdGenerator.kt */
public final class i {
    public static final int a(WorkDatabase workDatabase, String str) {
        int i10;
        Long a10 = workDatabase.q().a(str);
        int i11 = 0;
        if (a10 != null) {
            i10 = (int) a10.longValue();
        } else {
            i10 = 0;
        }
        if (i10 != Integer.MAX_VALUE) {
            i11 = i10 + 1;
        }
        workDatabase.q().b(new d(str, Long.valueOf((long) i11)));
        return i10;
    }
}
