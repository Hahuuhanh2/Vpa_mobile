package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzup  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzup extends zzakk implements zzalq {
    /* access modifiers changed from: private */
    public static final zzup zzb;
    private int zzd;
    /* access modifiers changed from: private */
    public int zze;
    private zzus zzf;
    /* access modifiers changed from: private */
    public zzajf zzg = zzajf.zzb;

    static {
        zzup zzup = new zzup();
        zzb = zzup;
        zzakk.zzH(zzup.class, zzup);
    }

    private zzup() {
    }

    public static zzuo zzb() {
        return (zzuo) zzb.zzt();
    }

    public static zzup zzd(zzajf zzajf, zzajx zzajx) {
        return (zzup) zzakk.zzx(zzb, zzajf, zzajx);
    }

    public static /* synthetic */ void zzh(zzup zzup, zzus zzus) {
        zzus.getClass();
        zzup.zzf = zzus;
        zzup.zzd |= 1;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzus zze() {
        zzus zzus = this.zzf;
        if (zzus == null) {
            return zzus.zze();
        }
        return zzus;
    }

    public final zzajf zzf() {
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
            return new zzup();
        } else {
            if (i11 == 4) {
                return new zzuo((zzun) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
