package ul;

import android.support.v4.media.a;
import java.lang.annotation.Annotation;

/* compiled from: SkipCallbackExecutorImpl */
public final class c0 implements b0 {

    /* renamed from: a  reason: collision with root package name */
    public static final c0 f23093a = new c0();

    public final Class<? extends Annotation> annotationType() {
        return b0.class;
    }

    public final boolean equals(Object obj) {
        return obj instanceof b0;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder q10 = a.q("@");
        q10.append(b0.class.getName());
        q10.append("()");
        return q10.toString();
    }
}
