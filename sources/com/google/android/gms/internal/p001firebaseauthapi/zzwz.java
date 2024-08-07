package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwz  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzwz extends zzakk implements zzalq {
    /* access modifiers changed from: private */
    public static final zzwz zzb;
    private String zzd = "";
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public int zzf;
    /* access modifiers changed from: private */
    public int zzg;

    static {
        zzwz zzwz = new zzwz();
        zzb = zzwz;
        zzakk.zzH(zzwz.class, zzwz);
    }

    private zzwz() {
    }

    public static zzwy zzb() {
        return (zzwy) zzb.zzt();
    }

    public static /* synthetic */ void zzd(zzwz zzwz, String str) {
        str.getClass();
        zzwz.zzd = str;
    }

    public final int zza() {
        return this.zzf;
    }

    public final Object zzj(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzakk.zzE(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzd", "zze", "zzf", "zzg"});
        } else if (i11 == 3) {
            return new zzwz();
        } else {
            if (i11 == 4) {
                return new zzwy((zzww) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
