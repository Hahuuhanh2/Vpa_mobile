package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
final class zzls extends zzma {
    private final /* synthetic */ zzlo zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private zzls(zzlo zzlo) {
        super(zzlo);
        this.zza = zzlo;
    }

    public final Iterator iterator() {
        return new zzlq(this.zza);
    }
}
