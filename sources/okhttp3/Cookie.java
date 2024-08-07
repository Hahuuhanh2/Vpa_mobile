package okhttp3;

import java.text.DateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.internal.Util;
import okhttp3.internal.http.DatesKt;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import sk.j;
import yk.l;

/* compiled from: Cookie.kt */
public final class Cookie {

    /* renamed from: j  reason: collision with root package name */
    public static final Companion f21963j = new Companion(0);

    /* renamed from: k  reason: collision with root package name */
    public static final Pattern f21964k = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: l  reason: collision with root package name */
    public static final Pattern f21965l = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: m  reason: collision with root package name */
    public static final Pattern f21966m = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: n  reason: collision with root package name */
    public static final Pattern f21967n = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a  reason: collision with root package name */
    public final String f21968a;

    /* renamed from: b  reason: collision with root package name */
    public final String f21969b;

    /* renamed from: c  reason: collision with root package name */
    public final long f21970c;

    /* renamed from: d  reason: collision with root package name */
    public final String f21971d;

    /* renamed from: e  reason: collision with root package name */
    public final String f21972e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f21973f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f21974g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f21975h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f21976i;

    /* compiled from: Cookie.kt */
    public static final class Builder {
    }

    /* compiled from: Cookie.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i10) {
            this();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:27:0x003b, code lost:
            if (r0 != ':') goto L_0x003e;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int a(int r5, int r6, java.lang.String r7, boolean r8) {
            /*
            L_0x0000:
                if (r5 >= r6) goto L_0x0046
                char r0 = r7.charAt(r5)
                r1 = 32
                r2 = 0
                r3 = 1
                if (r0 >= r1) goto L_0x0010
                r1 = 9
                if (r0 != r1) goto L_0x003d
            L_0x0010:
                r1 = 127(0x7f, float:1.78E-43)
                if (r0 >= r1) goto L_0x003d
                r1 = 48
                r4 = 58
                if (r1 > r0) goto L_0x001e
                if (r0 >= r4) goto L_0x001e
                r1 = r3
                goto L_0x001f
            L_0x001e:
                r1 = r2
            L_0x001f:
                if (r1 != 0) goto L_0x003d
                r1 = 97
                if (r1 > r0) goto L_0x002b
                r1 = 123(0x7b, float:1.72E-43)
                if (r0 >= r1) goto L_0x002b
                r1 = r3
                goto L_0x002c
            L_0x002b:
                r1 = r2
            L_0x002c:
                if (r1 != 0) goto L_0x003d
                r1 = 65
                if (r1 > r0) goto L_0x0038
                r1 = 91
                if (r0 >= r1) goto L_0x0038
                r1 = r3
                goto L_0x0039
            L_0x0038:
                r1 = r2
            L_0x0039:
                if (r1 != 0) goto L_0x003d
                if (r0 != r4) goto L_0x003e
            L_0x003d:
                r2 = r3
            L_0x003e:
                r0 = r8 ^ 1
                if (r2 != r0) goto L_0x0043
                return r5
            L_0x0043:
                int r5 = r5 + 1
                goto L_0x0000
            L_0x0046:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.Cookie.Companion.a(int, int, java.lang.String, boolean):int");
        }

        public static long b(int i10, String str) {
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            boolean z15;
            boolean z16;
            boolean z17;
            int a10 = a(0, i10, str, false);
            Matcher matcher = Cookie.f21967n.matcher(str);
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            while (a10 < i10) {
                int a11 = a(a10 + 1, i10, str, true);
                matcher.region(a10, a11);
                if (i12 == -1 && matcher.usePattern(Cookie.f21967n).matches()) {
                    String group = matcher.group(1);
                    j.e(group, "matcher.group(1)");
                    i12 = Integer.parseInt(group);
                    String group2 = matcher.group(2);
                    j.e(group2, "matcher.group(2)");
                    i15 = Integer.parseInt(group2);
                    String group3 = matcher.group(3);
                    j.e(group3, "matcher.group(3)");
                    i16 = Integer.parseInt(group3);
                } else if (i13 != -1 || !matcher.usePattern(Cookie.f21966m).matches()) {
                    if (i14 == -1) {
                        Pattern pattern = Cookie.f21965l;
                        if (matcher.usePattern(pattern).matches()) {
                            String group4 = matcher.group(1);
                            j.e(group4, "matcher.group(1)");
                            Locale locale = Locale.US;
                            j.e(locale, "US");
                            String lowerCase = group4.toLowerCase(locale);
                            j.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                            String pattern2 = pattern.pattern();
                            j.e(pattern2, "MONTH_PATTERN.pattern()");
                            i14 = l.S0(pattern2, lowerCase, 0, false, 6) / 4;
                        }
                    }
                    if (i11 == -1 && matcher.usePattern(Cookie.f21964k).matches()) {
                        String group5 = matcher.group(1);
                        j.e(group5, "matcher.group(1)");
                        i11 = Integer.parseInt(group5);
                    }
                } else {
                    String group6 = matcher.group(1);
                    j.e(group6, "matcher.group(1)");
                    i13 = Integer.parseInt(group6);
                }
                a10 = a(a11 + 1, i10, str, false);
            }
            if (70 > i11 || i11 >= 100) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                i11 += 1900;
            }
            if (i11 < 0 || i11 >= 70) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (z11) {
                i11 += 2000;
            }
            if (i11 >= 1601) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                if (i14 != -1) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13) {
                    if (1 > i13 || i13 >= 32) {
                        z14 = false;
                    } else {
                        z14 = true;
                    }
                    if (z14) {
                        if (i12 < 0 || i12 >= 24) {
                            z15 = false;
                        } else {
                            z15 = true;
                        }
                        if (z15) {
                            if (i15 < 0 || i15 >= 60) {
                                z16 = false;
                            } else {
                                z16 = true;
                            }
                            if (z16) {
                                if (i16 < 0 || i16 >= 60) {
                                    z17 = false;
                                } else {
                                    z17 = true;
                                }
                                if (z17) {
                                    GregorianCalendar gregorianCalendar = new GregorianCalendar(Util.f22175e);
                                    gregorianCalendar.setLenient(false);
                                    gregorianCalendar.set(1, i11);
                                    gregorianCalendar.set(2, i14 - 1);
                                    gregorianCalendar.set(5, i13);
                                    gregorianCalendar.set(11, i12);
                                    gregorianCalendar.set(12, i15);
                                    gregorianCalendar.set(13, i16);
                                    gregorianCalendar.set(14, 0);
                                    return gregorianCalendar.getTimeInMillis();
                                }
                                throw new IllegalArgumentException("Failed requirement.".toString());
                            }
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        }
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    public Cookie(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f21968a = str;
        this.f21969b = str2;
        this.f21970c = j10;
        this.f21971d = str3;
        this.f21972e = str4;
        this.f21973f = z10;
        this.f21974g = z11;
        this.f21975h = z12;
        this.f21976i = z13;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Cookie) {
            Cookie cookie = (Cookie) obj;
            if (j.a(cookie.f21968a, this.f21968a) && j.a(cookie.f21969b, this.f21969b) && cookie.f21970c == this.f21970c && j.a(cookie.f21971d, this.f21971d) && j.a(cookie.f21972e, this.f21972e) && cookie.f21973f == this.f21973f && cookie.f21974g == this.f21974g && cookie.f21975h == this.f21975h && cookie.f21976i == this.f21976i) {
                return true;
            }
            return false;
        }
        return false;
    }

    @IgnoreJRERequirement
    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int f10 = n0.l.f(this.f21969b, n0.l.f(this.f21968a, 527, 31), 31);
        long j10 = this.f21970c;
        int f11 = n0.l.f(this.f21972e, n0.l.f(this.f21971d, (f10 + ((int) (j10 ^ (j10 >>> 32)))) * 31, 31), 31);
        int i13 = 1231;
        if (this.f21973f) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i14 = (f11 + i10) * 31;
        if (this.f21974g) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        int i15 = (i14 + i11) * 31;
        if (this.f21975h) {
            i12 = 1231;
        } else {
            i12 = 1237;
        }
        int i16 = (i15 + i12) * 31;
        if (!this.f21976i) {
            i13 = 1237;
        }
        return i16 + i13;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f21968a);
        sb2.append('=');
        sb2.append(this.f21969b);
        if (this.f21975h) {
            if (this.f21970c == Long.MIN_VALUE) {
                sb2.append("; max-age=0");
            } else {
                sb2.append("; expires=");
                String format = ((DateFormat) DatesKt.f22314a.get()).format(new Date(this.f21970c));
                j.e(format, "STANDARD_DATE_FORMAT.get().format(this)");
                sb2.append(format);
            }
        }
        if (!this.f21976i) {
            sb2.append("; domain=");
            sb2.append(this.f21971d);
        }
        sb2.append("; path=");
        sb2.append(this.f21972e);
        if (this.f21973f) {
            sb2.append("; secure");
        }
        if (this.f21974g) {
            sb2.append("; httponly");
        }
        String sb3 = sb2.toString();
        j.e(sb3, "toString()");
        return sb3;
    }
}
