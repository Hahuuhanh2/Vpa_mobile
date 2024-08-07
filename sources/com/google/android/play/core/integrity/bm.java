package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.af;
import s8.b0;

/* compiled from: com.google.android.play:integrity@@1.3.0 */
abstract class bm extends b0 {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ bn f7267f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bm(bn bnVar, TaskCompletionSource taskCompletionSource) {
        super(taskCompletionSource);
        this.f7267f = bnVar;
    }

    public final void a(Exception exc) {
        if (!(exc instanceof af)) {
            super.a(exc);
        } else if (bn.k(this.f7267f)) {
            super.a(new StandardIntegrityException(-2, exc));
        } else {
            super.a(new StandardIntegrityException(-9, exc));
        }
    }
}
