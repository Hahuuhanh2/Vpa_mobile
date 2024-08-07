package w1;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets$Type;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: SoftwareKeyboardControllerCompat */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    public final a f16386a;

    /* compiled from: SoftwareKeyboardControllerCompat */
    public static class a extends c {

        /* renamed from: a  reason: collision with root package name */
        public final View f16387a;

        public a(View view) {
            this.f16387a = view;
        }

        public void a() {
            View view = this.f16387a;
            if (view != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f16387a.getWindowToken(), 0);
            }
        }

        public void b() {
            View view = this.f16387a;
            if (view != null) {
                if (view.isInEditMode() || view.onCheckIsTextEditor()) {
                    view.requestFocus();
                } else {
                    view = view.getRootView().findFocus();
                }
                if (view == null) {
                    view = this.f16387a.getRootView().findViewById(16908290);
                }
                if (view != null && view.hasWindowFocus()) {
                    view.post(new v(0, view));
                }
            }
        }
    }

    /* compiled from: SoftwareKeyboardControllerCompat */
    public static class c {
    }

    public w(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f16386a = new b(view);
        } else {
            this.f16386a = new a(view);
        }
    }

    /* compiled from: SoftwareKeyboardControllerCompat */
    public static class b extends a {

        /* renamed from: b  reason: collision with root package name */
        public View f16388b;

        /* renamed from: c  reason: collision with root package name */
        public WindowInsetsController f16389c;

        public b(View view) {
            super(view);
            this.f16388b = view;
        }

        public final void a() {
            View view;
            WindowInsetsController windowInsetsController = this.f16389c;
            if (windowInsetsController == null) {
                View view2 = this.f16388b;
                if (view2 != null) {
                    windowInsetsController = view2.getWindowInsetsController();
                } else {
                    windowInsetsController = null;
                }
            }
            if (windowInsetsController != null) {
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                x xVar = new x(atomicBoolean);
                windowInsetsController.addOnControllableInsetsChangedListener(xVar);
                if (!atomicBoolean.get() && (view = this.f16388b) != null) {
                    ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f16388b.getWindowToken(), 0);
                }
                windowInsetsController.removeOnControllableInsetsChangedListener(xVar);
                windowInsetsController.hide(WindowInsets$Type.ime());
                return;
            }
            super.a();
        }

        public final void b() {
            View view = this.f16388b;
            if (view != null && Build.VERSION.SDK_INT < 33) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
            }
            WindowInsetsController windowInsetsController = null;
            WindowInsetsController windowInsetsController2 = this.f16389c;
            if (windowInsetsController2 != null) {
                windowInsetsController = windowInsetsController2;
            } else {
                View view2 = this.f16388b;
                if (view2 != null) {
                    windowInsetsController = view2.getWindowInsetsController();
                }
            }
            if (windowInsetsController != null) {
                windowInsetsController.show(WindowInsets$Type.ime());
            } else {
                super.b();
            }
        }

        public b(WindowInsetsController windowInsetsController) {
            super((View) null);
            this.f16389c = windowInsetsController;
        }
    }

    @Deprecated
    public w(WindowInsetsController windowInsetsController) {
        this.f16386a = new b(windowInsetsController);
    }
}
