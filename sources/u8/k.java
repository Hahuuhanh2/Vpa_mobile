package u8;

import java.util.AbstractMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: RegularImmutableMap */
public final class k<K, V> extends e<K, V> {

    /* renamed from: n  reason: collision with root package name */
    public static final k f15377n = new k((Object) null, new Object[0], 0);

    /* renamed from: d  reason: collision with root package name */
    public final transient Object f15378d;

    /* renamed from: e  reason: collision with root package name */
    public final transient Object[] f15379e;

    /* renamed from: f  reason: collision with root package name */
    public final transient int f15380f;

    /* compiled from: RegularImmutableMap */
    public static class a<K, V> extends f<Map.Entry<K, V>> {

        /* renamed from: d  reason: collision with root package name */
        public final transient e<K, V> f15381d;

        /* renamed from: e  reason: collision with root package name */
        public final transient Object[] f15382e;

        /* renamed from: f  reason: collision with root package name */
        public final transient int f15383f = 0;

        /* renamed from: n  reason: collision with root package name */
        public final transient int f15384n;

        /* renamed from: u8.k$a$a  reason: collision with other inner class name */
        /* compiled from: RegularImmutableMap */
        public class C0207a extends d<Map.Entry<K, V>> {
            public C0207a() {
            }

            public final Object get(int i10) {
                m9.b.h(i10, a.this.f15384n);
                a aVar = a.this;
                int i11 = i10 * 2;
                Object obj = aVar.f15382e[aVar.f15383f + i11];
                Objects.requireNonNull(obj);
                a aVar2 = a.this;
                Object obj2 = aVar2.f15382e[i11 + (aVar2.f15383f ^ 1)];
                Objects.requireNonNull(obj2);
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }

            public final int size() {
                return a.this.f15384n;
            }
        }

        public a(e eVar, Object[] objArr, int i10) {
            this.f15381d = eVar;
            this.f15382e = objArr;
            this.f15384n = i10;
        }

        public final boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null || !value.equals(this.f15381d.get(key))) {
                return false;
            }
            return true;
        }

        public final int g(Object[] objArr) {
            return o().g(objArr);
        }

        /* renamed from: n */
        public final n<Map.Entry<K, V>> iterator() {
            return o().listIterator(0);
        }

        public final d<Map.Entry<K, V>> r() {
            return new C0207a();
        }

        public final int size() {
            return this.f15384n;
        }
    }

    /* compiled from: RegularImmutableMap */
    public static final class b<K> extends f<K> {

        /* renamed from: d  reason: collision with root package name */
        public final transient e<K, ?> f15386d;

        /* renamed from: e  reason: collision with root package name */
        public final transient d<K> f15387e;

        public b(e eVar, c cVar) {
            this.f15386d = eVar;
            this.f15387e = cVar;
        }

        public final boolean contains(Object obj) {
            if (this.f15386d.get(obj) != null) {
                return true;
            }
            return false;
        }

        public final int g(Object[] objArr) {
            return this.f15387e.g(objArr);
        }

        /* renamed from: n */
        public final n<K> iterator() {
            return this.f15387e.listIterator(0);
        }

        public final d<K> o() {
            throw null;
        }

        public final int size() {
            return ((k) this.f15386d).f15380f;
        }
    }

    /* compiled from: RegularImmutableMap */
    public static final class c extends d<Object> {

        /* renamed from: c  reason: collision with root package name */
        public final transient Object[] f15388c;

        /* renamed from: d  reason: collision with root package name */
        public final transient int f15389d;

        /* renamed from: e  reason: collision with root package name */
        public final transient int f15390e;

        public c(Object[] objArr, int i10, int i11) {
            this.f15388c = objArr;
            this.f15389d = i10;
            this.f15390e = i11;
        }

        public final Object get(int i10) {
            m9.b.h(i10, this.f15390e);
            Object obj = this.f15388c[(i10 * 2) + this.f15389d];
            Objects.requireNonNull(obj);
            return obj;
        }

        public final int size() {
            return this.f15390e;
        }
    }

    public k(Object obj, Object[] objArr, int i10) {
        this.f15378d = obj;
        this.f15379e = objArr;
        this.f15380f = i10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x009e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009f A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final V get(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f15378d
            java.lang.Object[] r1 = r9.f15379e
            int r2 = r9.f15380f
            r3 = 0
            if (r10 != 0) goto L_0x000a
            goto L_0x0020
        L_0x000a:
            r4 = 1
            if (r2 != r4) goto L_0x0023
            r0 = 0
            r0 = r1[r0]
            java.util.Objects.requireNonNull(r0)
            boolean r10 = r0.equals(r10)
            if (r10 == 0) goto L_0x0020
            r10 = r1[r4]
            java.util.Objects.requireNonNull(r10)
            goto L_0x009c
        L_0x0020:
            r10 = r3
            goto L_0x009c
        L_0x0023:
            if (r0 != 0) goto L_0x0026
            goto L_0x0020
        L_0x0026:
            boolean r2 = r0 instanceof byte[]
            r5 = -1
            if (r2 == 0) goto L_0x0052
            r2 = r0
            byte[] r2 = (byte[]) r2
            int r0 = r2.length
            int r6 = r0 + -1
            int r0 = r10.hashCode()
            int r0 = m9.b.Y(r0)
        L_0x0039:
            r0 = r0 & r6
            byte r5 = r2[r0]
            r7 = 255(0xff, float:3.57E-43)
            r5 = r5 & r7
            if (r5 != r7) goto L_0x0042
            goto L_0x0020
        L_0x0042:
            r7 = r1[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L_0x004f
            r10 = r5 ^ 1
            r10 = r1[r10]
            goto L_0x009c
        L_0x004f:
            int r0 = r0 + 1
            goto L_0x0039
        L_0x0052:
            boolean r2 = r0 instanceof short[]
            if (r2 == 0) goto L_0x007e
            r2 = r0
            short[] r2 = (short[]) r2
            int r0 = r2.length
            int r6 = r0 + -1
            int r0 = r10.hashCode()
            int r0 = m9.b.Y(r0)
        L_0x0064:
            r0 = r0 & r6
            short r5 = r2[r0]
            r7 = 65535(0xffff, float:9.1834E-41)
            r5 = r5 & r7
            if (r5 != r7) goto L_0x006e
            goto L_0x0020
        L_0x006e:
            r7 = r1[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L_0x007b
            r10 = r5 ^ 1
            r10 = r1[r10]
            goto L_0x009c
        L_0x007b:
            int r0 = r0 + 1
            goto L_0x0064
        L_0x007e:
            int[] r0 = (int[]) r0
            int r2 = r0.length
            int r2 = r2 - r4
            int r6 = r10.hashCode()
            int r6 = m9.b.Y(r6)
        L_0x008a:
            r6 = r6 & r2
            r7 = r0[r6]
            if (r7 != r5) goto L_0x0090
            goto L_0x0020
        L_0x0090:
            r8 = r1[r7]
            boolean r8 = r10.equals(r8)
            if (r8 == 0) goto L_0x00a0
            r10 = r7 ^ 1
            r10 = r1[r10]
        L_0x009c:
            if (r10 != 0) goto L_0x009f
            return r3
        L_0x009f:
            return r10
        L_0x00a0:
            int r6 = r6 + 1
            goto L_0x008a
        */
        throw new UnsupportedOperationException("Method not decompiled: u8.k.get(java.lang.Object):java.lang.Object");
    }

    public final int size() {
        return this.f15380f;
    }
}
