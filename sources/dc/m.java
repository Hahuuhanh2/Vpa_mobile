package dc;

import android.support.v4.media.a;
import fc.a;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* compiled from: ConstructorConstructor */
public final class m implements q<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Constructor f8909a;

    public m(Constructor constructor) {
        this.f8909a = constructor;
    }

    public final Object p() {
        try {
            return this.f8909a.newInstance(new Object[0]);
        } catch (InstantiationException e10) {
            StringBuilder q10 = a.q("Failed to invoke constructor '");
            q10.append(fc.a.b(this.f8909a));
            q10.append("' with no args");
            throw new RuntimeException(q10.toString(), e10);
        } catch (InvocationTargetException e11) {
            StringBuilder q11 = a.q("Failed to invoke constructor '");
            q11.append(fc.a.b(this.f8909a));
            q11.append("' with no args");
            throw new RuntimeException(q11.toString(), e11.getCause());
        } catch (IllegalAccessException e12) {
            a.C0106a aVar = fc.a.f10187a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e12);
        }
    }
}
