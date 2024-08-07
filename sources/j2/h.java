package j2;

import java.io.Serializable;

/* compiled from: JavaType */
public enum h {
    VOID(Void.class, (int) null),
    INT(r0, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(c.class, c.f11484b),
    ENUM(r0, (int) null),
    MESSAGE(Object.class, (int) null);
    

    /* renamed from: a  reason: collision with root package name */
    public final Object f11508a;

    /* access modifiers changed from: public */
    h(Class cls, Serializable serializable) {
        this.f11508a = serializable;
    }
}
