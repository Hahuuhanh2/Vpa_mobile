package com.google.android.gms.internal.p001firebaseauthapi;

import a7.a;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.PhoneAuthCredential;
import y6.j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzadx  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public class zzadx {
    private final zzadw zza;
    private final a zzb;

    public zzadx(zzadw zzadw, a aVar) {
        j.f(zzadw);
        this.zza = zzadw;
        j.f(aVar);
        this.zzb = aVar;
    }

    public final void zza(String str) {
        try {
            this.zza.zza(str);
        } catch (RemoteException unused) {
            this.zzb.a("RemoteException when sending auto retrieval timeout response.", new Object[0]);
        }
    }

    public void zzb(String str) {
        try {
            this.zza.zzb(str);
        } catch (RemoteException unused) {
            this.zzb.a("RemoteException when sending send verification code response.", new Object[0]);
        }
    }

    public final void zzc(zzagc zzagc) {
        try {
            this.zza.zzc(zzagc);
        } catch (RemoteException unused) {
            this.zzb.a("RemoteException when sending create auth uri response.", new Object[0]);
        }
    }

    public final void zzd() {
        try {
            this.zza.zzd();
        } catch (RemoteException unused) {
            this.zzb.a("RemoteException when sending delete account response.", new Object[0]);
        }
    }

    public final void zze(zzaae zzaae) {
        try {
            this.zza.zze(zzaae);
        } catch (RemoteException unused) {
            this.zzb.a("RemoteException when sending failure result with credential", new Object[0]);
        }
    }

    public final void zzf(zzaaf zzaaf) {
        try {
            this.zza.zzf(zzaaf);
        } catch (RemoteException unused) {
            this.zzb.a("RemoteException when sending failure result for mfa", new Object[0]);
        }
    }

    public final void zzg(Status status, PhoneAuthCredential phoneAuthCredential) {
        try {
            this.zza.zzg(status, phoneAuthCredential);
        } catch (RemoteException unused) {
            this.zzb.a("RemoteException when sending failure result.", new Object[0]);
        }
    }

    public void zzh(Status status) {
        try {
            this.zza.zzh(status);
        } catch (RemoteException unused) {
            this.zzb.a("RemoteException when sending failure result.", new Object[0]);
        }
    }

    public final void zzi(zzagx zzagx) {
        try {
            this.zza.zzi(zzagx);
        } catch (RemoteException unused) {
            this.zzb.a("RemoteException when sending Play Integrity Producer project response.", new Object[0]);
        }
    }

    public final void zzj(zzaha zzaha) {
        try {
            this.zza.zzj(zzaha);
        } catch (RemoteException unused) {
            this.zzb.a("RemoteException when sending get recaptcha config response.", new Object[0]);
        }
    }

    public final void zzk(zzahb zzahb, zzags zzags) {
        try {
            this.zza.zzk(zzahb, zzags);
        } catch (RemoteException unused) {
            this.zzb.a("RemoteException when sending get token and account info user response", new Object[0]);
        }
    }

    public final void zzl(zzahk zzahk) {
        try {
            this.zza.zzl(zzahk);
        } catch (RemoteException unused) {
            this.zzb.a("RemoteException when sending password reset response.", new Object[0]);
        }
    }

    public final void zzm() {
        try {
            this.zza.zzm();
        } catch (RemoteException unused) {
            this.zzb.a("RemoteException when sending email verification response.", new Object[0]);
        }
    }

    public final void zzn(String str) {
        try {
            this.zza.zzn(str);
        } catch (RemoteException unused) {
            this.zzb.a("RemoteException when sending set account info response.", new Object[0]);
        }
    }

    public final void zzo() {
        try {
            this.zza.zzo();
        } catch (RemoteException unused) {
            this.zzb.a("RemoteException when setting FirebaseUI Version", new Object[0]);
        }
    }

    public final void zzp(zzahs zzahs) {
        try {
            this.zza.zzp(zzahs);
        } catch (RemoteException unused) {
            this.zzb.a("RemoteException when sending start mfa enrollment response.", new Object[0]);
        }
    }

    public final void zzq(zzahb zzahb) {
        try {
            this.zza.zzq(zzahb);
        } catch (RemoteException unused) {
            this.zzb.a("RemoteException when sending token result.", new Object[0]);
        }
    }

    public final void zzr(PhoneAuthCredential phoneAuthCredential) {
        try {
            this.zza.zzr(phoneAuthCredential);
        } catch (RemoteException unused) {
            this.zzb.a("RemoteException when sending verification completed response.", new Object[0]);
        }
    }

    public zzadx(zzadx zzadx) {
        this(zzadx.zza, zzadx.zzb);
    }
}
