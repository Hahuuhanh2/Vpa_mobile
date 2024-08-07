package w1;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.PointerIcon;
import android.view.View;
import android.view.View$OnUnhandledKeyEventListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.core.R$id;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import w1.a;
import w1.c;
import w1.w0;
import x1.f;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* compiled from: ViewCompat */
public final class d0 {

    /* renamed from: a  reason: collision with root package name */
    public static WeakHashMap<View, q0> f16298a = null;

    /* renamed from: b  reason: collision with root package name */
    public static Field f16299b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f16300c = false;

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f16301d = {R$id.accessibility_custom_action_0, R$id.accessibility_custom_action_1, R$id.accessibility_custom_action_2, R$id.accessibility_custom_action_3, R$id.accessibility_custom_action_4, R$id.accessibility_custom_action_5, R$id.accessibility_custom_action_6, R$id.accessibility_custom_action_7, R$id.accessibility_custom_action_8, R$id.accessibility_custom_action_9, R$id.accessibility_custom_action_10, R$id.accessibility_custom_action_11, R$id.accessibility_custom_action_12, R$id.accessibility_custom_action_13, R$id.accessibility_custom_action_14, R$id.accessibility_custom_action_15, R$id.accessibility_custom_action_16, R$id.accessibility_custom_action_17, R$id.accessibility_custom_action_18, R$id.accessibility_custom_action_19, R$id.accessibility_custom_action_20, R$id.accessibility_custom_action_21, R$id.accessibility_custom_action_22, R$id.accessibility_custom_action_23, R$id.accessibility_custom_action_24, R$id.accessibility_custom_action_25, R$id.accessibility_custom_action_26, R$id.accessibility_custom_action_27, R$id.accessibility_custom_action_28, R$id.accessibility_custom_action_29, R$id.accessibility_custom_action_30, R$id.accessibility_custom_action_31};

    /* renamed from: e  reason: collision with root package name */
    public static final y f16302e = new y();

    /* renamed from: f  reason: collision with root package name */
    public static final a f16303f = new a();

    /* compiled from: ViewCompat */
    public static class a implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public final WeakHashMap<View, Boolean> f16304a = new WeakHashMap<>();

        public final void onGlobalLayout() {
            boolean z10;
            int i10;
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry next : this.f16304a.entrySet()) {
                    View view = (View) next.getKey();
                    boolean booleanValue = ((Boolean) next.getValue()).booleanValue();
                    if (!view.isShown() || view.getWindowVisibility() != 0) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (booleanValue != z10) {
                        if (z10) {
                            i10 = 16;
                        } else {
                            i10 = 32;
                        }
                        d0.i(i10, view);
                        this.f16304a.put(view, Boolean.valueOf(z10));
                    }
                }
            }
        }

        public final void onViewAttachedToWindow(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        public final void onViewDetachedFromWindow(View view) {
        }
    }

    /* compiled from: ViewCompat */
    public static abstract class b<T> {

        /* renamed from: a  reason: collision with root package name */
        public final int f16305a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<T> f16306b;

        /* renamed from: c  reason: collision with root package name */
        public final int f16307c;

        /* renamed from: d  reason: collision with root package name */
        public final int f16308d;

        public b(int i10, Class<T> cls, int i11, int i12) {
            this.f16305a = i10;
            this.f16306b = cls;
            this.f16308d = i11;
            this.f16307c = i12;
        }

        public static boolean a(Boolean bool, Boolean bool2) {
            boolean z10;
            boolean z11;
            if (bool == null || !bool.booleanValue()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (bool2 == null || !bool2.booleanValue()) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (z10 == z11) {
                return true;
            }
            return false;
        }

        public abstract T b(View view);

        public abstract void c(View view, T t10);

        public final T d(View view) {
            boolean z10;
            if (Build.VERSION.SDK_INT >= this.f16307c) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return b(view);
            }
            T tag = view.getTag(this.f16305a);
            if (this.f16306b.isInstance(tag)) {
                return tag;
            }
            return null;
        }

        public final void e(View view, T t10) {
            boolean z10;
            a aVar;
            if (Build.VERSION.SDK_INT >= this.f16307c) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                c(view, t10);
            } else if (f(d(view), t10)) {
                View.AccessibilityDelegate d10 = d0.d(view);
                if (d10 == null) {
                    aVar = null;
                } else if (d10 instanceof a.C0209a) {
                    aVar = ((a.C0209a) d10).f16282a;
                } else {
                    aVar = new a(d10);
                }
                if (aVar == null) {
                    aVar = new a();
                }
                d0.o(view, aVar);
                view.setTag(this.f16305a, t10);
                d0.i(this.f16308d, view);
            }
        }

        public abstract boolean f(T t10, T t11);
    }

    /* compiled from: ViewCompat */
    public static class c {
        public static boolean a(View view) {
            return view.hasOnClickListeners();
        }
    }

    /* compiled from: ViewCompat */
    public static class d {
        public static AccessibilityNodeProvider a(View view) {
            return view.getAccessibilityNodeProvider();
        }

        public static boolean b(View view) {
            return view.getFitsSystemWindows();
        }

        public static int c(View view) {
            return view.getImportantForAccessibility();
        }

        public static int d(View view) {
            return view.getMinimumHeight();
        }

        public static int e(View view) {
            return view.getMinimumWidth();
        }

        public static ViewParent f(View view) {
            return view.getParentForAccessibility();
        }

        public static int g(View view) {
            return view.getWindowSystemUiVisibility();
        }

        public static boolean h(View view) {
            return view.hasOverlappingRendering();
        }

        public static boolean i(View view) {
            return view.hasTransientState();
        }

        public static boolean j(View view, int i10, Bundle bundle) {
            return view.performAccessibilityAction(i10, bundle);
        }

        public static void k(View view) {
            view.postInvalidateOnAnimation();
        }

        public static void l(View view, int i10, int i11, int i12, int i13) {
            view.postInvalidateOnAnimation(i10, i11, i12, i13);
        }

        public static void m(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        public static void n(View view, Runnable runnable, long j10) {
            view.postOnAnimationDelayed(runnable, j10);
        }

        public static void o(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        public static void p(View view) {
            view.requestFitSystemWindows();
        }

        public static void q(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        public static void r(View view, boolean z10) {
            view.setHasTransientState(z10);
        }

        public static void s(View view, int i10) {
            view.setImportantForAccessibility(i10);
        }
    }

    /* compiled from: ViewCompat */
    public static class e {
        public static int a() {
            return View.generateViewId();
        }

        public static Display b(View view) {
            return view.getDisplay();
        }

        public static int c(View view) {
            return view.getLabelFor();
        }

        public static int d(View view) {
            return view.getLayoutDirection();
        }

        public static int e(View view) {
            return view.getPaddingEnd();
        }

        public static int f(View view) {
            return view.getPaddingStart();
        }

        public static boolean g(View view) {
            return view.isPaddingRelative();
        }

        public static void h(View view, int i10) {
            view.setLabelFor(i10);
        }

        public static void i(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        public static void j(View view, int i10) {
            view.setLayoutDirection(i10);
        }

        public static void k(View view, int i10, int i11, int i12, int i13) {
            view.setPaddingRelative(i10, i11, i12, i13);
        }
    }

    /* compiled from: ViewCompat */
    public static class f {
        public static Rect a(View view) {
            return view.getClipBounds();
        }

        public static boolean b(View view) {
            return view.isInLayout();
        }

        public static void c(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    /* compiled from: ViewCompat */
    public static class g {
        public static int a(View view) {
            return view.getAccessibilityLiveRegion();
        }

        public static boolean b(View view) {
            return view.isAttachedToWindow();
        }

        public static boolean c(View view) {
            return view.isLaidOut();
        }

        public static boolean d(View view) {
            return view.isLayoutDirectionResolved();
        }

        public static void e(ViewParent viewParent, View view, View view2, int i10) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i10);
        }

        public static void f(View view, int i10) {
            view.setAccessibilityLiveRegion(i10);
        }

        public static void g(AccessibilityEvent accessibilityEvent, int i10) {
            accessibilityEvent.setContentChangeTypes(i10);
        }
    }

    /* compiled from: ViewCompat */
    public static class h {
        public static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        public static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        public static void c(View view) {
            view.requestApplyInsets();
        }
    }

    /* compiled from: ViewCompat */
    public static class i {

        /* compiled from: ViewCompat */
        public class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a  reason: collision with root package name */
            public w0 f16309a = null;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ View f16310b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ q f16311c;

            public a(View view, q qVar) {
                this.f16310b = view;
                this.f16311c = qVar;
            }

            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                w0 i10 = w0.i(view, windowInsets);
                int i11 = Build.VERSION.SDK_INT;
                if (i11 < 30) {
                    i.a(windowInsets, this.f16310b);
                    if (i10.equals(this.f16309a)) {
                        return this.f16311c.g(view, i10).h();
                    }
                }
                this.f16309a = i10;
                w0 g2 = this.f16311c.g(view, i10);
                if (i11 >= 30) {
                    return g2.h();
                }
                WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                h.c(view);
                return g2.h();
            }
        }

        public static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R$id.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        public static w0 b(View view, w0 w0Var, Rect rect) {
            WindowInsets h10 = w0Var.h();
            if (h10 != null) {
                return w0.i(view, view.computeSystemWindowInsets(h10, rect));
            }
            rect.setEmpty();
            return w0Var;
        }

        public static boolean c(View view, float f10, float f11, boolean z10) {
            return view.dispatchNestedFling(f10, f11, z10);
        }

        public static boolean d(View view, float f10, float f11) {
            return view.dispatchNestedPreFling(f10, f11);
        }

        public static boolean e(View view, int i10, int i11, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i10, i11, iArr, iArr2);
        }

        public static boolean f(View view, int i10, int i11, int i12, int i13, int[] iArr) {
            return view.dispatchNestedScroll(i10, i11, i12, i13, iArr);
        }

        public static ColorStateList g(View view) {
            return view.getBackgroundTintList();
        }

        public static PorterDuff.Mode h(View view) {
            return view.getBackgroundTintMode();
        }

        public static float i(View view) {
            return view.getElevation();
        }

        public static w0 j(View view) {
            w0.e eVar;
            if (w0.a.f16395d && view.isAttachedToWindow()) {
                try {
                    Object obj = w0.a.f16392a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) w0.a.f16393b.get(obj);
                        Rect rect2 = (Rect) w0.a.f16394c.get(obj);
                        if (!(rect == null || rect2 == null)) {
                            int i10 = Build.VERSION.SDK_INT;
                            if (i10 >= 30) {
                                eVar = new w0.d();
                            } else if (i10 >= 29) {
                                eVar = new w0.c();
                            } else {
                                eVar = new w0.b();
                            }
                            eVar.e(n1.e.b(rect.left, rect.top, rect.right, rect.bottom));
                            eVar.g(n1.e.b(rect2.left, rect2.top, rect2.right, rect2.bottom));
                            w0 b10 = eVar.b();
                            b10.f16391a.p(b10);
                            b10.f16391a.d(view.getRootView());
                            return b10;
                        }
                    }
                } catch (IllegalAccessException e10) {
                    e10.getMessage();
                }
            }
            return null;
        }

        public static String k(View view) {
            return view.getTransitionName();
        }

        public static float l(View view) {
            return view.getTranslationZ();
        }

        public static float m(View view) {
            return view.getZ();
        }

        public static boolean n(View view) {
            return view.hasNestedScrollingParent();
        }

        public static boolean o(View view) {
            return view.isImportantForAccessibility();
        }

        public static boolean p(View view) {
            return view.isNestedScrollingEnabled();
        }

        public static void q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        public static void r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        public static void s(View view, float f10) {
            view.setElevation(f10);
        }

        public static void t(View view, boolean z10) {
            view.setNestedScrollingEnabled(z10);
        }

        public static void u(View view, q qVar) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(R$id.tag_on_apply_window_listener, qVar);
            }
            if (qVar == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R$id.tag_window_insets_animation_callback));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, qVar));
            }
        }

        public static void v(View view, String str) {
            view.setTransitionName(str);
        }

        public static void w(View view, float f10) {
            view.setTranslationZ(f10);
        }

        public static void x(View view, float f10) {
            view.setZ(f10);
        }

        public static boolean y(View view, int i10) {
            return view.startNestedScroll(i10);
        }

        public static void z(View view) {
            view.stopNestedScroll();
        }
    }

    /* compiled from: ViewCompat */
    public static class j {
        public static w0 a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            w0 i10 = w0.i((View) null, rootWindowInsets);
            i10.f16391a.p(i10);
            i10.f16391a.d(view.getRootView());
            return i10;
        }

        public static int b(View view) {
            return view.getScrollIndicators();
        }

        public static void c(View view, int i10) {
            view.setScrollIndicators(i10);
        }

        public static void d(View view, int i10, int i11) {
            view.setScrollIndicators(i10, i11);
        }
    }

    /* compiled from: ViewCompat */
    public static class k {
        public static void a(View view) {
            view.cancelDragAndDrop();
        }

        public static void b(View view) {
            view.dispatchFinishTemporaryDetach();
        }

        public static void c(View view) {
            view.dispatchStartTemporaryDetach();
        }

        public static void d(View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }

        public static boolean e(View view, ClipData clipData, View.DragShadowBuilder dragShadowBuilder, Object obj, int i10) {
            return view.startDragAndDrop(clipData, dragShadowBuilder, obj, i10);
        }

        public static void f(View view, View.DragShadowBuilder dragShadowBuilder) {
            view.updateDragShadow(dragShadowBuilder);
        }
    }

    /* compiled from: ViewCompat */
    public static class l {
        public static void a(View view, Collection<View> collection, int i10) {
            view.addKeyboardNavigationClusters(collection, i10);
        }

        public static AutofillId b(View view) {
            return view.getAutofillId();
        }

        public static int c(View view) {
            return view.getImportantForAutofill();
        }

        public static int d(View view) {
            return view.getNextClusterForwardId();
        }

        public static boolean e(View view) {
            return view.hasExplicitFocusable();
        }

        public static boolean f(View view) {
            return view.isFocusedByDefault();
        }

        public static boolean g(View view) {
            return view.isImportantForAutofill();
        }

        public static boolean h(View view) {
            return view.isKeyboardNavigationCluster();
        }

        public static View i(View view, View view2, int i10) {
            return view.keyboardNavigationClusterSearch(view2, i10);
        }

        public static boolean j(View view) {
            return view.restoreDefaultFocus();
        }

        public static void k(View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        public static void l(View view, boolean z10) {
            view.setFocusedByDefault(z10);
        }

        public static void m(View view, int i10) {
            view.setImportantForAutofill(i10);
        }

        public static void n(View view, boolean z10) {
            view.setKeyboardNavigationCluster(z10);
        }

        public static void o(View view, int i10) {
            view.setNextClusterForwardId(i10);
        }

        public static void p(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    /* compiled from: ViewCompat */
    public static class m {
        public static void a(View view, r rVar) {
            int i10 = R$id.tag_unhandled_key_listeners;
            v0.h hVar = (v0.h) view.getTag(i10);
            if (hVar == null) {
                hVar = new v0.h();
                view.setTag(i10, hVar);
            }
            Objects.requireNonNull(rVar);
            g0 g0Var = new g0(rVar);
            hVar.put(rVar, g0Var);
            view.addOnUnhandledKeyEventListener(g0Var);
        }

        public static CharSequence b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        public static boolean c(View view) {
            return view.isAccessibilityHeading();
        }

        public static boolean d(View view) {
            return view.isScreenReaderFocusable();
        }

        public static void e(View view, r rVar) {
            View$OnUnhandledKeyEventListener view$OnUnhandledKeyEventListener;
            v0.h hVar = (v0.h) view.getTag(R$id.tag_unhandled_key_listeners);
            if (hVar != null && (view$OnUnhandledKeyEventListener = (View$OnUnhandledKeyEventListener) hVar.getOrDefault(rVar, null)) != null) {
                view.removeOnUnhandledKeyEventListener(view$OnUnhandledKeyEventListener);
            }
        }

        public static <T> T f(View view, int i10) {
            return view.requireViewById(i10);
        }

        public static void g(View view, boolean z10) {
            view.setAccessibilityHeading(z10);
        }

        public static void h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        public static void i(View view, AutofillId autofillId) {
            view.setAutofillId(autofillId);
        }

        public static void j(View view, boolean z10) {
            view.setScreenReaderFocusable(z10);
        }
    }

    /* compiled from: ViewCompat */
    public static class n {
        public static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        public static ContentCaptureSession b(View view) {
            return view.getContentCaptureSession();
        }

        public static List<Rect> c(View view) {
            return view.getSystemGestureExclusionRects();
        }

        public static void d(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i10, i11);
        }

        public static void e(View view, ContentCaptureSession contentCaptureSession) {
            view.setContentCaptureSession(contentCaptureSession);
        }

        public static void f(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    /* compiled from: ViewCompat */
    public static class o {
        public static int a(View view) {
            return view.getImportantForContentCapture();
        }

        public static CharSequence b(View view) {
            return view.getStateDescription();
        }

        public static x0 c(View view) {
            WindowInsetsController i10 = view.getWindowInsetsController();
            if (i10 != null) {
                return new x0(i10);
            }
            return null;
        }

        public static boolean d(View view) {
            return view.isImportantForContentCapture();
        }

        public static void e(View view, int i10) {
            view.setImportantForContentCapture(i10);
        }

        public static void f(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* compiled from: ViewCompat */
    public static final class p {
        public static String[] a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static c b(View view, c cVar) {
            ContentInfo d10 = cVar.f16284a.d();
            Objects.requireNonNull(d10);
            ContentInfo g2 = view.performReceiveContent(d10);
            if (g2 == null) {
                return null;
            }
            if (g2 == d10) {
                return cVar;
            }
            return new c(new c.d(g2));
        }

        public static void c(View view, String[] strArr, r rVar) {
            if (rVar == null) {
                view.setOnReceiveContentListener(strArr, (OnReceiveContentListener) null);
            } else {
                view.setOnReceiveContentListener(strArr, new q(rVar));
            }
        }
    }

    /* compiled from: ViewCompat */
    public static final class q implements OnReceiveContentListener {

        /* renamed from: a  reason: collision with root package name */
        public final r f16312a;

        public q(r rVar) {
            this.f16312a = rVar;
        }

        public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            c cVar = new c(new c.d(contentInfo));
            c a10 = this.f16312a.a(view, cVar);
            if (a10 == null) {
                return null;
            }
            if (a10 == cVar) {
                return contentInfo;
            }
            ContentInfo d10 = a10.f16284a.d();
            Objects.requireNonNull(d10);
            return d10;
        }
    }

    /* compiled from: ViewCompat */
    public interface r {
        boolean a();
    }

    /* compiled from: ViewCompat */
    public static class s {

        /* renamed from: d  reason: collision with root package name */
        public static final ArrayList<WeakReference<View>> f16313d = new ArrayList<>();

        /* renamed from: a  reason: collision with root package name */
        public WeakHashMap<View, Boolean> f16314a = null;

        /* renamed from: b  reason: collision with root package name */
        public SparseArray<WeakReference<View>> f16315b = null;

        /* renamed from: c  reason: collision with root package name */
        public WeakReference<KeyEvent> f16316c = null;

        public static boolean b(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(R$id.tag_unhandled_key_listeners);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((r) arrayList.get(size)).a()) {
                    return true;
                }
            }
            return false;
        }

        public final View a(View view, KeyEvent keyEvent) {
            View a10;
            WeakHashMap<View, Boolean> weakHashMap = this.f16314a;
            if (weakHashMap == null || !weakHashMap.containsKey(view)) {
                return null;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                do {
                    childCount--;
                    if (childCount >= 0) {
                        a10 = a(viewGroup.getChildAt(childCount), keyEvent);
                    }
                } while (a10 == null);
                return a10;
            }
            if (b(view, keyEvent)) {
                return view;
            }
            return null;
        }
    }

    static {
        new AtomicInteger(1);
    }

    public static q0 a(View view) {
        if (f16298a == null) {
            f16298a = new WeakHashMap<>();
        }
        q0 q0Var = f16298a.get(view);
        if (q0Var != null) {
            return q0Var;
        }
        q0 q0Var2 = new q0(view);
        f16298a.put(view, q0Var2);
        return q0Var2;
    }

    public static w0 b(View view, w0 w0Var) {
        WindowInsets h10 = w0Var.h();
        if (h10 != null) {
            WindowInsets a10 = h.a(view, h10);
            if (!a10.equals(h10)) {
                return w0.i(view, a10);
            }
        }
        return w0Var;
    }

    public static boolean c(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList<WeakReference<View>> arrayList = s.f16313d;
        int i10 = R$id.tag_unhandled_key_event_manager;
        s sVar = (s) view.getTag(i10);
        if (sVar == null) {
            sVar = new s();
            view.setTag(i10, sVar);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap<View, Boolean> weakHashMap = sVar.f16314a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList2 = s.f16313d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    if (sVar.f16314a == null) {
                        sVar.f16314a = new WeakHashMap<>();
                    }
                    int size = arrayList2.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        ArrayList<WeakReference<View>> arrayList3 = s.f16313d;
                        View view2 = (View) arrayList3.get(size).get();
                        if (view2 == null) {
                            arrayList3.remove(size);
                        } else {
                            sVar.f16314a.put(view2, Boolean.TRUE);
                            for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                sVar.f16314a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
        View a10 = sVar.a(view, keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (a10 != null && !KeyEvent.isModifierKey(keyCode)) {
                if (sVar.f16315b == null) {
                    sVar.f16315b = new SparseArray<>();
                }
                sVar.f16315b.put(keyCode, new WeakReference(a10));
            }
        }
        if (a10 != null) {
            return true;
        }
        return false;
    }

    public static View.AccessibilityDelegate d(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return n.a(view);
        }
        if (f16300c) {
            return null;
        }
        if (f16299b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f16299b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f16300c = true;
                return null;
            }
        }
        try {
            Object obj = f16299b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f16300c = true;
            return null;
        }
    }

    public static CharSequence e(View view) {
        boolean z10;
        Object obj;
        int i10 = R$id.tag_accessibility_pane_title;
        Class<CharSequence> cls = CharSequence.class;
        if (Build.VERSION.SDK_INT >= 28) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            obj = m.b(view);
        } else {
            obj = view.getTag(i10);
            if (!cls.isInstance(obj)) {
                obj = null;
            }
        }
        return (CharSequence) obj;
    }

    public static ArrayList f(View view) {
        int i10 = R$id.tag_accessibility_actions;
        ArrayList arrayList = (ArrayList) view.getTag(i10);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(i10, arrayList2);
        return arrayList2;
    }

    public static String[] g(View view) {
        if (Build.VERSION.SDK_INT >= 31) {
            return p.a(view);
        }
        return (String[]) view.getTag(R$id.tag_on_receive_content_mime_types);
    }

    @Deprecated
    public static x0 h(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return o.c(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return new x0(window, view);
                }
                return null;
            }
        }
        return null;
    }

    public static void i(int i10, View view) {
        boolean z10;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            if (e(view) == null || !view.isShown() || view.getWindowVisibility() != 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            int i11 = 32;
            if (g.a(view) != 0 || z10) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                if (!z10) {
                    i11 = 2048;
                }
                obtain.setEventType(i11);
                g.g(obtain, i10);
                if (z10) {
                    obtain.getText().add(e(view));
                    if (d.c(view) == 0) {
                        d.s(view, 1);
                    }
                }
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (i10 == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                g.g(obtain2, i10);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(e(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
            } else if (view.getParent() != null) {
                try {
                    g.e(view.getParent(), view, view, i10);
                } catch (AbstractMethodError unused) {
                    view.getParent().getClass();
                }
            }
        }
    }

    public static w0 j(View view, w0 w0Var) {
        WindowInsets h10 = w0Var.h();
        if (h10 != null) {
            WindowInsets b10 = h.b(view, h10);
            if (!b10.equals(h10)) {
                return w0.i(view, b10);
            }
        }
        return w0Var;
    }

    public static c k(View view, c cVar) {
        s sVar;
        s sVar2;
        if (Log.isLoggable("ViewCompat", 3)) {
            Objects.toString(cVar);
            view.getClass();
            view.getId();
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return p.b(view, cVar);
        }
        r rVar = (r) view.getTag(R$id.tag_on_receive_content_listener);
        if (rVar != null) {
            c a10 = rVar.a(view, cVar);
            if (a10 == null) {
                return null;
            }
            if (view instanceof s) {
                sVar2 = (s) view;
            } else {
                sVar2 = f16302e;
            }
            return sVar2.a(a10);
        }
        if (view instanceof s) {
            sVar = (s) view;
        } else {
            sVar = f16302e;
        }
        return sVar.a(cVar);
    }

    public static void l(int i10, View view) {
        ArrayList f10 = f(view);
        for (int i11 = 0; i11 < f10.size(); i11++) {
            if (((f.a) f10.get(i11)).a() == i10) {
                f10.remove(i11);
                return;
            }
        }
    }

    public static void m(View view, f.a aVar, String str, x1.j jVar) {
        a aVar2;
        if (jVar == null && str == null) {
            l(aVar.a(), view);
            i(0, view);
            return;
        }
        f.a aVar3 = new f.a((Object) null, aVar.f16877b, str, jVar, aVar.f16878c);
        View.AccessibilityDelegate d10 = d(view);
        if (d10 == null) {
            aVar2 = null;
        } else if (d10 instanceof a.C0209a) {
            aVar2 = ((a.C0209a) d10).f16282a;
        } else {
            aVar2 = new a(d10);
        }
        if (aVar2 == null) {
            aVar2 = new a();
        }
        o(view, aVar2);
        l(aVar3.a(), view);
        f(view).add(aVar3);
        i(0, view);
    }

    public static void n(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            n.d(view, context, iArr, attributeSet, typedArray, i10, 0);
        }
    }

    public static void o(View view, a aVar) {
        a.C0209a aVar2;
        if (aVar == null && (d(view) instanceof a.C0209a)) {
            aVar = new a();
        }
        if (d.c(view) == 0) {
            d.s(view, 1);
        }
        if (aVar == null) {
            aVar2 = null;
        } else {
            aVar2 = aVar.f16281b;
        }
        view.setAccessibilityDelegate(aVar2);
    }

    public static void p(View view, CharSequence charSequence) {
        boolean z10;
        new a0(R$id.tag_accessibility_pane_title, CharSequence.class).e(view, charSequence);
        if (charSequence != null) {
            a aVar = f16303f;
            WeakHashMap<View, Boolean> weakHashMap = aVar.f16304a;
            if (!view.isShown() || view.getWindowVisibility() != 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            weakHashMap.put(view, Boolean.valueOf(z10));
            view.addOnAttachStateChangeListener(aVar);
            if (g.b(view)) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(aVar);
                return;
            }
            return;
        }
        a aVar2 = f16303f;
        aVar2.f16304a.remove(view);
        view.removeOnAttachStateChangeListener(aVar2);
        d.o(view.getViewTreeObserver(), aVar2);
    }
}
