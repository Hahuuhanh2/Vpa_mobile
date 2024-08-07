package tc;

import com.google.protobuf.k;
import java.nio.charset.Charset;

/* compiled from: ManifestSchemaFactory */
public final class l {

    /* renamed from: b  reason: collision with root package name */
    public static final a f15006b = new a();

    /* renamed from: a  reason: collision with root package name */
    public final o f15007a;

    /* compiled from: ManifestSchemaFactory */
    public class a implements o {
        public final n a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        public final boolean b(Class<?> cls) {
            return false;
        }
    }

    /* compiled from: ManifestSchemaFactory */
    public static class b implements o {

        /* renamed from: a  reason: collision with root package name */
        public o[] f15008a;

        public b(o... oVarArr) {
            this.f15008a = oVarArr;
        }

        public final n a(Class<?> cls) {
            for (o oVar : this.f15008a) {
                if (oVar.b(cls)) {
                    return oVar.a(cls);
                }
            }
            StringBuilder q10 = android.support.v4.media.a.q("No factory is available for message type: ");
            q10.append(cls.getName());
            throw new UnsupportedOperationException(q10.toString());
        }

        public final boolean b(Class<?> cls) {
            for (o b10 : this.f15008a) {
                if (b10.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public l() {
        o oVar;
        o[] oVarArr = new o[2];
        oVarArr[0] = h.f14993a;
        try {
            oVar = (o) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            oVar = f15006b;
        }
        oVarArr[1] = oVar;
        b bVar = new b(oVarArr);
        Charset charset = k.f7917a;
        this.f15007a = bVar;
    }
}
