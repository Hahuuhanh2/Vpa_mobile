package dc;

import android.support.v4.media.a;
import com.google.gson.JsonIOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumMap;

/* compiled from: ConstructorConstructor */
public final class j implements q<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Type f8906a;

    public j(Type type) {
        this.f8906a = type;
    }

    public final Object p() {
        Type type = this.f8906a;
        if (type instanceof ParameterizedType) {
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return new EnumMap((Class) type2);
            }
            StringBuilder q10 = a.q("Invalid EnumMap type: ");
            q10.append(this.f8906a.toString());
            throw new JsonIOException(q10.toString());
        }
        StringBuilder q11 = a.q("Invalid EnumMap type: ");
        q11.append(this.f8906a.toString());
        throw new JsonIOException(q11.toString());
    }
}
