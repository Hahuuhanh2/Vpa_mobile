package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public abstract class zzjb {
    public static final /* synthetic */ int zzd = 0;
    private static volatile int zze = 100;
    public int zza;
    public final int zzb = zze;
    public zzjc zzc;

    public /* synthetic */ zzjb(zzja zzja) {
    }

    public static int zzF(int i10) {
        return (i10 >>> 1) ^ (-(i10 & 1));
    }

    public static long zzG(long j10) {
        return (j10 >>> 1) ^ (-(1 & j10));
    }

    public static zzjb zzH(byte[] bArr, int i10, int i11, boolean z10) {
        zzix zzix = new zzix(bArr, 0, 0, false, (zziw) null);
        try {
            zzix.zze(0);
            return zzix;
        } catch (zzlc e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public abstract void zzA(int i10);

    public abstract boolean zzC();

    public abstract boolean zzD();

    public abstract boolean zzE(int i10);

    public abstract double zzb();

    public abstract float zzc();

    public abstract int zzd();

    public abstract int zze(int i10);

    public abstract int zzf();

    public abstract int zzg();

    public abstract int zzh();

    public abstract int zzk();

    public abstract int zzl();

    public abstract int zzm();

    public abstract int zzn();

    public abstract long zzo();

    public abstract long zzp();

    public abstract long zzt();

    public abstract long zzu();

    public abstract long zzv();

    public abstract zziv zzw();

    public abstract String zzx();

    public abstract String zzy();

    public abstract void zzz(int i10);
}
