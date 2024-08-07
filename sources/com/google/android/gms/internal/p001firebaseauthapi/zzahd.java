package com.google.android.gms.internal.p001firebaseauthapi;

import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.util.List;
import y6.j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzahd  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzahd {
    public static long zza(String str) {
        byte[] bArr;
        j.c(str);
        List zzd = zzab.zzb(zzj.zzb('.')).zzd(str);
        if (zzd.size() >= 2) {
            String str2 = (String) zzd.get(1);
            try {
                if (str2 == null) {
                    bArr = null;
                } else {
                    bArr = Base64.decode(str2, 11);
                }
                zzahe zza = zzahe.zza(new String(bArr, "UTF-8"));
                return zza.zzb().longValue() - zza.zzc().longValue();
            } catch (UnsupportedEncodingException e10) {
                throw new RuntimeException("Unable to decode token", e10);
            }
        } else {
            throw new RuntimeException("Invalid idToken ".concat(String.valueOf(str)));
        }
    }
}
