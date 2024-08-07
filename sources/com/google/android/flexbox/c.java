package com.google.android.flexbox;

import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import w1.g;

/* compiled from: FlexboxHelper */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final a f5280a;

    /* renamed from: b  reason: collision with root package name */
    public boolean[] f5281b;

    /* renamed from: c  reason: collision with root package name */
    public int[] f5282c;

    /* renamed from: d  reason: collision with root package name */
    public long[] f5283d;

    /* renamed from: e  reason: collision with root package name */
    public long[] f5284e;

    /* compiled from: FlexboxHelper */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public List<b> f5285a;

        /* renamed from: b  reason: collision with root package name */
        public int f5286b;
    }

    /* compiled from: FlexboxHelper */
    public static class b implements Comparable<b> {

        /* renamed from: a  reason: collision with root package name */
        public int f5287a;

        /* renamed from: b  reason: collision with root package name */
        public int f5288b;

        public final int compareTo(Object obj) {
            b bVar = (b) obj;
            int i10 = this.f5288b;
            int i11 = bVar.f5288b;
            if (i10 != i11) {
                return i10 - i11;
            }
            return this.f5287a - bVar.f5287a;
        }

        public final String toString() {
            StringBuilder q10 = android.support.v4.media.a.q("Order{order=");
            q10.append(this.f5288b);
            q10.append(", index=");
            q10.append(this.f5287a);
            q10.append('}');
            return q10.toString();
        }
    }

    public c(a aVar) {
        this.f5280a = aVar;
    }

    public static ArrayList e(int i10, int i11, List list) {
        ArrayList arrayList = new ArrayList();
        b bVar = new b();
        bVar.f5268g = (i10 - i11) / 2;
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            if (i12 == 0) {
                arrayList.add(bVar);
            }
            arrayList.add((b) list.get(i12));
            if (i12 == list.size() - 1) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    public static int[] r(int i10, ArrayList arrayList, SparseIntArray sparseIntArray) {
        Collections.sort(arrayList);
        sparseIntArray.clear();
        int[] iArr = new int[i10];
        Iterator it = arrayList.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            b bVar = (b) it.next();
            int i12 = bVar.f5287a;
            iArr[i11] = i12;
            sparseIntArray.append(i12, bVar.f5288b);
            i11++;
        }
        return iArr;
    }

    public final void a(List<b> list, b bVar, int i10, int i11) {
        bVar.f5274m = i11;
        this.f5280a.c(bVar);
        bVar.f5277p = i10;
        list.add(bVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x024b, code lost:
        if (r2 < (r8 + r14)) goto L_0x024d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0252  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x02d9  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x02f1  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x02f4  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0304  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0307  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0311  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x031b  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0320  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0326  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x032b  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0333  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0338  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x035d  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0362  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0368  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x036d  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0375  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x037a  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0395  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x03d1  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x03d3  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x03d6  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0407 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(com.google.android.flexbox.c.a r28, int r29, int r30, int r31, int r32, int r33, java.util.List<com.google.android.flexbox.b> r34) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r30
            r4 = r33
            com.google.android.flexbox.a r5 = r0.f5280a
            boolean r5 = r5.j()
            int r6 = android.view.View.MeasureSpec.getMode(r29)
            int r7 = android.view.View.MeasureSpec.getSize(r29)
            if (r34 != 0) goto L_0x0020
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            goto L_0x0022
        L_0x0020:
            r8 = r34
        L_0x0022:
            r1.f5285a = r8
            r9 = -1
            if (r4 != r9) goto L_0x0029
            r12 = 1
            goto L_0x002a
        L_0x0029:
            r12 = 0
        L_0x002a:
            if (r5 == 0) goto L_0x0033
            com.google.android.flexbox.a r13 = r0.f5280a
            int r13 = r13.getPaddingStart()
            goto L_0x0039
        L_0x0033:
            com.google.android.flexbox.a r13 = r0.f5280a
            int r13 = r13.getPaddingTop()
        L_0x0039:
            if (r5 == 0) goto L_0x0042
            com.google.android.flexbox.a r14 = r0.f5280a
            int r14 = r14.getPaddingEnd()
            goto L_0x0048
        L_0x0042:
            com.google.android.flexbox.a r14 = r0.f5280a
            int r14 = r14.getPaddingBottom()
        L_0x0048:
            if (r5 == 0) goto L_0x0051
            com.google.android.flexbox.a r15 = r0.f5280a
            int r15 = r15.getPaddingTop()
            goto L_0x0057
        L_0x0051:
            com.google.android.flexbox.a r15 = r0.f5280a
            int r15 = r15.getPaddingStart()
        L_0x0057:
            if (r5 == 0) goto L_0x0060
            com.google.android.flexbox.a r11 = r0.f5280a
            int r11 = r11.getPaddingBottom()
            goto L_0x0066
        L_0x0060:
            com.google.android.flexbox.a r11 = r0.f5280a
            int r11 = r11.getPaddingEnd()
        L_0x0066:
            com.google.android.flexbox.b r9 = new com.google.android.flexbox.b
            r9.<init>()
            r10 = r32
            r9.f5276o = r10
            int r13 = r13 + r14
            r9.f5266e = r13
            com.google.android.flexbox.a r14 = r0.f5280a
            int r14 = r14.getFlexItemCount()
            r17 = -2147483648(0xffffffff80000000, float:-0.0)
            r32 = r12
            r18 = r17
            r1 = 0
            r4 = 0
            r12 = 0
        L_0x0081:
            if (r10 >= r14) goto L_0x0427
            r19 = r12
            com.google.android.flexbox.a r12 = r0.f5280a
            android.view.View r12 = r12.d(r10)
            if (r12 != 0) goto L_0x00a5
            int r12 = r14 + -1
            if (r10 != r12) goto L_0x009c
            int r12 = r9.f5269h
            r20 = r1
            int r1 = r9.f5270i
            int r12 = r12 - r1
            if (r12 == 0) goto L_0x009e
            r1 = 1
            goto L_0x009f
        L_0x009c:
            r20 = r1
        L_0x009e:
            r1 = 0
        L_0x009f:
            if (r1 == 0) goto L_0x00c9
            r0.a(r8, r9, r10, r4)
            goto L_0x00c9
        L_0x00a5:
            r20 = r1
            int r1 = r12.getVisibility()
            r3 = 8
            if (r1 != r3) goto L_0x00de
            int r1 = r9.f5270i
            r3 = 1
            int r1 = r1 + r3
            r9.f5270i = r1
            int r12 = r9.f5269h
            int r12 = r12 + r3
            r9.f5269h = r12
            int r3 = r14 + -1
            if (r10 != r3) goto L_0x00c3
            int r12 = r12 - r1
            if (r12 == 0) goto L_0x00c3
            r1 = 1
            goto L_0x00c4
        L_0x00c3:
            r1 = 0
        L_0x00c4:
            if (r1 == 0) goto L_0x00c9
            r0.a(r8, r9, r10, r4)
        L_0x00c9:
            r1 = r33
            r24 = r6
            r2 = r7
            r26 = r11
            r21 = r14
            r25 = r20
            r12 = -1
            r6 = r30
            r14 = r31
            r11 = r8
            r8 = r32
            goto L_0x0412
        L_0x00de:
            boolean r1 = r12 instanceof android.widget.CompoundButton
            if (r1 == 0) goto L_0x0120
            r1 = r12
            android.widget.CompoundButton r1 = (android.widget.CompoundButton) r1
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            com.google.android.flexbox.FlexItem r3 = (com.google.android.flexbox.FlexItem) r3
            r21 = r14
            int r14 = r3.E()
            r22 = r8
            int r8 = r3.w0()
            android.graphics.drawable.Drawable r1 = androidx.core.widget.c.a(r1)
            if (r1 != 0) goto L_0x0100
            r23 = 0
            goto L_0x0104
        L_0x0100:
            int r23 = r1.getMinimumWidth()
        L_0x0104:
            if (r1 != 0) goto L_0x010a
            r1 = -1
            r24 = 0
            goto L_0x0111
        L_0x010a:
            int r1 = r1.getMinimumHeight()
            r24 = r1
            r1 = -1
        L_0x0111:
            if (r14 != r1) goto L_0x0115
            r14 = r23
        L_0x0115:
            r3.K(r14)
            if (r8 != r1) goto L_0x011c
            r8 = r24
        L_0x011c:
            r3.a0(r8)
            goto L_0x0124
        L_0x0120:
            r22 = r8
            r21 = r14
        L_0x0124:
            android.view.ViewGroup$LayoutParams r1 = r12.getLayoutParams()
            com.google.android.flexbox.FlexItem r1 = (com.google.android.flexbox.FlexItem) r1
            int r3 = r1.x()
            r8 = 4
            if (r3 != r8) goto L_0x013a
            java.util.ArrayList r3 = r9.f5275n
            java.lang.Integer r8 = java.lang.Integer.valueOf(r10)
            r3.add(r8)
        L_0x013a:
            if (r5 == 0) goto L_0x0141
            int r3 = r1.c()
            goto L_0x0145
        L_0x0141:
            int r3 = r1.b()
        L_0x0145:
            float r8 = r1.l0()
            r14 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r8 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r8 == 0) goto L_0x015d
            r8 = 1073741824(0x40000000, float:2.0)
            if (r6 != r8) goto L_0x015d
            float r3 = (float) r7
            float r8 = r1.l0()
            float r3 = r3 * r8
            int r3 = java.lang.Math.round(r3)
        L_0x015d:
            if (r5 == 0) goto L_0x0196
            com.google.android.flexbox.a r8 = r0.f5280a
            int r14 = r1.N()
            int r14 = r14 + r13
            int r23 = r1.t0()
            int r14 = r23 + r14
            int r3 = r8.e(r2, r14, r3)
            com.google.android.flexbox.a r8 = r0.f5280a
            int r14 = r15 + r11
            int r23 = r1.W()
            int r23 = r23 + r14
            int r14 = r1.L()
            int r14 = r14 + r23
            int r14 = r14 + r4
            r23 = r7
            int r7 = r1.b()
            r24 = r6
            r6 = r30
            int r7 = r8.i(r6, r14, r7)
            r12.measure(r3, r7)
            r0.v(r12, r10, r3, r7)
            goto L_0x01ca
        L_0x0196:
            r24 = r6
            r23 = r7
            r6 = r30
            com.google.android.flexbox.a r7 = r0.f5280a
            int r8 = r15 + r11
            int r14 = r1.N()
            int r14 = r14 + r8
            int r8 = r1.t0()
            int r8 = r8 + r14
            int r8 = r8 + r4
            int r14 = r1.c()
            int r7 = r7.e(r6, r8, r14)
            com.google.android.flexbox.a r8 = r0.f5280a
            int r14 = r1.W()
            int r14 = r14 + r13
            int r25 = r1.L()
            int r14 = r25 + r14
            int r3 = r8.i(r2, r14, r3)
            r12.measure(r7, r3)
            r0.v(r12, r10, r7, r3)
        L_0x01ca:
            com.google.android.flexbox.a r7 = r0.f5280a
            r7.f(r10, r12)
            r0.c(r10, r12)
            int r7 = r12.getMeasuredState()
            r8 = r20
            int r7 = android.view.View.combineMeasuredStates(r8, r7)
            int r8 = r9.f5266e
            if (r5 == 0) goto L_0x01e5
            int r14 = r12.getMeasuredWidth()
            goto L_0x01e9
        L_0x01e5:
            int r14 = r12.getMeasuredHeight()
        L_0x01e9:
            if (r5 == 0) goto L_0x01f0
            int r20 = r1.N()
            goto L_0x01f4
        L_0x01f0:
            int r20 = r1.W()
        L_0x01f4:
            int r20 = r20 + r14
            if (r5 == 0) goto L_0x01fd
            int r14 = r1.t0()
            goto L_0x0201
        L_0x01fd:
            int r14 = r1.L()
        L_0x0201:
            int r14 = r14 + r20
            int r20 = r22.size()
            com.google.android.flexbox.a r2 = r0.f5280a
            int r2 = r2.getFlexWrap()
            if (r2 != 0) goto L_0x0210
            goto L_0x0221
        L_0x0210:
            boolean r2 = r1.A0()
            if (r2 == 0) goto L_0x021f
            r25 = r7
            r26 = r11
            r7 = r19
            r2 = r23
            goto L_0x024d
        L_0x021f:
            if (r24 != 0) goto L_0x0226
        L_0x0221:
            r25 = r7
            r26 = r11
            goto L_0x0238
        L_0x0226:
            com.google.android.flexbox.a r2 = r0.f5280a
            int r2 = r2.getMaxLine()
            r25 = r7
            r7 = -1
            r26 = r11
            if (r2 == r7) goto L_0x023d
            r7 = 1
            int r11 = r20 + 1
            if (r2 > r11) goto L_0x023d
        L_0x0238:
            r7 = r19
            r2 = r23
            goto L_0x024f
        L_0x023d:
            com.google.android.flexbox.a r2 = r0.f5280a
            r7 = r19
            int r2 = r2.h(r12, r10, r7)
            if (r2 <= 0) goto L_0x0248
            int r14 = r14 + r2
        L_0x0248:
            int r8 = r8 + r14
            r2 = r23
            if (r2 >= r8) goto L_0x024f
        L_0x024d:
            r8 = 1
            goto L_0x0250
        L_0x024f:
            r8 = 0
        L_0x0250:
            if (r8 == 0) goto L_0x02d9
            int r7 = r9.f5269h
            int r8 = r9.f5270i
            int r7 = r7 - r8
            if (r7 <= 0) goto L_0x026a
            if (r10 <= 0) goto L_0x0260
            int r7 = r10 + -1
            r11 = r22
            goto L_0x0263
        L_0x0260:
            r11 = r22
            r7 = 0
        L_0x0263:
            r0.a(r11, r9, r7, r4)
            int r7 = r9.f5268g
            int r4 = r4 + r7
            goto L_0x026c
        L_0x026a:
            r11 = r22
        L_0x026c:
            if (r5 == 0) goto L_0x029c
            int r7 = r1.b()
            r8 = -1
            if (r7 != r8) goto L_0x02c9
            com.google.android.flexbox.a r7 = r0.f5280a
            int r8 = r7.getPaddingTop()
            com.google.android.flexbox.a r9 = r0.f5280a
            int r9 = r9.getPaddingBottom()
            int r9 = r9 + r8
            int r8 = r1.W()
            int r9 = r9 + r8
            int r8 = r1.L()
            int r9 = r9 + r8
            int r9 = r9 + r4
            int r8 = r1.b()
            int r7 = r7.i(r6, r9, r8)
            r12.measure(r3, r7)
            r0.c(r10, r12)
            goto L_0x02c9
        L_0x029c:
            int r7 = r1.c()
            r8 = -1
            if (r7 != r8) goto L_0x02c9
            com.google.android.flexbox.a r7 = r0.f5280a
            int r8 = r7.getPaddingLeft()
            com.google.android.flexbox.a r9 = r0.f5280a
            int r9 = r9.getPaddingRight()
            int r9 = r9 + r8
            int r8 = r1.N()
            int r9 = r9 + r8
            int r8 = r1.t0()
            int r9 = r9 + r8
            int r9 = r9 + r4
            int r8 = r1.c()
            int r7 = r7.e(r6, r9, r8)
            r12.measure(r7, r3)
            r0.c(r10, r12)
        L_0x02c9:
            com.google.android.flexbox.b r9 = new com.google.android.flexbox.b
            r9.<init>()
            r3 = 1
            r9.f5269h = r3
            r9.f5266e = r13
            r9.f5276o = r10
            r8 = r17
            r7 = 0
            goto L_0x02e5
        L_0x02d9:
            r11 = r22
            r3 = 1
            int r8 = r9.f5269h
            int r8 = r8 + r3
            r9.f5269h = r8
            int r7 = r7 + 1
            r8 = r18
        L_0x02e5:
            boolean r14 = r9.f5278q
            float r16 = r1.d0()
            r18 = 0
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 == 0) goto L_0x02f4
            r16 = r3
            goto L_0x02f6
        L_0x02f4:
            r16 = 0
        L_0x02f6:
            r14 = r14 | r16
            r9.f5278q = r14
            boolean r14 = r9.f5279r
            float r16 = r1.B()
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 == 0) goto L_0x0307
            r16 = r3
            goto L_0x0309
        L_0x0307:
            r16 = 0
        L_0x0309:
            r14 = r14 | r16
            r9.f5279r = r14
            int[] r14 = r0.f5282c
            if (r14 == 0) goto L_0x0317
            int r16 = r11.size()
            r14[r10] = r16
        L_0x0317:
            int r14 = r9.f5266e
            if (r5 == 0) goto L_0x0320
            int r16 = r12.getMeasuredWidth()
            goto L_0x0324
        L_0x0320:
            int r16 = r12.getMeasuredHeight()
        L_0x0324:
            if (r5 == 0) goto L_0x032b
            int r18 = r1.N()
            goto L_0x032f
        L_0x032b:
            int r18 = r1.W()
        L_0x032f:
            int r18 = r18 + r16
            if (r5 == 0) goto L_0x0338
            int r16 = r1.t0()
            goto L_0x033c
        L_0x0338:
            int r16 = r1.L()
        L_0x033c:
            int r16 = r16 + r18
            int r14 = r16 + r14
            r9.f5266e = r14
            float r14 = r9.f5271j
            float r16 = r1.d0()
            float r14 = r14 + r16
            r9.f5271j = r14
            float r14 = r9.f5272k
            float r16 = r1.B()
            float r14 = r14 + r16
            r9.f5272k = r14
            com.google.android.flexbox.a r14 = r0.f5280a
            r14.b(r12, r10, r7, r9)
            if (r5 == 0) goto L_0x0362
            int r14 = r12.getMeasuredHeight()
            goto L_0x0366
        L_0x0362:
            int r14 = r12.getMeasuredWidth()
        L_0x0366:
            if (r5 == 0) goto L_0x036d
            int r16 = r1.W()
            goto L_0x0371
        L_0x036d:
            int r16 = r1.N()
        L_0x0371:
            int r16 = r16 + r14
            if (r5 == 0) goto L_0x037a
            int r14 = r1.L()
            goto L_0x037e
        L_0x037a:
            int r14 = r1.t0()
        L_0x037e:
            int r14 = r14 + r16
            com.google.android.flexbox.a r3 = r0.f5280a
            int r3 = r3.k(r12)
            int r3 = r3 + r14
            int r3 = java.lang.Math.max(r8, r3)
            int r8 = r9.f5268g
            int r8 = java.lang.Math.max(r8, r3)
            r9.f5268g = r8
            if (r5 == 0) goto L_0x03c6
            com.google.android.flexbox.a r8 = r0.f5280a
            int r8 = r8.getFlexWrap()
            r14 = 2
            if (r8 == r14) goto L_0x03b0
            int r8 = r9.f5273l
            int r12 = r12.getBaseline()
            int r1 = r1.W()
            int r12 = r12 + r1
            int r1 = java.lang.Math.max(r8, r12)
            r9.f5273l = r1
            goto L_0x03c6
        L_0x03b0:
            int r8 = r9.f5273l
            int r14 = r12.getMeasuredHeight()
            int r12 = r12.getBaseline()
            int r14 = r14 - r12
            int r1 = r1.L()
            int r14 = r14 + r1
            int r1 = java.lang.Math.max(r8, r14)
            r9.f5273l = r1
        L_0x03c6:
            int r14 = r21 + -1
            if (r10 != r14) goto L_0x03d3
            int r1 = r9.f5269h
            int r8 = r9.f5270i
            int r1 = r1 - r8
            if (r1 == 0) goto L_0x03d3
            r1 = 1
            goto L_0x03d4
        L_0x03d3:
            r1 = 0
        L_0x03d4:
            if (r1 == 0) goto L_0x03dc
            r0.a(r11, r9, r10, r4)
            int r1 = r9.f5268g
            int r4 = r4 + r1
        L_0x03dc:
            r1 = r33
            r12 = -1
            if (r1 == r12) goto L_0x0401
            int r8 = r11.size()
            if (r8 <= 0) goto L_0x0401
            int r8 = r11.size()
            int r8 = r8 + r12
            java.lang.Object r8 = r11.get(r8)
            com.google.android.flexbox.b r8 = (com.google.android.flexbox.b) r8
            int r8 = r8.f5277p
            if (r8 < r1) goto L_0x0401
            if (r10 < r1) goto L_0x0401
            if (r32 != 0) goto L_0x0401
            int r4 = r9.f5268g
            int r4 = -r4
            r14 = r31
            r8 = 1
            goto L_0x0405
        L_0x0401:
            r14 = r31
            r8 = r32
        L_0x0405:
            if (r4 <= r14) goto L_0x040e
            if (r8 == 0) goto L_0x040e
            r2 = r28
            r1 = r25
            goto L_0x042a
        L_0x040e:
            r18 = r3
            r19 = r7
        L_0x0412:
            int r10 = r10 + 1
            r7 = r2
            r3 = r6
            r32 = r8
            r8 = r11
            r12 = r19
            r14 = r21
            r6 = r24
            r1 = r25
            r11 = r26
            r2 = r29
            goto L_0x0081
        L_0x0427:
            r8 = r1
            r2 = r28
        L_0x042a:
            r2.f5286b = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.c.b(com.google.android.flexbox.c$a, int, int, int, int, int, java.util.List):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(int r7, android.view.View r8) {
        /*
            r6 = this;
            android.view.ViewGroup$LayoutParams r0 = r8.getLayoutParams()
            com.google.android.flexbox.FlexItem r0 = (com.google.android.flexbox.FlexItem) r0
            int r1 = r8.getMeasuredWidth()
            int r2 = r8.getMeasuredHeight()
            int r3 = r0.E()
            r4 = 1
            if (r1 >= r3) goto L_0x001a
            int r1 = r0.E()
            goto L_0x0024
        L_0x001a:
            int r3 = r0.N0()
            if (r1 <= r3) goto L_0x0026
            int r1 = r0.N0()
        L_0x0024:
            r3 = r4
            goto L_0x0027
        L_0x0026:
            r3 = 0
        L_0x0027:
            int r5 = r0.w0()
            if (r2 >= r5) goto L_0x0032
            int r2 = r0.w0()
            goto L_0x003e
        L_0x0032:
            int r5 = r0.B0()
            if (r2 <= r5) goto L_0x003d
            int r2 = r0.B0()
            goto L_0x003e
        L_0x003d:
            r4 = r3
        L_0x003e:
            if (r4 == 0) goto L_0x0055
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r8.measure(r1, r0)
            r6.v(r8, r7, r1, r0)
            com.google.android.flexbox.a r0 = r6.f5280a
            r0.f(r7, r8)
        L_0x0055:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.c.c(int, android.view.View):void");
    }

    public final void d(int i10, List list) {
        int i11 = this.f5282c[i10];
        if (i11 == -1) {
            i11 = 0;
        }
        for (int size = list.size() - 1; size >= i11; size--) {
            list.remove(size);
        }
        int[] iArr = this.f5282c;
        int length = iArr.length - 1;
        if (i10 > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i10, length, -1);
        }
        long[] jArr = this.f5283d;
        int length2 = jArr.length - 1;
        if (i10 > length2) {
            Arrays.fill(jArr, 0);
        } else {
            Arrays.fill(jArr, i10, length2, 0);
        }
    }

    public final ArrayList f(int i10) {
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            b bVar = new b();
            bVar.f5288b = ((FlexItem) this.f5280a.g(i11).getLayoutParams()).getOrder();
            bVar.f5287a = i11;
            arrayList.add(bVar);
        }
        return arrayList;
    }

    public final void g(int i10, int i11, int i12) {
        int i13;
        int i14;
        int flexDirection = this.f5280a.getFlexDirection();
        if (flexDirection == 0 || flexDirection == 1) {
            int mode = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            i13 = mode;
            i14 = size;
        } else if (flexDirection == 2 || flexDirection == 3) {
            i13 = View.MeasureSpec.getMode(i10);
            i14 = View.MeasureSpec.getSize(i10);
        } else {
            throw new IllegalArgumentException(android.support.v4.media.a.m("Invalid flex direction: ", flexDirection));
        }
        List<b> flexLinesInternal = this.f5280a.getFlexLinesInternal();
        if (i13 == 1073741824) {
            int sumOfCrossSize = this.f5280a.getSumOfCrossSize() + i12;
            int i15 = 0;
            if (flexLinesInternal.size() == 1) {
                flexLinesInternal.get(0).f5268g = i14 - i12;
            } else if (flexLinesInternal.size() >= 2) {
                int alignContent = this.f5280a.getAlignContent();
                if (alignContent == 1) {
                    int i16 = i14 - sumOfCrossSize;
                    b bVar = new b();
                    bVar.f5268g = i16;
                    flexLinesInternal.add(0, bVar);
                } else if (alignContent == 2) {
                    this.f5280a.setFlexLines(e(i14, sumOfCrossSize, flexLinesInternal));
                } else if (alignContent != 3) {
                    if (alignContent != 4) {
                        if (alignContent == 5 && sumOfCrossSize < i14) {
                            float size2 = ((float) (i14 - sumOfCrossSize)) / ((float) flexLinesInternal.size());
                            int size3 = flexLinesInternal.size();
                            float f10 = 0.0f;
                            while (i15 < size3) {
                                b bVar2 = flexLinesInternal.get(i15);
                                float f11 = ((float) bVar2.f5268g) + size2;
                                if (i15 == flexLinesInternal.size() - 1) {
                                    f11 += f10;
                                    f10 = 0.0f;
                                }
                                int round = Math.round(f11);
                                float f12 = (f11 - ((float) round)) + f10;
                                if (f12 > 1.0f) {
                                    round++;
                                    f12 -= 1.0f;
                                } else if (f12 < -1.0f) {
                                    round--;
                                    f12 += 1.0f;
                                }
                                f10 = f12;
                                bVar2.f5268g = round;
                                i15++;
                            }
                        }
                    } else if (sumOfCrossSize >= i14) {
                        this.f5280a.setFlexLines(e(i14, sumOfCrossSize, flexLinesInternal));
                    } else {
                        int size4 = (i14 - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                        ArrayList arrayList = new ArrayList();
                        b bVar3 = new b();
                        bVar3.f5268g = size4;
                        for (b add : flexLinesInternal) {
                            arrayList.add(bVar3);
                            arrayList.add(add);
                            arrayList.add(bVar3);
                        }
                        this.f5280a.setFlexLines(arrayList);
                    }
                } else if (sumOfCrossSize < i14) {
                    float size5 = ((float) (i14 - sumOfCrossSize)) / ((float) (flexLinesInternal.size() - 1));
                    ArrayList arrayList2 = new ArrayList();
                    int size6 = flexLinesInternal.size();
                    float f13 = 0.0f;
                    while (i15 < size6) {
                        arrayList2.add(flexLinesInternal.get(i15));
                        if (i15 != flexLinesInternal.size() - 1) {
                            b bVar4 = new b();
                            if (i15 == flexLinesInternal.size() - 2) {
                                bVar4.f5268g = Math.round(f13 + size5);
                                f13 = 0.0f;
                            } else {
                                bVar4.f5268g = Math.round(size5);
                            }
                            int i17 = bVar4.f5268g;
                            float f14 = (size5 - ((float) i17)) + f13;
                            if (f14 > 1.0f) {
                                bVar4.f5268g = i17 + 1;
                                f14 -= 1.0f;
                            } else if (f14 < -1.0f) {
                                bVar4.f5268g = i17 - 1;
                                f14 += 1.0f;
                            }
                            f13 = f14;
                            arrayList2.add(bVar4);
                        }
                        i15++;
                    }
                    this.f5280a.setFlexLines(arrayList2);
                }
            }
        }
    }

    public final void h(int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int flexItemCount = this.f5280a.getFlexItemCount();
        boolean[] zArr = this.f5281b;
        int i16 = 0;
        if (zArr == null) {
            if (flexItemCount < 10) {
                flexItemCount = 10;
            }
            this.f5281b = new boolean[flexItemCount];
        } else if (zArr.length < flexItemCount) {
            int length = zArr.length * 2;
            if (length >= flexItemCount) {
                flexItemCount = length;
            }
            this.f5281b = new boolean[flexItemCount];
        } else {
            Arrays.fill(zArr, false);
        }
        if (i12 < this.f5280a.getFlexItemCount()) {
            int flexDirection = this.f5280a.getFlexDirection();
            int flexDirection2 = this.f5280a.getFlexDirection();
            if (flexDirection2 == 0 || flexDirection2 == 1) {
                int mode = View.MeasureSpec.getMode(i10);
                int size = View.MeasureSpec.getSize(i10);
                int largestMainSize = this.f5280a.getLargestMainSize();
                if (mode != 1073741824 && largestMainSize <= size) {
                    size = largestMainSize;
                }
                i15 = this.f5280a.getPaddingLeft();
                i13 = this.f5280a.getPaddingRight();
            } else if (flexDirection2 == 2 || flexDirection2 == 3) {
                int mode2 = View.MeasureSpec.getMode(i11);
                i14 = View.MeasureSpec.getSize(i11);
                if (mode2 != 1073741824) {
                    i14 = this.f5280a.getLargestMainSize();
                }
                i15 = this.f5280a.getPaddingTop();
                i13 = this.f5280a.getPaddingBottom();
            } else {
                throw new IllegalArgumentException(android.support.v4.media.a.m("Invalid flex direction: ", flexDirection));
            }
            int i17 = i13 + i15;
            int[] iArr = this.f5282c;
            if (iArr != null) {
                i16 = iArr[i12];
            }
            List<b> flexLinesInternal = this.f5280a.getFlexLinesInternal();
            int size2 = flexLinesInternal.size();
            while (i16 < size2) {
                b bVar = flexLinesInternal.get(i16);
                int i18 = bVar.f5266e;
                if (i18 < i14 && bVar.f5278q) {
                    l(i10, i11, bVar, i14, i17, false);
                } else if (i18 > i14 && bVar.f5279r) {
                    q(i10, i11, bVar, i14, i17, false);
                }
                i16++;
            }
        }
    }

    public final void i(int i10) {
        int[] iArr = this.f5282c;
        if (iArr == null) {
            if (i10 < 10) {
                i10 = 10;
            }
            this.f5282c = new int[i10];
        } else if (iArr.length < i10) {
            int length = iArr.length * 2;
            if (length >= i10) {
                i10 = length;
            }
            this.f5282c = Arrays.copyOf(iArr, i10);
        }
    }

    public final void j(int i10) {
        long[] jArr = this.f5283d;
        if (jArr == null) {
            if (i10 < 10) {
                i10 = 10;
            }
            this.f5283d = new long[i10];
        } else if (jArr.length < i10) {
            int length = jArr.length * 2;
            if (length >= i10) {
                i10 = length;
            }
            this.f5283d = Arrays.copyOf(jArr, i10);
        }
    }

    public final void k(int i10) {
        long[] jArr = this.f5284e;
        if (jArr == null) {
            if (i10 < 10) {
                i10 = 10;
            }
            this.f5284e = new long[i10];
        } else if (jArr.length < i10) {
            int length = jArr.length * 2;
            if (length >= i10) {
                i10 = length;
            }
            this.f5284e = Arrays.copyOf(jArr, i10);
        }
    }

    public final void l(int i10, int i11, b bVar, int i12, int i13, boolean z10) {
        int i14;
        int i15;
        int i16;
        double d10;
        int i17;
        double d11;
        b bVar2 = bVar;
        int i18 = i12;
        float f10 = bVar2.f5271j;
        float f11 = 0.0f;
        if (f10 > 0.0f && i18 >= (i14 = bVar2.f5266e)) {
            float f12 = ((float) (i18 - i14)) / f10;
            bVar2.f5266e = i13 + bVar2.f5267f;
            if (!z10) {
                bVar2.f5268g = Integer.MIN_VALUE;
            }
            int i19 = 0;
            boolean z11 = false;
            int i20 = 0;
            float f13 = 0.0f;
            while (i19 < bVar2.f5269h) {
                int i21 = bVar2.f5276o + i19;
                View d12 = this.f5280a.d(i21);
                if (d12 == null || d12.getVisibility() == 8) {
                    int i22 = i11;
                    i15 = i14;
                    int i23 = i10;
                } else {
                    FlexItem flexItem = (FlexItem) d12.getLayoutParams();
                    int flexDirection = this.f5280a.getFlexDirection();
                    if (flexDirection == 0 || flexDirection == 1) {
                        int i24 = i14;
                        int i25 = i10;
                        int measuredWidth = d12.getMeasuredWidth();
                        long[] jArr = this.f5284e;
                        i15 = i24;
                        if (jArr != null) {
                            measuredWidth = (int) jArr[i21];
                        }
                        int measuredHeight = d12.getMeasuredHeight();
                        long[] jArr2 = this.f5284e;
                        if (jArr2 != null) {
                            measuredHeight = (int) (jArr2[i21] >> 32);
                        }
                        if (this.f5281b[i21] || flexItem.d0() <= 0.0f) {
                            int i26 = i11;
                        } else {
                            float d02 = (flexItem.d0() * f12) + ((float) measuredWidth);
                            if (i19 == bVar2.f5269h - 1) {
                                d02 += f13;
                                f13 = 0.0f;
                            }
                            int round = Math.round(d02);
                            if (round > flexItem.N0()) {
                                round = flexItem.N0();
                                this.f5281b[i21] = true;
                                bVar2.f5271j -= flexItem.d0();
                                z11 = true;
                            } else {
                                float f14 = (d02 - ((float) round)) + f13;
                                double d13 = (double) f14;
                                if (d13 > 1.0d) {
                                    round++;
                                    d10 = d13 - 1.0d;
                                } else {
                                    if (d13 < -1.0d) {
                                        round--;
                                        d10 = d13 + 1.0d;
                                    }
                                    f13 = f14;
                                }
                                f14 = (float) d10;
                                f13 = f14;
                            }
                            int m10 = m(i11, flexItem, bVar2.f5274m);
                            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                            d12.measure(makeMeasureSpec, m10);
                            int measuredWidth2 = d12.getMeasuredWidth();
                            int measuredHeight2 = d12.getMeasuredHeight();
                            v(d12, i21, makeMeasureSpec, m10);
                            this.f5280a.f(i21, d12);
                            measuredWidth = measuredWidth2;
                            measuredHeight = measuredHeight2;
                        }
                        int max = Math.max(i20, this.f5280a.k(d12) + measuredHeight + flexItem.W() + flexItem.L());
                        bVar2.f5266e = measuredWidth + flexItem.N() + flexItem.t0() + bVar2.f5266e;
                        i16 = max;
                    } else {
                        int measuredHeight3 = d12.getMeasuredHeight();
                        long[] jArr3 = this.f5284e;
                        if (jArr3 != null) {
                            measuredHeight3 = (int) (jArr3[i21] >> 32);
                        }
                        int measuredWidth3 = d12.getMeasuredWidth();
                        long[] jArr4 = this.f5284e;
                        if (jArr4 != null) {
                            measuredWidth3 = (int) jArr4[i21];
                        }
                        if (this.f5281b[i21] || flexItem.d0() <= f11) {
                            i17 = i14;
                            int i27 = i10;
                        } else {
                            float d03 = (flexItem.d0() * f12) + ((float) measuredHeight3);
                            if (i19 == bVar2.f5269h - 1) {
                                d03 += f13;
                                f13 = f11;
                            }
                            int round2 = Math.round(d03);
                            if (round2 > flexItem.B0()) {
                                round2 = flexItem.B0();
                                this.f5281b[i21] = true;
                                bVar2.f5271j -= flexItem.d0();
                                i17 = i14;
                                z11 = true;
                            } else {
                                float f15 = (d03 - ((float) round2)) + f13;
                                i17 = i14;
                                double d14 = (double) f15;
                                if (d14 > 1.0d) {
                                    round2++;
                                    d11 = d14 - 1.0d;
                                } else if (d14 < -1.0d) {
                                    round2--;
                                    d11 = d14 + 1.0d;
                                } else {
                                    f13 = f15;
                                }
                                f13 = (float) d11;
                            }
                            int n10 = n(i10, flexItem, bVar2.f5274m);
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                            d12.measure(n10, makeMeasureSpec2);
                            measuredWidth3 = d12.getMeasuredWidth();
                            int measuredHeight4 = d12.getMeasuredHeight();
                            v(d12, i21, n10, makeMeasureSpec2);
                            this.f5280a.f(i21, d12);
                            measuredHeight3 = measuredHeight4;
                        }
                        i16 = Math.max(i20, this.f5280a.k(d12) + measuredWidth3 + flexItem.N() + flexItem.t0());
                        bVar2.f5266e = measuredHeight3 + flexItem.W() + flexItem.L() + bVar2.f5266e;
                        int i28 = i11;
                        i15 = i17;
                    }
                    bVar2.f5268g = Math.max(bVar2.f5268g, i16);
                    i20 = i16;
                }
                i19++;
                i14 = i15;
                f11 = 0.0f;
            }
            int i29 = i11;
            int i30 = i14;
            int i31 = i10;
            if (z11 && i30 != bVar2.f5266e) {
                l(i10, i11, bVar, i12, i13, true);
            }
        }
    }

    public final int m(int i10, FlexItem flexItem, int i11) {
        a aVar = this.f5280a;
        int i12 = aVar.i(i10, this.f5280a.getPaddingBottom() + aVar.getPaddingTop() + flexItem.W() + flexItem.L() + i11, flexItem.b());
        int size = View.MeasureSpec.getSize(i12);
        if (size > flexItem.B0()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.B0(), View.MeasureSpec.getMode(i12));
        }
        if (size < flexItem.w0()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.w0(), View.MeasureSpec.getMode(i12));
        }
        return i12;
    }

    public final int n(int i10, FlexItem flexItem, int i11) {
        a aVar = this.f5280a;
        int e10 = aVar.e(i10, this.f5280a.getPaddingRight() + aVar.getPaddingLeft() + flexItem.N() + flexItem.t0() + i11, flexItem.c());
        int size = View.MeasureSpec.getSize(e10);
        if (size > flexItem.N0()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.N0(), View.MeasureSpec.getMode(e10));
        }
        if (size < flexItem.E()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.E(), View.MeasureSpec.getMode(e10));
        }
        return e10;
    }

    public final void o(View view, b bVar, int i10, int i11, int i12, int i13) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int alignItems = this.f5280a.getAlignItems();
        if (flexItem.x() != -1) {
            alignItems = flexItem.x();
        }
        int i14 = bVar.f5268g;
        if (alignItems != 0) {
            if (alignItems != 1) {
                if (alignItems == 2) {
                    int measuredHeight = (((i14 - view.getMeasuredHeight()) + flexItem.W()) - flexItem.L()) / 2;
                    if (this.f5280a.getFlexWrap() != 2) {
                        int i15 = i11 + measuredHeight;
                        view.layout(i10, i15, i12, view.getMeasuredHeight() + i15);
                        return;
                    }
                    int i16 = i11 - measuredHeight;
                    view.layout(i10, i16, i12, view.getMeasuredHeight() + i16);
                    return;
                } else if (alignItems != 3) {
                    if (alignItems != 4) {
                        return;
                    }
                } else if (this.f5280a.getFlexWrap() != 2) {
                    int max = Math.max(bVar.f5273l - view.getBaseline(), flexItem.W());
                    view.layout(i10, i11 + max, i12, i13 + max);
                    return;
                } else {
                    int max2 = Math.max(view.getBaseline() + (bVar.f5273l - view.getMeasuredHeight()), flexItem.L());
                    view.layout(i10, i11 - max2, i12, i13 - max2);
                    return;
                }
            } else if (this.f5280a.getFlexWrap() != 2) {
                int i17 = i11 + i14;
                view.layout(i10, (i17 - view.getMeasuredHeight()) - flexItem.L(), i12, i17 - flexItem.L());
                return;
            } else {
                view.layout(i10, view.getMeasuredHeight() + (i11 - i14) + flexItem.W(), i12, view.getMeasuredHeight() + (i13 - i14) + flexItem.W());
                return;
            }
        }
        if (this.f5280a.getFlexWrap() != 2) {
            view.layout(i10, i11 + flexItem.W(), i12, i13 + flexItem.W());
        } else {
            view.layout(i10, i11 - flexItem.L(), i12, i13 - flexItem.L());
        }
    }

    public final void p(View view, b bVar, boolean z10, int i10, int i11, int i12, int i13) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int alignItems = this.f5280a.getAlignItems();
        if (flexItem.x() != -1) {
            alignItems = flexItem.x();
        }
        int i14 = bVar.f5268g;
        if (alignItems != 0) {
            if (alignItems != 1) {
                if (alignItems == 2) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    int c10 = ((g.c(marginLayoutParams) + (i14 - view.getMeasuredWidth())) - g.b(marginLayoutParams)) / 2;
                    if (!z10) {
                        view.layout(i10 + c10, i11, i12 + c10, i13);
                        return;
                    } else {
                        view.layout(i10 - c10, i11, i12 - c10, i13);
                        return;
                    }
                } else if (!(alignItems == 3 || alignItems == 4)) {
                    return;
                }
            } else if (!z10) {
                view.layout(((i10 + i14) - view.getMeasuredWidth()) - flexItem.t0(), i11, ((i12 + i14) - view.getMeasuredWidth()) - flexItem.t0(), i13);
                return;
            } else {
                view.layout(view.getMeasuredWidth() + (i10 - i14) + flexItem.N(), i11, view.getMeasuredWidth() + (i12 - i14) + flexItem.N(), i13);
                return;
            }
        }
        if (!z10) {
            view.layout(i10 + flexItem.N(), i11, i12 + flexItem.N(), i13);
        } else {
            view.layout(i10 - flexItem.t0(), i11, i12 - flexItem.t0(), i13);
        }
    }

    public final void q(int i10, int i11, b bVar, int i12, int i13, boolean z10) {
        int i14;
        int i15;
        int i16;
        int i17;
        b bVar2 = bVar;
        int i18 = i12;
        int i19 = bVar2.f5266e;
        float f10 = bVar2.f5272k;
        float f11 = 0.0f;
        if (f10 > 0.0f && i18 <= i19) {
            float f12 = ((float) (i19 - i18)) / f10;
            bVar2.f5266e = i13 + bVar2.f5267f;
            if (!z10) {
                bVar2.f5268g = Integer.MIN_VALUE;
            }
            int i20 = 0;
            boolean z11 = false;
            int i21 = 0;
            float f13 = 0.0f;
            while (i20 < bVar2.f5269h) {
                int i22 = bVar2.f5276o + i20;
                View d10 = this.f5280a.d(i22);
                if (d10 == null || d10.getVisibility() == 8) {
                    int i23 = i11;
                    i15 = i19;
                    i14 = i20;
                } else {
                    FlexItem flexItem = (FlexItem) d10.getLayoutParams();
                    int flexDirection = this.f5280a.getFlexDirection();
                    if (flexDirection == 0 || flexDirection == 1) {
                        i15 = i19;
                        i14 = i20;
                        int i24 = i10;
                        int measuredWidth = d10.getMeasuredWidth();
                        long[] jArr = this.f5284e;
                        if (jArr != null) {
                            measuredWidth = (int) jArr[i22];
                        }
                        int measuredHeight = d10.getMeasuredHeight();
                        long[] jArr2 = this.f5284e;
                        if (jArr2 != null) {
                            measuredHeight = (int) (jArr2[i22] >> 32);
                        }
                        if (this.f5281b[i22] || flexItem.B() <= 0.0f) {
                            int i25 = i11;
                        } else {
                            float B = ((float) measuredWidth) - (flexItem.B() * f12);
                            if (i14 == bVar2.f5269h - 1) {
                                B += f13;
                                f13 = 0.0f;
                            }
                            int round = Math.round(B);
                            if (round < flexItem.E()) {
                                i17 = flexItem.E();
                                this.f5281b[i22] = true;
                                bVar2.f5272k -= flexItem.B();
                                z11 = true;
                            } else {
                                float f14 = (B - ((float) round)) + f13;
                                double d11 = (double) f14;
                                if (d11 > 1.0d) {
                                    round++;
                                    f14 -= 1.0f;
                                } else if (d11 < -1.0d) {
                                    round--;
                                    f14 += 1.0f;
                                }
                                f13 = f14;
                                i17 = round;
                            }
                            int m10 = m(i11, flexItem, bVar2.f5274m);
                            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i17, 1073741824);
                            d10.measure(makeMeasureSpec, m10);
                            int measuredWidth2 = d10.getMeasuredWidth();
                            int measuredHeight2 = d10.getMeasuredHeight();
                            v(d10, i22, makeMeasureSpec, m10);
                            this.f5280a.f(i22, d10);
                            measuredWidth = measuredWidth2;
                            measuredHeight = measuredHeight2;
                        }
                        int max = Math.max(i21, this.f5280a.k(d10) + measuredHeight + flexItem.W() + flexItem.L());
                        bVar2.f5266e = measuredWidth + flexItem.N() + flexItem.t0() + bVar2.f5266e;
                        i16 = max;
                    } else {
                        int measuredHeight3 = d10.getMeasuredHeight();
                        long[] jArr3 = this.f5284e;
                        if (jArr3 != null) {
                            measuredHeight3 = (int) (jArr3[i22] >> 32);
                        }
                        int measuredWidth3 = d10.getMeasuredWidth();
                        long[] jArr4 = this.f5284e;
                        if (jArr4 != null) {
                            measuredWidth3 = (int) jArr4[i22];
                        }
                        if (this.f5281b[i22] || flexItem.B() <= f11) {
                            i15 = i19;
                            i14 = i20;
                            int i26 = i10;
                        } else {
                            float B2 = ((float) measuredHeight3) - (flexItem.B() * f12);
                            if (i20 == bVar2.f5269h - 1) {
                                B2 += f13;
                                f13 = f11;
                            }
                            int round2 = Math.round(B2);
                            if (round2 < flexItem.w0()) {
                                int w02 = flexItem.w0();
                                this.f5281b[i22] = true;
                                bVar2.f5272k -= flexItem.B();
                                i14 = i20;
                                round2 = w02;
                                z11 = true;
                                i15 = i19;
                            } else {
                                float f15 = (B2 - ((float) round2)) + f13;
                                i15 = i19;
                                i14 = i20;
                                double d12 = (double) f15;
                                if (d12 > 1.0d) {
                                    round2++;
                                    f15 -= 1.0f;
                                } else if (d12 < -1.0d) {
                                    round2--;
                                    f15 += 1.0f;
                                }
                                f13 = f15;
                            }
                            int n10 = n(i10, flexItem, bVar2.f5274m);
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                            d10.measure(n10, makeMeasureSpec2);
                            measuredWidth3 = d10.getMeasuredWidth();
                            int measuredHeight4 = d10.getMeasuredHeight();
                            v(d10, i22, n10, makeMeasureSpec2);
                            this.f5280a.f(i22, d10);
                            measuredHeight3 = measuredHeight4;
                        }
                        i16 = Math.max(i21, this.f5280a.k(d10) + measuredWidth3 + flexItem.N() + flexItem.t0());
                        bVar2.f5266e = measuredHeight3 + flexItem.W() + flexItem.L() + bVar2.f5266e;
                        int i27 = i11;
                    }
                    bVar2.f5268g = Math.max(bVar2.f5268g, i16);
                    i21 = i16;
                }
                i20 = i14 + 1;
                i19 = i15;
                f11 = 0.0f;
            }
            int i28 = i11;
            int i29 = i19;
            if (z11 && i29 != bVar2.f5266e) {
                q(i10, i11, bVar, i12, i13, true);
            }
        }
    }

    public final void s(View view, int i10, int i11) {
        int i12;
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int min = Math.min(Math.max(((i10 - flexItem.N()) - flexItem.t0()) - this.f5280a.k(view), flexItem.E()), flexItem.N0());
        long[] jArr = this.f5284e;
        if (jArr != null) {
            i12 = (int) (jArr[i11] >> 32);
        } else {
            i12 = view.getMeasuredHeight();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec2, makeMeasureSpec);
        v(view, i11, makeMeasureSpec2, makeMeasureSpec);
        this.f5280a.f(i11, view);
    }

    public final void t(View view, int i10, int i11) {
        int i12;
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int min = Math.min(Math.max(((i10 - flexItem.W()) - flexItem.L()) - this.f5280a.k(view), flexItem.w0()), flexItem.B0());
        long[] jArr = this.f5284e;
        if (jArr != null) {
            i12 = (int) jArr[i11];
        } else {
            i12 = view.getMeasuredWidth();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec, makeMeasureSpec2);
        v(view, i11, makeMeasureSpec, makeMeasureSpec2);
        this.f5280a.f(i11, view);
    }

    public final void u(int i10) {
        int i11;
        View d10;
        if (i10 < this.f5280a.getFlexItemCount()) {
            int flexDirection = this.f5280a.getFlexDirection();
            if (this.f5280a.getAlignItems() == 4) {
                int[] iArr = this.f5282c;
                if (iArr != null) {
                    i11 = iArr[i10];
                } else {
                    i11 = 0;
                }
                List<b> flexLinesInternal = this.f5280a.getFlexLinesInternal();
                int size = flexLinesInternal.size();
                while (i11 < size) {
                    b bVar = flexLinesInternal.get(i11);
                    int i12 = bVar.f5269h;
                    for (int i13 = 0; i13 < i12; i13++) {
                        int i14 = bVar.f5276o + i13;
                        if (!(i13 >= this.f5280a.getFlexItemCount() || (d10 = this.f5280a.d(i14)) == null || d10.getVisibility() == 8)) {
                            FlexItem flexItem = (FlexItem) d10.getLayoutParams();
                            if (flexItem.x() == -1 || flexItem.x() == 4) {
                                if (flexDirection == 0 || flexDirection == 1) {
                                    t(d10, bVar.f5268g, i14);
                                } else if (flexDirection == 2 || flexDirection == 3) {
                                    s(d10, bVar.f5268g, i14);
                                } else {
                                    throw new IllegalArgumentException(android.support.v4.media.a.m("Invalid flex direction: ", flexDirection));
                                }
                            }
                        }
                    }
                    i11++;
                }
                return;
            }
            for (b next : this.f5280a.getFlexLinesInternal()) {
                Iterator it = next.f5275n.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Integer num = (Integer) it.next();
                        View d11 = this.f5280a.d(num.intValue());
                        if (flexDirection == 0 || flexDirection == 1) {
                            t(d11, next.f5268g, num.intValue());
                        } else if (flexDirection == 2 || flexDirection == 3) {
                            s(d11, next.f5268g, num.intValue());
                        } else {
                            throw new IllegalArgumentException(android.support.v4.media.a.m("Invalid flex direction: ", flexDirection));
                        }
                    }
                }
            }
        }
    }

    public final void v(View view, int i10, int i11, int i12) {
        long[] jArr = this.f5283d;
        if (jArr != null) {
            jArr[i10] = (((long) i11) & 4294967295L) | (((long) i12) << 32);
        }
        long[] jArr2 = this.f5284e;
        if (jArr2 != null) {
            jArr2[i10] = (((long) view.getMeasuredWidth()) & 4294967295L) | (((long) view.getMeasuredHeight()) << 32);
        }
    }
}
