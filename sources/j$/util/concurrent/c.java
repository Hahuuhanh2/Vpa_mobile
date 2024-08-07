package j$.util.concurrent;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

abstract class c implements Collection, Serializable {
    private static final long serialVersionUID = 7249069246763182397L;

    /* renamed from: a  reason: collision with root package name */
    final ConcurrentHashMap f18419a;

    c(ConcurrentHashMap concurrentHashMap) {
        this.f18419a = concurrentHashMap;
    }

    public final void clear() {
        this.f18419a.clear();
    }

    public abstract boolean contains(Object obj);

    /* JADX WARNING: Removed duplicated region for block: B:4:0x000c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean containsAll(java.util.Collection r2) {
        /*
            r1 = this;
            if (r2 == r1) goto L_0x001a
            java.util.Iterator r2 = r2.iterator()
        L_0x0006:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x001a
            java.lang.Object r0 = r2.next()
            if (r0 == 0) goto L_0x0018
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0006
        L_0x0018:
            r2 = 0
            return r2
        L_0x001a:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.c.containsAll(java.util.Collection):boolean");
    }

    public final boolean isEmpty() {
        return this.f18419a.isEmpty();
    }

    public abstract Iterator iterator();

    public final boolean removeAll(Collection collection) {
        collection.getClass();
        boolean z10 = false;
        Iterator it = iterator();
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    public final boolean retainAll(Collection collection) {
        collection.getClass();
        boolean z10 = false;
        Iterator it = iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    public final int size() {
        return this.f18419a.size();
    }

    public final Object[] toArray() {
        long l10 = this.f18419a.l();
        if (l10 < 0) {
            l10 = 0;
        }
        if (l10 <= 2147483639) {
            int i10 = (int) l10;
            Object[] objArr = new Object[i10];
            int i11 = 0;
            Iterator it = iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (i11 == i10) {
                    int i12 = 2147483639;
                    if (i10 < 2147483639) {
                        if (i10 < 1073741819) {
                            i12 = (i10 >>> 1) + 1 + i10;
                        }
                        objArr = Arrays.copyOf(objArr, i12);
                        i10 = i12;
                    } else {
                        throw new OutOfMemoryError("Required array size too large");
                    }
                }
                objArr[i11] = next;
                i11++;
            }
            return i11 == i10 ? objArr : Arrays.copyOf(objArr, i11);
        }
        throw new OutOfMemoryError("Required array size too large");
    }

    public final Object[] toArray(Object[] objArr) {
        long l10 = this.f18419a.l();
        if (l10 < 0) {
            l10 = 0;
        }
        if (l10 <= 2147483639) {
            int i10 = (int) l10;
            Object[] objArr2 = objArr.length >= i10 ? objArr : (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i10);
            int length = objArr2.length;
            int i11 = 0;
            Iterator it = iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (i11 == length) {
                    int i12 = 2147483639;
                    if (length < 2147483639) {
                        if (length < 1073741819) {
                            i12 = (length >>> 1) + 1 + length;
                        }
                        objArr2 = Arrays.copyOf(objArr2, i12);
                        length = i12;
                    } else {
                        throw new OutOfMemoryError("Required array size too large");
                    }
                }
                objArr2[i11] = next;
                i11++;
            }
            if (objArr != objArr2 || i11 >= length) {
                return i11 == length ? objArr2 : Arrays.copyOf(objArr2, i11);
            }
            objArr2[i11] = null;
            return objArr2;
        }
        throw new OutOfMemoryError("Required array size too large");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        Iterator it = iterator();
        if (it.hasNext()) {
            while (true) {
                Object next = it.next();
                if (next == this) {
                    next = "(this Collection)";
                }
                sb2.append(next);
                if (!it.hasNext()) {
                    break;
                }
                sb2.append(',');
                sb2.append(' ');
            }
        }
        sb2.append(']');
        return sb2.toString();
    }
}
