package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.fragment.R$id;
import androidx.fragment.R$styleable;
import f0.b0;
import java.util.ArrayList;
import java.util.Iterator;
import sk.j;
import w1.d0;
import w1.w0;

/* compiled from: FragmentContainerView.kt */
public final class FragmentContainerView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f2480a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f2481b;

    /* renamed from: c  reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f2482c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2483d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context) {
        super(context);
        j.f(context, "context");
        this.f2480a = new ArrayList();
        this.f2481b = new ArrayList();
        this.f2483d = true;
    }

    public final void a(View view) {
        if (this.f2481b.contains(view)) {
            this.f2480a.add(view);
        }
    }

    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        Fragment fragment;
        j.f(view, "child");
        Object tag = view.getTag(R$id.fragment_container_view_tag);
        if (tag instanceof Fragment) {
            fragment = (Fragment) tag;
        } else {
            fragment = null;
        }
        if (fragment != null) {
            super.addView(view, i10, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        w0 w0Var;
        j.f(windowInsets, "insets");
        w0 i10 = w0.i((View) null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f2482c;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            j.e(onApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            w0Var = w0.i((View) null, onApplyWindowInsets);
        } else {
            w0Var = d0.j(this, i10);
        }
        j.e(w0Var, "if (applyWindowInsetsLis…, insetsCompat)\n        }");
        if (!w0Var.f16391a.m()) {
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                d0.b(getChildAt(i11), w0Var);
            }
        }
        return windowInsets;
    }

    public final void dispatchDraw(Canvas canvas) {
        j.f(canvas, "canvas");
        if (this.f2483d) {
            Iterator it = this.f2480a.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    public final boolean drawChild(Canvas canvas, View view, long j10) {
        j.f(canvas, "canvas");
        j.f(view, "child");
        if (!this.f2483d || !(!this.f2480a.isEmpty()) || !this.f2480a.contains(view)) {
            return super.drawChild(canvas, view, j10);
        }
        return false;
    }

    public final void endViewTransition(View view) {
        j.f(view, "view");
        this.f2481b.remove(view);
        if (this.f2480a.remove(view)) {
            this.f2483d = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends Fragment> F getFragment() {
        Fragment fragment;
        FragmentManager fragmentManager;
        FragmentActivity fragmentActivity = null;
        View view = this;
        while (true) {
            if (view == null) {
                fragment = null;
                break;
            }
            Object tag = view.getTag(R$id.fragment_container_view_tag);
            if (tag instanceof Fragment) {
                fragment = (Fragment) tag;
            } else {
                fragment = null;
            }
            if (fragment != null) {
                break;
            }
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                view = (View) parent;
            } else {
                view = null;
            }
        }
        if (fragment == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                } else if (context instanceof FragmentActivity) {
                    fragmentActivity = (FragmentActivity) context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (fragmentActivity != null) {
                fragmentManager = fragmentActivity.G();
            } else {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
        } else if (fragment.C()) {
            fragmentManager = fragment.o();
        } else {
            throw new IllegalStateException("The Fragment " + fragment + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
        return fragmentManager.C(getId());
    }

    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        j.f(windowInsets, "insets");
        return windowInsets;
    }

    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 < childCount) {
                View childAt = getChildAt(childCount);
                j.e(childAt, "view");
                a(childAt);
            } else {
                super.removeAllViewsInLayout();
                return;
            }
        }
    }

    public final void removeView(View view) {
        j.f(view, "view");
        a(view);
        super.removeView(view);
    }

    public final void removeViewAt(int i10) {
        View childAt = getChildAt(i10);
        j.e(childAt, "view");
        a(childAt);
        super.removeViewAt(i10);
    }

    public final void removeViewInLayout(View view) {
        j.f(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    public final void removeViews(int i10, int i11) {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            View childAt = getChildAt(i13);
            j.e(childAt, "view");
            a(childAt);
        }
        super.removeViews(i10, i11);
    }

    public final void removeViewsInLayout(int i10, int i11) {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            View childAt = getChildAt(i13);
            j.e(childAt, "view");
            a(childAt);
        }
        super.removeViewsInLayout(i10, i11);
    }

    public final void setDrawDisappearingViewsLast(boolean z10) {
        this.f2483d = z10;
    }

    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        j.f(onApplyWindowInsetsListener, "listener");
        this.f2482c = onApplyWindowInsetsListener;
    }

    public final void startViewTransition(View view) {
        j.f(view, "view");
        if (view.getParent() == this) {
            this.f2481b.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        j.f(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        String str;
        j.f(context, "context");
        this.f2480a = new ArrayList();
        this.f2481b = new ArrayList();
        this.f2483d = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            int[] iArr = R$styleable.FragmentContainerView;
            j.e(iArr, "FragmentContainerView");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(R$styleable.FragmentContainerView_android_name);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute != null && !isInEditMode()) {
                throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, FragmentManager fragmentManager) {
        super(context, attributeSet);
        View view;
        Activity activity;
        j.f(context, "context");
        j.f(attributeSet, "attrs");
        j.f(fragmentManager, "fm");
        this.f2480a = new ArrayList();
        this.f2481b = new ArrayList();
        this.f2483d = true;
        String classAttribute = attributeSet.getClassAttribute();
        int[] iArr = R$styleable.FragmentContainerView;
        j.e(iArr, "FragmentContainerView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(R$styleable.FragmentContainerView_android_name) : classAttribute;
        String string = obtainStyledAttributes.getString(R$styleable.FragmentContainerView_android_tag);
        obtainStyledAttributes.recycle();
        int id2 = getId();
        Fragment C = fragmentManager.C(id2);
        if (classAttribute != null && C == null) {
            if (id2 == -1) {
                throw new IllegalStateException(b0.s("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? b0.r(" with tag ", string) : ""));
            }
            q G = fragmentManager.G();
            context.getClassLoader();
            Fragment a10 = G.a(classAttribute);
            j.e(a10, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            a10.J = true;
            r<?> rVar = a10.f2461z;
            if (rVar == null) {
                activity = null;
            } else {
                activity = rVar.f2697b;
            }
            if (activity != null) {
                a10.J = true;
            }
            a aVar = new a(fragmentManager);
            aVar.f2570p = true;
            a10.K = this;
            aVar.g(getId(), a10, string, 1);
            if (!aVar.f2561g) {
                aVar.f2562h = false;
                aVar.f2552q.z(aVar, true);
            } else {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
        }
        Iterator it = fragmentManager.f2486c.f().iterator();
        while (it.hasNext()) {
            z zVar = (z) it.next();
            Fragment fragment = zVar.f2721c;
            if (fragment.D == getId() && (view = fragment.L) != null && view.getParent() == null) {
                fragment.K = this;
                zVar.b();
            }
        }
    }
}
