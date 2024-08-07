package com.google.android.recaptcha.internal;

import al.a0;
import al.d0;
import al.e0;
import ek.i;
import ik.d;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import jk.a;
import p3.l0;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzea implements zzdv {
    private final d0 zza;
    private final zzem zzb;
    /* access modifiers changed from: private */
    public final zzge zzc;
    private final Map zzd;

    public zzea(d0 d0Var, zzem zzem, zzge zzge, Map map) {
        this.zza = d0Var;
        this.zzb = zzem;
        this.zzc = zzge;
        this.zzd = map;
    }

    public static final /* synthetic */ void zzf(zzea zzea, zzrs zzrs, zzek zzek) {
        zzgz zzb2 = zzgz.zzb();
        int zza2 = zzek.zza();
        zzfe zzfe = (zzfe) zzea.zzd.get(Integer.valueOf(zzrs.zzf()));
        if (zzfe != null) {
            int zzg = zzrs.zzg();
            zzrr[] zzrrArr = (zzrr[]) zzrs.zzj().toArray(new zzrr[0]);
            zzfe.zza(zzg, zzek, (zzrr[]) Arrays.copyOf(zzrrArr, zzrrArr.length));
            if (zza2 == zzek.zza()) {
                zzek.zzg(zzek.zza() + 1);
            }
            zzb2.zzf();
            long zza3 = zzb2.zza(TimeUnit.MICROSECONDS);
            int i10 = zzbq.zza;
            int zzk = zzrs.zzk();
            if (zzk != 1) {
                zzbq.zza(zzk - 2, zza3);
                return;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        throw new zzby(5, 2, (Throwable) null);
    }

    /* access modifiers changed from: private */
    public final Object zzg(List list, zzek zzek, d dVar) {
        Object b10 = e0.b(new zzdx(zzek, list, this, (d) null), dVar);
        if (b10 == a.COROUTINE_SUSPENDED) {
            return b10;
        }
        return i.f20112a;
    }

    /* access modifiers changed from: private */
    public final Object zzh(Exception exc, zzek zzek, d dVar) {
        Object b10 = e0.b(new zzdy(exc, zzek, this, (d) null), dVar);
        if (b10 == a.COROUTINE_SUSPENDED) {
            return b10;
        }
        return i.f20112a;
    }

    public final void zza(String str) {
        l0.j0(this.zza, (a0) null, new zzdz(new zzek(this.zzb), this, str, (d) null), 3);
    }
}
