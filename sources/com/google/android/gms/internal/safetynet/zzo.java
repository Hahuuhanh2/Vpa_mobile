package com.google.android.gms.internal.safetynet;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.c;

/* compiled from: com.google.android.gms:play-services-safetynet@@17.0.1 */
final class zzo extends zzx {
    public final /* synthetic */ String zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzo(zzae zzae, c cVar, String str) {
        super(cVar);
        this.zza = str;
    }

    public final /* bridge */ /* synthetic */ void doExecute(a.b bVar) {
        ((zzh) ((zzaf) bVar).getService()).zzj(this.zzb, this.zza);
    }
}
