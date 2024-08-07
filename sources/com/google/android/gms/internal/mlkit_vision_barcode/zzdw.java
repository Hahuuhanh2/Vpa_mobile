package com.google.android.gms.internal.mlkit_vision_barcode;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
public final class zzdw {
    /* access modifiers changed from: private */
    public zzdz zza;
    /* access modifiers changed from: private */
    public Integer zzb;
    /* access modifiers changed from: private */
    public zzmj zzc;

    public final zzdw zza(Integer num) {
        this.zzb = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final zzdw zzb(zzmj zzmj) {
        this.zzc = zzmj;
        return this;
    }

    public final zzdw zzc(zzdz zzdz) {
        this.zza = zzdz;
        return this;
    }

    public final zzeb zze() {
        return new zzeb(this, (zzea) null);
    }
}
