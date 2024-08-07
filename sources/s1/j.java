package s1;

import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;

/* compiled from: LocaleListCompat */
public final class j {

    /* renamed from: b  reason: collision with root package name */
    public static final j f14593b = a(new Locale[0]);

    /* renamed from: a  reason: collision with root package name */
    public final l f14594a;

    /* compiled from: LocaleListCompat */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final Locale[] f14595a = {new Locale("en", "XA"), new Locale("ar", "XB")};

        public static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }

        public static boolean b(Locale locale, Locale locale2) {
            boolean z10;
            boolean z11;
            if (locale.equals(locale2)) {
                return true;
            }
            if (!locale.getLanguage().equals(locale2.getLanguage())) {
                return false;
            }
            Locale[] localeArr = f14595a;
            int length = localeArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    z10 = false;
                    break;
                } else if (localeArr[i10].equals(locale)) {
                    z10 = true;
                    break;
                } else {
                    i10++;
                }
            }
            if (!z10) {
                Locale[] localeArr2 = f14595a;
                int length2 = localeArr2.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length2) {
                        z11 = false;
                        break;
                    } else if (localeArr2[i11].equals(locale2)) {
                        z11 = true;
                        break;
                    } else {
                        i11++;
                    }
                }
                if (!z11) {
                    String a10 = u1.b.a(locale);
                    if (!a10.isEmpty()) {
                        return a10.equals(u1.b.a(locale2));
                    }
                    String country = locale.getCountry();
                    if (country.isEmpty() || country.equals(locale2.getCountry())) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        }
    }

    /* compiled from: LocaleListCompat */
    public static class b {
        public static LocaleList a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        public static LocaleList b() {
            return LocaleList.getAdjustedDefault();
        }

        public static LocaleList c() {
            return LocaleList.getDefault();
        }
    }

    public j(l lVar) {
        this.f14594a = lVar;
    }

    public static j a(Locale... localeArr) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new j(new m(b.a(localeArr)));
        }
        return new j(new k(localeArr));
    }

    public static j b(String str) {
        if (str == null || str.isEmpty()) {
            return f14593b;
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i10 = 0; i10 < length; i10++) {
            localeArr[i10] = a.a(split[i10]);
        }
        return a(localeArr);
    }

    public final Locale c(int i10) {
        return this.f14594a.get(i10);
    }

    public final boolean d() {
        return this.f14594a.isEmpty();
    }

    public final int e() {
        return this.f14594a.size();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j) || !this.f14594a.equals(((j) obj).f14594a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f14594a.hashCode();
    }

    public final String toString() {
        return this.f14594a.toString();
    }
}
