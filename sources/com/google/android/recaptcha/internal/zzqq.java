package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzqq extends zzks implements zzly {
    /* access modifiers changed from: private */
    public static final zzqq zzb;
    private int zzd = 0;
    private Object zze;

    static {
        zzqq zzqq = new zzqq();
        zzb = zzqq;
        zzks.zzF(zzqq.class, zzqq);
    }

    private zzqq() {
    }

    public static zzqq zzg() {
        return zzb;
    }

    public final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzks.zzC(zzb, "\u0000&\u0001\u0000\u0001&&\u0000\u0000\u0000\u0001?\u0000\u0002?\u0000\u0003?\u0000\u0004?\u0000\u0005?\u0000\u0006?\u0000\u0007?\u0000\b?\u0000\t?\u0000\n?\u0000\u000b?\u0000\f?\u0000\r?\u0000\u000e?\u0000\u000f?\u0000\u0010?\u0000\u0011?\u0000\u0012?\u0000\u0013?\u0000\u0014?\u0000\u0015?\u0000\u0016?\u0000\u0017?\u0000\u0018?\u0000\u0019?\u0000\u001a?\u0000\u001b?\u0000\u001c?\u0000\u001d?\u0000\u001e?\u0000\u001f?\u0000 ?\u0000!?\u0000\"?\u0000#?\u0000$?\u0000%?\u0000&?\u0000", new Object[]{"zze", "zzd"});
        } else if (i11 == 3) {
            return new zzqq();
        } else {
            if (i11 == 4) {
                return new zzqp((zzqo) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
