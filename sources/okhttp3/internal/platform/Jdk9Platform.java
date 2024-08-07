package okhttp3.internal.platform;

import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import okhttp3.Protocol;
import okhttp3.internal.SuppressSignatureCheck;
import okhttp3.internal.platform.Platform;
import sk.j;

/* compiled from: Jdk9Platform.kt */
public class Jdk9Platform extends Platform {

    /* renamed from: d  reason: collision with root package name */
    public static final Companion f22557d = new Companion(0);

    /* renamed from: e  reason: collision with root package name */
    public static final boolean f22558e;

    /* compiled from: Jdk9Platform.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i10) {
            this();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007d, code lost:
        if (r2.intValue() >= 9) goto L_0x0089;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0068 A[SYNTHETIC] */
    static {
        /*
            okhttp3.internal.platform.Jdk9Platform$Companion r0 = new okhttp3.internal.platform.Jdk9Platform$Companion
            r1 = 0
            r0.<init>(r1)
            f22557d = r0
            java.lang.String r0 = "java.specification.version"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0075
            r4 = 10
            p3.l0.n(r4)
            int r5 = r0.length()
            if (r5 != 0) goto L_0x001f
            goto L_0x0075
        L_0x001f:
            char r6 = r0.charAt(r1)
            r7 = 48
            int r7 = sk.j.h(r6, r7)
            r8 = -2147483647(0xffffffff80000001, float:-1.4E-45)
            if (r7 >= 0) goto L_0x0040
            if (r5 != r3) goto L_0x0031
            goto L_0x0075
        L_0x0031:
            r7 = 45
            if (r6 != r7) goto L_0x0039
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r3
            goto L_0x0041
        L_0x0039:
            r7 = 43
            if (r6 != r7) goto L_0x0075
            r6 = r1
            r7 = r3
            goto L_0x0042
        L_0x0040:
            r6 = r1
        L_0x0041:
            r7 = r6
        L_0x0042:
            r9 = -59652323(0xfffffffffc71c71d, float:-5.0215282E36)
            r10 = r1
            r11 = r9
        L_0x0047:
            if (r7 >= r5) goto L_0x0068
            char r12 = r0.charAt(r7)
            int r12 = java.lang.Character.digit(r12, r4)
            if (r12 >= 0) goto L_0x0054
            goto L_0x0075
        L_0x0054:
            if (r10 >= r11) goto L_0x005d
            if (r11 != r9) goto L_0x0075
            int r11 = r8 / 10
            if (r10 >= r11) goto L_0x005d
            goto L_0x0075
        L_0x005d:
            int r10 = r10 * 10
            int r13 = r8 + r12
            if (r10 >= r13) goto L_0x0064
            goto L_0x0075
        L_0x0064:
            int r10 = r10 - r12
            int r7 = r7 + 1
            goto L_0x0047
        L_0x0068:
            if (r6 == 0) goto L_0x006f
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            goto L_0x0074
        L_0x006f:
            int r0 = -r10
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0074:
            r2 = r0
        L_0x0075:
            if (r2 == 0) goto L_0x0080
            int r0 = r2.intValue()
            r2 = 9
            if (r0 < r2) goto L_0x008a
            goto L_0x0089
        L_0x0080:
            java.lang.Class<javax.net.ssl.SSLSocket> r0 = javax.net.ssl.SSLSocket.class
            java.lang.String r2 = "getApplicationProtocol"
            java.lang.Class[] r4 = new java.lang.Class[r1]     // Catch:{ NoSuchMethodException -> 0x008a }
            r0.getMethod(r2, r4)     // Catch:{ NoSuchMethodException -> 0x008a }
        L_0x0089:
            r1 = r3
        L_0x008a:
            f22558e = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.platform.Jdk9Platform.<clinit>():void");
    }

    @SuppressSignatureCheck
    public final void d(SSLSocket sSLSocket, String str, List<Protocol> list) {
        j.f(list, "protocols");
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        Platform.f22562a.getClass();
        sSLParameters.setApplicationProtocols((String[]) Platform.Companion.a(list).toArray(new String[0]));
        sSLSocket.setSSLParameters(sSLParameters);
    }

    @SuppressSignatureCheck
    public final String f(SSLSocket sSLSocket) {
        boolean z10;
        try {
            String g2 = sSLSocket.getApplicationProtocol();
            if (g2 == null) {
                z10 = true;
            } else {
                z10 = j.a(g2, "");
            }
            if (z10) {
                return null;
            }
            return g2;
        } catch (UnsupportedOperationException unused) {
        }
    }
}
