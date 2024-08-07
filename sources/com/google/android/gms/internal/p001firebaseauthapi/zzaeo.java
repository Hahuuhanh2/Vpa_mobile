package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.Locale;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaeo  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzaeo {
    public static String zza() {
        Locale locale = Locale.getDefault();
        StringBuilder sb2 = new StringBuilder();
        zzb(sb2, locale);
        Locale locale2 = Locale.US;
        if (!locale.equals(locale2)) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            zzb(sb2, locale2);
        }
        return sb2.toString();
    }

    private static void zzb(StringBuilder sb2, Locale locale) {
        String language = locale.getLanguage();
        if (language != null) {
            sb2.append(language);
            String country = locale.getCountry();
            if (country != null) {
                sb2.append("-");
                sb2.append(country);
            }
        }
    }
}
