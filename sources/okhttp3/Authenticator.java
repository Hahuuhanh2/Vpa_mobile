package okhttp3;

import okhttp3.internal.authenticator.JavaNetAuthenticator;
import sk.j;

/* compiled from: Authenticator.kt */
public interface Authenticator {

    /* renamed from: a  reason: collision with root package name */
    public static final Authenticator f21904a = new Companion.AuthenticatorNone();

    /* compiled from: Authenticator.kt */
    public static final class Companion {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int f21905a = 0;

        /* compiled from: Authenticator.kt */
        public static final class AuthenticatorNone implements Authenticator {
            public final Request a(Route route, Response response) {
                j.f(response, "response");
                return null;
            }
        }

        static {
            new Companion();
        }

        private Companion() {
        }
    }

    static {
        int i10 = Companion.f21905a;
        new JavaNetAuthenticator(0);
    }

    Request a(Route route, Response response);
}
