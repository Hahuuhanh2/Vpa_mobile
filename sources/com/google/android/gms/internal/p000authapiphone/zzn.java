package com.google.android.gms.internal.p000authapiphone;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.b;
import com.google.android.gms.tasks.Task;
import w6.o;
import y6.j;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzn  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.4.0 */
public final class zzn extends b<a.d.c> {
    private static final a.g<zzv> zza;
    private static final a.C0058a<zzv, a.d.c> zzb;
    private static final a<a.d.c> zzc;

    static {
        a.g<zzv> gVar = new a.g<>();
        zza = gVar;
        zzr zzr = new zzr();
        zzb = zzr;
        zzc = new a<>("SmsCodeAutofill.API", zzr, gVar);
    }

    public zzn(Context context) {
        super(context, zzc, null, b.a.f5354c);
    }

    public final Task<Integer> checkPermissionState() {
        o.a aVar = new o.a();
        aVar.f16641c = new Feature[]{zzaa.zza};
        aVar.f16639a = new zzp(this);
        return doRead(aVar.a());
    }

    public final Task<Boolean> hasOngoingSmsRequest(String str) {
        j.f(str);
        j.a("The package name cannot be empty.", !str.isEmpty());
        o.a aVar = new o.a();
        aVar.f16641c = new Feature[]{zzaa.zza};
        aVar.f16639a = new zzo(this, str);
        return doRead(aVar.a());
    }

    public final Task<Void> startSmsCodeRetriever() {
        o.a aVar = new o.a();
        aVar.f16641c = new Feature[]{zzaa.zza};
        aVar.f16639a = new zzm(this);
        return doWrite(aVar.a());
    }

    public zzn(Activity activity) {
        super(activity, zzc, null, b.a.f5354c);
    }
}
