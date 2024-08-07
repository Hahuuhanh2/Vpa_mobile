package com.google.android.gms.internal.mlkit_common;

import com.google.firebase.encoders.EncodingException;
import sa.c;
import sa.d;

/* compiled from: com.google.mlkit:common@@18.7.0 */
public final /* synthetic */ class zzbr implements c {
    public static final /* synthetic */ zzbr zza = new zzbr();

    private /* synthetic */ zzbr() {
    }

    public final void encode(Object obj, Object obj2) {
        d dVar = (d) obj2;
        int i10 = zzbs.zza;
        throw new EncodingException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
    }
}
