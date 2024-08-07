package com.google.android.gms.internal.p001firebaseauthapi;

import android.support.v4.media.a;
import com.google.android.gms.internal.p001firebaseauthapi.zzakg;
import com.google.android.gms.internal.p001firebaseauthapi.zzakk;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzakk  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public abstract class zzakk<MessageType extends zzakk<MessageType, BuilderType>, BuilderType extends zzakg<MessageType, BuilderType>> extends zzaip<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    public zzamw zzc = zzamw.zzc();
    private int zzd = -1;

    public static zzakp zzA() {
        return zzaly.zze();
    }

    public static zzakp zzB(zzakp zzakp) {
        int i10;
        int size = zzakp.size();
        if (size == 0) {
            i10 = 10;
        } else {
            i10 = size + size;
        }
        return zzakp.zzd(i10);
    }

    public static Object zzD(Method method, Object obj, Object... objArr) {
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

    public static Object zzE(zzalp zzalp, String str, Object[] objArr) {
        return new zzalz(zzalp, str, objArr);
    }

    public static void zzH(Class cls, zzakk zzakk) {
        zzakk.zzG();
        zzb.put(cls, zzakk);
    }

    private final int zza(zzamb zzamb) {
        return zzalx.zza().zzb(getClass()).zza(this);
    }

    private static zzakk zzb(zzakk zzakk) {
        if (zzakk == null || zzakk.zzK()) {
            return zzakk;
        }
        zzaks zza = new zzamu(zzakk).zza();
        zza.zzh(zzakk);
        throw zza;
    }

    private static zzakk zzc(zzakk zzakk, byte[] bArr, int i10, int i11, zzajx zzajx) {
        zzakk zzw = zzakk.zzw();
        try {
            zzamb zzb2 = zzalx.zza().zzb(zzw.getClass());
            zzb2.zzi(zzw, bArr, 0, i11, new zzais(zzajx));
            zzb2.zzf(zzw);
            return zzw;
        } catch (zzaks e10) {
            e = e10;
            if (e.zzl()) {
                e = new zzaks((IOException) e);
            }
            e.zzh(zzw);
            throw e;
        } catch (zzamu e11) {
            zzaks zza = e11.zza();
            zza.zzh(zzw);
            throw zza;
        } catch (IOException e12) {
            if (e12.getCause() instanceof zzaks) {
                throw ((zzaks) e12.getCause());
            }
            zzaks zzaks = new zzaks(e12);
            zzaks.zzh(zzw);
            throw zzaks;
        } catch (IndexOutOfBoundsException unused) {
            zzaks zzj = zzaks.zzj();
            zzj.zzh(zzw);
            throw zzj;
        }
    }

    public static zzakk zzv(Class cls) {
        Map map = zzb;
        zzakk zzakk = (zzakk) map.get(cls);
        if (zzakk == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzakk = (zzakk) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (zzakk == null) {
            zzakk = (zzakk) ((zzakk) zzanf.zze(cls)).zzj(6, (Object) null, (Object) null);
            if (zzakk != null) {
                map.put(cls, zzakk);
            } else {
                throw new IllegalStateException();
            }
        }
        return zzakk;
    }

    public static zzakk zzx(zzakk zzakk, zzajf zzajf, zzajx zzajx) {
        zzajl zzh = zzajf.zzh();
        zzakk zzw = zzakk.zzw();
        try {
            zzamb zzb2 = zzalx.zza().zzb(zzw.getClass());
            zzb2.zzh(zzw, zzajm.zzq(zzh), zzajx);
            zzb2.zzf(zzw);
            try {
                zzh.zzz(0);
                zzb(zzw);
                return zzw;
            } catch (zzaks e10) {
                e10.zzh(zzw);
                throw e10;
            }
        } catch (zzaks e11) {
            e = e11;
            if (e.zzl()) {
                e = new zzaks((IOException) e);
            }
            e.zzh(zzw);
            throw e;
        } catch (zzamu e12) {
            zzaks zza = e12.zza();
            zza.zzh(zzw);
            throw zza;
        } catch (IOException e13) {
            if (e13.getCause() instanceof zzaks) {
                throw ((zzaks) e13.getCause());
            }
            zzaks zzaks = new zzaks(e13);
            zzaks.zzh(zzw);
            throw zzaks;
        } catch (RuntimeException e14) {
            if (e14.getCause() instanceof zzaks) {
                throw ((zzaks) e14.getCause());
            }
            throw e14;
        }
    }

    public static zzakk zzy(zzakk zzakk, InputStream inputStream, zzajx zzajx) {
        zzajj zzajj = new zzajj(inputStream, 4096, (zzaji) null);
        zzakk zzw = zzakk.zzw();
        try {
            zzamb zzb2 = zzalx.zza().zzb(zzw.getClass());
            zzb2.zzh(zzw, zzajm.zzq(zzajj), zzajx);
            zzb2.zzf(zzw);
            zzb(zzw);
            return zzw;
        } catch (zzaks e10) {
            e = e10;
            if (e.zzl()) {
                e = new zzaks((IOException) e);
            }
            e.zzh(zzw);
            throw e;
        } catch (zzamu e11) {
            zzaks zza = e11.zza();
            zza.zzh(zzw);
            throw zza;
        } catch (IOException e12) {
            if (e12.getCause() instanceof zzaks) {
                throw ((zzaks) e12.getCause());
            }
            zzaks zzaks = new zzaks(e12);
            zzaks.zzh(zzw);
            throw zzaks;
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof zzaks) {
                throw ((zzaks) e13.getCause());
            }
            throw e13;
        }
    }

    public static zzakk zzz(zzakk zzakk, byte[] bArr, zzajx zzajx) {
        zzakk zzc2 = zzc(zzakk, bArr, 0, bArr.length, zzajx);
        zzb(zzc2);
        return zzc2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzalx.zza().zzb(getClass()).zzj(this, (zzakk) obj);
    }

    public final int hashCode() {
        if (zzL()) {
            return zzr();
        }
        int i10 = this.zza;
        if (i10 != 0) {
            return i10;
        }
        int zzr = zzr();
        this.zza = zzr;
        return zzr;
    }

    public final String toString() {
        return zzalr.zza(this, super.toString());
    }

    public final /* synthetic */ zzalo zzC() {
        return (zzakg) zzj(5, (Object) null, (Object) null);
    }

    public final void zzF() {
        zzalx.zza().zzb(getClass()).zzf(this);
        zzG();
    }

    public final void zzG() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final void zzI(int i10) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final void zzJ(zzajs zzajs) {
        zzalx.zza().zzb(getClass()).zzm(this, zzajt.zza(zzajs));
    }

    public final boolean zzK() {
        zzakk zzakk;
        byte byteValue = ((Byte) zzj(1, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzk = zzalx.zza().zzb(getClass()).zzk(this);
        if (true != zzk) {
            zzakk = null;
        } else {
            zzakk = this;
        }
        zzj(2, zzakk, (Object) null);
        return zzk;
    }

    public final boolean zzL() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public final /* synthetic */ zzalp zzM() {
        return (zzakk) zzj(6, (Object) null, (Object) null);
    }

    public abstract Object zzj(int i10, Object obj, Object obj2);

    public final int zzn(zzamb zzamb) {
        if (zzL()) {
            int zza = zzamb.zza(this);
            if (zza >= 0) {
                return zza;
            }
            throw new IllegalStateException(a.m("serialized size must be non-negative, was ", zza));
        }
        int i10 = this.zzd & Integer.MAX_VALUE;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int zza2 = zzamb.zza(this);
        if (zza2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | zza2;
            return zza2;
        }
        throw new IllegalStateException(a.m("serialized size must be non-negative, was ", zza2));
    }

    public final int zzr() {
        return zzalx.zza().zzb(getClass()).zzb(this);
    }

    public final int zzs() {
        int i10;
        if (zzL()) {
            i10 = zza((zzamb) null);
            if (i10 < 0) {
                throw new IllegalStateException(a.m("serialized size must be non-negative, was ", i10));
            }
        } else {
            i10 = this.zzd & Integer.MAX_VALUE;
            if (i10 == Integer.MAX_VALUE) {
                i10 = zza((zzamb) null);
                if (i10 >= 0) {
                    this.zzd = (this.zzd & Integer.MIN_VALUE) | i10;
                } else {
                    throw new IllegalStateException(a.m("serialized size must be non-negative, was ", i10));
                }
            }
        }
        return i10;
    }

    public final zzakg zzt() {
        return (zzakg) zzj(5, (Object) null, (Object) null);
    }

    public final zzakg zzu() {
        zzakg zzakg = (zzakg) zzj(5, (Object) null, (Object) null);
        zzakg.zzh(this);
        return zzakg;
    }

    public final zzakk zzw() {
        return (zzakk) zzj(4, (Object) null, (Object) null);
    }
}