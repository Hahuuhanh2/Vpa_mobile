package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaErrorCode;
import com.google.android.recaptcha.RecaptchaException;
import ek.e;
import fk.h;
import java.util.Map;
import sk.j;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzbj extends Exception {
    public static final /* synthetic */ int zza = 0;
    /* access modifiers changed from: private */
    public static final Map zzb;
    private final zzbh zzc;
    private final zzbg zzd;
    private final String zze;
    private final Map zzf;

    static {
        zzrc zzrc = zzrc.JS_INTERNAL_ERROR;
        zzbh zzbh = zzbh.zzb;
        zzb = h.u0(new e(zzrc.JS_NETWORK_ERROR, new zzbj(zzbh.zzc, zzbg.zzd, (String) null)), new e(zzrc, new zzbj(zzbh, zzbg.zzc, (String) null)), new e(zzrc.JS_INVALID_SITE_KEY, new zzbj(zzbh.zzd, zzbg.zze, (String) null)), new e(zzrc.JS_INVALID_SITE_KEY_TYPE, new zzbj(zzbh.zze, zzbg.zzf, (String) null)), new e(zzrc.JS_THIRD_PARTY_APP_PACKAGE_NAME_NOT_ALLOWED, new zzbj(zzbh.zzf, zzbg.zzg, (String) null)), new e(zzrc.JS_INVALID_ACTION, new zzbj(zzbh.zzg, zzbg.zzh, (String) null)), new e(zzrc.JS_PROGRAM_ERROR, new zzbj(zzbh, zzbg.zzj, (String) null)));
    }

    public zzbj(zzbh zzbh, zzbg zzbg, String str) {
        this.zzc = zzbh;
        this.zzd = zzbg;
        this.zze = str;
        zzbh zzbh2 = zzbh.zzc;
        RecaptchaErrorCode recaptchaErrorCode = RecaptchaErrorCode.NETWORK_ERROR;
        this.zzf = h.u0(new e(zzbh2, new RecaptchaException(recaptchaErrorCode, (String) null, 2, (sk.e) null)), new e(zzbh.zzh, new RecaptchaException(recaptchaErrorCode, (String) null, 2, (sk.e) null)), new e(zzbh.zzd, new RecaptchaException(RecaptchaErrorCode.INVALID_SITEKEY, (String) null, 2, (sk.e) null)), new e(zzbh.zze, new RecaptchaException(RecaptchaErrorCode.INVALID_KEYTYPE, (String) null, 2, (sk.e) null)), new e(zzbh.zzf, new RecaptchaException(RecaptchaErrorCode.INVALID_PACKAGE_NAME, (String) null, 2, (sk.e) null)), new e(zzbh.zzg, new RecaptchaException(RecaptchaErrorCode.INVALID_ACTION, (String) null, 2, (sk.e) null)), new e(zzbh.zzb, new RecaptchaException(RecaptchaErrorCode.INTERNAL_ERROR, (String) null, 2, (sk.e) null)), new e(zzbh.zzj, new RecaptchaException(RecaptchaErrorCode.INVALID_TIMEOUT, (String) null, 2, (sk.e) null)));
    }

    public final zzbg zza() {
        return this.zzd;
    }

    public final zzbh zzb() {
        return this.zzc;
    }

    public final RecaptchaException zzc() {
        if (j.a(this.zzd, zzbg.zzI)) {
            return new RecaptchaException(RecaptchaErrorCode.INVALID_TIMEOUT, (String) null, 2, (sk.e) null);
        }
        if (j.a(this.zzd, zzbg.zzap)) {
            return new RecaptchaException(RecaptchaErrorCode.NO_NETWORK_FOUND, (String) null, 2, (sk.e) null);
        }
        RecaptchaException recaptchaException = (RecaptchaException) this.zzf.get(this.zzc);
        if (recaptchaException == null) {
            return new RecaptchaException(RecaptchaErrorCode.INTERNAL_ERROR, (String) null, 2, (sk.e) null);
        }
        return recaptchaException;
    }

    public final String zzd() {
        return this.zze;
    }
}
