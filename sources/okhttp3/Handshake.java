package okhttp3;

import ek.g;
import f0.b0;
import fk.r;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import okhttp3.TlsVersion;
import okhttp3.internal.Util;
import rk.a;
import sk.j;

/* compiled from: Handshake.kt */
public final class Handshake {

    /* renamed from: e  reason: collision with root package name */
    public static final Companion f21995e = new Companion(0);

    /* renamed from: a  reason: collision with root package name */
    public final TlsVersion f21996a;

    /* renamed from: b  reason: collision with root package name */
    public final CipherSuite f21997b;

    /* renamed from: c  reason: collision with root package name */
    public final List<Certificate> f21998c;

    /* renamed from: d  reason: collision with root package name */
    public final g f21999d;

    /* compiled from: Handshake.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i10) {
            this();
        }

        public static Handshake a(SSLSession sSLSession) {
            boolean z10;
            List list;
            List list2;
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite != null) {
                if (j.a(cipherSuite, "TLS_NULL_WITH_NULL_NULL")) {
                    z10 = true;
                } else {
                    z10 = j.a(cipherSuite, "SSL_NULL_WITH_NULL_NULL");
                }
                if (!z10) {
                    CipherSuite b10 = CipherSuite.f21932b.b(cipherSuite);
                    String protocol = sSLSession.getProtocol();
                    if (protocol == null) {
                        throw new IllegalStateException("tlsVersion == null".toString());
                    } else if (!j.a("NONE", protocol)) {
                        TlsVersion.f22163b.getClass();
                        TlsVersion a10 = TlsVersion.Companion.a(protocol);
                        try {
                            Certificate[] peerCertificates = sSLSession.getPeerCertificates();
                            if (peerCertificates != null) {
                                list = Util.k(Arrays.copyOf(peerCertificates, peerCertificates.length));
                            } else {
                                list = r.f20213a;
                            }
                        } catch (SSLPeerUnverifiedException unused) {
                            list = r.f20213a;
                        }
                        Certificate[] localCertificates = sSLSession.getLocalCertificates();
                        if (localCertificates != null) {
                            list2 = Util.k(Arrays.copyOf(localCertificates, localCertificates.length));
                        } else {
                            list2 = r.f20213a;
                        }
                        return new Handshake(a10, b10, list2, new Handshake$Companion$handshake$1(list));
                    } else {
                        throw new IOException("tlsVersion == NONE");
                    }
                } else {
                    throw new IOException(b0.r("cipherSuite == ", cipherSuite));
                }
            } else {
                throw new IllegalStateException("cipherSuite == null".toString());
            }
        }
    }

    public Handshake(TlsVersion tlsVersion, CipherSuite cipherSuite, List<? extends Certificate> list, a<? extends List<? extends Certificate>> aVar) {
        j.f(tlsVersion, "tlsVersion");
        j.f(cipherSuite, "cipherSuite");
        j.f(list, "localCertificates");
        this.f21996a = tlsVersion;
        this.f21997b = cipherSuite;
        this.f21998c = list;
        this.f21999d = j7.a.b0(new Handshake$peerCertificates$2(aVar));
    }

    public final List<Certificate> a() {
        return (List) this.f21999d.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Handshake) {
            Handshake handshake = (Handshake) obj;
            if (handshake.f21996a != this.f21996a || !j.a(handshake.f21997b, this.f21997b) || !j.a(handshake.a(), a()) || !j.a(handshake.f21998c, this.f21998c)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f21997b.hashCode();
        int hashCode2 = a().hashCode();
        return this.f21998c.hashCode() + ((hashCode2 + ((hashCode + ((this.f21996a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String str;
        String str2;
        List<Certificate> a10 = a();
        ArrayList arrayList = new ArrayList(fk.j.H0(a10));
        for (Certificate certificate : a10) {
            if (certificate instanceof X509Certificate) {
                str2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                str2 = certificate.getType();
                j.e(str2, "type");
            }
            arrayList.add(str2);
        }
        String obj = arrayList.toString();
        StringBuilder q10 = android.support.v4.media.a.q("Handshake{tlsVersion=");
        q10.append(this.f21996a);
        q10.append(" cipherSuite=");
        q10.append(this.f21997b);
        q10.append(" peerCertificates=");
        q10.append(obj);
        q10.append(" localCertificates=");
        List<Certificate> list = this.f21998c;
        ArrayList arrayList2 = new ArrayList(fk.j.H0(list));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                str = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                str = certificate2.getType();
                j.e(str, "type");
            }
            arrayList2.add(str);
        }
        q10.append(arrayList2);
        q10.append('}');
        return q10.toString();
    }
}
