package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzbv {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;

    public zzbv() {
        this("https://www.recaptcha.net/recaptcha/api3");
    }

    public zzbv(String str) {
        this.zza = "https://www.recaptcha.net/recaptcha/api3";
        this.zzb = "https://www.recaptcha.net/recaptcha/api3".concat("/mri");
        this.zzc = "https://www.recaptcha.net/recaptcha/api3".concat("/mlg");
        this.zzd = "https://www.recaptcha.net/recaptcha/api3".concat("/mrr");
    }

    public final String zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzc;
    }

    public final String zzd() {
        return this.zzd;
    }
}
