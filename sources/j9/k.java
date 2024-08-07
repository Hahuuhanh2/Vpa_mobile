package j9;

import com.google.crypto.tink.shaded.protobuf.p;
import java.nio.charset.Charset;

/* compiled from: ManifestSchemaFactory */
public final class k {

    /* renamed from: b  reason: collision with root package name */
    public static final a f11784b = new a();

    /* renamed from: a  reason: collision with root package name */
    public final p f11785a;

    /* compiled from: ManifestSchemaFactory */
    public class a implements p {
        public final o a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        public final boolean b(Class<?> cls) {
            return false;
        }
    }

    /* compiled from: ManifestSchemaFactory */
    public static class b implements p {

        /* renamed from: a  reason: collision with root package name */
        public p[] f11786a;

        public b(p... pVarArr) {
            this.f11786a = pVarArr;
        }

        public final o a(Class<?> cls) {
            for (p pVar : this.f11786a) {
                if (pVar.b(cls)) {
                    return pVar.a(cls);
                }
            }
            StringBuilder q10 = android.support.v4.media.a.q("No factory is available for message type: ");
            q10.append(cls.getName());
            throw new UnsupportedOperationException(q10.toString());
        }

        public final boolean b(Class<?> cls) {
            for (p b10 : this.f11786a) {
                if (b10.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public k() {
        p pVar;
        p[] pVarArr = new p[2];
        pVarArr[0] = h.f11771a;
        try {
            pVar = (p) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            pVar = f11784b;
        }
        pVarArr[1] = pVar;
        b bVar = new b(pVarArr);
        Charset charset = p.f7415a;
        this.f11785a = bVar;
    }
}
