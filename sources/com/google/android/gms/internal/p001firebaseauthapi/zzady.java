package com.google.android.gms.internal.p001firebaseauthapi;

import a7.a;
import aa.b;
import aa.e;
import android.content.Context;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.UserProfileChangeRequest;
import java.util.concurrent.ScheduledExecutorService;
import m9.d;
import y6.j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzady  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzady {
    private static final a zza = new a("FirebaseAuth", "FirebaseAuthFallback:");
    private final zzabz zzb;
    private final zzaft zzc;

    public zzady(d dVar, ScheduledExecutorService scheduledExecutorService) {
        j.f(dVar);
        dVar.a();
        Context context = dVar.f13218a;
        j.f(context);
        this.zzb = new zzabz(new zzaem(dVar, zzael.zza(), (zzafk) null, (zzaeg) null, (zzaeh) null));
        this.zzc = new zzaft(context, scheduledExecutorService);
    }

    private static boolean zzJ(long j10, boolean z10) {
        if (j10 > 0 && z10) {
            return true;
        }
        zza.a("App hash will not be appended to the request.", new Object[0]);
        return false;
    }

    public final void zzA(zzaab zzaab, zzadw zzadw) {
        j.f(zzadw);
        j.f(zzaab);
        PhoneAuthCredential zza2 = zzaab.zza();
        j.f(zza2);
        this.zzb.zzG(zzafj.zza(zza2), new zzadx(zzadw, zza));
    }

    public final void zzB(String str, String str2, String str3, long j10, boolean z10, boolean z11, String str4, String str5, boolean z12, zzadw zzadw) {
        String str6 = str2;
        String str7 = str;
        j.d("idToken should not be empty.", str);
        j.f(zzadw);
        zzadx zzadx = new zzadx(zzadw, zza);
        if (this.zzc.zzk(str2)) {
            if (z10) {
                this.zzc.zzi(str2);
            } else {
                this.zzc.zzh(zzadx, str2);
                return;
            }
        }
        zzahv zzb2 = zzahv.zzb(str, str2, str3, str4, str5, (String) null);
        long j11 = j10;
        if (zzJ(j10, z12)) {
            zzb2.zzd(new zzafy(this.zzc.zzb()));
        }
        this.zzc.zzj(str2, zzadx, j10, z12);
        this.zzb.zzH(zzb2, new zzafq(this.zzc, zzadx, str2));
    }

    public final void zzC(zzaac zzaac, zzadw zzadw) {
        j.f(zzaac);
        j.f(zzadw);
        String str = zzaac.zzb().f7502d;
        zzadx zzadx = new zzadx(zzadw, zza);
        if (this.zzc.zzk(str)) {
            if (zzaac.zzg()) {
                this.zzc.zzi(str);
            } else {
                this.zzc.zzh(zzadx, str);
                return;
            }
        }
        long zza2 = zzaac.zza();
        boolean zzh = zzaac.zzh();
        zzaht zzb2 = zzaht.zzb(zzaac.zzd(), zzaac.zzb().f7499a, zzaac.zzb().f7502d, zzaac.zzc(), zzaac.zzf(), zzaac.zze());
        if (zzJ(zza2, zzh)) {
            zzb2.zzd(new zzafy(this.zzc.zzb()));
        }
        this.zzc.zzj(str, zzadx, zza2, zzh);
        this.zzb.zzI(zzb2, new zzafq(this.zzc, zzadx, str));
    }

    public final void zzD(zzahx zzahx, zzadw zzadw) {
        j.f(zzadw);
        this.zzb.zzH(zzahx, new zzadx(zzadw, zza));
    }

    public final void zzE(String str, String str2, String str3, zzadw zzadw) {
        j.d("cachedTokenState should not be empty.", str);
        j.d("uid should not be empty.", str2);
        j.f(zzadw);
        this.zzb.zzJ(str, str2, str3, new zzadx(zzadw, zza));
    }

    public final void zzF(String str, zzadw zzadw) {
        j.c(str);
        j.f(zzadw);
        this.zzb.zzK(str, new zzadx(zzadw, zza));
    }

    public final void zzG(String str, String str2, zzadw zzadw) {
        j.c(str);
        j.c(str2);
        j.f(zzadw);
        this.zzb.zzL(str, str2, new zzadx(zzadw, zza));
    }

    public final void zzH(String str, UserProfileChangeRequest userProfileChangeRequest, zzadw zzadw) {
        j.c(str);
        j.f(userProfileChangeRequest);
        j.f(zzadw);
        this.zzb.zzM(str, userProfileChangeRequest, new zzadx(zzadw, zza));
    }

    public final void zzI(zzaad zzaad, zzadw zzadw) {
        j.f(zzaad);
        this.zzb.zzN(zzagu.zzc(zzaad.zza(), zzaad.zzb(), zzaad.zzc()), new zzadx(zzadw, zza));
    }

    public final void zza(String str, String str2, zzadw zzadw) {
        j.c(str);
        j.f(zzadw);
        this.zzb.zzg(str, str2, new zzadx(zzadw, zza));
    }

    public final void zzb(String str, String str2, zzadw zzadw) {
        j.c(str);
        j.c(str2);
        j.f(zzadw);
        this.zzb.zzh(str, str2, new zzadx(zzadw, zza));
    }

    public final void zzc(String str, String str2, zzadw zzadw) {
        j.c(str);
        j.c(str2);
        j.f(zzadw);
        this.zzb.zzi(str, str2, new zzadx(zzadw, zza));
    }

    public final void zzd(String str, String str2, zzadw zzadw) {
        j.c(str);
        j.f(zzadw);
        this.zzb.zzj(str, str2, new zzadx(zzadw, zza));
    }

    public final void zze(zzzs zzzs, zzadw zzadw) {
        j.f(zzzs);
        j.c(zzzs.zza());
        j.c(zzzs.zzb());
        j.f(zzadw);
        this.zzb.zzk(zzzs.zza(), zzzs.zzb(), zzzs.zzc(), new zzadx(zzadw, zza));
    }

    public final void zzf(String str, String str2, String str3, String str4, zzadw zzadw) {
        j.c(str);
        j.c(str2);
        j.f(zzadw);
        this.zzb.zzl(str, str2, str3, str4, new zzadx(zzadw, zza));
    }

    public final void zzg(String str, zzadw zzadw) {
        j.c(str);
        j.f(zzadw);
        this.zzb.zzm(str, new zzadx(zzadw, zza));
    }

    public final void zzh(b bVar, String str, String str2, String str3, zzadw zzadw) {
        j.f(bVar);
        j.d("cachedTokenState should not be empty.", str);
        j.f(zzadw);
        if (bVar instanceof aa.d) {
            aa.d dVar = (aa.d) bVar;
            throw null;
        } else if (!(bVar instanceof e)) {
            throw new IllegalArgumentException("multiFactorAssertion must be either PhoneMultiFactorAssertion or TotpMultiFactorAssertion.");
        } else {
            e eVar = (e) bVar;
            j.f((Object) null);
            throw null;
        }
    }

    public final void zzi(String str, b bVar, String str2, zzadw zzadw) {
        j.c(str);
        j.f(bVar);
        j.f(zzadw);
        if (bVar instanceof aa.d) {
            aa.d dVar = (aa.d) bVar;
            throw null;
        } else if (bVar instanceof e) {
            e eVar = (e) bVar;
            zzabz zzabz = this.zzb;
            j.c((String) null);
            j.c((String) null);
            zzabz.zzo(zzagn.zzb(str, (String) null, str2, (String) null), new zzadx(zzadw, zza));
        } else {
            throw new IllegalArgumentException("multiFactorAssertion must be either PhoneMultiFactorAssertion or TotpMultiFactorAssertion.");
        }
    }

    public final void zzj(String str, zzadw zzadw) {
        j.c(str);
        j.f(zzadw);
        this.zzb.zzp(str, new zzadx(zzadw, zza));
    }

    public final void zzk(zzzt zzzt, zzadw zzadw) {
        j.f(zzzt);
        this.zzb.zzq(zzagw.zzb(), new zzadx(zzadw, zza));
    }

    public final void zzl(String str, String str2, zzadw zzadw) {
        j.c(str);
        this.zzb.zzr(str, str2, new zzadx(zzadw, zza));
    }

    public final void zzm(zzzu zzzu, zzadw zzadw) {
        j.f(zzzu);
        this.zzb.zzs(zzagz.zzb(zzzu.zzb(), zzzu.zza()), new zzadx(zzadw, zza));
    }

    public final void zzn(String str, String str2, String str3, zzadw zzadw) {
        j.c(str);
        j.c(str2);
        j.c(str3);
        j.f(zzadw);
        this.zzb.zzt(str, str2, str3, new zzadx(zzadw, zza));
    }

    public final void zzo(String str, zzaic zzaic, zzadw zzadw) {
        j.c(str);
        j.f(zzaic);
        j.f(zzadw);
        this.zzb.zzu(str, zzaic, new zzadx(zzadw, zza));
    }

    public final void zzp(zzzv zzzv, zzadw zzadw) {
        j.f(zzadw);
        j.f(zzzv);
        PhoneAuthCredential zza2 = zzzv.zza();
        j.f(zza2);
        String zzb2 = zzzv.zzb();
        j.c(zzb2);
        this.zzb.zzv(zzb2, zzafj.zza(zza2), new zzadx(zzadw, zza));
    }

    public final void zzq(String str, zzadw zzadw) {
        j.c(str);
        j.f(zzadw);
        this.zzb.zzw(str, new zzadx(zzadw, zza));
    }

    public final void zzr(zzzw zzzw, zzadw zzadw) {
        j.f(zzzw);
        j.c(zzzw.zzb());
        j.f(zzadw);
        this.zzb.zzx(zzzw.zzb(), zzzw.zza(), new zzadx(zzadw, zza));
    }

    public final void zzs(zzzx zzzx, zzadw zzadw) {
        j.f(zzzx);
        j.c(zzzx.zzc());
        j.f(zzadw);
        this.zzb.zzy(zzzx.zzc(), zzzx.zza(), zzzx.zzd(), zzzx.zzb(), new zzadx(zzadw, zza));
    }

    public final void zzt(zzzy zzzy, zzadw zzadw) {
        j.f(zzadw);
        j.f(zzzy);
        zzahl zza2 = zzzy.zza();
        j.f(zza2);
        String zzd = zza2.zzd();
        zzadx zzadx = new zzadx(zzadw, zza);
        if (this.zzc.zzk(zzd)) {
            if (zza2.zzf()) {
                this.zzc.zzi(zzd);
            } else {
                this.zzc.zzh(zzadx, zzd);
                return;
            }
        }
        long zzb2 = zza2.zzb();
        boolean zzg = zza2.zzg();
        if (zzJ(zzb2, zzg)) {
            zza2.zze(new zzafy(this.zzc.zzb()));
        }
        this.zzc.zzj(zzd, zzadx, zzb2, zzg);
        this.zzb.zzz(zza2, new zzafq(this.zzc, zzadx, zzd));
    }

    public final void zzu(zzzz zzzz, zzadw zzadw) {
        j.f(zzzz);
        j.f(zzadw);
        this.zzb.zzA(zzzz.zza(), new zzadx(zzadw, zza));
    }

    public final void zzv(String str, zzadw zzadw) {
        j.f(zzadw);
        this.zzb.zzB(str, new zzadx(zzadw, zza));
    }

    public final void zzw(zzaic zzaic, zzadw zzadw) {
        j.f(zzaic);
        j.f(zzadw);
        this.zzb.zzC(zzaic, new zzadx(zzadw, zza));
    }

    public final void zzx(zzaif zzaif, zzadw zzadw) {
        j.f(zzaif);
        j.f(zzadw);
        this.zzb.zzD(zzaif, new zzadx(zzadw, zza));
    }

    public final void zzy(String str, String str2, String str3, String str4, zzadw zzadw) {
        j.c(str);
        j.c(str2);
        j.f(zzadw);
        this.zzb.zzE(str, str2, str3, str4, new zzadx(zzadw, zza));
    }

    public final void zzz(zzaaa zzaaa, zzadw zzadw) {
        j.f(zzaaa);
        j.f(zzaaa.zza());
        j.f(zzadw);
        this.zzb.zzF(zzaaa.zza(), zzaaa.zzb(), new zzadx(zzadw, zza));
    }
}
