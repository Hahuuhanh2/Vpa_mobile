package okhttp3.internal.authenticator;

import fk.p;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import okhttp3.Authenticator;
import okhttp3.Dns;
import okhttp3.HttpUrl;
import sk.j;

/* compiled from: JavaNetAuthenticator.kt */
public final class JavaNetAuthenticator implements Authenticator {

    /* renamed from: b  reason: collision with root package name */
    public final Dns f22178b;

    /* compiled from: JavaNetAuthenticator.kt */
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f22179a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f22179a = iArr;
        }
    }

    public JavaNetAuthenticator() {
        this(0);
    }

    public JavaNetAuthenticator(int i10) {
        Dns dns = Dns.f21986a;
        j.f(dns, "defaultDns");
        this.f22178b = dns;
    }

    public static InetAddress b(Proxy proxy, HttpUrl httpUrl, Dns dns) {
        int i10;
        Proxy.Type type = proxy.type();
        if (type == null) {
            i10 = -1;
        } else {
            i10 = WhenMappings.f22179a[type.ordinal()];
        }
        if (i10 == 1) {
            return (InetAddress) p.M0(dns.a(httpUrl.f22010d));
        }
        SocketAddress address = proxy.address();
        j.d(address, "null cannot be cast to non-null type java.net.InetSocketAddress");
        InetAddress address2 = ((InetSocketAddress) address).getAddress();
        j.e(address2, "address() as InetSocketAddress).address");
        return address2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final okhttp3.Request a(okhttp3.Route r21, okhttp3.Response r22) {
        /*
            r20 = this;
            r1 = r21
            r2 = r22
            java.lang.String r0 = "response"
            sk.j.f(r2, r0)
            okhttp3.Headers r3 = r2.f22129f
            int r0 = r2.f22127d
            r4 = 401(0x191, float:5.62E-43)
            r5 = 0
            java.lang.String r6 = "<this>"
            r7 = 407(0x197, float:5.7E-43)
            if (r0 == r4) goto L_0x001e
            if (r0 == r7) goto L_0x001b
            fk.r r0 = fk.r.f20213a
            goto L_0x0063
        L_0x001b:
            java.lang.String r0 = "Proxy-Authenticate"
            goto L_0x0020
        L_0x001e:
            java.lang.String r0 = "WWW-Authenticate"
        L_0x0020:
            r4 = r0
            ll.j r0 = okhttp3.internal.http.HttpHeaders.f22315a
            sk.j.f(r3, r6)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.lang.String[] r0 = r3.f22003a
            int r0 = r0.length
            int r9 = r0 / 2
            r10 = r5
        L_0x0031:
            if (r10 >= r9) goto L_0x0062
            java.lang.String r0 = r3.i(r10)
            boolean r0 = yk.h.G0(r4, r0)
            if (r0 == 0) goto L_0x005f
            ll.f r0 = new ll.f
            r0.<init>()
            java.lang.String r11 = r3.m(r10)
            r0.w0(r11)
            okhttp3.internal.http.HttpHeaders.b(r0, r8)     // Catch:{ EOFException -> 0x004d }
            goto L_0x005f
        L_0x004d:
            r0 = move-exception
            r11 = r0
            okhttp3.internal.platform.Platform$Companion r0 = okhttp3.internal.platform.Platform.f22562a
            r0.getClass()
            okhttp3.internal.platform.Platform r0 = okhttp3.internal.platform.Platform.f22563b
            r12 = 5
            r0.getClass()
            java.lang.String r0 = "Unable to parse challenge"
            okhttp3.internal.platform.Platform.i(r12, r0, r11)
        L_0x005f:
            int r10 = r10 + 1
            goto L_0x0031
        L_0x0062:
            r0 = r8
        L_0x0063:
            okhttp3.Request r3 = r2.f22124a
            okhttp3.HttpUrl r4 = r3.f22104a
            int r2 = r2.f22127d
            if (r2 != r7) goto L_0x006c
            r5 = 1
        L_0x006c:
            if (r1 == 0) goto L_0x0072
            java.net.Proxy r2 = r1.f22161b
            if (r2 != 0) goto L_0x0074
        L_0x0072:
            java.net.Proxy r2 = java.net.Proxy.NO_PROXY
        L_0x0074:
            java.util.Iterator r0 = r0.iterator()
        L_0x0078:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L_0x017b
            java.lang.Object r7 = r0.next()
            okhttp3.Challenge r7 = (okhttp3.Challenge) r7
            java.lang.String r8 = r7.f21930a
            java.lang.String r9 = "Basic"
            boolean r8 = yk.h.G0(r9, r8)
            if (r8 != 0) goto L_0x008f
            goto L_0x0078
        L_0x008f:
            if (r1 == 0) goto L_0x009e
            okhttp3.Address r8 = r1.f22160a
            if (r8 == 0) goto L_0x009e
            okhttp3.Dns r8 = r8.f21893a
            if (r8 != 0) goto L_0x009a
            goto L_0x009e
        L_0x009a:
            r9 = r8
            r8 = r20
            goto L_0x00a2
        L_0x009e:
            r8 = r20
            okhttp3.Dns r9 = r8.f22178b
        L_0x00a2:
            java.lang.String r10 = "realm"
            if (r5 == 0) goto L_0x00d8
            java.net.SocketAddress r11 = r2.address()
            java.lang.String r12 = "null cannot be cast to non-null type java.net.InetSocketAddress"
            sk.j.d(r11, r12)
            java.net.InetSocketAddress r11 = (java.net.InetSocketAddress) r11
            java.lang.String r12 = r11.getHostName()
            java.net.InetAddress r13 = b(r2, r4, r9)
            int r14 = r11.getPort()
            java.lang.String r15 = r4.f22007a
            java.util.Map<java.lang.String, java.lang.String> r9 = r7.f21931b
            java.lang.Object r9 = r9.get(r10)
            r16 = r9
            java.lang.String r16 = (java.lang.String) r16
            java.lang.String r9 = r7.f21930a
            java.net.URL r18 = r4.h()
            java.net.Authenticator$RequestorType r19 = java.net.Authenticator.RequestorType.PROXY
            r17 = r9
            java.net.PasswordAuthentication r9 = java.net.Authenticator.requestPasswordAuthentication(r12, r13, r14, r15, r16, r17, r18, r19)
            goto L_0x00fe
        L_0x00d8:
            java.lang.String r11 = r4.f22010d
            java.lang.String r12 = "proxy"
            sk.j.e(r2, r12)
            java.net.InetAddress r9 = b(r2, r4, r9)
            int r12 = r4.f22011e
            java.lang.String r13 = r4.f22007a
            java.util.Map<java.lang.String, java.lang.String> r14 = r7.f21931b
            java.lang.Object r10 = r14.get(r10)
            r14 = r10
            java.lang.String r14 = (java.lang.String) r14
            java.lang.String r15 = r7.f21930a
            java.net.URL r16 = r4.h()
            java.net.Authenticator$RequestorType r17 = java.net.Authenticator.RequestorType.SERVER
            r10 = r11
            r11 = r9
            java.net.PasswordAuthentication r9 = java.net.Authenticator.requestPasswordAuthentication(r10, r11, r12, r13, r14, r15, r16, r17)
        L_0x00fe:
            if (r9 == 0) goto L_0x0078
            if (r5 == 0) goto L_0x0105
            java.lang.String r0 = "Proxy-Authorization"
            goto L_0x0107
        L_0x0105:
            java.lang.String r0 = "Authorization"
        L_0x0107:
            java.lang.String r1 = r9.getUserName()
            java.lang.String r2 = "auth.userName"
            sk.j.e(r1, r2)
            char[] r2 = r9.getPassword()
            java.lang.String r4 = "auth.password"
            sk.j.e(r2, r4)
            java.lang.String r4 = new java.lang.String
            r4.<init>(r2)
            java.util.Map<java.lang.String, java.lang.String> r2 = r7.f21931b
            java.lang.String r5 = "charset"
            java.lang.Object r2 = r2.get(r5)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x0134
            java.nio.charset.Charset r2 = java.nio.charset.Charset.forName(r2)     // Catch:{ Exception -> 0x0134 }
            java.lang.String r5 = "forName(charset)"
            sk.j.e(r2, r5)     // Catch:{ Exception -> 0x0134 }
            goto L_0x013b
        L_0x0134:
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.ISO_8859_1
            java.lang.String r5 = "ISO_8859_1"
            sk.j.e(r2, r5)
        L_0x013b:
            int r5 = okhttp3.Credentials.f21979a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r1)
            r1 = 58
            r5.append(r1)
            r5.append(r4)
            java.lang.String r1 = r5.toString()
            ll.j r4 = ll.j.f20882d
            sk.j.f(r1, r6)
            ll.j r4 = new ll.j
            byte[] r1 = r1.getBytes(r2)
            java.lang.String r2 = "this as java.lang.String).getBytes(charset)"
            sk.j.e(r1, r2)
            r4.<init>(r1)
            java.lang.String r1 = r4.b()
            java.lang.String r2 = "Basic "
            java.lang.String r1 = f0.b0.r(r2, r1)
            okhttp3.Request$Builder r2 = new okhttp3.Request$Builder
            r2.<init>(r3)
            r2.b(r0, r1)
            okhttp3.Request r0 = r2.a()
            return r0
        L_0x017b:
            r8 = r20
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.authenticator.JavaNetAuthenticator.a(okhttp3.Route, okhttp3.Response):okhttp3.Request");
    }
}
