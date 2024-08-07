package com.google.android.gms.internal.p001firebaseauthapi;

import android.app.PendingIntent;
import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.zze;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaav  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
final class zzaav implements zzafe {
    public final /* synthetic */ zzafe zza;
    public final /* synthetic */ zzaaw zzb;

    public zzaav(zzaaw zzaaw, zzafe zzafe) {
        this.zzb = zzaaw;
        this.zza = zzafe;
    }

    public final void zza(String str) {
        this.zza.zza(str);
    }

    public final void zzb(Object obj) {
        zzaik zzaik = (zzaik) obj;
        if (!TextUtils.isEmpty(zzaik.zzf())) {
            Status status = new Status(17025, (String) null, (PendingIntent) null, (ConnectionResult) null);
            zzaaw zzaaw = this.zzb;
            zzaaw.zzb.zzg(status, new PhoneAuthCredential((String) null, (String) null, zzaik.zzd(), zzaik.zzf(), true));
            return;
        }
        zzahb zzahb = new zzahb(zzaik.zze(), zzaik.zzc(), Long.valueOf(zzaik.zzb()), "Bearer");
        zzaaw zzaaw2 = this.zzb;
        Boolean valueOf = Boolean.valueOf(zzaik.zzg());
        zzaaw zzaaw3 = this.zzb;
        zzafe zzafe = this.zza;
        zzaaw2.zzc.zzR(zzahb, (String) null, "phone", valueOf, (zze) null, zzaaw3.zzb, zzafe);
    }
}
