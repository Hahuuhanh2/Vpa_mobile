package com.google.android.gms.internal.mlkit_vision_barcode;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
abstract class zzbp implements Iterator, j$.util.Iterator {
    public int zzb;
    public int zzc;
    public int zzd = -1;
    public final /* synthetic */ zzbt zze;

    public /* synthetic */ zzbp(zzbt zzbt, zzbo zzbo) {
        this.zze = zzbt;
        this.zzb = zzbt.zzf;
        this.zzc = zzbt.zze();
    }

    private final void zzb() {
        if (this.zze.zzf != this.zzb) {
            throw new ConcurrentModificationException();
        }
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    public final boolean hasNext() {
        return this.zzc >= 0;
    }

    public final Object next() {
        zzb();
        if (hasNext()) {
            int i10 = this.zzc;
            this.zzd = i10;
            Object zza = zza(i10);
            this.zzc = this.zze.zzf(this.zzc);
            return zza;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        boolean z10;
        zzb();
        if (this.zzd >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzaq.zzd(z10, "no calls to next() since the last call to remove()");
        this.zzb += 32;
        zzbt zzbt = this.zze;
        int i10 = this.zzd;
        Object[] objArr = zzbt.zzb;
        objArr.getClass();
        zzbt.remove(objArr[i10]);
        this.zzc--;
        this.zzd = -1;
    }

    public abstract Object zza(int i10);
}
