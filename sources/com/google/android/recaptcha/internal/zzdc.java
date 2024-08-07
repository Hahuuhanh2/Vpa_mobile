package com.google.android.recaptcha.internal;

import android.content.Context;
import sk.e;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzdc {
    private final String zza;
    private String zzb;
    private String zzc;
    private final Context zzd;
    private final zzdg zze;
    private String zzf;
    private Integer zzg;

    private zzdc(zzdc zzdc) {
        this(zzdc.zza, zzdc.zzb, zzdc.zzc, zzdc.zzd, zzdc.zze);
        this.zzf = zzdc.zzf;
        this.zzg = zzdc.zzg;
    }

    private zzdc(String str, String str2, String str3, Context context, zzdg zzdg) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = context;
        this.zze = zzdg;
    }

    public /* synthetic */ zzdc(String str, String str2, String str3, Context context, zzdg zzdg, e eVar) {
        this(str, str2, str3, context, zzdg);
    }

    public final zzdc zza() {
        return new zzdc(this);
    }

    public final zzdc zzb(int i10) {
        this.zzg = Integer.valueOf(i10);
        return this;
    }

    public final zzdc zzc(String str) {
        this.zzf = str;
        return this;
    }

    public final String zzd() {
        return this.zzc;
    }

    public final void zze(zzre zzre) {
        this.zze.zza(zzre);
    }

    public final zzdf zzf(int i10) {
        String str = this.zzb;
        String str2 = this.zzc;
        String str3 = this.zzf;
        zzbw zzbw = new zzbw();
        Context context = this.zzd;
        Integer num = this.zzg;
        return new zzdf(i10, this.zza, str, str2, str3, (String) null, this.zze, zzbw, context, num);
    }
}
