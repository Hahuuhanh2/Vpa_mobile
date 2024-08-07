package okhttp3.internal.connection;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import okhttp3.Handshake;
import rk.a;
import sk.j;
import sk.k;

/* compiled from: RealConnection.kt */
final class RealConnection$connectTls$2 extends k implements a<List<? extends X509Certificate>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RealConnection f22291a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RealConnection$connectTls$2(RealConnection realConnection) {
        super(0);
        this.f22291a = realConnection;
    }

    public final Object invoke() {
        Handshake handshake = this.f22291a.f22274e;
        j.c(handshake);
        List<Certificate> a10 = handshake.a();
        ArrayList arrayList = new ArrayList(fk.j.H0(a10));
        for (Certificate certificate : a10) {
            j.d(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            arrayList.add((X509Certificate) certificate);
        }
        return arrayList;
    }
}
