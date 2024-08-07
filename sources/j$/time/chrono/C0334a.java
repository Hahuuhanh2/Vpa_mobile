package j$.time.chrono;

import java.io.Serializable;
import java.util.Comparator;

/* renamed from: j$.time.chrono.a  reason: case insensitive filesystem */
public final /* synthetic */ class C0334a implements Comparator, Serializable {
    public final int compare(Object obj, Object obj2) {
        int i10 = C0337d.f18066c;
        return Long.compare(((ChronoLocalDate) obj).I(), ((ChronoLocalDate) obj2).I());
    }
}
