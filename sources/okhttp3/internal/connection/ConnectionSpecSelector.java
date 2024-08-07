package okhttp3.internal.connection;

import hk.a;
import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.CipherSuite;
import okhttp3.CipherSuite$Companion$ORDER_BY_NAME$1;
import okhttp3.ConnectionSpec;
import okhttp3.internal.Util;
import sk.j;

/* compiled from: ConnectionSpecSelector.kt */
public final class ConnectionSpecSelector {

    /* renamed from: a  reason: collision with root package name */
    public final List<ConnectionSpec> f22216a;

    /* renamed from: b  reason: collision with root package name */
    public int f22217b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f22218c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f22219d;

    public ConnectionSpecSelector(List<ConnectionSpec> list) {
        j.f(list, "connectionSpecs");
        this.f22216a = list;
    }

    public final ConnectionSpec a(SSLSocket sSLSocket) {
        ConnectionSpec connectionSpec;
        boolean z10;
        String[] strArr;
        String[] strArr2;
        boolean z11;
        int i10 = this.f22217b;
        int size = this.f22216a.size();
        while (true) {
            if (i10 >= size) {
                connectionSpec = null;
                break;
            }
            connectionSpec = this.f22216a.get(i10);
            if (connectionSpec.b(sSLSocket)) {
                this.f22217b = i10 + 1;
                break;
            }
            i10++;
        }
        if (connectionSpec != null) {
            int i11 = this.f22217b;
            int size2 = this.f22216a.size();
            while (true) {
                if (i11 >= size2) {
                    z10 = false;
                    break;
                } else if (this.f22216a.get(i11).b(sSLSocket)) {
                    z10 = true;
                    break;
                } else {
                    i11++;
                }
            }
            this.f22218c = z10;
            boolean z12 = this.f22219d;
            if (connectionSpec.f21957c != null) {
                String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
                j.e(enabledCipherSuites, "sslSocket.enabledCipherSuites");
                String[] strArr3 = connectionSpec.f21957c;
                CipherSuite.f21932b.getClass();
                strArr = Util.o(enabledCipherSuites, strArr3, CipherSuite.f21933c);
            } else {
                strArr = sSLSocket.getEnabledCipherSuites();
            }
            if (connectionSpec.f21958d != null) {
                String[] enabledProtocols = sSLSocket.getEnabledProtocols();
                j.e(enabledProtocols, "sslSocket.enabledProtocols");
                strArr2 = Util.o(enabledProtocols, connectionSpec.f21958d, a.f20530a);
            } else {
                strArr2 = sSLSocket.getEnabledProtocols();
            }
            String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
            j.e(supportedCipherSuites, "supportedCipherSuites");
            CipherSuite.f21932b.getClass();
            CipherSuite$Companion$ORDER_BY_NAME$1 cipherSuite$Companion$ORDER_BY_NAME$1 = CipherSuite.f21933c;
            byte[] bArr = Util.f22171a;
            j.f(cipherSuite$Companion$ORDER_BY_NAME$1, "comparator");
            int length = supportedCipherSuites.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    i12 = -1;
                    break;
                }
                if (cipherSuite$Companion$ORDER_BY_NAME$1.compare(supportedCipherSuites[i12], "TLS_FALLBACK_SCSV") == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    break;
                }
                i12++;
            }
            if (z12 && i12 != -1) {
                j.e(strArr, "cipherSuitesIntersection");
                String str = supportedCipherSuites[i12];
                j.e(str, "supportedCipherSuites[indexOfFallbackScsv]");
                Object[] copyOf = Arrays.copyOf(strArr, strArr.length + 1);
                j.e(copyOf, "copyOf(this, newSize)");
                strArr = (String[]) copyOf;
                strArr[strArr.length - 1] = str;
            }
            ConnectionSpec.Builder builder = new ConnectionSpec.Builder(connectionSpec);
            j.e(strArr, "cipherSuitesIntersection");
            builder.b((String[]) Arrays.copyOf(strArr, strArr.length));
            j.e(strArr2, "tlsVersionsIntersection");
            builder.e((String[]) Arrays.copyOf(strArr2, strArr2.length));
            ConnectionSpec a10 = builder.a();
            if (a10.c() != null) {
                sSLSocket.setEnabledProtocols(a10.f21958d);
            }
            if (a10.a() != null) {
                sSLSocket.setEnabledCipherSuites(a10.f21957c);
            }
            return connectionSpec;
        }
        StringBuilder q10 = android.support.v4.media.a.q("Unable to find acceptable protocols. isFallback=");
        q10.append(this.f22219d);
        q10.append(", modes=");
        q10.append(this.f22216a);
        q10.append(", supported protocols=");
        String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
        j.c(enabledProtocols2);
        String arrays = Arrays.toString(enabledProtocols2);
        j.e(arrays, "toString(this)");
        q10.append(arrays);
        throw new UnknownServiceException(q10.toString());
    }
}
