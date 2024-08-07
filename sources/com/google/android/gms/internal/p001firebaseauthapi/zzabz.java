package com.google.android.gms.internal.p001firebaseauthapi;

import android.app.PendingIntent;
import android.support.v4.media.a;
import ba.g;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.auth.zze;
import y6.j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabz  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzabz {
    /* access modifiers changed from: private */
    public final zzaff zza;

    public zzabz(zzaff zzaff) {
        j.f(zzaff);
        this.zza = zzaff;
    }

    public static /* synthetic */ String zzO(zzaew zzaew, String str) {
        StringBuilder q10 = a.q(str);
        q10.append(zzaew.zza.zze);
        return q10.toString();
    }

    private final void zzP(String str, zzafe zzafe) {
        j.f(zzafe);
        j.c(str);
        zzahb zzd = zzahb.zzd(str);
        if (zzd.zzj()) {
            zzafe.zzb(zzd);
            return;
        }
        this.zza.zzf(new zzagp(zzd.zzf()), new zzaby(this, zzafe));
    }

    /* access modifiers changed from: private */
    public final void zzQ(zzage zzage, zzadx zzadx) {
        j.f(zzage);
        j.f(zzadx);
        this.zza.zzc(zzage, new zzaaj(this, zzadx));
    }

    /* access modifiers changed from: private */
    public final void zzR(zzahb zzahb, String str, String str2, Boolean bool, zze zze, zzadx zzadx, zzafd zzafd) {
        j.f(zzahb);
        j.f(zzafd);
        j.f(zzadx);
        this.zza.zzg(new zzagq(zzahb.zze()), new zzaam(this, zzafd, str2, str, bool, zze, zzadx, zzahb));
    }

    private final void zzS(zzagu zzagu, zzadx zzadx) {
        j.f(zzagu);
        j.f(zzadx);
        this.zza.zzh(zzagu, new zzabr(this, zzadx));
    }

    public static void zzd(zzabz zzabz, zzaie zzaie, zzadx zzadx, zzafd zzafd) {
        Status status;
        if (zzaie.zzp()) {
            zze zzc = zzaie.zzc();
            String zzd = zzaie.zzd();
            String zzk = zzaie.zzk();
            if (zzaie.zzn()) {
                status = new Status(17012, (String) null, (PendingIntent) null, (ConnectionResult) null);
            } else {
                status = g.a(zzaie.zze());
            }
            zzadx.zze(new zzaae(status, zzc, zzd, zzk));
            return;
        }
        zzabz.zzR(new zzahb(zzaie.zzj(), zzaie.zzf(), Long.valueOf(zzaie.zzb()), "Bearer"), zzaie.zzi(), zzaie.zzh(), Boolean.valueOf(zzaie.zzo()), zzaie.zzc(), zzadx, zzafd);
    }

    public static /* bridge */ /* synthetic */ void zze(zzabz zzabz, zzadx zzadx, zzahb zzahb, zzahn zzahn, zzafd zzafd) {
        j.f(zzadx);
        j.f(zzahb);
        j.f(zzahn);
        j.f(zzafd);
        zzabz.zza.zzg(new zzagq(zzahb.zze()), new zzaak(zzabz, zzafd, zzadx, zzahb, zzahn));
    }

    public static /* bridge */ /* synthetic */ void zzf(zzabz zzabz, zzadx zzadx, zzahb zzahb, zzags zzags, zzahn zzahn, zzafd zzafd) {
        j.f(zzadx);
        j.f(zzahb);
        j.f(zzags);
        j.f(zzahn);
        j.f(zzafd);
        zzabz.zza.zzn(zzahn, new zzaal(zzabz, zzahn, zzags, zzadx, zzahb, zzafd));
    }

    public final void zzA(String str, zzadx zzadx) {
        j.f(zzadx);
        this.zza.zzo(str, new zzabq(this, zzadx));
    }

    public final void zzB(String str, zzadx zzadx) {
        j.f(zzadx);
        this.zza.zzp(new zzahp(str), new zzabt(this, zzadx));
    }

    public final void zzC(zzaic zzaic, zzadx zzadx) {
        j.f(zzaic);
        j.f(zzadx);
        zzaic.zzd(true);
        this.zza.zzs(zzaic, new zzabs(this, zzadx));
    }

    public final void zzD(zzaif zzaif, zzadx zzadx) {
        j.f(zzaif);
        j.f(zzadx);
        this.zza.zzt(zzaif, new zzabf(this, zzadx));
    }

    public final void zzE(String str, String str2, String str3, String str4, zzadx zzadx) {
        j.c(str);
        j.c(str2);
        j.f(zzadx);
        this.zza.zzu(new zzaih(str, str2, str3, str4), new zzaah(this, zzadx));
    }

    public final void zzF(EmailAuthCredential emailAuthCredential, String str, zzadx zzadx) {
        j.f(emailAuthCredential);
        j.f(zzadx);
        if (emailAuthCredential.f7469e) {
            zzP(emailAuthCredential.f7468d, new zzaai(this, emailAuthCredential, str, zzadx));
        } else {
            zzQ(new zzage(emailAuthCredential, (String) null, str), zzadx);
        }
    }

    public final void zzG(zzaij zzaij, zzadx zzadx) {
        j.f(zzaij);
        j.f(zzadx);
        this.zza.zzv(zzaij, new zzaat(this, zzadx));
    }

    public final void zzH(zzahr zzahr, zzadx zzadx) {
        j.f(zzahr);
        j.f(zzadx);
        this.zza.zzq(zzahr, new zzabe(this, zzahr, zzadx));
    }

    public final void zzI(zzaht zzaht, zzadx zzadx) {
        j.f(zzaht);
        j.f(zzadx);
        this.zza.zzr(zzaht, new zzabj(this, zzadx));
    }

    public final void zzJ(String str, String str2, String str3, zzadx zzadx) {
        j.c(str);
        j.c(str2);
        j.f(zzadx);
        zzP(str, new zzabd(this, str2, str3, zzadx));
    }

    public final void zzK(String str, zzadx zzadx) {
        j.c(str);
        j.f(zzadx);
        zzP(str, new zzaaz(this, zzadx));
    }

    public final void zzL(String str, String str2, zzadx zzadx) {
        j.c(str);
        j.c(str2);
        j.f(zzadx);
        zzP(str2, new zzabb(this, str, zzadx));
    }

    public final void zzM(String str, UserProfileChangeRequest userProfileChangeRequest, zzadx zzadx) {
        j.c(str);
        j.f(userProfileChangeRequest);
        j.f(zzadx);
        zzP(str, new zzabu(this, userProfileChangeRequest, zzadx));
    }

    public final void zzN(zzagu zzagu, zzadx zzadx) {
        zzS(zzagu, zzadx);
    }

    public final void zzg(String str, String str2, zzadx zzadx) {
        j.c(str);
        j.f(zzadx);
        zzahn zzahn = new zzahn();
        zzahn.zzf(str);
        zzahn.zzi(str2);
        this.zza.zzn(zzahn, new zzabx(this, zzadx));
    }

    public final void zzh(String str, String str2, zzadx zzadx) {
        j.c(str);
        j.c(str2);
        j.f(zzadx);
        zzP(str, new zzabv(this, str2, zzadx));
    }

    public final void zzi(String str, String str2, zzadx zzadx) {
        j.c(str);
        j.c(str2);
        j.f(zzadx);
        zzP(str, new zzabw(this, str2, zzadx));
    }

    public final void zzj(String str, String str2, zzadx zzadx) {
        j.c(str);
        j.f(zzadx);
        this.zza.zzl(new zzahj(str, (String) null, str2), new zzaap(this, zzadx));
    }

    public final void zzk(String str, String str2, String str3, zzadx zzadx) {
        j.c(str);
        j.c(str2);
        j.f(zzadx);
        this.zza.zzl(new zzahj(str, str2, str3), new zzaar(this, zzadx));
    }

    public final void zzl(String str, String str2, String str3, String str4, zzadx zzadx) {
        j.c(str);
        j.c(str2);
        j.f(zzadx);
        this.zza.zzp(new zzahp(str, str2, (String) null, str3, str4), new zzaag(this, zzadx));
    }

    public final void zzm(String str, zzadx zzadx) {
        j.c(str);
        j.f(zzadx);
        zzP(str, new zzabp(this, zzadx));
    }

    public final void zzn(zzagg zzagg, String str, zzadx zzadx) {
        j.f(zzagg);
        j.f(zzadx);
        zzP(str, new zzabh(this, zzagg, zzadx));
    }

    public final void zzo(zzagi zzagi, zzadx zzadx) {
        j.f(zzagi);
        j.f(zzadx);
        this.zza.zze(zzagi, new zzabi(this, zzadx));
    }

    public final void zzp(String str, zzadx zzadx) {
        j.c(str);
        j.f(zzadx);
        this.zza.zzf(new zzagp(str), new zzaaq(this, zzadx));
    }

    public final void zzq(zzagw zzagw, zzadx zzadx) {
        j.f(zzagw);
        j.f(zzadx);
        this.zza.zzi(zzagw, new zzabl(this, zzadx));
    }

    public final void zzr(String str, String str2, zzadx zzadx) {
        j.c(str);
        j.f(zzadx);
        this.zza.zza(new zzagb(str, str2), new zzaan(this, zzadx));
    }

    public final void zzs(zzagz zzagz, zzadx zzadx) {
        j.f(zzagz);
        j.f(zzadx);
        this.zza.zzj(zzagz, new zzabk(this, zzadx));
    }

    public final void zzt(String str, String str2, String str3, zzadx zzadx) {
        j.c(str);
        j.c(str2);
        j.c(str3);
        j.f(zzadx);
        zzP(str3, new zzaau(this, str, str2, zzadx));
    }

    public final void zzu(String str, zzaic zzaic, zzadx zzadx) {
        j.c(str);
        j.f(zzaic);
        j.f(zzadx);
        zzP(str, new zzaay(this, zzaic, zzadx));
    }

    public final void zzv(String str, zzaij zzaij, zzadx zzadx) {
        j.c(str);
        j.f(zzaij);
        j.f(zzadx);
        zzP(str, new zzaaw(this, zzaij, zzadx));
    }

    public final void zzw(String str, zzadx zzadx) {
        j.c(str);
        j.f(zzadx);
        zzP(str, new zzabn(this, zzadx));
    }

    public final void zzx(String str, ActionCodeSettings actionCodeSettings, zzadx zzadx) {
        j.c(str);
        j.f(zzadx);
        zzagu zzagu = new zzagu(4);
        zzagu.zzh(str);
        if (actionCodeSettings != null) {
            zzagu.zzd(actionCodeSettings);
        }
        zzS(zzagu, zzadx);
    }

    public final void zzy(String str, ActionCodeSettings actionCodeSettings, String str2, String str3, zzadx zzadx) {
        j.c(str);
        j.f(zzadx);
        zzagu zzagu = new zzagu(actionCodeSettings.f7463p);
        zzagu.zzf(str);
        zzagu.zzd(actionCodeSettings);
        zzagu.zzg(str2);
        zzagu.zze(str3);
        this.zza.zzh(zzagu, new zzaao(this, zzadx));
    }

    public final void zzz(zzahl zzahl, zzadx zzadx) {
        j.c(zzahl.zzd());
        j.f(zzadx);
        this.zza.zzm(zzahl, new zzaas(this, zzadx));
    }
}
