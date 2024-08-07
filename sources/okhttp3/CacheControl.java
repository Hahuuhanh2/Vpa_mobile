package okhttp3;

import java.util.concurrent.TimeUnit;
import sk.j;

/* compiled from: CacheControl.kt */
public final class CacheControl {

    /* renamed from: n  reason: collision with root package name */
    public static final Companion f21908n = new Companion(0);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f21909a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f21910b;

    /* renamed from: c  reason: collision with root package name */
    public final int f21911c;

    /* renamed from: d  reason: collision with root package name */
    public final int f21912d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f21913e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f21914f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f21915g;

    /* renamed from: h  reason: collision with root package name */
    public final int f21916h;

    /* renamed from: i  reason: collision with root package name */
    public final int f21917i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f21918j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f21919k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f21920l;

    /* renamed from: m  reason: collision with root package name */
    public String f21921m;

    /* compiled from: CacheControl.kt */
    public static final class Builder {
    }

    /* compiled from: CacheControl.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i10) {
            this();
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x004a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static okhttp3.CacheControl a(okhttp3.Headers r27) {
            /*
                r0 = r27
                java.lang.String r1 = "headers"
                sk.j.f(r0, r1)
                java.lang.String[] r1 = r0.f22003a
                int r1 = r1.length
                r2 = 2
                int r1 = r1 / r2
                r6 = 0
                r7 = r6
                r11 = r7
                r12 = r11
                r15 = r12
                r16 = r15
                r17 = r16
                r20 = r17
                r21 = r20
                r22 = r21
                r8 = 1
                r9 = 0
                r13 = -1
                r14 = -1
                r18 = -1
                r19 = -1
            L_0x0023:
                if (r7 >= r1) goto L_0x01dc
                java.lang.String r10 = r0.i(r7)
                java.lang.String r3 = r0.m(r7)
                java.lang.String r4 = "Cache-Control"
                boolean r4 = yk.h.G0(r10, r4)
                if (r4 == 0) goto L_0x003a
                if (r9 == 0) goto L_0x0038
                goto L_0x0042
            L_0x0038:
                r9 = r3
                goto L_0x0043
            L_0x003a:
                java.lang.String r4 = "Pragma"
                boolean r4 = yk.h.G0(r10, r4)
                if (r4 == 0) goto L_0x01cd
            L_0x0042:
                r8 = r6
            L_0x0043:
                r4 = r6
            L_0x0044:
                int r10 = r3.length()
                if (r4 >= r10) goto L_0x01c4
                int r10 = r3.length()
                r5 = r4
            L_0x004f:
                if (r5 >= r10) goto L_0x006c
                char r0 = r3.charAt(r5)
                r24 = r1
                java.lang.String r1 = "=,;"
                int r0 = yk.l.R0(r1, r0, r6, r6, r2)
                if (r0 < 0) goto L_0x0061
                r0 = 1
                goto L_0x0062
            L_0x0061:
                r0 = r6
            L_0x0062:
                if (r0 == 0) goto L_0x0065
                goto L_0x0072
            L_0x0065:
                int r5 = r5 + 1
                r0 = r27
                r1 = r24
                goto L_0x004f
            L_0x006c:
                r24 = r1
                int r5 = r3.length()
            L_0x0072:
                java.lang.String r0 = r3.substring(r4, r5)
                java.lang.String r1 = "this as java.lang.String…ing(startIndex, endIndex)"
                sk.j.e(r0, r1)
                java.lang.CharSequence r0 = yk.l.k1(r0)
                java.lang.String r0 = r0.toString()
                int r4 = r3.length()
                if (r5 == r4) goto L_0x011c
                char r4 = r3.charAt(r5)
                r10 = 44
                if (r4 == r10) goto L_0x011c
                char r4 = r3.charAt(r5)
                r10 = 59
                if (r4 != r10) goto L_0x009b
                goto L_0x011c
            L_0x009b:
                int r5 = r5 + 1
                byte[] r4 = okhttp3.internal.Util.f22171a
                int r4 = r3.length()
            L_0x00a3:
                if (r5 >= r4) goto L_0x00b6
                char r10 = r3.charAt(r5)
                r2 = 32
                if (r10 == r2) goto L_0x00b2
                r2 = 9
                if (r10 == r2) goto L_0x00b2
                goto L_0x00ba
            L_0x00b2:
                int r5 = r5 + 1
                r2 = 2
                goto L_0x00a3
            L_0x00b6:
                int r5 = r3.length()
            L_0x00ba:
                int r2 = r3.length()
                if (r5 >= r2) goto L_0x00de
                char r2 = r3.charAt(r5)
                r4 = 34
                if (r2 != r4) goto L_0x00de
                int r5 = r5 + 1
                r2 = 4
                int r2 = yk.l.R0(r3, r4, r5, r6, r2)
                java.lang.String r4 = r3.substring(r5, r2)
                sk.j.e(r4, r1)
                r10 = 1
                int r2 = r2 + r10
                r1 = r4
                r26 = r9
                r9 = 2
                r4 = r2
                goto L_0x0123
            L_0x00de:
                r10 = 1
                int r2 = r3.length()
                r4 = r5
            L_0x00e4:
                if (r4 >= r2) goto L_0x0105
                char r10 = r3.charAt(r4)
                r25 = r2
                java.lang.String r2 = ",;"
                r26 = r9
                r9 = 2
                int r2 = yk.l.R0(r2, r10, r6, r6, r9)
                if (r2 < 0) goto L_0x00f9
                r2 = 1
                goto L_0x00fa
            L_0x00f9:
                r2 = r6
            L_0x00fa:
                if (r2 == 0) goto L_0x00fd
                goto L_0x010c
            L_0x00fd:
                int r4 = r4 + 1
                r2 = r25
                r9 = r26
                r10 = 1
                goto L_0x00e4
            L_0x0105:
                r26 = r9
                r9 = 2
                int r4 = r3.length()
            L_0x010c:
                java.lang.String r2 = r3.substring(r5, r4)
                sk.j.e(r2, r1)
                java.lang.CharSequence r1 = yk.l.k1(r2)
                java.lang.String r1 = r1.toString()
                goto L_0x0123
            L_0x011c:
                r26 = r9
                r9 = r2
                int r5 = r5 + 1
                r4 = r5
                r1 = 0
            L_0x0123:
                java.lang.String r2 = "no-cache"
                boolean r2 = yk.h.G0(r2, r0)
                if (r2 == 0) goto L_0x012f
                r2 = -1
                r11 = 1
                goto L_0x01bb
            L_0x012f:
                java.lang.String r2 = "no-store"
                boolean r2 = yk.h.G0(r2, r0)
                if (r2 == 0) goto L_0x013b
                r2 = -1
                r12 = 1
                goto L_0x01bb
            L_0x013b:
                java.lang.String r2 = "max-age"
                boolean r2 = yk.h.G0(r2, r0)
                if (r2 == 0) goto L_0x014a
                r2 = -1
                int r13 = okhttp3.internal.Util.y(r2, r1)
                goto L_0x01bb
            L_0x014a:
                r2 = -1
                java.lang.String r5 = "s-maxage"
                boolean r5 = yk.h.G0(r5, r0)
                if (r5 == 0) goto L_0x0158
                int r14 = okhttp3.internal.Util.y(r2, r1)
                goto L_0x01bb
            L_0x0158:
                java.lang.String r2 = "private"
                boolean r2 = yk.h.G0(r2, r0)
                if (r2 == 0) goto L_0x0163
                r2 = -1
                r15 = 1
                goto L_0x01bb
            L_0x0163:
                java.lang.String r2 = "public"
                boolean r2 = yk.h.G0(r2, r0)
                if (r2 == 0) goto L_0x016f
                r2 = -1
                r16 = 1
                goto L_0x01bb
            L_0x016f:
                java.lang.String r2 = "must-revalidate"
                boolean r2 = yk.h.G0(r2, r0)
                if (r2 == 0) goto L_0x017b
                r2 = -1
                r17 = 1
                goto L_0x01bb
            L_0x017b:
                java.lang.String r2 = "max-stale"
                boolean r2 = yk.h.G0(r2, r0)
                if (r2 == 0) goto L_0x018c
                r0 = 2147483647(0x7fffffff, float:NaN)
                int r18 = okhttp3.internal.Util.y(r0, r1)
                r2 = -1
                goto L_0x01bb
            L_0x018c:
                java.lang.String r2 = "min-fresh"
                boolean r2 = yk.h.G0(r2, r0)
                if (r2 == 0) goto L_0x019a
                r2 = -1
                int r19 = okhttp3.internal.Util.y(r2, r1)
                goto L_0x01bb
            L_0x019a:
                r2 = -1
                java.lang.String r1 = "only-if-cached"
                boolean r1 = yk.h.G0(r1, r0)
                if (r1 == 0) goto L_0x01a6
                r20 = 1
                goto L_0x01bb
            L_0x01a6:
                java.lang.String r1 = "no-transform"
                boolean r1 = yk.h.G0(r1, r0)
                if (r1 == 0) goto L_0x01b1
                r21 = 1
                goto L_0x01bb
            L_0x01b1:
                java.lang.String r1 = "immutable"
                boolean r0 = yk.h.G0(r1, r0)
                if (r0 == 0) goto L_0x01bb
                r22 = 1
            L_0x01bb:
                r0 = r27
                r2 = r9
                r1 = r24
                r9 = r26
                goto L_0x0044
            L_0x01c4:
                r24 = r1
                r26 = r9
                r9 = r2
                r2 = -1
                r3 = r26
                goto L_0x01d2
            L_0x01cd:
                r24 = r1
                r3 = r9
                r9 = r2
                r2 = -1
            L_0x01d2:
                int r7 = r7 + 1
                r0 = r27
                r2 = r9
                r1 = r24
                r9 = r3
                goto L_0x0023
            L_0x01dc:
                r3 = r9
                if (r8 != 0) goto L_0x01e2
                r23 = 0
                goto L_0x01e4
            L_0x01e2:
                r23 = r3
            L_0x01e4:
                okhttp3.CacheControl r0 = new okhttp3.CacheControl
                r10 = r0
                r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.CacheControl.Companion.a(okhttp3.Headers):okhttp3.CacheControl");
        }
    }

    static {
        new Builder();
        new Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        j.f(timeUnit, "timeUnit");
        timeUnit.toSeconds((long) Integer.MAX_VALUE);
    }

    public CacheControl(boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, int i12, int i13, boolean z15, boolean z16, boolean z17, String str) {
        this.f21909a = z10;
        this.f21910b = z11;
        this.f21911c = i10;
        this.f21912d = i11;
        this.f21913e = z12;
        this.f21914f = z13;
        this.f21915g = z14;
        this.f21916h = i12;
        this.f21917i = i13;
        this.f21918j = z15;
        this.f21919k = z16;
        this.f21920l = z17;
        this.f21921m = str;
    }

    public final String toString() {
        boolean z10;
        String str = this.f21921m;
        if (str != null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f21909a) {
            sb2.append("no-cache, ");
        }
        if (this.f21910b) {
            sb2.append("no-store, ");
        }
        if (this.f21911c != -1) {
            sb2.append("max-age=");
            sb2.append(this.f21911c);
            sb2.append(", ");
        }
        if (this.f21912d != -1) {
            sb2.append("s-maxage=");
            sb2.append(this.f21912d);
            sb2.append(", ");
        }
        if (this.f21913e) {
            sb2.append("private, ");
        }
        if (this.f21914f) {
            sb2.append("public, ");
        }
        if (this.f21915g) {
            sb2.append("must-revalidate, ");
        }
        if (this.f21916h != -1) {
            sb2.append("max-stale=");
            sb2.append(this.f21916h);
            sb2.append(", ");
        }
        if (this.f21917i != -1) {
            sb2.append("min-fresh=");
            sb2.append(this.f21917i);
            sb2.append(", ");
        }
        if (this.f21918j) {
            sb2.append("only-if-cached, ");
        }
        if (this.f21919k) {
            sb2.append("no-transform, ");
        }
        if (this.f21920l) {
            sb2.append("immutable, ");
        }
        if (sb2.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return "";
        }
        sb2.delete(sb2.length() - 2, sb2.length());
        String sb3 = sb2.toString();
        j.e(sb3, "StringBuilder().apply(builderAction).toString()");
        this.f21921m = sb3;
        return sb3;
    }
}
