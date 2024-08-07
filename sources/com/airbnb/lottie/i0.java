package com.airbnb.lottie;

import android.os.Handler;
import android.os.Looper;
import d.d;
import java.util.LinkedHashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* compiled from: LottieTask */
public final class i0<T> {

    /* renamed from: e  reason: collision with root package name */
    public static ExecutorService f4847e = Executors.newCachedThreadPool();

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashSet f4848a;

    /* renamed from: b  reason: collision with root package name */
    public final LinkedHashSet f4849b;

    /* renamed from: c  reason: collision with root package name */
    public final Handler f4850c;

    /* renamed from: d  reason: collision with root package name */
    public volatile h0<T> f4851d;

    /* compiled from: LottieTask */
    public class a extends FutureTask<h0<T>> {
        public a(Callable<h0<T>> callable) {
            super(callable);
        }

        public final void done() {
            if (!isCancelled()) {
                try {
                    i0.this.a((h0) get());
                } catch (InterruptedException | ExecutionException e10) {
                    i0.this.a(new h0(e10));
                }
            }
        }
    }

    public i0() {
        throw null;
    }

    public i0(Callable<h0<T>> callable, boolean z10) {
        this.f4848a = new LinkedHashSet(1);
        this.f4849b = new LinkedHashSet(1);
        this.f4850c = new Handler(Looper.getMainLooper());
        this.f4851d = null;
        if (z10) {
            try {
                a(callable.call());
            } catch (Throwable th2) {
                a(new h0(th2));
            }
        } else {
            f4847e.execute(new a(callable));
        }
    }

    public final void a(h0<T> h0Var) {
        if (this.f4851d == null) {
            this.f4851d = h0Var;
            this.f4850c.post(new d(this, 24));
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }
}
