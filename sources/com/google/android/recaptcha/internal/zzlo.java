package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
final class zzlo implements zzlv {
    private final zzlv[] zza;

    public zzlo(zzlv... zzlvArr) {
        this.zza = zzlvArr;
    }

    public final zzlu zzb(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            zzlv zzlv = this.zza[i10];
            if (zzlv.zzc(cls)) {
                return zzlv.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    public final boolean zzc(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            if (this.zza[i10].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
