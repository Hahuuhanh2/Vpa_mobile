package bc;

import android.support.v4.media.a;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Objects;

/* compiled from: JsonPrimitive */
public final class o extends l {

    /* renamed from: a  reason: collision with root package name */
    public final Serializable f4162a;

    public o(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f4162a = bool;
    }

    public static boolean o(o oVar) {
        Serializable serializable = oVar.f4162a;
        if (serializable instanceof Number) {
            Number number = (Number) serializable;
            if ((number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        if (this.f4162a == null) {
            if (oVar.f4162a == null) {
                return true;
            }
            return false;
        } else if (!o(this) || !o(oVar)) {
            Serializable serializable = this.f4162a;
            if (!(serializable instanceof Number) || !(oVar.f4162a instanceof Number)) {
                return serializable.equals(oVar.f4162a);
            }
            double doubleValue = n().doubleValue();
            double doubleValue2 = oVar.n().doubleValue();
            if (doubleValue == doubleValue2) {
                return true;
            }
            if (!Double.isNaN(doubleValue) || !Double.isNaN(doubleValue2)) {
                return false;
            }
            return true;
        } else if (n().longValue() == oVar.n().longValue()) {
            return true;
        } else {
            return false;
        }
    }

    public final int hashCode() {
        long j10;
        if (this.f4162a == null) {
            return 31;
        }
        if (o(this)) {
            j10 = n().longValue();
        } else {
            Serializable serializable = this.f4162a;
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            j10 = Double.doubleToLongBits(n().doubleValue());
        }
        return (int) ((j10 >>> 32) ^ j10);
    }

    public final String l() {
        Serializable serializable = this.f4162a;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return n().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        StringBuilder q10 = a.q("Unexpected value type: ");
        q10.append(this.f4162a.getClass());
        throw new AssertionError(q10.toString());
    }

    public final boolean m() {
        Serializable serializable = this.f4162a;
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).booleanValue();
        }
        return Boolean.parseBoolean(l());
    }

    public final Number n() {
        Serializable serializable = this.f4162a;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new dc.o((String) serializable);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public o(Number number) {
        Objects.requireNonNull(number);
        this.f4162a = number;
    }

    public o(String str) {
        Objects.requireNonNull(str);
        this.f4162a = str;
    }
}
