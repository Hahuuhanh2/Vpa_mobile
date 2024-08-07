package com.google.android.gms.internal.mlkit_vision_barcode;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
public enum zznc implements zzdi {
    TYPE_UNKNOWN(0),
    TYPE_THIN(1),
    TYPE_THICK(2),
    TYPE_GMV(3);
    
    private final int zzf;

    private zznc(int i10) {
        this.zzf = i10;
    }

    public final int zza() {
        return this.zzf;
    }
}