package lc;

import java.util.concurrent.ThreadFactory;
import t6.h;

/* compiled from: com.google.mlkit:common@@18.7.0 */
public final /* synthetic */ class r implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ThreadFactory f12938a;

    public /* synthetic */ r(ThreadFactory threadFactory) {
        this.f12938a = threadFactory;
    }

    public final Thread newThread(Runnable runnable) {
        return this.f12938a.newThread(new h(runnable, 3));
    }
}
