package com.google.android.gms.internal.mlkit_common;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.mlkit:common@@18.7.0 */
public abstract class zzbh extends zzaj implements ExecutorService {
    public final boolean awaitTermination(long j10, TimeUnit timeUnit) {
        return zzb().awaitTermination(j10, timeUnit);
    }

    public void execute(Runnable runnable) {
        zzb().execute(runnable);
    }

    public final List invokeAll(Collection collection) {
        return zzb().invokeAll(collection);
    }

    public final Object invokeAny(Collection collection) {
        return zzb().invokeAny(collection);
    }

    public final boolean isShutdown() {
        return zzb().isShutdown();
    }

    public final boolean isTerminated() {
        return zzb().isTerminated();
    }

    public final void shutdown() {
        zzb().shutdown();
    }

    public final List shutdownNow() {
        return zzb().shutdownNow();
    }

    public final Future submit(Runnable runnable) {
        return zzb().submit(runnable);
    }

    public /* bridge */ /* synthetic */ Object zza() {
        throw null;
    }

    public abstract ExecutorService zzb();

    public final List invokeAll(Collection collection, long j10, TimeUnit timeUnit) {
        return zzb().invokeAll(collection, j10, timeUnit);
    }

    public final Object invokeAny(Collection collection, long j10, TimeUnit timeUnit) {
        return zzb().invokeAny(collection, j10, timeUnit);
    }

    public final Future submit(Runnable runnable, Object obj) {
        return zzb().submit(runnable, obj);
    }

    public final Future submit(Callable callable) {
        return zzb().submit(callable);
    }
}