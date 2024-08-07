package com.google.android.gms.internal.mlkit_common;

import v.v;

/* compiled from: com.google.mlkit:common@@18.7.0 */
final class zzpa extends zzph {
    private final String zza;
    private final boolean zzb;
    private final int zzc;

    public /* synthetic */ zzpa(String str, boolean z10, int i10, zzoz zzoz) {
        this.zza = str;
        this.zzb = z10;
        this.zzc = i10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzph) {
            zzph zzph = (zzph) obj;
            if (this.zza.equals(zzph.zzb()) && this.zzb == zzph.zzc() && this.zzc == zzph.zza()) {
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
