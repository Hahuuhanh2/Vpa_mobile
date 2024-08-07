package com.google.android.gms.internal.p001firebaseauthapi;

@Deprecated
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwq  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzwq extends zzakk implements zzalq {
    /* access modifiers changed from: private */
    public static final zzwq zzb;
    private String zzd = "";
    private String zze = "";
    private int zzf;
    private boolean zzg;
    private String zzh = "";

    static {
        zzwq zzwq = new zzwq();
        zzb = zzwq;
        zzakk.zzH(zzwq.class, zzwq);
    }

    private zzwq() {
    }

    public final Object zzj(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzakk.zzE(zzb, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        } else if (i11 == 3) {
            return new zzwq();
        } else {
            if (i11 == 4) {
                return new zzwp((zzwo) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
