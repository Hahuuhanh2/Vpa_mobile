package com.google.android.gms.internal.common;

import android.support.v4.media.a;
import java.io.IOException;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
final class zzv implements Iterable {
    public final /* synthetic */ CharSequence zza;
    public final /* synthetic */ zzx zzb;

    public zzv(zzx zzx, CharSequence charSequence) {
        this.zzb = zzx;
        this.zza = charSequence;
    }

    public final Iterator iterator() {
        return this.zzb.zzh(this.zza);
    }

    public final String toString() {
        StringBuilder p10 = a.p('[');
        Iterator it = iterator();
        try {
            if (it.hasNext()) {
                p10.append(zzq.zza(it.next(), ", "));
                while (it.hasNext()) {
                    p10.append(", ");
                    p10.append(zzq.zza(it.next(), ", "));
                }
            }
            p10.append(']');
            return p10.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
