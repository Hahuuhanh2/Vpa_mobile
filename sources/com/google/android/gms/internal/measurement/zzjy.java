package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
public final class zzjy extends zzho<String> implements zzjx, RandomAccess {
    private static final zzjy zza;
    @Deprecated
    private static final zzjx zzb;
    private final List<Object> zzc;

    static {
        zzjy zzjy = new zzjy(false);
        zza = zzjy;
        zzb = zzjy;
    }

    public zzjy() {
        this(10);
    }

    public final /* synthetic */ void add(int i10, Object obj) {
        zza();
        this.zzc.add(i10, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    public final void clear() {
        zza();
        this.zzc.clear();
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final /* synthetic */ Object get(int i10) {
        Object obj = this.zzc.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzhu) {
            zzhu zzhu = (zzhu) obj;
            String zzc2 = zzhu.zzc();
            if (zzhu.zzd()) {
                this.zzc.set(i10, zzc2);
            }
            return zzc2;
        }
        byte[] bArr = (byte[]) obj;
        String zzb2 = zzjh.zzb(bArr);
        if (zzjh.zzc(bArr)) {
            this.zzc.set(i10, zzb2);
        }
        return zzb2;
    }

    public final zzjx h_() {
        if (zzc()) {
            return new zzmj(this);
        }
        return this;
    }

    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public final /* synthetic */ Object remove(int i10) {
        zza();
        Object remove = this.zzc.remove(i10);
        this.modCount++;
        return zza(remove);
    }

    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    public final /* synthetic */ Object set(int i10, Object obj) {
        zza();
        return zza(this.zzc.set(i10, (String) obj));
    }

    public final int size() {
        return this.zzc.size();
    }

    public final /* synthetic */ zzjn zza(int i10) {
        if (i10 >= size()) {
            ArrayList arrayList = new ArrayList(i10);
            arrayList.addAll(this.zzc);
            return new zzjy((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final Object zzb(int i10) {
        return this.zzc.get(i10);
    }

    public final /* bridge */ /* synthetic */ boolean zzc() {
        return super.zzc();
    }

    public zzjy(int i10) {
        this((ArrayList<Object>) new ArrayList(i10));
    }

    public final boolean addAll(int i10, Collection<? extends String> collection) {
        zza();
        if (collection instanceof zzjx) {
            collection = ((zzjx) collection).zzb();
        }
        boolean addAll = this.zzc.addAll(i10, collection);
        this.modCount++;
        return addAll;
    }

    public final List<?> zzb() {
        return Collections.unmodifiableList(this.zzc);
    }

    private zzjy(ArrayList<Object> arrayList) {
        this.zzc = arrayList;
    }

    private zzjy(boolean z10) {
        super(false);
        this.zzc = Collections.emptyList();
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    private static String zza(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzhu) {
            return ((zzhu) obj).zzc();
        }
        return zzjh.zzb((byte[]) obj);
    }

    public final void zza(zzhu zzhu) {
        zza();
        this.zzc.add(zzhu);
        this.modCount++;
    }
}
