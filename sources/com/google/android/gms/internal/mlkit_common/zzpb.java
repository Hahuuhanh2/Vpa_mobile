package com.google.android.gms.internal.mlkit_common;

import lc.k;

/* compiled from: com.google.mlkit:common@@18.7.0 */
final class zzpb extends zzpo {
    private zzlc zza;
    private String zzb;
    private boolean zzc;
    private boolean zzd;
    private k zze;
    private zzli zzf;
    private int zzg;
    private byte zzh;

    public final zzpo zza(zzli zzli) {
        if (zzli != null) {
            this.zzf = zzli;
            return this;
        }
        throw new NullPointerException("Null downloadStatus");
    }

    public final zzpo zzb(zzlc zzlc) {
        if (zzlc != null) {
            this.zza = zzlc;
            return this;
        }
        throw new NullPointerException("Null errorCode");
    }

    public final zzpo zzc(int i10) {
        this.zzg = i10;
        this.zzh = (byte) (this.zzh | 4);
        return this;
    }

    public final zzpo zzd(k kVar) {
        if (kVar != null) {
            this.zze = kVar;
            return this;
        }
        throw new NullPointerException("Null modelType");
    }

    public final zzpo zze(boolean z10) {
        this.zzd = z10;
        this.zzh = (byte) (this.zzh | 2);
        return this;
    }

    public final zzpo zzf(boolean z10) {
        this.zzc = z10;
        this.zzh = (byte) (this.zzh | 1);
        return this;
    }

    public final zzpo zzg(String str) {
        this.zzb = "NA";
        return this;
    }

    public final zzpp zzh() {
        zzlc zzlc;
        String str;
        k kVar;
        zzli zzli;
        if (this.zzh == 7 && (zzlc = this.zza) != null && (str = this.zzb) != null && (kVar = this.zze) != null && (zzli = this.zzf) != null) {
            return new zzpd(zzlc, str, this.zzc, this.zzd, kVar, zzli, this.zzg, (zzpc) null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.zza == null) {
            sb2.append(" errorCode");
        }
        if (this.zzb == null) {
            sb2.append(" tfliteSchemaVersion");
        }
        if ((this.zzh & 1) == 0) {
            sb2.append(" shouldLogRoughDownloadTime");
        }
        if ((this.zzh & 2) == 0) {
            sb2.append(" shouldLogExactDownloadTime");
        }
        if (this.zze == null) {
            sb2.append(" modelType");
        }
        if (this.zzf == null) {
            sb2.append(" downloadStatus");
        }
        if ((this.zzh & 4) == 0) {
            sb2.append(" failureStatusCode");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
