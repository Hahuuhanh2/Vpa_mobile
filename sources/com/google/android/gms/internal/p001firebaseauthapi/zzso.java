package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzso  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzso extends zzakk implements zzalq {
    /* access modifiers changed from: private */
    public static final zzso zzb;
    private int zzd;
    /* access modifiers changed from: private */
    public int zze;
    private zzsu zzf;
    /* access modifiers changed from: private */
    public zzajf zzg = zzajf.zzb;

    static {
        zzso zzso = new zzso();
        zzb = zzso;
        zzakk.zzH(zzso.class, zzso);
    }

    private zzso() {
    }

    public static zzsn zzb() {
        return (zzsn) zzb.zzt();
    }

    public static zzso zzd() {
        return zzb;
    }

    public static zzso zze(zzajf zzajf, zzajx zzajx) {
        return (zzso) zzakk.zzx(zzb, zzajf, zzajx);
    }

    public static /* synthetic */ void zzi(zzso zzso, zzsu zzsu) {
        zzsu.getClass();
        zzso.zzf = zzsu;
        zzso.zzd |= 1;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzsu zzf() {
        zzsu zzsu = this.zzf;
        if (zzsu == null) {
            return zzsu.zzd();
        }
        return zzsu;
    }

    public final zzajf zzg() {
        return this.zzg;
    }

    public final Object zzj(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzakk.zzE(zzb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zzd", "zze", "zzf", "zzg"});
        } else if (i11 == 3) {
            return new zzso();
        } else {
            if (i11 == 4) {
                return new zzsn((zzsm) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
