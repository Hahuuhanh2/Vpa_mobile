package com.google.android.recaptcha.internal;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
final class zzhg implements Iterator, j$.util.Iterator {
    public boolean zza = true;
    public final /* synthetic */ Iterator zzb;

    public zzhg(zzhh zzhh, Iterator it) {
        this.zzb = it;
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    public final boolean hasNext() {
        return this.zzb.hasNext();
    }

    public final Object next() {
        Object next = this.zzb.next();
        this.zza = false;
        return next;
    }

    public final void remove() {
        zzgx.zze(!this.zza, "no calls to next() since the last call to remove()");
        this.zzb.remove();
    }
}
