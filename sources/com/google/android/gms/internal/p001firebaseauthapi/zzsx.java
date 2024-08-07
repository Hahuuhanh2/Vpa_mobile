package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsx  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzsx extends zzakk implements zzalq {
    /* access modifiers changed from: private */
    public static final zzsx zzb;
    private int zzd;
    /* access modifiers changed from: private */
    public int zze;
    private zztd zzf;
    /* access modifiers changed from: private */
    public zzajf zzg = zzajf.zzb;

    static {
        zzsx zzsx = new zzsx();
        zzb = zzsx;
        zzakk.zzH(zzsx.class, zzsx);
    }

    private zzsx() {
    }

    public static zzsw zzb() {
        return (zzsw) zzb.zzt();
    }

    public static zzsx zzd(zzajf zzajf, zzajx zzajx) {
        return (zzsx) zzakk.zzx(zzb, zzajf, zzajx);
    }

    public static /* synthetic */ void zzh(zzsx zzsx, zztd zztd) {
        zztd.getClass();
        zzsx.zzf = zztd;
        zzsx.zzd |= 1;
    }

    public final int zza() {
        return this.zze;
    }

    public final zztd zze() {
        zztd zztd = this.zzf;
        if (zztd == null) {
            return zztd.zzd();
        }
        return zztd;
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
            return new zzsx();
        } else {
            if (i11 == 4) {
                return new zzsw((zzsv) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
