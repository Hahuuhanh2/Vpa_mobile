package va;

import com.google.firebase.encoders.EncodingException;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;
import sa.c;
import sa.e;
import ta.b;

/* compiled from: ProtobufEncoder */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final Map<Class<?>, c<?>> f16132a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<Class<?>, e<?>> f16133b;

    /* renamed from: c  reason: collision with root package name */
    public final c<Object> f16134c;

    /* compiled from: ProtobufEncoder */
    public static final class a implements b<a> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f16135a = new g();
    }

    public h(HashMap hashMap, HashMap hashMap2, g gVar) {
        this.f16132a = hashMap;
        this.f16133b = hashMap2;
        this.f16134c = gVar;
    }

    public final void a(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        Map<Class<?>, c<?>> map = this.f16132a;
        f fVar = new f(byteArrayOutputStream, map, this.f16133b, this.f16134c);
        if (obj != null) {
            c cVar = map.get(obj.getClass());
            if (cVar != null) {
                cVar.encode(obj, fVar);
                return;
            }
            StringBuilder q10 = android.support.v4.media.a.q("No encoder for ");
            q10.append(obj.getClass());
            throw new EncodingException(q10.toString());
        }
    }
}
