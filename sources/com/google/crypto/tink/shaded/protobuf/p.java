package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.f;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: Internal */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f7415a = Charset.forName("UTF-8");

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f7416b;

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
        Charset.forName("US-ASCII");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f7416b = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new f.a(bArr, 0, 0, false).g(0);
        } catch (InvalidProtocolBufferException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static int a(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }
}
