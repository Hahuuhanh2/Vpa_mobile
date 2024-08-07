package com.google.android.recaptcha.internal;

import j$.util.Iterator;
import j$.util.function.Consumer;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
abstract class zzip implements zzir, Iterator {
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    public final /* synthetic */ Object next() {
        return Byte.valueOf(zza());
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
