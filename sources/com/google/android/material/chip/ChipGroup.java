package com.google.android.material.chip;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.R$attr;
import com.google.android.material.R$style;
import com.google.android.material.internal.FlowLayout;
import com.google.android.material.internal.b;
import com.google.android.material.internal.g;
import java.util.List;
import java.util.WeakHashMap;
import w1.d0;
import w1.q0;
import x1.f;

public class ChipGroup extends FlowLayout {

    /* renamed from: r  reason: collision with root package name */
    public static final int f6021r = R$style.Widget_MaterialComponents_ChipGroup;

    /* renamed from: e  reason: collision with root package name */
    public int f6022e;

    /* renamed from: f  reason: collision with root package name */
    public int f6023f;

    /* renamed from: n  reason: collision with root package name */
    public d f6024n;

    /* renamed from: o  reason: collision with root package name */
    public final com.google.android.material.internal.b<Chip> f6025o;

    /* renamed from: p  reason: collision with root package name */
    public final int f6026p;

    /* renamed from: q  reason: collision with root package name */
    public final e f6027q;

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams() {
            super(-2, -2);
        }
    }

    public class a implements b.a {
        public a() {
        }
    }

    public class b implements d {
        public b(c cVar) {
        }
    }

    @Deprecated
    public interface c {
        void a();
    }

    public interface d {
    }

    public class e implements ViewGroup.OnHierarchyChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public ViewGroup.OnHierarchyChangeListener f6030a;

        public e() {
        }

        public final void onChildViewAdded(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                    view2.setId(d0.e.a());
                }
                com.google.android.material.internal.b<Chip> bVar = ChipGroup.this.f6025o;
                Chip chip = (Chip) view2;
                bVar.f6383a.put(Integer.valueOf(chip.getId()), chip);
                if (chip.isChecked()) {
                    bVar.a(chip);
                }
                chip.setInternalOnCheckedChangeListener(new com.google.android.material.internal.a(bVar));
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f6030a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public final void onChildViewRemoved(View view, View view2) {
            ChipGroup chipGroup = ChipGroup.this;
            if (view == chipGroup && (view2 instanceof Chip)) {
                com.google.android.material.internal.b<Chip> bVar = chipGroup.f6025o;
                Chip chip = (Chip) view2;
                bVar.getClass();
                chip.setInternalOnCheckedChangeListener((g.a) null);
                bVar.f6383a.remove(Integer.valueOf(chip.getId()));
                bVar.f6384b.remove(Integer.valueOf(chip.getId()));
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f6030a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public ChipGroup(Context context) {
        this(context, (AttributeSet) null);
    }

    private int getVisibleChipCount() {
        boolean z10;
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11) instanceof Chip) {
                if (getChildAt(i11).getVisibility() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    i10++;
                }
            }
        }
        return i10;
    }

    public final boolean a() {
        return this.f6365c;
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!super.checkLayoutParams(layoutParams) || !(layoutParams instanceof LayoutParams)) {
            return false;
        }
        return true;
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        return this.f6025o.c();
    }

    public List<Integer> getCheckedChipIds() {
        return this.f6025o.b(this);
    }

    public int getChipSpacingHorizontal() {
        return this.f6022e;
    }

    public int getChipSpacingVertical() {
        return this.f6023f;
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        int i10 = this.f6026p;
        if (i10 != -1) {
            com.google.android.material.internal.b<Chip> bVar = this.f6025o;
            g gVar = (g) bVar.f6383a.get(Integer.valueOf(i10));
            if (gVar != null && bVar.a(gVar)) {
                bVar.d();
            }
        }
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i10;
        int i11;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f6365c) {
            i10 = getVisibleChipCount();
        } else {
            i10 = -1;
        }
        int rowCount = getRowCount();
        if (this.f6025o.f6386d) {
            i11 = 1;
        } else {
            i11 = 2;
        }
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) f.C0220f.a(rowCount, i10, i11).f16880a);
    }

    public void setChipSpacing(int i10) {
        setChipSpacingHorizontal(i10);
        setChipSpacingVertical(i10);
    }

    public void setChipSpacingHorizontal(int i10) {
        if (this.f6022e != i10) {
            this.f6022e = i10;
            setItemSpacing(i10);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i10) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i10));
    }

    public void setChipSpacingResource(int i10) {
        setChipSpacing(getResources().getDimensionPixelOffset(i10));
    }

    public void setChipSpacingVertical(int i10) {
        if (this.f6023f != i10) {
            this.f6023f = i10;
            setLineSpacing(i10);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i10) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i10));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i10) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(c cVar) {
        if (cVar == null) {
            setOnCheckedStateChangeListener((d) null);
        } else {
            setOnCheckedStateChangeListener(new b(cVar));
        }
    }

    public void setOnCheckedStateChangeListener(d dVar) {
        this.f6024n = dVar;
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f6027q.f6030a = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z10) {
        this.f6025o.f6387e = z10;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i10) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i10) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(boolean z10) {
        super.setSingleLine(z10);
    }

    public void setSingleSelection(boolean z10) {
        com.google.android.material.internal.b<Chip> bVar = this.f6025o;
        if (bVar.f6386d != z10) {
            bVar.f6386d = z10;
            boolean z11 = !bVar.f6384b.isEmpty();
            for (g e10 : bVar.f6383a.values()) {
                bVar.e(e10, false);
            }
            if (z11) {
                bVar.d();
            }
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.chipGroupStyle);
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public void setSingleLine(int i10) {
        setSingleLine(getResources().getBoolean(i10));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ChipGroup(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            int r4 = f6021r
            android.content.Context r9 = p8.a.a(r9, r10, r11, r4)
            r8.<init>(r9, r10, r11)
            com.google.android.material.internal.b r9 = new com.google.android.material.internal.b
            r9.<init>()
            r8.f6025o = r9
            com.google.android.material.chip.ChipGroup$e r6 = new com.google.android.material.chip.ChipGroup$e
            r6.<init>()
            r8.f6027q = r6
            android.content.Context r0 = r8.getContext()
            int[] r2 = com.google.android.material.R$styleable.ChipGroup
            r7 = 0
            int[] r5 = new int[r7]
            r1 = r10
            r3 = r11
            android.content.res.TypedArray r10 = com.google.android.material.internal.u.d(r0, r1, r2, r3, r4, r5)
            int r11 = com.google.android.material.R$styleable.ChipGroup_chipSpacing
            int r11 = r10.getDimensionPixelOffset(r11, r7)
            int r0 = com.google.android.material.R$styleable.ChipGroup_chipSpacingHorizontal
            int r0 = r10.getDimensionPixelOffset(r0, r11)
            r8.setChipSpacingHorizontal(r0)
            int r0 = com.google.android.material.R$styleable.ChipGroup_chipSpacingVertical
            int r11 = r10.getDimensionPixelOffset(r0, r11)
            r8.setChipSpacingVertical(r11)
            int r11 = com.google.android.material.R$styleable.ChipGroup_singleLine
            boolean r11 = r10.getBoolean(r11, r7)
            r8.setSingleLine((boolean) r11)
            int r11 = com.google.android.material.R$styleable.ChipGroup_singleSelection
            boolean r11 = r10.getBoolean(r11, r7)
            r8.setSingleSelection((boolean) r11)
            int r11 = com.google.android.material.R$styleable.ChipGroup_selectionRequired
            boolean r11 = r10.getBoolean(r11, r7)
            r8.setSelectionRequired(r11)
            int r11 = com.google.android.material.R$styleable.ChipGroup_checkedChip
            r0 = -1
            int r11 = r10.getResourceId(r11, r0)
            r8.f6026p = r11
            r10.recycle()
            com.google.android.material.chip.ChipGroup$a r10 = new com.google.android.material.chip.ChipGroup$a
            r10.<init>()
            r9.f6385c = r10
            super.setOnHierarchyChangeListener(r6)
            java.util.WeakHashMap<android.view.View, w1.q0> r9 = w1.d0.f16298a
            r9 = 1
            w1.d0.d.s(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.ChipGroup.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setSingleSelection(int i10) {
        setSingleSelection(getResources().getBoolean(i10));
    }
}
