package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.CodedOutputStream;
import com.google.crypto.tink.shaded.protobuf.a;
import com.google.crypto.tink.shaded.protobuf.a.C0068a;
import com.google.crypto.tink.shaded.protobuf.x;
import j9.c;
import java.io.IOException;
import java.util.logging.Logger;

/* compiled from: AbstractMessageLite */
public abstract class a<MessageType extends a<MessageType, BuilderType>, BuilderType extends C0068a<MessageType, BuilderType>> implements x {
    public int memoizedHashCode = 0;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.a$a  reason: collision with other inner class name */
    /* compiled from: AbstractMessageLite */
    public static abstract class C0068a<MessageType extends a<MessageType, BuilderType>, BuilderType extends C0068a<MessageType, BuilderType>> implements x.a {
    }

    private String i(String str) {
        StringBuilder q10 = android.support.v4.media.a.q("Serializing ");
        q10.append(getClass().getName());
        q10.append(" to a ");
        q10.append(str);
        q10.append(" threw an IOException (should never happen).");
        return q10.toString();
    }

    public final c.f b() {
        try {
            int h10 = ((n) this).h((c0) null);
            c.f fVar = c.f11735b;
            byte[] bArr = new byte[h10];
            Logger logger = CodedOutputStream.f7318c;
            CodedOutputStream.a aVar = new CodedOutputStream.a(bArr, h10);
            ((n) this).j(aVar);
            if (aVar.y0() == 0) {
                return new c.f(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e10) {
            throw new RuntimeException(i("ByteString"), e10);
        }
    }

    /* access modifiers changed from: package-private */
    public int d() {
        throw new UnsupportedOperationException();
    }

    public int h(c0 c0Var) {
        int d10 = d();
        if (d10 != -1) {
            return d10;
        }
        int f10 = c0Var.f(this);
        l(f10);
        return f10;
    }

    public final byte[] k() {
        try {
            int h10 = ((n) this).h((c0) null);
            byte[] bArr = new byte[h10];
            Logger logger = CodedOutputStream.f7318c;
            CodedOutputStream.a aVar = new CodedOutputStream.a(bArr, h10);
            ((n) this).j(aVar);
            if (aVar.y0() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e10) {
            throw new RuntimeException(i("byte array"), e10);
        }
    }

    /* access modifiers changed from: package-private */
    public void l(int i10) {
        throw new UnsupportedOperationException();
    }
}
