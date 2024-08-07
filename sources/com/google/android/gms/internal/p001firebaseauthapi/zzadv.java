package com.google.android.gms.internal.p001firebaseauthapi;

import aa.c;
import aa.e;
import android.app.Activity;
import android.app.PendingIntent;
import android.text.TextUtils;
import ba.c0;
import ba.i;
import ba.y;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.auth.internal.zzag;
import com.google.firebase.auth.internal.zzt;
import com.google.firebase.auth.internal.zzx;
import com.google.firebase.auth.internal.zzz;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import m9.b;
import m9.d;
import y6.j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzadv  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzadv extends zzafc {
    public zzadv(d dVar, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.zza = new zzady(dVar, scheduledExecutorService);
        this.zzb = executor;
    }

    public static zzx zzS(d dVar, zzags zzags) {
        j.f(dVar);
        j.f(zzags);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new zzt(zzags));
        List zzr = zzags.zzr();
        if (zzr != null && !zzr.isEmpty()) {
            for (int i10 = 0; i10 < zzr.size(); i10++) {
                arrayList.add(new zzt((zzahg) zzr.get(i10)));
            }
        }
        zzx zzx = new zzx(dVar, arrayList);
        zzx.f7552p = new zzz(zzags.zzb(), zzags.zza());
        zzx.f7553q = zzags.zzt();
        zzx.f7554r = zzags.zzd();
        zzx.Z0(b.m0(zzags.zzq()));
        return zzx;
    }

    public final Task zzA(String str) {
        return zzU(new zzadb(str));
    }

    public final Task zzB(d dVar, c0 c0Var, String str) {
        zzadc zzadc = new zzadc(str);
        zzadc.zzf(dVar);
        zzadc.zzd(c0Var);
        return zzU(zzadc);
    }

    public final Task zzC(d dVar, AuthCredential authCredential, String str, c0 c0Var) {
        zzadd zzadd = new zzadd(authCredential, str);
        zzadd.zzf(dVar);
        zzadd.zzd(c0Var);
        return zzU(zzadd);
    }

    public final Task zzD(d dVar, String str, String str2, c0 c0Var) {
        zzade zzade = new zzade(str, str2);
        zzade.zzf(dVar);
        zzade.zzd(c0Var);
        return zzU(zzade);
    }

    public final Task zzE(d dVar, String str, String str2, String str3, String str4, c0 c0Var) {
        zzadf zzadf = new zzadf(str, str2, str3, str4);
        zzadf.zzf(dVar);
        zzadf.zzd(c0Var);
        return zzU(zzadf);
    }

    public final Task zzF(d dVar, EmailAuthCredential emailAuthCredential, String str, c0 c0Var) {
        zzadg zzadg = new zzadg(emailAuthCredential, str);
        zzadg.zzf(dVar);
        zzadg.zzd(c0Var);
        return zzU(zzadg);
    }

    public final Task zzG(d dVar, PhoneAuthCredential phoneAuthCredential, String str, c0 c0Var) {
        zzafn.zzc();
        zzadh zzadh = new zzadh(phoneAuthCredential, str);
        zzadh.zzf(dVar);
        zzadh.zzd(c0Var);
        return zzU(zzadh);
    }

    public final Task zzH(zzag zzag, String str, String str2, long j10, boolean z10, boolean z11, String str3, String str4, boolean z12, c cVar, Executor executor, Activity activity) {
        zzadi zzadi = new zzadi(zzag, str, str2, j10, z10, z11, str3, str4, z12);
        String str5 = str;
        zzadi.zzh(cVar, activity, executor, str);
        return zzU(zzadi);
    }

    public final Task zzI(zzag zzag, String str) {
        return zzU(new zzadj(zzag, str));
    }

    public final Task zzJ(zzag zzag, PhoneMultiFactorInfo phoneMultiFactorInfo, String str, long j10, boolean z10, boolean z11, String str2, String str3, boolean z12, c cVar, Executor executor, Activity activity) {
        String str4 = zzag.f7524b;
        j.c(str4);
        zzadk zzadk = new zzadk(phoneMultiFactorInfo, str4, str, j10, z10, z11, str2, str3, z12);
        Activity activity2 = activity;
        zzadk.zzh(cVar, activity2, executor, phoneMultiFactorInfo.f7499a);
        return zzU(zzadk);
    }

    public final Task zzK(d dVar, FirebaseUser firebaseUser, String str, String str2, y yVar) {
        zzadl zzadl = new zzadl(firebaseUser.zzf(), str, str2);
        zzadl.zzf(dVar);
        zzadl.zzg(firebaseUser);
        zzadl.zzd(yVar);
        zzadl.zze(yVar);
        return zzU(zzadl);
    }

    public final Task zzL(d dVar, FirebaseUser firebaseUser, String str, y yVar) {
        char c10;
        j.f(dVar);
        j.c(str);
        j.f(firebaseUser);
        j.f(yVar);
        List X0 = firebaseUser.X0();
        if ((X0 != null && !X0.contains(str)) || firebaseUser.T0()) {
            return Tasks.forException(zzadz.zza(new Status(17016, str, (PendingIntent) null, (ConnectionResult) null)));
        }
        if (str.hashCode() == 1216985755 && str.equals("password")) {
            c10 = 0;
        } else {
            c10 = 65535;
        }
        if (c10 != 0) {
            zzadn zzadn = new zzadn(str);
            zzadn.zzf(dVar);
            zzadn.zzg(firebaseUser);
            zzadn.zzd(yVar);
            zzadn.zze(yVar);
            return zzU(zzadn);
        }
        zzadm zzadm = new zzadm();
        zzadm.zzf(dVar);
        zzadm.zzg(firebaseUser);
        zzadm.zzd(yVar);
        zzadm.zze(yVar);
        return zzU(zzadm);
    }

    public final Task zzM(d dVar, FirebaseUser firebaseUser, String str, y yVar) {
        zzado zzado = new zzado(str);
        zzado.zzf(dVar);
        zzado.zzg(firebaseUser);
        zzado.zzd(yVar);
        zzado.zze(yVar);
        return zzU(zzado);
    }

    public final Task zzN(d dVar, FirebaseUser firebaseUser, String str, y yVar) {
        zzadp zzadp = new zzadp(str);
        zzadp.zzf(dVar);
        zzadp.zzg(firebaseUser);
        zzadp.zzd(yVar);
        zzadp.zze(yVar);
        return zzU(zzadp);
    }

    public final Task zzO(d dVar, FirebaseUser firebaseUser, PhoneAuthCredential phoneAuthCredential, y yVar) {
        zzafn.zzc();
        zzadq zzadq = new zzadq(phoneAuthCredential);
        zzadq.zzf(dVar);
        zzadq.zzg(firebaseUser);
        zzadq.zzd(yVar);
        zzadq.zze(yVar);
        return zzU(zzadq);
    }

    public final Task zzP(d dVar, FirebaseUser firebaseUser, UserProfileChangeRequest userProfileChangeRequest, y yVar) {
        zzadr zzadr = new zzadr(userProfileChangeRequest);
        zzadr.zzf(dVar);
        zzadr.zzg(firebaseUser);
        zzadr.zzd(yVar);
        zzadr.zze(yVar);
        return zzU(zzadr);
    }

    public final Task zzQ(String str, String str2, ActionCodeSettings actionCodeSettings) {
        actionCodeSettings.f7463p = 7;
        return zzU(new zzads(str, str2, actionCodeSettings));
    }

    public final Task zzR(d dVar, String str, String str2) {
        zzadt zzadt = new zzadt(str, str2);
        zzadt.zzf(dVar);
        return zzU(zzadt);
    }

    public final void zzT(d dVar, zzahl zzahl, c cVar, Activity activity, Executor executor) {
        zzadu zzadu = new zzadu(zzahl);
        zzadu.zzf(dVar);
        zzadu.zzh(cVar, activity, executor, zzahl.zzd());
        zzU(zzadu);
    }

    public final Task zza(d dVar, String str, String str2) {
        zzacb zzacb = new zzacb(str, str2);
        zzacb.zzf(dVar);
        return zzU(zzacb);
    }

    public final Task zzb(d dVar, String str, String str2) {
        zzacc zzacc = new zzacc(str, str2);
        zzacc.zzf(dVar);
        return zzU(zzacc);
    }

    public final Task zzc(d dVar, String str, String str2, String str3) {
        zzacd zzacd = new zzacd(str, str2, str3);
        zzacd.zzf(dVar);
        return zzU(zzacd);
    }

    public final Task zzd(d dVar, String str, String str2, String str3, String str4, c0 c0Var) {
        zzace zzace = new zzace(str, str2, str3, str4);
        zzace.zzf(dVar);
        zzace.zzd(c0Var);
        return zzU(zzace);
    }

    public final Task zze(FirebaseUser firebaseUser, i iVar) {
        zzacf zzacf = new zzacf();
        zzacf.zzg(firebaseUser);
        zzacf.zzd(iVar);
        zzacf.zze(iVar);
        return zzU(zzacf);
    }

    public final Task zzf(d dVar, String str, String str2) {
        zzacg zzacg = new zzacg(str, str2);
        zzacg.zzf(dVar);
        return zzU(zzacg);
    }

    public final Task zzg(d dVar, aa.d dVar2, FirebaseUser firebaseUser, String str, c0 c0Var) {
        zzafn.zzc();
        zzach zzach = new zzach(dVar2, firebaseUser.zzf(), str, (String) null);
        zzach.zzf(dVar);
        zzach.zzd(c0Var);
        return zzU(zzach);
    }

    public final Task zzh(d dVar, e eVar, FirebaseUser firebaseUser, String str, String str2, c0 c0Var) {
        zzach zzach = new zzach(eVar, firebaseUser.zzf(), str, str2);
        zzach.zzf(dVar);
        zzach.zzd(c0Var);
        return zzU(zzach);
    }

    public final Task zzi(d dVar, FirebaseUser firebaseUser, aa.d dVar2, String str, c0 c0Var) {
        zzafn.zzc();
        zzaci zzaci = new zzaci(dVar2, str, (String) null);
        zzaci.zzf(dVar);
        zzaci.zzd(c0Var);
        if (firebaseUser != null) {
            zzaci.zzg(firebaseUser);
        }
        return zzU(zzaci);
    }

    public final Task zzj(d dVar, FirebaseUser firebaseUser, e eVar, String str, String str2, c0 c0Var) {
        zzaci zzaci = new zzaci(eVar, str, str2);
        zzaci.zzf(dVar);
        zzaci.zzd(c0Var);
        if (firebaseUser != null) {
            zzaci.zzg(firebaseUser);
        }
        return zzU(zzaci);
    }

    public final Task zzk(d dVar, FirebaseUser firebaseUser, String str, y yVar) {
        zzacj zzacj = new zzacj(str);
        zzacj.zzf(dVar);
        zzacj.zzg(firebaseUser);
        zzacj.zzd(yVar);
        zzacj.zze(yVar);
        return zzU(zzacj);
    }

    public final Task zzl() {
        return zzU(new zzack());
    }

    public final Task zzm(String str, String str2) {
        return zzU(new zzacl(str, "RECAPTCHA_ENTERPRISE"));
    }

    public final Task zzn(d dVar, FirebaseUser firebaseUser, AuthCredential authCredential, y yVar) {
        j.f(dVar);
        j.f(authCredential);
        j.f(firebaseUser);
        j.f(yVar);
        List X0 = firebaseUser.X0();
        if (X0 != null && X0.contains(authCredential.P0())) {
            return Tasks.forException(zzadz.zza(new Status(17015, (String) null, (PendingIntent) null, (ConnectionResult) null)));
        }
        if (authCredential instanceof EmailAuthCredential) {
            EmailAuthCredential emailAuthCredential = (EmailAuthCredential) authCredential;
            if (!(!TextUtils.isEmpty(emailAuthCredential.f7467c))) {
                zzacm zzacm = new zzacm(emailAuthCredential);
                zzacm.zzf(dVar);
                zzacm.zzg(firebaseUser);
                zzacm.zzd(yVar);
                zzacm.zze(yVar);
                return zzU(zzacm);
            }
            zzacp zzacp = new zzacp(emailAuthCredential);
            zzacp.zzf(dVar);
            zzacp.zzg(firebaseUser);
            zzacp.zzd(yVar);
            zzacp.zze(yVar);
            return zzU(zzacp);
        } else if (authCredential instanceof PhoneAuthCredential) {
            zzafn.zzc();
            zzaco zzaco = new zzaco((PhoneAuthCredential) authCredential);
            zzaco.zzf(dVar);
            zzaco.zzg(firebaseUser);
            zzaco.zzd(yVar);
            zzaco.zze(yVar);
            return zzU(zzaco);
        } else {
            zzacn zzacn = new zzacn(authCredential);
            zzacn.zzf(dVar);
            zzacn.zzg(firebaseUser);
            zzacn.zzd(yVar);
            zzacn.zze(yVar);
            return zzU(zzacn);
        }
    }

    public final Task zzo(d dVar, FirebaseUser firebaseUser, AuthCredential authCredential, String str, y yVar) {
        zzacq zzacq = new zzacq(authCredential, str);
        zzacq.zzf(dVar);
        zzacq.zzg(firebaseUser);
        zzacq.zzd(yVar);
        zzacq.zze(yVar);
        return zzU(zzacq);
    }

    public final Task zzp(d dVar, FirebaseUser firebaseUser, AuthCredential authCredential, String str, y yVar) {
        zzacr zzacr = new zzacr(authCredential, str);
        zzacr.zzf(dVar);
        zzacr.zzg(firebaseUser);
        zzacr.zzd(yVar);
        zzacr.zze(yVar);
        return zzU(zzacr);
    }

    public final Task zzq(d dVar, FirebaseUser firebaseUser, EmailAuthCredential emailAuthCredential, String str, y yVar) {
        zzacs zzacs = new zzacs(emailAuthCredential, str);
        zzacs.zzf(dVar);
        zzacs.zzg(firebaseUser);
        zzacs.zzd(yVar);
        zzacs.zze(yVar);
        return zzU(zzacs);
    }

    public final Task zzr(d dVar, FirebaseUser firebaseUser, EmailAuthCredential emailAuthCredential, String str, y yVar) {
        zzact zzact = new zzact(emailAuthCredential, str);
        zzact.zzf(dVar);
        zzact.zzg(firebaseUser);
        zzact.zzd(yVar);
        zzact.zze(yVar);
        return zzU(zzact);
    }

    public final Task zzs(d dVar, FirebaseUser firebaseUser, String str, String str2, String str3, String str4, y yVar) {
        zzacu zzacu = new zzacu(str, str2, str3, str4);
        zzacu.zzf(dVar);
        zzacu.zzg(firebaseUser);
        zzacu.zzd(yVar);
        zzacu.zze(yVar);
        return zzU(zzacu);
    }

    public final Task zzt(d dVar, FirebaseUser firebaseUser, String str, String str2, String str3, String str4, y yVar) {
        zzacv zzacv = new zzacv(str, str2, str3, str4);
        zzacv.zzf(dVar);
        zzacv.zzg(firebaseUser);
        zzacv.zzd(yVar);
        zzacv.zze(yVar);
        return zzU(zzacv);
    }

    public final Task zzu(d dVar, FirebaseUser firebaseUser, PhoneAuthCredential phoneAuthCredential, String str, y yVar) {
        zzafn.zzc();
        zzacw zzacw = new zzacw(phoneAuthCredential, str);
        zzacw.zzf(dVar);
        zzacw.zzg(firebaseUser);
        zzacw.zzd(yVar);
        zzacw.zze(yVar);
        return zzU(zzacw);
    }

    public final Task zzv(d dVar, FirebaseUser firebaseUser, PhoneAuthCredential phoneAuthCredential, String str, y yVar) {
        zzafn.zzc();
        zzacx zzacx = new zzacx(phoneAuthCredential, str);
        zzacx.zzf(dVar);
        zzacx.zzg(firebaseUser);
        zzacx.zzd(yVar);
        zzacx.zze(yVar);
        return zzU(zzacx);
    }

    public final Task zzw(d dVar, FirebaseUser firebaseUser, y yVar) {
        zzacy zzacy = new zzacy();
        zzacy.zzf(dVar);
        zzacy.zzg(firebaseUser);
        zzacy.zzd(yVar);
        zzacy.zze(yVar);
        return zzU(zzacy);
    }

    public final Task zzx(d dVar, ActionCodeSettings actionCodeSettings, String str) {
        zzacz zzacz = new zzacz(str, actionCodeSettings);
        zzacz.zzf(dVar);
        return zzU(zzacz);
    }

    public final Task zzy(d dVar, String str, ActionCodeSettings actionCodeSettings, String str2, String str3) {
        actionCodeSettings.f7463p = 1;
        zzada zzada = new zzada(str, actionCodeSettings, str2, str3, "sendPasswordResetEmail");
        zzada.zzf(dVar);
        return zzU(zzada);
    }

    public final Task zzz(d dVar, String str, ActionCodeSettings actionCodeSettings, String str2, String str3) {
        actionCodeSettings.f7463p = 6;
        zzada zzada = new zzada(str, actionCodeSettings, str2, str3, "sendSignInLinkToEmail");
        zzada.zzf(dVar);
        return zzU(zzada);
    }
}
