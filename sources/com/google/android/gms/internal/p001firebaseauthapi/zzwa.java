package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwa  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzwa extends zzakk implements zzalq {
    /* access modifiers changed from: private */
    public static final zzwa zzb;
    private int zzd;
    /* access modifiers changed from: private */
    public int zze;
    private zzwd zzf;
    /* access modifiers changed from: private */
    public zzajf zzg = zzajf.zzb;

    static {
        zzwa zzwa = new zzwa();
        zzb = zzwa;
        zzakk.zzH(zzwa.class, zzwa);
    }

    private zzwa() {
    }

    public static zzvz zzb() {
        return (zzvz) zzb.zzt();
    }

    public static zzwa zzd(zzajf zzajf, zzajx zzajx) {
        return (zzwa) zzakk.zzx(zzb, zzajf, zzajx);
    }

    public static /* synthetic */ void zzh(zzwa zzwa, zzwd zzwd) {
        zzwd.getClass();
        zzwa.zzf = zzwd;
        zzwa.zzd |= 1;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzwd zze() {
        zzwd zzwd = this.zzf;
        if (zzwd == null) {
            return zzwd.zze();
        }
        return zzwd;
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
            return new zzwa();
        } else {
            if (i11 == 4) {
                return new zzvz((zzvy) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final boolean zzk() {
        return (this.zzd & 1) != 0;
    }
}
