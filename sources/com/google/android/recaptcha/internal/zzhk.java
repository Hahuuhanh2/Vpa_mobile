package com.google.android.recaptcha.internal;

import java.nio.charset.Charset;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
abstract class zzhk implements zzho {
    public final zzhn zza(CharSequence charSequence, Charset charset) {
        zzhp zzb = zzb();
        byte[] bytes = charSequence.toString().getBytes(charset);
        bytes.getClass();
        ((zzhj) zzb).zza(bytes, 0, bytes.length);
        return zzb.zzb();
    }
}
