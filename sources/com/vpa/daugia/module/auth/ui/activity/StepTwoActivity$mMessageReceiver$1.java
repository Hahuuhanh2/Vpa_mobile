package com.vpa.daugia.module.auth.ui.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import sk.j;

/* compiled from: StepTwoActivity.kt */
public final class StepTwoActivity$mMessageReceiver$1 extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ StepTwoActivity f19543a;

    public StepTwoActivity$mMessageReceiver$1(StepTwoActivity stepTwoActivity) {
        this.f19543a = stepTwoActivity;
    }

    public final void onReceive(Context context, Intent intent) {
        j.f(context, "context");
        j.f(intent, "intent");
        Bundle extras = intent.getExtras();
        if (extras != null) {
            StepTwoActivity stepTwoActivity = this.f19543a;
            String string = extras.getString("QR_CODE");
            if (string != null) {
                int i10 = StepTwoActivity.V;
                stepTwoActivity.Y(string);
            }
        }
    }
}
