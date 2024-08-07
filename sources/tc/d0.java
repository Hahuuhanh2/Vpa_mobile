package tc;

import java.io.Serializable;

/* compiled from: WireFormat */
public enum d0 {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(c.f14960b),
    ENUM((String) null),
    MESSAGE((String) null);
    

    /* renamed from: a  reason: collision with root package name */
    public final Object f14982a;

    /* access modifiers changed from: public */
    d0(Serializable serializable) {
        this.f14982a = serializable;
    }
}
