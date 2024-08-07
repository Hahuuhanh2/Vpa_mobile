package com.google.android.recaptcha.internal;

import fk.h;
import fk.p;
import fk.r;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzgf {
    private List zza = r.f20213a;

    public final long zza(long[] jArr) {
        Iterator it = p.U0(h.y0(jArr), this.zza).iterator();
        if (it.hasNext()) {
            Object next = it.next();
            while (it.hasNext()) {
                next = Long.valueOf(((Number) next).longValue() ^ ((Number) it.next()).longValue());
            }
            return ((Number) next).longValue();
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }

    public final void zzb(long[] jArr) {
        this.zza = h.y0(jArr);
    }
}
