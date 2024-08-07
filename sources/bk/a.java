package bk;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.exceptions.OnErrorNotImplementedException;
import io.reactivex.rxjava3.exceptions.UndeliverableException;

/* compiled from: RxJavaPlugins */
public final class a {
    public static void a(Throwable th2) {
        if (th2 == null) {
            int i10 = zj.a.f23782a;
            th2 = new NullPointerException("onError called with a null Throwable. Null values are generally not allowed in 3.x operators and sources.");
        } else {
            boolean z10 = true;
            if (!(th2 instanceof OnErrorNotImplementedException) && !(th2 instanceof MissingBackpressureException) && !(th2 instanceof IllegalStateException) && !(th2 instanceof NullPointerException) && !(th2 instanceof IllegalArgumentException) && !(th2 instanceof CompositeException)) {
                z10 = false;
            }
            if (!z10) {
                th2 = new UndeliverableException(th2);
            }
        }
        th2.printStackTrace();
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th2);
    }
}
