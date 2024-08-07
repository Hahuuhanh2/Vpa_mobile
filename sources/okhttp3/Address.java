package okhttp3;

import android.support.v4.media.a;
import f0.b0;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.HttpUrl;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import sk.j;
import yk.h;

/* compiled from: Address.kt */
public final class Address {

    /* renamed from: a  reason: collision with root package name */
    public final Dns f21893a;

    /* renamed from: b  reason: collision with root package name */
    public final SocketFactory f21894b;

    /* renamed from: c  reason: collision with root package name */
    public final SSLSocketFactory f21895c;

    /* renamed from: d  reason: collision with root package name */
    public final HostnameVerifier f21896d;

    /* renamed from: e  reason: collision with root package name */
    public final CertificatePinner f21897e;

    /* renamed from: f  reason: collision with root package name */
    public final Authenticator f21898f;

    /* renamed from: g  reason: collision with root package name */
    public final Proxy f21899g;

    /* renamed from: h  reason: collision with root package name */
    public final ProxySelector f21900h;

    /* renamed from: i  reason: collision with root package name */
    public final HttpUrl f21901i;

    /* renamed from: j  reason: collision with root package name */
    public final List<Protocol> f21902j;

    /* renamed from: k  reason: collision with root package name */
    public final List<ConnectionSpec> f21903k;

    public Address(String str, int i10, Dns dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, CertificatePinner certificatePinner, Authenticator authenticator, Proxy proxy, List<? extends Protocol> list, List<ConnectionSpec> list2, ProxySelector proxySelector) {
        String str2 = str;
        int i11 = i10;
        SocketFactory socketFactory2 = socketFactory;
        SSLSocketFactory sSLSocketFactory2 = sSLSocketFactory;
        Authenticator authenticator2 = authenticator;
        ProxySelector proxySelector2 = proxySelector;
        j.f(str, "uriHost");
        j.f(dns, "dns");
        j.f(socketFactory2, "socketFactory");
        j.f(authenticator2, "proxyAuthenticator");
        j.f(list, "protocols");
        j.f(list2, "connectionSpecs");
        j.f(proxySelector2, "proxySelector");
        this.f21893a = dns;
        this.f21894b = socketFactory2;
        this.f21895c = sSLSocketFactory2;
        this.f21896d = hostnameVerifier;
        this.f21897e = certificatePinner;
        this.f21898f = authenticator2;
        this.f21899g = proxy;
        this.f21900h = proxySelector2;
        HttpUrl.Builder builder = new HttpUrl.Builder();
        String str3 = sSLSocketFactory2 != null ? "https" : "http";
        boolean z10 = true;
        if (h.G0(str3, "http")) {
            builder.f22018a = "http";
        } else if (h.G0(str3, "https")) {
            builder.f22018a = "https";
        } else {
            throw new IllegalArgumentException(b0.r("unexpected scheme: ", str3));
        }
        String b10 = HostnamesKt.b(HttpUrl.Companion.e(HttpUrl.f22005k, str, 0, 0, false, 7));
        if (b10 != null) {
            builder.f22021d = b10;
            if ((1 > i11 || i11 >= 65536) ? false : z10) {
                builder.f22022e = i11;
                this.f21901i = builder.a();
                this.f21902j = Util.x(list);
                this.f21903k = Util.x(list2);
                return;
            }
            throw new IllegalArgumentException(a.m("unexpected port: ", i10).toString());
        }
        throw new IllegalArgumentException(b0.r("unexpected host: ", str));
    }

    public final boolean a(Address address) {
        j.f(address, "that");
        if (!j.a(this.f21893a, address.f21893a) || !j.a(this.f21898f, address.f21898f) || !j.a(this.f21902j, address.f21902j) || !j.a(this.f21903k, address.f21903k) || !j.a(this.f21900h, address.f21900h) || !j.a(this.f21899g, address.f21899g) || !j.a(this.f21895c, address.f21895c) || !j.a(this.f21896d, address.f21896d) || !j.a(this.f21897e, address.f21897e) || this.f21901i.f22011e != address.f21901i.f22011e) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Address) {
            Address address = (Address) obj;
            if (!j.a(this.f21901i, address.f21901i) || !a(address)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f21893a.hashCode();
        int hashCode2 = this.f21898f.hashCode();
        int hashCode3 = this.f21902j.hashCode();
        int hashCode4 = this.f21903k.hashCode();
        int hashCode5 = this.f21900h.hashCode();
        int hashCode6 = Objects.hashCode(this.f21899g);
        int hashCode7 = Objects.hashCode(this.f21895c);
        int hashCode8 = Objects.hashCode(this.f21896d);
        return Objects.hashCode(this.f21897e) + ((hashCode8 + ((hashCode7 + ((hashCode6 + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + ((this.f21901i.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        Object obj;
        StringBuilder sb2;
        StringBuilder q10 = a.q("Address{");
        q10.append(this.f21901i.f22010d);
        q10.append(':');
        q10.append(this.f21901i.f22011e);
        q10.append(", ");
        if (this.f21899g != null) {
            sb2 = a.q("proxy=");
            obj = this.f21899g;
        } else {
            sb2 = a.q("proxySelector=");
            obj = this.f21900h;
        }
        sb2.append(obj);
        q10.append(sb2.toString());
        q10.append('}');
        return q10.toString();
    }
}
