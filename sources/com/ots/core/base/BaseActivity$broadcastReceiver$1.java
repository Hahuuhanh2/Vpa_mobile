package com.ots.core.base;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import ef.b;
import ef.c;
import lf.e;
import sk.j;

/* compiled from: BaseActivity.kt */
public final class BaseActivity$broadcastReceiver$1 extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BaseActivity<DB> f8334a;

    public BaseActivity$broadcastReceiver$1(BaseActivity<DB> baseActivity) {
        this.f8334a = baseActivity;
    }

    public final void onReceive(Context context, Intent intent) {
        j.f(context, "context");
        j.f(intent, "intent");
        BaseActivity<DB> baseActivity = this.f8334a;
        int i10 = BaseActivity.N;
        baseActivity.getClass();
        try {
            Object systemService = baseActivity.getSystemService("connectivity");
            j.d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ((ConnectivityManager) systemService).registerNetworkCallback(new NetworkRequest.Builder().build(), new b(baseActivity));
            e.b(baseActivity, new c(baseActivity));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
