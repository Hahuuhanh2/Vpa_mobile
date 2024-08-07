package j0;

import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.impl.o;
import androidx.camera.core.impl.x;
import c0.p0;
import f0.q;
import g0.a;
import g0.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: SupportedOutputSizesSorter */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final q f11455a;

    /* renamed from: b  reason: collision with root package name */
    public final int f11456b;

    /* renamed from: c  reason: collision with root package name */
    public final int f11457c;

    /* renamed from: d  reason: collision with root package name */
    public final Rational f11458d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f11459e;

    /* renamed from: f  reason: collision with root package name */
    public final g f11460f;

    public f(q qVar, Size size) {
        Rational rational;
        this.f11455a = qVar;
        this.f11456b = qVar.a();
        this.f11457c = qVar.f();
        boolean z10 = false;
        if (size != null) {
            rational = new Rational(size.getWidth(), size.getHeight());
        } else {
            List<Size> m10 = qVar.m(256);
            if (m10.isEmpty()) {
                rational = null;
            } else {
                Size size2 = (Size) Collections.max(m10, new c(false));
                rational = new Rational(size2.getWidth(), size2.getHeight());
            }
        }
        this.f11458d = rational;
        this.f11459e = (rational == null || rational.getNumerator() >= rational.getDenominator()) ? true : z10;
        this.f11460f = new g(qVar, rational);
    }

    public static ArrayList b(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(a.f10214a);
        arrayList2.add(a.f10216c);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            Rational rational = new Rational(size.getWidth(), size.getHeight());
            if (!arrayList2.contains(rational)) {
                boolean z10 = false;
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (a.a(size, (Rational) it2.next())) {
                            z10 = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (!z10) {
                    arrayList2.add(rational);
                }
            }
        }
        return arrayList2;
    }

    public static Rational d(int i10, boolean z10) {
        if (i10 != -1) {
            if (i10 != 0) {
                if (i10 != 1) {
                    p0.b("SupportedOutputSizesCollector");
                } else if (z10) {
                    return a.f10216c;
                } else {
                    return a.f10217d;
                }
            } else if (z10) {
                return a.f10214a;
            } else {
                return a.f10215b;
            }
        }
        return null;
    }

    public static HashMap e(ArrayList arrayList) {
        HashMap hashMap = new HashMap();
        Iterator it = b(arrayList).iterator();
        while (it.hasNext()) {
            hashMap.put((Rational) it.next(), new ArrayList());
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Size size = (Size) it2.next();
            for (Rational rational : hashMap.keySet()) {
                if (a.a(size, rational)) {
                    ((List) hashMap.get(rational)).add(size);
                }
            }
        }
        return hashMap;
    }

    public static void f(List<Size> list, Size size, boolean z10) {
        ArrayList arrayList = new ArrayList();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            Size size3 = list.get(size2);
            if (size3.getWidth() >= size.getWidth() && size3.getHeight() >= size.getHeight()) {
                break;
            }
            arrayList.add(0, size3);
        }
        list.removeAll(arrayList);
        Collections.reverse(list);
        if (z10) {
            list.addAll(arrayList);
        }
    }

    public static void g(List<Size> list, Size size, boolean z10) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            Size size2 = list.get(i10);
            if (size2.getWidth() <= size.getWidth() && size2.getHeight() <= size.getHeight()) {
                break;
            }
            arrayList.add(0, size2);
        }
        list.removeAll(arrayList);
        if (z10) {
            list.addAll(arrayList);
        }
    }

    public final ArrayList a(x xVar) {
        Size[] sizeArr;
        int l10 = xVar.l();
        List i10 = ((o) xVar).i();
        List<Size> list = null;
        if (i10 != null) {
            Iterator it = i10.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Pair pair = (Pair) it.next();
                if (((Integer) pair.first).intValue() == l10) {
                    sizeArr = (Size[]) pair.second;
                    break;
                }
            }
        }
        sizeArr = null;
        if (sizeArr != null) {
            list = Arrays.asList(sizeArr);
        }
        if (list == null) {
            list = this.f11455a.m(l10);
        }
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList, new c(true));
        if (arrayList.isEmpty()) {
            p0.g("SupportedOutputSizesCollector");
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0050, code lost:
        if (m0.a.a(r3) < (r5.getHeight() * r5.getWidth())) goto L_0x0052;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<android.util.Size> c(androidx.camera.core.impl.x<?> r13) {
        /*
            r12 = this;
            r0 = r13
            androidx.camera.core.impl.o r0 = (androidx.camera.core.impl.o) r0
            java.util.ArrayList r1 = r0.r()
            if (r1 == 0) goto L_0x000a
            return r1
        L_0x000a:
            o0.b r1 = r0.s()
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x01a0
            j0.g r0 = r12.f11460f
            java.util.ArrayList r1 = r12.a(r13)
            r0.getClass()
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto L_0x0023
            goto L_0x0178
        L_0x0023:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r1)
            g0.c r1 = new g0.c
            r1.<init>(r2)
            java.util.Collections.sort(r4, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            androidx.camera.core.impl.o r13 = (androidx.camera.core.impl.o) r13
            android.util.Size r5 = r13.H()
            java.lang.Object r3 = r4.get(r3)
            android.util.Size r3 = (android.util.Size) r3
            if (r5 == 0) goto L_0x0052
            int r6 = m0.a.a(r3)
            int r7 = r5.getWidth()
            int r8 = r5.getHeight()
            int r8 = r8 * r7
            if (r6 >= r8) goto L_0x0053
        L_0x0052:
            r5 = r3
        L_0x0053:
            android.util.Size r3 = r0.a(r13)
            android.util.Size r6 = m0.a.f13037b
            int r7 = m0.a.a(r6)
            int r8 = m0.a.a(r5)
            if (r8 >= r7) goto L_0x0066
            android.util.Size r6 = m0.a.f13036a
            goto L_0x0074
        L_0x0066:
            if (r3 == 0) goto L_0x0074
            int r8 = r3.getWidth()
            int r9 = r3.getHeight()
            int r9 = r9 * r8
            if (r9 >= r7) goto L_0x0074
            r6 = r3
        L_0x0074:
            java.util.Iterator r7 = r4.iterator()
        L_0x0078:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x00ac
            java.lang.Object r8 = r7.next()
            android.util.Size r8 = (android.util.Size) r8
            int r9 = m0.a.a(r8)
            int r10 = r5.getWidth()
            int r11 = r5.getHeight()
            int r11 = r11 * r10
            if (r9 > r11) goto L_0x0078
            int r9 = r8.getWidth()
            int r10 = r8.getHeight()
            int r10 = r10 * r9
            int r9 = m0.a.a(r6)
            if (r10 < r9) goto L_0x0078
            boolean r9 = r1.contains(r8)
            if (r9 != 0) goto L_0x0078
            r1.add(r8)
            goto L_0x0078
        L_0x00ac:
            boolean r7 = r1.isEmpty()
            if (r7 != 0) goto L_0x0179
            boolean r4 = r13.E()
            if (r4 == 0) goto L_0x00c3
            int r4 = r13.F()
            boolean r5 = r0.f11464d
            android.util.Rational r4 = d(r4, r5)
            goto L_0x00f5
        L_0x00c3:
            android.util.Size r4 = r0.a(r13)
            if (r4 == 0) goto L_0x00f4
            java.util.ArrayList r5 = b(r1)
            java.util.Iterator r5 = r5.iterator()
        L_0x00d1:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x00e5
            java.lang.Object r6 = r5.next()
            android.util.Rational r6 = (android.util.Rational) r6
            boolean r7 = g0.a.a(r4, r6)
            if (r7 == 0) goto L_0x00d1
            r4 = r6
            goto L_0x00f5
        L_0x00e5:
            android.util.Rational r5 = new android.util.Rational
            int r6 = r4.getWidth()
            int r4 = r4.getHeight()
            r5.<init>(r6, r4)
            r4 = r5
            goto L_0x00f5
        L_0x00f4:
            r4 = 0
        L_0x00f5:
            if (r3 != 0) goto L_0x00fb
            android.util.Size r3 = r13.u()
        L_0x00fb:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            if (r4 != 0) goto L_0x0110
            r13.addAll(r1)
            if (r3 == 0) goto L_0x0177
            f(r13, r3, r2)
            goto L_0x0177
        L_0x0110:
            java.util.HashMap r1 = e(r1)
            if (r3 == 0) goto L_0x0134
            java.util.Set r5 = r1.keySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x011e:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0134
            java.lang.Object r6 = r5.next()
            android.util.Rational r6 = (android.util.Rational) r6
            java.lang.Object r6 = r1.get(r6)
            java.util.List r6 = (java.util.List) r6
            f(r6, r3, r2)
            goto L_0x011e
        L_0x0134:
            java.util.ArrayList r2 = new java.util.ArrayList
            java.util.Set r3 = r1.keySet()
            r2.<init>(r3)
            g0.a$a r3 = new g0.a$a
            android.util.Rational r0 = r0.f11463c
            r3.<init>(r4, r0)
            java.util.Collections.sort(r2, r3)
            java.util.Iterator r0 = r2.iterator()
        L_0x014b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0177
            java.lang.Object r2 = r0.next()
            android.util.Rational r2 = (android.util.Rational) r2
            java.lang.Object r2 = r1.get(r2)
            java.util.List r2 = (java.util.List) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x0161:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x014b
            java.lang.Object r3 = r2.next()
            android.util.Size r3 = (android.util.Size) r3
            boolean r4 = r13.contains(r3)
            if (r4 != 0) goto L_0x0161
            r13.add(r3)
            goto L_0x0161
        L_0x0177:
            r1 = r13
        L_0x0178:
            return r1
        L_0x0179:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "All supported output sizes are filtered out according to current resolution selection settings. \nminSize = "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r1 = "\nmaxSize = "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r1 = "\ninitial size list: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            r13.<init>(r0)
            throw r13
        L_0x01a0:
            o0.b r0 = r0.j()
            java.util.ArrayList r1 = r12.a(r13)
            boolean r4 = r13.B()
            if (r4 != 0) goto L_0x01d0
            int r4 = r13.l()
            int r5 = r0.f13615c
            if (r5 != r2) goto L_0x01d0
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r5.addAll(r1)
            f0.q r1 = r12.f11455a
            java.util.List r1 = r1.i(r4)
            r5.addAll(r1)
            g0.c r1 = new g0.c
            r1.<init>(r2)
            java.util.Collections.sort(r5, r1)
            r1 = r5
        L_0x01d0:
            p3.l0 r4 = r0.f13613a
            java.util.HashMap r1 = e(r1)
            r4.getClass()
            boolean r4 = r12.f11459e
            android.util.Rational r4 = d(r3, r4)
            java.util.ArrayList r5 = new java.util.ArrayList
            java.util.Set r6 = r1.keySet()
            r5.<init>(r6)
            g0.a$a r6 = new g0.a$a
            android.util.Rational r7 = r12.f11458d
            r6.<init>(r4, r7)
            java.util.Collections.sort(r5, r6)
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x01fb:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0211
            java.lang.Object r6 = r5.next()
            android.util.Rational r6 = (android.util.Rational) r6
            java.lang.Object r7 = r1.get(r6)
            java.util.List r7 = (java.util.List) r7
            r4.put(r6, r7)
            goto L_0x01fb
        L_0x0211:
            androidx.camera.core.impl.o r13 = (androidx.camera.core.impl.o) r13
            android.util.Size r1 = r13.H()
            if (r1 == 0) goto L_0x0264
            android.util.Size r5 = m0.a.f13036a
            int r5 = r1.getWidth()
            int r1 = r1.getHeight()
            int r1 = r1 * r5
            java.util.Set r5 = r4.keySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x022c:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0264
            java.lang.Object r6 = r5.next()
            android.util.Rational r6 = (android.util.Rational) r6
            java.lang.Object r6 = r4.get(r6)
            java.util.List r6 = (java.util.List) r6
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r8 = r6.iterator()
        L_0x0247:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x025d
            java.lang.Object r9 = r8.next()
            android.util.Size r9 = (android.util.Size) r9
            int r10 = m0.a.a(r9)
            if (r10 > r1) goto L_0x0247
            r7.add(r9)
            goto L_0x0247
        L_0x025d:
            r6.clear()
            r6.addAll(r7)
            goto L_0x022c
        L_0x0264:
            o0.c r1 = r0.f13614b
            if (r1 != 0) goto L_0x0269
            goto L_0x02ca
        L_0x0269:
            java.util.Set r5 = r4.keySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x0271:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x02ca
            java.lang.Object r6 = r5.next()
            android.util.Rational r6 = (android.util.Rational) r6
            java.lang.Object r6 = r4.get(r6)
            java.util.List r6 = (java.util.List) r6
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto L_0x028a
            goto L_0x0271
        L_0x028a:
            int r7 = r1.f13618b
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            o0.c r8 = o0.c.f13616c
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto L_0x0299
            goto L_0x0271
        L_0x0299:
            android.util.Size r8 = r1.f13617a
            int r7 = r7.intValue()
            if (r7 == 0) goto L_0x02bd
            if (r7 == r2) goto L_0x02b9
            r9 = 2
            if (r7 == r9) goto L_0x02b5
            r9 = 3
            if (r7 == r9) goto L_0x02b1
            r9 = 4
            if (r7 == r9) goto L_0x02ad
            goto L_0x0271
        L_0x02ad:
            g(r6, r8, r3)
            goto L_0x0271
        L_0x02b1:
            g(r6, r8, r2)
            goto L_0x0271
        L_0x02b5:
            f(r6, r8, r3)
            goto L_0x0271
        L_0x02b9:
            f(r6, r8, r2)
            goto L_0x0271
        L_0x02bd:
            boolean r7 = r6.contains(r8)
            r6.clear()
            if (r7 == 0) goto L_0x0271
            r6.add(r8)
            goto L_0x0271
        L_0x02ca:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Collection r2 = r4.values()
            java.util.Iterator r2 = r2.iterator()
        L_0x02d7:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x02fd
            java.lang.Object r3 = r2.next()
            java.util.List r3 = (java.util.List) r3
            java.util.Iterator r3 = r3.iterator()
        L_0x02e7:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x02d7
            java.lang.Object r4 = r3.next()
            android.util.Size r4 = (android.util.Size) r4
            boolean r5 = r1.contains(r4)
            if (r5 != 0) goto L_0x02e7
            r1.add(r4)
            goto L_0x02e7
        L_0x02fd:
            r0.getClass()
            r13.x()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.f.c(androidx.camera.core.impl.x):java.util.List");
    }
}
