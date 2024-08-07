package com.google.android.recaptcha.internal;

import al.g0;
import java.util.LinkedHashMap;
import java.util.Map;
import rk.a;
import sk.k;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
final class zzaz extends k implements a {
    public final /* synthetic */ zzbc[] zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzaz(zzbc[] zzbcArr) {
        super(0);
        this.zza = zzbcArr;
    }

    /* renamed from: zza */
    public final Map invoke() {
        int d02 = g0.d0(3);
        if (d02 < 16) {
            d02 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d02);
        for (int i10 = 0; i10 < 3; i10++) {
            zzbc zzbc = this.zza[i10];
            linkedHashMap.put(Integer.valueOf(zzbc.zza()), zzbc.zzb());
        }
        return linkedHashMap;
    }
}
