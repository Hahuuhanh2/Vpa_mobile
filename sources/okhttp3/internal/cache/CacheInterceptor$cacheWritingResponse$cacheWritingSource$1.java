package okhttp3.internal.cache;

import java.util.concurrent.TimeUnit;
import ll.c0;
import ll.d0;
import ll.f;
import okhttp3.internal.Util;
import sk.j;

/* compiled from: CacheInterceptor.kt */
public final class CacheInterceptor$cacheWritingResponse$cacheWritingSource$1 implements c0 {

    /* renamed from: a  reason: collision with root package name */
    public boolean f22182a;

    public CacheInterceptor$cacheWritingResponse$cacheWritingSource$1() {
        throw null;
    }

    public final long J0(f fVar, long j10) {
        j.f(fVar, "sink");
        throw null;
    }

    public final void close() {
        if (this.f22182a || Util.g(this, TimeUnit.MILLISECONDS)) {
            throw null;
        }
        this.f22182a = true;
        throw null;
    }

    public final d0 f() {
        throw null;
    }
}
