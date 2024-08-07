package ul;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* compiled from: CallAdapter */
public interface c<R, T> {

    /* compiled from: CallAdapter */
    public static abstract class a {
        public abstract c a(Type type, Annotation[] annotationArr);
    }

    Type a();

    Object b(q qVar);
}
