package v6;

import java.util.concurrent.TimeUnit;
import v6.e;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public abstract class c<R extends e> {

    /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
    public interface a {
        void a();
    }

    public void addStatusListener(a aVar) {
        throw new UnsupportedOperationException();
    }

    public abstract R await();

    public abstract R await(long j10, TimeUnit timeUnit);

    public abstract void cancel();

    public abstract boolean isCanceled();

    public abstract void setResultCallback(f<? super R> fVar);

    public abstract void setResultCallback(f<? super R> fVar, long j10, TimeUnit timeUnit);

    public <S extends e> h<S> then(g<? super R, ? extends S> gVar) {
        throw new UnsupportedOperationException();
    }
}
