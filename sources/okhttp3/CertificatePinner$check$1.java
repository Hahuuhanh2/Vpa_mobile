package okhttp3;

import fk.j;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import okhttp3.internal.tls.CertificateChainCleaner;
import rk.a;
import sk.k;

/* compiled from: CertificatePinner.kt */
public final class CertificatePinner$check$1 extends k implements a<List<? extends X509Certificate>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CertificatePinner f21927a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ List<Certificate> f21928b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f21929c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CertificatePinner$check$1(CertificatePinner certificatePinner, List<? extends Certificate> list, String str) {
        super(0);
        this.f21927a = certificatePinner;
        this.f21928b = list;
        this.f21929c = str;
    }

    public final Object invoke() {
        List<Certificate> list;
        CertificateChainCleaner certificateChainCleaner = this.f21927a.f21925b;
        if (certificateChainCleaner == null || (list = certificateChainCleaner.a(this.f21929c, this.f21928b)) == null) {
            list = this.f21928b;
        }
        ArrayList arrayList = new ArrayList(j.H0(list));
        for (Certificate certificate : list) {
            sk.j.d(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            arrayList.add((X509Certificate) certificate);
        }
        return arrayList;
    }
}
