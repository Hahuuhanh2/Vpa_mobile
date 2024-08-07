package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.measurement.zzdf;
import k7.b;
import n7.a;
import y6.j;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.5.1 */
final class zzdi extends zzdf.zza {
    private final /* synthetic */ String zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ Context zze;
    private final /* synthetic */ Bundle zzf;
    private final /* synthetic */ zzdf zzg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzdi(zzdf zzdf, String str, String str2, Context context, Bundle bundle) {
        super(zzdf);
        this.zzc = str;
        this.zzd = str2;
        this.zze = context;
        this.zzf = bundle;
        this.zzg = zzdf;
    }

    public final void zza() {
        String str;
        String str2;
        String str3;
        boolean z10;
        try {
            if (this.zzg.zzc(this.zzc, this.zzd)) {
                String str4 = this.zzd;
                str2 = this.zzc;
                str = str4;
                str3 = this.zzg.zzc;
            } else {
                str3 = null;
                str2 = null;
                str = null;
            }
            j.f(this.zze);
            zzdf zzdf = this.zzg;
            zzdf.zzj = zzdf.zza(this.zze, true);
            if (this.zzg.zzj == null) {
                String unused = this.zzg.zzc;
                return;
            }
            int a10 = DynamiteModule.a(this.zze, "com.google.android.gms.measurement.dynamite");
            int d10 = DynamiteModule.d(this.zze, "com.google.android.gms.measurement.dynamite", false);
            int max = Math.max(a10, d10);
            if (d10 < a10) {
                z10 = true;
            } else {
                z10 = false;
            }
            zzdd zzdd = new zzdd(84002, (long) max, z10, str3, str2, str, this.zzf, a.a(this.zze));
            zzcu zza = this.zzg.zzj;
            j.f(zza);
            zza.initialize(new b(this.zze), zzdd, this.zza);
        } catch (Exception e10) {
            this.zzg.zza(e10, true, false);
        }
    }
}
