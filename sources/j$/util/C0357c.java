package j$.util;

import java.util.Collections;
import java.util.Comparator;

/* renamed from: j$.util.c  reason: case insensitive filesystem */
enum C0357c implements Comparator, Comparator {
    ;

    private C0357c() {
    }

    public final int compare(Object obj, Object obj2) {
        return ((Comparable) obj).compareTo((Comparable) obj2);
    }

    public final Comparator reversed() {
        return Collections.reverseOrder();
    }
}
