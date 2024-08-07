package d9;

import com.google.crypto.tink.shaded.protobuf.x;

/* compiled from: PrimitiveFactory */
public abstract class q<PrimitiveT, KeyProtoT extends x> {

    /* renamed from: a  reason: collision with root package name */
    public final Class<PrimitiveT> f8798a;

    public q(Class<PrimitiveT> cls) {
        this.f8798a = cls;
    }

    public abstract PrimitiveT a(KeyProtoT keyprotot);
}
