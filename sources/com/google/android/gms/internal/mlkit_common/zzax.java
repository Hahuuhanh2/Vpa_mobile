package com.google.android.gms.internal.mlkit_common;

/* compiled from: com.google.mlkit:common@@18.7.0 */
final class zzax extends zzar {
    public static final zzar zza = new zzax(new Object[0], 0);
    public final transient Object[] zzb;
    private final transient int zzc;

    public zzax(Object[] objArr, int i10) {
        this.zzb = objArr;
        this.zzc = i10;
    }

    public final Object get(int i10) {
        zzaf.zza(i10, this.zzc, "index");
        Object obj = this.zzb[i10];
        obj.getClass();
        return obj;
    }

    public final int size() {
        return this.zzc;
    }

    public final int zza(Object[] objArr, int i10) {
        System.arraycopy(this.zzb, 0, objArr, 0, this.zzc);
        return this.zzc;
    }

    public final int zzb() {
        return this.zzc;
    }

    public final int zzc() {
        return 0;
    }

    public final Object[] zze() {
        return this.zzb;
    }
}
