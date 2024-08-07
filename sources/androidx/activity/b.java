package androidx.activity;

import android.content.Intent;
import android.content.IntentSender;
import androidx.activity.ComponentActivity;

/* compiled from: ComponentActivity */
public final class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f300a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ IntentSender.SendIntentException f301b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ComponentActivity.a f302c;

    public b(ComponentActivity.a aVar, int i10, IntentSender.SendIntentException sendIntentException) {
        this.f302c = aVar;
        this.f300a = i10;
        this.f301b = sendIntentException;
    }

    public final void run() {
        this.f302c.a(this.f300a, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f301b));
    }
}
