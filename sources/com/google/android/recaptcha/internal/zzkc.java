package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
final class zzkc {
    private final Object zza;
    private final int zzb;

    public zzkc(Object obj, int i10) {
        this.zza = obj;
        this.zzb = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzkc)) {
            return false;
        }
        zzkc zzkc = (zzkc) obj;
        if (this.zza == zzkc.zza && this.zzb == zzkc.zzb) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * 65535) + this.zzb;
    }
}
