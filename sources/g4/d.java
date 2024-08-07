package g4;

import i4.n;
import java.util.ArrayList;
import java.util.List;
import n0.l;

/* compiled from: FontCharacter */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final List<n> f10354a;

    /* renamed from: b  reason: collision with root package name */
    public final char f10355b;

    /* renamed from: c  reason: collision with root package name */
    public final double f10356c;

    /* renamed from: d  reason: collision with root package name */
    public final String f10357d;

    /* renamed from: e  reason: collision with root package name */
    public final String f10358e;

    public d(ArrayList arrayList, char c10, double d10, String str, String str2) {
        this.f10354a = arrayList;
        this.f10355b = c10;
        this.f10356c = d10;
        this.f10357d = str;
        this.f10358e = str2;
    }

    public static int a(char c10, String str, String str2) {
        return str2.hashCode() + l.f(str, (c10 + 0) * 31, 31);
    }

    public final int hashCode() {
        return a(this.f10355b, this.f10358e, this.f10357d);
    }
}
