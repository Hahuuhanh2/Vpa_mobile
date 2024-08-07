package okhttp3;

import okhttp3.internal.http.RealInterceptorChain;

/* compiled from: Interceptor.kt */
public interface Interceptor {

    /* compiled from: Interceptor.kt */
    public interface Chain {
    }

    /* compiled from: Interceptor.kt */
    public static final class Companion {
        static {
            new Companion();
        }

        private Companion() {
        }
    }

    Response a(RealInterceptorChain realInterceptorChain);
}
