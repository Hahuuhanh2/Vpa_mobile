package okhttp3;

import fk.p;
import hk.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import okhttp3.TlsVersion;
import okhttp3.internal.Util;
import sk.j;

/* compiled from: ConnectionSpec.kt */
public final class ConnectionSpec {

    /* renamed from: e  reason: collision with root package name */
    public static final ConnectionSpec f21953e;

    /* renamed from: f  reason: collision with root package name */
    public static final ConnectionSpec f21954f = new Builder(false).a();

    /* renamed from: a  reason: collision with root package name */
    public final boolean f21955a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f21956b;

    /* renamed from: c  reason: collision with root package name */
    public final String[] f21957c;

    /* renamed from: d  reason: collision with root package name */
    public final String[] f21958d;

    /* compiled from: ConnectionSpec.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i10) {
            this();
        }
    }

    static {
        new Companion(0);
        CipherSuite cipherSuite = CipherSuite.f21948r;
        CipherSuite cipherSuite2 = CipherSuite.f21949s;
        CipherSuite cipherSuite3 = CipherSuite.f21950t;
        CipherSuite cipherSuite4 = CipherSuite.f21942l;
        CipherSuite cipherSuite5 = CipherSuite.f21944n;
        CipherSuite cipherSuite6 = CipherSuite.f21943m;
        CipherSuite cipherSuite7 = CipherSuite.f21945o;
        CipherSuite cipherSuite8 = CipherSuite.f21947q;
        CipherSuite cipherSuite9 = CipherSuite.f21946p;
        CipherSuite[] cipherSuiteArr = {cipherSuite, cipherSuite2, cipherSuite3, cipherSuite4, cipherSuite5, cipherSuite6, cipherSuite7, cipherSuite8, cipherSuite9};
        CipherSuite[] cipherSuiteArr2 = {cipherSuite, cipherSuite2, cipherSuite3, cipherSuite4, cipherSuite5, cipherSuite6, cipherSuite7, cipherSuite8, cipherSuite9, CipherSuite.f21940j, CipherSuite.f21941k, CipherSuite.f21938h, CipherSuite.f21939i, CipherSuite.f21936f, CipherSuite.f21937g, CipherSuite.f21935e};
        Builder builder = new Builder(true);
        builder.c((CipherSuite[]) Arrays.copyOf(cipherSuiteArr, 9));
        TlsVersion tlsVersion = TlsVersion.TLS_1_3;
        TlsVersion tlsVersion2 = TlsVersion.TLS_1_2;
        builder.f(tlsVersion, tlsVersion2);
        builder.d();
        builder.a();
        Builder builder2 = new Builder(true);
        builder2.c((CipherSuite[]) Arrays.copyOf(cipherSuiteArr2, 16));
        builder2.f(tlsVersion, tlsVersion2);
        builder2.d();
        f21953e = builder2.a();
        Builder builder3 = new Builder(true);
        builder3.c((CipherSuite[]) Arrays.copyOf(cipherSuiteArr2, 16));
        builder3.f(tlsVersion, tlsVersion2, TlsVersion.TLS_1_1, TlsVersion.TLS_1_0);
        builder3.d();
        builder3.a();
    }

    public ConnectionSpec(boolean z10, boolean z11, String[] strArr, String[] strArr2) {
        this.f21955a = z10;
        this.f21956b = z11;
        this.f21957c = strArr;
        this.f21958d = strArr2;
    }

    public final List<CipherSuite> a() {
        String[] strArr = this.f21957c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String b10 : strArr) {
            arrayList.add(CipherSuite.f21932b.b(b10));
        }
        return p.Z0(arrayList);
    }

    public final boolean b(SSLSocket sSLSocket) {
        if (!this.f21955a) {
            return false;
        }
        String[] strArr = this.f21958d;
        if (strArr != null && !Util.i(strArr, sSLSocket.getEnabledProtocols(), a.f20530a)) {
            return false;
        }
        String[] strArr2 = this.f21957c;
        if (strArr2 == null) {
            return true;
        }
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        CipherSuite.f21932b.getClass();
        if (!Util.i(strArr2, enabledCipherSuites, CipherSuite.f21933c)) {
            return false;
        }
        return true;
    }

    public final List<TlsVersion> c() {
        String[] strArr = this.f21958d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String a10 : strArr) {
            TlsVersion.f22163b.getClass();
            arrayList.add(TlsVersion.Companion.a(a10));
        }
        return p.Z0(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ConnectionSpec)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z10 = this.f21955a;
        ConnectionSpec connectionSpec = (ConnectionSpec) obj;
        if (z10 != connectionSpec.f21955a) {
            return false;
        }
        if (!z10 || (Arrays.equals(this.f21957c, connectionSpec.f21957c) && Arrays.equals(this.f21958d, connectionSpec.f21958d) && this.f21956b == connectionSpec.f21956b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        if (!this.f21955a) {
            return 17;
        }
        String[] strArr = this.f21957c;
        int i11 = 0;
        if (strArr != null) {
            i10 = Arrays.hashCode(strArr);
        } else {
            i10 = 0;
        }
        int i12 = (527 + i10) * 31;
        String[] strArr2 = this.f21958d;
        if (strArr2 != null) {
            i11 = Arrays.hashCode(strArr2);
        }
        return ((i12 + i11) * 31) + (this.f21956b ^ true ? 1 : 0);
    }

    public final String toString() {
        if (!this.f21955a) {
            return "ConnectionSpec()";
        }
        StringBuilder q10 = android.support.v4.media.a.q("ConnectionSpec(cipherSuites=");
        q10.append(Objects.toString(a(), "[all enabled]"));
        q10.append(", tlsVersions=");
        q10.append(Objects.toString(c(), "[all enabled]"));
        q10.append(", supportsTlsExtensions=");
        q10.append(this.f21956b);
        q10.append(')');
        return q10.toString();
    }

    /* compiled from: ConnectionSpec.kt */
    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        public boolean f21959a;

        /* renamed from: b  reason: collision with root package name */
        public String[] f21960b;

        /* renamed from: c  reason: collision with root package name */
        public String[] f21961c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f21962d;

        public Builder(boolean z10) {
            this.f21959a = z10;
        }

        public final ConnectionSpec a() {
            return new ConnectionSpec(this.f21959a, this.f21962d, this.f21960b, this.f21961c);
        }

        public final void b(String... strArr) {
            boolean z10;
            j.f(strArr, "cipherSuites");
            if (this.f21959a) {
                if (strArr.length == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    this.f21960b = (String[]) strArr.clone();
                    return;
                }
                throw new IllegalArgumentException("At least one cipher suite is required".toString());
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }

        public final void c(CipherSuite... cipherSuiteArr) {
            j.f(cipherSuiteArr, "cipherSuites");
            if (this.f21959a) {
                ArrayList arrayList = new ArrayList(cipherSuiteArr.length);
                for (CipherSuite cipherSuite : cipherSuiteArr) {
                    arrayList.add(cipherSuite.f21951a);
                }
                String[] strArr = (String[]) arrayList.toArray(new String[0]);
                b((String[]) Arrays.copyOf(strArr, strArr.length));
                return;
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }

        public final void d() {
            if (this.f21959a) {
                this.f21962d = true;
                return;
            }
            throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
        }

        public final void e(String... strArr) {
            boolean z10;
            j.f(strArr, "tlsVersions");
            if (this.f21959a) {
                if (strArr.length == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    this.f21961c = (String[]) strArr.clone();
                    return;
                }
                throw new IllegalArgumentException("At least one TLS version is required".toString());
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }

        public final void f(TlsVersion... tlsVersionArr) {
            if (this.f21959a) {
                ArrayList arrayList = new ArrayList(tlsVersionArr.length);
                for (TlsVersion tlsVersion : tlsVersionArr) {
                    arrayList.add(tlsVersion.f22170a);
                }
                String[] strArr = (String[]) arrayList.toArray(new String[0]);
                e((String[]) Arrays.copyOf(strArr, strArr.length));
                return;
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }

        public Builder(ConnectionSpec connectionSpec) {
            this.f21959a = connectionSpec.f21955a;
            this.f21960b = connectionSpec.f21957c;
            this.f21961c = connectionSpec.f21958d;
            this.f21962d = connectionSpec.f21956b;
        }
    }
}
