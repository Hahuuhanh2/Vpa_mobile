package com.google.android.recaptcha.internal;

import java.nio.charset.Charset;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
final class zzlp implements zzml {
    private static final zzlv zza = new zzln();
    private final zzlv zzb;

    public zzlp() {
        zzlv zzlv;
        zzlv[] zzlvArr = new zzlv[2];
        zzlvArr[0] = zzkl.zza();
        try {
            zzlv = (zzlv) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            zzlv = zza;
        }
        zzlvArr[1] = zzlv;
        zzlo zzlo = new zzlo(zzlvArr);
        Charset charset = zzla.zza;
        this.zzb = zzlo;
    }

    private static boolean zzb(zzlu zzlu) {
        if (zzlu.zzc() - 1 != 1) {
            return true;
        }
        return false;
    }

    public final zzmk zza(Class cls) {
        zzke zzke;
        zzke zzke2;
        Class<zzks> cls2 = zzks.class;
        zzmm.zzs(cls);
        zzlu zzb2 = this.zzb.zzb(cls);
        if (zzb2.zzb()) {
            if (cls2.isAssignableFrom(cls)) {
                return zzmb.zzc(zzmm.zzn(), zzkg.zzb(), zzb2.zza());
            }
            return zzmb.zzc(zzmm.zzm(), zzkg.zza(), zzb2.zza());
        } else if (cls2.isAssignableFrom(cls)) {
            zzmd zzb3 = zzme.zzb();
            zzlk zzb4 = zzll.zzb();
            zznb zzn = zzmm.zzn();
            if (zzb(zzb2)) {
                zzke2 = zzkg.zzb();
            } else {
                zzke2 = null;
            }
            return zzma.zzm(cls, zzb2, zzb3, zzb4, zzn, zzke2, zzlt.zzb());
        } else {
            zzmd zza2 = zzme.zza();
            zzlk zza3 = zzll.zza();
            zznb zzm = zzmm.zzm();
            if (zzb(zzb2)) {
                zzke = zzkg.zza();
            } else {
                zzke = null;
            }
            return zzma.zzm(cls, zzb2, zza2, zza3, zzm, zzke, zzlt.zza());
        }
    }
}
