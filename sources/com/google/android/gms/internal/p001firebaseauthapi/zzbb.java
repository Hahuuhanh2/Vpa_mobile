package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbb  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzbb {
    private static final long[][] zza = {new long[]{291830, 126401071349994536L}, new long[]{885594168, 725270293939359937L, 3569819667048198375L}, new long[]{273919523040L, 15, 7363882082L, 992620450144556L}, new long[]{47636622961200L, 2, 2570940, 211991001, 3749873356L}, new long[]{7999252175582850L, 2, 4130806001517L, 149795463772692060L, 186635894390467037L, 3967304179347715805L}, new long[]{585226005592931976L, 2, 123635709730000L, 9233062284813009L, 43835965440333360L, 761179012939631437L, 1263739024124850375L}, new long[]{Long.MAX_VALUE, 2, 325, 9375, 28178, 450775, 9780504, 1795265022}};

    public static long zza(long j10, long j11) {
        boolean z10;
        boolean z11 = true;
        if ((j10 ^ j11) < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        long j12 = j10 + j11;
        if ((j10 ^ j12) < 0) {
            z11 = false;
        }
        zzbc.zza(z10 | z11, "checkedAdd", j10, j11);
        return j12;
    }

    public static long zzb(long j10, long j11) {
        boolean z10;
        boolean z11 = true;
        if ((1 ^ j10) >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        long j12 = -1 + j10;
        if ((j10 ^ j12) < 0) {
            z11 = false;
        }
        zzbc.zza(z10 | z11, "checkedSubtract", j10, 1);
        return j12;
    }
}