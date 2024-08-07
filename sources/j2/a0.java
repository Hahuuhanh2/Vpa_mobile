package j2;

import java.io.Serializable;

/* compiled from: WireFormat */
public enum a0 {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(c.f11484b),
    ENUM((String) null),
    MESSAGE((String) null);
    

    /* renamed from: a  reason: collision with root package name */
    public final Object f11480a;

    /* access modifiers changed from: public */
    a0(Serializable serializable) {
        this.f11480a = serializable;
    }
}
