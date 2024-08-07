package com.google.android.gms.internal.mlkit_vision_barcode;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
final class zzcc extends zzcd {
    public final transient int zza;
    public final transient int zzb;
    public final /* synthetic */ zzcd zzc;

    public zzcc(zzcd zzcd, int i10, int i11) {
        this.zzc = zzcd;
        this.zza = i10;
        this.zzb = i11;
    }

    public final Object get(int i10) {
        zzaq.zza(i10, this.zzb, "index");
        return this.zzc.get(i10 + this.zza);
    }

    public final int size() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    public final Object[] zze() {
        return this.zzc.zze();
    }

    /* renamed from: zzf */
    public final zzcd subList(int i10, int i11) {
        zzaq.zzc(i10, i11, this.zzb);
        zzcd zzcd = this.zzc;
        int i12 = this.zza;
        return zzcd.subList(i10 + i12, i11 + i12);
    }
}
