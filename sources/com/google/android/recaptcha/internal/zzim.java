package com.google.android.recaptcha.internal;

import f0.b0;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
final class zzim extends zzii implements RandomAccess, zzmf {
    private boolean[] zza;
    private int zzb;

    static {
        new zzim(new boolean[0], 0, false);
    }

    public zzim() {
        this(new boolean[10], 0, true);
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
        boolean booleanValue = ((Boolean) obj).booleanValue();
        zza();
        if (i10 < 0 || i10 > (i11 = this.zzb)) {
            throw new IndexOutOfBoundsException(zzg(i10));
        }
        int i12 = i10 + 1;
        boolean[] zArr = this.zza;
        if (i11 < zArr.length) {
            System.arraycopy(zArr, i10, zArr, i12, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[b0.o(i11, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            System.arraycopy(this.zza, i10, zArr2, i12, this.zzb - i10);
            this.zza = zArr2;
        }
        this.zza[i10] = booleanValue;
        this.zzb++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        zza();
        Charset charset = zzla.zza;
        collection.getClass();
        if (!(collection instanceof zzim)) {
            return super.addAll(collection);
        }
        zzim zzim = (zzim) collection;
        int i10 = zzim.zzb;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.zzb;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            boolean[] zArr = this.zza;
            if (i12 > zArr.length) {
                this.zza = Arrays.copyOf(zArr, i12);
            }
            System.arraycopy(zzim.zza, 0, this.zza, this.zzb, zzim.zzb);
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
        if (!(obj instanceof zzim)) {
            return super.equals(obj);
        }
        zzim zzim = (zzim) obj;
        if (this.zzb != zzim.zzb) {
            return false;
        }
        boolean[] zArr = zzim.zza;
        for (int i10 = 0; i10 < this.zzb; i10++) {
            if (this.zza[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i10) {
        zzh(i10);
        return Boolean.valueOf(this.zza[i10]);
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.zzb; i11++) {
            i10 = (i10 * 31) + zzla.zza(this.zza[i11]);
        }
        return i10;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i10 = this.zzb;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.zza[i11] == booleanValue) {
                return i11;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        zza();
        zzh(i10);
        boolean[] zArr = this.zza;
        boolean z10 = zArr[i10];
        int i11 = this.zzb;
        if (i10 < i11 - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (i11 - i10) - 1);
        }
        this.zzb--;
        this.modCount++;
        return Boolean.valueOf(z10);
    }

    public final void removeRange(int i10, int i11) {
        zza();
        if (i11 >= i10) {
            boolean[] zArr = this.zza;
            System.arraycopy(zArr, i11, zArr, i10, this.zzb - i11);
            this.zzb -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        zza();
        zzh(i10);
        boolean[] zArr = this.zza;
        boolean z10 = zArr[i10];
        zArr[i10] = booleanValue;
        return Boolean.valueOf(z10);
    }

    public final int size() {
        return this.zzb;
    }

    public final /* bridge */ /* synthetic */ zzkz zzd(int i10) {
        if (i10 >= this.zzb) {
            return new zzim(Arrays.copyOf(this.zza, i10), this.zzb, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zze(boolean z10) {
        zza();
        int i10 = this.zzb;
        boolean[] zArr = this.zza;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[b0.o(i10, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            this.zza = zArr2;
        }
        boolean[] zArr3 = this.zza;
        int i11 = this.zzb;
        this.zzb = i11 + 1;
        zArr3[i11] = z10;
    }

    public final boolean zzf(int i10) {
        zzh(i10);
        return this.zza[i10];
    }

    private zzim(boolean[] zArr, int i10, boolean z10) {
        super(z10);
        this.zza = zArr;
        this.zzb = i10;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zze(((Boolean) obj).booleanValue());
        return true;
    }
}
