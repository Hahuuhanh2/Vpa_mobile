package j2;

import androidx.datastore.preferences.protobuf.p;
import java.nio.charset.Charset;

/* compiled from: ManifestSchemaFactory */
public final class j {

    /* renamed from: b  reason: collision with root package name */
    public static final a f11509b = new a();

    /* renamed from: a  reason: collision with root package name */
    public final m f11510a;

    /* compiled from: ManifestSchemaFactory */
    public static class a implements m {
        public final l a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        public final boolean b(Class<?> cls) {
            return false;
        }
    }

    /* compiled from: ManifestSchemaFactory */
    public static class b implements m {

        /* renamed from: a  reason: collision with root package name */
        public m[] f11511a;

        public b(m... mVarArr) {
            this.f11511a = mVarArr;
        }

        public final l a(Class<?> cls) {
            for (m mVar : this.f11511a) {
                if (mVar.b(cls)) {
                    return mVar.a(cls);
                }
            }
            StringBuilder q10 = android.support.v4.media.a.q("No factory is available for message type: ");
            q10.append(cls.getName());
            throw new UnsupportedOperationException(q10.toString());
        }

        public final boolean b(Class<?> cls) {
            for (m b10 : this.f11511a) {
                if (b10.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public j() {
        m mVar;
        m[] mVarArr = new m[2];
        mVarArr[0] = g.f11496a;
        try {
            mVar = (m) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            mVar = f11509b;
        }
        mVarArr[1] = mVar;
        b bVar = new b(mVarArr);
        Charset charset = p.f2318a;
        this.f11510a = bVar;
    }
}
