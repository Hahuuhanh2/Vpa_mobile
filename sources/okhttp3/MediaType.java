package okhttp3;

import android.support.v4.media.a;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import sk.j;
import yk.h;

/* compiled from: MediaType.kt */
public final class MediaType {

    /* renamed from: e  reason: collision with root package name */
    public static final Companion f22026e = new Companion(0);

    /* renamed from: f  reason: collision with root package name */
    public static final Pattern f22027f = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: g  reason: collision with root package name */
    public static final Pattern f22028g = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a  reason: collision with root package name */
    public final String f22029a;

    /* renamed from: b  reason: collision with root package name */
    public final String f22030b;

    /* renamed from: c  reason: collision with root package name */
    public final String f22031c;

    /* renamed from: d  reason: collision with root package name */
    public final String[] f22032d;

    /* compiled from: MediaType.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i10) {
            this();
        }

        public static MediaType a(String str) {
            j.f(str, "<this>");
            Matcher matcher = MediaType.f22027f.matcher(str);
            if (matcher.lookingAt()) {
                String group = matcher.group(1);
                j.e(group, "typeSubtype.group(1)");
                Locale locale = Locale.US;
                j.e(locale, "US");
                String lowerCase = group.toLowerCase(locale);
                j.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                String group2 = matcher.group(2);
                j.e(group2, "typeSubtype.group(2)");
                String lowerCase2 = group2.toLowerCase(locale);
                j.e(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                ArrayList arrayList = new ArrayList();
                Matcher matcher2 = MediaType.f22028g.matcher(str);
                int end = matcher.end();
                while (end < str.length()) {
                    matcher2.region(end, str.length());
                    if (matcher2.lookingAt()) {
                        String group3 = matcher2.group(1);
                        if (group3 == null) {
                            end = matcher2.end();
                        } else {
                            String group4 = matcher2.group(2);
                            if (group4 == null) {
                                group4 = matcher2.group(3);
                            } else if (h.L0(group4, "'", false) && h.F0(group4, "'") && group4.length() > 2) {
                                group4 = group4.substring(1, group4.length() - 1);
                                j.e(group4, "this as java.lang.String…ing(startIndex, endIndex)");
                            }
                            arrayList.add(group3);
                            arrayList.add(group4);
                            end = matcher2.end();
                        }
                    } else {
                        StringBuilder q10 = a.q("Parameter is not formatted correctly: \"");
                        String substring = str.substring(end);
                        j.e(substring, "this as java.lang.String).substring(startIndex)");
                        q10.append(substring);
                        q10.append("\" for: \"");
                        q10.append(str);
                        q10.append('\"');
                        throw new IllegalArgumentException(q10.toString().toString());
                    }
                }
                return new MediaType(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]));
            }
            throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
        }

        public static MediaType b(String str) {
            j.f(str, "<this>");
            try {
                return a(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }

    public MediaType(String str, String str2, String str3, String[] strArr) {
        this.f22029a = str;
        this.f22030b = str2;
        this.f22031c = str3;
        this.f22032d = strArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0029 A[SYNTHETIC, Splitter:B:10:0x0029] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0028 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.nio.charset.Charset a(java.nio.charset.Charset r5) {
        /*
            r4 = this;
            java.lang.String[] r0 = r4.f22032d
            int r0 = r0.length
            int r0 = r0 + -1
            r1 = 0
            r2 = 2
            int r0 = al.g0.a0(r1, r0, r2)
            if (r0 < 0) goto L_0x0025
        L_0x000d:
            java.lang.String[] r2 = r4.f22032d
            r2 = r2[r1]
            java.lang.String r3 = "charset"
            boolean r2 = yk.h.G0(r2, r3)
            if (r2 == 0) goto L_0x0020
            java.lang.String[] r0 = r4.f22032d
            int r1 = r1 + 1
            r0 = r0[r1]
            goto L_0x0026
        L_0x0020:
            if (r1 == r0) goto L_0x0025
            int r1 = r1 + 2
            goto L_0x000d
        L_0x0025:
            r0 = 0
        L_0x0026:
            if (r0 != 0) goto L_0x0029
            return r5
        L_0x0029:
            java.nio.charset.Charset r5 = java.nio.charset.Charset.forName(r0)     // Catch:{ IllegalArgumentException -> 0x002d }
        L_0x002d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.MediaType.a(java.nio.charset.Charset):java.nio.charset.Charset");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof MediaType) || !j.a(((MediaType) obj).f22029a, this.f22029a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f22029a.hashCode();
    }

    public final String toString() {
        return this.f22029a;
    }
}
