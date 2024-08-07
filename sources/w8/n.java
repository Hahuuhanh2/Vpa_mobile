package w8;

import androidx.fragment.app.o;
import d9.j;
import d9.s;
import i9.c0;
import i9.i0;
import i9.z;
import j$.util.concurrent.ConcurrentHashMap;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PrimitiveSet */
public final class n<P> {

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentMap<c, List<b<P>>> f16729a;

    /* renamed from: b  reason: collision with root package name */
    public b<P> f16730b;

    /* renamed from: c  reason: collision with root package name */
    public final g9.a f16731c;

    /* compiled from: PrimitiveSet */
    public static class a<P> {

        /* renamed from: a  reason: collision with root package name */
        public final Class<P> f16732a;

        /* renamed from: b  reason: collision with root package name */
        public ConcurrentHashMap f16733b = new ConcurrentHashMap();

        /* renamed from: c  reason: collision with root package name */
        public b<P> f16734c;

        /* renamed from: d  reason: collision with root package name */
        public g9.a f16735d;

        public a(Class cls) {
            this.f16732a = cls;
            this.f16735d = g9.a.f10398b;
        }

        public final void a(Object obj, Object obj2, c0.b bVar, boolean z10) {
            byte[] bArr;
            if (this.f16733b == null) {
                throw new IllegalStateException("addPrimitive cannot be called after build");
            } else if (obj == null && obj2 == null) {
                throw new GeneralSecurityException("at least one of the `fullPrimitive` or `primitive` must be set");
            } else if (bVar.L() == z.ENABLED) {
                ConcurrentHashMap concurrentHashMap = this.f16733b;
                Integer valueOf = Integer.valueOf(bVar.J());
                if (bVar.K() == i0.RAW) {
                    valueOf = null;
                }
                o a10 = j.f8789b.a(s.a(bVar.I().J(), bVar.I().K(), bVar.I().I(), bVar.K(), valueOf));
                int ordinal = bVar.K().ordinal();
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal == 3) {
                            bArr = b.f16712a;
                        } else if (ordinal != 4) {
                            throw new GeneralSecurityException("unknown output prefix type");
                        }
                    }
                    bArr = ByteBuffer.allocate(5).put((byte) 0).putInt(bVar.J()).array();
                } else {
                    bArr = ByteBuffer.allocate(5).put((byte) 1).putInt(bVar.J()).array();
                }
                b bVar2 = new b(obj, obj2, bArr, bVar.L(), bVar.K(), bVar.J(), bVar.I().J(), a10);
                ArrayList arrayList = new ArrayList();
                arrayList.add(bVar2);
                c cVar = new c(bVar2.a());
                List list = (List) concurrentHashMap.put(cVar, Collections.unmodifiableList(arrayList));
                if (list != null) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.addAll(list);
                    arrayList2.add(bVar2);
                    concurrentHashMap.put(cVar, Collections.unmodifiableList(arrayList2));
                }
                if (!z10) {
                    return;
                }
                if (this.f16734c == null) {
                    this.f16734c = bVar2;
                    return;
                }
                throw new IllegalStateException("you cannot set two primary primitives");
            } else {
                throw new GeneralSecurityException("only ENABLED key is allowed");
            }
        }
    }

    /* compiled from: PrimitiveSet */
    public static final class b<P> {

        /* renamed from: a  reason: collision with root package name */
        public final P f16736a;

        /* renamed from: b  reason: collision with root package name */
        public final P f16737b;

        /* renamed from: c  reason: collision with root package name */
        public final byte[] f16738c;

        /* renamed from: d  reason: collision with root package name */
        public final z f16739d;

        /* renamed from: e  reason: collision with root package name */
        public final i0 f16740e;

        /* renamed from: f  reason: collision with root package name */
        public final int f16741f;

        /* renamed from: g  reason: collision with root package name */
        public final String f16742g;

        /* renamed from: h  reason: collision with root package name */
        public final o f16743h;

        public b(P p10, P p11, byte[] bArr, z zVar, i0 i0Var, int i10, String str, o oVar) {
            this.f16736a = p10;
            this.f16737b = p11;
            this.f16738c = Arrays.copyOf(bArr, bArr.length);
            this.f16739d = zVar;
            this.f16740e = i0Var;
            this.f16741f = i10;
            this.f16742g = str;
            this.f16743h = oVar;
        }

        public final byte[] a() {
            byte[] bArr = this.f16738c;
            if (bArr == null) {
                return null;
            }
            return Arrays.copyOf(bArr, bArr.length);
        }
    }

    /* compiled from: PrimitiveSet */
    public static class c implements Comparable<c> {

        /* renamed from: a  reason: collision with root package name */
        public final byte[] f16744a;

        public c(byte[] bArr) {
            this.f16744a = Arrays.copyOf(bArr, bArr.length);
        }

        public final int compareTo(Object obj) {
            c cVar = (c) obj;
            byte[] bArr = this.f16744a;
            int length = bArr.length;
            byte[] bArr2 = cVar.f16744a;
            if (length != bArr2.length) {
                return bArr.length - bArr2.length;
            }
            int i10 = 0;
            while (true) {
                byte[] bArr3 = this.f16744a;
                if (i10 >= bArr3.length) {
                    return 0;
                }
                byte b10 = bArr3[i10];
                byte b11 = cVar.f16744a[i10];
                if (b10 != b11) {
                    return b10 - b11;
                }
                i10++;
            }
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            return Arrays.equals(this.f16744a, ((c) obj).f16744a);
        }

        public final int hashCode() {
            return Arrays.hashCode(this.f16744a);
        }

        public final String toString() {
            return m9.b.u(this.f16744a);
        }
    }

    public n(ConcurrentMap concurrentMap, b bVar, g9.a aVar, Class cls) {
        this.f16729a = concurrentMap;
        this.f16730b = bVar;
        this.f16731c = aVar;
    }

    public final List<b<P>> a(byte[] bArr) {
        List<b<P>> list = this.f16729a.get(new c(bArr));
        if (list != null) {
            return list;
        }
        return Collections.emptyList();
    }
}
