package com.google.android.gms.internal.measurement;

import f0.b0;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
public abstract class zzhu implements Serializable, Iterable<Byte> {
    public static final zzhu zza = new zzie(zzjh.zzb);
    private static final zzib zzb = new zzih();
    private static final Comparator<zzhu> zzc = new zzhw();
    private int zzd = 0;

    public static /* synthetic */ int zza(byte b10) {
        return b10 & 255;
    }

    public static int zza(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i10 + " < 0");
        } else if (i11 < i10) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i10 + ", " + i11);
        } else {
            throw new IndexOutOfBoundsException("End index: " + i11 + " >= " + i12);
        }
    }

    public static zzid zzc(int i10) {
        return new zzid(i10);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i10 = this.zzd;
        if (i10 == 0) {
            int zzb2 = zzb();
            i10 = zzb(zzb2, 0, zzb2);
            if (i10 == 0) {
                i10 = 1;
            }
            this.zzd = i10;
        }
        return i10;
    }

    public /* synthetic */ Iterator iterator() {
        return new zzhx(this);
    }

    public final String toString() {
        String str;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(zzb());
        if (zzb() <= 50) {
            str = zzme.zza(this);
        } else {
            str = b0.r(zzme.zza(zza(0, 47)), "...");
        }
        objArr[2] = str;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public abstract byte zza(int i10);

    public abstract zzhu zza(int i10, int i11);

    public abstract String zza(Charset charset);

    public abstract void zza(zzhv zzhv);

    public abstract byte zzb(int i10);

    public abstract int zzb();

    public abstract int zzb(int i10, int i11, int i12);

    public abstract boolean zzd();

    public final String zzc() {
        return zzb() == 0 ? "" : zza(zzjh.zza);
    }

    public final int zza() {
        return this.zzd;
    }

    public static zzhu zza(byte[] bArr, int i10, int i11) {
        zza(i10, i10 + i11, bArr.length);
        return new zzie(zzb.zza(bArr, i10, i11));
    }

    public static zzhu zza(String str) {
        return new zzie(str.getBytes(zzjh.zza));
    }

    public static zzhu zza(byte[] bArr) {
        return new zzie(bArr);
    }
}
