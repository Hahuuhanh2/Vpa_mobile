package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$layout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;
import o1.a;
import w1.b;

public final class ActionMenuPresenter extends androidx.appcompat.view.menu.a implements b.a {
    public e A;
    public a B;
    public c C;
    public b D;
    public final f E = new f();
    public int F;

    /* renamed from: q  reason: collision with root package name */
    public d f747q;

    /* renamed from: r  reason: collision with root package name */
    public Drawable f748r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f749s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f750t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f751u;

    /* renamed from: v  reason: collision with root package name */
    public int f752v;

    /* renamed from: w  reason: collision with root package name */
    public int f753w;

    /* renamed from: x  reason: collision with root package name */
    public int f754x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f755y;

    /* renamed from: z  reason: collision with root package name */
    public final SparseBooleanArray f756z = new SparseBooleanArray();

    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public int f757a;

        public class a implements Parcelable.Creator<SavedState> {
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public final Object[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState() {
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f757a);
        }

        public SavedState(Parcel parcel) {
            this.f757a = parcel.readInt();
        }
    }

    public class a extends i {
        public a(Context context, m mVar, View view) {
            super(context, mVar, view, false, R$attr.actionOverflowMenuStyle);
            boolean z10;
            if ((mVar.A.f665x & 32) == 32) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                View view2 = ActionMenuPresenter.this.f747q;
                this.f674f = view2 == null ? (View) ActionMenuPresenter.this.f569o : view2;
            }
            f fVar = ActionMenuPresenter.this.E;
            this.f677i = fVar;
            m.d dVar = this.f678j;
            if (dVar != null) {
                dVar.f(fVar);
            }
        }

        public final void c() {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            actionMenuPresenter.B = null;
            actionMenuPresenter.F = 0;
            super.c();
        }
    }

    public class b extends ActionMenuItemView.b {
        public b() {
        }
    }

    public class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public e f760a;

        public c(e eVar) {
            this.f760a = eVar;
        }

        public final void run() {
            f.a aVar;
            androidx.appcompat.view.menu.f fVar = ActionMenuPresenter.this.f564c;
            if (!(fVar == null || (aVar = fVar.f619e) == null)) {
                aVar.b(fVar);
            }
            View view = (View) ActionMenuPresenter.this.f569o;
            if (!(view == null || view.getWindowToken() == null)) {
                e eVar = this.f760a;
                boolean z10 = true;
                if (!eVar.b()) {
                    if (eVar.f674f == null) {
                        z10 = false;
                    } else {
                        eVar.d(0, 0, false, false);
                    }
                }
                if (z10) {
                    ActionMenuPresenter.this.A = this.f760a;
                }
            }
            ActionMenuPresenter.this.C = null;
        }
    }

    public class d extends AppCompatImageView implements ActionMenuView.a {

        public class a extends a0 {
            public a(View view) {
                super(view);
            }

            public final m.f b() {
                e eVar = ActionMenuPresenter.this.A;
                if (eVar == null) {
                    return null;
                }
                return eVar.a();
            }

            public final boolean c() {
                ActionMenuPresenter.this.o();
                return true;
            }

            public final boolean d() {
                ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
                if (actionMenuPresenter.C != null) {
                    return false;
                }
                actionMenuPresenter.b();
                return true;
            }
        }

        public d(Context context) {
            super(context, (AttributeSet) null, R$attr.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            q0.a(this, getContentDescription());
            setOnTouchListener(new a(this));
        }

        public final boolean a() {
            return false;
        }

        public final boolean b() {
            return false;
        }

        public final boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            ActionMenuPresenter.this.o();
            return true;
        }

        public final boolean setFrame(int i10, int i11, int i12, int i13) {
            boolean frame = super.setFrame(i10, i11, i12, i13);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                a.b.f(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    public class e extends i {
        public e(Context context, androidx.appcompat.view.menu.f fVar, d dVar) {
            super(context, fVar, dVar, true, R$attr.actionOverflowMenuStyle);
            this.f675g = 8388613;
            f fVar2 = ActionMenuPresenter.this.E;
            this.f677i = fVar2;
            m.d dVar2 = this.f678j;
            if (dVar2 != null) {
                dVar2.f(fVar2);
            }
        }

        public final void c() {
            androidx.appcompat.view.menu.f fVar = ActionMenuPresenter.this.f564c;
            if (fVar != null) {
                fVar.c(true);
            }
            ActionMenuPresenter.this.A = null;
            super.c();
        }
    }

    public class f implements j.a {
        public f() {
        }

        public final void c(androidx.appcompat.view.menu.f fVar, boolean z10) {
            if (fVar instanceof m) {
                fVar.k().c(false);
            }
            j.a aVar = ActionMenuPresenter.this.f566e;
            if (aVar != null) {
                aVar.c(fVar, z10);
            }
        }

        public final boolean d(androidx.appcompat.view.menu.f fVar) {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            if (fVar == actionMenuPresenter.f564c) {
                return false;
            }
            actionMenuPresenter.F = ((m) fVar).A.f642a;
            j.a aVar = actionMenuPresenter.f566e;
            if (aVar != null) {
                return aVar.d(fVar);
            }
            return false;
        }
    }

    public ActionMenuPresenter(Context context) {
        super(context, R$layout.abc_action_menu_layout, R$layout.abc_action_menu_item_layout);
    }

    public final View a(h hVar, View view, ViewGroup viewGroup) {
        k.a aVar;
        View actionView = hVar.getActionView();
        int i10 = 0;
        if (actionView == null || hVar.e()) {
            if (view instanceof k.a) {
                aVar = (k.a) view;
            } else {
                aVar = (k.a) this.f565d.inflate(this.f568n, viewGroup, false);
            }
            aVar.c(hVar);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.f569o);
            if (this.D == null) {
                this.D = new b();
            }
            actionMenuItemView.setPopupCallback(this.D);
            actionView = (View) aVar;
        }
        if (hVar.C) {
            i10 = 8;
        }
        actionView.setVisibility(i10);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!((ActionMenuView) viewGroup).checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(ActionMenuView.j(layoutParams));
        }
        return actionView;
    }

    public final boolean b() {
        k kVar;
        c cVar = this.C;
        if (cVar == null || (kVar = this.f569o) == null) {
            e eVar = this.A;
            if (eVar == null) {
                return false;
            }
            if (eVar.b()) {
                eVar.f678j.dismiss();
            }
            return true;
        }
        ((View) kVar).removeCallbacks(cVar);
        this.C = null;
        return true;
    }

    public final void c(androidx.appcompat.view.menu.f fVar, boolean z10) {
        b();
        a aVar = this.B;
        if (aVar != null && aVar.b()) {
            aVar.f678j.dismiss();
        }
        j.a aVar2 = this.f566e;
        if (aVar2 != null) {
            aVar2.c(fVar, z10);
        }
    }

    public final void d(boolean z10) {
        k kVar;
        int i10;
        boolean z11;
        boolean z12;
        h hVar;
        ViewGroup viewGroup = (ViewGroup) this.f569o;
        boolean z13 = false;
        ArrayList<h> arrayList = null;
        if (viewGroup != null) {
            androidx.appcompat.view.menu.f fVar = this.f564c;
            if (fVar != null) {
                fVar.i();
                ArrayList<h> l10 = this.f564c.l();
                int size = l10.size();
                i10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    h hVar2 = l10.get(i11);
                    if ((hVar2.f665x & 32) == 32) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        View childAt = viewGroup.getChildAt(i10);
                        if (childAt instanceof k.a) {
                            hVar = ((k.a) childAt).getItemData();
                        } else {
                            hVar = null;
                        }
                        View a10 = a(hVar2, childAt, viewGroup);
                        if (hVar2 != hVar) {
                            a10.setPressed(false);
                            a10.jumpDrawablesToCurrentState();
                        }
                        if (a10 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) a10.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(a10);
                            }
                            ((ViewGroup) this.f569o).addView(a10, i10);
                        }
                        i10++;
                    }
                }
            } else {
                i10 = 0;
            }
            while (i10 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i10) == this.f747q) {
                    z11 = false;
                } else {
                    viewGroup.removeViewAt(i10);
                    z11 = true;
                }
                if (!z11) {
                    i10++;
                }
            }
        }
        ((View) this.f569o).requestLayout();
        androidx.appcompat.view.menu.f fVar2 = this.f564c;
        if (fVar2 != null) {
            fVar2.i();
            ArrayList<h> arrayList2 = fVar2.f623i;
            int size2 = arrayList2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                w1.b bVar = arrayList2.get(i12).A;
                if (bVar != null) {
                    bVar.f16283a = this;
                }
            }
        }
        androidx.appcompat.view.menu.f fVar3 = this.f564c;
        if (fVar3 != null) {
            fVar3.i();
            arrayList = fVar3.f624j;
        }
        if (this.f750t && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z13 = !arrayList.get(0).C;
            } else if (size3 > 0) {
                z13 = true;
            }
        }
        if (z13) {
            if (this.f747q == null) {
                this.f747q = new d(this.f562a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f747q.getParent();
            if (viewGroup3 != this.f569o) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f747q);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f569o;
                d dVar = this.f747q;
                actionMenuView.getClass();
                ActionMenuView.LayoutParams layoutParams = new ActionMenuView.LayoutParams();
                layoutParams.gravity = 16;
                layoutParams.f770a = true;
                actionMenuView.addView(dVar, layoutParams);
            }
        } else {
            d dVar2 = this.f747q;
            if (dVar2 != null && dVar2.getParent() == (kVar = this.f569o)) {
                ((ViewGroup) kVar).removeView(this.f747q);
            }
        }
        ((ActionMenuView) this.f569o).setOverflowReserved(this.f750t);
    }

    public final boolean e() {
        int i10;
        ArrayList<h> arrayList;
        int i11;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        ActionMenuPresenter actionMenuPresenter = this;
        androidx.appcompat.view.menu.f fVar = actionMenuPresenter.f564c;
        if (fVar != null) {
            arrayList = fVar.l();
            i10 = arrayList.size();
        } else {
            i10 = 0;
            arrayList = null;
        }
        int i12 = actionMenuPresenter.f754x;
        int i13 = actionMenuPresenter.f753w;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) actionMenuPresenter.f569o;
        int i14 = 0;
        boolean z18 = false;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            i11 = 2;
            z10 = true;
            if (i14 >= i10) {
                break;
            }
            h hVar = arrayList.get(i14);
            int i17 = hVar.f666y;
            if ((i17 & 2) == 2) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (z16) {
                i15++;
            } else {
                if ((i17 & 1) == 1) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (z17) {
                    i16++;
                } else {
                    z18 = true;
                }
            }
            if (actionMenuPresenter.f755y && hVar.C) {
                i12 = 0;
            }
            i14++;
        }
        if (actionMenuPresenter.f750t && (z18 || i16 + i15 > i12)) {
            i12--;
        }
        int i18 = i12 - i15;
        SparseBooleanArray sparseBooleanArray = actionMenuPresenter.f756z;
        sparseBooleanArray.clear();
        int i19 = 0;
        int i20 = 0;
        while (i19 < i10) {
            h hVar2 = arrayList.get(i19);
            int i21 = hVar2.f666y;
            if ((i21 & 2) == i11) {
                z11 = z10;
            } else {
                z11 = false;
            }
            if (z11) {
                View a10 = actionMenuPresenter.a(hVar2, (View) null, viewGroup);
                a10.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = a10.getMeasuredWidth();
                i13 -= measuredWidth;
                if (i20 == 0) {
                    i20 = measuredWidth;
                }
                int i22 = hVar2.f643b;
                if (i22 != 0) {
                    sparseBooleanArray.put(i22, z10);
                }
                hVar2.g(z10);
            } else {
                if ((i21 & true) == z10) {
                    z12 = z10;
                } else {
                    z12 = false;
                }
                if (z12) {
                    int i23 = hVar2.f643b;
                    boolean z19 = sparseBooleanArray.get(i23);
                    if ((i18 > 0 || z19) && i13 > 0) {
                        z13 = z10;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        View a11 = actionMenuPresenter.a(hVar2, (View) null, viewGroup);
                        a11.measure(makeMeasureSpec, makeMeasureSpec);
                        int measuredWidth2 = a11.getMeasuredWidth();
                        i13 -= measuredWidth2;
                        if (i20 == 0) {
                            i20 = measuredWidth2;
                        }
                        if (i13 + i20 > 0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z13 &= z15;
                    }
                    if (z13 && i23 != 0) {
                        sparseBooleanArray.put(i23, true);
                    } else if (z19) {
                        sparseBooleanArray.put(i23, false);
                        int i24 = 0;
                        while (i24 < i19) {
                            h hVar3 = arrayList.get(i24);
                            if (hVar3.f643b == i23) {
                                if ((hVar3.f665x & 32) == 32) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                if (z14) {
                                    i18++;
                                }
                                hVar3.g(false);
                            }
                            i24++;
                        }
                    }
                    if (z13) {
                        i18--;
                    }
                    hVar2.g(z13);
                } else {
                    hVar2.g(false);
                    i19++;
                    i11 = 2;
                    actionMenuPresenter = this;
                    z10 = true;
                }
            }
            i19++;
            i11 = 2;
            actionMenuPresenter = this;
            z10 = true;
        }
        return z10;
    }

    public final void h(Context context, androidx.appcompat.view.menu.f fVar) {
        this.f563b = context;
        LayoutInflater.from(context);
        this.f564c = fVar;
        Resources resources = context.getResources();
        if (!this.f751u) {
            this.f750t = true;
        }
        int i10 = 2;
        this.f752v = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i11 = configuration.screenWidthDp;
        int i12 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i11 > 600 || ((i11 > 960 && i12 > 720) || (i11 > 720 && i12 > 960))) {
            i10 = 5;
        } else if (i11 >= 500 || ((i11 > 640 && i12 > 480) || (i11 > 480 && i12 > 640))) {
            i10 = 4;
        } else if (i11 >= 360) {
            i10 = 3;
        }
        this.f754x = i10;
        int i13 = this.f752v;
        if (this.f750t) {
            if (this.f747q == null) {
                d dVar = new d(this.f562a);
                this.f747q = dVar;
                if (this.f749s) {
                    dVar.setImageDrawable(this.f748r);
                    this.f748r = null;
                    this.f749s = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f747q.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i13 -= this.f747q.getMeasuredWidth();
        } else {
            this.f747q = null;
        }
        this.f753w = i13;
        float f10 = resources.getDisplayMetrics().density;
    }

    public final void i(Parcelable parcelable) {
        int i10;
        MenuItem findItem;
        if ((parcelable instanceof SavedState) && (i10 = ((SavedState) parcelable).f757a) > 0 && (findItem = this.f564c.findItem(i10)) != null) {
            k((m) findItem.getSubMenu());
        }
    }

    public final boolean j() {
        e eVar = this.A;
        if (eVar == null || !eVar.b()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0090  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean k(androidx.appcompat.view.menu.m r9) {
        /*
            r8 = this;
            boolean r0 = r9.hasVisibleItems()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            r0 = r9
        L_0x0009:
            androidx.appcompat.view.menu.f r2 = r0.f702z
            androidx.appcompat.view.menu.f r3 = r8.f564c
            if (r2 == r3) goto L_0x0013
            r0 = r2
            androidx.appcompat.view.menu.m r0 = (androidx.appcompat.view.menu.m) r0
            goto L_0x0009
        L_0x0013:
            androidx.appcompat.view.menu.h r0 = r0.A
            androidx.appcompat.view.menu.k r2 = r8.f569o
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r3 = 0
            if (r2 != 0) goto L_0x001d
            goto L_0x003a
        L_0x001d:
            int r4 = r2.getChildCount()
            r5 = r1
        L_0x0022:
            if (r5 >= r4) goto L_0x003a
            android.view.View r6 = r2.getChildAt(r5)
            boolean r7 = r6 instanceof androidx.appcompat.view.menu.k.a
            if (r7 == 0) goto L_0x0037
            r7 = r6
            androidx.appcompat.view.menu.k$a r7 = (androidx.appcompat.view.menu.k.a) r7
            androidx.appcompat.view.menu.h r7 = r7.getItemData()
            if (r7 != r0) goto L_0x0037
            r3 = r6
            goto L_0x003a
        L_0x0037:
            int r5 = r5 + 1
            goto L_0x0022
        L_0x003a:
            if (r3 != 0) goto L_0x003d
            return r1
        L_0x003d:
            androidx.appcompat.view.menu.h r0 = r9.A
            int r0 = r0.f642a
            r8.F = r0
            int r0 = r9.size()
            r2 = r1
        L_0x0048:
            r4 = 1
            if (r2 >= r0) goto L_0x0060
            android.view.MenuItem r5 = r9.getItem(r2)
            boolean r6 = r5.isVisible()
            if (r6 == 0) goto L_0x005d
            android.graphics.drawable.Drawable r5 = r5.getIcon()
            if (r5 == 0) goto L_0x005d
            r0 = r4
            goto L_0x0061
        L_0x005d:
            int r2 = r2 + 1
            goto L_0x0048
        L_0x0060:
            r0 = r1
        L_0x0061:
            androidx.appcompat.widget.ActionMenuPresenter$a r2 = new androidx.appcompat.widget.ActionMenuPresenter$a
            android.content.Context r5 = r8.f563b
            r2.<init>(r5, r9, r3)
            r8.B = r2
            r2.f676h = r0
            m.d r2 = r2.f678j
            if (r2 == 0) goto L_0x0073
            r2.q(r0)
        L_0x0073:
            androidx.appcompat.widget.ActionMenuPresenter$a r0 = r8.B
            boolean r2 = r0.b()
            if (r2 == 0) goto L_0x007d
        L_0x007b:
            r1 = r4
            goto L_0x0086
        L_0x007d:
            android.view.View r2 = r0.f674f
            if (r2 != 0) goto L_0x0082
            goto L_0x0086
        L_0x0082:
            r0.d(r1, r1, r1, r1)
            goto L_0x007b
        L_0x0086:
            if (r1 == 0) goto L_0x0090
            androidx.appcompat.view.menu.j$a r0 = r8.f566e
            if (r0 == 0) goto L_0x008f
            r0.d(r9)
        L_0x008f:
            return r4
        L_0x0090:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "MenuPopupHelper cannot be used without an anchor"
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionMenuPresenter.k(androidx.appcompat.view.menu.m):boolean");
    }

    public final Parcelable l() {
        SavedState savedState = new SavedState();
        savedState.f757a = this.F;
        return savedState;
    }

    public final void n(boolean z10) {
        if (z10) {
            j.a aVar = this.f566e;
            if (aVar != null) {
                aVar.d(this.f564c);
                return;
            }
            return;
        }
        androidx.appcompat.view.menu.f fVar = this.f564c;
        if (fVar != null) {
            fVar.c(false);
        }
    }

    public final boolean o() {
        androidx.appcompat.view.menu.f fVar;
        if (!this.f750t || j() || (fVar = this.f564c) == null || this.f569o == null || this.C != null) {
            return false;
        }
        fVar.i();
        if (fVar.f624j.isEmpty()) {
            return false;
        }
        c cVar = new c(new e(this.f563b, this.f564c, this.f747q));
        this.C = cVar;
        ((View) this.f569o).post(cVar);
        return true;
    }
}
