package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.firebase.auth.ActionCodeSettings;
import y6.j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzagu  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzagu implements zzaej {
    private final String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private ActionCodeSettings zze;
    private String zzf;
    private String zzg;

    public zzagu(int i10) {
        this.zza = i10 != 1 ? i10 != 4 ? i10 != 6 ? i10 != 7 ? "REQUEST_TYPE_UNSET_ENUM_VALUE" : "VERIFY_AND_CHANGE_EMAIL" : "EMAIL_SIGNIN" : "VERIFY_EMAIL" : "PASSWORD_RESET";
    }

    private zzagu(int i10, ActionCodeSettings actionCodeSettings, String str, String str2, String str3, String str4, String str5) {
        this.zza = "VERIFY_AND_CHANGE_EMAIL";
        j.f(actionCodeSettings);
        this.zze = actionCodeSettings;
        this.zzb = null;
        this.zzc = str2;
        this.zzd = str3;
        this.zzf = null;
        this.zzg = null;
    }

    public static zzagu zzc(ActionCodeSettings actionCodeSettings, String str, String str2) {
        j.c(str);
        j.c(str2);
        j.f(actionCodeSettings);
        return new zzagu(7, actionCodeSettings, (String) null, str2, str, (String) null, (String) null);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String zza() {
        /*
            r7 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = r7.zza
            int r2 = r1.hashCode()
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            switch(r2) {
                case -1452371317: goto L_0x0031;
                case -1341836234: goto L_0x0027;
                case -1099157829: goto L_0x001d;
                case 870738373: goto L_0x0013;
                default: goto L_0x0012;
            }
        L_0x0012:
            goto L_0x003b
        L_0x0013:
            java.lang.String r2 = "EMAIL_SIGNIN"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x003b
            r1 = r5
            goto L_0x003c
        L_0x001d:
            java.lang.String r2 = "VERIFY_AND_CHANGE_EMAIL"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x003b
            r1 = r4
            goto L_0x003c
        L_0x0027:
            java.lang.String r2 = "VERIFY_EMAIL"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x003b
            r1 = r6
            goto L_0x003c
        L_0x0031:
            java.lang.String r2 = "PASSWORD_RESET"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x003b
            r1 = r3
            goto L_0x003c
        L_0x003b:
            r1 = -1
        L_0x003c:
            if (r1 == 0) goto L_0x004b
            if (r1 == r6) goto L_0x0049
            if (r1 == r5) goto L_0x0047
            if (r1 == r4) goto L_0x0045
            goto L_0x004c
        L_0x0045:
            r3 = 7
            goto L_0x004c
        L_0x0047:
            r3 = 6
            goto L_0x004c
        L_0x0049:
            r3 = 4
            goto L_0x004c
        L_0x004b:
            r3 = r6
        L_0x004c:
            java.lang.String r1 = "requestType"
            r0.put(r1, r3)
            java.lang.String r1 = r7.zzb
            if (r1 == 0) goto L_0x005a
            java.lang.String r2 = "email"
            r0.put(r2, r1)
        L_0x005a:
            java.lang.String r1 = r7.zzc
            if (r1 == 0) goto L_0x0063
            java.lang.String r2 = "newEmail"
            r0.put(r2, r1)
        L_0x0063:
            java.lang.String r1 = r7.zzd
            if (r1 == 0) goto L_0x006c
            java.lang.String r2 = "idToken"
            r0.put(r2, r1)
        L_0x006c:
            com.google.firebase.auth.ActionCodeSettings r1 = r7.zze
            if (r1 == 0) goto L_0x00c2
            boolean r1 = r1.f7459e
            java.lang.String r2 = "androidInstallApp"
            r0.put(r2, r1)
            com.google.firebase.auth.ActionCodeSettings r1 = r7.zze
            boolean r1 = r1.f7461n
            java.lang.String r2 = "canHandleCodeInApp"
            r0.put(r2, r1)
            com.google.firebase.auth.ActionCodeSettings r1 = r7.zze
            java.lang.String r1 = r1.f7455a
            if (r1 == 0) goto L_0x008b
            java.lang.String r2 = "continueUrl"
            r0.put(r2, r1)
        L_0x008b:
            com.google.firebase.auth.ActionCodeSettings r1 = r7.zze
            java.lang.String r1 = r1.f7456b
            if (r1 == 0) goto L_0x0096
            java.lang.String r2 = "iosBundleId"
            r0.put(r2, r1)
        L_0x0096:
            com.google.firebase.auth.ActionCodeSettings r1 = r7.zze
            java.lang.String r1 = r1.f7457c
            if (r1 == 0) goto L_0x00a1
            java.lang.String r2 = "iosAppStoreId"
            r0.put(r2, r1)
        L_0x00a1:
            com.google.firebase.auth.ActionCodeSettings r1 = r7.zze
            java.lang.String r1 = r1.f7458d
            if (r1 == 0) goto L_0x00ac
            java.lang.String r2 = "androidPackageName"
            r0.put(r2, r1)
        L_0x00ac:
            com.google.firebase.auth.ActionCodeSettings r1 = r7.zze
            java.lang.String r1 = r1.f7460f
            if (r1 == 0) goto L_0x00b7
            java.lang.String r2 = "androidMinimumVersion"
            r0.put(r2, r1)
        L_0x00b7:
            com.google.firebase.auth.ActionCodeSettings r1 = r7.zze
            java.lang.String r1 = r1.f7464q
            if (r1 == 0) goto L_0x00c2
            java.lang.String r2 = "dynamicLinkDomain"
            r0.put(r2, r1)
        L_0x00c2:
            java.lang.String r1 = r7.zzf
            if (r1 == 0) goto L_0x00cb
            java.lang.String r2 = "tenantId"
            r0.put(r2, r1)
        L_0x00cb:
            java.lang.String r1 = r7.zzg
            if (r1 == 0) goto L_0x00d5
            java.lang.String r2 = "captchaResp"
            com.google.android.gms.internal.p001firebaseauthapi.zzain.zzd(r0, r2, r1)
            goto L_0x00d8
        L_0x00d5:
            com.google.android.gms.internal.p001firebaseauthapi.zzain.zzc(r0)
        L_0x00d8:
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p001firebaseauthapi.zzagu.zza():java.lang.String");
    }

    public final ActionCodeSettings zzb() {
        return this.zze;
    }

    public final zzagu zzd(ActionCodeSettings actionCodeSettings) {
        j.f(actionCodeSettings);
        this.zze = actionCodeSettings;
        return this;
    }

    public final zzagu zze(String str) {
        this.zzg = str;
        return this;
    }

    public final zzagu zzf(String str) {
        j.c(str);
        this.zzb = str;
        return this;
    }

    public final zzagu zzg(String str) {
        this.zzf = str;
        return this;
    }

    public final zzagu zzh(String str) {
        j.c(str);
        this.zzd = str;
        return this;
    }
}
