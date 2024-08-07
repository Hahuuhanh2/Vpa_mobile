package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
public enum zznf {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(zzhu.zza),
    ENUM((String) null),
    MESSAGE((String) null);
    
    private final Object zzk;

    private zznf(Object obj) {
        this.zzk = obj;
    }
}
