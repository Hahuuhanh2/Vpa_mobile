package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
public enum zzmv {
    DOUBLE(zznf.DOUBLE, 1),
    FLOAT(zznf.FLOAT, 5),
    INT64(r5, 0),
    UINT64(r5, 0),
    INT32(r11, 0),
    FIXED64(r5, 1),
    FIXED32(r11, 5),
    BOOL(zznf.BOOLEAN, 0),
    STRING(zznf.STRING, (zznf) null),
    GROUP(r19, (zznf) null),
    MESSAGE(r19, (zznf) null),
    BYTES(zznf.BYTE_STRING, (zznf) null),
    UINT32(r11, 0),
    ENUM(zznf.ENUM, 0),
    SFIXED32(r11, 5),
    SFIXED64(r5, 1),
    SINT32(r11, 0),
    SINT64(r5, 0);
    
    private final zznf zzt;
    private final int zzu;

    private zzmv(zznf zznf, int i10) {
        this.zzt = zznf;
        this.zzu = i10;
    }

    public final int zza() {
        return this.zzu;
    }

    public final zznf zzb() {
        return this.zzt;
    }
}
