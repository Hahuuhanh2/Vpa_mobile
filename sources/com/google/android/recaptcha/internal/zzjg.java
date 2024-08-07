package com.google.android.recaptcha.internal;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public abstract class zzjg extends zzin {
    private static final Logger zzb = Logger.getLogger(zzjg.class.getName());
    /* access modifiers changed from: private */
    public static final boolean zzc = zzni.zzx();
    public zzjh zza;

    private zzjg() {
        throw null;
    }

    public /* synthetic */ zzjg(zzjf zzjf) {
    }

    @Deprecated
    public static int zzt(int i10, zzlx zzlx, zzmk zzmk) {
        int zzx = zzx(i10 << 3);
        return ((zzig) zzlx).zza(zzmk) + zzx + zzx;
    }

    public static int zzu(zzlx zzlx) {
        int zzn = zzlx.zzn();
        return zzx(zzn) + zzn;
    }

    public static int zzv(zzlx zzlx, zzmk zzmk) {
        int zza2 = ((zzig) zzlx).zza(zzmk);
        return zzx(zza2) + zza2;
    }

    public static int zzw(String str) {
        int i10;
        try {
            i10 = zznl.zzc(str);
        } catch (zznk unused) {
            i10 = str.getBytes(zzla.zza).length;
        }
        return zzx(i10) + i10;
    }

    public static int zzx(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public static int zzy(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    public static zzjg zzz(byte[] bArr, int i10, int i11) {
        return new zzjd(bArr, 0, i11);
    }

    public final void zzA() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void zzB(String str, zznk zznk) {
        zzb.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", zznk);
        byte[] bytes = str.getBytes(zzla.zza);
        try {
            int length = bytes.length;
            zzq(length);
            zzl(bytes, 0, length);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzje(e10);
        }
    }

    public abstract int zza();

    public abstract void zzb(byte b10);

    public abstract void zzd(int i10, boolean z10);

    public abstract void zze(int i10, zziv zziv);

    public abstract void zzf(int i10, int i11);

    public abstract void zzg(int i10);

    public abstract void zzh(int i10, long j10);

    public abstract void zzi(long j10);

    public abstract void zzj(int i10, int i11);

    public abstract void zzk(int i10);

    public abstract void zzl(byte[] bArr, int i10, int i11);

    public abstract void zzm(int i10, String str);

    public abstract void zzo(int i10, int i11);

    public abstract void zzp(int i10, int i11);

    public abstract void zzq(int i10);

    public abstract void zzr(int i10, long j10);

    public abstract void zzs(long j10);
}
