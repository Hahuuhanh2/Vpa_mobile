package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.AbstractMap;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzat  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
final class zzat extends zzam {
    public final /* synthetic */ zzau zza;

    public zzat(zzau zzau) {
        this.zza = zzau;
    }

    public final /* bridge */ /* synthetic */ Object get(int i10) {
        zzu.zza(i10, this.zza.zzc, "index");
        zzau zzau = this.zza;
        int i11 = i10 + i10;
        Object obj = zzau.zzb[i11];
        obj.getClass();
        Object obj2 = zzau.zzb[i11 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    public final int size() {
        return this.zza.zzc;
    }
}
