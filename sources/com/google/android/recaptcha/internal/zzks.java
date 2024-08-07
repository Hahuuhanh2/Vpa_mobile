package com.google.android.recaptcha.internal;

import android.support.v4.media.a;
import com.google.android.recaptcha.internal.zzkm;
import com.google.android.recaptcha.internal.zzks;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public abstract class zzks<MessageType extends zzks<MessageType, BuilderType>, BuilderType extends zzkm<MessageType, BuilderType>> extends zzig<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    public zznc zzc = zznc.zzc();
    private int zzd = -1;

    public static zzkz zzA(zzkz zzkz) {
        int i10;
        int size = zzkz.size();
        if (size == 0) {
            i10 = 10;
        } else {
            i10 = size + size;
        }
        return zzkz.zzd(i10);
    }

    public static Object zzB(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    public static Object zzC(zzlx zzlx, String str, Object[] objArr) {
        return new zzmi(zzlx, str, objArr);
    }

    public static void zzF(Class cls, zzks zzks) {
        zzks.zzE();
        zzb.put(cls, zzks);
    }

    public static final boolean zzH(zzks zzks, boolean z10) {
        zzks zzks2;
        byte byteValue = ((Byte) zzks.zzh(1, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzl = zzmg.zza().zzb(zzks.getClass()).zzl(zzks);
        if (z10) {
            if (true != zzl) {
                zzks2 = null;
            } else {
                zzks2 = zzks;
            }
            zzks.zzh(2, zzks2, (Object) null);
        }
        return zzl;
    }

    private final int zzf(zzmk zzmk) {
        return zzmg.zza().zzb(getClass()).zza(this);
    }

    private static zzks zzg(zzks zzks) {
        if (zzks == null || zzks.zzo()) {
            return zzks;
        }
        throw new zzna(zzks).zza();
    }

    private static zzks zzi(zzks zzks, byte[] bArr, int i10, int i11, zzkd zzkd) {
        if (i11 == 0) {
            return zzks;
        }
        zzks zzt = zzks.zzt();
        try {
            zzmk zzb2 = zzmg.zza().zzb(zzt.getClass());
            zzb2.zzi(zzt, bArr, 0, i11, new zzik(zzkd));
            zzb2.zzf(zzt);
            return zzt;
        } catch (zzlc e10) {
            if (e10.zzk()) {
                throw new zzlc((IOException) e10);
            }
            throw e10;
        } catch (zzna e11) {
            throw e11.zza();
        } catch (IOException e12) {
            if (e12.getCause() instanceof zzlc) {
                throw ((zzlc) e12.getCause());
            }
            throw new zzlc(e12);
        } catch (IndexOutOfBoundsException unused) {
            throw zzlc.zzi();
        }
    }

    public static zzkq zzr(zzlx zzlx, Object obj, zzlx zzlx2, zzkv zzkv, int i10, zznm zznm, Class cls) {
        return new zzkq(zzlx, "", (zzlx) null, new zzkp((zzkv) null, i10, zznm, false, false), cls);
    }

    public static zzks zzs(Class cls) {
        Map map = zzb;
        zzks zzks = (zzks) map.get(cls);
        if (zzks == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzks = (zzks) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (zzks == null) {
            zzks = (zzks) ((zzks) zzni.zze(cls)).zzh(6, (Object) null, (Object) null);
            if (zzks != null) {
                map.put(cls, zzks);
            } else {
                throw new IllegalStateException();
            }
        }
        return zzks;
    }

    public static zzks zzu(zzks zzks, InputStream inputStream) {
        zzjb zzjb;
        if (inputStream == null) {
            byte[] bArr = zzla.zzb;
            int length = bArr.length;
            zzjb = zzjb.zzH(bArr, 0, 0, false);
        } else {
            zzjb = new zziz(inputStream, 4096, (zziy) null);
        }
        zzkd zzkd = zzkd.zza;
        zzks zzt = zzks.zzt();
        try {
            zzmk zzb2 = zzmg.zza().zzb(zzt.getClass());
            zzb2.zzh(zzt, zzjc.zzq(zzjb), zzkd);
            zzb2.zzf(zzt);
            zzg(zzt);
            return zzt;
        } catch (zzlc e10) {
            if (e10.zzk()) {
                throw new zzlc((IOException) e10);
            }
            throw e10;
        } catch (zzna e11) {
            throw e11.zza();
        } catch (IOException e12) {
            if (e12.getCause() instanceof zzlc) {
                throw ((zzlc) e12.getCause());
            }
            throw new zzlc(e12);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof zzlc) {
                throw ((zzlc) e13.getCause());
            }
            throw e13;
        }
    }

    public static zzks zzv(zzks zzks, byte[] bArr) {
        zzks zzi = zzi(zzks, bArr, 0, bArr.length, zzkd.zza);
        zzg(zzi);
        return zzi;
    }

    public static zzkx zzw() {
        return zzkt.zzf();
    }

    public static zzkx zzx(zzkx zzkx) {
        int i10;
        int size = zzkx.size();
        if (size == 0) {
            i10 = 10;
        } else {
            i10 = size + size;
        }
        return zzkx.zzg(i10);
    }

    public static zzky zzy() {
        return zzlm.zzf();
    }

    public static zzkz zzz() {
        return zzmh.zze();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzmg.zza().zzb(getClass()).zzk(this, (zzks) obj);
    }

    public final int hashCode() {
        if (zzI()) {
            return zzm();
        }
        int i10 = this.zza;
        if (i10 != 0) {
            return i10;
        }
        int zzm = zzm();
        this.zza = zzm;
        return zzm;
    }

    public final String toString() {
        return zzlz.zza(this, super.toString());
    }

    public final void zzD() {
        zzmg.zza().zzb(getClass()).zzf(this);
        zzE();
    }

    public final void zzE() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final void zzG(int i10) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final boolean zzI() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public final int zza(zzmk zzmk) {
        if (zzI()) {
            int zza = zzmk.zza(this);
            if (zza >= 0) {
                return zza;
            }
            throw new IllegalStateException(a.m("serialized size must be non-negative, was ", zza));
        }
        int i10 = this.zzd & Integer.MAX_VALUE;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int zza2 = zzmk.zza(this);
        if (zza2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | zza2;
            return zza2;
        }
        throw new IllegalStateException(a.m("serialized size must be non-negative, was ", zza2));
    }

    public final /* synthetic */ zzlw zzaa() {
        return (zzkm) zzh(5, (Object) null, (Object) null);
    }

    public final /* synthetic */ zzlw zzab() {
        zzkm zzkm = (zzkm) zzh(5, (Object) null, (Object) null);
        zzkm.zzg(this);
        return zzkm;
    }

    public final /* synthetic */ zzlx zzac() {
        return (zzks) zzh(6, (Object) null, (Object) null);
    }

    public final void zze(zzjg zzjg) {
        zzmg.zza().zzb(getClass()).zzj(this, zzjh.zza(zzjg));
    }

    public abstract Object zzh(int i10, Object obj, Object obj2);

    /* access modifiers changed from: package-private */
    public final int zzm() {
        return zzmg.zza().zzb(getClass()).zzb(this);
    }

    public final int zzn() {
        int i10;
        if (zzI()) {
            i10 = zzf((zzmk) null);
            if (i10 < 0) {
                throw new IllegalStateException(a.m("serialized size must be non-negative, was ", i10));
            }
        } else {
            i10 = this.zzd & Integer.MAX_VALUE;
            if (i10 == Integer.MAX_VALUE) {
                i10 = zzf((zzmk) null);
                if (i10 >= 0) {
                    this.zzd = (this.zzd & Integer.MIN_VALUE) | i10;
                } else {
                    throw new IllegalStateException(a.m("serialized size must be non-negative, was ", i10));
                }
            }
        }
        return i10;
    }

    public final boolean zzo() {
        return zzH(this, true);
    }

    public final zzkm zzp() {
        return (zzkm) zzh(5, (Object) null, (Object) null);
    }

    public final zzkm zzq() {
        zzkm zzkm = (zzkm) zzh(5, (Object) null, (Object) null);
        zzkm.zzg(this);
        return zzkm;
    }

    public final zzks zzt() {
        return (zzks) zzh(4, (Object) null, (Object) null);
    }
}
