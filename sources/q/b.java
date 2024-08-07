package q;

import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.security.identity.IdentityCredential;
import android.security.identity.PresentationSession;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import q.l;
import q.n;
import q.p;

/* compiled from: AuthenticationCallbackProvider */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public BiometricPrompt.AuthenticationCallback f14174a;

    /* renamed from: b  reason: collision with root package name */
    public a f14175b;

    /* renamed from: c  reason: collision with root package name */
    public final c f14176c;

    /* compiled from: AuthenticationCallbackProvider */
    public static class a {

        /* renamed from: q.b$a$a  reason: collision with other inner class name */
        /* compiled from: AuthenticationCallbackProvider */
        public class C0181a extends BiometricPrompt.AuthenticationCallback {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ c f14177a;

            public C0181a(c cVar) {
                this.f14177a = cVar;
            }

            public void onAuthenticationError(int i10, CharSequence charSequence) {
                this.f14177a.a(i10, charSequence);
            }

            public void onAuthenticationFailed() {
                this.f14177a.b();
            }

            public void onAuthenticationHelp(int i10, CharSequence charSequence) {
            }

            public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
                BiometricPrompt.CryptoObject b10;
                PresentationSession b11;
                IdentityCredential b12;
                l.c cVar = null;
                if (!(authenticationResult == null || (b10 = a.b(authenticationResult)) == null)) {
                    Cipher d10 = p.b.d(b10);
                    if (d10 != null) {
                        cVar = new l.c(d10);
                    } else {
                        Signature f10 = p.b.f(b10);
                        if (f10 != null) {
                            cVar = new l.c(f10);
                        } else {
                            Mac e10 = p.b.e(b10);
                            if (e10 != null) {
                                cVar = new l.c(e10);
                            } else {
                                int i10 = Build.VERSION.SDK_INT;
                                if (i10 >= 30 && (b12 = p.c.b(b10)) != null) {
                                    cVar = new l.c(b12);
                                } else if (i10 >= 33 && (b11 = p.d.b(b10)) != null) {
                                    cVar = new l.c(b11);
                                }
                            }
                        }
                    }
                }
                int i11 = Build.VERSION.SDK_INT;
                int i12 = -1;
                if (i11 >= 30) {
                    if (authenticationResult != null) {
                        i12 = C0182b.a(authenticationResult);
                    }
                } else if (i11 != 29) {
                    i12 = 2;
                }
                this.f14177a.c(new l.b(cVar, i12));
            }
        }

        public static BiometricPrompt.AuthenticationCallback a(c cVar) {
            return new C0181a(cVar);
        }

        public static BiometricPrompt.CryptoObject b(BiometricPrompt.AuthenticationResult authenticationResult) {
            return authenticationResult.getCryptoObject();
        }
    }

    /* renamed from: q.b$b  reason: collision with other inner class name */
    /* compiled from: AuthenticationCallbackProvider */
    public static class C0182b {
        public static int a(BiometricPrompt.AuthenticationResult authenticationResult) {
            return authenticationResult.getAuthenticationType();
        }
    }

    /* compiled from: AuthenticationCallbackProvider */
    public static class c {
        public void a(int i10, CharSequence charSequence) {
            throw null;
        }

        public void b() {
            throw null;
        }

        public void c(l.b bVar) {
            throw null;
        }
    }

    public b(n.a aVar) {
        this.f14176c = aVar;
    }
}
