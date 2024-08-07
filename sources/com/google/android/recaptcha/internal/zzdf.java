package com.google.android.recaptcha.internal;

import android.content.Context;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzdf {
    private static zzoa zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final zzdg zzf;
    private final Context zzg;
    private final Integer zzh;
    private final String zzi = zznr.zzc(zznr.zzb(System.currentTimeMillis()));
    private final long zzj = System.currentTimeMillis();
    private final int zzk;

    public zzdf(int i10, String str, String str2, String str3, String str4, String str5, zzdg zzdg, zzbw zzbw, Context context, Integer num) {
        this.zzk = i10;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = str4;
        this.zzf = zzdg;
        this.zzg = context;
        this.zzh = num;
    }

    /* JADX WARNING: type inference failed for: r13v29, types: [com.google.android.recaptcha.internal.zzks] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0115 A[Catch:{ NameNotFoundException -> 0x015b }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0130 A[Catch:{ NameNotFoundException -> 0x015b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzc(int r13, com.google.android.recaptcha.internal.zzod r14) {
        /*
            r12 = this;
            java.lang.String r0 = ""
            com.google.android.recaptcha.internal.zzoo r1 = com.google.android.recaptcha.internal.zzop.zzi()
            int r2 = r12.zzk
            r1.zzx(r2)
            java.lang.String r2 = r12.zzc
            r1.zzp(r2)
            java.lang.String r2 = r12.zzd
            r1.zzs(r2)
            java.lang.String r2 = r12.zze
            if (r2 == 0) goto L_0x001c
            r1.zzw(r2)
        L_0x001c:
            java.lang.Integer r2 = r12.zzh
            if (r2 == 0) goto L_0x0027
            int r2 = r2.intValue()
            r1.zzu(r2)
        L_0x0027:
            if (r14 == 0) goto L_0x002c
            r1.zzr(r14)
        L_0x002c:
            r1.zzy(r13)
            java.lang.String r13 = r12.zzi
            r1.zzv(r13)
            long r13 = r12.zzj
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r13
            r1.zzq(r2)
            int r13 = com.google.android.recaptcha.internal.zzbb.zza
            com.google.android.recaptcha.internal.zzdd r13 = com.google.android.recaptcha.internal.zzdd.zza
            ek.g r13 = j7.a.b0(r13)
            java.lang.Object r13 = r13.getValue()
            com.google.android.recaptcha.internal.zzbf r13 = (com.google.android.recaptcha.internal.zzbf) r13
            java.util.List r13 = r13.zza()
            java.util.Iterator r13 = r13.iterator()
        L_0x0054:
            boolean r14 = r13.hasNext()
            r2 = 0
            if (r14 == 0) goto L_0x0065
            java.lang.Object r14 = r13.next()
            com.google.android.recaptcha.internal.zzbd r14 = (com.google.android.recaptcha.internal.zzbd) r14
            r1.zze(r2)
            goto L_0x0054
        L_0x0065:
            int r13 = com.google.android.recaptcha.internal.zzbq.zza
            int r13 = r12.zzk
            long r3 = r1.zzd()
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r5
            int r13 = r13 + -2
            r14 = 4
            if (r13 == r14) goto L_0x0091
            r14 = 5
            if (r13 == r14) goto L_0x008e
            r14 = 6
            if (r13 == r14) goto L_0x008b
            r14 = 7
            if (r13 == r14) goto L_0x0088
            r14 = 14
            if (r13 == r14) goto L_0x0085
            com.google.android.recaptcha.internal.zzbr r13 = com.google.android.recaptcha.internal.zzbr.zza
            goto L_0x0093
        L_0x0085:
            com.google.android.recaptcha.internal.zzbr r13 = com.google.android.recaptcha.internal.zzbr.zzf
            goto L_0x0093
        L_0x0088:
            com.google.android.recaptcha.internal.zzbr r13 = com.google.android.recaptcha.internal.zzbr.zze
            goto L_0x0093
        L_0x008b:
            com.google.android.recaptcha.internal.zzbr r13 = com.google.android.recaptcha.internal.zzbr.zzd
            goto L_0x0093
        L_0x008e:
            com.google.android.recaptcha.internal.zzbr r13 = com.google.android.recaptcha.internal.zzbr.zzc
            goto L_0x0093
        L_0x0091:
            com.google.android.recaptcha.internal.zzbr r13 = com.google.android.recaptcha.internal.zzbr.zzb
        L_0x0093:
            int r13 = r13.zza()
            com.google.android.recaptcha.internal.zzbq.zza(r13, r3)
            com.google.android.recaptcha.internal.zzde r13 = com.google.android.recaptcha.internal.zzde.zza
            ek.g r13 = j7.a.b0(r13)
            java.lang.Object r13 = r13.getValue()
            com.google.android.recaptcha.internal.zzbk r13 = (com.google.android.recaptcha.internal.zzbk) r13
            android.content.Context r13 = r12.zzg
            java.util.Set r14 = com.google.android.recaptcha.internal.zzbk.zza(r13)
            com.google.android.recaptcha.internal.zzoa r3 = zza
            if (r3 != 0) goto L_0x0165
            com.google.android.recaptcha.internal.zzny r3 = com.google.android.recaptcha.internal.zzoa.zzf()
            int r4 = android.os.Build.VERSION.SDK_INT
            r3.zze(r4)
            java.lang.String r5 = "com.google.android.gms.version"
            r6 = 33
            r7 = -1
            java.lang.String r8 = "unknown"
            if (r4 < r6) goto L_0x00e2
            android.content.pm.PackageManager r4 = r13.getPackageManager()     // Catch:{ NameNotFoundException -> 0x00fe }
            java.lang.String r9 = r13.getPackageName()     // Catch:{ NameNotFoundException -> 0x00fe }
            r10 = 128(0x80, double:6.32E-322)
            android.content.pm.PackageManager$ApplicationInfoFlags r10 = android.content.pm.PackageManager.ApplicationInfoFlags.of(r10)     // Catch:{ NameNotFoundException -> 0x00fe }
            android.content.pm.ApplicationInfo r4 = r4.getApplicationInfo(r9, r10)     // Catch:{ NameNotFoundException -> 0x00fe }
            android.os.Bundle r4 = r4.metaData     // Catch:{ NameNotFoundException -> 0x00fe }
            int r4 = r4.getInt(r5, r7)     // Catch:{ NameNotFoundException -> 0x00fe }
            if (r4 != r7) goto L_0x00dd
            goto L_0x00fe
        L_0x00dd:
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ NameNotFoundException -> 0x00fe }
            goto L_0x00ff
        L_0x00e2:
            android.content.pm.PackageManager r4 = r13.getPackageManager()     // Catch:{ NameNotFoundException -> 0x00fe }
            java.lang.String r9 = r13.getPackageName()     // Catch:{ NameNotFoundException -> 0x00fe }
            r10 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r4 = r4.getApplicationInfo(r9, r10)     // Catch:{ NameNotFoundException -> 0x00fe }
            android.os.Bundle r4 = r4.metaData     // Catch:{ NameNotFoundException -> 0x00fe }
            int r4 = r4.getInt(r5, r7)     // Catch:{ NameNotFoundException -> 0x00fe }
            if (r4 != r7) goto L_0x00f9
            goto L_0x00fe
        L_0x00f9:
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ NameNotFoundException -> 0x00fe }
            goto L_0x00ff
        L_0x00fe:
            r4 = r8
        L_0x00ff:
            r3.zzr(r4)
            java.lang.String r4 = "18.5.1"
            r3.zzt(r4)
            java.lang.String r4 = android.os.Build.MODEL
            r3.zzq(r4)
            java.lang.String r4 = android.os.Build.MANUFACTURER
            r3.zzs(r4)
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ NameNotFoundException -> 0x015b }
            if (r4 < r6) goto L_0x0130
            android.content.pm.PackageManager r2 = r13.getPackageManager()     // Catch:{ NameNotFoundException -> 0x015b }
            java.lang.String r13 = r13.getPackageName()     // Catch:{ NameNotFoundException -> 0x015b }
            r4 = 0
            android.content.pm.PackageManager$PackageInfoFlags r4 = android.content.pm.PackageManager.PackageInfoFlags.of(r4)     // Catch:{ NameNotFoundException -> 0x015b }
            android.content.pm.PackageInfo r13 = r2.getPackageInfo(r13, r4)     // Catch:{ NameNotFoundException -> 0x015b }
            long r4 = r13.getLongVersionCode()     // Catch:{ NameNotFoundException -> 0x015b }
            java.lang.String r8 = java.lang.String.valueOf(r4)     // Catch:{ NameNotFoundException -> 0x015b }
            goto L_0x015b
        L_0x0130:
            r5 = 28
            if (r4 < r5) goto L_0x0149
            android.content.pm.PackageManager r4 = r13.getPackageManager()     // Catch:{ NameNotFoundException -> 0x015b }
            java.lang.String r13 = r13.getPackageName()     // Catch:{ NameNotFoundException -> 0x015b }
            android.content.pm.PackageInfo r13 = r4.getPackageInfo(r13, r2)     // Catch:{ NameNotFoundException -> 0x015b }
            long r4 = r13.getLongVersionCode()     // Catch:{ NameNotFoundException -> 0x015b }
            java.lang.String r8 = java.lang.String.valueOf(r4)     // Catch:{ NameNotFoundException -> 0x015b }
            goto L_0x015b
        L_0x0149:
            android.content.pm.PackageManager r4 = r13.getPackageManager()     // Catch:{ NameNotFoundException -> 0x015b }
            java.lang.String r13 = r13.getPackageName()     // Catch:{ NameNotFoundException -> 0x015b }
            android.content.pm.PackageInfo r13 = r4.getPackageInfo(r13, r2)     // Catch:{ NameNotFoundException -> 0x015b }
            int r13 = r13.versionCode     // Catch:{ NameNotFoundException -> 0x015b }
            java.lang.String r8 = java.lang.String.valueOf(r13)     // Catch:{ NameNotFoundException -> 0x015b }
        L_0x015b:
            r3.zzp(r8)
            com.google.android.recaptcha.internal.zzks r13 = r3.zzj()
            r3 = r13
            com.google.android.recaptcha.internal.zzoa r3 = (com.google.android.recaptcha.internal.zzoa) r3
        L_0x0165:
            zza = r3
            com.google.android.recaptcha.internal.zzkm r13 = r3.zzq()
            com.google.android.recaptcha.internal.zzny r13 = (com.google.android.recaptcha.internal.zzny) r13
            r13.zzd(r14)
            com.google.android.recaptcha.internal.zzks r13 = r13.zzj()
            com.google.android.recaptcha.internal.zzoa r13 = (com.google.android.recaptcha.internal.zzoa) r13
            java.util.Locale r14 = java.util.Locale.getDefault()     // Catch:{ MissingResourceException -> 0x017f }
            java.lang.String r14 = r14.getISO3Language()     // Catch:{ MissingResourceException -> 0x017f }
            goto L_0x0180
        L_0x017f:
            r14 = r0
        L_0x0180:
            java.util.Locale r2 = java.util.Locale.getDefault()     // Catch:{ MissingResourceException -> 0x0188 }
            java.lang.String r0 = r2.getISO3Country()     // Catch:{ MissingResourceException -> 0x0188 }
        L_0x0188:
            java.lang.String r2 = r12.zzb
            com.google.android.recaptcha.internal.zzpa r3 = com.google.android.recaptcha.internal.zzpb.zzf()
            r3.zzq(r2)
            r3.zzd(r13)
            r3.zzp(r14)
            r3.zze(r0)
            com.google.android.recaptcha.internal.zzks r13 = r3.zzj()
            com.google.android.recaptcha.internal.zzpb r13 = (com.google.android.recaptcha.internal.zzpb) r13
            r1.zzt(r13)
            com.google.android.recaptcha.internal.zzrd r13 = com.google.android.recaptcha.internal.zzre.zzi()
            r13.zzd(r1)
            com.google.android.recaptcha.internal.zzks r13 = r13.zzj()
            com.google.android.recaptcha.internal.zzre r13 = (com.google.android.recaptcha.internal.zzre) r13
            com.google.android.recaptcha.internal.zzdg r14 = r12.zzf
            r14.zza(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzdf.zzc(int, com.google.android.recaptcha.internal.zzod):void");
    }

    public final void zza() {
        zzc(3, (zzod) null);
    }

    public final void zzb(zzbj zzbj) {
        zzoc zzg2 = zzod.zzg();
        zzg2.zzq(String.valueOf(zzbj.zzb().zza()));
        zzg2.zzd(zzbj.zza().zza());
        zzg2.zzp(zzbj.zzc().getErrorCode().getErrorCode());
        String zzd2 = zzbj.zzd();
        if (zzd2 != null) {
            zzg2.zze(zzd2);
        }
        zzc(4, (zzod) zzg2.zzj());
    }
}
