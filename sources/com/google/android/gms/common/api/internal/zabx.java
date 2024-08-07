package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.internal.base.zau;
import w6.h1;
import w6.j1;
import w6.t;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class zabx extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public Context f5357a;

    /* renamed from: b  reason: collision with root package name */
    public final h1 f5358b;

    public zabx(h1 h1Var) {
        this.f5358b = h1Var;
    }

    public final void onReceive(Context context, Intent intent) {
        String str;
        Uri data = intent.getData();
        if (data != null) {
            str = data.getSchemeSpecificPart();
        } else {
            str = null;
        }
        if ("com.google.android.gms".equals(str)) {
            h1 h1Var = this.f5358b;
            j1 j1Var = h1Var.f16603b.f16608b;
            j1Var.f16615b.set((Object) null);
            zau zau = ((t) j1Var).f16657f.f16582n;
            zau.sendMessage(zau.obtainMessage(3));
            if (h1Var.f16602a.isShowing()) {
                h1Var.f16602a.dismiss();
            }
            synchronized (this) {
                Context context2 = this.f5357a;
                if (context2 != null) {
                    context2.unregisterReceiver(this);
                }
                this.f5357a = null;
            }
        }
    }
}
