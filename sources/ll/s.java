package ll;

import al.g0;
import fk.c;
import fk.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.RandomAccess;
import sk.j;

/* compiled from: Options.kt */
public final class s extends c<j> implements RandomAccess {

    /* renamed from: a  reason: collision with root package name */
    public final j[] f20901a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f20902b;

    /* compiled from: Options.kt */
    public static final class a {
        public static void a(long j10, f fVar, int i10, ArrayList arrayList, int i11, int i12, ArrayList arrayList2) {
            boolean z10;
            int i13;
            int i14;
            boolean z11;
            int i15;
            long j11;
            int i16;
            f fVar2;
            boolean z12;
            f fVar3 = fVar;
            int i17 = i10;
            ArrayList arrayList3 = arrayList;
            int i18 = i11;
            int i19 = i12;
            ArrayList arrayList4 = arrayList2;
            if (i18 < i19) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                int i20 = i18;
                while (i20 < i19) {
                    if (((j) arrayList3.get(i20)).i() >= i17) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        i20++;
                    } else {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                }
                j jVar = (j) arrayList.get(i11);
                j jVar2 = (j) arrayList3.get(i19 - 1);
                int i21 = -1;
                if (i17 == jVar.i()) {
                    int intValue = ((Number) arrayList4.get(i18)).intValue();
                    int i22 = i18 + 1;
                    j jVar3 = (j) arrayList3.get(i22);
                    i13 = i22;
                    i14 = intValue;
                    jVar = jVar3;
                } else {
                    i13 = i18;
                    i14 = -1;
                }
                if (jVar.m(i17) != jVar2.m(i17)) {
                    int i23 = 1;
                    for (int i24 = i13 + 1; i24 < i19; i24++) {
                        if (((j) arrayList3.get(i24 - 1)).m(i17) != ((j) arrayList3.get(i24)).m(i17)) {
                            i23++;
                        }
                    }
                    long j12 = (long) 4;
                    long j13 = ((long) (i23 * 2)) + (fVar3.f20878b / j12) + j10 + ((long) 2);
                    fVar3.o0(i23);
                    fVar3.o0(i14);
                    for (int i25 = i13; i25 < i19; i25++) {
                        byte m10 = ((j) arrayList3.get(i25)).m(i17);
                        if (i25 == i13 || m10 != ((j) arrayList3.get(i25 - 1)).m(i17)) {
                            fVar3.o0(m10 & 255);
                        }
                    }
                    f fVar4 = new f();
                    while (i13 < i19) {
                        byte m11 = ((j) arrayList3.get(i13)).m(i17);
                        int i26 = i13 + 1;
                        int i27 = i26;
                        while (true) {
                            if (i27 >= i19) {
                                i15 = i19;
                                break;
                            } else if (m11 != ((j) arrayList3.get(i27)).m(i17)) {
                                i15 = i27;
                                break;
                            } else {
                                i27++;
                            }
                        }
                        if (i26 == i15 && i17 + 1 == ((j) arrayList3.get(i13)).i()) {
                            fVar3.o0(((Number) arrayList4.get(i13)).intValue());
                            i16 = i15;
                            fVar2 = fVar4;
                            j11 = j12;
                        } else {
                            fVar3.o0(((int) ((fVar4.f20878b / j12) + j13)) * i21);
                            i16 = i15;
                            fVar2 = fVar4;
                            j11 = j12;
                            a(j13, fVar4, i17 + 1, arrayList, i13, i16, arrayList2);
                        }
                        fVar4 = fVar2;
                        i13 = i16;
                        j12 = j11;
                        i21 = -1;
                    }
                    fVar3.E0(fVar4);
                    return;
                }
                int min = Math.min(jVar.i(), jVar2.i());
                int i28 = i17;
                int i29 = 0;
                while (i28 < min && jVar.m(i28) == jVar2.m(i28)) {
                    i29++;
                    i28++;
                }
                long j14 = (long) 4;
                long j15 = (fVar3.f20878b / j14) + j10 + ((long) 2) + ((long) i29) + 1;
                fVar3.o0(-i29);
                fVar3.o0(i14);
                int i30 = i17 + i29;
                while (i17 < i30) {
                    fVar3.o0(jVar.m(i17) & 255);
                    i17++;
                }
                if (i13 + 1 == i19) {
                    if (i30 == ((j) arrayList3.get(i13)).i()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        fVar3.o0(((Number) arrayList4.get(i13)).intValue());
                        return;
                    }
                    throw new IllegalStateException("Check failed.".toString());
                }
                f fVar5 = new f();
                fVar3.o0(((int) ((fVar5.f20878b / j14) + j15)) * -1);
                a(j15, fVar5, i30, arrayList, i13, i12, arrayList2);
                fVar3.E0(fVar5);
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        public static s b(j... jVarArr) {
            boolean z10;
            boolean z11;
            boolean z12;
            int i10;
            int i11 = 0;
            if (jVarArr.length == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return new s(new j[0], new int[]{0, -1});
            }
            ArrayList arrayList = new ArrayList(new f(jVarArr, false));
            if (arrayList.size() > 1) {
                Collections.sort(arrayList);
            }
            ArrayList arrayList2 = new ArrayList(jVarArr.length);
            for (j jVar : jVarArr) {
                arrayList2.add(-1);
            }
            Integer[] numArr = (Integer[]) arrayList2.toArray(new Integer[0]);
            ArrayList g02 = j7.a.g0(Arrays.copyOf(numArr, numArr.length));
            int length = jVarArr.length;
            int i12 = 0;
            int i13 = 0;
            while (i12 < length) {
                j jVar2 = jVarArr[i12];
                int i14 = i13 + 1;
                int size = arrayList.size();
                int size2 = arrayList.size();
                if (size < 0) {
                    throw new IllegalArgumentException("fromIndex (" + 0 + ") is greater than toIndex (" + size + ").");
                } else if (size <= size2) {
                    int i15 = size - 1;
                    int i16 = 0;
                    while (true) {
                        if (i16 > i15) {
                            i10 = -(i16 + 1);
                            break;
                        }
                        i10 = (i16 + i15) >>> 1;
                        int H = g0.H((Comparable) arrayList.get(i10), jVar2);
                        if (H >= 0) {
                            if (H <= 0) {
                                break;
                            }
                            i15 = i10 - 1;
                        } else {
                            i16 = i10 + 1;
                        }
                    }
                    g02.set(i10, Integer.valueOf(i13));
                    i12++;
                    i13 = i14;
                } else {
                    throw new IndexOutOfBoundsException("toIndex (" + size + ") is greater than size (" + size2 + ").");
                }
            }
            if (((j) arrayList.get(0)).i() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                int i17 = 0;
                while (i17 < arrayList.size()) {
                    j jVar3 = (j) arrayList.get(i17);
                    int i18 = i17 + 1;
                    int i19 = i18;
                    while (i19 < arrayList.size()) {
                        j jVar4 = (j) arrayList.get(i19);
                        jVar4.getClass();
                        j.f(jVar3, "prefix");
                        if (!jVar4.o(jVar3, jVar3.i())) {
                            continue;
                            break;
                        }
                        if (jVar4.i() != jVar3.i()) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (!z12) {
                            throw new IllegalArgumentException(("duplicate option: " + jVar4).toString());
                        } else if (((Number) g02.get(i19)).intValue() > ((Number) g02.get(i17)).intValue()) {
                            arrayList.remove(i19);
                            g02.remove(i19);
                        } else {
                            i19++;
                        }
                    }
                    i17 = i18;
                }
                f fVar = new f();
                a(0, fVar, 0, arrayList, 0, arrayList.size(), g02);
                int[] iArr = new int[((int) (fVar.f20878b / ((long) 4)))];
                while (!fVar.A()) {
                    iArr[i11] = fVar.readInt();
                    i11++;
                }
                Object[] copyOf = Arrays.copyOf(jVarArr, jVarArr.length);
                j.e(copyOf, "copyOf(this, size)");
                return new s((j[]) copyOf, iArr);
            }
            throw new IllegalArgumentException("the empty byte string is not a supported option".toString());
        }
    }

    public s(j[] jVarArr, int[] iArr) {
        this.f20901a = jVarArr;
        this.f20902b = iArr;
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        return super.contains((j) obj);
    }

    public final int g() {
        return this.f20901a.length;
    }

    public final Object get(int i10) {
        return this.f20901a[i10];
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof j)) {
            return -1;
        }
        return super.indexOf((j) obj);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof j)) {
            return -1;
        }
        return super.lastIndexOf((j) obj);
    }
}
