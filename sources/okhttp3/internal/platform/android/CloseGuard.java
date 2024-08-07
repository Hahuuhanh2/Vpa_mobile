package okhttp3.internal.platform.android;

import java.lang.reflect.Method;

/* compiled from: CloseGuard.kt */
public final class CloseGuard {

    /* renamed from: d  reason: collision with root package name */
    public static final Companion f22583d = new Companion(0);

    /* renamed from: a  reason: collision with root package name */
    public final Method f22584a;

    /* renamed from: b  reason: collision with root package name */
    public final Method f22585b;

    /* renamed from: c  reason: collision with root package name */
    public final Method f22586c;

    /* compiled from: CloseGuard.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i10) {
            this();
        }
    }

    public CloseGuard(Method method, Method method2, Method method3) {
        this.f22584a = method;
        this.f22585b = method2;
        this.f22586c = method3;
    }
}
