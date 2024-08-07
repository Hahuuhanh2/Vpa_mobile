package com.google.android.material.internal;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import com.google.android.material.search.SearchBar;
import java.util.WeakHashMap;
import w1.d0;
import w1.q;
import w1.q0;
import w1.w0;
import w1.x0;
import z.j;

/* compiled from: ViewUtils */
public final class x {

    /* compiled from: ViewUtils */
    public class a implements q {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f6510a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ c f6511b;

        public a(b bVar, c cVar) {
            this.f6510a = bVar;
            this.f6511b = cVar;
        }

        public final w0 g(View view, w0 w0Var) {
            return this.f6510a.a(view, w0Var, new c(this.f6511b));
        }
    }

    /* compiled from: ViewUtils */
    public interface b {
        w0 a(View view, w0 w0Var, c cVar);
    }

    public static Rect a(View view, SearchBar searchBar) {
        int[] iArr = new int[2];
        searchBar.getLocationOnScreen(iArr);
        int i10 = iArr[0];
        int i11 = iArr[1];
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr2);
        int i12 = i10 - iArr2[0];
        int i13 = i11 - iArr2[1];
        return new Rect(i12, i13, searchBar.getWidth() + i12, searchBar.getHeight() + i13);
    }

    public static void b(View view, b bVar) {
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        d0.i.u(view, new a(bVar, new c(d0.e.f(view), view.getPaddingTop(), d0.e.e(view), view.getPaddingBottom())));
        if (d0.g.b(view)) {
            d0.h.c(view);
        } else {
            view.addOnAttachStateChangeListener(new y());
        }
    }

    public static float c(Context context, int i10) {
        return TypedValue.applyDimension(1, (float) i10, context.getResources().getDisplayMetrics());
    }

    public static ViewGroup d(View view) {
        if (view == null) {
            return null;
        }
        View rootView = view.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(16908290);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == view || !(rootView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) rootView;
    }

    public static j e(View view) {
        ViewGroup d10 = d(view);
        if (d10 == null) {
            return null;
        }
        return new j(d10);
    }

    public static void f(View view, boolean z10) {
        x0 h10;
        if (!z10 || (h10 = d0.h(view)) == null) {
            InputMethodManager inputMethodManager = (InputMethodManager) k1.a.getSystemService(view.getContext(), InputMethodManager.class);
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
                return;
            }
            return;
        }
        h10.f16423a.a();
    }

    public static boolean g(View view) {
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        if (d0.e.d(view) == 1) {
            return true;
        }
        return false;
    }

    public static PorterDuff.Mode h(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i10) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    /* compiled from: ViewUtils */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public int f6512a;

        /* renamed from: b  reason: collision with root package name */
        public int f6513b;

        /* renamed from: c  reason: collision with root package name */
        public int f6514c;

        /* renamed from: d  reason: collision with root package name */
        public int f6515d;

        public c(int i10, int i11, int i12, int i13) {
            this.f6512a = i10;
            this.f6513b = i11;
            this.f6514c = i12;
            this.f6515d = i13;
        }

        public c(c cVar) {
            this.f6512a = cVar.f6512a;
            this.f6513b = cVar.f6513b;
            this.f6514c = cVar.f6514c;
            this.f6515d = cVar.f6515d;
        }
    }
}
