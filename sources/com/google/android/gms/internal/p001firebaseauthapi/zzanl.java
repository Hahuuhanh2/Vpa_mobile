package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzanl  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public enum zzanl {
    DOUBLE(zzanm.DOUBLE, 1),
    FLOAT(zzanm.FLOAT, 5),
    INT64(r5, 0),
    UINT64(r5, 0),
    INT32(r11, 0),
    FIXED64(r5, 1),
    FIXED32(r11, 5),
    BOOL(zzanm.BOOLEAN, 0),
    STRING(zzanm.STRING, 2),
    GROUP(r13, 3),
    MESSAGE(r13, 2),
    BYTES(zzanm.BYTE_STRING, 2),
    UINT32(r11, 0),
    ENUM(zzanm.ENUM, 0),
    SFIXED32(r11, 5),
    SFIXED64(r5, 1),
    SINT32(r11, 0),
    SINT64(r5, 0);
    
    private final zzanm zzt;

    private zzanl(zzanm zzanm, int i10) {
        this.zzt = zzanm;
    }

    public final zzanm zza() {
        return this.zzt;
    }
}
