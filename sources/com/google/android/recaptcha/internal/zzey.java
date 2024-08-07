package com.google.android.recaptcha.internal;

import ek.i;
import rk.p;
import sk.k;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
final class zzey extends k implements p {
    public final /* synthetic */ zzek zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ int zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzey(zzek zzek, String str, int i10) {
        super(2);
        this.zza = zzek;
        this.zzb = str;
        this.zzc = i10;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Object[] objArr = (Object[]) obj;
        this.zza.zzi().zzb(this.zzb, (String) obj2);
        int i10 = this.zzc;
        if (i10 != -1) {
            this.zza.zzc().zze(i10, objArr);
        }
        return i.f20112a;
    }
}
