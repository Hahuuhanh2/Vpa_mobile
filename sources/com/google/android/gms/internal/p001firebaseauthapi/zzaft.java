package com.google.android.gms.internal.p001firebaseauthapi;

import a7.a;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Base64;
import com.google.android.gms.internal.p000authapiphone.zzu;
import com.google.firebase.auth.PhoneAuthCredential;
import f0.b0;
import j7.c;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaft  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
final class zzaft {
    /* access modifiers changed from: private */
    public static final a zza = new a("FirebaseAuth", "SmsRetrieverHelper");
    private final Context zzb;
    private final ScheduledExecutorService zzc;
    /* access modifiers changed from: private */
    public final HashMap zzd = new HashMap();

    public zzaft(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.zzb = context;
        this.zzc = scheduledExecutorService;
    }

    public static void zzd(zzaft zzaft, String str) {
        zzafs zzafs = (zzafs) zzaft.zzd.get(str);
        if (zzafs != null && !zzac.zzd(zzafs.zzd) && !zzac.zzd(zzafs.zze) && !zzafs.zzb.isEmpty()) {
            for (zzadx zzr : zzafs.zzb) {
                zzr.zzr(new PhoneAuthCredential(zzafs.zzd, zzafs.zze, (String) null, (String) null, true));
            }
            zzafs.zzh = true;
        }
    }

    private static String zzl(String str, String str2) {
        boolean z10;
        String s10 = b0.s(str, " ", str2);
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(s10.getBytes(zzk.zzc));
            String substring = Base64.encodeToString(Arrays.copyOf(instance.digest(), 9), 3).substring(0, 11);
            a aVar = zza;
            String str3 = "Package: " + str + " -- Hash: " + substring;
            Object[] objArr = new Object[0];
            if (aVar.f109c <= 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                aVar.a(str3, objArr);
            }
            return substring;
        } catch (NoSuchAlgorithmException e10) {
            zza.a("NoSuchAlgorithm: ".concat(String.valueOf(e10.getMessage())), new Object[0]);
            return null;
        }
    }

    /* access modifiers changed from: private */
    public final void zzm(String str) {
        zzafs zzafs = (zzafs) this.zzd.get(str);
        if (zzafs != null && !zzafs.zzh && !zzac.zzd(zzafs.zzd)) {
            zza.a("Timed out waiting for SMS.", new Object[0]);
            for (zzadx zza2 : zzafs.zzb) {
                zza2.zza(zzafs.zzd);
            }
            zzafs.zzi = true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: zzn */
    public final void zzg(String str) {
        zzafs zzafs = (zzafs) this.zzd.get(str);
        if (zzafs != null) {
            if (!zzafs.zzi) {
                zzm(str);
            }
            zzi(str);
        }
    }

    public final String zzb() {
        Signature[] signatureArr;
        try {
            String packageName = this.zzb.getPackageName();
            if (Build.VERSION.SDK_INT < 28) {
                signatureArr = c.a(this.zzb).a(64, packageName).signatures;
            } else {
                signatureArr = c.a(this.zzb).a(134217728, packageName).signingInfo.getApkContentsSigners();
            }
            String zzl = zzl(packageName, signatureArr[0].toCharsString());
            if (zzl != null) {
                return zzl;
            }
            zza.a("Hash generation failed.", new Object[0]);
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            zza.a("Unable to find package to obtain hash.", new Object[0]);
            return null;
        }
    }

    public final void zzh(zzadx zzadx, String str) {
        zzafs zzafs = (zzafs) this.zzd.get(str);
        if (zzafs != null) {
            zzafs.zzb.add(zzadx);
            if (zzafs.zzg) {
                zzadx.zzb(zzafs.zzd);
            }
            if (zzafs.zzh) {
                zzadx.zzr(new PhoneAuthCredential(zzafs.zzd, zzafs.zze, (String) null, (String) null, true));
            }
            if (zzafs.zzi) {
                zzadx.zza(zzafs.zzd);
            }
        }
    }

    public final void zzi(String str) {
        zzafs zzafs = (zzafs) this.zzd.get(str);
        if (zzafs != null) {
            ScheduledFuture scheduledFuture = zzafs.zzf;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                zzafs.zzf.cancel(false);
            }
            zzafs.zzb.clear();
            this.zzd.remove(str);
        }
    }

    public final void zzj(String str, zzadx zzadx, long j10, boolean z10) {
        this.zzd.put(str, new zzafs(j10, z10));
        zzh(zzadx, str);
        zzafs zzafs = (zzafs) this.zzd.get(str);
        long j11 = zzafs.zza;
        if (j11 <= 0) {
            zza.a("Timeout of 0 specified; SmsRetriever will not start.", new Object[0]);
            return;
        }
        zzafs.zzf = this.zzc.schedule(new zzafo(this, str), j11, TimeUnit.SECONDS);
        if (!zzafs.zzc) {
            zza.a("SMS auto-retrieval unavailable; SmsRetriever will not start.", new Object[0]);
            return;
        }
        zzafr zzafr = new zzafr(this, str);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.gms.auth.api.phone.SMS_RETRIEVED");
        zzb.zza(this.zzb.getApplicationContext(), zzafr, intentFilter);
        new zzu(this.zzb).startSmsRetriever().addOnFailureListener(new zzafp(this));
    }

    public final boolean zzk(String str) {
        if (this.zzd.get(str) != null) {
            return true;
        }
        return false;
    }
}
