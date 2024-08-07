package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.p;
import f0.b0;
import j2.r;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import n0.l;

/* compiled from: FloatArrayList */
public final class m extends c<Float> implements RandomAccess, r {

    /* renamed from: b  reason: collision with root package name */
    public float[] f2304b;

    /* renamed from: c  reason: collision with root package name */
    public int f2305c;

    static {
        new m(0, new float[0]).f2231a = false;
    }

    public m() {
        this(0, new float[10]);
    }

    public final void add(int i10, Object obj) {
        int i11;
        float floatValue = ((Float) obj).floatValue();
        g();
        if (i10 < 0 || i10 > (i11 = this.f2305c)) {
            StringBuilder l10 = l.l("Index:", i10, ", Size:");
            l10.append(this.f2305c);
            throw new IndexOutOfBoundsException(l10.toString());
        }
        float[] fArr = this.f2304b;
        if (i11 < fArr.length) {
            System.arraycopy(fArr, i10, fArr, i10 + 1, i11 - i10);
        } else {
            float[] fArr2 = new float[b0.o(i11, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            System.arraycopy(this.f2304b, i10, fArr2, i10 + 1, this.f2305c - i10);
            this.f2304b = fArr2;
        }
        this.f2304b[i10] = floatValue;
        this.f2305c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Float> collection) {
        g();
        Charset charset = p.f2318a;
        collection.getClass();
        if (!(collection instanceof m)) {
            return super.addAll(collection);
        }
        m mVar = (m) collection;
        int i10 = mVar.f2305c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f2305c;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            float[] fArr = this.f2304b;
            if (i12 > fArr.length) {
                this.f2304b = Arrays.copyOf(fArr, i12);
            }
            System.arraycopy(mVar.f2304b, 0, this.f2304b, this.f2305c, mVar.f2305c);
            this.f2305c = i12;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final p.c b(int i10) {
        if (i10 >= this.f2305c) {
            return new m(this.f2305c, Arrays.copyOf(this.f2304b, i10));
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return super.equals(obj);
        }
        m mVar = (m) obj;
        if (this.f2305c != mVar.f2305c) {
            return false;
        }
        float[] fArr = mVar.f2304b;
        for (int i10 = 0; i10 < this.f2305c; i10++) {
            if (Float.floatToIntBits(this.f2304b[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    public final Object get(int i10) {
        l(i10);
        return Float.valueOf(this.f2304b[i10]);
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f2305c; i11++) {
            i10 = (i10 * 31) + Float.floatToIntBits(this.f2304b[i11]);
        }
        return i10;
    }

    public final void i(float f10) {
        g();
        int i10 = this.f2305c;
        float[] fArr = this.f2304b;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[b0.o(i10, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.f2304b = fArr2;
        }
        float[] fArr3 = this.f2304b;
        int i11 = this.f2305c;
        this.f2305c = i11 + 1;
        fArr3[i11] = f10;
    }

    public final void l(int i10) {
        if (i10 < 0 || i10 >= this.f2305c) {
            StringBuilder l10 = l.l("Index:", i10, ", Size:");
            l10.append(this.f2305c);
            throw new IndexOutOfBoundsException(l10.toString());
        }
    }

    public final boolean remove(Object obj) {
        g();
        for (int i10 = 0; i10 < this.f2305c; i10++) {
            if (obj.equals(Float.valueOf(this.f2304b[i10]))) {
                float[] fArr = this.f2304b;
                System.arraycopy(fArr, i10 + 1, fArr, i10, (this.f2305c - i10) - 1);
                this.f2305c--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    public final void removeRange(int i10, int i11) {
        g();
        if (i11 >= i10) {
            float[] fArr = this.f2304b;
            System.arraycopy(fArr, i11, fArr, i10, this.f2305c - i11);
            this.f2305c -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final Object set(int i10, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        g();
        l(i10);
        float[] fArr = this.f2304b;
        float f10 = fArr[i10];
        fArr[i10] = floatValue;
        return Float.valueOf(f10);
    }

    public final int size() {
        return this.f2305c;
    }

    public m(int i10, float[] fArr) {
        this.f2304b = fArr;
        this.f2305c = i10;
    }

    public final Object remove(int i10) {
        g();
        l(i10);
        float[] fArr = this.f2304b;
        float f10 = fArr[i10];
        int i11 = this.f2305c;
        if (i10 < i11 - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (i11 - i10) - 1);
        }
        this.f2305c--;
        this.modCount++;
        return Float.valueOf(f10);
    }

    public final boolean add(Object obj) {
        i(((Float) obj).floatValue());
        return true;
    }
}
