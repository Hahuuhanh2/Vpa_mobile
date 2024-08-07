package androidx.recyclerview.widget;

import a1.e;
import androidx.recyclerview.widget.n;
import java.util.ArrayList;

/* compiled from: AdapterHelper */
public final class a implements n.a {

    /* renamed from: a  reason: collision with root package name */
    public e f3152a = new e(30, 1);

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<b> f3153b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<b> f3154c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public final C0028a f3155d;

    /* renamed from: e  reason: collision with root package name */
    public final n f3156e;

    /* renamed from: f  reason: collision with root package name */
    public int f3157f = 0;

    /* renamed from: androidx.recyclerview.widget.a$a  reason: collision with other inner class name */
    /* compiled from: AdapterHelper */
    public interface C0028a {
    }

    /* compiled from: AdapterHelper */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public int f3158a;

        /* renamed from: b  reason: collision with root package name */
        public int f3159b;

        /* renamed from: c  reason: collision with root package name */
        public Object f3160c;

        /* renamed from: d  reason: collision with root package name */
        public int f3161d;

        public b(Object obj, int i10, int i11, int i12) {
            this.f3158a = i10;
            this.f3159b = i11;
            this.f3161d = i12;
            this.f3160c = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            int i10 = this.f3158a;
            if (i10 != bVar.f3158a) {
                return false;
            }
            if (i10 == 8 && Math.abs(this.f3161d - this.f3159b) == 1 && this.f3161d == bVar.f3159b && this.f3159b == bVar.f3161d) {
                return true;
            }
            if (this.f3161d != bVar.f3161d || this.f3159b != bVar.f3159b) {
                return false;
            }
            Object obj2 = this.f3160c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.f3160c)) {
                    return false;
                }
            } else if (bVar.f3160c != null) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return (((this.f3158a * 31) + this.f3159b) * 31) + this.f3161d;
        }

        public final String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append("[");
            int i10 = this.f3158a;
            if (i10 == 1) {
                str = "add";
            } else if (i10 == 2) {
                str = "rm";
            } else if (i10 == 4) {
                str = "up";
            } else if (i10 != 8) {
                str = "??";
            } else {
                str = "mv";
            }
            sb2.append(str);
            sb2.append(",s:");
            sb2.append(this.f3159b);
            sb2.append("c:");
            sb2.append(this.f3161d);
            sb2.append(",p:");
            sb2.append(this.f3160c);
            sb2.append("]");
            return sb2.toString();
        }
    }

    public a(t tVar) {
        this.f3155d = tVar;
        this.f3156e = new n(this);
    }

    public final boolean a(int i10) {
        int size = this.f3154c.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = this.f3154c.get(i11);
            int i12 = bVar.f3158a;
            if (i12 == 8) {
                if (f(bVar.f3161d, i11 + 1) == i10) {
                    return true;
                }
            } else if (i12 == 1) {
                int i13 = bVar.f3159b;
                int i14 = bVar.f3161d + i13;
                while (i13 < i14) {
                    if (f(i13, i11 + 1) == i10) {
                        return true;
                    }
                    i13++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    public final void b() {
        int size = this.f3154c.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((t) this.f3155d).a(this.f3154c.get(i10));
        }
        l(this.f3154c);
        this.f3157f = 0;
    }

    public final void c() {
        b();
        int size = this.f3153b.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = this.f3153b.get(i10);
            int i11 = bVar.f3158a;
            if (i11 == 1) {
                ((t) this.f3155d).a(bVar);
                ((t) this.f3155d).d(bVar.f3159b, bVar.f3161d);
            } else if (i11 == 2) {
                ((t) this.f3155d).a(bVar);
                C0028a aVar = this.f3155d;
                int i12 = bVar.f3159b;
                int i13 = bVar.f3161d;
                t tVar = (t) aVar;
                tVar.f3297a.T(true, i12, i13);
                RecyclerView recyclerView = tVar.f3297a;
                recyclerView.f2991s0 = true;
                recyclerView.f2985p0.f3099c += i13;
            } else if (i11 == 4) {
                ((t) this.f3155d).a(bVar);
                ((t) this.f3155d).c(bVar.f3160c, bVar.f3159b, bVar.f3161d);
            } else if (i11 == 8) {
                ((t) this.f3155d).a(bVar);
                ((t) this.f3155d).e(bVar.f3159b, bVar.f3161d);
            }
        }
        l(this.f3153b);
        this.f3157f = 0;
    }

    public final void d(b bVar) {
        int i10;
        boolean z10;
        int i11 = bVar.f3158a;
        if (i11 == 1 || i11 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int m10 = m(bVar.f3159b, i11);
        int i12 = bVar.f3159b;
        int i13 = bVar.f3158a;
        if (i13 == 2) {
            i10 = 0;
        } else if (i13 == 4) {
            i10 = 1;
        } else {
            throw new IllegalArgumentException("op should be remove or update." + bVar);
        }
        int i14 = 1;
        for (int i15 = 1; i15 < bVar.f3161d; i15++) {
            int m11 = m((i10 * i15) + bVar.f3159b, bVar.f3158a);
            int i16 = bVar.f3158a;
            if (i16 == 2 ? m11 != m10 : !(i16 == 4 && m11 == m10 + 1)) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                i14++;
            } else {
                b h10 = h(bVar.f3160c, i16, m10, i14);
                e(h10, i12);
                h10.f3160c = null;
                this.f3152a.a(h10);
                if (bVar.f3158a == 4) {
                    i12 += i14;
                }
                i14 = 1;
                m10 = m11;
            }
        }
        Object obj = bVar.f3160c;
        bVar.f3160c = null;
        this.f3152a.a(bVar);
        if (i14 > 0) {
            b h11 = h(obj, bVar.f3158a, m10, i14);
            e(h11, i12);
            h11.f3160c = null;
            this.f3152a.a(h11);
        }
    }

    public final void e(b bVar, int i10) {
        ((t) this.f3155d).a(bVar);
        int i11 = bVar.f3158a;
        if (i11 == 2) {
            C0028a aVar = this.f3155d;
            int i12 = bVar.f3161d;
            t tVar = (t) aVar;
            tVar.f3297a.T(true, i10, i12);
            RecyclerView recyclerView = tVar.f3297a;
            recyclerView.f2991s0 = true;
            recyclerView.f2985p0.f3099c += i12;
        } else if (i11 == 4) {
            ((t) this.f3155d).c(bVar.f3160c, i10, bVar.f3161d);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    public final int f(int i10, int i11) {
        int size = this.f3154c.size();
        while (i11 < size) {
            b bVar = this.f3154c.get(i11);
            int i12 = bVar.f3158a;
            if (i12 == 8) {
                int i13 = bVar.f3159b;
                if (i13 == i10) {
                    i10 = bVar.f3161d;
                } else {
                    if (i13 < i10) {
                        i10--;
                    }
                    if (bVar.f3161d <= i10) {
                        i10++;
                    }
                }
            } else {
                int i14 = bVar.f3159b;
                if (i14 > i10) {
                    continue;
                } else if (i12 == 2) {
                    int i15 = bVar.f3161d;
                    if (i10 < i14 + i15) {
                        return -1;
                    }
                    i10 -= i15;
                } else if (i12 == 1) {
                    i10 += bVar.f3161d;
                }
            }
            i11++;
        }
        return i10;
    }

    public final boolean g() {
        if (this.f3153b.size() > 0) {
            return true;
        }
        return false;
    }

    public final b h(Object obj, int i10, int i11, int i12) {
        b bVar = (b) this.f3152a.b();
        if (bVar == null) {
            return new b(obj, i10, i11, i12);
        }
        bVar.f3158a = i10;
        bVar.f3159b = i11;
        bVar.f3161d = i12;
        bVar.f3160c = obj;
        return bVar;
    }

    public final void i(b bVar) {
        this.f3154c.add(bVar);
        int i10 = bVar.f3158a;
        if (i10 == 1) {
            ((t) this.f3155d).d(bVar.f3159b, bVar.f3161d);
        } else if (i10 == 2) {
            C0028a aVar = this.f3155d;
            t tVar = (t) aVar;
            tVar.f3297a.T(false, bVar.f3159b, bVar.f3161d);
            tVar.f3297a.f2991s0 = true;
        } else if (i10 == 4) {
            C0028a aVar2 = this.f3155d;
            t tVar2 = (t) aVar2;
            tVar2.c(bVar.f3160c, bVar.f3159b, bVar.f3161d);
        } else if (i10 == 8) {
            ((t) this.f3155d).e(bVar.f3159b, bVar.f3161d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:174:0x0009 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x013f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j() {
        /*
            r16 = this;
            r0 = r16
            androidx.recyclerview.widget.n r1 = r0.f3156e
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r2 = r0.f3153b
            r1.getClass()
        L_0x0009:
            int r3 = r2.size()
            r4 = 1
            int r3 = r3 - r4
            r6 = 0
        L_0x0010:
            r7 = 8
            r8 = -1
            if (r3 < 0) goto L_0x0026
            java.lang.Object r9 = r2.get(r3)
            androidx.recyclerview.widget.a$b r9 = (androidx.recyclerview.widget.a.b) r9
            int r9 = r9.f3158a
            if (r9 != r7) goto L_0x0022
            if (r6 == 0) goto L_0x0023
            goto L_0x0027
        L_0x0022:
            r6 = r4
        L_0x0023:
            int r3 = r3 + -1
            goto L_0x0010
        L_0x0026:
            r3 = r8
        L_0x0027:
            r6 = 4
            r9 = 2
            r10 = 0
            if (r3 == r8) goto L_0x01df
            int r7 = r3 + 1
            java.lang.Object r11 = r2.get(r3)
            androidx.recyclerview.widget.a$b r11 = (androidx.recyclerview.widget.a.b) r11
            java.lang.Object r12 = r2.get(r7)
            androidx.recyclerview.widget.a$b r12 = (androidx.recyclerview.widget.a.b) r12
            int r13 = r12.f3158a
            if (r13 == r4) goto L_0x01b5
            if (r13 == r9) goto L_0x00b1
            if (r13 == r6) goto L_0x0043
            goto L_0x0009
        L_0x0043:
            int r5 = r11.f3161d
            int r8 = r12.f3159b
            if (r5 >= r8) goto L_0x004e
            int r8 = r8 + -1
            r12.f3159b = r8
            goto L_0x0064
        L_0x004e:
            int r9 = r12.f3161d
            int r8 = r8 + r9
            if (r5 >= r8) goto L_0x0064
            int r9 = r9 + -1
            r12.f3161d = r9
            androidx.recyclerview.widget.n$a r5 = r1.f3289a
            int r8 = r11.f3159b
            java.lang.Object r9 = r12.f3160c
            androidx.recyclerview.widget.a r5 = (androidx.recyclerview.widget.a) r5
            androidx.recyclerview.widget.a$b r4 = r5.h(r9, r6, r8, r4)
            goto L_0x0065
        L_0x0064:
            r4 = r10
        L_0x0065:
            int r5 = r11.f3159b
            int r8 = r12.f3159b
            if (r5 > r8) goto L_0x0070
            int r8 = r8 + 1
            r12.f3159b = r8
            goto L_0x0088
        L_0x0070:
            int r9 = r12.f3161d
            int r8 = r8 + r9
            if (r5 >= r8) goto L_0x0088
            int r8 = r8 - r5
            androidx.recyclerview.widget.n$a r9 = r1.f3289a
            int r5 = r5 + 1
            java.lang.Object r13 = r12.f3160c
            androidx.recyclerview.widget.a r9 = (androidx.recyclerview.widget.a) r9
            androidx.recyclerview.widget.a$b r5 = r9.h(r13, r6, r5, r8)
            int r6 = r12.f3161d
            int r6 = r6 - r8
            r12.f3161d = r6
            goto L_0x0089
        L_0x0088:
            r5 = r10
        L_0x0089:
            r2.set(r7, r11)
            int r6 = r12.f3161d
            if (r6 <= 0) goto L_0x0094
            r2.set(r3, r12)
            goto L_0x00a5
        L_0x0094:
            r2.remove(r3)
            androidx.recyclerview.widget.n$a r6 = r1.f3289a
            androidx.recyclerview.widget.a r6 = (androidx.recyclerview.widget.a) r6
            r6.getClass()
            r12.f3160c = r10
            a1.e r6 = r6.f3152a
            r6.a(r12)
        L_0x00a5:
            if (r4 == 0) goto L_0x00aa
            r2.add(r3, r4)
        L_0x00aa:
            if (r5 == 0) goto L_0x0009
            r2.add(r3, r5)
            goto L_0x0009
        L_0x00b1:
            int r6 = r11.f3159b
            int r8 = r11.f3161d
            if (r6 >= r8) goto L_0x00c6
            int r13 = r12.f3159b
            if (r13 != r6) goto L_0x00c4
            int r13 = r12.f3161d
            int r6 = r8 - r6
            if (r13 != r6) goto L_0x00c4
            r5 = r4
            r6 = 0
            goto L_0x00d6
        L_0x00c4:
            r5 = 0
            goto L_0x00d2
        L_0x00c6:
            int r13 = r12.f3159b
            int r14 = r8 + 1
            if (r13 != r14) goto L_0x00d4
            int r13 = r12.f3161d
            int r6 = r6 - r8
            if (r13 != r6) goto L_0x00d4
            r5 = r4
        L_0x00d2:
            r6 = r5
            goto L_0x00d6
        L_0x00d4:
            r6 = r4
            r5 = 0
        L_0x00d6:
            int r13 = r12.f3159b
            if (r8 >= r13) goto L_0x00df
            int r13 = r13 + -1
            r12.f3159b = r13
            goto L_0x0103
        L_0x00df:
            int r14 = r12.f3161d
            int r13 = r13 + r14
            if (r8 >= r13) goto L_0x0103
            int r14 = r14 + -1
            r12.f3161d = r14
            r11.f3158a = r9
            r11.f3161d = r4
            int r3 = r12.f3161d
            if (r3 != 0) goto L_0x0009
            r2.remove(r7)
            androidx.recyclerview.widget.n$a r3 = r1.f3289a
            androidx.recyclerview.widget.a r3 = (androidx.recyclerview.widget.a) r3
            r3.getClass()
            r12.f3160c = r10
            a1.e r3 = r3.f3152a
            r3.a(r12)
            goto L_0x0009
        L_0x0103:
            int r4 = r11.f3159b
            int r8 = r12.f3159b
            if (r4 > r8) goto L_0x010e
            int r8 = r8 + 1
            r12.f3159b = r8
            goto L_0x0126
        L_0x010e:
            int r13 = r12.f3161d
            int r8 = r8 + r13
            if (r4 >= r8) goto L_0x0126
            int r8 = r8 - r4
            androidx.recyclerview.widget.n$a r13 = r1.f3289a
            int r4 = r4 + 1
            androidx.recyclerview.widget.a r13 = (androidx.recyclerview.widget.a) r13
            androidx.recyclerview.widget.a$b r4 = r13.h(r10, r9, r4, r8)
            int r8 = r11.f3159b
            int r9 = r12.f3159b
            int r8 = r8 - r9
            r12.f3161d = r8
            goto L_0x0127
        L_0x0126:
            r4 = r10
        L_0x0127:
            if (r5 == 0) goto L_0x013f
            r2.set(r3, r12)
            r2.remove(r7)
            androidx.recyclerview.widget.n$a r3 = r1.f3289a
            androidx.recyclerview.widget.a r3 = (androidx.recyclerview.widget.a) r3
            r3.getClass()
            r11.f3160c = r10
            a1.e r3 = r3.f3152a
            r3.a(r11)
            goto L_0x0009
        L_0x013f:
            if (r6 == 0) goto L_0x0170
            if (r4 == 0) goto L_0x0159
            int r5 = r11.f3159b
            int r6 = r4.f3159b
            if (r5 <= r6) goto L_0x014e
            int r6 = r4.f3161d
            int r5 = r5 - r6
            r11.f3159b = r5
        L_0x014e:
            int r5 = r11.f3161d
            int r6 = r4.f3159b
            if (r5 <= r6) goto L_0x0159
            int r6 = r4.f3161d
            int r5 = r5 - r6
            r11.f3161d = r5
        L_0x0159:
            int r5 = r11.f3159b
            int r6 = r12.f3159b
            if (r5 <= r6) goto L_0x0164
            int r6 = r12.f3161d
            int r5 = r5 - r6
            r11.f3159b = r5
        L_0x0164:
            int r5 = r11.f3161d
            int r6 = r12.f3159b
            if (r5 <= r6) goto L_0x019e
            int r6 = r12.f3161d
            int r5 = r5 - r6
            r11.f3161d = r5
            goto L_0x019e
        L_0x0170:
            if (r4 == 0) goto L_0x0188
            int r5 = r11.f3159b
            int r6 = r4.f3159b
            if (r5 < r6) goto L_0x017d
            int r6 = r4.f3161d
            int r5 = r5 - r6
            r11.f3159b = r5
        L_0x017d:
            int r5 = r11.f3161d
            int r6 = r4.f3159b
            if (r5 < r6) goto L_0x0188
            int r6 = r4.f3161d
            int r5 = r5 - r6
            r11.f3161d = r5
        L_0x0188:
            int r5 = r11.f3159b
            int r6 = r12.f3159b
            if (r5 < r6) goto L_0x0193
            int r6 = r12.f3161d
            int r5 = r5 - r6
            r11.f3159b = r5
        L_0x0193:
            int r5 = r11.f3161d
            int r6 = r12.f3159b
            if (r5 < r6) goto L_0x019e
            int r6 = r12.f3161d
            int r5 = r5 - r6
            r11.f3161d = r5
        L_0x019e:
            r2.set(r3, r12)
            int r5 = r11.f3159b
            int r6 = r11.f3161d
            if (r5 == r6) goto L_0x01ab
            r2.set(r7, r11)
            goto L_0x01ae
        L_0x01ab:
            r2.remove(r7)
        L_0x01ae:
            if (r4 == 0) goto L_0x0009
            r2.add(r3, r4)
            goto L_0x0009
        L_0x01b5:
            int r4 = r11.f3161d
            int r6 = r12.f3159b
            if (r4 >= r6) goto L_0x01bd
            r5 = r8
            goto L_0x01be
        L_0x01bd:
            r5 = 0
        L_0x01be:
            int r8 = r11.f3159b
            if (r8 >= r6) goto L_0x01c4
            int r5 = r5 + 1
        L_0x01c4:
            if (r6 > r8) goto L_0x01cb
            int r6 = r12.f3161d
            int r8 = r8 + r6
            r11.f3159b = r8
        L_0x01cb:
            int r6 = r12.f3159b
            if (r6 > r4) goto L_0x01d4
            int r8 = r12.f3161d
            int r4 = r4 + r8
            r11.f3161d = r4
        L_0x01d4:
            int r6 = r6 + r5
            r12.f3159b = r6
            r2.set(r3, r12)
            r2.set(r7, r11)
            goto L_0x0009
        L_0x01df:
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r1 = r0.f3153b
            int r1 = r1.size()
            r2 = 0
        L_0x01e6:
            if (r2 >= r1) goto L_0x02bb
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r3 = r0.f3153b
            java.lang.Object r3 = r3.get(r2)
            androidx.recyclerview.widget.a$b r3 = (androidx.recyclerview.widget.a.b) r3
            int r11 = r3.f3158a
            if (r11 == r4) goto L_0x02b4
            if (r11 == r9) goto L_0x025a
            if (r11 == r6) goto L_0x0201
            if (r11 == r7) goto L_0x01fc
            goto L_0x02b7
        L_0x01fc:
            r0.i(r3)
            goto L_0x02b7
        L_0x0201:
            int r11 = r3.f3159b
            int r12 = r3.f3161d
            int r12 = r12 + r11
            r15 = r8
            r13 = r11
            r14 = 0
        L_0x0209:
            if (r11 >= r12) goto L_0x023d
            androidx.recyclerview.widget.a$a r5 = r0.f3155d
            androidx.recyclerview.widget.t r5 = (androidx.recyclerview.widget.t) r5
            androidx.recyclerview.widget.RecyclerView$a0 r5 = r5.b(r11)
            if (r5 != 0) goto L_0x022b
            boolean r5 = r0.a(r11)
            if (r5 == 0) goto L_0x021c
            goto L_0x022b
        L_0x021c:
            if (r15 != r4) goto L_0x0229
            java.lang.Object r5 = r3.f3160c
            androidx.recyclerview.widget.a$b r5 = r0.h(r5, r6, r13, r14)
            r0.i(r5)
            r13 = r11
            r14 = 0
        L_0x0229:
            r15 = 0
            goto L_0x0239
        L_0x022b:
            if (r15 != 0) goto L_0x0238
            java.lang.Object r5 = r3.f3160c
            androidx.recyclerview.widget.a$b r5 = r0.h(r5, r6, r13, r14)
            r0.d(r5)
            r13 = r11
            r14 = 0
        L_0x0238:
            r15 = r4
        L_0x0239:
            int r14 = r14 + r4
            int r11 = r11 + 1
            goto L_0x0209
        L_0x023d:
            int r5 = r3.f3161d
            if (r14 == r5) goto L_0x024e
            java.lang.Object r5 = r3.f3160c
            r3.f3160c = r10
            a1.e r11 = r0.f3152a
            r11.a(r3)
            androidx.recyclerview.widget.a$b r3 = r0.h(r5, r6, r13, r14)
        L_0x024e:
            if (r15 != 0) goto L_0x0255
            r0.d(r3)
            goto L_0x02b7
        L_0x0255:
            r0.i(r3)
            goto L_0x02b7
        L_0x025a:
            int r5 = r3.f3159b
            int r11 = r3.f3161d
            int r11 = r11 + r5
            r12 = r5
            r14 = r8
            r13 = 0
        L_0x0262:
            if (r12 >= r11) goto L_0x029b
            androidx.recyclerview.widget.a$a r15 = r0.f3155d
            androidx.recyclerview.widget.t r15 = (androidx.recyclerview.widget.t) r15
            androidx.recyclerview.widget.RecyclerView$a0 r15 = r15.b(r12)
            if (r15 != 0) goto L_0x0283
            boolean r15 = r0.a(r12)
            if (r15 == 0) goto L_0x0275
            goto L_0x0283
        L_0x0275:
            if (r14 != r4) goto L_0x0280
            androidx.recyclerview.widget.a$b r14 = r0.h(r10, r9, r5, r13)
            r0.i(r14)
            r14 = r4
            goto L_0x0281
        L_0x0280:
            r14 = 0
        L_0x0281:
            r15 = 0
            goto L_0x0290
        L_0x0283:
            if (r14 != 0) goto L_0x028e
            androidx.recyclerview.widget.a$b r14 = r0.h(r10, r9, r5, r13)
            r0.d(r14)
            r14 = r4
            goto L_0x028f
        L_0x028e:
            r14 = 0
        L_0x028f:
            r15 = r4
        L_0x0290:
            if (r14 == 0) goto L_0x0296
            int r12 = r12 - r13
            int r11 = r11 - r13
            r13 = r4
            goto L_0x0298
        L_0x0296:
            int r13 = r13 + 1
        L_0x0298:
            int r12 = r12 + r4
            r14 = r15
            goto L_0x0262
        L_0x029b:
            int r11 = r3.f3161d
            if (r13 == r11) goto L_0x02aa
            r3.f3160c = r10
            a1.e r11 = r0.f3152a
            r11.a(r3)
            androidx.recyclerview.widget.a$b r3 = r0.h(r10, r9, r5, r13)
        L_0x02aa:
            if (r14 != 0) goto L_0x02b0
            r0.d(r3)
            goto L_0x02b7
        L_0x02b0:
            r0.i(r3)
            goto L_0x02b7
        L_0x02b4:
            r0.i(r3)
        L_0x02b7:
            int r2 = r2 + 1
            goto L_0x01e6
        L_0x02bb:
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r1 = r0.f3153b
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.a.j():void");
    }

    public final void k(b bVar) {
        bVar.f3160c = null;
        this.f3152a.a(bVar);
    }

    public final void l(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            k((b) arrayList.get(i10));
        }
        arrayList.clear();
    }

    public final int m(int i10, int i11) {
        int i12;
        int i13;
        for (int size = this.f3154c.size() - 1; size >= 0; size--) {
            b bVar = this.f3154c.get(size);
            int i14 = bVar.f3158a;
            if (i14 == 8) {
                int i15 = bVar.f3159b;
                int i16 = bVar.f3161d;
                if (i15 < i16) {
                    i13 = i15;
                    i12 = i16;
                } else {
                    i12 = i15;
                    i13 = i16;
                }
                if (i10 < i13 || i10 > i12) {
                    if (i10 < i15) {
                        if (i11 == 1) {
                            bVar.f3159b = i15 + 1;
                            bVar.f3161d = i16 + 1;
                        } else if (i11 == 2) {
                            bVar.f3159b = i15 - 1;
                            bVar.f3161d = i16 - 1;
                        }
                    }
                } else if (i13 == i15) {
                    if (i11 == 1) {
                        bVar.f3161d = i16 + 1;
                    } else if (i11 == 2) {
                        bVar.f3161d = i16 - 1;
                    }
                    i10++;
                } else {
                    if (i11 == 1) {
                        bVar.f3159b = i15 + 1;
                    } else if (i11 == 2) {
                        bVar.f3159b = i15 - 1;
                    }
                    i10--;
                }
            } else {
                int i17 = bVar.f3159b;
                if (i17 <= i10) {
                    if (i14 == 1) {
                        i10 -= bVar.f3161d;
                    } else if (i14 == 2) {
                        i10 += bVar.f3161d;
                    }
                } else if (i11 == 1) {
                    bVar.f3159b = i17 + 1;
                } else if (i11 == 2) {
                    bVar.f3159b = i17 - 1;
                }
            }
        }
        for (int size2 = this.f3154c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = this.f3154c.get(size2);
            if (bVar2.f3158a == 8) {
                int i18 = bVar2.f3161d;
                if (i18 == bVar2.f3159b || i18 < 0) {
                    this.f3154c.remove(size2);
                    k(bVar2);
                }
            } else if (bVar2.f3161d <= 0) {
                this.f3154c.remove(size2);
                k(bVar2);
            }
        }
        return i10;
    }
}
