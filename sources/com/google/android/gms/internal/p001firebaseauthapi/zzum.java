package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzum  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzum extends zzakk implements zzalq {
    /* access modifiers changed from: private */
    public static final zzum zzb;
    private int zzd;
    private zzuv zze;
    private zzug zzf;
    /* access modifiers changed from: private */
    public int zzg;

    static {
        zzum zzum = new zzum();
        zzb = zzum;
        zzakk.zzH(zzum.class, zzum);
    }

    private zzum() {
    }

    public static zzul zzc() {
        return (zzul) zzb.zzt();
    }

    public static zzum zze() {
        return zzb;
    }

    public static /* synthetic */ void zzg(zzum zzum, zzuv zzuv) {
        zzuv.getClass();
        zzum.zze = zzuv;
        zzum.zzd |= 1;
    }

    public static /* synthetic */ void zzh(zzum zzum, zzug zzug) {
        zzug.getClass();
        zzum.zzf = zzug;
        zzum.zzd |= 2;
    }

    public final zzud zza() {
        zzud zzud;
        int i10 = this.zzg;
        zzud zzud2 = zzud.UNKNOWN_FORMAT;
        if (i10 == 0) {
            zzud = zzud.UNKNOWN_FORMAT;
        } else if (i10 == 1) {
            zzud = zzud.UNCOMPRESSED;
        } else if (i10 == 2) {
            zzud = zzud.COMPRESSED;
        } else if (i10 != 3) {
            zzud = null;
        } else {
            zzud = zzud.DO_NOT_USE_CRUNCHY_UNCOMPRESSED;
        }
        if (zzud == null) {
            return zzud.UNRECOGNIZED;
        }
        return zzud;
    }

    public final zzug zzb() {
        zzug zzug = this.zzf;
        if (zzug == null) {
            return zzug.zzc();
        }
        return zzug;
    }

    public final zzuv zzf() {
        zzuv zzuv = this.zze;
        if (zzuv == null) {
            return zzuv.zzc();
        }
        return zzuv;
    }

    public final Object zzj(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzakk.zzE(zzb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\f", new Object[]{"zzd", "zze", "zzf", "zzg"});
        } else if (i11 == 3) {
            return new zzum();
        } else {
            if (i11 == 4) {
                return new zzul((zzuk) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
