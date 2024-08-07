package com.google.android.recaptcha.internal;

import f0.b0;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
final class zzjx extends zzii implements RandomAccess, zzmf {
    private double[] zza;
    private int zzb;

    static {
        new zzjx(new double[0], 0, false);
    }

    public zzjx() {
        this(new double[10], 0, true);
    }

    private final String zzg(int i10) {
        return b0.p("Index:", i10, ", Size:", this.zzb);
    }

    private final void zzh(int i10) {
        if (i10 < 0 || i10 >= this.zzb) {
            throw new IndexOutOfBoundsException(zzg(i10));
        }
    }

    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        double doubleValue = ((Double) obj).doubleValue();
        zza();
        if (i10 < 0 || i10 > (i11 = this.zzb)) {
            throw new IndexOutOfBoundsException(zzg(i10));
        }
        int i12 = i10 + 1;
        double[] dArr = this.zza;
        if (i11 < dArr.length) {
            System.arraycopy(dArr, i10, dArr, i12, i11 - i10);
        } else {
            double[] dArr2 = new double[b0.o(i11, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            System.arraycopy(this.zza, i10, dArr2, i12, this.zzb - i10);
            this.zza = dArr2;
        }
        this.zza[i10] = doubleValue;
        this.zzb++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        zza();
        Charset charset = zzla.zza;
        collection.getClass();
        if (!(collection instanceof zzjx)) {
            return super.addAll(collection);
        }
        zzjx zzjx = (zzjx) collection;
        int i10 = zzjx.zzb;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.zzb;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            double[] dArr = this.zza;
            if (i12 > dArr.length) {
                this.zza = Arrays.copyOf(dArr, i12);
            }
            System.arraycopy(zzjx.zza, 0, this.zza, this.zzb, zzjx.zzb);
            this.zzb = i12;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzjx)) {
            return super.equals(obj);
        }
        zzjx zzjx = (zzjx) obj;
        if (this.zzb != zzjx.zzb) {
            return false;
        }
        double[] dArr = zzjx.zza;
        for (int i10 = 0; i10 < this.zzb; i10++) {
            if (Double.doubleToLongBits(this.zza[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i10) {
        zzh(i10);
        return Double.valueOf(this.zza[i10]);
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.zzb; i11++) {
            long doubleToLongBits = Double.doubleToLongBits(this.zza[i11]);
            Charset charset = zzla.zza;
            i10 = (i10 * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
        }
        return i10;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i10 = this.zzb;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.zza[i11] == doubleValue) {
                return i11;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        zza();
        zzh(i10);
        double[] dArr = this.zza;
        double d10 = dArr[i10];
        int i11 = this.zzb;
        if (i10 < i11 - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (i11 - i10) - 1);
        }
        this.zzb--;
        this.modCount++;
        return Double.valueOf(d10);
    }

    public final void removeRange(int i10, int i11) {
        zza();
        if (i11 >= i10) {
            double[] dArr = this.zza;
            System.arraycopy(dArr, i11, dArr, i10, this.zzb - i11);
            this.zzb -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        zza();
        zzh(i10);
        double[] dArr = this.zza;
        double d10 = dArr[i10];
        dArr[i10] = doubleValue;
        return Double.valueOf(d10);
    }

    public final int size() {
        return this.zzb;
    }

    public final /* bridge */ /* synthetic */ zzkz zzd(int i10) {
        if (i10 >= this.zzb) {
            return new zzjx(Arrays.copyOf(this.zza, i10), this.zzb, true);
        }
        throw new IllegalArgumentException();
    }

    public final double zze(int i10) {
        zzh(i10);
        return this.zza[i10];
    }

    public final void zzf(double d10) {
        zza();
        int i10 = this.zzb;
        double[] dArr = this.zza;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[b0.o(i10, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.zza = dArr2;
        }
        double[] dArr3 = this.zza;
        int i11 = this.zzb;
        this.zzb = i11 + 1;
        dArr3[i11] = d10;
    }

    private zzjx(double[] dArr, int i10, boolean z10) {
        super(z10);
        this.zza = dArr;
        this.zzb = i10;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzf(((Double) obj).doubleValue());
        return true;
    }
}
