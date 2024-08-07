package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzdf;
import k7.b;
import y6.j;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.5.1 */
final class zzeo extends zzdf.zza {
    private final /* synthetic */ Bundle zzc;
    private final /* synthetic */ Activity zzd;
    private final /* synthetic */ zzdf.zzd zze;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzeo(zzdf.zzd zzd2, Bundle bundle, Activity activity) {
        super(zzdf.this);
        this.zzc = bundle;
        this.zzd = activity;
        this.zze = zzd2;
    }

    public final void zza() {
        Bundle bundle;
        if (this.zzc != null) {
            bundle = new Bundle();
            if (this.zzc.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = this.zzc.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        zzcu zza = zzdf.this.zzj;
        j.f(zza);
        zza.onActivityCreated(new b(this.zzd), bundle, this.zzb);
    }
}
