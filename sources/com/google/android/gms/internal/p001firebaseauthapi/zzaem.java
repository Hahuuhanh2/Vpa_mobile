package com.google.android.gms.internal.p001firebaseauthapi;

import android.text.TextUtils;
import m9.d;
import y6.j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaem  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
final class zzaem extends zzaff implements zzafw {
    public zzaen zza;
    private zzaeg zzb;
    private zzaeh zzc;
    private zzafk zzd;
    private final zzael zze;
    private final d zzf;
    private final String zzg;

    public zzaem(d dVar, zzael zzael, zzafk zzafk, zzaeg zzaeg, zzaeh zzaeh) {
        this.zzf = dVar;
        dVar.a();
        String str = dVar.f13220c.f13231a;
        this.zzg = str;
        j.f(zzael);
        this.zze = zzael;
        zzy((zzafk) null, (zzaeg) null, (zzaeh) null);
        zzafx.zze(str, this);
    }

    private final zzaen zzx() {
        if (this.zza == null) {
            d dVar = this.zzf;
            String zzb2 = this.zze.zzb();
            dVar.a();
            this.zza = new zzaen(dVar.f13218a, dVar, zzb2);
        }
        return this.zza;
    }

    private final void zzy(zzafk zzafk, zzaeg zzaeg, zzaeh zzaeh) {
        this.zzd = null;
        this.zzb = null;
        this.zzc = null;
        String zza2 = zzafu.zza("firebear.secureToken");
        if (TextUtils.isEmpty(zza2)) {
            zza2 = zzafx.zzd(this.zzg);
        } else {
            "Found hermetic configuration for secureToken URL: ".concat(String.valueOf(zza2));
        }
        if (this.zzd == null) {
            this.zzd = new zzafk(zza2, zzx());
        }
        String zza3 = zzafu.zza("firebear.identityToolkit");
        if (TextUtils.isEmpty(zza3)) {
            zza3 = zzafx.zzb(this.zzg);
        } else {
            "Found hermetic configuration for identityToolkit URL: ".concat(String.valueOf(zza3));
        }
        if (this.zzb == null) {
            this.zzb = new zzaeg(zza3, zzx());
        }
        String zza4 = zzafu.zza("firebear.identityToolkitV2");
        if (TextUtils.isEmpty(zza4)) {
            zza4 = zzafx.zzc(this.zzg);
        } else {
            "Found hermetic configuration for identityToolkitV2 URL: ".concat(String.valueOf(zza4));
        }
        if (this.zzc == null) {
            this.zzc = new zzaeh(zza4, zzx());
        }
    }

    public final void zza(zzagb zzagb, zzafe zzafe) {
        j.f(zzagb);
        j.f(zzafe);
        zzaeg zzaeg = this.zzb;
        zzafh.zzb(zzaeg.zza("/createAuthUri", this.zzg), zzagb, zzafe, zzagc.class, zzaeg.zzb);
    }

    public final void zzb(zzagd zzagd, zzafe zzafe) {
        j.f(zzagd);
        j.f(zzafe);
        zzaeg zzaeg = this.zzb;
        zzafh.zzb(zzaeg.zza("/deleteAccount", this.zzg), zzagd, zzafe, Void.class, zzaeg.zzb);
    }

    public final void zzc(zzage zzage, zzafe zzafe) {
        j.f(zzage);
        j.f(zzafe);
        zzaeg zzaeg = this.zzb;
        zzafh.zzb(zzaeg.zza("/emailLinkSignin", this.zzg), zzage, zzafe, zzagf.class, zzaeg.zzb);
    }

    public final void zzd(zzagg zzagg, zzafe zzafe) {
        j.f(zzagg);
        j.f(zzafe);
        zzaeh zzaeh = this.zzc;
        zzafh.zzb(zzaeh.zza("/accounts/mfaEnrollment:finalize", this.zzg), zzagg, zzafe, zzagh.class, zzaeh.zzb);
    }

    public final void zze(zzagi zzagi, zzafe zzafe) {
        j.f(zzagi);
        j.f(zzafe);
        zzaeh zzaeh = this.zzc;
        zzafh.zzb(zzaeh.zza("/accounts/mfaSignIn:finalize", this.zzg), zzagi, zzafe, zzagj.class, zzaeh.zzb);
    }

    public final void zzf(zzagp zzagp, zzafe zzafe) {
        j.f(zzagp);
        j.f(zzafe);
        zzafk zzafk = this.zzd;
        zzafh.zzb(zzafk.zza("/token", this.zzg), zzagp, zzafe, zzahb.class, zzafk.zzb);
    }

    public final void zzg(zzagq zzagq, zzafe zzafe) {
        j.f(zzagq);
        j.f(zzafe);
        zzaeg zzaeg = this.zzb;
        zzafh.zzb(zzaeg.zza("/getAccountInfo", this.zzg), zzagq, zzafe, zzagr.class, zzaeg.zzb);
    }

    public final void zzh(zzagu zzagu, zzafe zzafe) {
        j.f(zzagu);
        j.f(zzafe);
        if (zzagu.zzb() != null) {
            zzx().zzc(zzagu.zzb().f7462o);
        }
        zzaeg zzaeg = this.zzb;
        zzafh.zzb(zzaeg.zza("/getOobConfirmationCode", this.zzg), zzagu, zzafe, zzagv.class, zzaeg.zzb);
    }

    public final void zzi(zzagw zzagw, zzafe zzafe) {
        j.f(zzagw);
        j.f(zzafe);
        zzaeg zzaeg = this.zzb;
        zzafh.zza(zzaeg.zza("/getRecaptchaParam", this.zzg), zzafe, zzagx.class, zzaeg.zzb);
    }

    public final void zzj(zzagz zzagz, zzafe zzafe) {
        j.f(zzagz);
        j.f(zzafe);
        zzaeh zzaeh = this.zzc;
        String zza2 = zzaeh.zza("/recaptchaConfig", this.zzg);
        String zzc2 = zzagz.zzc();
        String zzd2 = zzagz.zzd();
        zzafh.zza(zza2 + "&clientType=" + zzc2 + "&version=" + zzd2, zzafe, zzaha.class, zzaeh.zzb);
    }

    public final void zzk() {
        zzy((zzafk) null, (zzaeg) null, (zzaeh) null);
    }

    public final void zzl(zzahj zzahj, zzafe zzafe) {
        j.f(zzahj);
        j.f(zzafe);
        zzaeg zzaeg = this.zzb;
        zzafh.zzb(zzaeg.zza("/resetPassword", this.zzg), zzahj, zzafe, zzahk.class, zzaeg.zzb);
    }

    public final void zzm(zzahl zzahl, zzafe zzafe) {
        j.f(zzahl);
        j.f(zzafe);
        if (!TextUtils.isEmpty(zzahl.zzc())) {
            zzx().zzc(zzahl.zzc());
        }
        zzaeg zzaeg = this.zzb;
        zzafh.zzb(zzaeg.zza("/sendVerificationCode", this.zzg), zzahl, zzafe, zzahm.class, zzaeg.zzb);
    }

    public final void zzn(zzahn zzahn, zzafe zzafe) {
        j.f(zzahn);
        j.f(zzafe);
        zzaeg zzaeg = this.zzb;
        zzafh.zzb(zzaeg.zza("/setAccountInfo", this.zzg), zzahn, zzafe, zzaho.class, zzaeg.zzb);
    }

    public final void zzo(String str, zzafe zzafe) {
        j.f(zzafe);
        zzx().zzb(str);
        ((zzabq) zzafe).zza.zzo();
    }

    public final void zzp(zzahp zzahp, zzafe zzafe) {
        j.f(zzahp);
        j.f(zzafe);
        zzaeg zzaeg = this.zzb;
        zzafh.zzb(zzaeg.zza("/signupNewUser", this.zzg), zzahp, zzafe, zzahq.class, zzaeg.zzb);
    }

    public final void zzq(zzahr zzahr, zzafe zzafe) {
        j.f(zzahr);
        j.f(zzafe);
        if (zzahr instanceof zzahv) {
            zzahv zzahv = (zzahv) zzahr;
            if (!TextUtils.isEmpty(zzahv.zzc())) {
                zzx().zzc(zzahv.zzc());
            }
        }
        zzaeh zzaeh = this.zzc;
        zzafh.zzb(zzaeh.zza("/accounts/mfaEnrollment:start", this.zzg), zzahr, zzafe, zzahs.class, zzaeh.zzb);
    }

    public final void zzr(zzaht zzaht, zzafe zzafe) {
        j.f(zzaht);
        j.f(zzafe);
        if (!TextUtils.isEmpty(zzaht.zzc())) {
            zzx().zzc(zzaht.zzc());
        }
        zzaeh zzaeh = this.zzc;
        zzafh.zzb(zzaeh.zza("/accounts/mfaSignIn:start", this.zzg), zzaht, zzafe, zzahu.class, zzaeh.zzb);
    }

    public final void zzs(zzaic zzaic, zzafe zzafe) {
        j.f(zzaic);
        j.f(zzafe);
        zzaeg zzaeg = this.zzb;
        zzafh.zzb(zzaeg.zza("/verifyAssertion", this.zzg), zzaic, zzafe, zzaie.class, zzaeg.zzb);
    }

    public final void zzt(zzaif zzaif, zzafe zzafe) {
        j.f(zzaif);
        j.f(zzafe);
        zzaeg zzaeg = this.zzb;
        zzafh.zzb(zzaeg.zza("/verifyCustomToken", this.zzg), zzaif, zzafe, zzaig.class, zzaeg.zzb);
    }

    public final void zzu(zzaih zzaih, zzafe zzafe) {
        j.f(zzaih);
        j.f(zzafe);
        zzaeg zzaeg = this.zzb;
        zzafh.zzb(zzaeg.zza("/verifyPassword", this.zzg), zzaih, zzafe, zzaii.class, zzaeg.zzb);
    }

    public final void zzv(zzaij zzaij, zzafe zzafe) {
        j.f(zzaij);
        j.f(zzafe);
        zzaeg zzaeg = this.zzb;
        zzafh.zzb(zzaeg.zza("/verifyPhoneNumber", this.zzg), zzaij, zzafe, zzaik.class, zzaeg.zzb);
    }

    public final void zzw(zzail zzail, zzafe zzafe) {
        j.f(zzail);
        j.f(zzafe);
        zzaeh zzaeh = this.zzc;
        zzafh.zzb(zzaeh.zza("/accounts/mfaEnrollment:withdraw", this.zzg), zzail, zzafe, zzaim.class, zzaeh.zzb);
    }
}
