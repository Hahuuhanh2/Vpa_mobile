package okhttp3.internal.connection;

import java.security.cert.Certificate;
import java.util.List;
import okhttp3.Address;
import okhttp3.CertificatePinner;
import okhttp3.Handshake;
import okhttp3.internal.tls.CertificateChainCleaner;
import rk.a;
import sk.j;
import sk.k;

/* compiled from: RealConnection.kt */
final class RealConnection$connectTls$1 extends k implements a<List<? extends Certificate>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CertificatePinner f22288a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Handshake f22289b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Address f22290c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RealConnection$connectTls$1(CertificatePinner certificatePinner, Handshake handshake, Address address) {
        super(0);
        this.f22288a = certificatePinner;
        this.f22289b = handshake;
        this.f22290c = address;
    }

    public final Object invoke() {
        CertificateChainCleaner certificateChainCleaner = this.f22288a.f21925b;
        j.c(certificateChainCleaner);
        return certificateChainCleaner.a(this.f22290c.f21901i.f22010d, this.f22289b.a());
    }
}
