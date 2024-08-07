package com.google.android.gms.internal.p001firebaseauthapi;

import android.app.PendingIntent;
import android.support.v4.media.a;
import ba.g;
import ba.j;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.PhoneAuthCredential;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaew  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
final class zzaew implements zzadw {
    public final /* synthetic */ zzaez zza;

    public zzaew(zzaez zzaez) {
        this.zza = zzaez;
    }

    private final void zzs(zzaex zzaex) {
        this.zza.zzm.execute(new zzaev(this, zzaex));
    }

    private final void zzt(Status status, AuthCredential authCredential, String str, String str2) {
        zzaez.zzk(this.zza, status);
        zzaez zzaez = this.zza;
        zzaez.zzt = authCredential;
        zzaez.zzu = str;
        zzaez.zzv = str2;
        j jVar = zzaez.zzj;
        if (jVar != null) {
            jVar.a(status);
        }
        this.zza.zzl(status);
    }

    public final void zza(String str) {
        boolean z10;
        int i10 = this.zza.zze;
        String zzO = zzabz.zzO(this, "Unexpected response type ");
        if (i10 == 8) {
            z10 = true;
        } else {
            z10 = false;
        }
        y6.j.h(zzO, z10);
        zzaez zzaez = this.zza;
        zzaez.zzs = str;
        zzaez.zza = true;
        zzs(new zzaet(this, str));
    }

    public final void zzb(String str) {
        boolean z10;
        int i10 = this.zza.zze;
        String zzO = zzabz.zzO(this, "Unexpected response type ");
        if (i10 == 8) {
            z10 = true;
        } else {
            z10 = false;
        }
        y6.j.h(zzO, z10);
        this.zza.zzs = str;
        zzs(new zzaer(this, str));
    }

    public final void zzc(zzagc zzagc) {
        boolean z10;
        int i10 = this.zza.zze;
        String zzO = zzabz.zzO(this, "Unexpected response type ");
        if (i10 == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        y6.j.h(zzO, z10);
        zzaez zzaez = this.zza;
        zzaez.zzp = zzagc;
        zzaez.zzj(zzaez);
    }

    public final void zzd() {
        boolean z10;
        int i10 = this.zza.zze;
        String zzO = zzabz.zzO(this, "Unexpected response type ");
        if (i10 == 5) {
            z10 = true;
        } else {
            z10 = false;
        }
        y6.j.h(zzO, z10);
        zzaez.zzj(this.zza);
    }

    public final void zze(zzaae zzaae) {
        zzt(zzaae.zza(), zzaae.zzb(), zzaae.zzc(), zzaae.zzd());
    }

    public final void zzf(zzaaf zzaaf) {
        zzaez zzaez = this.zza;
        zzaez.zzw = zzaaf;
        zzaez.zzl(g.a("REQUIRES_SECOND_FACTOR_AUTH"));
    }

    public final void zzg(Status status, PhoneAuthCredential phoneAuthCredential) {
        boolean z10;
        StringBuilder q10 = a.q("Unexpected response type ");
        int i10 = this.zza.zze;
        q10.append(i10);
        String sb2 = q10.toString();
        if (i10 == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        y6.j.h(sb2, z10);
        zzt(status, phoneAuthCredential, (String) null, (String) null);
    }

    public final void zzh(Status status) {
        String str = status.f5346b;
        if (str != null) {
            if (str.contains("MISSING_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17081, (String) null, (PendingIntent) null, (ConnectionResult) null);
            } else if (str.contains("MISSING_MFA_ENROLLMENT_ID")) {
                status = new Status(17082, (String) null, (PendingIntent) null, (ConnectionResult) null);
            } else if (str.contains("INVALID_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17083, (String) null, (PendingIntent) null, (ConnectionResult) null);
            } else if (str.contains("MFA_ENROLLMENT_NOT_FOUND")) {
                status = new Status(17084, (String) null, (PendingIntent) null, (ConnectionResult) null);
            } else if (str.contains("ADMIN_ONLY_OPERATION")) {
                status = new Status(17085, (String) null, (PendingIntent) null, (ConnectionResult) null);
            } else if (str.contains("UNVERIFIED_EMAIL")) {
                status = new Status(17086, (String) null, (PendingIntent) null, (ConnectionResult) null);
            } else if (str.contains("SECOND_FACTOR_EXISTS")) {
                status = new Status(17087, (String) null, (PendingIntent) null, (ConnectionResult) null);
            } else if (str.contains("SECOND_FACTOR_LIMIT_EXCEEDED")) {
                status = new Status(17088, (String) null, (PendingIntent) null, (ConnectionResult) null);
            } else if (str.contains("UNSUPPORTED_FIRST_FACTOR")) {
                status = new Status(17089, (String) null, (PendingIntent) null, (ConnectionResult) null);
            } else if (str.contains("EMAIL_CHANGE_NEEDS_VERIFICATION")) {
                status = new Status(17090, (String) null, (PendingIntent) null, (ConnectionResult) null);
            }
        }
        zzaez zzaez = this.zza;
        if (zzaez.zze == 8) {
            zzaez.zza = true;
            zzs(new zzaeu(this, status));
            return;
        }
        zzaez.zzk(zzaez, status);
        this.zza.zzl(status);
    }

    public final void zzi(zzagx zzagx) {
        zzaez zzaez = this.zza;
        zzaez.zzy = zzagx;
        zzaez.zzj(zzaez);
    }

    public final void zzj(zzaha zzaha) {
        zzaez zzaez = this.zza;
        zzaez.zzx = zzaha;
        zzaez.zzj(zzaez);
    }

    public final void zzk(zzahb zzahb, zzags zzags) {
        boolean z10;
        int i10 = this.zza.zze;
        String zzO = zzabz.zzO(this, "Unexpected response type: ");
        if (i10 == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        y6.j.h(zzO, z10);
        zzaez zzaez = this.zza;
        zzaez.zzn = zzahb;
        zzaez.zzo = zzags;
        zzaez.zzj(zzaez);
    }

    public final void zzl(zzahk zzahk) {
        boolean z10;
        int i10 = this.zza.zze;
        String zzO = zzabz.zzO(this, "Unexpected response type ");
        if (i10 == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        y6.j.h(zzO, z10);
        zzaez zzaez = this.zza;
        zzaez.zzq = zzahk;
        zzaez.zzj(zzaez);
    }

    public final void zzm() {
        boolean z10;
        int i10 = this.zza.zze;
        String zzO = zzabz.zzO(this, "Unexpected response type ");
        if (i10 == 6) {
            z10 = true;
        } else {
            z10 = false;
        }
        y6.j.h(zzO, z10);
        zzaez.zzj(this.zza);
    }

    public final void zzn(String str) {
        boolean z10;
        int i10 = this.zza.zze;
        String zzO = zzabz.zzO(this, "Unexpected response type ");
        if (i10 == 7) {
            z10 = true;
        } else {
            z10 = false;
        }
        y6.j.h(zzO, z10);
        zzaez zzaez = this.zza;
        zzaez.zzr = str;
        zzaez.zzj(zzaez);
    }

    public final void zzo() {
        boolean z10;
        int i10 = this.zza.zze;
        String zzO = zzabz.zzO(this, "Unexpected response type ");
        if (i10 == 9) {
            z10 = true;
        } else {
            z10 = false;
        }
        y6.j.h(zzO, z10);
        zzaez.zzj(this.zza);
    }

    public final void zzp(zzahs zzahs) {
        zzaez zzaez = this.zza;
        zzaez.zzz = zzahs;
        zzaez.zzj(zzaez);
    }

    public final void zzq(zzahb zzahb) {
        int i10 = this.zza.zze;
        String zzO = zzabz.zzO(this, "Unexpected response type: ");
        boolean z10 = true;
        if (i10 != 1) {
            z10 = false;
        }
        y6.j.h(zzO, z10);
        zzaez zzaez = this.zza;
        zzaez.zzn = zzahb;
        zzaez.zzj(zzaez);
    }

    public final void zzr(PhoneAuthCredential phoneAuthCredential) {
        boolean z10;
        int i10 = this.zza.zze;
        String zzO = zzabz.zzO(this, "Unexpected response type ");
        if (i10 == 8) {
            z10 = true;
        } else {
            z10 = false;
        }
        y6.j.h(zzO, z10);
        this.zza.zza = true;
        zzs(new zzaes(this, phoneAuthCredential));
    }
}
