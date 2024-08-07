package j$.util.stream;

import j$.time.b;
import j$.util.Spliterator;
import j$.util.Spliterators;
import j$.util.function.Consumer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

class P2 extends C0433e implements Consumer, Iterable {

    /* renamed from: e  reason: collision with root package name */
    protected Object[] f18675e = new Object[(1 << 4)];

    /* renamed from: f  reason: collision with root package name */
    protected Object[][] f18676f;

    P2() {
    }

    public void accept(Object obj) {
        long j10;
        int i10 = this.f18776b;
        Object[] objArr = this.f18675e;
        if (i10 == objArr.length) {
            if (this.f18676f == null) {
                Object[][] objArr2 = new Object[8][];
                this.f18676f = objArr2;
                this.f18778d = new long[8];
                objArr2[0] = objArr;
            }
            int i11 = this.f18777c;
            int i12 = i11 + 1;
            Object[][] objArr3 = this.f18676f;
            if (i12 >= objArr3.length || objArr3[i12] == null) {
                if (i11 == 0) {
                    j10 = (long) objArr.length;
                } else {
                    j10 = ((long) objArr3[i11].length) + this.f18778d[i11];
                }
                r(j10 + 1);
            }
            this.f18776b = 0;
            int i13 = this.f18777c + 1;
            this.f18777c = i13;
            this.f18675e = this.f18676f[i13];
        }
        Object[] objArr4 = this.f18675e;
        int i14 = this.f18776b;
        this.f18776b = i14 + 1;
        objArr4[i14] = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    public final void clear() {
        Object[][] objArr = this.f18676f;
        if (objArr != null) {
            this.f18675e = objArr[0];
            int i10 = 0;
            while (true) {
                Object[] objArr2 = this.f18675e;
                if (i10 >= objArr2.length) {
                    break;
                }
                objArr2[i10] = null;
                i10++;
            }
            this.f18676f = null;
            this.f18778d = null;
        } else {
            for (int i11 = 0; i11 < this.f18776b; i11++) {
                this.f18675e[i11] = null;
            }
        }
        this.f18776b = 0;
        this.f18777c = 0;
    }

    public void forEach(Consumer consumer) {
        for (int i10 = 0; i10 < this.f18777c; i10++) {
            for (Object accept : this.f18676f[i10]) {
                consumer.accept(accept);
            }
        }
        for (int i11 = 0; i11 < this.f18776b; i11++) {
            consumer.accept(this.f18675e[i11]);
        }
    }

    public final /* synthetic */ void forEach(java.util.function.Consumer consumer) {
        forEach(Consumer.VivifiedWrapper.convert(consumer));
    }

    public final Iterator iterator() {
        return Spliterators.i(spliterator());
    }

    /* access modifiers changed from: protected */
    public final void r(long j10) {
        int i10 = this.f18777c;
        long length = i10 == 0 ? (long) this.f18675e.length : ((long) this.f18676f[i10].length) + this.f18778d[i10];
        if (j10 > length) {
            if (this.f18676f == null) {
                Object[][] objArr = new Object[8][];
                this.f18676f = objArr;
                this.f18778d = new long[8];
                objArr[0] = this.f18675e;
            }
            while (true) {
                i10++;
                if (j10 > length) {
                    Object[][] objArr2 = this.f18676f;
                    if (i10 >= objArr2.length) {
                        int length2 = objArr2.length * 2;
                        this.f18676f = (Object[][]) Arrays.copyOf(objArr2, length2);
                        this.f18778d = Arrays.copyOf(this.f18778d, length2);
                    }
                    int min = 1 << ((i10 == 0 || i10 == 1) ? this.f18775a : Math.min((this.f18775a + i10) - 1, 30));
                    Object[][] objArr3 = this.f18676f;
                    objArr3[i10] = new Object[min];
                    long[] jArr = this.f18778d;
                    int i11 = i10 - 1;
                    jArr[i10] = jArr[i11] + ((long) objArr3[i11].length);
                    length += (long) min;
                } else {
                    return;
                }
            }
        }
    }

    public Spliterator spliterator() {
        return new G2(this, 0, this.f18777c, 0, this.f18776b);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        forEach((Consumer) new C0413a(8, arrayList));
        StringBuilder b10 = b.b("SpinedBuffer:");
        b10.append(arrayList.toString());
        return b10.toString();
    }
}
