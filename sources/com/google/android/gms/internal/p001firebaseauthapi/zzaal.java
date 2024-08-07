package com.google.android.gms.internal.p001firebaseauthapi;

import android.text.TextUtils;
import android.util.Base64;
import java.util.ArrayList;
import java.util.List;
import y6.j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaal  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
final class zzaal implements zzafe {
    public final /* synthetic */ zzahn zza;
    public final /* synthetic */ zzags zzb;
    public final /* synthetic */ zzadx zzc;
    public final /* synthetic */ zzahb zzd;
    public final /* synthetic */ zzafd zze;
    public final /* synthetic */ zzabz zzf;

    public zzaal(zzabz zzabz, zzahn zzahn, zzags zzags, zzadx zzadx, zzahb zzahb, zzafd zzafd) {
        this.zzf = zzabz;
        this.zza = zzahn;
        this.zzb = zzags;
        this.zzc = zzadx;
        this.zzd = zzahb;
        this.zze = zzafd;
    }

    public final void zza(String str) {
        this.zze.zza(str);
    }

    public final void zzb(Object obj) {
        zzaho zzaho = (zzaho) obj;
        String str = null;
        if (this.zza.zzn("EMAIL")) {
            this.zzb.zzg((String) null);
        } else {
            zzahn zzahn = this.zza;
            if (zzahn.zzk() != null) {
                this.zzb.zzg(zzahn.zzk());
            }
        }
        if (this.zza.zzn("DISPLAY_NAME")) {
            this.zzb.zzf((String) null);
        } else {
            zzahn zzahn2 = this.zza;
            if (zzahn2.zzj() != null) {
                this.zzb.zzf(zzahn2.zzj());
            }
        }
        if (this.zza.zzn("PHOTO_URL")) {
            this.zzb.zzj((String) null);
        } else {
            zzahn zzahn3 = this.zza;
            if (zzahn3.zzm() != null) {
                this.zzb.zzj(zzahn3.zzm());
            }
        }
        if (!TextUtils.isEmpty(this.zza.zzl())) {
            zzags zzags = this.zzb;
            byte[] bytes = "redacted".getBytes();
            if (bytes != null) {
                str = Base64.encodeToString(bytes, 0);
            }
            zzags.zzi(str);
        }
        List zzf2 = zzaho.zzf();
        if (zzf2 == null) {
            zzf2 = new ArrayList();
        }
        this.zzb.zzk(zzf2);
        zzadx zzadx = this.zzc;
        zzahb zzahb = this.zzd;
        j.f(zzahb);
        String zzd2 = zzaho.zzd();
        String zze2 = zzaho.zze();
        if (!TextUtils.isEmpty(zzd2) && !TextUtils.isEmpty(zze2)) {
            zzahb = new zzahb(zze2, zzd2, Long.valueOf(zzaho.zzb()), zzahb.zzg());
        }
        zzadx.zzk(zzahb, this.zzb);
    }
}
