package com.google.android.gms.internal.p001firebaseauthapi;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzamy  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
final class zzamy implements ListIterator, Iterator {
    public final ListIterator zza;
    public final /* synthetic */ int zzb;
    public final /* synthetic */ zzana zzc;

    public zzamy(zzana zzana, int i10) {
        this.zzc = zzana;
        this.zzb = i10;
        this.zza = zzana.zza.listIterator(i10);
    }

    public final /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    public final boolean hasPrevious() {
        return this.zza.hasPrevious();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.zza.next();
    }

    public final int nextIndex() {
        return this.zza.nextIndex();
    }

    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.zza.previous();
    }

    public final int previousIndex() {
        return this.zza.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void set(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }
}
