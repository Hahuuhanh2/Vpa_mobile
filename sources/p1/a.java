package p1;

import android.hardware.fingerprint.FingerprintManager;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import p1.b;
import q.l;
import q.n;
import r2.p;

/* compiled from: FingerprintManagerCompat */
public final class a extends FingerprintManager.AuthenticationCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b.C0175b f13902a;

    public a(q.a aVar) {
        this.f13902a = aVar;
    }

    public final void onAuthenticationError(int i10, CharSequence charSequence) {
        ((q.a) this.f13902a).f14173a.f14176c.a(i10, charSequence);
    }

    public final void onAuthenticationFailed() {
        ((q.a) this.f13902a).f14173a.f14176c.b();
    }

    public final void onAuthenticationHelp(int i10, CharSequence charSequence) {
        n.a aVar = (n.a) ((q.a) this.f13902a).f14173a.f14176c;
        if (aVar.f14247a.get() != null) {
            n nVar = aVar.f14247a.get();
            if (nVar.f14241u == null) {
                nVar.f14241u = new p<>();
            }
            n.j(nVar.f14241u, charSequence);
        }
    }

    public final void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
        l.c cVar;
        b.C0175b bVar = this.f13902a;
        b.c f10 = b.a.f(b.a.b(authenticationResult));
        q.a aVar = (q.a) bVar;
        aVar.getClass();
        l.c cVar2 = null;
        if (f10 != null) {
            Cipher cipher = f10.f13905b;
            if (cipher != null) {
                cVar = new l.c(cipher);
            } else {
                Signature signature = f10.f13904a;
                if (signature != null) {
                    cVar = new l.c(signature);
                } else {
                    Mac mac = f10.f13906c;
                    if (mac != null) {
                        cVar2 = new l.c(mac);
                    }
                }
            }
            cVar2 = cVar;
        }
        aVar.f14173a.f14176c.c(new l.b(cVar2, 2));
    }
}
