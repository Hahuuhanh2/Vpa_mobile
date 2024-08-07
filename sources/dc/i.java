package dc;

import android.support.v4.media.a;
import com.google.gson.JsonIOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumSet;

/* compiled from: ConstructorConstructor */
public final class i implements q<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Type f8905a;

    public i(Type type) {
        this.f8905a = type;
    }

    public final Object p() {
        Type type = this.f8905a;
        if (type instanceof ParameterizedType) {
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return EnumSet.noneOf((Class) type2);
            }
            StringBuilder q10 = a.q("Invalid EnumSet type: ");
            q10.append(this.f8905a.toString());
            throw new JsonIOException(q10.toString());
        }
        StringBuilder q11 = a.q("Invalid EnumSet type: ");
        q11.append(this.f8905a.toString());
        throw new JsonIOException(q11.toString());
    }
}
