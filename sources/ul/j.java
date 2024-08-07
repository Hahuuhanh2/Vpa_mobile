package ul;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: Invocation */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final Method f23121a;

    /* renamed from: b  reason: collision with root package name */
    public final List<?> f23122b;

    public j(Method method, ArrayList arrayList) {
        this.f23121a = method;
        this.f23122b = Collections.unmodifiableList(arrayList);
    }

    public final String toString() {
        return String.format("%s.%s() %s", new Object[]{this.f23121a.getDeclaringClass().getName(), this.f23121a.getName(), this.f23122b});
    }
}
