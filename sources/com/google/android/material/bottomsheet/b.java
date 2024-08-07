package com.google.android.material.bottomsheet;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.app.m;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.R$id;
import com.google.android.material.R$layout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import f8.c;
import java.util.WeakHashMap;
import l8.h;
import v7.d;
import v7.e;
import v7.f;
import w1.d0;
import w1.q0;
import w1.u0;
import w1.w;
import w1.w0;
import w1.x0;

/* compiled from: BottomSheetDialog */
public final class b extends m {

    /* renamed from: f  reason: collision with root package name */
    public BottomSheetBehavior<FrameLayout> f5863f;

    /* renamed from: n  reason: collision with root package name */
    public FrameLayout f5864n;

    /* renamed from: o  reason: collision with root package name */
    public CoordinatorLayout f5865o;

    /* renamed from: p  reason: collision with root package name */
    public FrameLayout f5866p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f5867q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f5868r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f5869s;

    /* renamed from: t  reason: collision with root package name */
    public C0061b f5870t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f5871u;

    /* renamed from: v  reason: collision with root package name */
    public c f5872v;

    /* renamed from: w  reason: collision with root package name */
    public a f5873w;

    /* compiled from: BottomSheetDialog */
    public class a extends BottomSheetBehavior.d {
        public a() {
        }

        public final void b(View view) {
        }

        public final void c(int i10, View view) {
            if (i10 == 5) {
                b.this.cancel();
            }
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.b$b  reason: collision with other inner class name */
    /* compiled from: BottomSheetDialog */
    public static class C0061b extends BottomSheetBehavior.d {

        /* renamed from: a  reason: collision with root package name */
        public final Boolean f5875a;

        /* renamed from: b  reason: collision with root package name */
        public final w0 f5876b;

        /* renamed from: c  reason: collision with root package name */
        public Window f5877c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f5878d;

        public C0061b(FrameLayout frameLayout, w0 w0Var) {
            ColorStateList colorStateList;
            Integer num;
            this.f5876b = w0Var;
            h hVar = BottomSheetBehavior.C(frameLayout).f5824p;
            if (hVar != null) {
                colorStateList = hVar.f12778a.f12800c;
            } else {
                WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                colorStateList = d0.i.g(frameLayout);
            }
            if (colorStateList != null) {
                this.f5875a = Boolean.valueOf(m9.b.G(colorStateList.getDefaultColor()));
                return;
            }
            ColorStateList d10 = b8.b.d(frameLayout.getBackground());
            if (d10 != null) {
                num = Integer.valueOf(d10.getDefaultColor());
            } else {
                num = null;
            }
            if (num != null) {
                this.f5875a = Boolean.valueOf(m9.b.G(num.intValue()));
            } else {
                this.f5875a = null;
            }
        }

        public final void a(View view) {
            d(view);
        }

        public final void b(View view) {
            d(view);
        }

        public final void c(int i10, View view) {
            d(view);
        }

        public final void d(View view) {
            x0.d dVar;
            boolean z10;
            x0.d dVar2;
            if (view.getTop() < this.f5876b.e()) {
                Window window = this.f5877c;
                if (window != null) {
                    Boolean bool = this.f5875a;
                    if (bool == null) {
                        z10 = this.f5878d;
                    } else {
                        z10 = bool.booleanValue();
                    }
                    w wVar = new w(window.getDecorView());
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 30) {
                        x0.d dVar3 = new x0.d(window.getInsetsController(), wVar);
                        dVar3.f16428c = window;
                        dVar2 = dVar3;
                    } else if (i10 >= 26) {
                        dVar2 = new x0.c(window, wVar);
                    } else {
                        dVar2 = new x0.b(window, wVar);
                    }
                    dVar2.d(z10);
                }
                view.setPadding(view.getPaddingLeft(), this.f5876b.e() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            } else if (view.getTop() != 0) {
                Window window2 = this.f5877c;
                if (window2 != null) {
                    boolean z11 = this.f5878d;
                    w wVar2 = new w(window2.getDecorView());
                    int i11 = Build.VERSION.SDK_INT;
                    if (i11 >= 30) {
                        x0.d dVar4 = new x0.d(window2.getInsetsController(), wVar2);
                        dVar4.f16428c = window2;
                        dVar = dVar4;
                    } else if (i11 >= 26) {
                        dVar = new x0.c(window2, wVar2);
                    } else {
                        dVar = new x0.b(window2, wVar2);
                    }
                    dVar.d(z11);
                }
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
            }
        }

        public final void e(Window window) {
            if (this.f5877c != window) {
                this.f5877c = window;
                if (window != null) {
                    this.f5878d = new x0(window, window.getDecorView()).f16423a.b();
                }
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b(android.content.Context r4, int r5) {
        /*
            r3 = this;
            r0 = 1
            if (r5 != 0) goto L_0x0019
            android.util.TypedValue r5 = new android.util.TypedValue
            r5.<init>()
            android.content.res.Resources$Theme r1 = r4.getTheme()
            int r2 = com.google.android.material.R$attr.bottomSheetDialogTheme
            boolean r1 = r1.resolveAttribute(r2, r5, r0)
            if (r1 == 0) goto L_0x0017
            int r5 = r5.resourceId
            goto L_0x0019
        L_0x0017:
            int r5 = com.google.android.material.R$style.Theme_Design_Light_BottomSheetDialog
        L_0x0019:
            r3.<init>(r4, r5)
            r3.f5867q = r0
            r3.f5868r = r0
            com.google.android.material.bottomsheet.b$a r4 = new com.google.android.material.bottomsheet.b$a
            r4.<init>()
            r3.f5873w = r4
            androidx.appcompat.app.f r4 = r3.d()
            r4.s(r0)
            android.content.Context r4 = r3.getContext()
            android.content.res.Resources$Theme r4 = r4.getTheme()
            int[] r5 = new int[r0]
            int r0 = com.google.android.material.R$attr.enableEdgeToEdge
            r1 = 0
            r5[r1] = r0
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5)
            boolean r4 = r4.getBoolean(r1, r1)
            r3.f5871u = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.b.<init>(android.content.Context, int):void");
    }

    public final void cancel() {
        if (this.f5863f == null) {
            f();
        }
        super.cancel();
    }

    public final void f() {
        if (this.f5864n == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R$layout.design_bottom_sheet_dialog, (ViewGroup) null);
            this.f5864n = frameLayout;
            this.f5865o = (CoordinatorLayout) frameLayout.findViewById(R$id.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.f5864n.findViewById(R$id.design_bottom_sheet);
            this.f5866p = frameLayout2;
            BottomSheetBehavior<FrameLayout> C = BottomSheetBehavior.C(frameLayout2);
            this.f5863f = C;
            a aVar = this.f5873w;
            if (!C.f5812e0.contains(aVar)) {
                C.f5812e0.add(aVar);
            }
            this.f5863f.I(this.f5867q);
            this.f5872v = new c(this.f5863f, this.f5866p);
        }
    }

    public final FrameLayout g(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        f();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f5864n.findViewById(R$id.coordinator);
        if (i10 != 0 && view == null) {
            view = getLayoutInflater().inflate(i10, coordinatorLayout, false);
        }
        if (this.f5871u) {
            FrameLayout frameLayout = this.f5866p;
            a aVar = new a(this);
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            d0.i.u(frameLayout, aVar);
        }
        this.f5866p.removeAllViews();
        if (layoutParams == null) {
            this.f5866p.addView(view);
        } else {
            this.f5866p.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R$id.touch_outside).setOnClickListener(new d(this));
        d0.o(this.f5866p, new e(this));
        this.f5866p.setOnTouchListener(new f());
        return this.f5864n;
    }

    public final void onAttachedToWindow() {
        boolean z10;
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            if (!this.f5871u || Color.alpha(window.getNavigationBarColor()) >= 255) {
                z10 = false;
            } else {
                z10 = true;
            }
            FrameLayout frameLayout = this.f5864n;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z10);
            }
            CoordinatorLayout coordinatorLayout = this.f5865o;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z10);
            }
            u0.a(window, !z10);
            C0061b bVar = this.f5870t;
            if (bVar != null) {
                bVar.e(window);
            }
        }
        c cVar = this.f5872v;
        if (cVar != null) {
            if (this.f5867q) {
                cVar.a(false);
                return;
            }
            c.a aVar = cVar.f10046a;
            if (aVar != null) {
                aVar.c(cVar.f10048c);
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    public final void onDetachedFromWindow() {
        c.a aVar;
        C0061b bVar = this.f5870t;
        if (bVar != null) {
            bVar.e((Window) null);
        }
        c cVar = this.f5872v;
        if (cVar != null && (aVar = cVar.f10046a) != null) {
            aVar.c(cVar.f10048c);
        }
    }

    public final void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f5863f;
        if (bottomSheetBehavior != null && bottomSheetBehavior.S == 5) {
            bottomSheetBehavior.K(4);
        }
    }

    public final void setCancelable(boolean z10) {
        c cVar;
        super.setCancelable(z10);
        if (this.f5867q != z10) {
            this.f5867q = z10;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f5863f;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.I(z10);
            }
            if (getWindow() != null && (cVar = this.f5872v) != null) {
                if (this.f5867q) {
                    cVar.a(false);
                    return;
                }
                c.a aVar = cVar.f10046a;
                if (aVar != null) {
                    aVar.c(cVar.f10048c);
                }
            }
        }
    }

    public final void setCanceledOnTouchOutside(boolean z10) {
        super.setCanceledOnTouchOutside(z10);
        if (z10 && !this.f5867q) {
            this.f5867q = true;
        }
        this.f5868r = z10;
        this.f5869s = true;
    }

    public final void setContentView(int i10) {
        super.setContentView((View) g((View) null, i10, (ViewGroup.LayoutParams) null));
    }

    public final void setContentView(View view) {
        super.setContentView((View) g(view, 0, (ViewGroup.LayoutParams) null));
    }

    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView((View) g(view, 0, layoutParams));
    }
}
