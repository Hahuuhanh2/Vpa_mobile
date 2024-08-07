package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import androidx.appcompat.R$dimen;
import d.h;
import d.i;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import w1.d0;
import w1.h0;
import w1.q0;

/* compiled from: TooltipCompatHandler */
public final class r0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: r  reason: collision with root package name */
    public static r0 f1202r;

    /* renamed from: s  reason: collision with root package name */
    public static r0 f1203s;

    /* renamed from: a  reason: collision with root package name */
    public final View f1204a;

    /* renamed from: b  reason: collision with root package name */
    public final CharSequence f1205b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1206c;

    /* renamed from: d  reason: collision with root package name */
    public final h f1207d = new h(this, 2);

    /* renamed from: e  reason: collision with root package name */
    public final i f1208e = new i(this, 1);

    /* renamed from: f  reason: collision with root package name */
    public int f1209f;

    /* renamed from: n  reason: collision with root package name */
    public int f1210n;

    /* renamed from: o  reason: collision with root package name */
    public s0 f1211o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f1212p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f1213q;

    public r0(View view, CharSequence charSequence) {
        int i10;
        this.f1204a = view;
        this.f1205b = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = h0.f16322a;
        if (Build.VERSION.SDK_INT >= 28) {
            i10 = h0.b.a(viewConfiguration);
        } else {
            i10 = viewConfiguration.getScaledTouchSlop() / 2;
        }
        this.f1206c = i10;
        this.f1213q = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(r0 r0Var) {
        r0 r0Var2 = f1202r;
        if (r0Var2 != null) {
            r0Var2.f1204a.removeCallbacks(r0Var2.f1207d);
        }
        f1202r = r0Var;
        if (r0Var != null) {
            r0Var.f1204a.postDelayed(r0Var.f1207d, (long) ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        boolean z10;
        if (f1203s == this) {
            f1203s = null;
            s0 s0Var = this.f1211o;
            if (s0Var != null) {
                if (s0Var.f1215b.getParent() != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    ((WindowManager) s0Var.f1214a.getSystemService("window")).removeView(s0Var.f1215b);
                }
                this.f1211o = null;
                this.f1213q = true;
                this.f1204a.removeOnAttachStateChangeListener(this);
            }
        }
        if (f1202r == this) {
            b((r0) null);
        }
        this.f1204a.removeCallbacks(this.f1208e);
    }

    public final void c(boolean z10) {
        boolean z11;
        int i10;
        int i11;
        int i12;
        long j10;
        int i13;
        long j11;
        int i14;
        boolean z12;
        View view = this.f1204a;
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        if (d0.g.b(view)) {
            b((r0) null);
            r0 r0Var = f1203s;
            if (r0Var != null) {
                r0Var.a();
            }
            f1203s = this;
            this.f1212p = z10;
            s0 s0Var = new s0(this.f1204a.getContext());
            this.f1211o = s0Var;
            View view2 = this.f1204a;
            int i15 = this.f1209f;
            int i16 = this.f1210n;
            boolean z13 = this.f1212p;
            CharSequence charSequence = this.f1205b;
            if (s0Var.f1215b.getParent() != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (s0Var.f1215b.getParent() != null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    ((WindowManager) s0Var.f1214a.getSystemService("window")).removeView(s0Var.f1215b);
                }
            }
            s0Var.f1216c.setText(charSequence);
            WindowManager.LayoutParams layoutParams = s0Var.f1217d;
            layoutParams.token = view2.getApplicationWindowToken();
            int dimensionPixelOffset = s0Var.f1214a.getResources().getDimensionPixelOffset(R$dimen.tooltip_precise_anchor_threshold);
            if (view2.getWidth() < dimensionPixelOffset) {
                i15 = view2.getWidth() / 2;
            }
            if (view2.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = s0Var.f1214a.getResources().getDimensionPixelOffset(R$dimen.tooltip_precise_anchor_extra_offset);
                i10 = i16 + dimensionPixelOffset2;
                i11 = i16 - dimensionPixelOffset2;
            } else {
                i10 = view2.getHeight();
                i11 = 0;
            }
            layoutParams.gravity = 49;
            Resources resources = s0Var.f1214a.getResources();
            if (z13) {
                i12 = R$dimen.tooltip_y_offset_touch;
            } else {
                i12 = R$dimen.tooltip_y_offset_non_touch;
            }
            int dimensionPixelOffset3 = resources.getDimensionPixelOffset(i12);
            View rootView = view2.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                Context context = view2.getContext();
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else if (context instanceof Activity) {
                        rootView = ((Activity) context).getWindow().getDecorView();
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                }
            }
            if (rootView != null) {
                rootView.getWindowVisibleDisplayFrame(s0Var.f1218e);
                Rect rect = s0Var.f1218e;
                if (rect.left < 0 && rect.top < 0) {
                    Resources resources2 = s0Var.f1214a.getResources();
                    int identifier = resources2.getIdentifier("status_bar_height", "dimen", "android");
                    if (identifier != 0) {
                        i14 = resources2.getDimensionPixelSize(identifier);
                    } else {
                        i14 = 0;
                    }
                    DisplayMetrics displayMetrics = resources2.getDisplayMetrics();
                    s0Var.f1218e.set(0, i14, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen(s0Var.f1220g);
                view2.getLocationOnScreen(s0Var.f1219f);
                int[] iArr = s0Var.f1219f;
                int i17 = iArr[0];
                int[] iArr2 = s0Var.f1220g;
                int i18 = i17 - iArr2[0];
                iArr[0] = i18;
                iArr[1] = iArr[1] - iArr2[1];
                layoutParams.x = (i18 + i15) - (rootView.getWidth() / 2);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                s0Var.f1215b.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredHeight = s0Var.f1215b.getMeasuredHeight();
                int i19 = s0Var.f1219f[1];
                int i20 = ((i11 + i19) - dimensionPixelOffset3) - measuredHeight;
                int i21 = i19 + i10 + dimensionPixelOffset3;
                if (z13) {
                    if (i20 >= 0) {
                        layoutParams.y = i20;
                    } else {
                        layoutParams.y = i21;
                    }
                } else if (measuredHeight + i21 <= s0Var.f1218e.height()) {
                    layoutParams.y = i21;
                } else {
                    layoutParams.y = i20;
                }
            }
            ((WindowManager) s0Var.f1214a.getSystemService("window")).addView(s0Var.f1215b, s0Var.f1217d);
            this.f1204a.addOnAttachStateChangeListener(this);
            if (this.f1212p) {
                j10 = 2500;
            } else {
                if ((d0.d.g(this.f1204a) & 1) == 1) {
                    j11 = 3000;
                    i13 = ViewConfiguration.getLongPressTimeout();
                } else {
                    j11 = 15000;
                    i13 = ViewConfiguration.getLongPressTimeout();
                }
                j10 = j11 - ((long) i13);
            }
            this.f1204a.removeCallbacks(this.f1208e);
            this.f1204a.postDelayed(this.f1208e, j10);
        }
    }

    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f1211o != null && this.f1212p) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f1204a.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        boolean z10 = true;
        if (action != 7) {
            if (action == 10) {
                this.f1213q = true;
                a();
            }
        } else if (this.f1204a.isEnabled() && this.f1211o == null) {
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (this.f1213q || Math.abs(x10 - this.f1209f) > this.f1206c || Math.abs(y10 - this.f1210n) > this.f1206c) {
                this.f1209f = x10;
                this.f1210n = y10;
                this.f1213q = false;
            } else {
                z10 = false;
            }
            if (z10) {
                b(this);
            }
        }
        return false;
    }

    public final boolean onLongClick(View view) {
        this.f1209f = view.getWidth() / 2;
        this.f1210n = view.getHeight() / 2;
        c(true);
        return true;
    }

    public final void onViewAttachedToWindow(View view) {
    }

    public final void onViewDetachedFromWindow(View view) {
        a();
    }
}
