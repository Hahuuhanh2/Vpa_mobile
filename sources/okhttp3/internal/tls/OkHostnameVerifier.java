package okhttp3.internal.tls;

import f0.b0;
import fk.r;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import n0.l;
import sk.j;

/* compiled from: OkHostnameVerifier.kt */
public final class OkHostnameVerifier implements HostnameVerifier {

    /* renamed from: a  reason: collision with root package name */
    public static final OkHostnameVerifier f22612a = new OkHostnameVerifier();

    private OkHostnameVerifier() {
    }

    public static List a(X509Certificate x509Certificate, int i10) {
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return r.f20213a;
            }
            ArrayList arrayList = new ArrayList();
            for (List next : subjectAlternativeNames) {
                if (next != null) {
                    if (next.size() >= 2) {
                        if (j.a(next.get(0), Integer.valueOf(i10))) {
                            Object obj = next.get(1);
                            if (obj != null) {
                                arrayList.add((String) obj);
                            }
                        }
                    }
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return r.f20213a;
        }
    }

    public static boolean b(String str) {
        boolean z10;
        boolean z11;
        int i10;
        char c10;
        int length = str.length();
        int length2 = str.length();
        if (length2 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (length2 <= str.length()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                long j10 = 0;
                int i11 = 0;
                while (i11 < length2) {
                    char charAt = str.charAt(i11);
                    if (charAt < 128) {
                        j10++;
                    } else {
                        if (charAt < 2048) {
                            i10 = 2;
                        } else if (charAt < 55296 || charAt > 57343) {
                            i10 = 3;
                        } else {
                            int i12 = i11 + 1;
                            if (i12 < length2) {
                                c10 = str.charAt(i12);
                            } else {
                                c10 = 0;
                            }
                            if (charAt > 56319 || c10 < 56320 || c10 > 57343) {
                                j10++;
                                i11 = i12;
                            } else {
                                j10 += (long) 4;
                                i11 += 2;
                            }
                        }
                        j10 += (long) i10;
                    }
                    i11++;
                }
                if (length == ((int) j10)) {
                    return true;
                }
                return false;
            }
            StringBuilder l10 = l.l("endIndex > string.length: ", length2, " > ");
            l10.append(str.length());
            throw new IllegalArgumentException(l10.toString().toString());
        }
        throw new IllegalArgumentException(b0.p("endIndex < beginIndex: ", length2, " < ", 0).toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:69:0x0155 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean c(java.lang.String r12, java.security.cert.X509Certificate r13) {
        /*
            java.lang.String r0 = "host"
            sk.j.f(r12, r0)
            byte[] r0 = okhttp3.internal.Util.f22171a
            yk.c r0 = okhttp3.internal.Util.f22176f
            r0.getClass()
            java.util.regex.Pattern r0 = r0.f23595a
            java.util.regex.Matcher r0 = r0.matcher(r12)
            boolean r0 = r0.matches()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0047
            java.lang.String r12 = okhttp3.internal.HostnamesKt.b(r12)
            r0 = 7
            java.util.List r13 = a(r13, r0)
            boolean r0 = r13.isEmpty()
            if (r0 == 0) goto L_0x002b
            goto L_0x0154
        L_0x002b:
            java.util.Iterator r13 = r13.iterator()
        L_0x002f:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0154
            java.lang.Object r0 = r13.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = okhttp3.internal.HostnamesKt.b(r0)
            boolean r0 = sk.j.a(r12, r0)
            if (r0 == 0) goto L_0x002f
            goto L_0x0155
        L_0x0047:
            boolean r0 = b(r12)
            java.lang.String r3 = "this as java.lang.String).toLowerCase(locale)"
            java.lang.String r4 = "US"
            if (r0 == 0) goto L_0x005d
            java.util.Locale r0 = java.util.Locale.US
            sk.j.e(r0, r4)
            java.lang.String r12 = r12.toLowerCase(r0)
            sk.j.e(r12, r3)
        L_0x005d:
            r0 = 2
            java.util.List r13 = a(r13, r0)
            boolean r0 = r13.isEmpty()
            if (r0 == 0) goto L_0x006a
            goto L_0x0154
        L_0x006a:
            java.util.Iterator r13 = r13.iterator()
        L_0x006e:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0154
            java.lang.Object r0 = r13.next()
            java.lang.String r0 = (java.lang.String) r0
            okhttp3.internal.tls.OkHostnameVerifier r5 = f22612a
            r5.getClass()
            int r5 = r12.length()
            if (r5 != 0) goto L_0x0087
            r5 = r1
            goto L_0x0088
        L_0x0087:
            r5 = r2
        L_0x0088:
            if (r5 != 0) goto L_0x0150
            java.lang.String r5 = "."
            boolean r6 = yk.h.L0(r12, r5, r2)
            if (r6 != 0) goto L_0x0150
            java.lang.String r6 = ".."
            boolean r7 = yk.h.F0(r12, r6)
            if (r7 == 0) goto L_0x009c
            goto L_0x0150
        L_0x009c:
            if (r0 == 0) goto L_0x00a7
            int r7 = r0.length()
            if (r7 != 0) goto L_0x00a5
            goto L_0x00a7
        L_0x00a5:
            r7 = r2
            goto L_0x00a8
        L_0x00a7:
            r7 = r1
        L_0x00a8:
            if (r7 != 0) goto L_0x0150
            boolean r7 = yk.h.L0(r0, r5, r2)
            if (r7 != 0) goto L_0x0150
            boolean r6 = yk.h.F0(r0, r6)
            if (r6 == 0) goto L_0x00b8
            goto L_0x0150
        L_0x00b8:
            boolean r6 = yk.h.F0(r12, r5)
            r7 = 46
            if (r6 != 0) goto L_0x00d0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r12)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            goto L_0x00d1
        L_0x00d0:
            r6 = r12
        L_0x00d1:
            boolean r5 = yk.h.F0(r0, r5)
            if (r5 != 0) goto L_0x00e6
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            r5.append(r7)
            java.lang.String r0 = r5.toString()
        L_0x00e6:
            boolean r5 = b(r0)
            if (r5 == 0) goto L_0x00f8
            java.util.Locale r5 = java.util.Locale.US
            sk.j.e(r5, r4)
            java.lang.String r0 = r0.toLowerCase(r5)
            sk.j.e(r0, r3)
        L_0x00f8:
            java.lang.String r5 = "*"
            boolean r5 = yk.l.N0(r0, r5)
            if (r5 != 0) goto L_0x0105
            boolean r0 = sk.j.a(r6, r0)
            goto L_0x0151
        L_0x0105:
            java.lang.String r5 = "*."
            boolean r8 = yk.h.L0(r0, r5, r2)
            if (r8 == 0) goto L_0x0150
            r8 = 42
            r9 = 4
            int r8 = yk.l.R0(r0, r8, r1, r2, r9)
            r10 = -1
            if (r8 == r10) goto L_0x0118
            goto L_0x0150
        L_0x0118:
            int r8 = r6.length()
            int r11 = r0.length()
            if (r8 >= r11) goto L_0x0123
            goto L_0x0150
        L_0x0123:
            boolean r5 = sk.j.a(r5, r0)
            if (r5 == 0) goto L_0x012a
            goto L_0x0150
        L_0x012a:
            java.lang.String r0 = r0.substring(r1)
            java.lang.String r5 = "this as java.lang.String).substring(startIndex)"
            sk.j.e(r0, r5)
            boolean r5 = yk.h.F0(r6, r0)
            if (r5 != 0) goto L_0x013a
            goto L_0x0150
        L_0x013a:
            int r5 = r6.length()
            int r0 = r0.length()
            int r5 = r5 - r0
            if (r5 <= 0) goto L_0x014e
            int r5 = r5 + -1
            int r0 = yk.l.U0(r6, r7, r5, r9)
            if (r0 == r10) goto L_0x014e
            goto L_0x0150
        L_0x014e:
            r0 = r1
            goto L_0x0151
        L_0x0150:
            r0 = r2
        L_0x0151:
            if (r0 == 0) goto L_0x006e
            goto L_0x0155
        L_0x0154:
            r1 = r2
        L_0x0155:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.tls.OkHostnameVerifier.c(java.lang.String, java.security.cert.X509Certificate):boolean");
    }

    public final boolean verify(String str, SSLSession sSLSession) {
        j.f(str, "host");
        j.f(sSLSession, "session");
        if (!b(str)) {
            return false;
        }
        try {
            Certificate certificate = sSLSession.getPeerCertificates()[0];
            j.d(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            return c(str, (X509Certificate) certificate);
        } catch (SSLException unused) {
            return false;
        }
    }
}
