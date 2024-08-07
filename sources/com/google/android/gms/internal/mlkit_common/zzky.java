package com.google.android.gms.internal.mlkit_common;

/* compiled from: com.google.mlkit:common@@18.7.0 */
public enum zzky implements zzbm {
    UNKNOWN(0),
    TRANSLATE(1);
    
    private final int zzd;

    private zzky(int i10) {
        this.zzd = i10;
    }

    public static zzky zzb(int i10) {
        for (zzky zzky : values()) {
            if (zzky.zzd == i10) {
                return zzky;
            }
        }
        return UNKNOWN;
    }

    public final int zza() {
        return this.zzd;
    }
}
