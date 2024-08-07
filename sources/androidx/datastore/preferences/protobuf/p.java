package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.e;
import androidx.datastore.preferences.protobuf.n;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: Internal */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f2318a = Charset.forName("UTF-8");

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f2319b;

    /* compiled from: Internal */
    public interface a {
        int a();
    }

    /* compiled from: Internal */
    public interface b {
        boolean a();
    }

    /* compiled from: Internal */
    public interface c<E> extends List<E>, RandomAccess {
        void a();

        c<E> b(int i10);

        boolean f();
    }

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f2319b = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new e.a(bArr, 0, 0, false).e(0);
        } catch (InvalidProtocolBufferException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static int a(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    public static n b(Object obj, Object obj2) {
        n.a a10 = ((z) obj).a();
        z zVar = (z) obj2;
        a10.getClass();
        if (a10.f2306a.getClass().isInstance(zVar)) {
            a10.m();
            n.a.n(a10.f2307b, (n) ((a) zVar));
            return a10.l();
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
