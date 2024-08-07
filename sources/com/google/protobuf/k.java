package com.google.protobuf;

import com.google.protobuf.d;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: Internal */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f7917a = Charset.forName("UTF-8");

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f7918b;

    /* compiled from: Internal */
    public interface a {
        int a();
    }

    /* compiled from: Internal */
    public interface b extends c<Integer> {
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
        f7918b = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new d.a(bArr, 0, 0, false).a(0);
        } catch (InvalidProtocolBufferException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static int a(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }
}
