package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* compiled from: com.google.android.play:integrity@@1.3.0 */
final class ar extends ResultReceiver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ as f7222a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ar(as asVar, Handler handler) {
        super(handler);
        this.f7222a = asVar;
    }

    public final void onReceiveResult(int i10, Bundle bundle) {
        if (i10 == 1) {
            this.f7222a.f7223a.trySetResult(3);
        } else if (i10 == 2) {
            this.f7222a.f7223a.trySetResult(2);
        } else if (i10 == 3) {
            this.f7222a.f7223a.trySetResult(1);
        }
    }
}
