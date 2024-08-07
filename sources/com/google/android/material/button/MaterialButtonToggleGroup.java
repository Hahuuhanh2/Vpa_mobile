package com.google.android.material.button;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import com.google.android.material.R$attr;
import com.google.android.material.R$style;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import l8.m;
import w1.d0;
import w1.g;
import w1.q0;
import x1.f;

public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: r  reason: collision with root package name */
    public static final int f5896r = R$style.Widget_MaterialComponents_MaterialButtonToggleGroup;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f5897a;

    /* renamed from: b  reason: collision with root package name */
    public final e f5898b;

    /* renamed from: c  reason: collision with root package name */
    public final LinkedHashSet<d> f5899c;

    /* renamed from: d  reason: collision with root package name */
    public final a f5900d;

    /* renamed from: e  reason: collision with root package name */
    public Integer[] f5901e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f5902f;

    /* renamed from: n  reason: collision with root package name */
    public boolean f5903n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f5904o;

    /* renamed from: p  reason: collision with root package name */
    public final int f5905p;

    /* renamed from: q  reason: collision with root package name */
    public HashSet f5906q;

    public class a implements Comparator<MaterialButton> {
        public a() {
        }

        public final int compare(Object obj, Object obj2) {
            MaterialButton materialButton = (MaterialButton) obj;
            MaterialButton materialButton2 = (MaterialButton) obj2;
            int compareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
            if (compareTo != 0) {
                return compareTo;
            }
            int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
            if (compareTo2 != 0) {
                return compareTo2;
            }
            return Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton)).compareTo(Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton2)));
        }
    }

    public class b extends w1.a {
        public b() {
        }

        public final void d(View view, f fVar) {
            int i10;
            this.f16280a.onInitializeAccessibilityNodeInfo(view, fVar.f16862a);
            MaterialButtonToggleGroup materialButtonToggleGroup = MaterialButtonToggleGroup.this;
            int i11 = MaterialButtonToggleGroup.f5896r;
            materialButtonToggleGroup.getClass();
            if (view instanceof MaterialButton) {
                int i12 = 0;
                i10 = 0;
                while (true) {
                    if (i12 >= materialButtonToggleGroup.getChildCount()) {
                        break;
                    } else if (materialButtonToggleGroup.getChildAt(i12) == view) {
                        break;
                    } else {
                        if ((materialButtonToggleGroup.getChildAt(i12) instanceof MaterialButton) && materialButtonToggleGroup.d(i12)) {
                            i10++;
                        }
                        i12++;
                    }
                }
                fVar.j(f.g.a(0, 1, i10, 1, false, ((MaterialButton) view).isChecked()));
            }
            i10 = -1;
            fVar.j(f.g.a(0, 1, i10, 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    public static class c {

        /* renamed from: e  reason: collision with root package name */
        public static final l8.a f5909e = new l8.a(0.0f);

        /* renamed from: a  reason: collision with root package name */
        public l8.d f5910a;

        /* renamed from: b  reason: collision with root package name */
        public l8.d f5911b;

        /* renamed from: c  reason: collision with root package name */
        public l8.d f5912c;

        /* renamed from: d  reason: collision with root package name */
        public l8.d f5913d;

        public c(l8.d dVar, l8.d dVar2, l8.d dVar3, l8.d dVar4) {
            this.f5910a = dVar;
            this.f5911b = dVar3;
            this.f5912c = dVar4;
            this.f5913d = dVar2;
        }
    }

    public interface d {
        void a();
    }

    public class e implements MaterialButton.b {
        public e() {
        }
    }

    public MaterialButtonToggleGroup(Context context) {
        this(context, (AttributeSet) null);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (d(i10)) {
                return i10;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (d(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if ((getChildAt(i11) instanceof MaterialButton) && d(i11)) {
                i10++;
            }
        }
        return i10;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            materialButton.setId(d0.e.a());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f5898b);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public final void a() {
        LinearLayout.LayoutParams layoutParams;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex != -1) {
            for (int i10 = firstVisibleChildIndex + 1; i10 < getChildCount(); i10++) {
                MaterialButton c10 = c(i10);
                int min = Math.min(c10.getStrokeWidth(), c(i10 - 1).getStrokeWidth());
                ViewGroup.LayoutParams layoutParams2 = c10.getLayoutParams();
                if (layoutParams2 instanceof LinearLayout.LayoutParams) {
                    layoutParams = (LinearLayout.LayoutParams) layoutParams2;
                } else {
                    layoutParams = new LinearLayout.LayoutParams(layoutParams2.width, layoutParams2.height);
                }
                if (getOrientation() == 0) {
                    g.g(layoutParams, 0);
                    g.h(layoutParams, -min);
                    layoutParams.topMargin = 0;
                } else {
                    layoutParams.bottomMargin = 0;
                    layoutParams.topMargin = -min;
                    g.h(layoutParams, 0);
                }
                c10.setLayoutParams(layoutParams);
            }
            if (getChildCount() != 0 && firstVisibleChildIndex != -1) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) c(firstVisibleChildIndex).getLayoutParams();
                if (getOrientation() == 1) {
                    layoutParams3.topMargin = 0;
                    layoutParams3.bottomMargin = 0;
                    return;
                }
                g.g(layoutParams3, 0);
                g.h(layoutParams3, 0);
                layoutParams3.leftMargin = 0;
                layoutParams3.rightMargin = 0;
            }
        }
    }

    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof MaterialButton) {
            super.addView(view, i10, layoutParams);
            MaterialButton materialButton = (MaterialButton) view;
            setGeneratedIdIfNeeded(materialButton);
            setupButtonChild(materialButton);
            b(materialButton.getId(), materialButton.isChecked());
            m shapeAppearanceModel = materialButton.getShapeAppearanceModel();
            this.f5897a.add(new c(shapeAppearanceModel.f12829e, shapeAppearanceModel.f12832h, shapeAppearanceModel.f12830f, shapeAppearanceModel.f12831g));
            materialButton.setEnabled(isEnabled());
            d0.o(materialButton, new b());
        }
    }

    public final void b(int i10, boolean z10) {
        if (i10 != -1) {
            HashSet hashSet = new HashSet(this.f5906q);
            if (z10 && !hashSet.contains(Integer.valueOf(i10))) {
                if (this.f5903n && !hashSet.isEmpty()) {
                    hashSet.clear();
                }
                hashSet.add(Integer.valueOf(i10));
            } else if (!z10 && hashSet.contains(Integer.valueOf(i10))) {
                if (!this.f5904o || hashSet.size() > 1) {
                    hashSet.remove(Integer.valueOf(i10));
                }
            } else {
                return;
            }
            e(hashSet);
        }
    }

    public final MaterialButton c(int i10) {
        return (MaterialButton) getChildAt(i10);
    }

    public final boolean d(int i10) {
        if (getChildAt(i10).getVisibility() != 8) {
            return true;
        }
        return false;
    }

    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f5900d);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            treeMap.put(c(i10), Integer.valueOf(i10));
        }
        this.f5901e = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public final void e(Set<Integer> set) {
        HashSet hashSet = this.f5906q;
        this.f5906q = new HashSet(set);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            int id2 = c(i10).getId();
            boolean contains = set.contains(Integer.valueOf(id2));
            View findViewById = findViewById(id2);
            if (findViewById instanceof MaterialButton) {
                this.f5902f = true;
                ((MaterialButton) findViewById).setChecked(contains);
                this.f5902f = false;
            }
            if (hashSet.contains(Integer.valueOf(id2)) != set.contains(Integer.valueOf(id2))) {
                set.contains(Integer.valueOf(id2));
                Iterator<d> it = this.f5899c.iterator();
                while (it.hasNext()) {
                    it.next().a();
                }
            }
        }
        invalidate();
    }

    public final void f() {
        boolean z10;
        c cVar;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i10 = 0; i10 < childCount; i10++) {
            MaterialButton c10 = c(i10);
            if (c10.getVisibility() != 8) {
                m shapeAppearanceModel = c10.getShapeAppearanceModel();
                shapeAppearanceModel.getClass();
                m.a aVar = new m.a(shapeAppearanceModel);
                c cVar2 = (c) this.f5897a.get(i10);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    if (getOrientation() == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (i10 == firstVisibleChildIndex) {
                        if (!z10) {
                            l8.d dVar = cVar2.f5910a;
                            l8.a aVar2 = c.f5909e;
                            cVar = new c(dVar, aVar2, cVar2.f5911b, aVar2);
                        } else if (x.g(this)) {
                            l8.a aVar3 = c.f5909e;
                            cVar = new c(aVar3, aVar3, cVar2.f5911b, cVar2.f5912c);
                        } else {
                            l8.d dVar2 = cVar2.f5910a;
                            l8.d dVar3 = cVar2.f5913d;
                            l8.a aVar4 = c.f5909e;
                            cVar = new c(dVar2, dVar3, aVar4, aVar4);
                        }
                    } else if (i10 != lastVisibleChildIndex) {
                        cVar2 = null;
                    } else if (!z10) {
                        l8.a aVar5 = c.f5909e;
                        cVar = new c(aVar5, cVar2.f5913d, aVar5, cVar2.f5912c);
                    } else if (x.g(this)) {
                        l8.d dVar4 = cVar2.f5910a;
                        l8.d dVar5 = cVar2.f5913d;
                        l8.a aVar6 = c.f5909e;
                        cVar = new c(dVar4, dVar5, aVar6, aVar6);
                    } else {
                        l8.a aVar7 = c.f5909e;
                        cVar = new c(aVar7, aVar7, cVar2.f5911b, cVar2.f5912c);
                    }
                    cVar2 = cVar;
                }
                if (cVar2 == null) {
                    aVar.b(0.0f);
                } else {
                    aVar.f12841e = cVar2.f5910a;
                    aVar.f12844h = cVar2.f5913d;
                    aVar.f12842f = cVar2.f5911b;
                    aVar.f12843g = cVar2.f5912c;
                }
                c10.setShapeAppearanceModel(new m(aVar));
            }
        }
    }

    public int getCheckedButtonId() {
        if (!this.f5903n || this.f5906q.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f5906q.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            int id2 = c(i10).getId();
            if (this.f5906q.contains(Integer.valueOf(id2))) {
                arrayList.add(Integer.valueOf(id2));
            }
        }
        return arrayList;
    }

    public final int getChildDrawingOrder(int i10, int i11) {
        Integer[] numArr = this.f5901e;
        if (numArr == null || i11 >= numArr.length) {
            return i11;
        }
        return numArr[i11].intValue();
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        int i10 = this.f5905p;
        if (i10 != -1) {
            e(Collections.singleton(Integer.valueOf(i10)));
        }
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        int visibleButtonCount = getVisibleButtonCount();
        if (this.f5903n) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) f.C0220f.a(1, visibleButtonCount, i10).f16880a);
    }

    public final void onMeasure(int i10, int i11) {
        f();
        a();
        super.onMeasure(i10, i11);
    }

    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal((MaterialButton.b) null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f5897a.remove(indexOfChild);
        }
        f();
        a();
    }

    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            c(i10).setEnabled(z10);
        }
    }

    public void setSelectionRequired(boolean z10) {
        this.f5904o = z10;
    }

    public void setSingleSelection(boolean z10) {
        if (this.f5903n != z10) {
            this.f5903n = z10;
            e(new HashSet());
        }
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            c(i10).setA11yClassName((this.f5903n ? RadioButton.class : ToggleButton.class).getName());
        }
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.materialButtonToggleGroupStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialButtonToggleGroup(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = f5896r
            android.content.Context r7 = p8.a.a(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r6.f5897a = r7
            com.google.android.material.button.MaterialButtonToggleGroup$e r7 = new com.google.android.material.button.MaterialButtonToggleGroup$e
            r7.<init>()
            r6.f5898b = r7
            java.util.LinkedHashSet r7 = new java.util.LinkedHashSet
            r7.<init>()
            r6.f5899c = r7
            com.google.android.material.button.MaterialButtonToggleGroup$a r7 = new com.google.android.material.button.MaterialButtonToggleGroup$a
            r7.<init>()
            r6.f5900d = r7
            r7 = 0
            r6.f5902f = r7
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r6.f5906q = r0
            android.content.Context r0 = r6.getContext()
            int[] r2 = com.google.android.material.R$styleable.MaterialButtonToggleGroup
            int[] r5 = new int[r7]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = com.google.android.material.internal.u.d(r0, r1, r2, r3, r4, r5)
            int r9 = com.google.android.material.R$styleable.MaterialButtonToggleGroup_singleSelection
            boolean r9 = r8.getBoolean(r9, r7)
            r6.setSingleSelection((boolean) r9)
            int r9 = com.google.android.material.R$styleable.MaterialButtonToggleGroup_checkedButton
            r0 = -1
            int r9 = r8.getResourceId(r9, r0)
            r6.f5905p = r9
            int r9 = com.google.android.material.R$styleable.MaterialButtonToggleGroup_selectionRequired
            boolean r7 = r8.getBoolean(r9, r7)
            r6.f5904o = r7
            r7 = 1
            r6.setChildrenDrawingOrderEnabled(r7)
            int r9 = com.google.android.material.R$styleable.MaterialButtonToggleGroup_android_enabled
            boolean r9 = r8.getBoolean(r9, r7)
            r6.setEnabled(r9)
            r8.recycle()
            java.util.WeakHashMap<android.view.View, w1.q0> r8 = w1.d0.f16298a
            w1.d0.d.s(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButtonToggleGroup.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setSingleSelection(int i10) {
        setSingleSelection(getResources().getBoolean(i10));
    }
}
