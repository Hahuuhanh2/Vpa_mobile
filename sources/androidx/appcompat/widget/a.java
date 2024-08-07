package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$styleable;
import androidx.appcompat.view.menu.f;
import w1.d0;
import w1.q0;
import w1.r0;

/* compiled from: AbsActionBarView */
public abstract class a extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    public final C0011a f1043a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f1044b;

    /* renamed from: c  reason: collision with root package name */
    public ActionMenuView f1045c;

    /* renamed from: d  reason: collision with root package name */
    public ActionMenuPresenter f1046d;

    /* renamed from: e  reason: collision with root package name */
    public int f1047e;

    /* renamed from: f  reason: collision with root package name */
    public q0 f1048f;

    /* renamed from: n  reason: collision with root package name */
    public boolean f1049n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f1050o;

    /* renamed from: androidx.appcompat.widget.a$a  reason: collision with other inner class name */
    /* compiled from: AbsActionBarView */
    public class C0011a implements r0 {

        /* renamed from: a  reason: collision with root package name */
        public boolean f1051a = false;

        /* renamed from: b  reason: collision with root package name */
        public int f1052b;

        public C0011a() {
        }

        public final void a() {
            if (!this.f1051a) {
                a aVar = a.this;
                aVar.f1048f = null;
                a.super.setVisibility(this.f1052b);
            }
        }

        public final void b(View view) {
            this.f1051a = true;
        }

        public final void c() {
            a.super.setVisibility(0);
            this.f1051a = false;
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static int c(View view, int i10, int i11) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE), i11);
        return Math.max(0, (i10 - view.getMeasuredWidth()) - 0);
    }

    public static int d(int i10, int i11, int i12, View view, boolean z10) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i13 = ((i12 - measuredHeight) / 2) + i11;
        if (z10) {
            view.layout(i10 - measuredWidth, i13, i10, measuredHeight + i13);
        } else {
            view.layout(i10, i13, i10 + measuredWidth, measuredHeight + i13);
        }
        if (z10) {
            return -measuredWidth;
        }
        return measuredWidth;
    }

    public final q0 e(int i10, long j10) {
        q0 q0Var = this.f1048f;
        if (q0Var != null) {
            q0Var.b();
        }
        if (i10 == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            q0 a10 = d0.a(this);
            a10.a(1.0f);
            a10.c(j10);
            C0011a aVar = this.f1043a;
            a.this.f1048f = a10;
            aVar.f1052b = i10;
            a10.d(aVar);
            return a10;
        }
        q0 a11 = d0.a(this);
        a11.a(0.0f);
        a11.c(j10);
        C0011a aVar2 = this.f1043a;
        a.this.f1048f = a11;
        aVar2.f1052b = i10;
        a11.d(aVar2);
        return a11;
    }

    public int getAnimatedVisibility() {
        if (this.f1048f != null) {
            return this.f1043a.f1052b;
        }
        return getVisibility();
    }

    public int getContentHeight() {
        return this.f1047e;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        int i10;
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, R$styleable.ActionBar, R$attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(R$styleable.ActionBar_height, 0));
        obtainStyledAttributes.recycle();
        ActionMenuPresenter actionMenuPresenter = this.f1046d;
        if (actionMenuPresenter != null) {
            Configuration configuration2 = actionMenuPresenter.f563b.getResources().getConfiguration();
            int i11 = configuration2.screenWidthDp;
            int i12 = configuration2.screenHeightDp;
            if (configuration2.smallestScreenWidthDp > 600 || i11 > 600 || ((i11 > 960 && i12 > 720) || (i11 > 720 && i12 > 960))) {
                i10 = 5;
            } else if (i11 >= 500 || ((i11 > 640 && i12 > 480) || (i11 > 480 && i12 > 640))) {
                i10 = 4;
            } else if (i11 >= 360) {
                i10 = 3;
            } else {
                i10 = 2;
            }
            actionMenuPresenter.f754x = i10;
            f fVar = actionMenuPresenter.f564c;
            if (fVar != null) {
                fVar.p(true);
            }
        }
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1050o = false;
        }
        if (!this.f1050o) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1050o = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1050o = false;
        }
        return true;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1049n = false;
        }
        if (!this.f1049n) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1049n = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1049n = false;
        }
        return true;
    }

    public void setContentHeight(int i10) {
        this.f1047e = i10;
        requestLayout();
    }

    public void setVisibility(int i10) {
        if (i10 != getVisibility()) {
            q0 q0Var = this.f1048f;
            if (q0Var != null) {
                q0Var.b();
            }
            super.setVisibility(i10);
        }
    }

    public a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1043a = new C0011a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R$attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f1044b = context;
        } else {
            this.f1044b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }
}
