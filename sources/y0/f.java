package y0;

import al.g0;
import ek.i;
import fk.j;
import ik.d;
import java.util.ArrayList;
import java.util.Iterator;
import kk.e;
import kk.h;
import p3.l0;
import rk.p;
import xk.g;

/* compiled from: SnapshotIdSet.kt */
public final class f implements Iterable<Integer> {

    /* renamed from: e  reason: collision with root package name */
    public static final f f17367e = new f(0, 0, 0, (int[]) null);

    /* renamed from: a  reason: collision with root package name */
    public final long f17368a;

    /* renamed from: b  reason: collision with root package name */
    public final long f17369b;

    /* renamed from: c  reason: collision with root package name */
    public final int f17370c;

    /* renamed from: d  reason: collision with root package name */
    public final int[] f17371d;

    @e(c = "androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1", f = "SnapshotIdSet.kt", l = {295, 300, 307}, m = "invokeSuspend")
    /* compiled from: SnapshotIdSet.kt */
    public static final class a extends h implements p<g<? super Integer>, d<? super i>, Object> {

        /* renamed from: b  reason: collision with root package name */
        public int[] f17372b;

        /* renamed from: c  reason: collision with root package name */
        public int f17373c;

        /* renamed from: d  reason: collision with root package name */
        public int f17374d;

        /* renamed from: e  reason: collision with root package name */
        public int f17375e;

        /* renamed from: f  reason: collision with root package name */
        public /* synthetic */ Object f17376f;

        /* renamed from: n  reason: collision with root package name */
        public final /* synthetic */ f f17377n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(f fVar, d<? super a> dVar) {
            super(dVar);
            this.f17377n = fVar;
        }

        public final d<i> create(Object obj, d<?> dVar) {
            a aVar = new a(this.f17377n, dVar);
            aVar.f17376f = obj;
            return aVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((a) create((g) obj, (d) obj2)).invokeSuspend(i.f20112a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x005e  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0086  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x008a  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00bb  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x00c0  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                r19 = this;
                r0 = r19
                jk.a r1 = jk.a.COROUTINE_SUSPENDED
                int r2 = r0.f17375e
                r3 = 1
                r5 = 0
                r6 = 2
                r7 = 3
                r8 = 64
                r10 = 0
                r12 = 1
                if (r2 == 0) goto L_0x0049
                if (r2 == r12) goto L_0x003a
                if (r2 == r6) goto L_0x002e
                if (r2 != r7) goto L_0x0026
                int r2 = r0.f17373c
                java.lang.Object r6 = r0.f17376f
                xk.g r6 = (xk.g) r6
                p3.l0.Q0(r20)
                r13 = r7
                r7 = r6
                r6 = r0
                goto L_0x00ea
            L_0x0026:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x002e:
                int r2 = r0.f17373c
                java.lang.Object r13 = r0.f17376f
                xk.g r13 = (xk.g) r13
                p3.l0.Q0(r20)
                r9 = r0
                goto L_0x00b0
            L_0x003a:
                int r2 = r0.f17374d
                int r13 = r0.f17373c
                int[] r14 = r0.f17372b
                java.lang.Object r15 = r0.f17376f
                xk.g r15 = (xk.g) r15
                p3.l0.Q0(r20)
                r9 = r0
                goto L_0x0077
            L_0x0049:
                p3.l0.Q0(r20)
                java.lang.Object r2 = r0.f17376f
                xk.g r2 = (xk.g) r2
                y0.f r13 = r0.f17377n
                int[] r13 = r13.f17371d
                if (r13 == 0) goto L_0x007d
                int r14 = r13.length
                r9 = r0
                r15 = r2
                r2 = r14
                r14 = r13
                r13 = 0
            L_0x005c:
                if (r13 >= r2) goto L_0x007b
                r7 = r14[r13]
                java.lang.Integer r6 = new java.lang.Integer
                r6.<init>(r7)
                r9.f17376f = r15
                r9.f17372b = r14
                r9.f17373c = r13
                r9.f17374d = r2
                r9.f17375e = r12
                r15.a(r6, r9)
                jk.a r6 = jk.a.COROUTINE_SUSPENDED
                if (r6 != r1) goto L_0x0077
                return r1
            L_0x0077:
                int r13 = r13 + r12
                r6 = 2
                r7 = 3
                goto L_0x005c
            L_0x007b:
                r2 = r15
                goto L_0x007e
            L_0x007d:
                r9 = r0
            L_0x007e:
                y0.f r6 = r9.f17377n
                long r6 = r6.f17369b
                int r6 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
                if (r6 == 0) goto L_0x00b3
                r13 = r2
                r2 = 0
            L_0x0088:
                if (r2 >= r8) goto L_0x00b2
                y0.f r6 = r9.f17377n
                long r14 = r6.f17369b
                long r17 = r3 << r2
                long r14 = r14 & r17
                int r7 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
                if (r7 == 0) goto L_0x00af
                int r6 = r6.f17370c
                int r6 = r6 + r2
                java.lang.Integer r7 = new java.lang.Integer
                r7.<init>(r6)
                r9.f17376f = r13
                r9.f17372b = r5
                r9.f17373c = r2
                r6 = 2
                r9.f17375e = r6
                r13.a(r7, r9)
                jk.a r7 = jk.a.COROUTINE_SUSPENDED
                if (r7 != r1) goto L_0x00b0
                return r1
            L_0x00af:
                r6 = 2
            L_0x00b0:
                int r2 = r2 + r12
                goto L_0x0088
            L_0x00b2:
                r2 = r13
            L_0x00b3:
                y0.f r6 = r9.f17377n
                long r6 = r6.f17368a
                int r6 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
                if (r6 == 0) goto L_0x00ef
                r6 = r2
                r2 = r9
                r9 = 0
            L_0x00be:
                if (r9 >= r8) goto L_0x00ef
                y0.f r7 = r2.f17377n
                long r13 = r7.f17368a
                long r15 = r3 << r9
                long r13 = r13 & r15
                int r13 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
                if (r13 == 0) goto L_0x00e6
                int r13 = r9 + 64
                int r7 = r7.f17370c
                int r13 = r13 + r7
                java.lang.Integer r7 = new java.lang.Integer
                r7.<init>(r13)
                r2.f17376f = r6
                r2.f17372b = r5
                r2.f17373c = r9
                r13 = 3
                r2.f17375e = r13
                r6.a(r7, r2)
                jk.a r7 = jk.a.COROUTINE_SUSPENDED
                if (r7 != r1) goto L_0x00e7
                return r1
            L_0x00e6:
                r13 = 3
            L_0x00e7:
                r7 = r6
                r6 = r2
                r2 = r9
            L_0x00ea:
                int r9 = r2 + 1
                r2 = r6
                r6 = r7
                goto L_0x00be
            L_0x00ef:
                ek.i r1 = ek.i.f20112a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: y0.f.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public f(long j10, long j11, int i10, int[] iArr) {
        this.f17368a = j10;
        this.f17369b = j11;
        this.f17370c = i10;
        this.f17371d = iArr;
    }

    public final boolean g(int i10) {
        int[] iArr;
        int i11 = i10 - this.f17370c;
        boolean z10 = true;
        if (i11 < 0 || i11 >= 64) {
            if (i11 < 64 || i11 >= 128) {
                if (i11 > 0 || (iArr = this.f17371d) == null) {
                    return false;
                }
                if (l0.i(iArr, i10) < 0) {
                    z10 = false;
                }
                return z10;
            } else if (((1 << (i11 - 64)) & this.f17368a) != 0) {
                return true;
            } else {
                return false;
            }
        } else if (((1 << i11) & this.f17369b) != 0) {
            return true;
        } else {
            return false;
        }
    }

    public final f i(int i10) {
        int i11;
        int[] iArr;
        int i12 = i10;
        int i13 = this.f17370c;
        int i14 = i12 - i13;
        long j10 = 0;
        if (i14 >= 0 && i14 < 64) {
            long j11 = 1 << i14;
            long j12 = this.f17369b;
            if ((j12 & j11) == 0) {
                return new f(this.f17368a, j12 | j11, i13, this.f17371d);
            }
        } else if (i14 >= 64 && i14 < 128) {
            long j13 = 1 << (i14 - 64);
            long j14 = this.f17368a;
            if ((j14 & j13) == 0) {
                return new f(j14 | j13, this.f17369b, i13, this.f17371d);
            }
        } else if (i14 < 128) {
            int[] iArr2 = this.f17371d;
            if (iArr2 == null) {
                return new f(this.f17368a, this.f17369b, i13, new int[]{i12});
            }
            int i15 = l0.i(iArr2, i12);
            if (i15 < 0) {
                int i16 = -(i15 + 1);
                int length = iArr2.length + 1;
                int[] iArr3 = new int[length];
                System.arraycopy(iArr2, 0, iArr3, 0, i16 + 0);
                System.arraycopy(iArr2, i16, iArr3, i16 + 1, (length - 1) - i16);
                iArr3[i16] = i12;
                return new f(this.f17368a, this.f17369b, this.f17370c, iArr3);
            }
        } else if (!g(i10)) {
            long j15 = this.f17368a;
            long j16 = this.f17369b;
            int i17 = this.f17370c;
            ArrayList arrayList = null;
            int i18 = ((i12 + 1) / 64) * 64;
            long j17 = j16;
            long j18 = j15;
            while (true) {
                if (i17 >= i18) {
                    i11 = i17;
                    break;
                }
                if (j17 != j10) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        int[] iArr4 = this.f17371d;
                        if (iArr4 != null) {
                            for (int valueOf : iArr4) {
                                arrayList.add(Integer.valueOf(valueOf));
                            }
                        }
                    }
                    for (int i19 = 0; i19 < 64; i19++) {
                        if (((1 << i19) & j17) != 0) {
                            arrayList.add(Integer.valueOf(i19 + i17));
                        }
                    }
                    j10 = 0;
                }
                if (j18 == j10) {
                    j17 = j10;
                    i11 = i18;
                    break;
                }
                i17 += 64;
                j17 = j18;
                j18 = j10;
            }
            if (arrayList != null) {
                iArr = fk.p.Y0(arrayList);
            } else {
                iArr = this.f17371d;
            }
            return new f(j18, j17, i11, iArr).i(i12);
        }
        return this;
    }

    public final Iterator<Integer> iterator() {
        a aVar = new a(this, (d<? super a>) null);
        xk.f fVar = new xk.f();
        fVar.f23497d = g0.K(fVar, fVar, aVar);
        return fVar;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(" [");
        ArrayList arrayList = new ArrayList(j.H0(this));
        Iterator<Integer> it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next().intValue()));
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("");
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = arrayList.get(i11);
            boolean z10 = true;
            i10++;
            if (i10 > 1) {
                sb3.append(", ");
            }
            if (obj != null) {
                z10 = obj instanceof CharSequence;
            }
            if (z10) {
                sb3.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb3.append(((Character) obj).charValue());
            } else {
                sb3.append(String.valueOf(obj));
            }
        }
        sb3.append("");
        String sb4 = sb3.toString();
        sk.j.e(sb4, "fastJoinTo(StringBuilder…form)\n        .toString()");
        sb2.append(sb4);
        sb2.append(']');
        return sb2.toString();
    }
}
