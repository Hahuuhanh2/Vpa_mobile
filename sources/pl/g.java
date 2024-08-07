package pl;

import android.support.v4.media.a;
import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: DecimalStyle */
public final class g {

    /* renamed from: e  reason: collision with root package name */
    public static final g f22712e = new g();

    /* renamed from: a  reason: collision with root package name */
    public final char f22713a = '0';

    /* renamed from: b  reason: collision with root package name */
    public final char f22714b = '+';

    /* renamed from: c  reason: collision with root package name */
    public final char f22715c = '-';

    /* renamed from: d  reason: collision with root package name */
    public final char f22716d = '.';

    static {
        new ConcurrentHashMap(16, 0.75f, 2);
    }

    public final String a(String str) {
        char c10 = this.f22713a;
        if (c10 == '0') {
            return str;
        }
        int i10 = c10 - '0';
        char[] charArray = str.toCharArray();
        for (int i11 = 0; i11 < charArray.length; i11++) {
            charArray[i11] = (char) (charArray[i11] + i10);
        }
        return new String(charArray);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f22713a == gVar.f22713a && this.f22714b == gVar.f22714b && this.f22715c == gVar.f22715c && this.f22716d == gVar.f22716d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f22713a + this.f22714b + this.f22715c + this.f22716d;
    }

    public final String toString() {
        StringBuilder q10 = a.q("DecimalStyle[");
        q10.append(this.f22713a);
        q10.append(this.f22714b);
        q10.append(this.f22715c);
        q10.append(this.f22716d);
        q10.append("]");
        return q10.toString();
    }
}
