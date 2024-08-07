package j9;

import java.io.Serializable;

/* compiled from: JavaType */
public enum i {
    VOID(Void.class, (int) null),
    INT(r0, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(c.class, c.f11735b),
    ENUM(r0, (int) null),
    MESSAGE(Object.class, (int) null);
    

    /* renamed from: a  reason: collision with root package name */
    public final Object f11783a;

    /* access modifiers changed from: public */
    i(Class cls, Serializable serializable) {
        this.f11783a = serializable;
    }
}
