package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

@Deprecated
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
public final class zzmj extends AbstractList<String> implements zzjx, RandomAccess {
    /* access modifiers changed from: private */
    public final zzjx zza;

    public zzmj(zzjx zzjx) {
        this.zza = zzjx;
    }

    public final /* synthetic */ Object get(int i10) {
        return (String) this.zza.get(i10);
    }

    public final zzjx h_() {
        return this;
    }

    public final Iterator<String> iterator() {
        return new zzml(this);
    }

    public final ListIterator<String> listIterator(int i10) {
        return new zzmm(this, i10);
    }

    public final int size() {
        return this.zza.size();
    }

    public final void zza(zzhu zzhu) {
        throw new UnsupportedOperationException();
    }

    public final Object zzb(int i10) {
        return this.zza.zzb(i10);
    }

    public final List<?> zzb() {
        return this.zza.zzb();
    }
}
