package w8;

import android.support.v4.media.a;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.x;
import d9.e;
import i9.y;
import j9.c;
import java.security.GeneralSecurityException;

/* compiled from: KeyManagerImpl */
public final class d<PrimitiveT, KeyProtoT extends x> {

    /* renamed from: a  reason: collision with root package name */
    public final e<KeyProtoT> f16713a;

    /* renamed from: b  reason: collision with root package name */
    public final Class<PrimitiveT> f16714b;

    public d(e<KeyProtoT> eVar, Class<PrimitiveT> cls) {
        if (eVar.f8778b.keySet().contains(cls) || Void.class.equals(cls)) {
            this.f16713a = eVar;
            this.f16714b = cls;
            return;
        }
        throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", new Object[]{eVar.toString(), cls.getName()}));
    }

    public final x a(c cVar) {
        try {
            e.a d10 = this.f16713a.d();
            x c10 = d10.c(cVar);
            d10.d(c10);
            return d10.a(c10);
        } catch (InvalidProtocolBufferException e10) {
            StringBuilder q10 = a.q("Failures parsing proto of type ");
            q10.append(this.f16713a.d().f8780a.getName());
            throw new GeneralSecurityException(q10.toString(), e10);
        }
    }

    public final y b(c cVar) {
        try {
            e.a d10 = this.f16713a.d();
            x c10 = d10.c(cVar);
            d10.d(c10);
            x a10 = d10.a(c10);
            y.a L = y.L();
            String b10 = this.f16713a.b();
            L.o();
            y.E((y) L.f7405b, b10);
            c.f b11 = a10.b();
            L.o();
            y.F((y) L.f7405b, b11);
            y.b e10 = this.f16713a.e();
            L.o();
            y.G((y) L.f7405b, e10);
            return (y) L.build();
        } catch (InvalidProtocolBufferException e11) {
            throw new GeneralSecurityException("Unexpected proto", e11);
        }
    }
}
