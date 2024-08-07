package j9;

import java.io.Serializable;

/* compiled from: WireFormat */
public enum e0 {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(c.f11735b),
    ENUM((String) null),
    MESSAGE((String) null);
    

    /* renamed from: a  reason: collision with root package name */
    public final Object f11763a;

    /* access modifiers changed from: public */
    e0(Serializable serializable) {
        this.f11763a = serializable;
    }
}
