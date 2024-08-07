package com.google.android.gms.internal.mlkit_vision_barcode;

import qc.g;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
public final /* synthetic */ class zzri implements Runnable {
    public final /* synthetic */ zzrl zza;
    public final /* synthetic */ zzne zzb;
    public final /* synthetic */ Object zzc;
    public final /* synthetic */ long zzd;
    public final /* synthetic */ g zze;

    public /* synthetic */ zzri(zzrl zzrl, zzne zzne, Object obj, long j10, g gVar) {
        this.zza = zzrl;
        this.zzb = zzne;
        this.zzc = obj;
        this.zzd = j10;
        this.zze = gVar;
    }

    public final void run() {
        this.zza.zzh(this.zzb, this.zzc, this.zzd, this.zze);
    }
}
