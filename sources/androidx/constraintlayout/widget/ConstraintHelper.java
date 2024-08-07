package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import androidx.constraintlayout.widget.a;
import c1.e;
import c1.i;
import c1.j;
import java.util.Arrays;
import java.util.HashMap;

public abstract class ConstraintHelper extends View {

    /* renamed from: a  reason: collision with root package name */
    public int[] f1842a = new int[32];

    /* renamed from: b  reason: collision with root package name */
    public int f1843b;

    /* renamed from: c  reason: collision with root package name */
    public Context f1844c;

    /* renamed from: d  reason: collision with root package name */
    public j f1845d;

    /* renamed from: e  reason: collision with root package name */
    public String f1846e;

    /* renamed from: f  reason: collision with root package name */
    public String f1847f;

    /* renamed from: n  reason: collision with root package name */
    public View[] f1848n = null;

    /* renamed from: o  reason: collision with root package name */
    public HashMap<Integer, String> f1849o = new HashMap<>();

    public ConstraintHelper(Context context) {
        super(context);
        this.f1844c = context;
        n((AttributeSet) null);
    }

    public final void e(String str) {
        if (str != null && str.length() != 0 && this.f1844c != null) {
            String trim = str.trim();
            if (getParent() instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
            }
            int l10 = l(trim);
            if (l10 != 0) {
                this.f1849o.put(Integer.valueOf(l10), trim);
                f(l10);
            }
        }
    }

    public final void f(int i10) {
        if (i10 != getId()) {
            int i11 = this.f1843b + 1;
            int[] iArr = this.f1842a;
            if (i11 > iArr.length) {
                this.f1842a = Arrays.copyOf(iArr, iArr.length * 2);
            }
            int[] iArr2 = this.f1842a;
            int i12 = this.f1843b;
            iArr2[i12] = i10;
            this.f1843b = i12 + 1;
        }
    }

    public final void g(String str) {
        if (str != null && str.length() != 0 && this.f1844c != null) {
            String trim = str.trim();
            ConstraintLayout constraintLayout = null;
            if (getParent() instanceof ConstraintLayout) {
                constraintLayout = (ConstraintLayout) getParent();
            }
            if (constraintLayout != null) {
                int childCount = constraintLayout.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = constraintLayout.getChildAt(i10);
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    if ((layoutParams instanceof ConstraintLayout.LayoutParams) && trim.equals(((ConstraintLayout.LayoutParams) layoutParams).Y) && childAt.getId() != -1) {
                        f(childAt.getId());
                    }
                }
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f1842a, this.f1843b);
    }

    public final void h() {
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            i((ConstraintLayout) parent);
        }
    }

    public final void i(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i10 = 0; i10 < this.f1843b; i10++) {
            View c10 = constraintLayout.c(this.f1842a[i10]);
            if (c10 != null) {
                c10.setVisibility(visibility);
                if (elevation > 0.0f) {
                    c10.setTranslationZ(c10.getTranslationZ() + elevation);
                }
            }
        }
    }

    public void j(ConstraintLayout constraintLayout) {
    }

    public final int k(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        if (str == null || constraintLayout == null || (resources = this.f1844c.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            if (childAt.getId() != -1) {
                String str2 = null;
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    public final int l(String str) {
        ConstraintLayout constraintLayout;
        Integer num;
        HashMap<String, Integer> hashMap;
        if (getParent() instanceof ConstraintLayout) {
            constraintLayout = (ConstraintLayout) getParent();
        } else {
            constraintLayout = null;
        }
        int i10 = 0;
        if (isInEditMode() && constraintLayout != null) {
            if (!(str instanceof String) || (hashMap = constraintLayout.f1863t) == null || !hashMap.containsKey(str)) {
                num = null;
            } else {
                num = constraintLayout.f1863t.get(str);
            }
            if (num instanceof Integer) {
                i10 = num.intValue();
            }
        }
        if (i10 == 0 && constraintLayout != null) {
            i10 = k(constraintLayout, str);
        }
        if (i10 == 0) {
            try {
                i10 = R$id.class.getField(str).getInt((Object) null);
            } catch (Exception unused) {
            }
        }
        if (i10 == 0) {
            return this.f1844c.getResources().getIdentifier(str, "id", this.f1844c.getPackageName());
        }
        return i10;
    }

    public final View[] m(ConstraintLayout constraintLayout) {
        View[] viewArr = this.f1848n;
        if (viewArr == null || viewArr.length != this.f1843b) {
            this.f1848n = new View[this.f1843b];
        }
        for (int i10 = 0; i10 < this.f1843b; i10++) {
            this.f1848n[i10] = constraintLayout.c(this.f1842a[i10]);
        }
        return this.f1848n;
    }

    public void n(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == R$styleable.ConstraintLayout_Layout_constraint_referenced_ids) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f1846e = string;
                    setIds(string);
                } else if (index == R$styleable.ConstraintLayout_Layout_constraint_referenced_tags) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f1847f = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void o(a.C0016a aVar, j jVar, Constraints.LayoutParams layoutParams, SparseArray sparseArray) {
        a.b bVar = aVar.f1951e;
        int[] iArr = bVar.f1987j0;
        int i10 = 0;
        if (iArr != null) {
            setReferencedIds(iArr);
        } else {
            String str = bVar.f1989k0;
            if (str != null) {
                if (str.length() > 0) {
                    a.b bVar2 = aVar.f1951e;
                    String[] split = bVar2.f1989k0.split(",");
                    getContext();
                    int[] iArr2 = new int[split.length];
                    int i11 = 0;
                    for (String trim : split) {
                        int l10 = l(trim.trim());
                        if (l10 != 0) {
                            iArr2[i11] = l10;
                            i11++;
                        }
                    }
                    if (i11 != split.length) {
                        iArr2 = Arrays.copyOf(iArr2, i11);
                    }
                    bVar2.f1987j0 = iArr2;
                } else {
                    aVar.f1951e.f1987j0 = null;
                }
            }
        }
        jVar.a();
        if (aVar.f1951e.f1987j0 != null) {
            while (true) {
                int[] iArr3 = aVar.f1951e.f1987j0;
                if (i10 < iArr3.length) {
                    e eVar = (e) sparseArray.get(iArr3[i10]);
                    if (eVar != null) {
                        jVar.b(eVar);
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f1846e;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f1847f;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    public final void onDraw(Canvas canvas) {
    }

    public void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    public void p(e eVar, boolean z10) {
    }

    public void q() {
    }

    public void r(ConstraintLayout constraintLayout) {
    }

    public void s(i iVar, SparseArray sparseArray) {
        iVar.a();
        for (int i10 = 0; i10 < this.f1843b; i10++) {
            iVar.b((e) sparseArray.get(this.f1842a[i10]));
        }
    }

    public void setIds(String str) {
        this.f1846e = str;
        if (str != null) {
            int i10 = 0;
            this.f1843b = 0;
            while (true) {
                int indexOf = str.indexOf(44, i10);
                if (indexOf == -1) {
                    e(str.substring(i10));
                    return;
                } else {
                    e(str.substring(i10, indexOf));
                    i10 = indexOf + 1;
                }
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f1847f = str;
        if (str != null) {
            int i10 = 0;
            this.f1843b = 0;
            while (true) {
                int indexOf = str.indexOf(44, i10);
                if (indexOf == -1) {
                    g(str.substring(i10));
                    return;
                } else {
                    g(str.substring(i10, indexOf));
                    i10 = indexOf + 1;
                }
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f1846e = null;
        this.f1843b = 0;
        for (int f10 : iArr) {
            f(f10);
        }
    }

    public void setTag(int i10, Object obj) {
        super.setTag(i10, obj);
        if (obj == null && this.f1846e == null) {
            f(i10);
        }
    }

    public final void t() {
        if (this.f1845d != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof ConstraintLayout.LayoutParams) {
                ((ConstraintLayout.LayoutParams) layoutParams).f1899q0 = this.f1845d;
            }
        }
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1844c = context;
        n(attributeSet);
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1844c = context;
        n(attributeSet);
    }
}
