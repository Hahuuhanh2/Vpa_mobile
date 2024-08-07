package u8;

import j7.a;
import java.util.Arrays;
import java.util.Objects;
import java.util.Set;
import m9.b;
import u8.d;

/* compiled from: ImmutableSet */
public abstract class f<E> extends c<E> implements Set<E> {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f15326c = 0;

    /* renamed from: b  reason: collision with root package name */
    public transient d<E> f15327b;

    public static int p(int i10) {
        int max = Math.max(i10, 2);
        boolean z10 = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (((double) highestOneBit) * 0.7d < ((double) max)) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        if (max >= 1073741824) {
            z10 = false;
        }
        if (z10) {
            return 1073741824;
        }
        throw new IllegalArgumentException("collection too large");
    }

    public static <E> f<E> q(int i10, Object... objArr) {
        if (i10 == 0) {
            return l.f15392q;
        }
        boolean z10 = false;
        if (i10 != 1) {
            int p10 = p(i10);
            Object[] objArr2 = new Object[p10];
            int i11 = p10 - 1;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (i12 < i10) {
                Object obj = objArr[i12];
                if (obj != null) {
                    int hashCode = obj.hashCode();
                    int Y = b.Y(hashCode);
                    while (true) {
                        int i15 = Y & i11;
                        Object obj2 = objArr2[i15];
                        if (obj2 == null) {
                            objArr[i14] = obj;
                            objArr2[i15] = obj;
                            i13 += hashCode;
                            i14++;
                            break;
                        } else if (obj2.equals(obj)) {
                            break;
                        } else {
                            Y++;
                        }
                    }
                    i12++;
                } else {
                    StringBuilder sb2 = new StringBuilder(20);
                    sb2.append("at index ");
                    sb2.append(i12);
                    throw new NullPointerException(sb2.toString());
                }
            }
            Arrays.fill(objArr, i14, i10, (Object) null);
            if (i14 == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                return new m(obj3);
            } else if (p(i14) < p10 / 2) {
                return q(i14, objArr);
            } else {
                int length = objArr.length;
                if (i14 < (length >> 1) + (length >> 2)) {
                    z10 = true;
                }
                if (z10) {
                    objArr = Arrays.copyOf(objArr, i14);
                }
                return new l(i13, i11, i14, objArr, objArr2);
            }
        } else {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new m(obj4);
        }
    }

    @SafeVarargs
    public static f s(String str, String str2, String str3, String str4, String str5, String str6, Object... objArr) {
        boolean z10;
        if (objArr.length <= 2147483641) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int length = objArr.length + 6;
            Object[] objArr2 = new Object[length];
            objArr2[0] = str;
            objArr2[1] = str2;
            objArr2[2] = str3;
            objArr2[3] = str4;
            objArr2[4] = str5;
            objArr2[5] = str6;
            System.arraycopy(objArr, 0, objArr2, 6, objArr.length);
            return q(length, objArr2);
        }
        throw new IllegalArgumentException("the total number of elements must fit in an int");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof f) && (this instanceof l)) {
            f fVar = (f) obj;
            fVar.getClass();
            if ((fVar instanceof l) && hashCode() != obj.hashCode()) {
                return false;
            }
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size() && containsAll(set)) {
                    return true;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public int hashCode() {
        return a.N(this);
    }

    public d<E> o() {
        d<E> dVar = this.f15327b;
        if (dVar != null) {
            return dVar;
        }
        d<E> r10 = r();
        this.f15327b = r10;
        return r10;
    }

    public d<E> r() {
        Object[] array = toArray();
        d.a aVar = d.f15312b;
        return d.o(array.length, array);
    }
}
