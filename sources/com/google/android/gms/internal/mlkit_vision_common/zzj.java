package com.google.android.gms.internal.mlkit_vision_common;

import java.util.Arrays;

/* compiled from: com.google.mlkit:vision-common@@17.3.0 */
class zzj extends zzk {
    public Object[] zza = new Object[4];
    public int zzb = 0;
    public boolean zzc;

    public zzj(int i10) {
    }

    private final void zzb(int i10) {
        Object[] objArr = this.zza;
        int length = objArr.length;
        if (length < i10) {
            int i11 = length + (length >> 1) + 1;
            if (i11 < i10) {
                int highestOneBit = Integer.highestOneBit(i10 - 1);
                i11 = highestOneBit + highestOneBit;
            }
            if (i11 < 0) {
                i11 = Integer.MAX_VALUE;
            }
            this.zza = Arrays.copyOf(objArr, i11);
            this.zzc = false;
        } else if (this.zzc) {
            this.zza = (Object[]) objArr.clone();
            this.zzc = false;
        }
    }

    public final zzj zza(Object obj) {
        obj.getClass();
        zzb(this.zzb + 1);
        Object[] objArr = this.zza;
        int i10 = this.zzb;
        this.zzb = i10 + 1;
        objArr[i10] = obj;
        return this;
    }
}