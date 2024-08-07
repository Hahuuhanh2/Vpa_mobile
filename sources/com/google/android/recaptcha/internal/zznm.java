package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public enum zznm {
    DOUBLE(zznn.DOUBLE, 1),
    FLOAT(zznn.FLOAT, 5),
    INT64(r5, 0),
    UINT64(r5, 0),
    INT32(r11, 0),
    FIXED64(r5, 1),
    FIXED32(r11, 5),
    BOOL(zznn.BOOLEAN, 0),
    STRING(zznn.STRING, 2),
    GROUP(r13, 3),
    MESSAGE(r13, 2),
    BYTES(zznn.BYTE_STRING, 2),
    UINT32(r11, 0),
    ENUM(zznn.ENUM, 0),
    SFIXED32(r11, 5),
    SFIXED64(r5, 1),
    SINT32(r11, 0),
    SINT64(r5, 0);
    
    private final zznn zzt;

    private zznm(zznn zznn, int i10) {
        this.zzt = zznn;
    }

    public final zznn zza() {
        return this.zzt;
    }
}
