package x3;

import androidx.work.impl.WorkDatabase;
import x2.d;

/* compiled from: PreferenceDao_Impl */
public final class f extends d {
    public f(WorkDatabase workDatabase) {
        super(workDatabase, 1);
    }

    public final String c() {
        return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
    }

    public final void e(c3.f fVar, Object obj) {
        d dVar = (d) obj;
        String str = dVar.f16999a;
        if (str == null) {
            fVar.m0(1);
        } else {
            fVar.p(1, str);
        }
        Long l10 = dVar.f17000b;
        if (l10 == null) {
            fVar.m0(2);
        } else {
            fVar.H(2, l10.longValue());
        }
    }
}
