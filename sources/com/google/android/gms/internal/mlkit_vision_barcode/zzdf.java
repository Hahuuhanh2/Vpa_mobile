package com.google.android.gms.internal.mlkit_vision_barcode;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
final class zzdf implements zzdk {
    private final int zza;
    private final zzdj zzb;

    public zzdf(int i10, zzdj zzdj) {
        this.zza = i10;
        this.zzb = zzdj;
    }

    public final Class annotationType() {
        return zzdk.class;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzdk)) {
            return false;
        }
        zzdk zzdk = (zzdk) obj;
        if (this.zza != zzdk.zza() || !this.zzb.equals(zzdk.zzb())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.zza ^ 14552422) + (this.zzb.hashCode() ^ 2041407134);
    }

    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf" + "(tag=" + this.zza + "intEncoding=" + this.zzb + ')';
    }

    public final int zza() {
        return this.zza;
    }

    public final zzdj zzb() {
        return this.zzb;
    }
}
