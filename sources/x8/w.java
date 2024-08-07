package x8;

import com.google.crypto.tink.shaded.protobuf.x;
import i9.a0;
import j9.c;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;
import w8.a;
import w8.d;
import w8.f;
import w8.q;

/* compiled from: KmsEnvelopeAead */
public final class w implements a {

    /* renamed from: c  reason: collision with root package name */
    public static final byte[] f17159c = new byte[0];

    /* renamed from: a  reason: collision with root package name */
    public final a0 f17160a;

    /* renamed from: b  reason: collision with root package name */
    public final a f17161b;

    public w(a0 a0Var, a aVar) {
        this.f17160a = a0Var;
        this.f17161b = aVar;
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        x a10;
        a0 a0Var = this.f17160a;
        AtomicReference<f> atomicReference = q.f16745a;
        synchronized (q.class) {
            d b10 = q.f16745a.get().a(a0Var.J()).b();
            if (((Boolean) q.f16747c.get(a0Var.J())).booleanValue()) {
                a10 = b10.a(a0Var.K());
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type " + a0Var.J());
            }
        }
        byte[] k10 = a10.k();
        byte[] a11 = this.f17161b.a(k10, f17159c);
        c.f fVar = c.f11735b;
        byte[] a12 = ((a) q.c(this.f17160a.J(), c.l(k10, 0, k10.length), a.class)).a(bArr, bArr2);
        return ByteBuffer.allocate(a11.length + 4 + a12.length).putInt(a11.length).put(a11).put(a12).array();
    }

    public final byte[] b(byte[] bArr, byte[] bArr2) {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int i10 = wrap.getInt();
            if (i10 <= 0 || i10 > bArr.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr3 = new byte[i10];
            wrap.get(bArr3, 0, i10);
            byte[] bArr4 = new byte[wrap.remaining()];
            wrap.get(bArr4, 0, wrap.remaining());
            byte[] b10 = this.f17161b.b(bArr3, f17159c);
            String J = this.f17160a.J();
            AtomicReference<f> atomicReference = q.f16745a;
            c.f fVar = c.f11735b;
            return ((a) q.c(J, c.l(b10, 0, b10.length), a.class)).b(bArr4, bArr2);
        } catch (IndexOutOfBoundsException e10) {
            e = e10;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (BufferUnderflowException e11) {
            e = e11;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (NegativeArraySizeException e12) {
            e = e12;
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }
}
