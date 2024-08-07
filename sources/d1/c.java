package d1;

import c1.d;
import c1.e;
import c1.f;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: ChainRun */
public final class c extends p {

    /* renamed from: k  reason: collision with root package name */
    public ArrayList<p> f8493k = new ArrayList<>();

    /* renamed from: l  reason: collision with root package name */
    public int f8494l;

    public c(int i10, e eVar) {
        super(eVar);
        Object obj;
        boolean z10;
        int i11;
        Object obj2;
        this.f8533f = i10;
        e eVar2 = this.f8529b;
        e q10 = eVar2.q(i10);
        while (q10 != null) {
            eVar2 = q10;
            q10 = q10.q(this.f8533f);
        }
        this.f8529b = eVar2;
        ArrayList<p> arrayList = this.f8493k;
        int i12 = this.f8533f;
        if (i12 == 0) {
            obj = eVar2.f4425d;
        } else if (i12 == 1) {
            obj = eVar2.f4427e;
        } else {
            obj = null;
        }
        arrayList.add(obj);
        e p10 = eVar2.p(this.f8533f);
        while (p10 != null) {
            ArrayList<p> arrayList2 = this.f8493k;
            int i13 = this.f8533f;
            if (i13 == 0) {
                obj2 = p10.f4425d;
            } else if (i13 == 1) {
                obj2 = p10.f4427e;
            } else {
                obj2 = null;
            }
            arrayList2.add(obj2);
            p10 = p10.p(this.f8533f);
        }
        Iterator<p> it = this.f8493k.iterator();
        while (it.hasNext()) {
            p next = it.next();
            int i14 = this.f8533f;
            if (i14 == 0) {
                next.f8529b.f4421b = this;
            } else if (i14 == 1) {
                next.f8529b.f4423c = this;
            }
        }
        if (this.f8533f != 0 || !((f) this.f8529b.W).B0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10 && this.f8493k.size() > 1) {
            ArrayList<p> arrayList3 = this.f8493k;
            this.f8529b = arrayList3.get(arrayList3.size() - 1).f8529b;
        }
        if (this.f8533f == 0) {
            i11 = this.f8529b.f4446n0;
        } else {
            i11 = this.f8529b.f4448o0;
        }
        this.f8494l = i11;
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00db  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(d1.d r27) {
        /*
            r26 = this;
            r0 = r26
            c1.e$a r1 = c1.e.a.MATCH_CONSTRAINT
            d1.f r2 = r0.f8535h
            boolean r3 = r2.f8512j
            if (r3 == 0) goto L_0x03f6
            d1.f r3 = r0.f8536i
            boolean r4 = r3.f8512j
            if (r4 != 0) goto L_0x0012
            goto L_0x03f6
        L_0x0012:
            c1.e r4 = r0.f8529b
            c1.e r4 = r4.W
            boolean r5 = r4 instanceof c1.f
            if (r5 == 0) goto L_0x001f
            c1.f r4 = (c1.f) r4
            boolean r4 = r4.B0
            goto L_0x0020
        L_0x001f:
            r4 = 0
        L_0x0020:
            int r3 = r3.f8509g
            int r2 = r2.f8509g
            int r3 = r3 - r2
            java.util.ArrayList<d1.p> r2 = r0.f8493k
            int r2 = r2.size()
            r5 = 0
        L_0x002c:
            r7 = -1
            r8 = 8
            if (r5 >= r2) goto L_0x0042
            java.util.ArrayList<d1.p> r9 = r0.f8493k
            java.lang.Object r9 = r9.get(r5)
            d1.p r9 = (d1.p) r9
            c1.e r9 = r9.f8529b
            int r9 = r9.f4438j0
            if (r9 != r8) goto L_0x0043
            int r5 = r5 + 1
            goto L_0x002c
        L_0x0042:
            r5 = r7
        L_0x0043:
            int r9 = r2 + -1
            r10 = r9
        L_0x0046:
            if (r10 < 0) goto L_0x005a
            java.util.ArrayList<d1.p> r11 = r0.f8493k
            java.lang.Object r11 = r11.get(r10)
            d1.p r11 = (d1.p) r11
            c1.e r11 = r11.f8529b
            int r11 = r11.f4438j0
            if (r11 != r8) goto L_0x0059
            int r10 = r10 + -1
            goto L_0x0046
        L_0x0059:
            r7 = r10
        L_0x005a:
            r10 = 0
        L_0x005b:
            r12 = 2
            if (r10 >= r12) goto L_0x00fd
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
        L_0x0066:
            if (r14 >= r2) goto L_0x00ed
            java.util.ArrayList<d1.p> r6 = r0.f8493k
            java.lang.Object r6 = r6.get(r14)
            d1.p r6 = (d1.p) r6
            c1.e r12 = r6.f8529b
            int r11 = r12.f4438j0
            if (r11 != r8) goto L_0x0078
            goto L_0x00e6
        L_0x0078:
            int r17 = r17 + 1
            if (r14 <= 0) goto L_0x0083
            if (r14 < r5) goto L_0x0083
            d1.f r11 = r6.f8535h
            int r11 = r11.f8508f
            int r15 = r15 + r11
        L_0x0083:
            d1.g r11 = r6.f8532e
            int r8 = r11.f8509g
            c1.e$a r13 = r6.f8531d
            if (r13 == r1) goto L_0x008d
            r13 = 1
            goto L_0x008e
        L_0x008d:
            r13 = 0
        L_0x008e:
            if (r13 == 0) goto L_0x00ae
            int r11 = r0.f8533f
            r20 = r8
            if (r11 != 0) goto L_0x009f
            d1.l r8 = r12.f4425d
            d1.g r8 = r8.f8532e
            boolean r8 = r8.f8512j
            if (r8 != 0) goto L_0x009f
            return
        L_0x009f:
            r8 = 1
            if (r11 != r8) goto L_0x00ab
            d1.n r11 = r12.f4427e
            d1.g r11 = r11.f8532e
            boolean r11 = r11.f8512j
            if (r11 != 0) goto L_0x00ab
            return
        L_0x00ab:
            r21 = r13
            goto L_0x00c7
        L_0x00ae:
            r20 = r8
            r21 = r13
            r8 = 1
            int r13 = r6.f8528a
            if (r13 != r8) goto L_0x00be
            if (r10 != 0) goto L_0x00be
            int r8 = r11.f8515m
            int r16 = r16 + 1
            goto L_0x00c4
        L_0x00be:
            boolean r8 = r11.f8512j
            if (r8 == 0) goto L_0x00c7
            r8 = r20
        L_0x00c4:
            r21 = 1
            goto L_0x00c9
        L_0x00c7:
            r8 = r20
        L_0x00c9:
            if (r21 != 0) goto L_0x00db
            int r16 = r16 + 1
            float[] r8 = r12.f4450p0
            int r11 = r0.f8533f
            r8 = r8[r11]
            r11 = 0
            int r12 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r12 < 0) goto L_0x00dc
            float r18 = r18 + r8
            goto L_0x00dc
        L_0x00db:
            int r15 = r15 + r8
        L_0x00dc:
            if (r14 >= r9) goto L_0x00e6
            if (r14 >= r7) goto L_0x00e6
            d1.f r6 = r6.f8536i
            int r6 = r6.f8508f
            int r6 = -r6
            int r15 = r15 + r6
        L_0x00e6:
            int r14 = r14 + 1
            r8 = 8
            r12 = 2
            goto L_0x0066
        L_0x00ed:
            if (r15 < r3) goto L_0x00f8
            if (r16 != 0) goto L_0x00f2
            goto L_0x00f8
        L_0x00f2:
            int r10 = r10 + 1
            r8 = 8
            goto L_0x005b
        L_0x00f8:
            r6 = r16
            r8 = r17
            goto L_0x0102
        L_0x00fd:
            r6 = 0
            r8 = 0
            r15 = 0
            r18 = 0
        L_0x0102:
            d1.f r10 = r0.f8535h
            int r10 = r10.f8509g
            if (r4 == 0) goto L_0x010c
            d1.f r10 = r0.f8536i
            int r10 = r10.f8509g
        L_0x010c:
            r11 = 1056964608(0x3f000000, float:0.5)
            if (r15 <= r3) goto L_0x0123
            r12 = 1073741824(0x40000000, float:2.0)
            if (r4 == 0) goto L_0x011c
            int r13 = r15 - r3
            float r13 = (float) r13
            float r13 = r13 / r12
            float r13 = r13 + r11
            int r12 = (int) r13
            int r10 = r10 + r12
            goto L_0x0123
        L_0x011c:
            int r13 = r15 - r3
            float r13 = (float) r13
            float r13 = r13 / r12
            float r13 = r13 + r11
            int r12 = (int) r13
            int r10 = r10 - r12
        L_0x0123:
            if (r6 <= 0) goto L_0x0204
            int r12 = r3 - r15
            float r12 = (float) r12
            float r13 = (float) r6
            float r13 = r12 / r13
            float r13 = r13 + r11
            int r13 = (int) r13
            r14 = 0
            r16 = 0
        L_0x0130:
            if (r14 >= r2) goto L_0x01b7
            java.util.ArrayList<d1.p> r11 = r0.f8493k
            java.lang.Object r11 = r11.get(r14)
            d1.p r11 = (d1.p) r11
            r20 = r13
            c1.e r13 = r11.f8529b
            r21 = r15
            int r15 = r13.f4438j0
            r22 = r10
            r10 = 8
            if (r15 != r10) goto L_0x0149
            goto L_0x019f
        L_0x0149:
            c1.e$a r10 = r11.f8531d
            if (r10 != r1) goto L_0x019f
            d1.g r10 = r11.f8532e
            boolean r15 = r10.f8512j
            if (r15 != 0) goto L_0x019f
            r15 = 0
            int r19 = (r18 > r15 ? 1 : (r18 == r15 ? 0 : -1))
            if (r19 <= 0) goto L_0x0168
            float[] r15 = r13.f4450p0
            r23 = r1
            int r1 = r0.f8533f
            r1 = r15[r1]
            float r1 = r1 * r12
            float r1 = r1 / r18
            r15 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r15
            int r1 = (int) r1
            goto L_0x016c
        L_0x0168:
            r23 = r1
            r1 = r20
        L_0x016c:
            int r15 = r0.f8533f
            if (r15 != 0) goto L_0x0175
            int r15 = r13.f4463w
            int r13 = r13.f4461v
            goto L_0x0179
        L_0x0175:
            int r15 = r13.f4466z
            int r13 = r13.f4465y
        L_0x0179:
            r24 = r12
            int r12 = r11.f8528a
            r25 = r4
            r4 = 1
            if (r12 != r4) goto L_0x0189
            int r4 = r10.f8515m
            int r4 = java.lang.Math.min(r1, r4)
            goto L_0x018a
        L_0x0189:
            r4 = r1
        L_0x018a:
            int r4 = java.lang.Math.max(r13, r4)
            if (r15 <= 0) goto L_0x0194
            int r4 = java.lang.Math.min(r15, r4)
        L_0x0194:
            if (r4 == r1) goto L_0x0199
            int r16 = r16 + 1
            r1 = r4
        L_0x0199:
            d1.g r4 = r11.f8532e
            r4.d(r1)
            goto L_0x01a5
        L_0x019f:
            r23 = r1
            r25 = r4
            r24 = r12
        L_0x01a5:
            int r14 = r14 + 1
            r13 = r20
            r15 = r21
            r10 = r22
            r1 = r23
            r12 = r24
            r4 = r25
            r11 = 1056964608(0x3f000000, float:0.5)
            goto L_0x0130
        L_0x01b7:
            r23 = r1
            r25 = r4
            r22 = r10
            r21 = r15
            if (r16 <= 0) goto L_0x01f5
            int r6 = r6 - r16
            r1 = 0
            r4 = 0
        L_0x01c5:
            if (r1 >= r2) goto L_0x01f3
            java.util.ArrayList<d1.p> r10 = r0.f8493k
            java.lang.Object r10 = r10.get(r1)
            d1.p r10 = (d1.p) r10
            c1.e r11 = r10.f8529b
            int r11 = r11.f4438j0
            r12 = 8
            if (r11 != r12) goto L_0x01d8
            goto L_0x01f0
        L_0x01d8:
            if (r1 <= 0) goto L_0x01e1
            if (r1 < r5) goto L_0x01e1
            d1.f r11 = r10.f8535h
            int r11 = r11.f8508f
            int r4 = r4 + r11
        L_0x01e1:
            d1.g r11 = r10.f8532e
            int r11 = r11.f8509g
            int r4 = r4 + r11
            if (r1 >= r9) goto L_0x01f0
            if (r1 >= r7) goto L_0x01f0
            d1.f r10 = r10.f8536i
            int r10 = r10.f8508f
            int r10 = -r10
            int r4 = r4 + r10
        L_0x01f0:
            int r1 = r1 + 1
            goto L_0x01c5
        L_0x01f3:
            r15 = r4
            goto L_0x01f7
        L_0x01f5:
            r15 = r21
        L_0x01f7:
            int r1 = r0.f8494l
            r4 = 2
            if (r1 != r4) goto L_0x0202
            if (r16 != 0) goto L_0x0202
            r1 = 0
            r0.f8494l = r1
            goto L_0x020e
        L_0x0202:
            r1 = 0
            goto L_0x020e
        L_0x0204:
            r23 = r1
            r25 = r4
            r22 = r10
            r21 = r15
            r1 = 0
            r4 = 2
        L_0x020e:
            if (r15 <= r3) goto L_0x0212
            r0.f8494l = r4
        L_0x0212:
            if (r8 <= 0) goto L_0x021a
            if (r6 != 0) goto L_0x021a
            if (r5 != r7) goto L_0x021a
            r0.f8494l = r4
        L_0x021a:
            int r4 = r0.f8494l
            r10 = 1
            if (r4 != r10) goto L_0x02bd
            if (r8 <= r10) goto L_0x0225
            int r3 = r3 - r15
            int r8 = r8 - r10
            int r3 = r3 / r8
            goto L_0x022c
        L_0x0225:
            if (r8 != r10) goto L_0x022b
            int r3 = r3 - r15
            r4 = 2
            int r3 = r3 / r4
            goto L_0x022c
        L_0x022b:
            r3 = r1
        L_0x022c:
            if (r6 <= 0) goto L_0x022f
            r3 = r1
        L_0x022f:
            r6 = r1
            r10 = r22
        L_0x0232:
            if (r6 >= r2) goto L_0x03f6
            if (r25 == 0) goto L_0x023b
            int r1 = r6 + 1
            int r1 = r2 - r1
            goto L_0x023c
        L_0x023b:
            r1 = r6
        L_0x023c:
            java.util.ArrayList<d1.p> r4 = r0.f8493k
            java.lang.Object r1 = r4.get(r1)
            d1.p r1 = (d1.p) r1
            c1.e r4 = r1.f8529b
            int r4 = r4.f4438j0
            r8 = 8
            if (r4 != r8) goto L_0x0259
            d1.f r4 = r1.f8535h
            r4.d(r10)
            d1.f r1 = r1.f8536i
            r1.d(r10)
            r12 = r23
            goto L_0x02b7
        L_0x0259:
            if (r6 <= 0) goto L_0x0260
            if (r25 == 0) goto L_0x025f
            int r10 = r10 - r3
            goto L_0x0260
        L_0x025f:
            int r10 = r10 + r3
        L_0x0260:
            if (r6 <= 0) goto L_0x0271
            if (r6 < r5) goto L_0x0271
            if (r25 == 0) goto L_0x026c
            d1.f r4 = r1.f8535h
            int r4 = r4.f8508f
            int r10 = r10 - r4
            goto L_0x0271
        L_0x026c:
            d1.f r4 = r1.f8535h
            int r4 = r4.f8508f
            int r10 = r10 + r4
        L_0x0271:
            if (r25 == 0) goto L_0x0279
            d1.f r4 = r1.f8536i
            r4.d(r10)
            goto L_0x027e
        L_0x0279:
            d1.f r4 = r1.f8535h
            r4.d(r10)
        L_0x027e:
            d1.g r4 = r1.f8532e
            int r8 = r4.f8509g
            c1.e$a r11 = r1.f8531d
            r12 = r23
            if (r11 != r12) goto L_0x028f
            int r11 = r1.f8528a
            r13 = 1
            if (r11 != r13) goto L_0x028f
            int r8 = r4.f8515m
        L_0x028f:
            if (r25 == 0) goto L_0x0293
            int r10 = r10 - r8
            goto L_0x0294
        L_0x0293:
            int r10 = r10 + r8
        L_0x0294:
            if (r25 == 0) goto L_0x029c
            d1.f r4 = r1.f8535h
            r4.d(r10)
            goto L_0x02a1
        L_0x029c:
            d1.f r4 = r1.f8536i
            r4.d(r10)
        L_0x02a1:
            r4 = 1
            r1.f8534g = r4
            if (r6 >= r9) goto L_0x02b7
            if (r6 >= r7) goto L_0x02b7
            if (r25 == 0) goto L_0x02b1
            d1.f r1 = r1.f8536i
            int r1 = r1.f8508f
            int r1 = -r1
            int r10 = r10 - r1
            goto L_0x02b7
        L_0x02b1:
            d1.f r1 = r1.f8536i
            int r1 = r1.f8508f
            int r1 = -r1
            int r10 = r10 + r1
        L_0x02b7:
            int r6 = r6 + 1
            r23 = r12
            goto L_0x0232
        L_0x02bd:
            r12 = r23
            if (r4 != 0) goto L_0x034f
            int r3 = r3 - r15
            r4 = 1
            int r8 = r8 + r4
            int r3 = r3 / r8
            if (r6 <= 0) goto L_0x02c8
            r3 = r1
        L_0x02c8:
            r6 = r1
            r10 = r22
        L_0x02cb:
            if (r6 >= r2) goto L_0x03f6
            if (r25 == 0) goto L_0x02d4
            int r1 = r6 + 1
            int r1 = r2 - r1
            goto L_0x02d5
        L_0x02d4:
            r1 = r6
        L_0x02d5:
            java.util.ArrayList<d1.p> r4 = r0.f8493k
            java.lang.Object r1 = r4.get(r1)
            d1.p r1 = (d1.p) r1
            c1.e r4 = r1.f8529b
            int r4 = r4.f4438j0
            r8 = 8
            if (r4 != r8) goto L_0x02f0
            d1.f r4 = r1.f8535h
            r4.d(r10)
            d1.f r1 = r1.f8536i
            r1.d(r10)
            goto L_0x034b
        L_0x02f0:
            if (r25 == 0) goto L_0x02f4
            int r10 = r10 - r3
            goto L_0x02f5
        L_0x02f4:
            int r10 = r10 + r3
        L_0x02f5:
            if (r6 <= 0) goto L_0x0306
            if (r6 < r5) goto L_0x0306
            if (r25 == 0) goto L_0x0301
            d1.f r4 = r1.f8535h
            int r4 = r4.f8508f
            int r10 = r10 - r4
            goto L_0x0306
        L_0x0301:
            d1.f r4 = r1.f8535h
            int r4 = r4.f8508f
            int r10 = r10 + r4
        L_0x0306:
            if (r25 == 0) goto L_0x030e
            d1.f r4 = r1.f8536i
            r4.d(r10)
            goto L_0x0313
        L_0x030e:
            d1.f r4 = r1.f8535h
            r4.d(r10)
        L_0x0313:
            d1.g r4 = r1.f8532e
            int r8 = r4.f8509g
            c1.e$a r11 = r1.f8531d
            if (r11 != r12) goto L_0x0326
            int r11 = r1.f8528a
            r13 = 1
            if (r11 != r13) goto L_0x0326
            int r4 = r4.f8515m
            int r8 = java.lang.Math.min(r8, r4)
        L_0x0326:
            if (r25 == 0) goto L_0x032a
            int r10 = r10 - r8
            goto L_0x032b
        L_0x032a:
            int r10 = r10 + r8
        L_0x032b:
            if (r25 == 0) goto L_0x0333
            d1.f r4 = r1.f8535h
            r4.d(r10)
            goto L_0x0338
        L_0x0333:
            d1.f r4 = r1.f8536i
            r4.d(r10)
        L_0x0338:
            if (r6 >= r9) goto L_0x034b
            if (r6 >= r7) goto L_0x034b
            if (r25 == 0) goto L_0x0345
            d1.f r1 = r1.f8536i
            int r1 = r1.f8508f
            int r1 = -r1
            int r10 = r10 - r1
            goto L_0x034b
        L_0x0345:
            d1.f r1 = r1.f8536i
            int r1 = r1.f8508f
            int r1 = -r1
            int r10 = r10 + r1
        L_0x034b:
            int r6 = r6 + 1
            goto L_0x02cb
        L_0x034f:
            r8 = 2
            if (r4 != r8) goto L_0x03f6
            int r4 = r0.f8533f
            if (r4 != 0) goto L_0x035b
            c1.e r4 = r0.f8529b
            float r4 = r4.f4432g0
            goto L_0x035f
        L_0x035b:
            c1.e r4 = r0.f8529b
            float r4 = r4.f4434h0
        L_0x035f:
            if (r25 == 0) goto L_0x0365
            r8 = 1065353216(0x3f800000, float:1.0)
            float r4 = r8 - r4
        L_0x0365:
            int r3 = r3 - r15
            float r3 = (float) r3
            float r3 = r3 * r4
            r4 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 + r4
            int r3 = (int) r3
            if (r3 < 0) goto L_0x0370
            if (r6 <= 0) goto L_0x0371
        L_0x0370:
            r3 = r1
        L_0x0371:
            if (r25 == 0) goto L_0x0376
            int r10 = r22 - r3
            goto L_0x0378
        L_0x0376:
            int r10 = r22 + r3
        L_0x0378:
            r6 = r1
        L_0x0379:
            if (r6 >= r2) goto L_0x03f6
            if (r25 == 0) goto L_0x0382
            int r1 = r6 + 1
            int r1 = r2 - r1
            goto L_0x0383
        L_0x0382:
            r1 = r6
        L_0x0383:
            java.util.ArrayList<d1.p> r3 = r0.f8493k
            java.lang.Object r1 = r3.get(r1)
            d1.p r1 = (d1.p) r1
            c1.e r3 = r1.f8529b
            int r3 = r3.f4438j0
            r4 = 8
            if (r3 != r4) goto L_0x039f
            d1.f r3 = r1.f8535h
            r3.d(r10)
            d1.f r1 = r1.f8536i
            r1.d(r10)
            r13 = 1
            goto L_0x03f3
        L_0x039f:
            if (r6 <= 0) goto L_0x03b0
            if (r6 < r5) goto L_0x03b0
            if (r25 == 0) goto L_0x03ab
            d1.f r3 = r1.f8535h
            int r3 = r3.f8508f
            int r10 = r10 - r3
            goto L_0x03b0
        L_0x03ab:
            d1.f r3 = r1.f8535h
            int r3 = r3.f8508f
            int r10 = r10 + r3
        L_0x03b0:
            if (r25 == 0) goto L_0x03b8
            d1.f r3 = r1.f8536i
            r3.d(r10)
            goto L_0x03bd
        L_0x03b8:
            d1.f r3 = r1.f8535h
            r3.d(r10)
        L_0x03bd:
            d1.g r3 = r1.f8532e
            int r8 = r3.f8509g
            c1.e$a r11 = r1.f8531d
            if (r11 != r12) goto L_0x03cd
            int r11 = r1.f8528a
            r13 = 1
            if (r11 != r13) goto L_0x03ce
            int r8 = r3.f8515m
            goto L_0x03ce
        L_0x03cd:
            r13 = 1
        L_0x03ce:
            if (r25 == 0) goto L_0x03d2
            int r10 = r10 - r8
            goto L_0x03d3
        L_0x03d2:
            int r10 = r10 + r8
        L_0x03d3:
            if (r25 == 0) goto L_0x03db
            d1.f r3 = r1.f8535h
            r3.d(r10)
            goto L_0x03e0
        L_0x03db:
            d1.f r3 = r1.f8536i
            r3.d(r10)
        L_0x03e0:
            if (r6 >= r9) goto L_0x03f3
            if (r6 >= r7) goto L_0x03f3
            if (r25 == 0) goto L_0x03ed
            d1.f r1 = r1.f8536i
            int r1 = r1.f8508f
            int r1 = -r1
            int r10 = r10 - r1
            goto L_0x03f3
        L_0x03ed:
            d1.f r1 = r1.f8536i
            int r1 = r1.f8508f
            int r1 = -r1
            int r10 = r10 + r1
        L_0x03f3:
            int r6 = r6 + 1
            goto L_0x0379
        L_0x03f6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.c.a(d1.d):void");
    }

    public final void d() {
        Iterator<p> it = this.f8493k.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
        int size = this.f8493k.size();
        if (size >= 1) {
            e eVar = this.f8493k.get(0).f8529b;
            e eVar2 = this.f8493k.get(size - 1).f8529b;
            if (this.f8533f == 0) {
                d dVar = eVar.K;
                d dVar2 = eVar2.M;
                f i10 = p.i(dVar, 0);
                int e10 = dVar.e();
                e m10 = m();
                if (m10 != null) {
                    e10 = m10.K.e();
                }
                if (i10 != null) {
                    p.b(this.f8535h, i10, e10);
                }
                f i11 = p.i(dVar2, 0);
                int e11 = dVar2.e();
                e n10 = n();
                if (n10 != null) {
                    e11 = n10.M.e();
                }
                if (i11 != null) {
                    p.b(this.f8536i, i11, -e11);
                }
            } else {
                d dVar3 = eVar.L;
                d dVar4 = eVar2.N;
                f i12 = p.i(dVar3, 1);
                int e12 = dVar3.e();
                e m11 = m();
                if (m11 != null) {
                    e12 = m11.L.e();
                }
                if (i12 != null) {
                    p.b(this.f8535h, i12, e12);
                }
                f i13 = p.i(dVar4, 1);
                int e13 = dVar4.e();
                e n11 = n();
                if (n11 != null) {
                    e13 = n11.N.e();
                }
                if (i13 != null) {
                    p.b(this.f8536i, i13, -e13);
                }
            }
            this.f8535h.f8503a = this;
            this.f8536i.f8503a = this;
        }
    }

    public final void e() {
        for (int i10 = 0; i10 < this.f8493k.size(); i10++) {
            this.f8493k.get(i10).e();
        }
    }

    public final void f() {
        this.f8530c = null;
        Iterator<p> it = this.f8493k.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
    }

    public final long j() {
        int size = this.f8493k.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            p pVar = this.f8493k.get(i10);
            j10 = ((long) pVar.f8536i.f8508f) + pVar.j() + j10 + ((long) pVar.f8535h.f8508f);
        }
        return j10;
    }

    public final boolean k() {
        int size = this.f8493k.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!this.f8493k.get(i10).k()) {
                return false;
            }
        }
        return true;
    }

    public final e m() {
        for (int i10 = 0; i10 < this.f8493k.size(); i10++) {
            e eVar = this.f8493k.get(i10).f8529b;
            if (eVar.f4438j0 != 8) {
                return eVar;
            }
        }
        return null;
    }

    public final e n() {
        for (int size = this.f8493k.size() - 1; size >= 0; size--) {
            e eVar = this.f8493k.get(size).f8529b;
            if (eVar.f4438j0 != 8) {
                return eVar;
            }
        }
        return null;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("ChainRun ");
        if (this.f8533f == 0) {
            str = "horizontal : ";
        } else {
            str = "vertical : ";
        }
        sb2.append(str);
        Iterator<p> it = this.f8493k.iterator();
        while (it.hasNext()) {
            sb2.append("<");
            sb2.append(it.next());
            sb2.append("> ");
        }
        return sb2.toString();
    }
}
