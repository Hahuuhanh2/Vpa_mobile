package dc;

import android.support.v4.media.a;

/* compiled from: ConstructorConstructor */
public final class f implements q<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Class f8896a;

    public f(Class cls) {
        this.f8896a = cls;
    }

    public final Object p() {
        try {
            return w.f8943a.b(this.f8896a);
        } catch (Exception e10) {
            StringBuilder q10 = a.q("Unable to create instance of ");
            q10.append(this.f8896a);
            q10.append(". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.");
            throw new RuntimeException(q10.toString(), e10);
        }
    }
}
