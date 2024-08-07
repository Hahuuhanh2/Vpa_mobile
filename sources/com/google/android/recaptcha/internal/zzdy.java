package com.google.android.recaptcha.internal;

import al.d0;
import al.i1;
import ik.d;
import java.util.Arrays;
import jk.a;
import kk.i;
import p3.l0;
import rk.p;
import sk.s;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
final class zzdy extends i implements p {
    public final /* synthetic */ Exception zza;
    public final /* synthetic */ zzek zzb;
    public final /* synthetic */ zzea zzc;
    private /* synthetic */ Object zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzdy(Exception exc, zzek zzek, zzea zzea, d dVar) {
        super(2, dVar);
        this.zza = exc;
        this.zzb = zzek;
        this.zzc = zzea;
    }

    public final d create(Object obj, d dVar) {
        zzdy zzdy = new zzdy(this.zza, this.zzb, this.zzc, dVar);
        zzdy.zzd = obj;
        return zzdy;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdy) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    public final Object invokeSuspend(Object obj) {
        zzrh zzrh;
        boolean z10;
        a aVar = a.COROUTINE_SUSPENDED;
        l0.Q0(obj);
        d0 d0Var = (d0) this.zzd;
        Exception exc = this.zza;
        if (exc instanceof zzby) {
            zzrh = ((zzby) exc).zza();
            zzrh.zzd(this.zzb.zza());
        } else {
            zzek zzek = this.zzb;
            zzrh zzf = zzri.zzf();
            zzf.zzd(zzek.zza());
            zzf.zzq(2);
            zzf.zzp(2);
            zzrh = zzf;
        }
        zzri zzri = (zzri) zzrh.zzj();
        zzri.zzJ();
        zzri.zzk();
        s.a(this.zza.getClass()).b();
        this.zza.getMessage();
        zzek zzek2 = this.zzb;
        zzbt zzb2 = zzek2.zzb();
        zzbt zzbt = zzek2.zza;
        if (zzbt == null) {
            zzbt = null;
        }
        zzoy zza2 = zzdn.zza(zzb2, zzbt);
        String zzd2 = this.zzb.zzd();
        if (zzd2.length() == 0) {
            zzd2 = "recaptcha.m.Main.rge";
        }
        i1 i1Var = (i1) d0Var.s().get(i1.b.f19045a);
        if (i1Var != null) {
            z10 = i1Var.isActive();
        } else {
            z10 = true;
        }
        if (z10) {
            zzea zzea = this.zzc;
            zzhz zzh = zzhz.zzh();
            byte[] zzd3 = zzri.zzd();
            zzhz zzh2 = zzhz.zzh();
            byte[] zzd4 = zza2.zzd();
            zzea.zzb.zzd().zzb(zzd2, (String[]) Arrays.copyOf(new String[]{zzh.zzi(zzd3, 0, zzd3.length), zzh2.zzi(zzd4, 0, zzd4.length)}, 2));
        }
        return ek.i.f20112a;
    }
}
