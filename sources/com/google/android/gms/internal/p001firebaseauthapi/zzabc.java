package com.google.android.gms.internal.p001firebaseauthapi;

import android.text.TextUtils;
import ba.g;
import com.google.firebase.auth.zze;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabc  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
final class zzabc implements zzafe {
    public final /* synthetic */ zzabd zza;

    public zzabc(zzabd zzabd) {
        this.zza = zzabd;
    }

    public final void zza(String str) {
        this.zza.zzc.zzh(g.a(str));
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzaim zzaim = (zzaim) obj;
        if (TextUtils.isEmpty(zzaim.zzb()) || TextUtils.isEmpty(zzaim.zzc())) {
            this.zza.zzc.zzh(g.a("INTERNAL_SUCCESS_SIGN_OUT"));
            return;
        }
        zzahb zzahb = new zzahb(zzaim.zzc(), zzaim.zzb(), Long.valueOf(zzahd.zza(zzaim.zzb())), "Bearer");
        zzabd zzabd = this.zza;
        zzabd.zzd.zzR(zzahb, (String) null, (String) null, Boolean.FALSE, (zze) null, zzabd.zzc, this);
    }
}
