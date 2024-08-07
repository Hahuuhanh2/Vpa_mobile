package fk;

import f0.b0;
import j7.a;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import sk.j;

/* compiled from: ArrayDeque.kt */
public final class g<E> extends d<E> {

    /* renamed from: d  reason: collision with root package name */
    public static final Object[] f20206d = new Object[0];

    /* renamed from: a  reason: collision with root package name */
    public int f20207a;

    /* renamed from: b  reason: collision with root package name */
    public Object[] f20208b = f20206d;

    /* renamed from: c  reason: collision with root package name */
    public int f20209c;

    public final void add(int i10, E e10) {
        int i11 = this.f20209c;
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(b0.p("index: ", i10, ", size: ", i11));
        } else if (i10 == i11) {
            addLast(e10);
        } else if (i10 == 0) {
            m(i11 + 1);
            int i12 = this.f20207a;
            if (i12 == 0) {
                Object[] objArr = this.f20208b;
                j.f(objArr, "<this>");
                i12 = objArr.length;
            }
            int i13 = i12 - 1;
            this.f20207a = i13;
            this.f20208b[i13] = e10;
            this.f20209c++;
        } else {
            m(i11 + 1);
            int o10 = o(this.f20207a + i10);
            int i14 = this.f20209c;
            if (i10 < ((i14 + 1) >> 1)) {
                if (o10 == 0) {
                    Object[] objArr2 = this.f20208b;
                    j.f(objArr2, "<this>");
                    o10 = objArr2.length;
                }
                int i15 = o10 - 1;
                int i16 = this.f20207a;
                if (i16 == 0) {
                    Object[] objArr3 = this.f20208b;
                    j.f(objArr3, "<this>");
                    i16 = objArr3.length;
                }
                int i17 = i16 - 1;
                int i18 = this.f20207a;
                if (i15 >= i18) {
                    Object[] objArr4 = this.f20208b;
                    objArr4[i17] = objArr4[i18];
                    h.m0(i18, i18 + 1, i15 + 1, objArr4, objArr4);
                } else {
                    Object[] objArr5 = this.f20208b;
                    h.m0(i18 - 1, i18, objArr5.length, objArr5, objArr5);
                    Object[] objArr6 = this.f20208b;
                    objArr6[objArr6.length - 1] = objArr6[0];
                    h.m0(0, 1, i15 + 1, objArr6, objArr6);
                }
                this.f20208b[i15] = e10;
                this.f20207a = i17;
            } else {
                int o11 = o(i14 + this.f20207a);
                if (o10 < o11) {
                    Object[] objArr7 = this.f20208b;
                    h.m0(o10 + 1, o10, o11, objArr7, objArr7);
                } else {
                    Object[] objArr8 = this.f20208b;
                    h.m0(1, 0, o11, objArr8, objArr8);
                    Object[] objArr9 = this.f20208b;
                    objArr9[0] = objArr9[objArr9.length - 1];
                    h.m0(o10 + 1, o10, objArr9.length - 1, objArr9, objArr9);
                }
                this.f20208b[o10] = e10;
            }
            this.f20209c++;
        }
    }

    public final boolean addAll(int i10, Collection<? extends E> collection) {
        j.f(collection, "elements");
        int i11 = this.f20209c;
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(b0.p("index: ", i10, ", size: ", i11));
        } else if (collection.isEmpty()) {
            return false;
        } else {
            int i12 = this.f20209c;
            if (i10 == i12) {
                return addAll(collection);
            }
            m(collection.size() + i12);
            int o10 = o(this.f20209c + this.f20207a);
            int o11 = o(this.f20207a + i10);
            int size = collection.size();
            if (i10 < ((this.f20209c + 1) >> 1)) {
                int i13 = this.f20207a;
                int i14 = i13 - size;
                if (o11 < i13) {
                    Object[] objArr = this.f20208b;
                    h.m0(i14, i13, objArr.length, objArr, objArr);
                    if (size >= o11) {
                        Object[] objArr2 = this.f20208b;
                        h.m0(objArr2.length - size, 0, o11, objArr2, objArr2);
                    } else {
                        Object[] objArr3 = this.f20208b;
                        h.m0(objArr3.length - size, 0, size, objArr3, objArr3);
                        Object[] objArr4 = this.f20208b;
                        h.m0(0, size, o11, objArr4, objArr4);
                    }
                } else if (i14 >= 0) {
                    Object[] objArr5 = this.f20208b;
                    h.m0(i14, i13, o11, objArr5, objArr5);
                } else {
                    Object[] objArr6 = this.f20208b;
                    i14 += objArr6.length;
                    int i15 = o11 - i13;
                    int length = objArr6.length - i14;
                    if (length >= i15) {
                        h.m0(i14, i13, o11, objArr6, objArr6);
                    } else {
                        h.m0(i14, i13, i13 + length, objArr6, objArr6);
                        Object[] objArr7 = this.f20208b;
                        h.m0(0, this.f20207a + length, o11, objArr7, objArr7);
                    }
                }
                this.f20207a = i14;
                int i16 = o11 - size;
                if (i16 < 0) {
                    i16 += this.f20208b.length;
                }
                l(i16, collection);
            } else {
                int i17 = o11 + size;
                if (o11 < o10) {
                    int i18 = size + o10;
                    Object[] objArr8 = this.f20208b;
                    if (i18 <= objArr8.length) {
                        h.m0(i17, o11, o10, objArr8, objArr8);
                    } else if (i17 >= objArr8.length) {
                        h.m0(i17 - objArr8.length, o11, o10, objArr8, objArr8);
                    } else {
                        int length2 = o10 - (i18 - objArr8.length);
                        h.m0(0, length2, o10, objArr8, objArr8);
                        Object[] objArr9 = this.f20208b;
                        h.m0(i17, o11, length2, objArr9, objArr9);
                    }
                } else {
                    Object[] objArr10 = this.f20208b;
                    h.m0(size, 0, o10, objArr10, objArr10);
                    Object[] objArr11 = this.f20208b;
                    if (i17 >= objArr11.length) {
                        h.m0(i17 - objArr11.length, o11, objArr11.length, objArr11, objArr11);
                    } else {
                        h.m0(0, objArr11.length - size, objArr11.length, objArr11, objArr11);
                        Object[] objArr12 = this.f20208b;
                        h.m0(i17, o11, objArr12.length - size, objArr12, objArr12);
                    }
                }
                l(o11, collection);
            }
            return true;
        }
    }

    public final void addLast(E e10) {
        m(g() + 1);
        this.f20208b[o(g() + this.f20207a)] = e10;
        this.f20209c = g() + 1;
    }

    public final void clear() {
        int o10 = o(this.f20209c + this.f20207a);
        int i10 = this.f20207a;
        if (i10 < o10) {
            h.p0(this.f20208b, i10, o10);
        } else if (!isEmpty()) {
            Object[] objArr = this.f20208b;
            h.p0(objArr, this.f20207a, objArr.length);
            h.p0(this.f20208b, 0, o10);
        }
        this.f20207a = 0;
        this.f20209c = 0;
    }

    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    public final int g() {
        return this.f20209c;
    }

    public final E get(int i10) {
        int g2 = g();
        if (i10 >= 0 && i10 < g2) {
            return this.f20208b[o(this.f20207a + i10)];
        }
        throw new IndexOutOfBoundsException(b0.p("index: ", i10, ", size: ", g2));
    }

    public final E i(int i10) {
        int i11 = this.f20209c;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(b0.p("index: ", i10, ", size: ", i11));
        } else if (i10 == a.I(this)) {
            if (!isEmpty()) {
                int o10 = o(a.I(this) + this.f20207a);
                E[] eArr = this.f20208b;
                E e10 = eArr[o10];
                eArr[o10] = null;
                this.f20209c--;
                return e10;
            }
            throw new NoSuchElementException("ArrayDeque is empty.");
        } else if (i10 == 0) {
            return removeFirst();
        } else {
            int o11 = o(this.f20207a + i10);
            E[] eArr2 = this.f20208b;
            E e11 = eArr2[o11];
            if (i10 < (this.f20209c >> 1)) {
                int i12 = this.f20207a;
                if (o11 >= i12) {
                    h.m0(i12 + 1, i12, o11, eArr2, eArr2);
                } else {
                    h.m0(1, 0, o11, eArr2, eArr2);
                    Object[] objArr = this.f20208b;
                    objArr[0] = objArr[objArr.length - 1];
                    int i13 = this.f20207a;
                    h.m0(i13 + 1, i13, objArr.length - 1, objArr, objArr);
                }
                Object[] objArr2 = this.f20208b;
                int i14 = this.f20207a;
                objArr2[i14] = null;
                this.f20207a = n(i14);
            } else {
                int o12 = o(a.I(this) + this.f20207a);
                if (o11 <= o12) {
                    Object[] objArr3 = this.f20208b;
                    h.m0(o11, o11 + 1, o12 + 1, objArr3, objArr3);
                } else {
                    Object[] objArr4 = this.f20208b;
                    h.m0(o11, o11 + 1, objArr4.length, objArr4, objArr4);
                    Object[] objArr5 = this.f20208b;
                    objArr5[objArr5.length - 1] = objArr5[0];
                    h.m0(0, 1, o12 + 1, objArr5, objArr5);
                }
                this.f20208b[o12] = null;
            }
            this.f20209c--;
            return e11;
        }
    }

    public final int indexOf(Object obj) {
        int i10;
        int o10 = o(g() + this.f20207a);
        int i11 = this.f20207a;
        if (i11 < o10) {
            while (i11 < o10) {
                if (j.a(obj, this.f20208b[i11])) {
                    i10 = this.f20207a;
                } else {
                    i11++;
                }
            }
            return -1;
        } else if (i11 < o10) {
            return -1;
        } else {
            int length = this.f20208b.length;
            while (true) {
                if (i11 >= length) {
                    int i12 = 0;
                    while (i12 < o10) {
                        if (j.a(obj, this.f20208b[i12])) {
                            i11 = i12 + this.f20208b.length;
                            i10 = this.f20207a;
                        } else {
                            i12++;
                        }
                    }
                    return -1;
                } else if (j.a(obj, this.f20208b[i11])) {
                    i10 = this.f20207a;
                    break;
                } else {
                    i11++;
                }
            }
        }
        return i11 - i10;
    }

    public final boolean isEmpty() {
        if (g() == 0) {
            return true;
        }
        return false;
    }

    public final void l(int i10, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.f20208b.length;
        while (i10 < length && it.hasNext()) {
            this.f20208b[i10] = it.next();
            i10++;
        }
        int i11 = this.f20207a;
        for (int i12 = 0; i12 < i11 && it.hasNext(); i12++) {
            this.f20208b[i12] = it.next();
        }
        this.f20209c = collection.size() + g();
    }

    public final int lastIndexOf(Object obj) {
        int i10;
        int i11;
        int o10 = o(this.f20209c + this.f20207a);
        int i12 = this.f20207a;
        if (i12 < o10) {
            i11 = o10 - 1;
            if (i12 <= i11) {
                while (!j.a(obj, this.f20208b[i11])) {
                    if (i11 != i12) {
                        i11--;
                    }
                }
                i10 = this.f20207a;
            }
            return -1;
        }
        if (i12 > o10) {
            int i13 = o10 - 1;
            while (true) {
                if (-1 >= i13) {
                    Object[] objArr = this.f20208b;
                    j.f(objArr, "<this>");
                    int length = objArr.length - 1;
                    int i14 = this.f20207a;
                    if (i14 <= length) {
                        while (!j.a(obj, this.f20208b[i11])) {
                            if (i11 != i14) {
                                length = i11 - 1;
                            }
                        }
                        i10 = this.f20207a;
                    }
                } else if (j.a(obj, this.f20208b[i13])) {
                    i11 = i13 + this.f20208b.length;
                    i10 = this.f20207a;
                    break;
                } else {
                    i13--;
                }
            }
        }
        return -1;
        return i11 - i10;
    }

    public final void m(int i10) {
        if (i10 >= 0) {
            Object[] objArr = this.f20208b;
            if (i10 > objArr.length) {
                if (objArr == f20206d) {
                    if (i10 < 10) {
                        i10 = 10;
                    }
                    this.f20208b = new Object[i10];
                    return;
                }
                int length = objArr.length;
                int i11 = length + (length >> 1);
                if (i11 - i10 < 0) {
                    i11 = i10;
                }
                if (i11 - 2147483639 > 0) {
                    if (i10 > 2147483639) {
                        i11 = Integer.MAX_VALUE;
                    } else {
                        i11 = 2147483639;
                    }
                }
                Object[] objArr2 = new Object[i11];
                h.m0(0, this.f20207a, objArr.length, objArr, objArr2);
                Object[] objArr3 = this.f20208b;
                int length2 = objArr3.length;
                int i12 = this.f20207a;
                h.m0(length2 - i12, 0, i12, objArr3, objArr2);
                this.f20207a = 0;
                this.f20208b = objArr2;
                return;
            }
            return;
        }
        throw new IllegalStateException("Deque is too big.");
    }

    public final int n(int i10) {
        Object[] objArr = this.f20208b;
        j.f(objArr, "<this>");
        if (i10 == objArr.length - 1) {
            return 0;
        }
        return i10 + 1;
    }

    public final int o(int i10) {
        Object[] objArr = this.f20208b;
        if (i10 >= objArr.length) {
            return i10 - objArr.length;
        }
        return i10;
    }

    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        i(indexOf);
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [int] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean removeAll(java.util.Collection<? extends java.lang.Object> r12) {
        /*
            r11 = this;
            java.lang.String r0 = "elements"
            sk.j.f(r12, r0)
            boolean r0 = r11.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x0096
            java.lang.Object[] r0 = r11.f20208b
            int r0 = r0.length
            r2 = 1
            if (r0 != 0) goto L_0x0014
            r0 = r2
            goto L_0x0015
        L_0x0014:
            r0 = r1
        L_0x0015:
            if (r0 == 0) goto L_0x0019
            goto L_0x0096
        L_0x0019:
            int r0 = r11.f20207a
            int r3 = r11.f20209c
            int r3 = r3 + r0
            int r0 = r11.o(r3)
            int r3 = r11.f20207a
            r4 = 0
            if (r3 >= r0) goto L_0x0047
            r4 = r3
        L_0x0028:
            if (r3 >= r0) goto L_0x0041
            java.lang.Object[] r5 = r11.f20208b
            r5 = r5[r3]
            boolean r6 = r12.contains(r5)
            r6 = r6 ^ r2
            if (r6 == 0) goto L_0x003d
            java.lang.Object[] r6 = r11.f20208b
            int r7 = r4 + 1
            r6[r4] = r5
            r4 = r7
            goto L_0x003e
        L_0x003d:
            r1 = r2
        L_0x003e:
            int r3 = r3 + 1
            goto L_0x0028
        L_0x0041:
            java.lang.Object[] r12 = r11.f20208b
            fk.h.p0(r12, r4, r0)
            goto L_0x0089
        L_0x0047:
            java.lang.Object[] r5 = r11.f20208b
            int r5 = r5.length
            r7 = r1
            r6 = r3
        L_0x004c:
            if (r3 >= r5) goto L_0x0067
            java.lang.Object[] r8 = r11.f20208b
            r9 = r8[r3]
            r8[r3] = r4
            boolean r8 = r12.contains(r9)
            r8 = r8 ^ r2
            if (r8 == 0) goto L_0x0063
            java.lang.Object[] r8 = r11.f20208b
            int r10 = r6 + 1
            r8[r6] = r9
            r6 = r10
            goto L_0x0064
        L_0x0063:
            r7 = r2
        L_0x0064:
            int r3 = r3 + 1
            goto L_0x004c
        L_0x0067:
            int r3 = r11.o(r6)
        L_0x006b:
            if (r1 >= r0) goto L_0x0087
            java.lang.Object[] r5 = r11.f20208b
            r6 = r5[r1]
            r5[r1] = r4
            boolean r5 = r12.contains(r6)
            r5 = r5 ^ r2
            if (r5 == 0) goto L_0x0083
            java.lang.Object[] r5 = r11.f20208b
            r5[r3] = r6
            int r3 = r11.n(r3)
            goto L_0x0084
        L_0x0083:
            r7 = r2
        L_0x0084:
            int r1 = r1 + 1
            goto L_0x006b
        L_0x0087:
            r4 = r3
            r1 = r7
        L_0x0089:
            if (r1 == 0) goto L_0x0096
            int r12 = r11.f20207a
            int r4 = r4 - r12
            if (r4 >= 0) goto L_0x0094
            java.lang.Object[] r12 = r11.f20208b
            int r12 = r12.length
            int r4 = r4 + r12
        L_0x0094:
            r11.f20209c = r4
        L_0x0096:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: fk.g.removeAll(java.util.Collection):boolean");
    }

    public final E removeFirst() {
        if (!isEmpty()) {
            E[] eArr = this.f20208b;
            int i10 = this.f20207a;
            E e10 = eArr[i10];
            eArr[i10] = null;
            this.f20207a = n(i10);
            this.f20209c = g() - 1;
            return e10;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [int] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean retainAll(java.util.Collection<? extends java.lang.Object> r12) {
        /*
            r11 = this;
            java.lang.String r0 = "elements"
            sk.j.f(r12, r0)
            boolean r0 = r11.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x0093
            java.lang.Object[] r0 = r11.f20208b
            int r0 = r0.length
            r2 = 1
            if (r0 != 0) goto L_0x0014
            r0 = r2
            goto L_0x0015
        L_0x0014:
            r0 = r1
        L_0x0015:
            if (r0 == 0) goto L_0x0019
            goto L_0x0093
        L_0x0019:
            int r0 = r11.f20207a
            int r3 = r11.f20209c
            int r3 = r3 + r0
            int r0 = r11.o(r3)
            int r3 = r11.f20207a
            r4 = 0
            if (r3 >= r0) goto L_0x0046
            r4 = r3
        L_0x0028:
            if (r3 >= r0) goto L_0x0040
            java.lang.Object[] r5 = r11.f20208b
            r5 = r5[r3]
            boolean r6 = r12.contains(r5)
            if (r6 == 0) goto L_0x003c
            java.lang.Object[] r6 = r11.f20208b
            int r7 = r4 + 1
            r6[r4] = r5
            r4 = r7
            goto L_0x003d
        L_0x003c:
            r1 = r2
        L_0x003d:
            int r3 = r3 + 1
            goto L_0x0028
        L_0x0040:
            java.lang.Object[] r12 = r11.f20208b
            fk.h.p0(r12, r4, r0)
            goto L_0x0086
        L_0x0046:
            java.lang.Object[] r5 = r11.f20208b
            int r5 = r5.length
            r7 = r1
            r6 = r3
        L_0x004b:
            if (r3 >= r5) goto L_0x0065
            java.lang.Object[] r8 = r11.f20208b
            r9 = r8[r3]
            r8[r3] = r4
            boolean r8 = r12.contains(r9)
            if (r8 == 0) goto L_0x0061
            java.lang.Object[] r8 = r11.f20208b
            int r10 = r6 + 1
            r8[r6] = r9
            r6 = r10
            goto L_0x0062
        L_0x0061:
            r7 = r2
        L_0x0062:
            int r3 = r3 + 1
            goto L_0x004b
        L_0x0065:
            int r3 = r11.o(r6)
        L_0x0069:
            if (r1 >= r0) goto L_0x0084
            java.lang.Object[] r5 = r11.f20208b
            r6 = r5[r1]
            r5[r1] = r4
            boolean r5 = r12.contains(r6)
            if (r5 == 0) goto L_0x0080
            java.lang.Object[] r5 = r11.f20208b
            r5[r3] = r6
            int r3 = r11.n(r3)
            goto L_0x0081
        L_0x0080:
            r7 = r2
        L_0x0081:
            int r1 = r1 + 1
            goto L_0x0069
        L_0x0084:
            r4 = r3
            r1 = r7
        L_0x0086:
            if (r1 == 0) goto L_0x0093
            int r12 = r11.f20207a
            int r4 = r4 - r12
            if (r4 >= 0) goto L_0x0091
            java.lang.Object[] r12 = r11.f20208b
            int r12 = r12.length
            int r4 = r4 + r12
        L_0x0091:
            r11.f20209c = r4
        L_0x0093:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: fk.g.retainAll(java.util.Collection):boolean");
    }

    public final E set(int i10, E e10) {
        int g2 = g();
        if (i10 < 0 || i10 >= g2) {
            throw new IndexOutOfBoundsException(b0.p("index: ", i10, ", size: ", g2));
        }
        int o10 = o(this.f20207a + i10);
        E[] eArr = this.f20208b;
        E e11 = eArr[o10];
        eArr[o10] = e10;
        return e11;
    }

    public final Object[] toArray() {
        return toArray(new Object[g()]);
    }

    public final <T> T[] toArray(T[] tArr) {
        j.f(tArr, "array");
        int length = tArr.length;
        int i10 = this.f20209c;
        if (length < i10) {
            Object newInstance = Array.newInstance(tArr.getClass().getComponentType(), i10);
            j.d(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            tArr = (Object[]) newInstance;
        }
        int o10 = o(this.f20209c + this.f20207a);
        int i11 = this.f20207a;
        if (i11 < o10) {
            h.m0(0, i11, o10, this.f20208b, tArr);
        } else if (!isEmpty()) {
            Object[] objArr = this.f20208b;
            h.m0(0, this.f20207a, objArr.length, objArr, tArr);
            Object[] objArr2 = this.f20208b;
            h.m0(objArr2.length - this.f20207a, 0, o10, objArr2, tArr);
        }
        int length2 = tArr.length;
        int i12 = this.f20209c;
        if (length2 > i12) {
            tArr[i12] = null;
        }
        return tArr;
    }

    public final boolean add(E e10) {
        addLast(e10);
        return true;
    }

    public final boolean addAll(Collection<? extends E> collection) {
        j.f(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        m(collection.size() + g());
        l(o(g() + this.f20207a), collection);
        return true;
    }
}
