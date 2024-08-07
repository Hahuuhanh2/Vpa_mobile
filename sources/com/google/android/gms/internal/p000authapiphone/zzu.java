package com.google.android.gms.internal.p000authapiphone;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.tasks.Task;
import q6.a;
import w6.o;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzu  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.4.0 */
public final class zzu extends a {
    public zzu(Context context) {
        super(context);
    }

    public final Task<Void> startSmsRetriever() {
        o.a aVar = new o.a();
        aVar.f16639a = new zzx(this);
        aVar.f16641c = new Feature[]{zzaa.zzb};
        return doWrite(aVar.a());
    }

    public final Task<Void> startSmsUserConsent(String str) {
        o.a aVar = new o.a();
        aVar.f16639a = new zzw(this, str);
        aVar.f16641c = new Feature[]{zzaa.zzc};
        return doWrite(aVar.a());
    }

    public zzu(Activity activity) {
        super(activity);
    }
}
