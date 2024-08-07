package com.google.android.gms.internal.p001firebaseauthapi;

import f0.b0;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import v.v;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzajf  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public abstract class zzajf implements Iterable, Serializable {
    private static final Comparator zza = new zzaix();
    public static final zzajf zzb = new zzajc(zzakq.zzd);
    private static final zzaje zzd = new zzaje((zzajd) null);
    private int zzc = 0;

    static {
        int i10 = zzair.zza;
    }

    public static int zzl(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException(v.d("Beginning index: ", i10, " < 0"));
        } else if (i11 < i10) {
            throw new IndexOutOfBoundsException(b0.p("Beginning index larger than ending index: ", i10, ", ", i11));
        } else {
            throw new IndexOutOfBoundsException(b0.p("End index: ", i11, " >= ", i12));
        }
    }

    public static zzajf zzn(byte[] bArr, int i10, int i11) {
        zzl(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new zzajc(bArr2);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i10 = this.zzc;
        if (i10 == 0) {
            int zzd2 = zzd();
            i10 = zzf(zzd2, 0, zzd2);
            if (i10 == 0) {
                i10 = 1;
            }
            this.zzc = i10;
        }
        return i10;
    }

    public final /* synthetic */ Iterator iterator() {
        return new zzaiw(this);
    }

    public final String toString() {
        String str;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(zzd());
        if (zzd() <= 50) {
            str = zzamq.zza(this);
        } else {
            str = zzamq.zza(zzg(0, 47)).concat("...");
        }
        objArr[2] = str;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public abstract byte zza(int i10);

    public abstract byte zzb(int i10);

    public abstract int zzd();

    public abstract void zze(byte[] bArr, int i10, int i11, int i12);

    public abstract int zzf(int i10, int i11, int i12);

    public abstract zzajf zzg(int i10, int i11);

    public abstract zzajl zzh();

    public abstract String zzi(Charset charset);

    public abstract void zzj(zzaiv zzaiv);

    public abstract boolean zzk();

    public final int zzm() {
        return this.zzc;
    }

    public final String zzo(Charset charset) {
        if (zzd() == 0) {
            return "";
        }
        return zzi(charset);
    }

    public final boolean zzp() {
        return zzd() == 0;
    }

    public final byte[] zzq() {
        int zzd2 = zzd();
        if (zzd2 == 0) {
            return zzakq.zzd;
        }
        byte[] bArr = new byte[zzd2];
        zze(bArr, 0, 0, zzd2);
        return bArr;
    }
}