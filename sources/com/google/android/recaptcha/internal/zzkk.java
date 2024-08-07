package com.google.android.recaptcha.internal;

import f0.b0;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
final class zzkk extends zzii implements RandomAccess, zzmf {
    private float[] zza;
    private int zzb;

    static {
        new zzkk(new float[0], 0, false);
    }

    public zzkk() {
        this(new float[10], 0, true);
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
        float floatValue = ((Float) obj).floatValue();
        zza();
        if (i10 < 0 || i10 > (i11 = this.zzb)) {
            throw new IndexOutOfBoundsException(zzg(i10));
        }
        int i12 = i10 + 1;
        float[] fArr = this.zza;
        if (i11 < fArr.length) {
            System.arraycopy(fArr, i10, fArr, i12, i11 - i10);
        } else {
            float[] fArr2 = new float[b0.o(i11, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            System.arraycopy(this.zza, i10, fArr2, i12, this.zzb - i10);
            this.zza = fArr2;
        }
        this.zza[i10] = floatValue;
        this.zzb++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        zza();
        Charset charset = zzla.zza;
        collection.getClass();
        if (!(collection instanceof zzkk)) {
            return super.addAll(collection);
        }
        zzkk zzkk = (zzkk) collection;
        int i10 = zzkk.zzb;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.zzb;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            float[] fArr = this.zza;
            if (i12 > fArr.length) {
                this.zza = Arrays.copyOf(fArr, i12);
            }
            System.arraycopy(zzkk.zza, 0, this.zza, this.zzb, zzkk.zzb);
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
        if (!(obj instanceof zzkk)) {
            return super.equals(obj);
        }
        zzkk zzkk = (zzkk) obj;
        if (this.zzb != zzkk.zzb) {
            return false;
        }
        float[] fArr = zzkk.zza;
        for (int i10 = 0; i10 < this.zzb; i10++) {
            if (Float.floatToIntBits(this.zza[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i10) {
        zzh(i10);
        return Float.valueOf(this.zza[i10]);
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.zzb; i11++) {
            i10 = (i10 * 31) + Float.floatToIntBits(this.zza[i11]);
        }
        return i10;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i10 = this.zzb;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.zza[i11] == floatValue) {
                return i11;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        zza();
        zzh(i10);
        float[] fArr = this.zza;
        float f10 = fArr[i10];
        int i11 = this.zzb;
        if (i10 < i11 - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (i11 - i10) - 1);
        }
        this.zzb--;
        this.modCount++;
        return Float.valueOf(f10);
    }

    public final void removeRange(int i10, int i11) {
        zza();
        if (i11 >= i10) {
            float[] fArr = this.zza;
            System.arraycopy(fArr, i11, fArr, i10, this.zzb - i11);
            this.zzb -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        zza();
        zzh(i10);
        float[] fArr = this.zza;
        float f10 = fArr[i10];
        fArr[i10] = floatValue;
        return Float.valueOf(f10);
    }

    public final int size() {
        return this.zzb;
    }

    public final /* bridge */ /* synthetic */ zzkz zzd(int i10) {
        if (i10 >= this.zzb) {
            return new zzkk(Arrays.copyOf(this.zza, i10), this.zzb, true);
        }
        throw new IllegalArgumentException();
    }

    public final float zze(int i10) {
        zzh(i10);
        return this.zza[i10];
    }

    public final void zzf(float f10) {
        zza();
        int i10 = this.zzb;
        float[] fArr = this.zza;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[b0.o(i10, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.zza = fArr2;
        }
        float[] fArr3 = this.zza;
        int i11 = this.zzb;
        this.zzb = i11 + 1;
        fArr3[i11] = f10;
    }

    private zzkk(float[] fArr, int i10, boolean z10) {
        super(z10);
        this.zza = fArr;
        this.zzb = i10;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzf(((Float) obj).floatValue());
        return true;
    }
}
