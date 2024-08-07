package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.widget.R$styleable;

public class MotionEffect extends MotionHelper {
    public int A = -1;

    /* renamed from: t  reason: collision with root package name */
    public float f1561t = 0.1f;

    /* renamed from: u  reason: collision with root package name */
    public int f1562u = 49;

    /* renamed from: v  reason: collision with root package name */
    public int f1563v = 50;

    /* renamed from: w  reason: collision with root package name */
    public int f1564w = 0;

    /* renamed from: x  reason: collision with root package name */
    public int f1565x = 0;

    /* renamed from: y  reason: collision with root package name */
    public boolean f1566y = true;

    /* renamed from: z  reason: collision with root package name */
    public int f1567z = -1;

    public MotionEffect(Context context) {
        super(context);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0187, code lost:
        if (r14 == 0.0f) goto L_0x0189;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x019b, code lost:
        if (r1 == 0.0f) goto L_0x0189;
     */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01b2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void u(androidx.constraintlayout.motion.widget.MotionLayout r23, java.util.HashMap<android.view.View, f1.n> r24) {
        /*
            r22 = this;
            r0 = r22
            r1 = r24
            android.view.ViewParent r2 = r22.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r2 = (androidx.constraintlayout.widget.ConstraintLayout) r2
            android.view.View[] r2 = r0.m(r2)
            if (r2 != 0) goto L_0x0014
            f1.a.a()
            return
        L_0x0014:
            f1.e r3 = new f1.e
            r3.<init>()
            f1.e r4 = new f1.e
            r4.<init>()
            float r5 = r0.f1561t
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            java.lang.String r6 = "alpha"
            r3.h(r5, r6)
            float r5 = r0.f1561t
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            r4.h(r5, r6)
            int r5 = r0.f1562u
            r3.f9619a = r5
            int r5 = r0.f1563v
            r4.f9619a = r5
            f1.h r5 = new f1.h
            r5.<init>()
            int r6 = r0.f1562u
            r5.f9619a = r6
            r6 = 0
            r5.f9670o = r6
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            java.lang.String r8 = "percentX"
            r5.h(r7, r8)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            java.lang.String r9 = "percentY"
            r5.h(r7, r9)
            f1.h r7 = new f1.h
            r7.<init>()
            int r10 = r0.f1563v
            r7.f9619a = r10
            r7.f9670o = r6
            r10 = 1
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            r7.h(r11, r8)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r10)
            r7.h(r8, r9)
            int r8 = r0.f1564w
            r9 = 0
            if (r8 <= 0) goto L_0x009d
            f1.e r8 = new f1.e
            r8.<init>()
            f1.e r11 = new f1.e
            r11.<init>()
            int r12 = r0.f1564w
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.String r13 = "translationX"
            r8.h(r12, r13)
            int r12 = r0.f1563v
            r8.f9619a = r12
            java.lang.Integer r12 = java.lang.Integer.valueOf(r6)
            r11.h(r12, r13)
            int r12 = r0.f1563v
            int r12 = r12 - r10
            r11.f9619a = r12
            goto L_0x009f
        L_0x009d:
            r8 = r9
            r11 = r8
        L_0x009f:
            int r12 = r0.f1565x
            if (r12 <= 0) goto L_0x00ce
            f1.e r9 = new f1.e
            r9.<init>()
            f1.e r12 = new f1.e
            r12.<init>()
            int r13 = r0.f1565x
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.String r14 = "translationY"
            r9.h(r13, r14)
            int r13 = r0.f1563v
            r9.f9619a = r13
            java.lang.Integer r13 = java.lang.Integer.valueOf(r6)
            r12.h(r13, r14)
            int r13 = r0.f1563v
            int r13 = r13 - r10
            r12.f9619a = r13
            r21 = r12
            r12 = r9
            r9 = r21
            goto L_0x00cf
        L_0x00ce:
            r12 = r9
        L_0x00cf:
            int r13 = r0.A
            r15 = -1
            if (r13 != r15) goto L_0x0140
            r13 = 4
            int[] r15 = new int[r13]
            r13 = r6
        L_0x00d8:
            int r6 = r2.length
            if (r13 >= r6) goto L_0x012c
            r6 = r2[r13]
            java.lang.Object r6 = r1.get(r6)
            f1.n r6 = (f1.n) r6
            if (r6 != 0) goto L_0x00e8
            r20 = r9
            goto L_0x0126
        L_0x00e8:
            f1.p r10 = r6.f9735g
            float r14 = r10.f9760e
            f1.p r6 = r6.f9734f
            r20 = r9
            float r9 = r6.f9760e
            float r14 = r14 - r9
            float r9 = r10.f9761f
            float r6 = r6.f9761f
            float r9 = r9 - r6
            r6 = 0
            int r10 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r10 >= 0) goto L_0x0105
            r10 = 1
            r19 = r15[r10]
            int r19 = r19 + 1
            r15[r10] = r19
            goto L_0x0106
        L_0x0105:
            r10 = 1
        L_0x0106:
            int r9 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r9 <= 0) goto L_0x0111
            r9 = 0
            r18 = r15[r9]
            int r18 = r18 + 1
            r15[r9] = r18
        L_0x0111:
            int r9 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r9 <= 0) goto L_0x011c
            r9 = 3
            r16 = r15[r9]
            int r16 = r16 + 1
            r15[r9] = r16
        L_0x011c:
            int r9 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r9 >= 0) goto L_0x0126
            r6 = 2
            r9 = r15[r6]
            int r9 = r9 + r10
            r15[r6] = r9
        L_0x0126:
            int r13 = r13 + 1
            r9 = r20
            r10 = 1
            goto L_0x00d8
        L_0x012c:
            r20 = r9
            r10 = 0
            r6 = r15[r10]
            r13 = r10
            r9 = 1
            r14 = 4
        L_0x0134:
            if (r9 >= r14) goto L_0x0142
            r10 = r15[r9]
            if (r6 >= r10) goto L_0x013c
            r13 = r9
            r6 = r10
        L_0x013c:
            int r9 = r9 + 1
            r10 = 0
            goto L_0x0134
        L_0x0140:
            r20 = r9
        L_0x0142:
            r9 = 0
        L_0x0143:
            int r6 = r2.length
            if (r9 >= r6) goto L_0x022e
            r6 = r2[r9]
            java.lang.Object r6 = r1.get(r6)
            f1.n r6 = (f1.n) r6
            if (r6 != 0) goto L_0x0158
        L_0x0150:
            r10 = r23
            r17 = r2
            r14 = r20
            goto L_0x0221
        L_0x0158:
            f1.p r10 = r6.f9735g
            float r14 = r10.f9760e
            f1.p r15 = r6.f9734f
            float r1 = r15.f9760e
            float r14 = r14 - r1
            float r1 = r10.f9761f
            float r10 = r15.f9761f
            float r1 = r1 - r10
            if (r13 != 0) goto L_0x0179
            r10 = 0
            int r1 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r1 <= 0) goto L_0x0177
            boolean r1 = r0.f1566y
            if (r1 == 0) goto L_0x0175
            int r1 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r1 != 0) goto L_0x0177
        L_0x0175:
            r15 = 1
            goto L_0x0189
        L_0x0177:
            r15 = 1
            goto L_0x018c
        L_0x0179:
            r10 = 0
            r15 = 1
            if (r13 != r15) goto L_0x018e
            int r1 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r1 >= 0) goto L_0x018c
            boolean r1 = r0.f1566y
            if (r1 == 0) goto L_0x0189
            int r1 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r1 != 0) goto L_0x018c
        L_0x0189:
            r1 = 0
            r15 = 3
            goto L_0x01b0
        L_0x018c:
            r15 = 3
            goto L_0x01af
        L_0x018e:
            r15 = 2
            if (r13 != r15) goto L_0x019e
            int r14 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r14 >= 0) goto L_0x018c
            boolean r14 = r0.f1566y
            if (r14 == 0) goto L_0x0189
            int r1 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r1 != 0) goto L_0x018c
            goto L_0x0189
        L_0x019e:
            r15 = 3
            if (r13 != r15) goto L_0x01af
            int r14 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r14 <= 0) goto L_0x01af
            boolean r14 = r0.f1566y
            if (r14 == 0) goto L_0x01ad
            int r1 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r1 != 0) goto L_0x01af
        L_0x01ad:
            r1 = 0
            goto L_0x01b0
        L_0x01af:
            r1 = 1
        L_0x01b0:
            if (r1 == 0) goto L_0x0150
            int r1 = r0.f1567z
            r14 = -1
            if (r1 != r14) goto L_0x01df
            r6.a(r3)
            r6.a(r4)
            r6.a(r5)
            r6.a(r7)
            int r1 = r0.f1564w
            if (r1 <= 0) goto L_0x01cd
            r6.a(r8)
            r6.a(r11)
        L_0x01cd:
            int r1 = r0.f1565x
            if (r1 <= 0) goto L_0x01dc
            r6.a(r12)
            r14 = r20
            r6.a(r14)
        L_0x01d9:
            r10 = r23
            goto L_0x021f
        L_0x01dc:
            r14 = r20
            goto L_0x01d9
        L_0x01df:
            r10 = r23
            r14 = r20
            androidx.constraintlayout.motion.widget.a r15 = r10.f1595x
            if (r15 == 0) goto L_0x021f
            androidx.constraintlayout.motion.widget.d r15 = r15.f1656q
            java.util.ArrayList<androidx.constraintlayout.motion.widget.c> r15 = r15.f1742b
            java.util.Iterator r15 = r15.iterator()
        L_0x01ef:
            boolean r17 = r15.hasNext()
            if (r17 == 0) goto L_0x021f
            java.lang.Object r17 = r15.next()
            r0 = r17
            androidx.constraintlayout.motion.widget.c r0 = (androidx.constraintlayout.motion.widget.c) r0
            r17 = r2
            int r2 = r0.f1707a
            if (r2 != r1) goto L_0x021a
            f1.g r0 = r0.f1712f
            java.util.HashMap<java.lang.Integer, java.util.ArrayList<f1.d>> r0 = r0.f9660a
            r2 = -1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r0.get(r1)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 == 0) goto L_0x0222
            java.util.ArrayList<f1.d> r1 = r6.f9751w
            r1.addAll(r0)
            goto L_0x0222
        L_0x021a:
            r0 = r22
            r2 = r17
            goto L_0x01ef
        L_0x021f:
            r17 = r2
        L_0x0221:
            r2 = -1
        L_0x0222:
            int r9 = r9 + 1
            r0 = r22
            r1 = r24
            r20 = r14
            r2 = r17
            goto L_0x0143
        L_0x022e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.helper.widget.MotionEffect.u(androidx.constraintlayout.motion.widget.MotionLayout, java.util.HashMap):void");
    }

    public final void v(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MotionEffect);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == R$styleable.MotionEffect_motionEffect_start) {
                    int i11 = obtainStyledAttributes.getInt(index, this.f1562u);
                    this.f1562u = i11;
                    this.f1562u = Math.max(Math.min(i11, 99), 0);
                } else if (index == R$styleable.MotionEffect_motionEffect_end) {
                    int i12 = obtainStyledAttributes.getInt(index, this.f1563v);
                    this.f1563v = i12;
                    this.f1563v = Math.max(Math.min(i12, 99), 0);
                } else if (index == R$styleable.MotionEffect_motionEffect_translationX) {
                    this.f1564w = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1564w);
                } else if (index == R$styleable.MotionEffect_motionEffect_translationY) {
                    this.f1565x = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1565x);
                } else if (index == R$styleable.MotionEffect_motionEffect_alpha) {
                    this.f1561t = obtainStyledAttributes.getFloat(index, this.f1561t);
                } else if (index == R$styleable.MotionEffect_motionEffect_move) {
                    this.A = obtainStyledAttributes.getInt(index, this.A);
                } else if (index == R$styleable.MotionEffect_motionEffect_strict) {
                    this.f1566y = obtainStyledAttributes.getBoolean(index, this.f1566y);
                } else if (index == R$styleable.MotionEffect_motionEffect_viewTransition) {
                    this.f1567z = obtainStyledAttributes.getResourceId(index, this.f1567z);
                }
            }
            int i13 = this.f1562u;
            int i14 = this.f1563v;
            if (i13 == i14) {
                if (i13 > 0) {
                    this.f1562u = i13 - 1;
                } else {
                    this.f1563v = i14 + 1;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public MotionEffect(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        v(context, attributeSet);
    }

    public MotionEffect(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        v(context, attributeSet);
    }
}
