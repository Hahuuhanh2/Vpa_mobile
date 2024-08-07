package j$.time.chrono;

import java.io.Serializable;
import java.util.Comparator;

/* renamed from: j$.time.chrono.c  reason: case insensitive filesystem */
public final /* synthetic */ class C0336c implements Comparator, Serializable {
    public final int compare(Object obj, Object obj2) {
        ChronoZonedDateTime chronoZonedDateTime = (ChronoZonedDateTime) obj;
        ChronoZonedDateTime chronoZonedDateTime2 = (ChronoZonedDateTime) obj2;
        int i10 = C0337d.f18066c;
        int compare = Long.compare(chronoZonedDateTime.T(), chronoZonedDateTime2.T());
        return compare == 0 ? Long.compare((long) chronoZonedDateTime.b().Y(), (long) chronoZonedDateTime2.b().Y()) : compare;
    }
}
