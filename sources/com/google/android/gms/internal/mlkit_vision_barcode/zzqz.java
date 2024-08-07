package com.google.android.gms.internal.mlkit_vision_barcode;

import v.v;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
final class zzqz extends zzrd {
    private final String zza;
    private final boolean zzb;
    private final int zzc;

    public /* synthetic */ zzqz(String str, boolean z10, int i10, zzqy zzqy) {
        this.zza = str;
        this.zzb = z10;
        this.zzc = i10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzrd) {
            zzrd zzrd = (zzrd) obj;
            if (this.zza.equals(zzrd.zzb()) && this.zzb == zzrd.zzc() && this.zzc == zzrd.zza()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.zza.hashCode() ^ 1000003;
        if (true != this.zzb) {
            i10 = 1237;
        } else {
            i10 = 1231;
        }
        return (((hashCode * 1000003) ^ i10) * 1000003) ^ this.zzc;
    }

    public final String toString() {
        String str = this.zza;
        boolean z10 = this.zzb;
        int i10 = this.zzc;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("MLKitLoggingOptions{libraryName=");
        sb2.append(str);
        sb2.append(", enableFirelog=");
        sb2.append(z10);
        sb2.append(", firelogEventType=");
        return v.e(sb2, i10, "}");
    }

    public final int zza() {
        return this.zzc;
    }

    public final String zzb() {
        return this.zza;
    }

    public final boolean zzc() {
        return this.zzb;
    }
}
