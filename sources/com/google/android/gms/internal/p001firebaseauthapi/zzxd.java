package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxd  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzxd extends zzakk implements zzalq {
    /* access modifiers changed from: private */
    public static final zzxd zzb;
    private int zzd;
    /* access modifiers changed from: private */
    public int zze;
    private zzxg zzf;

    static {
        zzxd zzxd = new zzxd();
        zzb = zzxd;
        zzakk.zzH(zzxd.class, zzxd);
    }

    private zzxd() {
    }

    public static zzxc zzb() {
        return (zzxc) zzb.zzt();
    }

    public static zzxd zzd(zzajf zzajf, zzajx zzajx) {
        return (zzxd) zzakk.zzx(zzb, zzajf, zzajx);
    }

    public static /* synthetic */ void zzg(zzxd zzxd, zzxg zzxg) {
        zzxg.getClass();
        zzxd.zzf = zzxg;
        zzxd.zzd |= 1;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzxg zze() {
        zzxg zzxg = this.zzf;
        if (zzxg == null) {
            return zzxg.zzc();
        }
        return zzxg;
    }

    public final Object zzj(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzakk.zzE(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zzd", "zze", "zzf"});
        } else if (i11 == 3) {
            return new zzxd();
        } else {
            if (i11 == 4) {
                return new zzxc((zzxb) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
