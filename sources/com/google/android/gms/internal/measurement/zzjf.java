package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzjf;
import com.google.android.gms.internal.measurement.zzjf.zzb;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
public abstract class zzjf<MessageType extends zzjf<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> extends zzhl<MessageType, BuilderType> {
    private static Map<Object, zzjf<?, ?>> zzc = new ConcurrentHashMap();
    public zzmh zzb = zzmh.zzc();
    private int zzd = -1;

    /* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
    public static class zza<T extends zzjf<T, ?>> extends zzhp<T> {
        private final T zza;

        public zza(T t10) {
            this.zza = t10;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
    public static abstract class zzb<MessageType extends zzjf<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> extends zzhn<MessageType, BuilderType> {
        public MessageType zza;
        private final MessageType zzb;

        public zzb(MessageType messagetype) {
            this.zzb = messagetype;
            if (!messagetype.zzcj()) {
                this.zza = messagetype.zzbz();
                return;
            }
            throw new IllegalArgumentException("Default instance must be immutable.");
        }

        private final BuilderType zzb(byte[] bArr, int i10, int i11, zzis zzis) {
            if (!this.zza.zzcj()) {
                zzak();
            }
            try {
                zzlf.zza().zza(this.zza).zza(this.zza, bArr, 0, i11, new zzht(zzis));
                return this;
            } catch (zzjq e10) {
                throw e10;
            } catch (IndexOutOfBoundsException unused) {
                throw zzjq.zzh();
            } catch (IOException e11) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e11);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: zzc */
        public final BuilderType zzb(zzij zzij, zzis zzis) {
            if (!this.zza.zzcj()) {
                zzak();
            }
            try {
                zzlf.zza().zza(this.zza).zza(this.zza, zzin.zza(zzij), zzis);
                return this;
            } catch (RuntimeException e10) {
                if (e10.getCause() instanceof IOException) {
                    throw ((IOException) e10.getCause());
                }
                throw e10;
            }
        }

        public /* synthetic */ Object clone() {
            zzb zzb2 = (zzb) this.zzb.zza(zze.zze, (Object) null, (Object) null);
            zzb2.zza = (zzjf) zzai();
            return zzb2;
        }

        public final /* synthetic */ zzhn zza(zzij zzij, zzis zzis) {
            return (zzb) zzb(zzij, zzis);
        }

        public final /* synthetic */ zzhn zzae() {
            return (zzb) clone();
        }

        /* renamed from: zzaf */
        public final MessageType zzah() {
            MessageType messagetype = (zzjf) zzai();
            if (messagetype.zzci()) {
                return messagetype;
            }
            throw new zzmf(messagetype);
        }

        /* renamed from: zzag */
        public MessageType zzai() {
            if (!this.zza.zzcj()) {
                return this.zza;
            }
            this.zza.zzcg();
            return this.zza;
        }

        public final void zzaj() {
            if (!this.zza.zzcj()) {
                zzak();
            }
        }

        public void zzak() {
            MessageType zzbz = this.zzb.zzbz();
            zza(zzbz, this.zza);
            this.zza = zzbz;
        }

        public final /* synthetic */ zzkr zzcf() {
            return this.zzb;
        }

        public final boolean zzci() {
            return zzjf.zza(this.zza, false);
        }

        public final /* synthetic */ zzhn zza(byte[] bArr, int i10, int i11) {
            return zzb(bArr, 0, i11, zzis.zza);
        }

        public final /* synthetic */ zzhn zza(byte[] bArr, int i10, int i11, zzis zzis) {
            return zzb(bArr, 0, i11, zzis);
        }

        public final BuilderType zza(MessageType messagetype) {
            if (this.zzb.equals(messagetype)) {
                return this;
            }
            if (!this.zza.zzcj()) {
                zzak();
            }
            zza(this.zza, messagetype);
            return this;
        }

        private static <MessageType> void zza(MessageType messagetype, MessageType messagetype2) {
            zzlf.zza().zza(messagetype).zza(messagetype, messagetype2);
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
    public static final class zzc implements zzja<zzc> {
        public final /* synthetic */ int compareTo(Object obj) {
            throw new NoSuchMethodError();
        }

        public final int zza() {
            throw new NoSuchMethodError();
        }

        public final zzmv zzb() {
            throw new NoSuchMethodError();
        }

        public final zznf zzc() {
            throw new NoSuchMethodError();
        }

        public final boolean zzd() {
            throw new NoSuchMethodError();
        }

        public final boolean zze() {
            throw new NoSuchMethodError();
        }

        public final zzku zza(zzku zzku, zzkr zzkr) {
            throw new NoSuchMethodError();
        }

        public final zzla zza(zzla zzla, zzla zzla2) {
            throw new NoSuchMethodError();
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
    public static abstract class zzd<MessageType extends zzd<MessageType, BuilderType>, BuilderType> extends zzjf<MessageType, BuilderType> implements zzkt {
        public zziy<zzc> zzc = zziy.zzb();

        public final zziy<zzc> zza() {
            if (this.zzc.zzf()) {
                this.zzc = (zziy) this.zzc.clone();
            }
            return this.zzc;
        }
    }

    /* 'enum' modifier removed */
    /* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
    public static final class zze {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        public static final int zzg = 7;
        private static final /* synthetic */ int[] zzh = {1, 2, 3, 4, 5, 6, 7};

        public static int[] zza() {
            return (int[]) zzh.clone();
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
    public static class zzf<ContainingType extends zzkr, Type> extends zzit<ContainingType, Type> {
    }

    private final int zza() {
        return zzlf.zza().zza(this).zzb(this);
    }

    private final int zzb(zzlj<?> zzlj) {
        if (zzlj == null) {
            return zzlf.zza().zza(this).zza(this);
        }
        return zzlj.zza(this);
    }

    public static zzjl zzca() {
        return zzji.zzd();
    }

    public static zzjo zzcb() {
        return zzkg.zzd();
    }

    public static <E> zzjn<E> zzcc() {
        return zzli.zzd();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zzlf.zza().zza(this).zzb(this, (zzjf) obj);
        }
        return false;
    }

    public int hashCode() {
        if (zzcj()) {
            return zza();
        }
        if (this.zza == 0) {
            this.zza = zza();
        }
        return this.zza;
    }

    public String toString() {
        return zzkw.zza((zzkr) this, super.toString());
    }

    public abstract Object zza(int i10, Object obj, Object obj2);

    public final int zzbt() {
        return this.zzd & Integer.MAX_VALUE;
    }

    public final int zzbw() {
        return zza((zzlj) null);
    }

    public final <MessageType extends zzjf<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> BuilderType zzbx() {
        return (zzb) zza(zze.zze, (Object) null, (Object) null);
    }

    public final BuilderType zzby() {
        return ((zzb) zza(zze.zze, (Object) null, (Object) null)).zza(this);
    }

    public final MessageType zzbz() {
        return (zzjf) zza(zze.zzd, (Object) null, (Object) null);
    }

    public final void zzc(int i10) {
        if (i10 >= 0) {
            this.zzd = (i10 & Integer.MAX_VALUE) | (this.zzd & Integer.MIN_VALUE);
            return;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + i10);
    }

    public final /* synthetic */ zzku zzcd() {
        return (zzb) zza(zze.zze, (Object) null, (Object) null);
    }

    public final /* synthetic */ zzku zzce() {
        return ((zzb) zza(zze.zze, (Object) null, (Object) null)).zza(this);
    }

    public final /* synthetic */ zzkr zzcf() {
        return (zzjf) zza(zze.zzf, (Object) null, (Object) null);
    }

    public final void zzcg() {
        zzlf.zza().zza(this).zzc(this);
        zzch();
    }

    public final void zzch() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final boolean zzci() {
        return zza(this, true);
    }

    public final boolean zzcj() {
        if ((this.zzd & Integer.MIN_VALUE) != 0) {
            return true;
        }
        return false;
    }

    public final int zza(zzlj zzlj) {
        if (zzcj()) {
            int zzb2 = zzb(zzlj);
            if (zzb2 >= 0) {
                return zzb2;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + zzb2);
        } else if (zzbt() != Integer.MAX_VALUE) {
            return zzbt();
        } else {
            int zzb3 = zzb(zzlj);
            zzc(zzb3);
            return zzb3;
        }
    }

    public static <T extends zzjf<?, ?>> T zza(Class<T> cls) {
        T t10 = (zzjf) zzc.get(cls);
        if (t10 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t10 = (zzjf) zzc.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (t10 == null) {
            t10 = (zzjf) ((zzjf) zzmo.zza(cls)).zza(zze.zzf, (Object) null, (Object) null);
            if (t10 != null) {
                zzc.put(cls, t10);
            } else {
                throw new IllegalStateException();
            }
        }
        return t10;
    }

    public static zzjo zza(zzjo zzjo) {
        int size = zzjo.size();
        return zzjo.zzc(size == 0 ? 10 : size << 1);
    }

    public static <E> zzjn<E> zza(zzjn<E> zzjn) {
        int size = zzjn.size();
        return zzjn.zza(size == 0 ? 10 : size << 1);
    }

    public static Object zza(Method method, Object obj, Object... objArr) {
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

    public static Object zza(zzkr zzkr, String str, Object[] objArr) {
        return new zzlh(zzkr, str, objArr);
    }

    public static <T extends zzjf<?, ?>> void zza(Class<T> cls, T t10) {
        t10.zzch();
        zzc.put(cls, t10);
    }

    public final void zza(zzio zzio) {
        zzlf.zza().zza(this).zza(this, (zzne) zzir.zza(zzio));
    }

    public static final <T extends zzjf<T, ?>> boolean zza(T t10, boolean z10) {
        byte byteValue = ((Byte) t10.zza(zze.zza, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzd2 = zzlf.zza().zza(t10).zzd(t10);
        if (z10) {
            t10.zza(zze.zzb, (Object) zzd2 ? t10 : null, (Object) null);
        }
        return zzd2;
    }
}
