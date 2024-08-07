package okhttp3;

import fk.p;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import okhttp3.internal.tls.CertificateChainCleaner;
import rk.a;
import sk.j;
import yk.h;

/* compiled from: CertificatePinner.kt */
public final class CertificatePinner {

    /* renamed from: c  reason: collision with root package name */
    public static final Companion f21922c = new Companion(0);

    /* renamed from: d  reason: collision with root package name */
    public static final CertificatePinner f21923d = new CertificatePinner(p.d1(new Builder().f21926a), (CertificateChainCleaner) null);

    /* renamed from: a  reason: collision with root package name */
    public final Set<Pin> f21924a;

    /* renamed from: b  reason: collision with root package name */
    public final CertificateChainCleaner f21925b;

    /* compiled from: CertificatePinner.kt */
    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList f21926a = new ArrayList();
    }

    /* compiled from: CertificatePinner.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i10) {
            this();
        }
    }

    /* compiled from: CertificatePinner.kt */
    public static final class Pin {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Pin)) {
                return false;
            }
            Pin pin = (Pin) obj;
            pin.getClass();
            if (!j.a((Object) null, (Object) null)) {
                return false;
            }
            pin.getClass();
            if (!j.a((Object) null, (Object) null)) {
                return false;
            }
            pin.getClass();
            if (!j.a((Object) null, (Object) null)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append((String) null);
            sb2.append('/');
            throw null;
        }
    }

    public CertificatePinner(Set<Pin> set, CertificateChainCleaner certificateChainCleaner) {
        j.f(set, "pins");
        this.f21924a = set;
        this.f21925b = certificateChainCleaner;
    }

    public final void a(String str, List<? extends Certificate> list) {
        j.f(str, "hostname");
        j.f(list, "peerCertificates");
        b(str, new CertificatePinner$check$1(this, list, str));
    }

    public final void b(String str, a<? extends List<? extends X509Certificate>> aVar) {
        j.f(str, "hostname");
        Iterator<T> it = this.f21924a.iterator();
        if (it.hasNext()) {
            ((Pin) it.next()).getClass();
            boolean unused = h.L0((String) null, "**.", false);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CertificatePinner) {
            CertificatePinner certificatePinner = (CertificatePinner) obj;
            if (!j.a(certificatePinner.f21924a, this.f21924a) || !j.a(certificatePinner.f21925b, this.f21925b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (this.f21924a.hashCode() + 1517) * 41;
        CertificateChainCleaner certificateChainCleaner = this.f21925b;
        if (certificateChainCleaner != null) {
            i10 = certificateChainCleaner.hashCode();
        } else {
            i10 = 0;
        }
        return hashCode + i10;
    }
}
