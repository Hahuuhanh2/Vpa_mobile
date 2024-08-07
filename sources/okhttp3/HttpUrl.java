package okhttp3;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import ll.f;
import okhttp3.internal.Util;
import p3.l0;
import sk.j;
import yk.l;

/* compiled from: HttpUrl.kt */
public final class HttpUrl {

    /* renamed from: k  reason: collision with root package name */
    public static final Companion f22005k = new Companion(0);

    /* renamed from: l  reason: collision with root package name */
    public static final char[] f22006l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a  reason: collision with root package name */
    public final String f22007a;

    /* renamed from: b  reason: collision with root package name */
    public final String f22008b;

    /* renamed from: c  reason: collision with root package name */
    public final String f22009c;

    /* renamed from: d  reason: collision with root package name */
    public final String f22010d;

    /* renamed from: e  reason: collision with root package name */
    public final int f22011e;

    /* renamed from: f  reason: collision with root package name */
    public final List<String> f22012f;

    /* renamed from: g  reason: collision with root package name */
    public final List<String> f22013g;

    /* renamed from: h  reason: collision with root package name */
    public final String f22014h;

    /* renamed from: i  reason: collision with root package name */
    public final String f22015i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f22016j;

    /* compiled from: HttpUrl.kt */
    public static final class Builder {

        /* renamed from: i  reason: collision with root package name */
        public static final Companion f22017i = new Companion(0);

        /* renamed from: a  reason: collision with root package name */
        public String f22018a;

        /* renamed from: b  reason: collision with root package name */
        public String f22019b = "";

        /* renamed from: c  reason: collision with root package name */
        public String f22020c = "";

        /* renamed from: d  reason: collision with root package name */
        public String f22021d;

        /* renamed from: e  reason: collision with root package name */
        public int f22022e = -1;

        /* renamed from: f  reason: collision with root package name */
        public final ArrayList f22023f;

        /* renamed from: g  reason: collision with root package name */
        public ArrayList f22024g;

        /* renamed from: h  reason: collision with root package name */
        public String f22025h;

        /* compiled from: HttpUrl.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(int i10) {
                this();
            }
        }

        public Builder() {
            ArrayList arrayList = new ArrayList();
            this.f22023f = arrayList;
            arrayList.add("");
        }

        public final HttpUrl a() {
            int i10;
            ArrayList arrayList;
            String str;
            String str2;
            String str3 = this.f22018a;
            if (str3 != null) {
                Companion companion = HttpUrl.f22005k;
                Companion companion2 = companion;
                String e10 = Companion.e(companion2, this.f22019b, 0, 0, false, 7);
                String e11 = Companion.e(companion2, this.f22020c, 0, 0, false, 7);
                String str4 = this.f22021d;
                if (str4 != null) {
                    int i11 = this.f22022e;
                    if (i11 != -1) {
                        i10 = i11;
                    } else {
                        String str5 = this.f22018a;
                        j.c(str5);
                        companion.getClass();
                        i10 = Companion.b(str5);
                    }
                    ArrayList arrayList2 = this.f22023f;
                    ArrayList arrayList3 = new ArrayList(fk.j.H0(arrayList2));
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(Companion.e(HttpUrl.f22005k, (String) it.next(), 0, 0, false, 7));
                    }
                    ArrayList<String> arrayList4 = this.f22024g;
                    if (arrayList4 != null) {
                        arrayList = new ArrayList(fk.j.H0(arrayList4));
                        for (String str6 : arrayList4) {
                            if (str6 != null) {
                                str2 = Companion.e(HttpUrl.f22005k, str6, 0, 0, true, 3);
                            } else {
                                str2 = null;
                            }
                            arrayList.add(str2);
                        }
                    } else {
                        arrayList = null;
                    }
                    String str7 = this.f22025h;
                    if (str7 != null) {
                        str = Companion.e(HttpUrl.f22005k, str7, 0, 0, false, 7);
                    } else {
                        str = null;
                    }
                    return new HttpUrl(str3, e10, e11, str4, i10, arrayList3, arrayList, str, toString());
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        public final void b(String str) {
            ArrayList arrayList;
            if (str != null) {
                arrayList = Companion.f(Companion.a(HttpUrl.f22005k, str, 0, 0, " \"'<>#", true, false, true, false, (Charset) null, 211));
            } else {
                arrayList = null;
            }
            this.f22024g = arrayList;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:127:0x029c, code lost:
            if (r2 != 0) goto L_0x02a6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x009d, code lost:
            if (r10 == ':') goto L_0x00a4;
         */
        /* JADX WARNING: Removed duplicated region for block: B:103:0x0229  */
        /* JADX WARNING: Removed duplicated region for block: B:119:0x0253  */
        /* JADX WARNING: Removed duplicated region for block: B:138:0x02d8  */
        /* JADX WARNING: Removed duplicated region for block: B:141:0x02ff  */
        /* JADX WARNING: Removed duplicated region for block: B:142:0x0301  */
        /* JADX WARNING: Removed duplicated region for block: B:144:0x0304  */
        /* JADX WARNING: Removed duplicated region for block: B:209:0x045f  */
        /* JADX WARNING: Removed duplicated region for block: B:232:0x024a A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x00a8  */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x00e5  */
        /* JADX WARNING: Removed duplicated region for block: B:81:0x015e  */
        /* JADX WARNING: Removed duplicated region for block: B:82:0x0163  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void c(okhttp3.HttpUrl r26, java.lang.String r27) {
            /*
                r25 = this;
                r0 = r25
                r1 = r26
                r12 = r27
                java.lang.String r2 = "input"
                sk.j.f(r12, r2)
                byte[] r2 = okhttp3.internal.Util.f22171a
                int r2 = r27.length()
                r3 = 0
                int r2 = okhttp3.internal.Util.m(r3, r2, r12)
                int r4 = r27.length()
                int r13 = okhttp3.internal.Util.n(r2, r4, r12)
                okhttp3.HttpUrl$Builder$Companion r4 = f22017i
                r4.getClass()
                int r4 = r13 - r2
                r5 = 91
                r14 = 58
                r6 = -1
                r7 = 1
                r8 = 2
                if (r4 >= r8) goto L_0x0030
                goto L_0x00a3
            L_0x0030:
                char r4 = r12.charAt(r2)
                r9 = 97
                int r10 = sk.j.h(r4, r9)
                r11 = 65
                if (r10 < 0) goto L_0x0046
                r10 = 122(0x7a, float:1.71E-43)
                int r10 = sk.j.h(r4, r10)
                if (r10 <= 0) goto L_0x0056
            L_0x0046:
                int r10 = sk.j.h(r4, r11)
                if (r10 < 0) goto L_0x00a3
                r10 = 90
                int r4 = sk.j.h(r4, r10)
                if (r4 <= 0) goto L_0x0056
                goto L_0x00a3
            L_0x0056:
                int r4 = r2 + 1
            L_0x0058:
                if (r4 >= r13) goto L_0x00a3
                char r10 = r12.charAt(r4)
                if (r9 > r10) goto L_0x0066
                r15 = 123(0x7b, float:1.72E-43)
                if (r10 >= r15) goto L_0x0066
                r15 = r7
                goto L_0x0067
            L_0x0066:
                r15 = r3
            L_0x0067:
                if (r15 == 0) goto L_0x006a
                goto L_0x006e
            L_0x006a:
                if (r11 > r10) goto L_0x0070
                if (r10 >= r5) goto L_0x0070
            L_0x006e:
                r15 = r7
                goto L_0x0071
            L_0x0070:
                r15 = r3
            L_0x0071:
                if (r15 == 0) goto L_0x0074
                goto L_0x007a
            L_0x0074:
                r15 = 48
                if (r15 > r10) goto L_0x007c
                if (r10 >= r14) goto L_0x007c
            L_0x007a:
                r15 = r7
                goto L_0x007d
            L_0x007c:
                r15 = r3
            L_0x007d:
                if (r15 == 0) goto L_0x0080
                goto L_0x0084
            L_0x0080:
                r15 = 43
                if (r10 != r15) goto L_0x0086
            L_0x0084:
                r15 = r7
                goto L_0x0087
            L_0x0086:
                r15 = r3
            L_0x0087:
                if (r15 == 0) goto L_0x008a
                goto L_0x008e
            L_0x008a:
                r15 = 45
                if (r10 != r15) goto L_0x0090
            L_0x008e:
                r15 = r7
                goto L_0x0091
            L_0x0090:
                r15 = r3
            L_0x0091:
                if (r15 == 0) goto L_0x0094
                goto L_0x0098
            L_0x0094:
                r15 = 46
                if (r10 != r15) goto L_0x009a
            L_0x0098:
                r15 = r7
                goto L_0x009b
            L_0x009a:
                r15 = r3
            L_0x009b:
                if (r15 != 0) goto L_0x00a0
                if (r10 != r14) goto L_0x00a3
                goto L_0x00a4
            L_0x00a0:
                int r4 = r4 + 1
                goto L_0x0058
            L_0x00a3:
                r4 = r6
            L_0x00a4:
                java.lang.String r15 = "this as java.lang.String…ing(startIndex, endIndex)"
                if (r4 == r6) goto L_0x00e5
                java.lang.String r5 = "https:"
                boolean r5 = yk.h.K0(r2, r12, r5, r7)
                if (r5 == 0) goto L_0x00b7
                java.lang.String r4 = "https"
                r0.f22018a = r4
                int r2 = r2 + 6
                goto L_0x00eb
            L_0x00b7:
                java.lang.String r5 = "http:"
                boolean r5 = yk.h.K0(r2, r12, r5, r7)
                if (r5 == 0) goto L_0x00c6
                java.lang.String r4 = "http"
                r0.f22018a = r4
                int r2 = r2 + 5
                goto L_0x00eb
            L_0x00c6:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Expected URL scheme 'http' or 'https' but was '"
                java.lang.StringBuilder r2 = android.support.v4.media.a.q(r2)
                java.lang.String r3 = r12.substring(r3, r4)
                sk.j.e(r3, r15)
                r2.append(r3)
                r3 = 39
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L_0x00e5:
                if (r1 == 0) goto L_0x0484
                java.lang.String r4 = r1.f22007a
                r0.f22018a = r4
            L_0x00eb:
                okhttp3.HttpUrl$Builder$Companion r4 = f22017i
                r4.getClass()
                r4 = r2
            L_0x00f1:
                r5 = 92
                r7 = 47
                if (r4 >= r13) goto L_0x0104
                char r9 = r12.charAt(r4)
                if (r9 == r5) goto L_0x00ff
                if (r9 != r7) goto L_0x0104
            L_0x00ff:
                int r3 = r3 + 1
                int r4 = r4 + 1
                goto L_0x00f1
            L_0x0104:
                r4 = 63
                r9 = 35
                if (r3 >= r8) goto L_0x014e
                if (r1 == 0) goto L_0x014e
                java.lang.String r8 = r1.f22007a
                java.lang.String r10 = r0.f22018a
                boolean r8 = sk.j.a(r8, r10)
                if (r8 != 0) goto L_0x0117
                goto L_0x014e
            L_0x0117:
                java.lang.String r3 = r26.e()
                r0.f22019b = r3
                java.lang.String r3 = r26.a()
                r0.f22020c = r3
                java.lang.String r3 = r1.f22010d
                r0.f22021d = r3
                int r3 = r1.f22011e
                r0.f22022e = r3
                java.util.ArrayList r3 = r0.f22023f
                r3.clear()
                java.util.ArrayList r3 = r0.f22023f
                java.util.ArrayList r4 = r26.c()
                r3.addAll(r4)
                if (r2 == r13) goto L_0x0141
                char r3 = r12.charAt(r2)
                if (r3 != r9) goto L_0x0148
            L_0x0141:
                java.lang.String r1 = r26.d()
                r0.b(r1)
            L_0x0148:
                r1 = 1
                r14 = r1
                r20 = r13
                goto L_0x0305
            L_0x014e:
                int r2 = r2 + r3
                r1 = 0
                r3 = 0
                r16 = r1
                r11 = r2
                r17 = r3
            L_0x0156:
                java.lang.String r1 = "@/\\?#"
                int r10 = okhttp3.internal.Util.f(r12, r11, r13, r1)
                if (r10 == r13) goto L_0x0163
                char r1 = r12.charAt(r10)
                goto L_0x0164
            L_0x0163:
                r1 = r6
            L_0x0164:
                if (r1 == r6) goto L_0x021e
                if (r1 == r9) goto L_0x021e
                if (r1 == r7) goto L_0x021e
                if (r1 == r5) goto L_0x021e
                if (r1 == r4) goto L_0x021e
                r2 = 64
                if (r1 == r2) goto L_0x0173
                goto L_0x0156
            L_0x0173:
                java.lang.String r9 = "%40"
                if (r16 != 0) goto L_0x01db
                int r8 = okhttp3.internal.Util.e(r12, r14, r11, r10)
                okhttp3.HttpUrl$Companion r18 = okhttp3.HttpUrl.f22005k
                r6 = 1
                r7 = 0
                r19 = 0
                r20 = 0
                r21 = 0
                r22 = 240(0xf0, float:3.36E-43)
                java.lang.String r5 = " \"':;<=>@[]^`{}|/\\?#"
                r1 = r18
                r2 = r27
                r3 = r11
                r4 = r8
                r11 = r8
                r8 = r19
                r14 = r9
                r9 = r20
                r23 = r10
                r10 = r21
                r20 = r13
                r13 = r11
                r11 = r22
                java.lang.String r1 = okhttp3.HttpUrl.Companion.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                if (r17 == 0) goto L_0x01b8
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = r0.f22019b
                r2.append(r3)
                r2.append(r14)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
            L_0x01b8:
                r0.f22019b = r1
                r14 = r23
                if (r13 == r14) goto L_0x01d6
                int r3 = r13 + 1
                r6 = 1
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 240(0xf0, float:3.36E-43)
                java.lang.String r5 = " \"':;<=>@[]^`{}|/\\?#"
                r1 = r18
                r2 = r27
                r4 = r14
                java.lang.String r1 = okhttp3.HttpUrl.Companion.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                r0.f22020c = r1
                r16 = 1
            L_0x01d6:
                r1 = 1
                r17 = r1
                r13 = r14
                goto L_0x020d
            L_0x01db:
                r14 = r9
                r20 = r13
                r13 = r10
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r1 = r0.f22020c
                r10.append(r1)
                r10.append(r14)
                okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.f22005k
                r6 = 1
                r7 = 0
                r8 = 0
                r9 = 0
                r14 = 0
                r18 = 240(0xf0, float:3.36E-43)
                java.lang.String r5 = " \"':;<=>@[]^`{}|/\\?#"
                r2 = r27
                r3 = r11
                r4 = r13
                r11 = r10
                r10 = r14
                r14 = r11
                r11 = r18
                java.lang.String r1 = okhttp3.HttpUrl.Companion.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                r14.append(r1)
                java.lang.String r1 = r14.toString()
                r0.f22020c = r1
            L_0x020d:
                int r11 = r13 + 1
                r9 = 35
                r7 = 47
                r5 = 92
                r4 = 63
                r6 = -1
                r13 = r20
                r14 = 58
                goto L_0x0156
            L_0x021e:
                r20 = r13
                r13 = r10
                okhttp3.HttpUrl$Builder$Companion r1 = f22017i
                r1.getClass()
                r10 = r11
            L_0x0227:
                if (r10 >= r13) goto L_0x024a
                char r1 = r12.charAt(r10)
                r2 = 91
                if (r1 != r2) goto L_0x0240
                r1 = 1
            L_0x0232:
                int r10 = r10 + r1
                if (r10 >= r13) goto L_0x023d
                char r2 = r12.charAt(r10)
                r3 = 93
                if (r2 != r3) goto L_0x0232
            L_0x023d:
                r3 = 58
                goto L_0x0248
            L_0x0240:
                r2 = 1
                r3 = 58
                if (r1 != r3) goto L_0x0247
                r14 = r2
                goto L_0x024d
            L_0x0247:
                r1 = r2
            L_0x0248:
                int r10 = r10 + r1
                goto L_0x0227
            L_0x024a:
                r1 = 1
                r14 = r1
                r10 = r13
            L_0x024d:
                int r9 = r10 + 1
                r7 = 34
                if (r9 >= r13) goto L_0x02d8
                okhttp3.HttpUrl$Companion r7 = okhttp3.HttpUrl.f22005k
                r5 = 0
                r6 = 4
                r1 = r7
                r2 = r27
                r3 = r11
                r4 = r10
                java.lang.String r1 = okhttp3.HttpUrl.Companion.e(r1, r2, r3, r4, r5, r6)
                java.lang.String r1 = okhttp3.internal.HostnamesKt.b(r1)
                r0.f22021d = r1
                okhttp3.HttpUrl$Builder$Companion r1 = f22017i
                r1.getClass()
                java.lang.String r5 = ""
                r6 = 0
                r8 = 0
                r16 = 0
                r17 = 0
                r18 = 0
                r19 = 248(0xf8, float:3.48E-43)
                r1 = r7
                r2 = r27
                r3 = r9
                r4 = r13
                r7 = r8
                r8 = r16
                r24 = r9
                r9 = r17
                r26 = r10
                r10 = r18
                r16 = r11
                r11 = r19
                java.lang.String r1 = okhttp3.HttpUrl.Companion.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ NumberFormatException -> 0x02a5 }
                int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x02a5 }
                if (r14 > r1) goto L_0x029b
                r2 = 65536(0x10000, float:9.18355E-41)
                if (r1 >= r2) goto L_0x029b
                r2 = r14
                goto L_0x029c
            L_0x029b:
                r2 = 0
            L_0x029c:
                if (r2 == 0) goto L_0x02a5
                goto L_0x02a6
            L_0x029f:
                r24 = r9
                r26 = r10
                r16 = r11
            L_0x02a5:
                r1 = -1
            L_0x02a6:
                r0.f22022e = r1
                r2 = -1
                if (r1 == r2) goto L_0x02ad
                r1 = r14
                goto L_0x02ae
            L_0x02ad:
                r1 = 0
            L_0x02ae:
                if (r1 == 0) goto L_0x02b3
                r7 = 34
                goto L_0x02fb
            L_0x02b3:
                java.lang.String r1 = "Invalid URL port: \""
                java.lang.StringBuilder r1 = android.support.v4.media.a.q(r1)
                r10 = r24
                java.lang.String r2 = r12.substring(r10, r13)
                sk.j.e(r2, r15)
                r1.append(r2)
                r2 = 34
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r1.toString()
                r2.<init>(r1)
                throw r2
            L_0x02d8:
                r26 = r10
                r16 = r11
                okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.f22005k
                r5 = 0
                r6 = 4
                r2 = r27
                r3 = r16
                r4 = r26
                java.lang.String r1 = okhttp3.HttpUrl.Companion.e(r1, r2, r3, r4, r5, r6)
                java.lang.String r1 = okhttp3.internal.HostnamesKt.b(r1)
                r0.f22021d = r1
                java.lang.String r1 = r0.f22018a
                sk.j.c(r1)
                int r1 = okhttp3.HttpUrl.Companion.b(r1)
                r0.f22022e = r1
            L_0x02fb:
                java.lang.String r1 = r0.f22021d
                if (r1 == 0) goto L_0x0301
                r1 = r14
                goto L_0x0302
            L_0x0301:
                r1 = 0
            L_0x0302:
                if (r1 == 0) goto L_0x045f
                r2 = r13
            L_0x0305:
                java.lang.String r1 = "?#"
                r13 = r20
                int r15 = okhttp3.internal.Util.f(r12, r2, r13, r1)
                if (r2 != r15) goto L_0x0311
                goto L_0x040e
            L_0x0311:
                char r1 = r12.charAt(r2)
                java.lang.String r11 = ""
                r3 = 47
                if (r1 == r3) goto L_0x032b
                r3 = 92
                if (r1 != r3) goto L_0x0320
                goto L_0x032b
            L_0x0320:
                java.util.ArrayList r1 = r0.f22023f
                int r3 = r1.size()
                int r3 = r3 - r14
                r1.set(r3, r11)
                goto L_0x0337
            L_0x032b:
                java.util.ArrayList r1 = r0.f22023f
                r1.clear()
                java.util.ArrayList r1 = r0.f22023f
                r1.add(r11)
                int r2 = r2 + 1
            L_0x0337:
                r3 = r2
            L_0x0338:
                if (r3 >= r15) goto L_0x040e
                java.lang.String r1 = "/\\"
                int r10 = okhttp3.internal.Util.f(r12, r3, r15, r1)
                if (r10 >= r15) goto L_0x0345
                r16 = r14
                goto L_0x0348
            L_0x0345:
                r1 = 0
                r16 = r1
            L_0x0348:
                r6 = 1
                okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.f22005k
                r7 = 0
                r8 = 0
                r9 = 0
                r17 = 0
                r18 = 240(0xf0, float:3.36E-43)
                java.lang.String r5 = " \"<>^`{}|/\\?#"
                r2 = r27
                r4 = r10
                r19 = r10
                r10 = r17
                r12 = r11
                r11 = r18
                java.lang.String r1 = okhttp3.HttpUrl.Companion.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                java.lang.String r2 = "."
                boolean r2 = sk.j.a(r1, r2)
                if (r2 != 0) goto L_0x0375
                java.lang.String r2 = "%2e"
                boolean r2 = yk.h.G0(r1, r2)
                if (r2 == 0) goto L_0x0373
                goto L_0x0375
            L_0x0373:
                r2 = 0
                goto L_0x0376
            L_0x0375:
                r2 = r14
            L_0x0376:
                if (r2 == 0) goto L_0x037a
                goto L_0x0401
            L_0x037a:
                java.lang.String r2 = ".."
                boolean r2 = sk.j.a(r1, r2)
                if (r2 != 0) goto L_0x039d
                java.lang.String r2 = "%2e."
                boolean r2 = yk.h.G0(r1, r2)
                if (r2 != 0) goto L_0x039d
                java.lang.String r2 = ".%2e"
                boolean r2 = yk.h.G0(r1, r2)
                if (r2 != 0) goto L_0x039d
                java.lang.String r2 = "%2e%2e"
                boolean r2 = yk.h.G0(r1, r2)
                if (r2 == 0) goto L_0x039b
                goto L_0x039d
            L_0x039b:
                r2 = 0
                goto L_0x039e
            L_0x039d:
                r2 = r14
            L_0x039e:
                if (r2 == 0) goto L_0x03d2
                java.util.ArrayList r1 = r0.f22023f
                int r2 = r1.size()
                int r2 = r2 - r14
                java.lang.Object r1 = r1.remove(r2)
                java.lang.String r1 = (java.lang.String) r1
                int r1 = r1.length()
                if (r1 != 0) goto L_0x03b5
                r1 = r14
                goto L_0x03b6
            L_0x03b5:
                r1 = 0
            L_0x03b6:
                if (r1 == 0) goto L_0x03cc
                java.util.ArrayList r1 = r0.f22023f
                boolean r1 = r1.isEmpty()
                r1 = r1 ^ r14
                if (r1 == 0) goto L_0x03cc
                java.util.ArrayList r1 = r0.f22023f
                int r2 = r1.size()
                int r2 = r2 - r14
                r1.set(r2, r12)
                goto L_0x0401
            L_0x03cc:
                java.util.ArrayList r1 = r0.f22023f
                r1.add(r12)
                goto L_0x0401
            L_0x03d2:
                java.util.ArrayList r2 = r0.f22023f
                int r3 = r2.size()
                int r3 = r3 - r14
                java.lang.Object r2 = r2.get(r3)
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                int r2 = r2.length()
                if (r2 != 0) goto L_0x03e7
                r2 = r14
                goto L_0x03e8
            L_0x03e7:
                r2 = 0
            L_0x03e8:
                if (r2 == 0) goto L_0x03f5
                java.util.ArrayList r2 = r0.f22023f
                int r3 = r2.size()
                int r3 = r3 - r14
                r2.set(r3, r1)
                goto L_0x03fa
            L_0x03f5:
                java.util.ArrayList r2 = r0.f22023f
                r2.add(r1)
            L_0x03fa:
                if (r16 == 0) goto L_0x0401
                java.util.ArrayList r1 = r0.f22023f
                r1.add(r12)
            L_0x0401:
                if (r16 == 0) goto L_0x0407
                int r10 = r19 + 1
                r3 = r10
                goto L_0x0409
            L_0x0407:
                r3 = r19
            L_0x0409:
                r11 = r12
                r12 = r27
                goto L_0x0338
            L_0x040e:
                r12 = r27
                if (r15 >= r13) goto L_0x043e
                char r1 = r12.charAt(r15)
                r2 = 63
                if (r1 != r2) goto L_0x043e
                r14 = 35
                int r16 = okhttp3.internal.Util.e(r12, r14, r15, r13)
                okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.f22005k
                int r3 = r15 + 1
                r6 = 1
                r7 = 0
                r8 = 1
                r9 = 0
                r10 = 0
                r11 = 208(0xd0, float:2.91E-43)
                java.lang.String r5 = " \"'<>#"
                r2 = r27
                r4 = r16
                java.lang.String r1 = okhttp3.HttpUrl.Companion.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                java.util.ArrayList r1 = okhttp3.HttpUrl.Companion.f(r1)
                r0.f22024g = r1
                r15 = r16
                goto L_0x0440
            L_0x043e:
                r14 = 35
            L_0x0440:
                if (r15 >= r13) goto L_0x045e
                char r1 = r12.charAt(r15)
                if (r1 != r14) goto L_0x045e
                okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.f22005k
                int r3 = r15 + 1
                r6 = 1
                r7 = 0
                r8 = 0
                r9 = 1
                r10 = 0
                r11 = 176(0xb0, float:2.47E-43)
                java.lang.String r5 = ""
                r2 = r27
                r4 = r13
                java.lang.String r1 = okhttp3.HttpUrl.Companion.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                r0.f22025h = r1
            L_0x045e:
                return
            L_0x045f:
                java.lang.String r1 = "Invalid URL host: \""
                java.lang.StringBuilder r1 = android.support.v4.media.a.q(r1)
                r13 = r26
                r11 = r16
                java.lang.String r2 = r12.substring(r11, r13)
                sk.j.e(r2, r15)
                r1.append(r2)
                r1.append(r7)
                java.lang.String r1 = r1.toString()
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r1.toString()
                r2.<init>(r1)
                throw r2
            L_0x0484:
                int r1 = r27.length()
                r2 = 6
                if (r1 <= r2) goto L_0x04a1
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = yk.m.l1(r2, r12)
                r1.append(r2)
                java.lang.String r2 = "..."
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                goto L_0x04a2
            L_0x04a1:
                r1 = r12
            L_0x04a2:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r3 = "Expected URL scheme 'http' or 'https' but no scheme was found for "
                java.lang.String r1 = f0.b0.r(r3, r1)
                r2.<init>(r1)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Builder.c(okhttp3.HttpUrl, java.lang.String):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
            if (r1 != false) goto L_0x0035;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x009f, code lost:
            if (r1 != okhttp3.HttpUrl.Companion.b(r3)) goto L_0x00a1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String toString() {
            /*
                r6 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r6.f22018a
                if (r1 == 0) goto L_0x0012
                r0.append(r1)
                java.lang.String r1 = "://"
                r0.append(r1)
                goto L_0x0017
            L_0x0012:
                java.lang.String r1 = "//"
                r0.append(r1)
            L_0x0017:
                java.lang.String r1 = r6.f22019b
                int r1 = r1.length()
                r2 = 0
                r3 = 1
                if (r1 <= 0) goto L_0x0023
                r1 = r3
                goto L_0x0024
            L_0x0023:
                r1 = r2
            L_0x0024:
                r4 = 58
                if (r1 != 0) goto L_0x0035
                java.lang.String r1 = r6.f22020c
                int r1 = r1.length()
                if (r1 <= 0) goto L_0x0032
                r1 = r3
                goto L_0x0033
            L_0x0032:
                r1 = r2
            L_0x0033:
                if (r1 == 0) goto L_0x0054
            L_0x0035:
                java.lang.String r1 = r6.f22019b
                r0.append(r1)
                java.lang.String r1 = r6.f22020c
                int r1 = r1.length()
                if (r1 <= 0) goto L_0x0044
                r1 = r3
                goto L_0x0045
            L_0x0044:
                r1 = r2
            L_0x0045:
                if (r1 == 0) goto L_0x004f
                r0.append(r4)
                java.lang.String r1 = r6.f22020c
                r0.append(r1)
            L_0x004f:
                r1 = 64
                r0.append(r1)
            L_0x0054:
                java.lang.String r1 = r6.f22021d
                if (r1 == 0) goto L_0x0078
                r5 = 2
                int r1 = yk.l.R0(r1, r4, r2, r2, r5)
                if (r1 < 0) goto L_0x0060
                goto L_0x0061
            L_0x0060:
                r3 = r2
            L_0x0061:
                if (r3 == 0) goto L_0x0073
                r1 = 91
                r0.append(r1)
                java.lang.String r1 = r6.f22021d
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                goto L_0x0078
            L_0x0073:
                java.lang.String r1 = r6.f22021d
                r0.append(r1)
            L_0x0078:
                int r1 = r6.f22022e
                r3 = -1
                if (r1 != r3) goto L_0x0081
                java.lang.String r5 = r6.f22018a
                if (r5 == 0) goto L_0x00a7
            L_0x0081:
                if (r1 == r3) goto L_0x0084
                goto L_0x0092
            L_0x0084:
                okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.f22005k
                java.lang.String r3 = r6.f22018a
                sk.j.c(r3)
                r1.getClass()
                int r1 = okhttp3.HttpUrl.Companion.b(r3)
            L_0x0092:
                java.lang.String r3 = r6.f22018a
                if (r3 == 0) goto L_0x00a1
                okhttp3.HttpUrl$Companion r5 = okhttp3.HttpUrl.f22005k
                r5.getClass()
                int r3 = okhttp3.HttpUrl.Companion.b(r3)
                if (r1 == r3) goto L_0x00a7
            L_0x00a1:
                r0.append(r4)
                r0.append(r1)
            L_0x00a7:
                okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.f22005k
                java.util.ArrayList r3 = r6.f22023f
                r1.getClass()
                java.lang.String r1 = "<this>"
                sk.j.f(r3, r1)
                int r1 = r3.size()
            L_0x00b7:
                if (r2 >= r1) goto L_0x00ca
                r4 = 47
                r0.append(r4)
                java.lang.Object r4 = r3.get(r2)
                java.lang.String r4 = (java.lang.String) r4
                r0.append(r4)
                int r2 = r2 + 1
                goto L_0x00b7
            L_0x00ca:
                java.util.ArrayList r1 = r6.f22024g
                if (r1 == 0) goto L_0x00e0
                r1 = 63
                r0.append(r1)
                okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.f22005k
                java.util.ArrayList r2 = r6.f22024g
                sk.j.c(r2)
                r1.getClass()
                okhttp3.HttpUrl.Companion.g(r2, r0)
            L_0x00e0:
                java.lang.String r1 = r6.f22025h
                if (r1 == 0) goto L_0x00ee
                r1 = 35
                r0.append(r1)
                java.lang.String r1 = r6.f22025h
                r0.append(r1)
            L_0x00ee:
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
                sk.j.e(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Builder.toString():java.lang.String");
        }
    }

    /* compiled from: HttpUrl.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i10) {
            this();
        }

        public static String a(Companion companion, String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset, int i12) {
            boolean z14;
            String str3 = str;
            String str4 = str2;
            int i13 = i12;
            int i14 = (i13 & 1) != 0 ? 0 : i10;
            int length = (i13 & 2) != 0 ? str.length() : i11;
            boolean z15 = (i13 & 8) != 0 ? false : z10;
            boolean z16 = (i13 & 16) != 0 ? false : z11;
            boolean z17 = (i13 & 32) != 0 ? false : z12;
            boolean z18 = (i13 & 64) != 0 ? false : z13;
            int i15 = 128;
            Charset charset2 = (i13 & 128) != 0 ? null : charset;
            companion.getClass();
            j.f(str3, "<this>");
            int i16 = i14;
            while (i16 < length) {
                int codePointAt = str3.codePointAt(i16);
                int i17 = 32;
                int i18 = 2;
                if (codePointAt >= 32 && codePointAt != 127 && (codePointAt < i15 || z18)) {
                    if (!(l.R0(str4, (char) codePointAt, 0, false, 2) >= 0) && ((codePointAt != 37 || (z15 && (!z16 || d(i16, length, str3)))) && (codePointAt != 43 || !z17))) {
                        i16 += Character.charCount(codePointAt);
                        i15 = 128;
                    }
                }
                f fVar = new f();
                fVar.v0(i14, i16, str3);
                f fVar2 = null;
                while (i16 < length) {
                    int codePointAt2 = str3.codePointAt(i16);
                    if (!z15 || !(codePointAt2 == 9 || codePointAt2 == 10 || codePointAt2 == 12 || codePointAt2 == 13)) {
                        if (codePointAt2 != 43 || !z17) {
                            if (codePointAt2 < i17 || codePointAt2 == 127 || (codePointAt2 >= 128 && !z18)) {
                                z14 = false;
                            } else {
                                z14 = false;
                                if (!(l.R0(str4, (char) codePointAt2, 0, false, i18) >= 0) && (codePointAt2 != 37 || (z15 && (!z16 || d(i16, length, str3))))) {
                                    fVar.A0(codePointAt2);
                                    i16 += Character.charCount(codePointAt2);
                                    boolean z19 = z14;
                                    i18 = 2;
                                    i17 = 32;
                                }
                            }
                            if (fVar2 == null) {
                                fVar2 = new f();
                            }
                            if (charset2 == null || j.a(charset2, StandardCharsets.UTF_8)) {
                                fVar2.A0(codePointAt2);
                            } else {
                                fVar2.t0(str3, i16, Character.charCount(codePointAt2) + i16, charset2);
                            }
                            while (!fVar2.A()) {
                                byte readByte = fVar2.readByte() & 255;
                                fVar.g0(37);
                                char[] cArr = HttpUrl.f22006l;
                                fVar.g0(cArr[(readByte >> 4) & 15]);
                                fVar.g0(cArr[readByte & 15]);
                            }
                            i16 += Character.charCount(codePointAt2);
                            boolean z192 = z14;
                            i18 = 2;
                            i17 = 32;
                        } else {
                            fVar.w0(z15 ? "+" : "%2B");
                        }
                    }
                    z14 = false;
                    i16 += Character.charCount(codePointAt2);
                    boolean z1922 = z14;
                    i18 = 2;
                    i17 = 32;
                }
                return fVar.U();
            }
            String substring = str3.substring(i14, length);
            j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }

        public static int b(String str) {
            j.f(str, "scheme");
            if (j.a(str, "http")) {
                return 80;
            }
            if (j.a(str, "https")) {
                return 443;
            }
            return -1;
        }

        public static HttpUrl c(String str) {
            j.f(str, "<this>");
            Builder builder = new Builder();
            builder.c((HttpUrl) null, str);
            return builder.a();
        }

        public static boolean d(int i10, int i11, String str) {
            int i12 = i10 + 2;
            if (i12 >= i11 || str.charAt(i10) != '%' || Util.q(str.charAt(i10 + 1)) == -1 || Util.q(str.charAt(i12)) == -1) {
                return false;
            }
            return true;
        }

        public static String e(Companion companion, String str, int i10, int i11, boolean z10, int i12) {
            int i13;
            int i14;
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = str.length();
            }
            if ((i12 & 4) != 0) {
                z10 = false;
            }
            companion.getClass();
            j.f(str, "<this>");
            int i15 = i10;
            while (i13 < i11) {
                char charAt = str.charAt(i13);
                if (charAt == '%' || (charAt == '+' && z10)) {
                    f fVar = new f();
                    fVar.v0(i10, i13, str);
                    while (i13 < i11) {
                        int codePointAt = str.codePointAt(i13);
                        if (codePointAt == 37 && (i14 = i13 + 2) < i11) {
                            int q10 = Util.q(str.charAt(i13 + 1));
                            int q11 = Util.q(str.charAt(i14));
                            if (!(q10 == -1 || q11 == -1)) {
                                fVar.g0((q10 << 4) + q11);
                                i13 = Character.charCount(codePointAt) + i14;
                            }
                        } else if (codePointAt == 43 && z10) {
                            fVar.g0(32);
                            i13++;
                        }
                        fVar.A0(codePointAt);
                        i13 += Character.charCount(codePointAt);
                    }
                    return fVar.U();
                }
                i15 = i13 + 1;
            }
            String substring = str.substring(i10, i11);
            j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }

        public static ArrayList f(String str) {
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (i10 <= str.length()) {
                int R0 = l.R0(str, '&', i10, false, 4);
                if (R0 == -1) {
                    R0 = str.length();
                }
                int R02 = l.R0(str, '=', i10, false, 4);
                if (R02 == -1 || R02 > R0) {
                    String substring = str.substring(i10, R0);
                    j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(substring);
                    arrayList.add((Object) null);
                } else {
                    String substring2 = str.substring(i10, R02);
                    j.e(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(substring2);
                    String substring3 = str.substring(R02 + 1, R0);
                    j.e(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(substring3);
                }
                i10 = R0 + 1;
            }
            return arrayList;
        }

        public static void g(List list, StringBuilder sb2) {
            j.f(list, "<this>");
            vk.f K0 = l0.K0(l0.U0(0, list.size()), 2);
            int i10 = K0.f23335a;
            int i11 = K0.f23336b;
            int i12 = K0.f23337c;
            if ((i12 > 0 && i10 <= i11) || (i12 < 0 && i11 <= i10)) {
                while (true) {
                    String str = (String) list.get(i10);
                    String str2 = (String) list.get(i10 + 1);
                    if (i10 > 0) {
                        sb2.append('&');
                    }
                    sb2.append(str);
                    if (str2 != null) {
                        sb2.append('=');
                        sb2.append(str2);
                    }
                    if (i10 != i11) {
                        i10 += i12;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public HttpUrl(String str, String str2, String str3, String str4, int i10, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        this.f22007a = str;
        this.f22008b = str2;
        this.f22009c = str3;
        this.f22010d = str4;
        this.f22011e = i10;
        this.f22012f = arrayList;
        this.f22013g = arrayList2;
        this.f22014h = str5;
        this.f22015i = str6;
        this.f22016j = j.a(str, "https");
    }

    public final String a() {
        boolean z10;
        if (this.f22009c.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return "";
        }
        String substring = this.f22015i.substring(l.R0(this.f22015i, ':', this.f22007a.length() + 3, false, 4) + 1, l.R0(this.f22015i, '@', 0, false, 6));
        j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String b() {
        int R0 = l.R0(this.f22015i, '/', this.f22007a.length() + 3, false, 4);
        String str = this.f22015i;
        String substring = this.f22015i.substring(R0, Util.f(str, R0, str.length(), "?#"));
        j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final ArrayList c() {
        int R0 = l.R0(this.f22015i, '/', this.f22007a.length() + 3, false, 4);
        String str = this.f22015i;
        int f10 = Util.f(str, R0, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (R0 < f10) {
            int i10 = R0 + 1;
            int e10 = Util.e(this.f22015i, '/', i10, f10);
            String substring = this.f22015i.substring(i10, e10);
            j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(substring);
            R0 = e10;
        }
        return arrayList;
    }

    public final String d() {
        if (this.f22013g == null) {
            return null;
        }
        int R0 = l.R0(this.f22015i, '?', 0, false, 6) + 1;
        String str = this.f22015i;
        String substring = this.f22015i.substring(R0, Util.e(str, '#', R0, str.length()));
        j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String e() {
        boolean z10;
        if (this.f22008b.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return "";
        }
        int length = this.f22007a.length() + 3;
        String str = this.f22015i;
        String substring = this.f22015i.substring(length, Util.f(str, length, str.length(), ":@"));
        j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof HttpUrl) || !j.a(((HttpUrl) obj).f22015i, this.f22015i)) {
            return false;
        }
        return true;
    }

    public final Builder f() {
        int i10;
        String str;
        Builder builder = new Builder();
        builder.f22018a = this.f22007a;
        builder.f22019b = e();
        builder.f22020c = a();
        builder.f22021d = this.f22010d;
        int i11 = this.f22011e;
        Companion companion = f22005k;
        String str2 = this.f22007a;
        companion.getClass();
        if (i11 != Companion.b(str2)) {
            i10 = this.f22011e;
        } else {
            i10 = -1;
        }
        builder.f22022e = i10;
        builder.f22023f.clear();
        builder.f22023f.addAll(c());
        builder.b(d());
        if (this.f22014h == null) {
            str = null;
        } else {
            str = this.f22015i.substring(l.R0(this.f22015i, '#', 0, false, 6) + 1);
            j.e(str, "this as java.lang.String).substring(startIndex)");
        }
        builder.f22025h = str;
        return builder;
    }

    public final URI g() {
        String str;
        String str2;
        Builder f10 = f();
        String str3 = f10.f22021d;
        String str4 = null;
        if (str3 != null) {
            Pattern compile = Pattern.compile("[\"<>^`{|}]");
            j.e(compile, "compile(pattern)");
            str = compile.matcher(str3).replaceAll("");
            j.e(str, "nativePattern.matcher(in…).replaceAll(replacement)");
        } else {
            str = null;
        }
        f10.f22021d = str;
        int size = f10.f22023f.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList arrayList = f10.f22023f;
            arrayList.set(i10, Companion.a(f22005k, (String) arrayList.get(i10), 0, 0, "[]", true, true, false, false, (Charset) null, 227));
        }
        ArrayList arrayList2 = f10.f22024g;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                String str5 = (String) arrayList2.get(i11);
                if (str5 != null) {
                    str2 = Companion.a(f22005k, str5, 0, 0, "\\^`{|}", true, true, true, false, (Charset) null, 195);
                } else {
                    str2 = null;
                }
                arrayList2.set(i11, str2);
            }
        }
        String str6 = f10.f22025h;
        if (str6 != null) {
            str4 = Companion.a(f22005k, str6, 0, 0, " \"#<>\\^`{|}", true, true, false, true, (Charset) null, 163);
        }
        f10.f22025h = str4;
        String builder = f10.toString();
        try {
            return new URI(builder);
        } catch (URISyntaxException e10) {
            try {
                Pattern compile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                j.e(compile2, "compile(pattern)");
                String replaceAll = compile2.matcher(builder).replaceAll("");
                j.e(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
                URI create = URI.create(replaceAll);
                j.e(create, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final URL h() {
        try {
            return new URL(this.f22015i);
        } catch (MalformedURLException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final int hashCode() {
        return this.f22015i.hashCode();
    }

    public final String toString() {
        return this.f22015i;
    }
}
