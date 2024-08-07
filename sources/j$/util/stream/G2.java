package j$.util.stream;

import j$.util.C0407m;
import j$.util.Spliterator;
import j$.util.Spliterators;
import j$.util.function.Consumer;
import java.util.Comparator;

final class G2 implements Spliterator {

    /* renamed from: a  reason: collision with root package name */
    int f18618a;

    /* renamed from: b  reason: collision with root package name */
    final int f18619b;

    /* renamed from: c  reason: collision with root package name */
    int f18620c;

    /* renamed from: d  reason: collision with root package name */
    final int f18621d;

    /* renamed from: e  reason: collision with root package name */
    Object[] f18622e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ P2 f18623f;

    static {
        Class<P2> cls = P2.class;
    }

    G2(P2 p22, int i10, int i11, int i12, int i13) {
        this.f18623f = p22;
        this.f18618a = i10;
        this.f18619b = i11;
        this.f18620c = i12;
        this.f18621d = i13;
        Object[][] objArr = p22.f18676f;
        this.f18622e = objArr == null ? p22.f18675e : objArr[i10];
    }

    public final boolean a(Consumer consumer) {
        consumer.getClass();
        int i10 = this.f18618a;
        int i11 = this.f18619b;
        if (i10 >= i11 && (i10 != i11 || this.f18620c >= this.f18621d)) {
            return false;
        }
        Object[] objArr = this.f18622e;
        int i12 = this.f18620c;
        this.f18620c = i12 + 1;
        consumer.accept(objArr[i12]);
        if (this.f18620c == this.f18622e.length) {
            this.f18620c = 0;
            int i13 = this.f18618a + 1;
            this.f18618a = i13;
            Object[][] objArr2 = this.f18623f.f18676f;
            if (objArr2 != null && i13 <= this.f18619b) {
                this.f18622e = objArr2[i13];
            }
        }
        return true;
    }

    public final int characteristics() {
        return 16464;
    }

    public final long estimateSize() {
        int i10 = this.f18618a;
        int i11 = this.f18619b;
        if (i10 == i11) {
            return ((long) this.f18621d) - ((long) this.f18620c);
        }
        long[] jArr = this.f18623f.f18778d;
        return ((jArr[i11] + ((long) this.f18621d)) - jArr[i10]) - ((long) this.f18620c);
    }

    public final void forEachRemaining(Consumer consumer) {
        int i10;
        consumer.getClass();
        int i11 = this.f18618a;
        int i12 = this.f18619b;
        if (i11 < i12 || (i11 == i12 && this.f18620c < this.f18621d)) {
            int i13 = this.f18620c;
            while (true) {
                i10 = this.f18619b;
                if (i11 >= i10) {
                    break;
                }
                Object[] objArr = this.f18623f.f18676f[i11];
                while (i13 < objArr.length) {
                    consumer.accept(objArr[i13]);
                    i13++;
                }
                i13 = 0;
                i11++;
            }
            Object[] objArr2 = this.f18618a == i10 ? this.f18622e : this.f18623f.f18676f[i10];
            int i14 = this.f18621d;
            while (i13 < i14) {
                consumer.accept(objArr2[i13]);
                i13++;
            }
            this.f18618a = this.f18619b;
            this.f18620c = this.f18621d;
        }
    }

    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    public final /* synthetic */ long getExactSizeIfKnown() {
        return C0407m.i(this);
    }

    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return C0407m.k(this, i10);
    }

    public final Spliterator trySplit() {
        int i10 = this.f18618a;
        int i11 = this.f18619b;
        if (i10 < i11) {
            P2 p22 = this.f18623f;
            int i12 = i11 - 1;
            G2 g2 = new G2(p22, i10, i12, this.f18620c, p22.f18676f[i12].length);
            int i13 = this.f18619b;
            this.f18618a = i13;
            this.f18620c = 0;
            this.f18622e = this.f18623f.f18676f[i13];
            return g2;
        } else if (i10 != i11) {
            return null;
        } else {
            int i14 = this.f18621d;
            int i15 = this.f18620c;
            int i16 = (i14 - i15) / 2;
            if (i16 == 0) {
                return null;
            }
            Spliterator m10 = Spliterators.m(this.f18622e, i15, i15 + i16);
            this.f18620c += i16;
            return m10;
        }
    }
}
