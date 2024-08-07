package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
final class zzkf implements zzlm {
    private static final zzks zza = new zzki();
    private final zzks zzb;

    public zzkf() {
        this(new zzkk(zzjg.zza(), zza()));
    }

    private static zzks zza() {
        try {
            return (zzks) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            return zza;
        }
    }

    private zzkf(zzks zzks) {
        this.zzb = (zzks) zzjh.zza(zzks, "messageInfoFactory");
    }

    public final <T> zzlj<T> zza(Class<T> cls) {
        Class<zzjf> cls2 = zzjf.class;
        zzll.zza((Class<?>) cls);
        zzkp zza2 = this.zzb.zza(cls);
        if (zza2.zzc()) {
            if (cls2.isAssignableFrom(cls)) {
                return zzkx.zza(zzll.zzb(), zziv.zzb(), zza2.zza());
            }
            return zzkx.zza(zzll.zza(), zziv.zza(), zza2.zza());
        } else if (cls2.isAssignableFrom(cls)) {
            if (zza(zza2)) {
                return zzkv.zza(cls, zza2, zzlb.zzb(), zzka.zzb(), zzll.zzb(), zziv.zzb(), zzkq.zzb());
            }
            return zzkv.zza(cls, zza2, zzlb.zzb(), zzka.zzb(), zzll.zzb(), (zziu<?>) null, zzkq.zzb());
        } else if (zza(zza2)) {
            return zzkv.zza(cls, zza2, zzlb.zza(), zzka.zza(), zzll.zza(), zziv.zza(), zzkq.zza());
        } else {
            return zzkv.zza(cls, zza2, zzlb.zza(), zzka.zza(), zzll.zza(), (zziu<?>) null, zzkq.zza());
        }
    }

    private static boolean zza(zzkp zzkp) {
        return zzkh.zza[zzkp.zzb().ordinal()] != 1;
    }
}
