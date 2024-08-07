package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.m;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.u;
import com.google.android.material.R$dimen;
import com.google.android.material.R$layout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import w1.d0;
import w1.q0;

/* compiled from: NavigationMenuPresenter */
public final class j implements androidx.appcompat.view.menu.j {
    public int A;
    public int B;
    public int C;
    public boolean D;
    public boolean E = true;
    public int F;
    public int G;
    public int H;
    public int I = -1;
    public final a J = new a();

    /* renamed from: a  reason: collision with root package name */
    public NavigationMenuView f6444a;

    /* renamed from: b  reason: collision with root package name */
    public LinearLayout f6445b;

    /* renamed from: c  reason: collision with root package name */
    public androidx.appcompat.view.menu.f f6446c;

    /* renamed from: d  reason: collision with root package name */
    public int f6447d;

    /* renamed from: e  reason: collision with root package name */
    public c f6448e;

    /* renamed from: f  reason: collision with root package name */
    public LayoutInflater f6449f;

    /* renamed from: n  reason: collision with root package name */
    public int f6450n = 0;

    /* renamed from: o  reason: collision with root package name */
    public ColorStateList f6451o;

    /* renamed from: p  reason: collision with root package name */
    public int f6452p = 0;

    /* renamed from: q  reason: collision with root package name */
    public boolean f6453q = true;

    /* renamed from: r  reason: collision with root package name */
    public ColorStateList f6454r;

    /* renamed from: s  reason: collision with root package name */
    public ColorStateList f6455s;

    /* renamed from: t  reason: collision with root package name */
    public Drawable f6456t;

    /* renamed from: u  reason: collision with root package name */
    public RippleDrawable f6457u;

    /* renamed from: v  reason: collision with root package name */
    public int f6458v;

    /* renamed from: w  reason: collision with root package name */
    public int f6459w;

    /* renamed from: x  reason: collision with root package name */
    public int f6460x;

    /* renamed from: y  reason: collision with root package name */
    public int f6461y;

    /* renamed from: z  reason: collision with root package name */
    public int f6462z;

    /* compiled from: NavigationMenuPresenter */
    public class a implements View.OnClickListener {
        public a() {
        }

        public final void onClick(View view) {
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) view;
            c cVar = j.this.f6448e;
            boolean z10 = true;
            if (cVar != null) {
                cVar.f6466f = true;
            }
            androidx.appcompat.view.menu.h itemData = navigationMenuItemView.getItemData();
            j jVar = j.this;
            boolean q10 = jVar.f6446c.q(itemData, jVar, 0);
            if (itemData == null || !itemData.isCheckable() || !q10) {
                z10 = false;
            } else {
                j.this.f6448e.u(itemData);
            }
            j jVar2 = j.this;
            c cVar2 = jVar2.f6448e;
            if (cVar2 != null) {
                cVar2.f6466f = false;
            }
            if (z10) {
                jVar2.d(false);
            }
        }
    }

    /* compiled from: NavigationMenuPresenter */
    public static class b extends l {
        public b(LinearLayout linearLayout) {
            super(linearLayout);
        }
    }

    /* compiled from: NavigationMenuPresenter */
    public class c extends RecyclerView.e<l> {

        /* renamed from: d  reason: collision with root package name */
        public final ArrayList<e> f6464d = new ArrayList<>();

        /* renamed from: e  reason: collision with root package name */
        public androidx.appcompat.view.menu.h f6465e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f6466f;

        public c() {
            t();
        }

        public final int c() {
            return this.f6464d.size();
        }

        public final long d(int i10) {
            return (long) i10;
        }

        public final int e(int i10) {
            e eVar = this.f6464d.get(i10);
            if (eVar instanceof f) {
                return 2;
            }
            if (eVar instanceof d) {
                return 3;
            }
            if (!(eVar instanceof g)) {
                throw new RuntimeException("Unknown item type.");
            } else if (((g) eVar).f6470a.hasSubMenu()) {
                return 1;
            } else {
                return 0;
            }
        }

        public final void i(RecyclerView.a0 a0Var, int i10) {
            Drawable drawable;
            l lVar = (l) a0Var;
            int e10 = e(i10);
            if (e10 == 0) {
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) lVar.f3013a;
                navigationMenuItemView.setIconTintList(j.this.f6455s);
                navigationMenuItemView.setTextAppearance(j.this.f6452p);
                ColorStateList colorStateList = j.this.f6454r;
                if (colorStateList != null) {
                    navigationMenuItemView.setTextColor(colorStateList);
                }
                Drawable drawable2 = j.this.f6456t;
                if (drawable2 != null) {
                    drawable = drawable2.getConstantState().newDrawable();
                } else {
                    drawable = null;
                }
                WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                d0.d.q(navigationMenuItemView, drawable);
                RippleDrawable rippleDrawable = j.this.f6457u;
                if (rippleDrawable != null) {
                    navigationMenuItemView.setForeground(rippleDrawable.getConstantState().newDrawable());
                }
                g gVar = (g) this.f6464d.get(i10);
                navigationMenuItemView.setNeedsEmptyIcon(gVar.f6471b);
                j jVar = j.this;
                int i11 = jVar.f6458v;
                int i12 = jVar.f6459w;
                navigationMenuItemView.setPadding(i11, i12, i11, i12);
                navigationMenuItemView.setIconPadding(j.this.f6460x);
                j jVar2 = j.this;
                if (jVar2.D) {
                    navigationMenuItemView.setIconSize(jVar2.f6461y);
                }
                navigationMenuItemView.setMaxLines(j.this.F);
                androidx.appcompat.view.menu.h hVar = gVar.f6470a;
                navigationMenuItemView.F = j.this.f6453q;
                navigationMenuItemView.c(hVar);
                d0.o(navigationMenuItemView, new k(this, i10, false));
            } else if (e10 == 1) {
                TextView textView = (TextView) lVar.f3013a;
                textView.setText(((g) this.f6464d.get(i10)).f6470a.f646e);
                textView.setTextAppearance(j.this.f6450n);
                textView.setPadding(j.this.B, textView.getPaddingTop(), j.this.C, textView.getPaddingBottom());
                ColorStateList colorStateList2 = j.this.f6451o;
                if (colorStateList2 != null) {
                    textView.setTextColor(colorStateList2);
                }
                d0.o(textView, new k(this, i10, true));
            } else if (e10 == 2) {
                f fVar = (f) this.f6464d.get(i10);
                View view = lVar.f3013a;
                j jVar3 = j.this;
                view.setPadding(jVar3.f6462z, fVar.f6468a, jVar3.A, fVar.f6469b);
            }
        }

        public final RecyclerView.a0 k(RecyclerView recyclerView, int i10) {
            RecyclerView.a0 a0Var;
            if (i10 == 0) {
                j jVar = j.this;
                a0Var = new i(jVar.f6449f, recyclerView, jVar.J);
            } else if (i10 == 1) {
                a0Var = new k(j.this.f6449f, recyclerView);
            } else if (i10 == 2) {
                a0Var = new C0066j(j.this.f6449f, recyclerView);
            } else if (i10 != 3) {
                return null;
            } else {
                return new b(j.this.f6445b);
            }
            return a0Var;
        }

        public final void p(RecyclerView.a0 a0Var) {
            l lVar = (l) a0Var;
            if (lVar instanceof i) {
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) lVar.f3013a;
                FrameLayout frameLayout = navigationMenuItemView.H;
                if (frameLayout != null) {
                    frameLayout.removeAllViews();
                }
                navigationMenuItemView.G.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            }
        }

        public final void t() {
            if (!this.f6466f) {
                this.f6466f = true;
                this.f6464d.clear();
                this.f6464d.add(new d());
                int i10 = -1;
                int size = j.this.f6446c.l().size();
                boolean z10 = false;
                int i11 = 0;
                boolean z11 = false;
                int i12 = 0;
                while (i11 < size) {
                    androidx.appcompat.view.menu.h hVar = j.this.f6446c.l().get(i11);
                    if (hVar.isChecked()) {
                        u(hVar);
                    }
                    if (hVar.isCheckable()) {
                        hVar.f(z10);
                    }
                    if (hVar.hasSubMenu()) {
                        m mVar = hVar.f656o;
                        if (mVar.hasVisibleItems()) {
                            if (i11 != 0) {
                                this.f6464d.add(new f(j.this.H, z10 ? 1 : 0));
                            }
                            this.f6464d.add(new g(hVar));
                            int size2 = mVar.size();
                            int i13 = z10;
                            int i14 = i13;
                            while (i13 < size2) {
                                androidx.appcompat.view.menu.h hVar2 = (androidx.appcompat.view.menu.h) mVar.getItem(i13);
                                if (hVar2.isVisible()) {
                                    if (i14 == 0 && hVar2.getIcon() != null) {
                                        i14 = 1;
                                    }
                                    if (hVar2.isCheckable()) {
                                        hVar2.f(z10);
                                    }
                                    if (hVar.isChecked()) {
                                        u(hVar);
                                    }
                                    this.f6464d.add(new g(hVar2));
                                }
                                i13++;
                                z10 = false;
                            }
                            if (i14 != 0) {
                                int size3 = this.f6464d.size();
                                for (int size4 = this.f6464d.size(); size4 < size3; size4++) {
                                    ((g) this.f6464d.get(size4)).f6471b = true;
                                }
                            }
                        }
                    } else {
                        int i15 = hVar.f643b;
                        if (i15 != i10) {
                            i12 = this.f6464d.size();
                            if (hVar.getIcon() != null) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (i11 != 0) {
                                i12++;
                                ArrayList<e> arrayList = this.f6464d;
                                int i16 = j.this.H;
                                arrayList.add(new f(i16, i16));
                            }
                        } else if (!z11 && hVar.getIcon() != null) {
                            int size5 = this.f6464d.size();
                            for (int i17 = i12; i17 < size5; i17++) {
                                ((g) this.f6464d.get(i17)).f6471b = true;
                            }
                            z11 = true;
                        }
                        g gVar = new g(hVar);
                        gVar.f6471b = z11;
                        this.f6464d.add(gVar);
                        i10 = i15;
                    }
                    i11++;
                    z10 = false;
                }
                this.f6466f = z10;
            }
        }

        public final void u(androidx.appcompat.view.menu.h hVar) {
            if (this.f6465e != hVar && hVar.isCheckable()) {
                androidx.appcompat.view.menu.h hVar2 = this.f6465e;
                if (hVar2 != null) {
                    hVar2.setChecked(false);
                }
                this.f6465e = hVar;
                hVar.setChecked(true);
            }
        }
    }

    /* compiled from: NavigationMenuPresenter */
    public static class d implements e {
    }

    /* compiled from: NavigationMenuPresenter */
    public interface e {
    }

    /* compiled from: NavigationMenuPresenter */
    public static class f implements e {

        /* renamed from: a  reason: collision with root package name */
        public final int f6468a;

        /* renamed from: b  reason: collision with root package name */
        public final int f6469b;

        public f(int i10, int i11) {
            this.f6468a = i10;
            this.f6469b = i11;
        }
    }

    /* compiled from: NavigationMenuPresenter */
    public static class g implements e {

        /* renamed from: a  reason: collision with root package name */
        public final androidx.appcompat.view.menu.h f6470a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f6471b;

        public g(androidx.appcompat.view.menu.h hVar) {
            this.f6470a = hVar;
        }
    }

    /* compiled from: NavigationMenuPresenter */
    public class h extends u {
        public h(NavigationMenuView navigationMenuView) {
            super(navigationMenuView);
        }

        public final void d(View view, x1.f fVar) {
            super.d(view, fVar);
            c cVar = j.this.f6448e;
            int i10 = 0;
            for (int i11 = 0; i11 < j.this.f6448e.c(); i11++) {
                int e10 = j.this.f6448e.e(i11);
                if (e10 == 0 || e10 == 1) {
                    i10++;
                }
            }
            fVar.f16862a.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(i10, 1, false));
        }
    }

    /* compiled from: NavigationMenuPresenter */
    public static class i extends l {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public i(android.view.LayoutInflater r3, androidx.recyclerview.widget.RecyclerView r4, com.google.android.material.internal.j.a r5) {
            /*
                r2 = this;
                int r0 = com.google.android.material.R$layout.design_navigation_item
                r1 = 0
                android.view.View r3 = r3.inflate(r0, r4, r1)
                r2.<init>(r3)
                r3.setOnClickListener(r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.j.i.<init>(android.view.LayoutInflater, androidx.recyclerview.widget.RecyclerView, com.google.android.material.internal.j$a):void");
        }
    }

    /* renamed from: com.google.android.material.internal.j$j  reason: collision with other inner class name */
    /* compiled from: NavigationMenuPresenter */
    public static class C0066j extends l {
        public C0066j(LayoutInflater layoutInflater, RecyclerView recyclerView) {
            super(layoutInflater.inflate(R$layout.design_navigation_item_separator, recyclerView, false));
        }
    }

    /* compiled from: NavigationMenuPresenter */
    public static class k extends l {
        public k(LayoutInflater layoutInflater, RecyclerView recyclerView) {
            super(layoutInflater.inflate(R$layout.design_navigation_item_subheader, recyclerView, false));
        }
    }

    /* compiled from: NavigationMenuPresenter */
    public static abstract class l extends RecyclerView.a0 {
        public l(View view) {
            super(view);
        }
    }

    public final void a() {
        boolean z10;
        int i10;
        if (this.f6445b.getChildCount() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 || !this.E) {
            i10 = 0;
        } else {
            i10 = this.G;
        }
        NavigationMenuView navigationMenuView = this.f6444a;
        navigationMenuView.setPadding(0, i10, 0, navigationMenuView.getPaddingBottom());
    }

    public final void c(androidx.appcompat.view.menu.f fVar, boolean z10) {
    }

    public final void d(boolean z10) {
        c cVar = this.f6448e;
        if (cVar != null) {
            cVar.t();
            cVar.f();
        }
    }

    public final boolean e() {
        return false;
    }

    public final boolean g(androidx.appcompat.view.menu.h hVar) {
        return false;
    }

    public final int getId() {
        return this.f6447d;
    }

    public final void h(Context context, androidx.appcompat.view.menu.f fVar) {
        this.f6449f = LayoutInflater.from(context);
        this.f6446c = fVar;
        this.H = context.getResources().getDimensionPixelOffset(R$dimen.design_navigation_separator_vertical_padding);
    }

    public final void i(Parcelable parcelable) {
        androidx.appcompat.view.menu.h hVar;
        View actionView;
        ParcelableSparseArray parcelableSparseArray;
        androidx.appcompat.view.menu.h hVar2;
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.f6444a.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                c cVar = this.f6448e;
                cVar.getClass();
                int i10 = bundle2.getInt("android:menu:checked", 0);
                if (i10 != 0) {
                    cVar.f6466f = true;
                    int size = cVar.f6464d.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= size) {
                            break;
                        }
                        e eVar = cVar.f6464d.get(i11);
                        if ((eVar instanceof g) && (hVar2 = ((g) eVar).f6470a) != null && hVar2.f642a == i10) {
                            cVar.u(hVar2);
                            break;
                        }
                        i11++;
                    }
                    cVar.f6466f = false;
                    cVar.t();
                }
                SparseArray sparseParcelableArray2 = bundle2.getSparseParcelableArray("android:menu:action_views");
                if (sparseParcelableArray2 != null) {
                    int size2 = cVar.f6464d.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        e eVar2 = cVar.f6464d.get(i12);
                        if (!(!(eVar2 instanceof g) || (hVar = ((g) eVar2).f6470a) == null || (actionView = hVar.getActionView()) == null || (parcelableSparseArray = (ParcelableSparseArray) sparseParcelableArray2.get(hVar.f642a)) == null)) {
                            actionView.restoreHierarchyState(parcelableSparseArray);
                        }
                    }
                }
            }
            SparseArray sparseParcelableArray3 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray3 != null) {
                this.f6445b.restoreHierarchyState(sparseParcelableArray3);
            }
        }
    }

    public final boolean k(m mVar) {
        return false;
    }

    public final Parcelable l() {
        View view;
        Bundle bundle = new Bundle();
        if (this.f6444a != null) {
            SparseArray sparseArray = new SparseArray();
            this.f6444a.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        c cVar = this.f6448e;
        if (cVar != null) {
            cVar.getClass();
            Bundle bundle2 = new Bundle();
            androidx.appcompat.view.menu.h hVar = cVar.f6465e;
            if (hVar != null) {
                bundle2.putInt("android:menu:checked", hVar.f642a);
            }
            SparseArray sparseArray2 = new SparseArray();
            int size = cVar.f6464d.size();
            for (int i10 = 0; i10 < size; i10++) {
                e eVar = cVar.f6464d.get(i10);
                if (eVar instanceof g) {
                    androidx.appcompat.view.menu.h hVar2 = ((g) eVar).f6470a;
                    if (hVar2 != null) {
                        view = hVar2.getActionView();
                    } else {
                        view = null;
                    }
                    if (view != null) {
                        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
                        view.saveHierarchyState(parcelableSparseArray);
                        sparseArray2.put(hVar2.f642a, parcelableSparseArray);
                    }
                }
            }
            bundle2.putSparseParcelableArray("android:menu:action_views", sparseArray2);
            bundle.putBundle("android:menu:adapter", bundle2);
        }
        if (this.f6445b != null) {
            SparseArray sparseArray3 = new SparseArray();
            this.f6445b.saveHierarchyState(sparseArray3);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray3);
        }
        return bundle;
    }

    public final boolean m(androidx.appcompat.view.menu.h hVar) {
        return false;
    }
}
