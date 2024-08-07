package s1;

import android.support.v4.media.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import v.v;

/* compiled from: LocaleListCompatWrapper */
public final class k implements l {

    /* renamed from: c  reason: collision with root package name */
    public static final Locale[] f14596c = new Locale[0];

    /* renamed from: a  reason: collision with root package name */
    public final Locale[] f14597a;

    /* renamed from: b  reason: collision with root package name */
    public final String f14598b;

    static {
        new Locale("en", "XA");
        new Locale("ar", "XB");
        String[] split = "en-Latn".split("-", -1);
        if (split.length > 2) {
            new Locale(split[0], split[1], split[2]);
        } else if (split.length > 1) {
            new Locale(split[0], split[1]);
        } else if (split.length == 1) {
            new Locale(split[0]);
        } else {
            throw new IllegalArgumentException("Can not parse language tag: [en-Latn]");
        }
    }

    public k(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f14597a = f14596c;
            this.f14598b = "";
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        while (i10 < localeArr.length) {
            Locale locale = localeArr[i10];
            if (locale != null) {
                if (!hashSet.contains(locale)) {
                    Locale locale2 = (Locale) locale.clone();
                    arrayList.add(locale2);
                    sb2.append(locale2.getLanguage());
                    String country = locale2.getCountry();
                    if (country != null && !country.isEmpty()) {
                        sb2.append('-');
                        sb2.append(locale2.getCountry());
                    }
                    if (i10 < localeArr.length - 1) {
                        sb2.append(',');
                    }
                    hashSet.add(locale2);
                }
                i10++;
            } else {
                throw new NullPointerException(v.d("list[", i10, "] is null"));
            }
        }
        this.f14597a = (Locale[]) arrayList.toArray(new Locale[0]);
        this.f14598b = sb2.toString();
    }

    public final String a() {
        return this.f14598b;
    }

    public final Object b() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        Locale[] localeArr = ((k) obj).f14597a;
        if (this.f14597a.length != localeArr.length) {
            return false;
        }
        int i10 = 0;
        while (true) {
            Locale[] localeArr2 = this.f14597a;
            if (i10 >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i10].equals(localeArr[i10])) {
                return false;
            }
            i10++;
        }
    }

    public final Locale get(int i10) {
        if (i10 >= 0) {
            Locale[] localeArr = this.f14597a;
            if (i10 < localeArr.length) {
                return localeArr[i10];
            }
        }
        return null;
    }

    public final int hashCode() {
        int i10 = 1;
        for (Locale hashCode : this.f14597a) {
            i10 = (i10 * 31) + hashCode.hashCode();
        }
        return i10;
    }

    public final boolean isEmpty() {
        if (this.f14597a.length == 0) {
            return true;
        }
        return false;
    }

    public final int size() {
        return this.f14597a.length;
    }

    public final String toString() {
        StringBuilder q10 = a.q("[");
        int i10 = 0;
        while (true) {
            Locale[] localeArr = this.f14597a;
            if (i10 < localeArr.length) {
                q10.append(localeArr[i10]);
                if (i10 < this.f14597a.length - 1) {
                    q10.append(',');
                }
                i10++;
            } else {
                q10.append("]");
                return q10.toString();
            }
        }
    }
}
