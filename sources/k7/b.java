package k7;

import android.os.IBinder;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.lang.reflect.Field;
import k7.a;
import y6.j;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
public final class b<T> extends a.C0135a {

    /* renamed from: a  reason: collision with root package name */
    public final Object f12049a;

    public b(Object obj) {
        this.f12049a = obj;
    }

    @ResultIgnorabilityUnspecified
    public static <T> T o(a aVar) {
        if (aVar instanceof b) {
            return ((b) aVar).f12049a;
        }
        IBinder asBinder = aVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i10 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i10++;
                field = field2;
            }
        }
        if (i10 == 1) {
            j.f(field);
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return field.get(asBinder);
                } catch (NullPointerException e10) {
                    throw new IllegalArgumentException("Binder object is null.", e10);
                } catch (IllegalAccessException e11) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e11);
                }
            } else {
                throw new IllegalArgumentException("IObjectWrapper declared field not private!");
            }
        } else {
            throw new IllegalArgumentException(android.support.v4.media.a.m("Unexpected number of IObjectWrapper declared fields: ", declaredFields.length));
        }
    }
}
