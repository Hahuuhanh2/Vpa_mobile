package com.google.android.gms.internal.measurement;

import j$.util.Iterator;
import j$.util.function.Consumer;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
abstract class zzhz implements zzia, Iterator {
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    public /* synthetic */ Object next() {
        return Byte.valueOf(zza());
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
