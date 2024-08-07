package tc;

import java.io.Serializable;

/* compiled from: JavaType */
public enum j {
    VOID(Void.class, (int) null),
    INT(r0, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(c.class, c.f14960b),
    ENUM(r0, (int) null),
    MESSAGE(Object.class, (int) null);
    

    /* renamed from: a  reason: collision with root package name */
    public final Object f15005a;

    /* access modifiers changed from: public */
    j(Class cls, Serializable serializable) {
        this.f15005a = serializable;
    }
}
