package okhttp3;

import java.util.Comparator;
import sk.j;

/* compiled from: CipherSuite.kt */
public final class CipherSuite$Companion$ORDER_BY_NAME$1 implements Comparator<String> {
    public final int compare(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        j.f(str, "a");
        j.f(str2, "b");
        int min = Math.min(str.length(), str2.length());
        int i10 = 4;
        while (true) {
            if (i10 < min) {
                char charAt = str.charAt(i10);
                char charAt2 = str2.charAt(i10);
                if (charAt == charAt2) {
                    i10++;
                } else if (j.h(charAt, charAt2) < 0) {
                    return -1;
                }
            } else {
                int length = str.length();
                int length2 = str2.length();
                if (length == length2) {
                    return 0;
                }
                if (length < length2) {
                    return -1;
                }
            }
        }
        return 1;
    }
}
