package com.google.android.gms.internal.mlkit_common;

import android.support.v4.media.a;
import lc.k;
import v.v;

/* compiled from: com.google.mlkit:common@@18.7.0 */
final class zzpd extends zzpp {
    private final zzlc zza;
    private final String zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final k zze;
    private final zzli zzf;
    private final int zzg;

    public /* synthetic */ zzpd(zzlc zzlc, String str, boolean z10, boolean z11, k kVar, zzli zzli, int i10, zzpc zzpc) {
        this.zza = zzlc;
        this.zzb = str;
        this.zzc = z10;
        this.zzd = z11;
        this.zze = kVar;
        this.zzf = zzli;
        this.zzg = i10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzpp) {
            zzpp zzpp = (zzpp) obj;
            if (!this.zza.equals(zzpp.zzc()) || !this.zzb.equals(zzpp.zze()) || this.zzc != zzpp.zzg() || this.zzd != zzpp.zzf() || !this.zze.equals(zzpp.zzb()) || !this.zzf.equals(zzpp.zzd()) || this.zzg != zzpp.zza()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = ((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode();
        int i11 = 1237;
        if (true != this.zzc) {
            i10 = 1237;
        } else {
            i10 = 1231;
        }
        if (true == this.zzd) {
            i11 = 1231;
        }
        return (((((((((hashCode * 1000003) ^ i10) * 1000003) ^ i11) * 1000003) ^ this.zze.hashCode()) * 1000003) ^ this.zzf.hashCode()) * 1000003) ^ this.zzg;
    }

    public final String toString() {
        String obj = this.zza.toString();
        String str = this.zzb;
        boolean z10 = this.zzc;
        boolean z11 = this.zzd;
        String obj2 = this.zze.toString();
        String obj3 = this.zzf.toString();
        int i10 = this.zzg;
        StringBuilder r10 = a.r("RemoteModelLoggingOptions{errorCode=", obj, ", tfliteSchemaVersion=", str, ", shouldLogRoughDownloadTime=");
        r10.append(z10);
        r10.append(", shouldLogExactDownloadTime=");
        r10.append(z11);
        r10.append(", modelType=");
        r10.append(obj2);
        r10.append(", downloadStatus=");
        r10.append(obj3);
        r10.append(", failureStatusCode=");
        return v.e(r10, i10, "}");
    }

    public final int zza() {
        return this.zzg;
    }

    public final k zzb() {
        return this.zze;
    }

    public final zzlc zzc() {
        return this.zza;
    }

    public final zzli zzd() {
        return this.zzf;
    }

    public final String zze() {
        return this.zzb;
    }

    public final boolean zzf() {
        return this.zzd;
    }

    public final boolean zzg() {
        return this.zzc;
    }
}
