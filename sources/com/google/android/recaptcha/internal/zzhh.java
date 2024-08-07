package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
final class zzhh extends zzhc {
    public final /* synthetic */ Iterable zza;
    public final /* synthetic */ int zzb;

    public zzhh(Iterable iterable, int i10) {
        this.zza = iterable;
        this.zzb = i10;
    }

    public final Iterator iterator() {
        boolean z10;
        Iterable iterable = this.zza;
        if (iterable instanceof List) {
            List list = (List) iterable;
            return list.subList(Math.min(list.size(), this.zzb), list.size()).iterator();
        }
        int i10 = this.zzb;
        Iterator it = iterable.iterator();
        it.getClass();
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzgx.zzb(z10, "numberToAdvance must be nonnegative");
        for (int i11 = 0; i11 < i10 && it.hasNext(); i11++) {
            it.next();
        }
        return new zzhg(this, it);
    }
}
