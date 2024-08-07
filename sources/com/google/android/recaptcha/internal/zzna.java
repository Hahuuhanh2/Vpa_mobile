package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzna extends RuntimeException {
    public zzna(zzlx zzlx) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final zzlc zza() {
        return new zzlc(getMessage());
    }
}
