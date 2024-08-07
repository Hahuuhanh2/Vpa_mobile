package com.google.android.recaptcha.internal;

import al.g0;
import android.os.Build;
import ek.e;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzgw {
    public static final Map zza() {
        e[] eVarArr = {new e(-4, zzbg.zzo), new e(-12, zzbg.zzp), new e(-6, zzbg.zzk), new e(-11, zzbg.zzm), new e(-13, zzbg.zzq), new e(-14, zzbg.zzr), new e(-2, zzbg.zzl), new e(-7, zzbg.zzs), new e(-5, zzbg.zzt), new e(-9, zzbg.zzu), new e(-8, zzbg.zzE), new e(-15, zzbg.zzn), new e(-1, zzbg.zzv), new e(-3, zzbg.zzx), new e(-10, zzbg.zzy)};
        LinkedHashMap linkedHashMap = new LinkedHashMap(g0.d0(15));
        for (int i10 = 0; i10 < 15; i10++) {
            e eVar = eVarArr[i10];
            linkedHashMap.put(eVar.f20102a, eVar.f20103b);
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            linkedHashMap.put(-16, zzbg.zzw);
        }
        if (i11 >= 27) {
            linkedHashMap.put(1, zzbg.zzA);
            linkedHashMap.put(2, zzbg.zzB);
            linkedHashMap.put(0, zzbg.zzC);
            linkedHashMap.put(3, zzbg.zzD);
        }
        if (i11 >= 29) {
            linkedHashMap.put(4, zzbg.zzz);
        }
        return linkedHashMap;
    }
}
