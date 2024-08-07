package com.google.android.recaptcha.internal;

import al.i1;
import al.j0;
import al.o;
import al.q;
import al.r;
import al.t0;
import hl.a;
import hl.c;
import ik.d;
import ik.f;
import java.util.concurrent.CancellationException;
import rk.l;
import rk.p;
import xk.e;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzar implements j0 {
    private final /* synthetic */ r zza;

    public zzar(r rVar) {
        this.zza = rVar;
    }

    public final o attachChild(q qVar) {
        return this.zza.attachChild(qVar);
    }

    public final Object await(d dVar) {
        return this.zza.await(dVar);
    }

    public final /* synthetic */ void cancel() {
        this.zza.cancel();
    }

    public final void cancel(CancellationException cancellationException) {
        this.zza.cancel(cancellationException);
    }

    public final /* synthetic */ boolean cancel(Throwable th2) {
        return this.zza.cancel(th2);
    }

    public final Object fold(Object obj, p pVar) {
        return this.zza.fold(obj, pVar);
    }

    public final f.b get(f.c cVar) {
        return this.zza.get(cVar);
    }

    public final CancellationException getCancellationException() {
        return this.zza.getCancellationException();
    }

    public final e getChildren() {
        return this.zza.getChildren();
    }

    public final Object getCompleted() {
        return this.zza.getCompleted();
    }

    public final Throwable getCompletionExceptionOrNull() {
        return this.zza.getCompletionExceptionOrNull();
    }

    public final f.c getKey() {
        return this.zza.getKey();
    }

    public final c getOnAwait() {
        return this.zza.getOnAwait();
    }

    public final a getOnJoin() {
        return this.zza.getOnJoin();
    }

    public final i1 getParent() {
        return this.zza.getParent();
    }

    public final t0 invokeOnCompletion(l lVar) {
        return this.zza.invokeOnCompletion(lVar);
    }

    public final t0 invokeOnCompletion(boolean z10, boolean z11, l lVar) {
        return this.zza.invokeOnCompletion(z10, z11, lVar);
    }

    public final boolean isActive() {
        return this.zza.isActive();
    }

    public final boolean isCancelled() {
        return this.zza.isCancelled();
    }

    public final boolean isCompleted() {
        return this.zza.isCompleted();
    }

    public final Object join(d dVar) {
        return this.zza.join(dVar);
    }

    public final f minusKey(f.c cVar) {
        return this.zza.minusKey(cVar);
    }

    public final i1 plus(i1 i1Var) {
        return this.zza.plus(i1Var);
    }

    public final f plus(f fVar) {
        return this.zza.plus(fVar);
    }

    public final boolean start() {
        return this.zza.start();
    }
}
