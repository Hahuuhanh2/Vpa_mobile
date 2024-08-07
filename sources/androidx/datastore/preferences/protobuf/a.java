package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.CodedOutputStream;
import androidx.datastore.preferences.protobuf.a;
import androidx.datastore.preferences.protobuf.a.C0019a;
import androidx.datastore.preferences.protobuf.z;
import j2.c;
import j2.u;
import java.io.IOException;
import java.util.logging.Logger;

/* compiled from: AbstractMessageLite */
public abstract class a<MessageType extends a<MessageType, BuilderType>, BuilderType extends C0019a<MessageType, BuilderType>> implements z {
    public int memoizedHashCode = 0;

    /* renamed from: androidx.datastore.preferences.protobuf.a$a  reason: collision with other inner class name */
    /* compiled from: AbstractMessageLite */
    public static abstract class C0019a<MessageType extends a<MessageType, BuilderType>, BuilderType extends C0019a<MessageType, BuilderType>> implements z.a {
    }

    public final c.e b() {
        try {
            n nVar = (n) this;
            int c10 = nVar.c();
            c.e eVar = c.f11484b;
            byte[] bArr = new byte[c10];
            Logger logger = CodedOutputStream.f2201c;
            CodedOutputStream.b bVar = new CodedOutputStream.b(bArr, c10);
            nVar.j(bVar);
            if (bVar.f2208f - bVar.f2209n == 0) {
                return new c.e(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e10) {
            StringBuilder q10 = android.support.v4.media.a.q("Serializing ");
            q10.append(getClass().getName());
            q10.append(" to a ");
            q10.append("ByteString");
            q10.append(" threw an IOException (should never happen).");
            throw new RuntimeException(q10.toString(), e10);
        }
    }

    /* access modifiers changed from: package-private */
    public int d() {
        throw new UnsupportedOperationException();
    }

    public final int h(u uVar) {
        int d10 = d();
        if (d10 != -1) {
            return d10;
        }
        int f10 = uVar.f(this);
        i(f10);
        return f10;
    }

    /* access modifiers changed from: package-private */
    public void i(int i10) {
        throw new UnsupportedOperationException();
    }
}
