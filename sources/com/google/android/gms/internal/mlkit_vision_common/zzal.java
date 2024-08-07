package com.google.android.gms.internal.mlkit_vision_common;

import com.google.firebase.encoders.EncodingException;
import sa.c;
import sa.d;

/* compiled from: com.google.mlkit:vision-common@@17.3.0 */
public final /* synthetic */ class zzal implements c {
    public static final /* synthetic */ zzal zza = new zzal();

    private /* synthetic */ zzal() {
    }

    public final void encode(Object obj, Object obj2) {
        d dVar = (d) obj2;
        int i10 = zzam.zza;
        throw new EncodingException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
    }
}
