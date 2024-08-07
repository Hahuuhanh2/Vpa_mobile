package okhttp3;

import android.support.v4.media.a;
import java.util.LinkedHashMap;
import sk.j;
import yk.h;

/* compiled from: CipherSuite.kt */
public final class CipherSuite {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f21932b;

    /* renamed from: c  reason: collision with root package name */
    public static final CipherSuite$Companion$ORDER_BY_NAME$1 f21933c = new CipherSuite$Companion$ORDER_BY_NAME$1();

    /* renamed from: d  reason: collision with root package name */
    public static final LinkedHashMap f21934d = new LinkedHashMap();

    /* renamed from: e  reason: collision with root package name */
    public static final CipherSuite f21935e;

    /* renamed from: f  reason: collision with root package name */
    public static final CipherSuite f21936f;

    /* renamed from: g  reason: collision with root package name */
    public static final CipherSuite f21937g;

    /* renamed from: h  reason: collision with root package name */
    public static final CipherSuite f21938h;

    /* renamed from: i  reason: collision with root package name */
    public static final CipherSuite f21939i;

    /* renamed from: j  reason: collision with root package name */
    public static final CipherSuite f21940j;

    /* renamed from: k  reason: collision with root package name */
    public static final CipherSuite f21941k;

    /* renamed from: l  reason: collision with root package name */
    public static final CipherSuite f21942l;

    /* renamed from: m  reason: collision with root package name */
    public static final CipherSuite f21943m;

    /* renamed from: n  reason: collision with root package name */
    public static final CipherSuite f21944n;

    /* renamed from: o  reason: collision with root package name */
    public static final CipherSuite f21945o;

    /* renamed from: p  reason: collision with root package name */
    public static final CipherSuite f21946p;

    /* renamed from: q  reason: collision with root package name */
    public static final CipherSuite f21947q;

    /* renamed from: r  reason: collision with root package name */
    public static final CipherSuite f21948r;

    /* renamed from: s  reason: collision with root package name */
    public static final CipherSuite f21949s;

    /* renamed from: t  reason: collision with root package name */
    public static final CipherSuite f21950t;

    /* renamed from: a  reason: collision with root package name */
    public final String f21951a;

    /* compiled from: CipherSuite.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i10) {
            this();
        }

        public static final CipherSuite a(Companion companion, String str) {
            CipherSuite cipherSuite = new CipherSuite(str);
            CipherSuite.f21934d.put(str, cipherSuite);
            return cipherSuite;
        }

        public static String c(String str) {
            if (h.L0(str, "TLS_", false)) {
                StringBuilder q10 = a.q("SSL_");
                String substring = str.substring(4);
                j.e(substring, "this as java.lang.String).substring(startIndex)");
                q10.append(substring);
                return q10.toString();
            } else if (!h.L0(str, "SSL_", false)) {
                return str;
            } else {
                StringBuilder q11 = a.q("TLS_");
                String substring2 = str.substring(4);
                j.e(substring2, "this as java.lang.String).substring(startIndex)");
                q11.append(substring2);
                return q11.toString();
            }
        }

        public final synchronized CipherSuite b(String str) {
            CipherSuite cipherSuite;
            j.f(str, "javaName");
            LinkedHashMap linkedHashMap = CipherSuite.f21934d;
            cipherSuite = (CipherSuite) linkedHashMap.get(str);
            if (cipherSuite == null) {
                cipherSuite = (CipherSuite) linkedHashMap.get(c(str));
                if (cipherSuite == null) {
                    cipherSuite = new CipherSuite(str);
                }
                linkedHashMap.put(str, cipherSuite);
            }
            return cipherSuite;
        }
    }

    static {
        Companion companion = new Companion(0);
        f21932b = companion;
        Companion.a(companion, "SSL_RSA_WITH_NULL_MD5");
        Companion.a(companion, "SSL_RSA_WITH_NULL_SHA");
        Companion.a(companion, "SSL_RSA_EXPORT_WITH_RC4_40_MD5");
        Companion.a(companion, "SSL_RSA_WITH_RC4_128_MD5");
        Companion.a(companion, "SSL_RSA_WITH_RC4_128_SHA");
        Companion.a(companion, "SSL_RSA_EXPORT_WITH_DES40_CBC_SHA");
        Companion.a(companion, "SSL_RSA_WITH_DES_CBC_SHA");
        f21935e = Companion.a(companion, "SSL_RSA_WITH_3DES_EDE_CBC_SHA");
        Companion.a(companion, "SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA");
        Companion.a(companion, "SSL_DHE_DSS_WITH_DES_CBC_SHA");
        Companion.a(companion, "SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA");
        Companion.a(companion, "SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA");
        Companion.a(companion, "SSL_DHE_RSA_WITH_DES_CBC_SHA");
        Companion.a(companion, "SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA");
        Companion.a(companion, "SSL_DH_anon_EXPORT_WITH_RC4_40_MD5");
        Companion.a(companion, "SSL_DH_anon_WITH_RC4_128_MD5");
        Companion.a(companion, "SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA");
        Companion.a(companion, "SSL_DH_anon_WITH_DES_CBC_SHA");
        Companion.a(companion, "SSL_DH_anon_WITH_3DES_EDE_CBC_SHA");
        Companion.a(companion, "TLS_KRB5_WITH_DES_CBC_SHA");
        Companion.a(companion, "TLS_KRB5_WITH_3DES_EDE_CBC_SHA");
        Companion.a(companion, "TLS_KRB5_WITH_RC4_128_SHA");
        Companion.a(companion, "TLS_KRB5_WITH_DES_CBC_MD5");
        Companion.a(companion, "TLS_KRB5_WITH_3DES_EDE_CBC_MD5");
        Companion.a(companion, "TLS_KRB5_WITH_RC4_128_MD5");
        Companion.a(companion, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA");
        Companion.a(companion, "TLS_KRB5_EXPORT_WITH_RC4_40_SHA");
        Companion.a(companion, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5");
        Companion.a(companion, "TLS_KRB5_EXPORT_WITH_RC4_40_MD5");
        f21936f = Companion.a(companion, "TLS_RSA_WITH_AES_128_CBC_SHA");
        Companion.a(companion, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA");
        Companion.a(companion, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA");
        Companion.a(companion, "TLS_DH_anon_WITH_AES_128_CBC_SHA");
        f21937g = Companion.a(companion, "TLS_RSA_WITH_AES_256_CBC_SHA");
        Companion.a(companion, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA");
        Companion.a(companion, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA");
        Companion.a(companion, "TLS_DH_anon_WITH_AES_256_CBC_SHA");
        Companion.a(companion, "TLS_RSA_WITH_NULL_SHA256");
        Companion.a(companion, "TLS_RSA_WITH_AES_128_CBC_SHA256");
        Companion.a(companion, "TLS_RSA_WITH_AES_256_CBC_SHA256");
        Companion.a(companion, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA256");
        Companion.a(companion, "TLS_RSA_WITH_CAMELLIA_128_CBC_SHA");
        Companion.a(companion, "TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA");
        Companion.a(companion, "TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA");
        Companion.a(companion, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA256");
        Companion.a(companion, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA256");
        Companion.a(companion, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA256");
        Companion.a(companion, "TLS_DH_anon_WITH_AES_128_CBC_SHA256");
        Companion.a(companion, "TLS_DH_anon_WITH_AES_256_CBC_SHA256");
        Companion.a(companion, "TLS_RSA_WITH_CAMELLIA_256_CBC_SHA");
        Companion.a(companion, "TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA");
        Companion.a(companion, "TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA");
        Companion.a(companion, "TLS_PSK_WITH_RC4_128_SHA");
        Companion.a(companion, "TLS_PSK_WITH_3DES_EDE_CBC_SHA");
        Companion.a(companion, "TLS_PSK_WITH_AES_128_CBC_SHA");
        Companion.a(companion, "TLS_PSK_WITH_AES_256_CBC_SHA");
        Companion.a(companion, "TLS_RSA_WITH_SEED_CBC_SHA");
        f21938h = Companion.a(companion, "TLS_RSA_WITH_AES_128_GCM_SHA256");
        f21939i = Companion.a(companion, "TLS_RSA_WITH_AES_256_GCM_SHA384");
        Companion.a(companion, "TLS_DHE_RSA_WITH_AES_128_GCM_SHA256");
        Companion.a(companion, "TLS_DHE_RSA_WITH_AES_256_GCM_SHA384");
        Companion.a(companion, "TLS_DHE_DSS_WITH_AES_128_GCM_SHA256");
        Companion.a(companion, "TLS_DHE_DSS_WITH_AES_256_GCM_SHA384");
        Companion.a(companion, "TLS_DH_anon_WITH_AES_128_GCM_SHA256");
        Companion.a(companion, "TLS_DH_anon_WITH_AES_256_GCM_SHA384");
        Companion.a(companion, "TLS_EMPTY_RENEGOTIATION_INFO_SCSV");
        Companion.a(companion, "TLS_FALLBACK_SCSV");
        Companion.a(companion, "TLS_ECDH_ECDSA_WITH_NULL_SHA");
        Companion.a(companion, "TLS_ECDH_ECDSA_WITH_RC4_128_SHA");
        Companion.a(companion, "TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA");
        Companion.a(companion, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA");
        Companion.a(companion, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA");
        Companion.a(companion, "TLS_ECDHE_ECDSA_WITH_NULL_SHA");
        Companion.a(companion, "TLS_ECDHE_ECDSA_WITH_RC4_128_SHA");
        Companion.a(companion, "TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA");
        Companion.a(companion, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA");
        Companion.a(companion, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA");
        Companion.a(companion, "TLS_ECDH_RSA_WITH_NULL_SHA");
        Companion.a(companion, "TLS_ECDH_RSA_WITH_RC4_128_SHA");
        Companion.a(companion, "TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA");
        Companion.a(companion, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA");
        Companion.a(companion, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA");
        Companion.a(companion, "TLS_ECDHE_RSA_WITH_NULL_SHA");
        Companion.a(companion, "TLS_ECDHE_RSA_WITH_RC4_128_SHA");
        Companion.a(companion, "TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA");
        f21940j = Companion.a(companion, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA");
        f21941k = Companion.a(companion, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA");
        Companion.a(companion, "TLS_ECDH_anon_WITH_NULL_SHA");
        Companion.a(companion, "TLS_ECDH_anon_WITH_RC4_128_SHA");
        Companion.a(companion, "TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA");
        Companion.a(companion, "TLS_ECDH_anon_WITH_AES_128_CBC_SHA");
        Companion.a(companion, "TLS_ECDH_anon_WITH_AES_256_CBC_SHA");
        Companion.a(companion, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256");
        Companion.a(companion, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384");
        Companion.a(companion, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256");
        Companion.a(companion, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384");
        Companion.a(companion, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256");
        Companion.a(companion, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384");
        Companion.a(companion, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256");
        Companion.a(companion, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384");
        f21942l = Companion.a(companion, "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256");
        f21943m = Companion.a(companion, "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384");
        Companion.a(companion, "TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256");
        Companion.a(companion, "TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384");
        f21944n = Companion.a(companion, "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");
        f21945o = Companion.a(companion, "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384");
        Companion.a(companion, "TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256");
        Companion.a(companion, "TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384");
        Companion.a(companion, "TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA");
        Companion.a(companion, "TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA");
        f21946p = Companion.a(companion, "TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
        f21947q = Companion.a(companion, "TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256");
        Companion.a(companion, "TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
        Companion.a(companion, "TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256");
        f21948r = Companion.a(companion, "TLS_AES_128_GCM_SHA256");
        f21949s = Companion.a(companion, "TLS_AES_256_GCM_SHA384");
        f21950t = Companion.a(companion, "TLS_CHACHA20_POLY1305_SHA256");
        Companion.a(companion, "TLS_AES_128_CCM_SHA256");
        Companion.a(companion, "TLS_AES_128_CCM_8_SHA256");
    }

    public CipherSuite(String str) {
        this.f21951a = str;
    }

    public final String toString() {
        return this.f21951a;
    }
}
