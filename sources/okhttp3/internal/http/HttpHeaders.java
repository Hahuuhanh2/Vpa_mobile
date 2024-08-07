package okhttp3.internal.http;

import android.support.v4.media.a;
import fk.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import ll.f;
import ll.j;
import okhttp3.Challenge;
import okhttp3.Response;
import okhttp3.internal.Util;
import vk.g;
import yk.h;

/* compiled from: HttpHeaders.kt */
public final class HttpHeaders {

    /* renamed from: a  reason: collision with root package name */
    public static final j f22315a = j.a.b("\"\\");

    /* renamed from: b  reason: collision with root package name */
    public static final j f22316b = j.a.b("\t ,=");

    static {
        j jVar = j.f20882d;
    }

    public static final boolean a(Response response) {
        if (sk.j.a(response.f22124a.f22105b, "HEAD")) {
            return false;
        }
        int i10 = response.f22127d;
        if (((i10 >= 100 && i10 < 200) || i10 == 204 || i10 == 304) && Util.j(response) == -1 && !h.G0("chunked", Response.h(response, "Transfer-Encoding"))) {
            return false;
        }
        return true;
    }

    public static final void b(f fVar, ArrayList arrayList) {
        String c10;
        int t10;
        int i10;
        int i11;
        String str;
        boolean z10;
        String str2;
        f fVar2 = fVar;
        ArrayList arrayList2 = arrayList;
        while (true) {
            String str3 = null;
            while (true) {
                if (str3 == null) {
                    e(fVar);
                    str3 = c(fVar);
                    if (str3 == null) {
                        return;
                    }
                }
                boolean e10 = e(fVar);
                c10 = c(fVar);
                if (c10 != null) {
                    t10 = Util.t(fVar);
                    boolean e11 = e(fVar);
                    i10 = 0;
                    int i12 = 1;
                    if (e10 || (!e11 && !fVar.A())) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        int t11 = Util.t(fVar) + t10;
                        while (true) {
                            if (c10 == null) {
                                c10 = c(fVar);
                                if (e(fVar)) {
                                    continue;
                                    break;
                                }
                                t11 = Util.t(fVar);
                            }
                            if (t11 == 0) {
                                continue;
                                break;
                            } else if (t11 <= i12 && !e(fVar)) {
                                if (fVar.A() || fVar2.B(0) != 34) {
                                    i11 = i10;
                                } else {
                                    i11 = i12;
                                }
                                if (i11 != 0) {
                                    if (fVar.readByte() == 34) {
                                        i10 = i12;
                                    }
                                    if (i10 != 0) {
                                        f fVar3 = new f();
                                        while (true) {
                                            long T = fVar2.T(f22315a);
                                            if (T == -1) {
                                                break;
                                            } else if (fVar2.B(T) == 34) {
                                                fVar3.Q(fVar2, T);
                                                fVar.readByte();
                                                str = fVar3.U();
                                                break;
                                            } else if (fVar2.f20878b == T + 1) {
                                                break;
                                            } else {
                                                fVar3.Q(fVar2, T);
                                                fVar.readByte();
                                                fVar3.Q(fVar2, 1);
                                            }
                                        }
                                        str = null;
                                    } else {
                                        throw new IllegalArgumentException("Failed requirement.".toString());
                                    }
                                } else {
                                    str = c(fVar);
                                }
                                if (str == null || ((String) linkedHashMap.put(c10, str)) != null) {
                                    return;
                                }
                                if (e(fVar) || fVar.A()) {
                                    i10 = 0;
                                    i12 = 1;
                                    c10 = null;
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        arrayList2.add(new Challenge(str3, linkedHashMap));
                        str3 = c10;
                    }
                } else if (fVar.A()) {
                    arrayList2.add(new Challenge(str3, s.f20214a));
                    return;
                } else {
                    return;
                }
            }
            StringBuilder q10 = a.q(c10);
            if (t10 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (t10 != 0) {
                    if (t10 != 1) {
                        int length = "=".length();
                        if (length != 0) {
                            if (length != 1) {
                                StringBuilder sb2 = new StringBuilder("=".length() * t10);
                                g m10 = new vk.h(1, t10).iterator();
                                while (m10.f23340c) {
                                    m10.nextInt();
                                    sb2.append("=");
                                }
                                str2 = sb2.toString();
                                sk.j.e(str2, "{\n                    va…tring()\n                }");
                            } else {
                                char charAt = "=".charAt(0);
                                char[] cArr = new char[t10];
                                while (i10 < t10) {
                                    cArr[i10] = charAt;
                                    i10++;
                                }
                                str2 = new String(cArr);
                            }
                        }
                    } else {
                        str2 = "=".toString();
                    }
                    q10.append(str2);
                    Map singletonMap = Collections.singletonMap((Object) null, q10.toString());
                    sk.j.e(singletonMap, "singletonMap<String, Str…ek + \"=\".repeat(eqCount))");
                    arrayList2.add(new Challenge(str3, singletonMap));
                }
                str2 = "";
                q10.append(str2);
                Map singletonMap2 = Collections.singletonMap((Object) null, q10.toString());
                sk.j.e(singletonMap2, "singletonMap<String, Str…ek + \"=\".repeat(eqCount))");
                arrayList2.add(new Challenge(str3, singletonMap2));
            } else {
                throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + t10 + '.').toString());
            }
        }
    }

    public static final String c(f fVar) {
        long T = fVar.T(f22316b);
        if (T == -1) {
            T = fVar.f20878b;
        }
        if (T != 0) {
            return fVar.W(T);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0205, code lost:
        if (r3.f23595a.matcher(r0).matches() == false) goto L_0x020a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0223, code lost:
        if (okhttp3.internal.publicsuffix.PublicSuffixDatabase.f22596h.a(r3) == null) goto L_0x0225;
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0269 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void d(okhttp3.CookieJar r36, okhttp3.HttpUrl r37, okhttp3.Headers r38) {
        /*
            r1 = r36
            r2 = r37
            r0 = r38
            java.lang.String r3 = "<this>"
            sk.j.f(r1, r3)
            java.lang.String r3 = "url"
            sk.j.f(r2, r3)
            java.lang.String r3 = "headers"
            sk.j.f(r0, r3)
            okhttp3.CookieJar r3 = okhttp3.CookieJar.f21977a
            if (r1 != r3) goto L_0x001a
            return
        L_0x001a:
            okhttp3.Cookie$Companion r3 = okhttp3.Cookie.f21963j
            r3.getClass()
            java.lang.String[] r3 = r0.f22003a
            int r3 = r3.length
            r4 = 2
            int r3 = r3 / r4
            r6 = 0
            r7 = r6
            r8 = 0
        L_0x0027:
            if (r7 >= r3) goto L_0x0046
            java.lang.String r9 = r0.i(r7)
            java.lang.String r10 = "Set-Cookie"
            boolean r9 = yk.h.G0(r10, r9)
            if (r9 == 0) goto L_0x0043
            if (r8 != 0) goto L_0x003c
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>(r4)
        L_0x003c:
            java.lang.String r9 = r0.m(r7)
            r8.add(r9)
        L_0x0043:
            int r7 = r7 + 1
            goto L_0x0027
        L_0x0046:
            if (r8 == 0) goto L_0x0052
            java.util.List r0 = java.util.Collections.unmodifiableList(r8)
            java.lang.String r3 = "{\n      Collections.unmodifiableList(result)\n    }"
            sk.j.e(r0, r3)
            goto L_0x0054
        L_0x0052:
            fk.r r0 = fk.r.f20213a
        L_0x0054:
            r3 = r0
            int r4 = r3.size()
            r7 = r6
            r8 = 0
        L_0x005b:
            if (r7 >= r4) goto L_0x026f
            java.lang.Object r0 = r3.get(r7)
            r9 = r0
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r0 = "setCookie"
            sk.j.f(r9, r0)
            long r10 = java.lang.System.currentTimeMillis()
            byte[] r0 = okhttp3.internal.Util.f22171a
            int r0 = r9.length()
            r12 = 59
            int r0 = okhttp3.internal.Util.e(r9, r12, r6, r0)
            r13 = 61
            int r14 = okhttp3.internal.Util.e(r9, r13, r6, r0)
            if (r14 != r0) goto L_0x0082
            goto L_0x00a8
        L_0x0082:
            java.lang.String r16 = okhttp3.internal.Util.z(r6, r14, r9)
            int r15 = r16.length()
            r17 = 1
            if (r15 != 0) goto L_0x0091
            r15 = r17
            goto L_0x0092
        L_0x0091:
            r15 = r6
        L_0x0092:
            if (r15 != 0) goto L_0x00a8
            int r15 = okhttp3.internal.Util.l(r16)
            r5 = -1
            if (r15 == r5) goto L_0x009c
            goto L_0x00a8
        L_0x009c:
            int r14 = r14 + 1
            java.lang.String r14 = okhttp3.internal.Util.z(r14, r0, r9)
            int r15 = okhttp3.internal.Util.l(r14)
            if (r15 == r5) goto L_0x00ad
        L_0x00a8:
            r35 = r3
        L_0x00aa:
            r0 = 0
            goto L_0x025b
        L_0x00ad:
            int r0 = r0 + 1
            int r5 = r9.length()
            r18 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
            r20 = -1
            r22 = r6
            r23 = r22
            r24 = r23
            r25 = r17
            r28 = r18
            r26 = r20
            r15 = 0
            r30 = 0
        L_0x00c9:
            r31 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r33 = -9223372036854775808
            if (r0 >= r5) goto L_0x01a5
            int r6 = okhttp3.internal.Util.e(r9, r12, r0, r5)
            int r12 = okhttp3.internal.Util.e(r9, r13, r0, r6)
            java.lang.String r0 = okhttp3.internal.Util.z(r0, r12, r9)
            if (r12 >= r6) goto L_0x00e7
            int r12 = r12 + 1
            java.lang.String r12 = okhttp3.internal.Util.z(r12, r6, r9)
            goto L_0x00e9
        L_0x00e7:
            java.lang.String r12 = ""
        L_0x00e9:
            java.lang.String r13 = "expires"
            boolean r13 = yk.h.G0(r0, r13)
            if (r13 == 0) goto L_0x0102
            int r0 = r12.length()     // Catch:{ IllegalArgumentException -> 0x00fe }
            long r12 = okhttp3.Cookie.Companion.b(r0, r12)     // Catch:{ IllegalArgumentException -> 0x00fe }
            r35 = r3
            r28 = r12
            goto L_0x0142
        L_0x00fe:
            r35 = r3
            goto L_0x019a
        L_0x0102:
            java.lang.String r13 = "max-age"
            boolean r13 = yk.h.G0(r0, r13)
            if (r13 == 0) goto L_0x0146
            long r12 = java.lang.Long.parseLong(r12)     // Catch:{ NumberFormatException -> 0x011c }
            r26 = 0
            int r0 = (r12 > r26 ? 1 : (r12 == r26 ? 0 : -1))
            if (r0 > 0) goto L_0x0115
            goto L_0x0117
        L_0x0115:
            r33 = r12
        L_0x0117:
            r35 = r3
            r26 = r33
            goto L_0x0142
        L_0x011c:
            r0 = move-exception
            r13 = r0
            java.lang.String r0 = "-?\\d+"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)     // Catch:{  }
            r35 = r3
            java.lang.String r3 = "compile(pattern)"
            sk.j.e(r0, r3)     // Catch:{ NumberFormatException -> 0x019a }
            java.util.regex.Matcher r0 = r0.matcher(r12)     // Catch:{ NumberFormatException -> 0x019a }
            boolean r0 = r0.matches()     // Catch:{ NumberFormatException -> 0x019a }
            if (r0 == 0) goto L_0x0145
            java.lang.String r0 = "-"
            r3 = 0
            boolean r0 = yk.h.L0(r12, r0, r3)     // Catch:{ NumberFormatException -> 0x019a }
            if (r0 == 0) goto L_0x0140
            r31 = r33
        L_0x0140:
            r26 = r31
        L_0x0142:
            r24 = r17
            goto L_0x019a
        L_0x0145:
            throw r13     // Catch:{ NumberFormatException -> 0x019a }
        L_0x0146:
            r35 = r3
            java.lang.String r3 = "domain"
            boolean r3 = yk.h.G0(r0, r3)
            if (r3 == 0) goto L_0x017a
            java.lang.String r0 = "."
            boolean r3 = yk.h.F0(r12, r0)     // Catch:{  }
            r3 = r3 ^ 1
            if (r3 == 0) goto L_0x016e
            java.lang.String r0 = yk.l.b1(r0, r12)     // Catch:{  }
            java.lang.String r0 = okhttp3.internal.HostnamesKt.b(r0)     // Catch:{  }
            if (r0 == 0) goto L_0x0168
            r15 = r0
            r25 = 0
            goto L_0x019a
        L_0x0168:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{  }
            r0.<init>()     // Catch:{  }
            throw r0     // Catch:{  }
        L_0x016e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{  }
            java.lang.String r3 = "Failed requirement."
            java.lang.String r3 = r3.toString()     // Catch:{  }
            r0.<init>(r3)     // Catch:{  }
            throw r0     // Catch:{  }
        L_0x017a:
            java.lang.String r3 = "path"
            boolean r3 = yk.h.G0(r0, r3)
            if (r3 == 0) goto L_0x0185
            r30 = r12
            goto L_0x019a
        L_0x0185:
            java.lang.String r3 = "secure"
            boolean r3 = yk.h.G0(r0, r3)
            if (r3 == 0) goto L_0x0190
            r22 = r17
            goto L_0x019a
        L_0x0190:
            java.lang.String r3 = "httponly"
            boolean r0 = yk.h.G0(r0, r3)
            if (r0 == 0) goto L_0x019a
            r23 = r17
        L_0x019a:
            int r0 = r6 + 1
            r3 = r35
            r6 = 0
            r12 = 59
            r13 = 61
            goto L_0x00c9
        L_0x01a5:
            r35 = r3
            int r0 = (r26 > r33 ? 1 : (r26 == r33 ? 0 : -1))
            if (r0 != 0) goto L_0x01ae
            r18 = r33
            goto L_0x01d0
        L_0x01ae:
            int r0 = (r26 > r20 ? 1 : (r26 == r20 ? 0 : -1))
            if (r0 == 0) goto L_0x01ce
            r5 = 9223372036854775(0x20c49ba5e353f7, double:4.663754807431093E-308)
            int r0 = (r26 > r5 ? 1 : (r26 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x01c0
            r0 = 1000(0x3e8, float:1.401E-42)
            long r5 = (long) r0
            long r31 = r26 * r5
        L_0x01c0:
            long r31 = r10 + r31
            int r0 = (r31 > r10 ? 1 : (r31 == r10 ? 0 : -1))
            if (r0 < 0) goto L_0x01d0
            int r0 = (r31 > r18 ? 1 : (r31 == r18 ? 0 : -1))
            if (r0 <= 0) goto L_0x01cb
            goto L_0x01d0
        L_0x01cb:
            r18 = r31
            goto L_0x01d0
        L_0x01ce:
            r18 = r28
        L_0x01d0:
            java.lang.String r0 = r2.f22010d
            if (r15 != 0) goto L_0x01d6
            r3 = r0
            goto L_0x020e
        L_0x01d6:
            boolean r3 = sk.j.a(r0, r15)
            if (r3 == 0) goto L_0x01dd
            goto L_0x020a
        L_0x01dd:
            boolean r3 = yk.h.F0(r0, r15)
            if (r3 == 0) goto L_0x0208
            int r3 = r0.length()
            int r5 = r15.length()
            int r3 = r3 - r5
            int r3 = r3 + -1
            char r3 = r0.charAt(r3)
            r5 = 46
            if (r3 != r5) goto L_0x0208
            yk.c r3 = okhttp3.internal.Util.f22176f
            r3.getClass()
            java.util.regex.Pattern r3 = r3.f23595a
            java.util.regex.Matcher r3 = r3.matcher(r0)
            boolean r3 = r3.matches()
            if (r3 != 0) goto L_0x0208
            goto L_0x020a
        L_0x0208:
            r17 = 0
        L_0x020a:
            if (r17 != 0) goto L_0x020d
            goto L_0x0225
        L_0x020d:
            r3 = r15
        L_0x020e:
            int r0 = r0.length()
            int r5 = r3.length()
            if (r0 == r5) goto L_0x0228
            okhttp3.internal.publicsuffix.PublicSuffixDatabase$Companion r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f22593e
            r0.getClass()
            okhttp3.internal.publicsuffix.PublicSuffixDatabase r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f22596h
            java.lang.String r0 = r0.a(r3)
            if (r0 != 0) goto L_0x0228
        L_0x0225:
            r6 = 0
            goto L_0x00aa
        L_0x0228:
            java.lang.String r0 = "/"
            r5 = r30
            r6 = 0
            if (r5 == 0) goto L_0x0239
            boolean r9 = yk.h.L0(r5, r0, r6)
            if (r9 != 0) goto L_0x0236
            goto L_0x0239
        L_0x0236:
            r21 = r5
            goto L_0x0251
        L_0x0239:
            java.lang.String r5 = r37.b()
            r9 = 47
            r10 = 6
            int r9 = yk.l.U0(r5, r9, r6, r10)
            if (r9 == 0) goto L_0x024f
            java.lang.String r0 = r5.substring(r6, r9)
            java.lang.String r5 = "this as java.lang.String…ing(startIndex, endIndex)"
            sk.j.e(r0, r5)
        L_0x024f:
            r21 = r0
        L_0x0251:
            okhttp3.Cookie r0 = new okhttp3.Cookie
            r15 = r0
            r17 = r14
            r20 = r3
            r15.<init>(r16, r17, r18, r20, r21, r22, r23, r24, r25)
        L_0x025b:
            if (r0 != 0) goto L_0x025e
            goto L_0x0269
        L_0x025e:
            if (r8 != 0) goto L_0x0266
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r8 = r3
        L_0x0266:
            r8.add(r0)
        L_0x0269:
            int r7 = r7 + 1
            r3 = r35
            goto L_0x005b
        L_0x026f:
            if (r8 == 0) goto L_0x027b
            java.util.List r0 = java.util.Collections.unmodifiableList(r8)
            java.lang.String r3 = "{\n        Collections.un…ableList(cookies)\n      }"
            sk.j.e(r0, r3)
            goto L_0x027d
        L_0x027b:
            fk.r r0 = fk.r.f20213a
        L_0x027d:
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L_0x0284
            return
        L_0x0284:
            r1.a(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.HttpHeaders.d(okhttp3.CookieJar, okhttp3.HttpUrl, okhttp3.Headers):void");
    }

    public static final boolean e(f fVar) {
        boolean z10;
        boolean z11 = false;
        while (!fVar.A()) {
            byte B = fVar.B(0);
            if (B != 44) {
                if (B == 32 || B == 9) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    break;
                }
                fVar.readByte();
            } else {
                fVar.readByte();
                z11 = true;
            }
        }
        return z11;
    }
}
