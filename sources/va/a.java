package va;

import java.lang.annotation.Annotation;
import va.d;

/* compiled from: AtProtobuf */
public final class a implements d {

    /* renamed from: a  reason: collision with root package name */
    public final int f16119a;

    public a(int i10) {
        this.f16119a = i10;
    }

    public final Class<? extends Annotation> annotationType() {
        return d.class;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        a aVar = (a) ((d) obj);
        if (this.f16119a == aVar.f16119a) {
            d.a aVar2 = d.a.DEFAULT;
            aVar.getClass();
            if (aVar2.equals(aVar2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f16119a ^ 14552422) + (d.a.DEFAULT.hashCode() ^ 2041407134);
    }

    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf" + '(' + "tag=" + this.f16119a + "intEncoding=" + d.a.DEFAULT + ')';
    }
}
