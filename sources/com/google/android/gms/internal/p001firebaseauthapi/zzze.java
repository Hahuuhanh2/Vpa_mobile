package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzze  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzze {
    public static String zza(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(r1 + r1);
        for (byte b10 : bArr) {
            byte b11 = b10 & 255;
            sb2.append("0123456789abcdef".charAt(b11 >> 4));
            sb2.append("0123456789abcdef".charAt(b11 & 15));
        }
        return sb2.toString();
    }
}