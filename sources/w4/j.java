package w4;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import o5.i;
import o5.l;
import p5.a;
import p5.d;
import s4.e;

/* compiled from: SafeKeyGenerator */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final i<e, String> f16483a = new i<>(1000);

    /* renamed from: b  reason: collision with root package name */
    public final a.c f16484b = p5.a.a(10, new a());

    /* compiled from: SafeKeyGenerator */
    public class a implements a.b<b> {
        public final Object a() {
            try {
                return new b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* compiled from: SafeKeyGenerator */
    public static final class b implements a.d {

        /* renamed from: a  reason: collision with root package name */
        public final MessageDigest f16485a;

        /* renamed from: b  reason: collision with root package name */
        public final d.a f16486b = new d.a();

        public b(MessageDigest messageDigest) {
            this.f16485a = messageDigest;
        }

        public final d.a j() {
            return this.f16486b;
        }
    }

    public final String a(e eVar) {
        String a10;
        synchronized (this.f16483a) {
            a10 = this.f16483a.a(eVar);
        }
        if (a10 == null) {
            Object b10 = this.f16484b.b();
            j7.a.r(b10);
            b bVar = (b) b10;
            try {
                eVar.a(bVar.f16485a);
                byte[] digest = bVar.f16485a.digest();
                char[] cArr = l.f13755b;
                synchronized (cArr) {
                    for (int i10 = 0; i10 < digest.length; i10++) {
                        byte b11 = digest[i10] & 255;
                        int i11 = i10 * 2;
                        char[] cArr2 = l.f13754a;
                        cArr[i11] = cArr2[b11 >>> 4];
                        cArr[i11 + 1] = cArr2[b11 & 15];
                    }
                    a10 = new String(cArr);
                }
                this.f16484b.a(bVar);
            } catch (Throwable th2) {
                this.f16484b.a(bVar);
                throw th2;
            }
        }
        synchronized (this.f16483a) {
            this.f16483a.d(eVar, a10);
        }
        return a10;
    }
}
