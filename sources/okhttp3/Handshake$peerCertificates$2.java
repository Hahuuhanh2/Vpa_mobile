package okhttp3;

import fk.r;
import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import rk.a;
import sk.k;

/* compiled from: Handshake.kt */
public final class Handshake$peerCertificates$2 extends k implements a<List<? extends Certificate>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a<List<Certificate>> f22001a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Handshake$peerCertificates$2(a<? extends List<? extends Certificate>> aVar) {
        super(0);
        this.f22001a = aVar;
    }

    public final Object invoke() {
        try {
            return this.f22001a.invoke();
        } catch (SSLPeerUnverifiedException unused) {
            return r.f20213a;
        }
    }
}
