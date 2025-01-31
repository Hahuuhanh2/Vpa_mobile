package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.v4.media.a;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.appcompat.R$styleable;
import w1.d0;

public class LinearLayoutCompat extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    public boolean f877a;

    /* renamed from: b  reason: collision with root package name */
    public int f878b;

    /* renamed from: c  reason: collision with root package name */
    public int f879c;

    /* renamed from: d  reason: collision with root package name */
    public int f880d;

    /* renamed from: e  reason: collision with root package name */
    public int f881e;

    /* renamed from: f  reason: collision with root package name */
    public int f882f;

    /* renamed from: n  reason: collision with root package name */
    public float f883n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f884o;

    /* renamed from: p  reason: collision with root package name */
    public int[] f885p;

    /* renamed from: q  reason: collision with root package name */
    public int[] f886q;

    /* renamed from: r  reason: collision with root package name */
    public Drawable f887r;

    /* renamed from: s  reason: collision with root package name */
    public int f888s;

    /* renamed from: t  reason: collision with root package name */
    public int f889t;

    /* renamed from: u  reason: collision with root package name */
    public int f890u;

    /* renamed from: v  reason: collision with root package name */
    public int f891v;

    public static class LayoutParams extends LinearLayout.LayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(int i10, int i11) {
            super(i10, i11);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public LinearLayoutCompat(Context context) {
        this(context, (AttributeSet) null);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public final void d(Canvas canvas, int i10) {
        this.f887r.setBounds(getPaddingLeft() + this.f891v, i10, (getWidth() - getPaddingRight()) - this.f891v, this.f889t + i10);
        this.f887r.draw(canvas);
    }

    public final void e(Canvas canvas, int i10) {
        this.f887r.setBounds(i10, getPaddingTop() + this.f891v, this.f888s + i10, (getHeight() - getPaddingBottom()) - this.f891v);
        this.f887r.draw(canvas);
    }

    /* renamed from: f */
    public LayoutParams generateDefaultLayoutParams() {
        int i10 = this.f880d;
        if (i10 == 0) {
            return new LayoutParams(-2, -2);
        }
        if (i10 == 1) {
            return new LayoutParams(-1, -2);
        }
        return null;
    }

    /* renamed from: g */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public int getBaseline() {
        int i10;
        if (this.f878b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i11 = this.f878b;
        if (childCount > i11) {
            View childAt = getChildAt(i11);
            int baseline = childAt.getBaseline();
            if (baseline != -1) {
                int i12 = this.f879c;
                if (this.f880d == 1 && (i10 = this.f881e & 112) != 48) {
                    if (i10 == 16) {
                        i12 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f882f) / 2;
                    } else if (i10 == 80) {
                        i12 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f882f;
                    }
                }
                return i12 + ((LayoutParams) childAt.getLayoutParams()).topMargin + baseline;
            } else if (this.f878b == 0) {
                return -1;
            } else {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
    }

    public int getBaselineAlignedChildIndex() {
        return this.f878b;
    }

    public Drawable getDividerDrawable() {
        return this.f887r;
    }

    public int getDividerPadding() {
        return this.f891v;
    }

    public int getDividerWidth() {
        return this.f888s;
    }

    public int getGravity() {
        return this.f881e;
    }

    public int getOrientation() {
        return this.f880d;
    }

    public int getShowDividers() {
        return this.f890u;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f883n;
    }

    /* renamed from: h */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public final boolean i(int i10) {
        if (i10 == 0) {
            if ((this.f890u & 1) != 0) {
                return true;
            }
            return false;
        } else if (i10 == getChildCount()) {
            if ((this.f890u & 4) != 0) {
                return true;
            }
            return false;
        } else if ((this.f890u & 2) == 0) {
            return false;
        } else {
            for (int i11 = i10 - 1; i11 >= 0; i11--) {
                if (getChildAt(i11).getVisibility() != 8) {
                    return true;
                }
            }
            return false;
        }
    }

    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        if (this.f887r != null) {
            int i15 = 0;
            if (this.f880d == 1) {
                int virtualChildCount = getVirtualChildCount();
                while (i15 < virtualChildCount) {
                    View childAt = getChildAt(i15);
                    if (!(childAt == null || childAt.getVisibility() == 8 || !i(i15))) {
                        d(canvas, (childAt.getTop() - ((LayoutParams) childAt.getLayoutParams()).topMargin) - this.f889t);
                    }
                    i15++;
                }
                if (i(virtualChildCount)) {
                    View childAt2 = getChildAt(virtualChildCount - 1);
                    if (childAt2 == null) {
                        i14 = (getHeight() - getPaddingBottom()) - this.f889t;
                    } else {
                        i14 = childAt2.getBottom() + ((LayoutParams) childAt2.getLayoutParams()).bottomMargin;
                    }
                    d(canvas, i14);
                    return;
                }
                return;
            }
            int virtualChildCount2 = getVirtualChildCount();
            boolean a10 = u0.a(this);
            while (i15 < virtualChildCount2) {
                View childAt3 = getChildAt(i15);
                if (!(childAt3 == null || childAt3.getVisibility() == 8 || !i(i15))) {
                    LayoutParams layoutParams = (LayoutParams) childAt3.getLayoutParams();
                    if (a10) {
                        i13 = childAt3.getRight() + layoutParams.rightMargin;
                    } else {
                        i13 = (childAt3.getLeft() - layoutParams.leftMargin) - this.f888s;
                    }
                    e(canvas, i13);
                }
                i15++;
            }
            if (i(virtualChildCount2)) {
                View childAt4 = getChildAt(virtualChildCount2 - 1);
                if (childAt4 != null) {
                    LayoutParams layoutParams2 = (LayoutParams) childAt4.getLayoutParams();
                    if (a10) {
                        i12 = childAt4.getLeft() - layoutParams2.leftMargin;
                        i11 = this.f888s;
                    } else {
                        i10 = childAt4.getRight() + layoutParams2.rightMargin;
                        e(canvas, i10);
                    }
                } else if (a10) {
                    i10 = getPaddingLeft();
                    e(canvas, i10);
                } else {
                    i12 = getWidth() - getPaddingRight();
                    i11 = this.f888s;
                }
                i10 = i12 - i11;
                e(canvas, i10);
            }
        }
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01ab  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r26, int r27, int r28, int r29, int r30) {
        /*
            r25 = this;
            r0 = r25
            int r1 = r0.f880d
            r2 = 80
            r3 = 16
            r4 = 8
            r5 = 5
            r6 = 8388615(0x800007, float:1.1754953E-38)
            r7 = 2
            r8 = 1
            if (r1 != r8) goto L_0x00bb
            int r1 = r25.getPaddingLeft()
            int r10 = r29 - r27
            int r11 = r25.getPaddingRight()
            int r11 = r10 - r11
            int r10 = r10 - r1
            int r12 = r25.getPaddingRight()
            int r10 = r10 - r12
            int r12 = r25.getVirtualChildCount()
            int r13 = r0.f881e
            r14 = r13 & 112(0x70, float:1.57E-43)
            r6 = r6 & r13
            if (r14 == r3) goto L_0x0042
            if (r14 == r2) goto L_0x0036
            int r2 = r25.getPaddingTop()
            goto L_0x004d
        L_0x0036:
            int r2 = r25.getPaddingTop()
            int r2 = r2 + r30
            int r2 = r2 - r28
            int r3 = r0.f882f
            int r2 = r2 - r3
            goto L_0x004d
        L_0x0042:
            int r2 = r25.getPaddingTop()
            int r3 = r30 - r28
            int r13 = r0.f882f
            int r3 = r3 - r13
            int r3 = r3 / r7
            int r2 = r2 + r3
        L_0x004d:
            r3 = 0
        L_0x004e:
            if (r3 >= r12) goto L_0x01d5
            android.view.View r13 = r0.getChildAt(r3)
            if (r13 != 0) goto L_0x0059
            int r2 = r2 + 0
            goto L_0x00b5
        L_0x0059:
            int r14 = r13.getVisibility()
            if (r14 == r4) goto L_0x00b5
            int r14 = r13.getMeasuredWidth()
            int r15 = r13.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r16 = r13.getLayoutParams()
            r4 = r16
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r4 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r4
            int r9 = r4.gravity
            if (r9 >= 0) goto L_0x0074
            r9 = r6
        L_0x0074:
            java.util.WeakHashMap<android.view.View, w1.q0> r17 = w1.d0.f16298a
            int r7 = w1.d0.e.d(r25)
            int r7 = android.view.Gravity.getAbsoluteGravity(r9, r7)
            r7 = r7 & 7
            if (r7 == r8) goto L_0x008d
            if (r7 == r5) goto L_0x0088
            int r7 = r4.leftMargin
            int r7 = r7 + r1
            goto L_0x0098
        L_0x0088:
            int r7 = r11 - r14
            int r9 = r4.rightMargin
            goto L_0x0097
        L_0x008d:
            int r7 = r10 - r14
            r9 = 2
            int r7 = r7 / r9
            int r7 = r7 + r1
            int r9 = r4.leftMargin
            int r7 = r7 + r9
            int r9 = r4.rightMargin
        L_0x0097:
            int r7 = r7 - r9
        L_0x0098:
            boolean r9 = r0.i(r3)
            if (r9 == 0) goto L_0x00a1
            int r9 = r0.f889t
            int r2 = r2 + r9
        L_0x00a1:
            int r9 = r4.topMargin
            int r2 = r2 + r9
            int r9 = r2 + 0
            int r14 = r14 + r7
            int r5 = r15 + r9
            r13.layout(r7, r9, r14, r5)
            int r4 = r4.bottomMargin
            int r15 = r15 + r4
            r4 = 0
            int r15 = r15 + r4
            int r15 = r15 + r2
            int r3 = r3 + 0
            r2 = r15
        L_0x00b5:
            int r3 = r3 + r8
            r4 = 8
            r5 = 5
            r7 = 2
            goto L_0x004e
        L_0x00bb:
            boolean r1 = androidx.appcompat.widget.u0.a(r25)
            int r4 = r25.getPaddingTop()
            int r5 = r30 - r28
            int r7 = r25.getPaddingBottom()
            int r7 = r5 - r7
            int r5 = r5 - r4
            int r9 = r25.getPaddingBottom()
            int r5 = r5 - r9
            int r9 = r25.getVirtualChildCount()
            int r10 = r0.f881e
            r6 = r6 & r10
            r10 = r10 & 112(0x70, float:1.57E-43)
            boolean r11 = r0.f877a
            int[] r12 = r0.f885p
            int[] r13 = r0.f886q
            java.util.WeakHashMap<android.view.View, w1.q0> r14 = w1.d0.f16298a
            int r14 = w1.d0.e.d(r25)
            int r6 = android.view.Gravity.getAbsoluteGravity(r6, r14)
            if (r6 == r8) goto L_0x0100
            r14 = 5
            if (r6 == r14) goto L_0x00f4
            int r6 = r25.getPaddingLeft()
            goto L_0x010c
        L_0x00f4:
            int r6 = r25.getPaddingLeft()
            int r6 = r6 + r29
            int r6 = r6 - r27
            int r14 = r0.f882f
            int r6 = r6 - r14
            goto L_0x010c
        L_0x0100:
            int r6 = r25.getPaddingLeft()
            int r14 = r29 - r27
            int r15 = r0.f882f
            int r14 = r14 - r15
            r15 = 2
            int r14 = r14 / r15
            int r6 = r6 + r14
        L_0x010c:
            if (r1 == 0) goto L_0x0112
            int r1 = r9 + -1
            r15 = -1
            goto L_0x0114
        L_0x0112:
            r15 = r8
            r1 = 0
        L_0x0114:
            r18 = r6
            r6 = 0
        L_0x0117:
            if (r6 >= r9) goto L_0x01d5
            int r19 = r15 * r6
            int r8 = r19 + r1
            android.view.View r2 = r0.getChildAt(r8)
            if (r2 != 0) goto L_0x012f
            int r18 = r18 + 0
        L_0x0125:
            r28 = r1
            r30 = r9
            r22 = r10
            r1 = 0
        L_0x012c:
            r2 = 1
            goto L_0x01c7
        L_0x012f:
            int r3 = r2.getVisibility()
            r14 = 8
            if (r3 == r14) goto L_0x0125
            int r3 = r2.getMeasuredWidth()
            int r21 = r2.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r22 = r2.getLayoutParams()
            r14 = r22
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r14 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r14
            if (r11 == 0) goto L_0x0157
            r28 = r1
            int r1 = r14.height
            r30 = r9
            r9 = -1
            if (r1 == r9) goto L_0x015b
            int r9 = r2.getBaseline()
            goto L_0x015c
        L_0x0157:
            r28 = r1
            r30 = r9
        L_0x015b:
            r9 = -1
        L_0x015c:
            int r1 = r14.gravity
            if (r1 >= 0) goto L_0x0161
            r1 = r10
        L_0x0161:
            r1 = r1 & 112(0x70, float:1.57E-43)
            r22 = r10
            r10 = 16
            if (r1 == r10) goto L_0x0199
            r10 = 48
            if (r1 == r10) goto L_0x018a
            r10 = 80
            if (r1 == r10) goto L_0x0174
            r1 = r4
            r10 = -1
            goto L_0x01a5
        L_0x0174:
            int r1 = r7 - r21
            int r10 = r14.bottomMargin
            int r1 = r1 - r10
            r10 = -1
            if (r9 == r10) goto L_0x01a5
            int r23 = r2.getMeasuredHeight()
            int r23 = r23 - r9
            r9 = 2
            r24 = r13[r9]
            int r24 = r24 - r23
            int r1 = r1 - r24
            goto L_0x01a5
        L_0x018a:
            r10 = -1
            int r1 = r14.topMargin
            int r1 = r1 + r4
            if (r9 == r10) goto L_0x01a5
            r20 = 1
            r23 = r12[r20]
            int r23 = r23 - r9
            int r1 = r23 + r1
            goto L_0x01a5
        L_0x0199:
            r10 = -1
            int r1 = r5 - r21
            r9 = 2
            int r1 = r1 / r9
            int r1 = r1 + r4
            int r9 = r14.topMargin
            int r1 = r1 + r9
            int r9 = r14.bottomMargin
            int r1 = r1 - r9
        L_0x01a5:
            boolean r8 = r0.i(r8)
            if (r8 == 0) goto L_0x01af
            int r8 = r0.f888s
            int r18 = r18 + r8
        L_0x01af:
            int r8 = r14.leftMargin
            int r18 = r18 + r8
            int r8 = r18 + 0
            int r9 = r3 + r8
            int r10 = r21 + r1
            r2.layout(r8, r1, r9, r10)
            int r1 = r14.rightMargin
            int r3 = r3 + r1
            r1 = 0
            int r3 = r3 + r1
            int r18 = r3 + r18
            int r6 = r6 + 0
            goto L_0x012c
        L_0x01c7:
            int r6 = r6 + r2
            r1 = r28
            r9 = r30
            r8 = r2
            r10 = r22
            r2 = 80
            r3 = 16
            goto L_0x0117
        L_0x01d5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:143:0x02ed  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x02f8  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x02fa  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x0492  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0497  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x04bf  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x04c4  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x04cc  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x04da  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x04ee  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x04fb  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x04ff  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x051f  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x0548  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x054a  */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x0552  */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x055f  */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x05f4  */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x06b1  */
    /* JADX WARNING: Removed duplicated region for block: B:311:0x06cf  */
    /* JADX WARNING: Removed duplicated region for block: B:353:0x07be  */
    /* JADX WARNING: Removed duplicated region for block: B:357:0x07e2  */
    /* JADX WARNING: Removed duplicated region for block: B:367:0x0822  */
    /* JADX WARNING: Removed duplicated region for block: B:370:0x082b  */
    /* JADX WARNING: Removed duplicated region for block: B:378:0x0883  */
    /* JADX WARNING: Removed duplicated region for block: B:425:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r38, int r39) {
        /*
            r37 = this;
            r6 = r37
            r7 = r38
            r8 = r39
            int r0 = r6.f880d
            r10 = -2
            r12 = 8
            r14 = 1
            r15 = 0
            r5 = 1073741824(0x40000000, float:2.0)
            r4 = 0
            if (r0 != r14) goto L_0x038c
            r6.f882f = r4
            int r3 = r37.getVirtualChildCount()
            int r2 = android.view.View.MeasureSpec.getMode(r38)
            int r1 = android.view.View.MeasureSpec.getMode(r39)
            int r0 = r6.f878b
            boolean r9 = r6.f884o
            r13 = r4
            r19 = r13
            r20 = r19
            r21 = r20
            r22 = r21
            r24 = r22
            r25 = r24
            r18 = r14
            r23 = r15
            r14 = r25
        L_0x0037:
            if (r14 >= r3) goto L_0x0167
            android.view.View r26 = r6.getChildAt(r14)
            if (r26 != 0) goto L_0x0045
            int r11 = r6.f882f
            int r11 = r11 + r4
            r6.f882f = r11
            goto L_0x004d
        L_0x0045:
            int r11 = r26.getVisibility()
            if (r11 != r12) goto L_0x0056
            int r14 = r14 + 0
        L_0x004d:
            r10 = r0
            r29 = r1
            r0 = r2
            r31 = r3
        L_0x0053:
            r1 = 1
            goto L_0x0157
        L_0x0056:
            boolean r11 = r6.i(r14)
            if (r11 == 0) goto L_0x0063
            int r11 = r6.f882f
            int r4 = r6.f889t
            int r11 = r11 + r4
            r6.f882f = r11
        L_0x0063:
            android.view.ViewGroup$LayoutParams r4 = r26.getLayoutParams()
            r11 = r4
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r11 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r11
            float r4 = r11.weight
            float r23 = r23 + r4
            if (r1 != r5) goto L_0x0091
            int r5 = r11.height
            if (r5 != 0) goto L_0x0091
            int r5 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r5 <= 0) goto L_0x0091
            int r4 = r6.f882f
            int r5 = r11.topMargin
            int r5 = r5 + r4
            int r12 = r11.bottomMargin
            int r5 = r5 + r12
            int r4 = java.lang.Math.max(r4, r5)
            r6.f882f = r4
            r10 = r0
            r29 = r1
            r30 = r2
            r31 = r3
            r15 = 0
            r24 = 1
            goto L_0x00dd
        L_0x0091:
            int r5 = r11.height
            if (r5 != 0) goto L_0x009d
            int r4 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r4 <= 0) goto L_0x009d
            r11.height = r10
            r12 = 0
            goto L_0x009f
        L_0x009d:
            r12 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x009f:
            r4 = 0
            int r5 = (r23 > r15 ? 1 : (r23 == r15 ? 0 : -1))
            if (r5 != 0) goto L_0x00a7
            int r5 = r6.f882f
            goto L_0x00a8
        L_0x00a7:
            r5 = 0
        L_0x00a8:
            r10 = r0
            r0 = r37
            r29 = r1
            r1 = r26
            r30 = r2
            r2 = r38
            r31 = r3
            r3 = r4
            r15 = 0
            r4 = r39
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r12 == r0) goto L_0x00c2
            r11.height = r12
        L_0x00c2:
            int r0 = r26.getMeasuredHeight()
            int r1 = r6.f882f
            int r2 = r1 + r0
            int r3 = r11.topMargin
            int r2 = r2 + r3
            int r3 = r11.bottomMargin
            int r2 = r2 + r3
            int r2 = r2 + r15
            int r1 = java.lang.Math.max(r1, r2)
            r6.f882f = r1
            if (r9 == 0) goto L_0x00dd
            int r13 = java.lang.Math.max(r0, r13)
        L_0x00dd:
            if (r10 < 0) goto L_0x00e7
            int r0 = r14 + 1
            if (r10 != r0) goto L_0x00e7
            int r0 = r6.f882f
            r6.f879c = r0
        L_0x00e7:
            if (r14 >= r10) goto L_0x00f9
            float r0 = r11.weight
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x00f1
            goto L_0x00f9
        L_0x00f1:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex."
            r0.<init>(r1)
            throw r0
        L_0x00f9:
            r0 = r30
            r12 = 1073741824(0x40000000, float:2.0)
            if (r0 == r12) goto L_0x0108
            int r1 = r11.width
            r2 = -1
            if (r1 != r2) goto L_0x0108
            r4 = 1
            r25 = 1
            goto L_0x0109
        L_0x0108:
            r4 = r15
        L_0x0109:
            int r1 = r11.leftMargin
            int r2 = r11.rightMargin
            int r1 = r1 + r2
            int r2 = r26.getMeasuredWidth()
            int r2 = r2 + r1
            r3 = r22
            int r3 = java.lang.Math.max(r3, r2)
            int r5 = r26.getMeasuredState()
            r12 = r21
            int r5 = android.view.View.combineMeasuredStates(r12, r5)
            if (r18 == 0) goto L_0x012c
            int r12 = r11.width
            r15 = -1
            if (r12 != r15) goto L_0x012c
            r12 = 1
            goto L_0x012d
        L_0x012c:
            r12 = 0
        L_0x012d:
            float r11 = r11.weight
            r15 = 0
            int r11 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r11 <= 0) goto L_0x013f
            if (r4 == 0) goto L_0x0137
            goto L_0x0138
        L_0x0137:
            r1 = r2
        L_0x0138:
            r11 = r20
            int r20 = java.lang.Math.max(r11, r1)
            goto L_0x014d
        L_0x013f:
            r11 = r20
            if (r4 == 0) goto L_0x0144
            goto L_0x0145
        L_0x0144:
            r1 = r2
        L_0x0145:
            r4 = r19
            int r19 = java.lang.Math.max(r4, r1)
            r20 = r11
        L_0x014d:
            int r14 = r14 + 0
            r22 = r3
            r21 = r5
            r18 = r12
            goto L_0x0053
        L_0x0157:
            int r14 = r14 + r1
            r2 = r0
            r0 = r10
            r1 = r29
            r3 = r31
            r4 = 0
            r5 = 1073741824(0x40000000, float:2.0)
            r10 = -2
            r12 = 8
            r15 = 0
            goto L_0x0037
        L_0x0167:
            r29 = r1
            r0 = r2
            r31 = r3
            r4 = r19
            r11 = r20
            r12 = r21
            r3 = r22
            int r1 = r6.f882f
            r10 = r31
            if (r1 <= 0) goto L_0x0187
            boolean r1 = r6.i(r10)
            if (r1 == 0) goto L_0x0187
            int r1 = r6.f882f
            int r2 = r6.f889t
            int r1 = r1 + r2
            r6.f882f = r1
        L_0x0187:
            if (r9 == 0) goto L_0x01d4
            r1 = r29
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r2) goto L_0x0195
            if (r1 != 0) goto L_0x0192
            goto L_0x0195
        L_0x0192:
            r19 = r3
            goto L_0x01d8
        L_0x0195:
            r2 = 0
            r6.f882f = r2
            r5 = r2
        L_0x0199:
            if (r5 >= r10) goto L_0x0192
            android.view.View r14 = r6.getChildAt(r5)
            if (r14 != 0) goto L_0x01a7
            int r14 = r6.f882f
            int r14 = r14 + r2
            r6.f882f = r14
            goto L_0x01b1
        L_0x01a7:
            int r2 = r14.getVisibility()
            r15 = 8
            if (r2 != r15) goto L_0x01b4
            int r5 = r5 + 0
        L_0x01b1:
            r19 = r3
            goto L_0x01ce
        L_0x01b4:
            android.view.ViewGroup$LayoutParams r2 = r14.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r2 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r2
            int r14 = r6.f882f
            int r15 = r14 + r13
            r19 = r3
            int r3 = r2.topMargin
            int r15 = r15 + r3
            int r2 = r2.bottomMargin
            int r15 = r15 + r2
            r2 = 0
            int r15 = r15 + r2
            int r2 = java.lang.Math.max(r14, r15)
            r6.f882f = r2
        L_0x01ce:
            r2 = 1
            int r5 = r5 + r2
            r3 = r19
            r2 = 0
            goto L_0x0199
        L_0x01d4:
            r19 = r3
            r1 = r29
        L_0x01d8:
            int r2 = r6.f882f
            int r3 = r37.getPaddingTop()
            int r5 = r37.getPaddingBottom()
            int r5 = r5 + r3
            int r5 = r5 + r2
            r6.f882f = r5
            int r2 = r37.getSuggestedMinimumHeight()
            int r2 = java.lang.Math.max(r5, r2)
            r3 = 0
            int r2 = android.view.View.resolveSizeAndState(r2, r8, r3)
            r3 = 16777215(0xffffff, float:2.3509886E-38)
            r3 = r3 & r2
            int r5 = r6.f882f
            int r3 = r3 - r5
            if (r24 != 0) goto L_0x0245
            if (r3 == 0) goto L_0x0204
            r5 = 0
            int r14 = (r23 > r5 ? 1 : (r23 == r5 ? 0 : -1))
            if (r14 <= 0) goto L_0x0204
            goto L_0x0245
        L_0x0204:
            int r3 = java.lang.Math.max(r4, r11)
            if (r9 == 0) goto L_0x0241
            r4 = 1073741824(0x40000000, float:2.0)
            if (r1 == r4) goto L_0x0241
            r4 = 0
        L_0x020f:
            if (r4 >= r10) goto L_0x0241
            android.view.View r1 = r6.getChildAt(r4)
            if (r1 == 0) goto L_0x023e
            int r5 = r1.getVisibility()
            r9 = 8
            if (r5 != r9) goto L_0x0220
            goto L_0x023e
        L_0x0220:
            android.view.ViewGroup$LayoutParams r5 = r1.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r5 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r5
            float r5 = r5.weight
            r9 = 0
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r5 <= 0) goto L_0x023e
            int r5 = r1.getMeasuredWidth()
            r9 = 1073741824(0x40000000, float:2.0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r9)
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r13, r9)
            r1.measure(r5, r11)
        L_0x023e:
            int r4 = r4 + 1
            goto L_0x020f
        L_0x0241:
            r22 = r19
            goto L_0x032c
        L_0x0245:
            float r5 = r6.f883n
            r9 = 0
            int r11 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r11 <= 0) goto L_0x024e
            r23 = r5
        L_0x024e:
            r5 = 0
            r6.f882f = r5
            r5 = r4
            r9 = r19
            r4 = 0
        L_0x0255:
            if (r4 >= r10) goto L_0x031b
            android.view.View r11 = r6.getChildAt(r4)
            int r13 = r11.getVisibility()
            r14 = 8
            if (r13 != r14) goto L_0x0267
            r29 = r1
            goto L_0x0315
        L_0x0267:
            android.view.ViewGroup$LayoutParams r13 = r11.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r13 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r13
            float r14 = r13.weight
            r15 = 0
            int r16 = (r14 > r15 ? 1 : (r14 == r15 ? 0 : -1))
            if (r16 <= 0) goto L_0x02c9
            float r15 = (float) r3
            float r15 = r15 * r14
            float r15 = r15 / r23
            int r15 = (int) r15
            float r23 = r23 - r14
            int r3 = r3 - r15
            int r14 = r37.getPaddingLeft()
            int r16 = r37.getPaddingRight()
            int r16 = r16 + r14
            int r14 = r13.leftMargin
            int r16 = r16 + r14
            int r14 = r13.rightMargin
            int r14 = r16 + r14
            r16 = r3
            int r3 = r13.width
            int r3 = android.view.ViewGroup.getChildMeasureSpec(r7, r14, r3)
            int r14 = r13.height
            if (r14 != 0) goto L_0x02ab
            r14 = 1073741824(0x40000000, float:2.0)
            if (r1 == r14) goto L_0x029f
            goto L_0x02ad
        L_0x029f:
            if (r15 <= 0) goto L_0x02a2
            goto L_0x02a3
        L_0x02a2:
            r15 = 0
        L_0x02a3:
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r14)
            r11.measure(r3, r15)
            goto L_0x02bd
        L_0x02ab:
            r14 = 1073741824(0x40000000, float:2.0)
        L_0x02ad:
            int r19 = r11.getMeasuredHeight()
            int r15 = r19 + r15
            if (r15 >= 0) goto L_0x02b6
            r15 = 0
        L_0x02b6:
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r14)
            r11.measure(r3, r15)
        L_0x02bd:
            int r3 = r11.getMeasuredState()
            r3 = r3 & -256(0xffffffffffffff00, float:NaN)
            int r12 = android.view.View.combineMeasuredStates(r12, r3)
            r3 = r16
        L_0x02c9:
            int r14 = r13.leftMargin
            int r15 = r13.rightMargin
            int r14 = r14 + r15
            int r15 = r11.getMeasuredWidth()
            int r15 = r15 + r14
            int r9 = java.lang.Math.max(r9, r15)
            r29 = r1
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L_0x02e6
            int r1 = r13.width
            r16 = r3
            r3 = -1
            if (r1 != r3) goto L_0x02e9
            r1 = 1
            goto L_0x02ea
        L_0x02e6:
            r16 = r3
            r3 = -1
        L_0x02e9:
            r1 = 0
        L_0x02ea:
            if (r1 == 0) goto L_0x02ed
            goto L_0x02ee
        L_0x02ed:
            r14 = r15
        L_0x02ee:
            int r1 = java.lang.Math.max(r5, r14)
            if (r18 == 0) goto L_0x02fa
            int r5 = r13.width
            if (r5 != r3) goto L_0x02fa
            r3 = 1
            goto L_0x02fb
        L_0x02fa:
            r3 = 0
        L_0x02fb:
            int r5 = r6.f882f
            int r11 = r11.getMeasuredHeight()
            int r11 = r11 + r5
            int r14 = r13.topMargin
            int r11 = r11 + r14
            int r13 = r13.bottomMargin
            int r11 = r11 + r13
            r13 = 0
            int r11 = r11 + r13
            int r5 = java.lang.Math.max(r5, r11)
            r6.f882f = r5
            r5 = r1
            r18 = r3
            r3 = r16
        L_0x0315:
            int r4 = r4 + 1
            r1 = r29
            goto L_0x0255
        L_0x031b:
            int r1 = r6.f882f
            int r3 = r37.getPaddingTop()
            int r4 = r37.getPaddingBottom()
            int r4 = r4 + r3
            int r4 = r4 + r1
            r6.f882f = r4
            r3 = r5
            r22 = r9
        L_0x032c:
            if (r18 != 0) goto L_0x0333
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L_0x0333
            goto L_0x0335
        L_0x0333:
            r3 = r22
        L_0x0335:
            int r0 = r37.getPaddingLeft()
            int r1 = r37.getPaddingRight()
            int r1 = r1 + r0
            int r1 = r1 + r3
            int r0 = r37.getSuggestedMinimumWidth()
            int r0 = java.lang.Math.max(r1, r0)
            int r0 = android.view.View.resolveSizeAndState(r0, r7, r12)
            r6.setMeasuredDimension(r0, r2)
            if (r25 == 0) goto L_0x08c0
            int r0 = r37.getMeasuredWidth()
            r1 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r9 = 0
        L_0x035b:
            if (r9 >= r10) goto L_0x08c0
            android.view.View r1 = r6.getChildAt(r9)
            int r0 = r1.getVisibility()
            r2 = 8
            if (r0 == r2) goto L_0x0389
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            r11 = r0
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r11 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r11
            int r0 = r11.width
            r2 = -1
            if (r0 != r2) goto L_0x0389
            int r12 = r11.height
            int r0 = r1.getMeasuredHeight()
            r11.height = r0
            r3 = 0
            r5 = 0
            r0 = r37
            r2 = r7
            r4 = r39
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r11.height = r12
        L_0x0389:
            int r9 = r9 + 1
            goto L_0x035b
        L_0x038c:
            r0 = r4
            r6.f882f = r0
            int r9 = r37.getVirtualChildCount()
            int r10 = android.view.View.MeasureSpec.getMode(r38)
            int r11 = android.view.View.MeasureSpec.getMode(r39)
            int[] r0 = r6.f885p
            r12 = 4
            if (r0 == 0) goto L_0x03a4
            int[] r0 = r6.f886q
            if (r0 != 0) goto L_0x03ac
        L_0x03a4:
            int[] r0 = new int[r12]
            r6.f885p = r0
            int[] r0 = new int[r12]
            r6.f886q = r0
        L_0x03ac:
            int[] r13 = r6.f885p
            int[] r14 = r6.f886q
            r15 = 3
            r0 = -1
            r13[r15] = r0
            r18 = 2
            r13[r18] = r0
            r1 = 1
            r13[r1] = r0
            r2 = 0
            r13[r2] = r0
            r14[r15] = r0
            r14[r18] = r0
            r14[r1] = r0
            r14[r2] = r0
            boolean r5 = r6.f877a
            boolean r4 = r6.f884o
            r0 = 1073741824(0x40000000, float:2.0)
            if (r10 != r0) goto L_0x03d1
            r19 = 1
            goto L_0x03d3
        L_0x03d1:
            r19 = 0
        L_0x03d3:
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r12 = 0
            r15 = 0
            r21 = 0
            r22 = 0
            r24 = 1
            r32 = 0
        L_0x03e1:
            if (r3 >= r9) goto L_0x0580
            android.view.View r8 = r6.getChildAt(r3)
            if (r8 != 0) goto L_0x03f6
            int r8 = r6.f882f
            r25 = 0
            int r8 = r8 + 0
            r6.f882f = r8
            r25 = r0
            r26 = r2
            goto L_0x0404
        L_0x03f6:
            r25 = r0
            int r0 = r8.getVisibility()
            r26 = r2
            r2 = 8
            if (r0 != r2) goto L_0x040f
            int r3 = r3 + 0
        L_0x0404:
            r29 = r5
            r0 = r25
            r2 = r26
            r26 = r4
            r4 = 1
            goto L_0x0577
        L_0x040f:
            boolean r0 = r6.i(r3)
            if (r0 == 0) goto L_0x041c
            int r0 = r6.f882f
            int r2 = r6.f888s
            int r0 = r0 + r2
            r6.f882f = r0
        L_0x041c:
            android.view.ViewGroup$LayoutParams r0 = r8.getLayoutParams()
            r2 = r0
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r2 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r2
            float r0 = r2.weight
            float r28 = r1 + r0
            r1 = 1073741824(0x40000000, float:2.0)
            if (r10 != r1) goto L_0x047b
            int r1 = r2.width
            if (r1 != 0) goto L_0x047b
            r1 = 0
            int r29 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r29 <= 0) goto L_0x047b
            if (r19 == 0) goto L_0x0443
            int r0 = r6.f882f
            int r1 = r2.leftMargin
            r29 = r3
            int r3 = r2.rightMargin
            int r1 = r1 + r3
            int r1 = r1 + r0
            r6.f882f = r1
            goto L_0x0453
        L_0x0443:
            r29 = r3
            int r0 = r6.f882f
            int r1 = r2.leftMargin
            int r1 = r1 + r0
            int r3 = r2.rightMargin
            int r1 = r1 + r3
            int r0 = java.lang.Math.max(r0, r1)
            r6.f882f = r0
        L_0x0453:
            if (r5 == 0) goto L_0x046a
            r0 = 0
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0)
            r8.measure(r1, r1)
            r1 = r2
            r33 = r25
            r34 = r26
            r25 = r29
            r26 = r4
            r29 = r5
            goto L_0x04f2
        L_0x046a:
            r1 = r2
            r33 = r25
            r34 = r26
            r25 = r29
            r0 = 1073741824(0x40000000, float:2.0)
            r21 = 1
            r26 = r4
            r29 = r5
            goto L_0x04f4
        L_0x047b:
            r29 = r3
            int r1 = r2.width
            if (r1 != 0) goto L_0x048b
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x048c
            r0 = -2
            r2.width = r0
            r3 = 0
            goto L_0x048e
        L_0x048b:
            r1 = 0
        L_0x048c:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x048e:
            int r0 = (r28 > r1 ? 1 : (r28 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0497
            int r0 = r6.f882f
            r30 = r0
            goto L_0x0499
        L_0x0497:
            r30 = 0
        L_0x0499:
            r31 = 0
            r1 = r25
            r0 = r37
            r33 = r1
            r1 = r8
            r35 = r2
            r34 = r26
            r2 = r38
            r36 = r3
            r25 = r29
            r3 = r30
            r26 = r4
            r4 = r39
            r29 = r5
            r5 = r31
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r0 = r36
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L_0x04c4
            r1 = r35
            r1.width = r0
            goto L_0x04c6
        L_0x04c4:
            r1 = r35
        L_0x04c6:
            int r0 = r8.getMeasuredWidth()
            if (r19 == 0) goto L_0x04da
            int r2 = r6.f882f
            int r3 = r1.leftMargin
            int r3 = r3 + r0
            int r4 = r1.rightMargin
            int r3 = r3 + r4
            r4 = 0
            int r3 = r3 + r4
            int r3 = r3 + r2
            r6.f882f = r3
            goto L_0x04ec
        L_0x04da:
            r4 = 0
            int r2 = r6.f882f
            int r3 = r2 + r0
            int r5 = r1.leftMargin
            int r3 = r3 + r5
            int r5 = r1.rightMargin
            int r3 = r3 + r5
            int r3 = r3 + r4
            int r2 = java.lang.Math.max(r2, r3)
            r6.f882f = r2
        L_0x04ec:
            if (r26 == 0) goto L_0x04f2
            int r12 = java.lang.Math.max(r0, r12)
        L_0x04f2:
            r0 = 1073741824(0x40000000, float:2.0)
        L_0x04f4:
            if (r11 == r0) goto L_0x04ff
            int r0 = r1.height
            r2 = -1
            if (r0 != r2) goto L_0x04ff
            r4 = 1
            r22 = 1
            goto L_0x0500
        L_0x04ff:
            r4 = 0
        L_0x0500:
            int r0 = r1.topMargin
            int r2 = r1.bottomMargin
            int r0 = r0 + r2
            int r2 = r8.getMeasuredHeight()
            int r2 = r2 + r0
            int r3 = r8.getMeasuredState()
            int r3 = android.view.View.combineMeasuredStates(r15, r3)
            if (r29 == 0) goto L_0x053b
            int r5 = r8.getBaseline()
            r8 = -1
            if (r5 == r8) goto L_0x053b
            int r8 = r1.gravity
            if (r8 >= 0) goto L_0x0521
            int r8 = r6.f881e
        L_0x0521:
            r8 = r8 & 112(0x70, float:1.57E-43)
            r15 = 4
            int r8 = r8 >> r15
            r15 = -2
            r8 = r8 & r15
            r15 = 1
            int r8 = r8 >> r15
            r15 = r13[r8]
            int r15 = java.lang.Math.max(r15, r5)
            r13[r8] = r15
            r15 = r14[r8]
            int r5 = r2 - r5
            int r5 = java.lang.Math.max(r15, r5)
            r14[r8] = r5
        L_0x053b:
            r5 = r34
            int r5 = java.lang.Math.max(r5, r2)
            if (r24 == 0) goto L_0x054a
            int r8 = r1.height
            r15 = -1
            if (r8 != r15) goto L_0x054a
            r8 = 1
            goto L_0x054b
        L_0x054a:
            r8 = 0
        L_0x054b:
            float r1 = r1.weight
            r15 = 0
            int r1 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r1 <= 0) goto L_0x055f
            if (r4 == 0) goto L_0x0555
            goto L_0x0556
        L_0x0555:
            r0 = r2
        L_0x0556:
            r1 = r32
            int r32 = java.lang.Math.max(r1, r0)
            r0 = r33
            goto L_0x056d
        L_0x055f:
            r1 = r32
            if (r4 == 0) goto L_0x0564
            goto L_0x0565
        L_0x0564:
            r0 = r2
        L_0x0565:
            r2 = r33
            int r0 = java.lang.Math.max(r2, r0)
            r32 = r1
        L_0x056d:
            int r1 = r25 + 0
            r15 = r3
            r2 = r5
            r24 = r8
            r4 = 1
            r3 = r1
            r1 = r28
        L_0x0577:
            int r3 = r3 + r4
            r8 = r39
            r4 = r26
            r5 = r29
            goto L_0x03e1
        L_0x0580:
            r26 = r4
            r29 = r5
            r5 = r2
            r2 = r0
            r0 = r32
            int r3 = r6.f882f
            if (r3 <= 0) goto L_0x0599
            boolean r3 = r6.i(r9)
            if (r3 == 0) goto L_0x0599
            int r3 = r6.f882f
            int r4 = r6.f888s
            int r3 = r3 + r4
            r6.f882f = r3
        L_0x0599:
            r3 = 1
            r4 = r13[r3]
            r3 = -1
            r25 = r15
            if (r4 != r3) goto L_0x05b4
            r8 = 0
            r15 = r13[r8]
            if (r15 != r3) goto L_0x05b4
            r8 = r13[r18]
            if (r8 != r3) goto L_0x05b4
            r8 = 3
            r15 = r13[r8]
            if (r15 == r3) goto L_0x05b0
            goto L_0x05b5
        L_0x05b0:
            r3 = r5
            r28 = r11
            goto L_0x05e6
        L_0x05b4:
            r8 = 3
        L_0x05b5:
            r3 = r13[r8]
            r15 = 0
            r8 = r13[r15]
            r15 = r13[r18]
            int r4 = java.lang.Math.max(r4, r15)
            int r4 = java.lang.Math.max(r8, r4)
            int r3 = java.lang.Math.max(r3, r4)
            r4 = 3
            r8 = r14[r4]
            r4 = 0
            r15 = r14[r4]
            r28 = r11
            r4 = 1
            r11 = r14[r4]
            r4 = r14[r18]
            int r4 = java.lang.Math.max(r11, r4)
            int r4 = java.lang.Math.max(r15, r4)
            int r4 = java.lang.Math.max(r8, r4)
            int r4 = r4 + r3
            int r3 = java.lang.Math.max(r5, r4)
        L_0x05e6:
            if (r26 == 0) goto L_0x0638
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 == r4) goto L_0x05ee
            if (r10 != 0) goto L_0x0638
        L_0x05ee:
            r4 = 0
            r6.f882f = r4
            r5 = r4
        L_0x05f2:
            if (r5 >= r9) goto L_0x0638
            android.view.View r8 = r6.getChildAt(r5)
            if (r8 != 0) goto L_0x0600
            int r8 = r6.f882f
            int r8 = r8 + r4
            r6.f882f = r8
            goto L_0x0634
        L_0x0600:
            int r4 = r8.getVisibility()
            r11 = 8
            if (r4 != r11) goto L_0x060b
            int r5 = r5 + 0
            goto L_0x0634
        L_0x060b:
            android.view.ViewGroup$LayoutParams r4 = r8.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r4 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r4
            if (r19 == 0) goto L_0x0621
            int r8 = r6.f882f
            int r11 = r4.leftMargin
            int r11 = r11 + r12
            int r4 = r4.rightMargin
            int r11 = r11 + r4
            r15 = 0
            int r11 = r11 + r15
            int r11 = r11 + r8
            r6.f882f = r11
            goto L_0x0634
        L_0x0621:
            r15 = 0
            int r8 = r6.f882f
            int r11 = r8 + r12
            int r15 = r4.leftMargin
            int r11 = r11 + r15
            int r4 = r4.rightMargin
            int r11 = r11 + r4
            r4 = 0
            int r11 = r11 + r4
            int r4 = java.lang.Math.max(r8, r11)
            r6.f882f = r4
        L_0x0634:
            r4 = 1
            int r5 = r5 + r4
            r4 = 0
            goto L_0x05f2
        L_0x0638:
            int r4 = r6.f882f
            int r5 = r37.getPaddingLeft()
            int r8 = r37.getPaddingRight()
            int r8 = r8 + r5
            int r8 = r8 + r4
            r6.f882f = r8
            int r4 = r37.getSuggestedMinimumWidth()
            int r4 = java.lang.Math.max(r8, r4)
            r5 = 0
            int r4 = android.view.View.resolveSizeAndState(r4, r7, r5)
            r5 = 16777215(0xffffff, float:2.3509886E-38)
            r5 = r5 & r4
            int r8 = r6.f882f
            int r5 = r5 - r8
            if (r21 != 0) goto L_0x06aa
            if (r5 == 0) goto L_0x0664
            r11 = 0
            int r15 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r15 <= 0) goto L_0x0664
            goto L_0x06aa
        L_0x0664:
            int r0 = java.lang.Math.max(r2, r0)
            if (r26 == 0) goto L_0x06a1
            r1 = 1073741824(0x40000000, float:2.0)
            if (r10 == r1) goto L_0x06a1
            r1 = 0
        L_0x066f:
            if (r1 >= r9) goto L_0x06a1
            android.view.View r2 = r6.getChildAt(r1)
            if (r2 == 0) goto L_0x069e
            int r5 = r2.getVisibility()
            r10 = 8
            if (r5 != r10) goto L_0x0680
            goto L_0x069e
        L_0x0680:
            android.view.ViewGroup$LayoutParams r5 = r2.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r5 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r5
            float r5 = r5.weight
            r10 = 0
            int r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r5 <= 0) goto L_0x069e
            r5 = 1073741824(0x40000000, float:2.0)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r12, r5)
            int r11 = r2.getMeasuredHeight()
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r11, r5)
            r2.measure(r10, r11)
        L_0x069e:
            int r1 = r1 + 1
            goto L_0x066f
        L_0x06a1:
            r5 = r39
            r15 = r25
            r12 = r28
        L_0x06a7:
            r8 = 0
            goto L_0x085a
        L_0x06aa:
            float r0 = r6.f883n
            r3 = 0
            int r11 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r11 <= 0) goto L_0x06b2
            r1 = r0
        L_0x06b2:
            r0 = 3
            r3 = -1
            r13[r0] = r3
            r13[r18] = r3
            r11 = 1
            r13[r11] = r3
            r12 = 0
            r13[r12] = r3
            r14[r0] = r3
            r14[r18] = r3
            r14[r11] = r3
            r14[r12] = r3
            r6.f882f = r12
            r0 = r2
            r15 = r25
            r2 = -1
            r3 = 0
        L_0x06cd:
            if (r3 >= r9) goto L_0x0801
            android.view.View r11 = r6.getChildAt(r3)
            if (r11 == 0) goto L_0x07eb
            int r12 = r11.getVisibility()
            r8 = 8
            if (r12 != r8) goto L_0x06df
            goto L_0x07eb
        L_0x06df:
            android.view.ViewGroup$LayoutParams r8 = r11.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r8 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r8
            float r12 = r8.weight
            r21 = 0
            int r25 = (r12 > r21 ? 1 : (r12 == r21 ? 0 : -1))
            if (r25 <= 0) goto L_0x0748
            float r7 = (float) r5
            float r7 = r7 * r12
            float r7 = r7 / r1
            int r7 = (int) r7
            float r1 = r1 - r12
            int r5 = r5 - r7
            int r12 = r37.getPaddingTop()
            int r25 = r37.getPaddingBottom()
            int r25 = r25 + r12
            int r12 = r8.topMargin
            int r25 = r25 + r12
            int r12 = r8.bottomMargin
            int r12 = r25 + r12
            r25 = r1
            int r1 = r8.height
            r26 = r5
            r5 = r39
            int r1 = android.view.ViewGroup.getChildMeasureSpec(r5, r12, r1)
            int r12 = r8.width
            if (r12 != 0) goto L_0x0726
            r12 = 1073741824(0x40000000, float:2.0)
            if (r10 == r12) goto L_0x071a
            goto L_0x0728
        L_0x071a:
            if (r7 <= 0) goto L_0x071d
            goto L_0x071e
        L_0x071d:
            r7 = 0
        L_0x071e:
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r12)
            r11.measure(r7, r1)
            goto L_0x0738
        L_0x0726:
            r12 = 1073741824(0x40000000, float:2.0)
        L_0x0728:
            int r27 = r11.getMeasuredWidth()
            int r7 = r27 + r7
            if (r7 >= 0) goto L_0x0731
            r7 = 0
        L_0x0731:
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r12)
            r11.measure(r7, r1)
        L_0x0738:
            int r1 = r11.getMeasuredState()
            r7 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 & r7
            int r15 = android.view.View.combineMeasuredStates(r15, r1)
            r1 = r25
            r7 = r26
            goto L_0x074b
        L_0x0748:
            r7 = r5
            r5 = r39
        L_0x074b:
            if (r19 == 0) goto L_0x0767
            int r12 = r6.f882f
            int r25 = r11.getMeasuredWidth()
            r26 = r1
            int r1 = r8.leftMargin
            int r25 = r25 + r1
            int r1 = r8.rightMargin
            int r25 = r25 + r1
            r1 = 0
            int r25 = r25 + 0
            int r12 = r25 + r12
            r6.f882f = r12
            r27 = r7
            goto L_0x0785
        L_0x0767:
            r26 = r1
            r1 = 0
            int r12 = r6.f882f
            int r25 = r11.getMeasuredWidth()
            int r25 = r25 + r12
            int r1 = r8.leftMargin
            int r25 = r25 + r1
            int r1 = r8.rightMargin
            int r25 = r25 + r1
            r27 = r7
            r1 = 0
            int r7 = r25 + 0
            int r1 = java.lang.Math.max(r12, r7)
            r6.f882f = r1
        L_0x0785:
            r12 = r28
            r1 = 1073741824(0x40000000, float:2.0)
            if (r12 == r1) goto L_0x0792
            int r1 = r8.height
            r7 = -1
            if (r1 != r7) goto L_0x0792
            r1 = 1
            goto L_0x0793
        L_0x0792:
            r1 = 0
        L_0x0793:
            int r7 = r8.topMargin
            r25 = r10
            int r10 = r8.bottomMargin
            int r7 = r7 + r10
            int r10 = r11.getMeasuredHeight()
            int r10 = r10 + r7
            int r2 = java.lang.Math.max(r2, r10)
            if (r1 == 0) goto L_0x07a6
            goto L_0x07a7
        L_0x07a6:
            r7 = r10
        L_0x07a7:
            int r0 = java.lang.Math.max(r0, r7)
            if (r24 == 0) goto L_0x07b4
            int r1 = r8.height
            r7 = -1
            if (r1 != r7) goto L_0x07b5
            r1 = 1
            goto L_0x07b6
        L_0x07b4:
            r7 = -1
        L_0x07b5:
            r1 = 0
        L_0x07b6:
            if (r29 == 0) goto L_0x07e2
            int r11 = r11.getBaseline()
            if (r11 == r7) goto L_0x07e2
            int r7 = r8.gravity
            if (r7 >= 0) goto L_0x07c4
            int r7 = r6.f881e
        L_0x07c4:
            r7 = r7 & 112(0x70, float:1.57E-43)
            r8 = 4
            int r7 = r7 >> r8
            r23 = -2
            r7 = r7 & -2
            r17 = 1
            int r7 = r7 >> 1
            r8 = r13[r7]
            int r8 = java.lang.Math.max(r8, r11)
            r13[r7] = r8
            r8 = r14[r7]
            int r10 = r10 - r11
            int r8 = java.lang.Math.max(r8, r10)
            r14[r7] = r8
            goto L_0x07e4
        L_0x07e2:
            r23 = -2
        L_0x07e4:
            r24 = r1
            r1 = r26
            r7 = r27
            goto L_0x07f6
        L_0x07eb:
            r7 = r5
            r25 = r10
            r12 = r28
            r21 = 0
            r23 = -2
            r5 = r39
        L_0x07f6:
            int r3 = r3 + 1
            r5 = r7
            r28 = r12
            r10 = r25
            r7 = r38
            goto L_0x06cd
        L_0x0801:
            r5 = r39
            r12 = r28
            int r1 = r6.f882f
            int r3 = r37.getPaddingLeft()
            int r7 = r37.getPaddingRight()
            int r7 = r7 + r3
            int r7 = r7 + r1
            r6.f882f = r7
            r1 = 1
            r3 = r13[r1]
            r1 = -1
            if (r3 != r1) goto L_0x082b
            r7 = 0
            r8 = r13[r7]
            if (r8 != r1) goto L_0x082b
            r7 = r13[r18]
            if (r7 != r1) goto L_0x082b
            r7 = 3
            r8 = r13[r7]
            if (r8 == r1) goto L_0x0828
            goto L_0x082c
        L_0x0828:
            r3 = r2
            goto L_0x06a7
        L_0x082b:
            r7 = 3
        L_0x082c:
            r1 = r13[r7]
            r8 = 0
            r10 = r13[r8]
            r11 = r13[r18]
            int r3 = java.lang.Math.max(r3, r11)
            int r3 = java.lang.Math.max(r10, r3)
            int r1 = java.lang.Math.max(r1, r3)
            r3 = r14[r7]
            r7 = r14[r8]
            r10 = 1
            r10 = r14[r10]
            r11 = r14[r18]
            int r10 = java.lang.Math.max(r10, r11)
            int r7 = java.lang.Math.max(r7, r10)
            int r3 = java.lang.Math.max(r3, r7)
            int r3 = r3 + r1
            int r1 = java.lang.Math.max(r2, r3)
            r3 = r1
        L_0x085a:
            if (r24 != 0) goto L_0x0861
            r1 = 1073741824(0x40000000, float:2.0)
            if (r12 == r1) goto L_0x0861
            goto L_0x0862
        L_0x0861:
            r0 = r3
        L_0x0862:
            int r1 = r37.getPaddingTop()
            int r2 = r37.getPaddingBottom()
            int r2 = r2 + r1
            int r2 = r2 + r0
            int r0 = r37.getSuggestedMinimumHeight()
            int r0 = java.lang.Math.max(r2, r0)
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 & r15
            r1 = r1 | r4
            int r2 = r15 << 16
            int r0 = android.view.View.resolveSizeAndState(r0, r5, r2)
            r6.setMeasuredDimension(r1, r0)
            if (r22 == 0) goto L_0x08c0
            int r0 = r37.getMeasuredHeight()
            r1 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
        L_0x088d:
            if (r8 >= r9) goto L_0x08c0
            android.view.View r1 = r6.getChildAt(r8)
            int r0 = r1.getVisibility()
            r10 = 8
            if (r0 == r10) goto L_0x08bc
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            r11 = r0
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r11 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r11
            int r0 = r11.height
            r12 = -1
            if (r0 != r12) goto L_0x08bd
            int r13 = r11.width
            int r0 = r1.getMeasuredWidth()
            r11.width = r0
            r3 = 0
            r5 = 0
            r0 = r37
            r2 = r38
            r4 = r7
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r11.width = r13
            goto L_0x08bd
        L_0x08bc:
            r12 = -1
        L_0x08bd:
            int r8 = r8 + 1
            goto L_0x088d
        L_0x08c0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z10) {
        this.f877a = z10;
    }

    public void setBaselineAlignedChildIndex(int i10) {
        if (i10 < 0 || i10 >= getChildCount()) {
            StringBuilder q10 = a.q("base aligned child index out of range (0, ");
            q10.append(getChildCount());
            q10.append(")");
            throw new IllegalArgumentException(q10.toString());
        }
        this.f878b = i10;
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable != this.f887r) {
            this.f887r = drawable;
            boolean z10 = false;
            if (drawable != null) {
                this.f888s = drawable.getIntrinsicWidth();
                this.f889t = drawable.getIntrinsicHeight();
            } else {
                this.f888s = 0;
                this.f889t = 0;
            }
            if (drawable == null) {
                z10 = true;
            }
            setWillNotDraw(z10);
            requestLayout();
        }
    }

    public void setDividerPadding(int i10) {
        this.f891v = i10;
    }

    public void setGravity(int i10) {
        if (this.f881e != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.f881e = i10;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i10) {
        int i11 = i10 & 8388615;
        int i12 = this.f881e;
        if ((8388615 & i12) != i11) {
            this.f881e = i11 | (-8388616 & i12);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z10) {
        this.f884o = z10;
    }

    public void setOrientation(int i10) {
        if (this.f880d != i10) {
            this.f880d = i10;
            requestLayout();
        }
    }

    public void setShowDividers(int i10) {
        if (i10 != this.f890u) {
            requestLayout();
        }
        this.f890u = i10;
    }

    public void setVerticalGravity(int i10) {
        int i11 = i10 & 112;
        int i12 = this.f881e;
        if ((i12 & 112) != i11) {
            this.f881e = i11 | (i12 & -113);
            requestLayout();
        }
    }

    public void setWeightSum(float f10) {
        this.f883n = Math.max(0.0f, f10);
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Drawable drawable;
        int resourceId;
        this.f877a = true;
        this.f878b = -1;
        this.f879c = 0;
        this.f881e = 8388659;
        int[] iArr = R$styleable.LinearLayoutCompat;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        d0.n(this, context, iArr, attributeSet, obtainStyledAttributes, i10);
        int i11 = obtainStyledAttributes.getInt(R$styleable.LinearLayoutCompat_android_orientation, -1);
        if (i11 >= 0) {
            setOrientation(i11);
        }
        int i12 = obtainStyledAttributes.getInt(R$styleable.LinearLayoutCompat_android_gravity, -1);
        if (i12 >= 0) {
            setGravity(i12);
        }
        boolean z10 = obtainStyledAttributes.getBoolean(R$styleable.LinearLayoutCompat_android_baselineAligned, true);
        if (!z10) {
            setBaselineAligned(z10);
        }
        this.f883n = obtainStyledAttributes.getFloat(R$styleable.LinearLayoutCompat_android_weightSum, -1.0f);
        this.f878b = obtainStyledAttributes.getInt(R$styleable.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.f884o = obtainStyledAttributes.getBoolean(R$styleable.LinearLayoutCompat_measureWithLargestChild, false);
        int i13 = R$styleable.LinearLayoutCompat_divider;
        if (!obtainStyledAttributes.hasValue(i13) || (resourceId = obtainStyledAttributes.getResourceId(i13, 0)) == 0) {
            drawable = obtainStyledAttributes.getDrawable(i13);
        } else {
            drawable = h.a.a(context, resourceId);
        }
        setDividerDrawable(drawable);
        this.f890u = obtainStyledAttributes.getInt(R$styleable.LinearLayoutCompat_showDividers, 0);
        this.f891v = obtainStyledAttributes.getDimensionPixelSize(R$styleable.LinearLayoutCompat_dividerPadding, 0);
        obtainStyledAttributes.recycle();
    }
}
