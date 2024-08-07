package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
import x1.f;
import x1.g;

/* compiled from: RecyclerViewAccessibilityDelegate */
public class u extends w1.a {

    /* renamed from: d  reason: collision with root package name */
    public final RecyclerView f3298d;

    /* renamed from: e  reason: collision with root package name */
    public final a f3299e;

    /* compiled from: RecyclerViewAccessibilityDelegate */
    public static class a extends w1.a {

        /* renamed from: d  reason: collision with root package name */
        public final u f3300d;

        /* renamed from: e  reason: collision with root package name */
        public WeakHashMap f3301e = new WeakHashMap();

        public a(u uVar) {
            this.f3300d = uVar;
        }

        public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
            w1.a aVar = (w1.a) this.f3301e.get(view);
            if (aVar != null) {
                return aVar.a(view, accessibilityEvent);
            }
            return super.a(view, accessibilityEvent);
        }

        public final g b(View view) {
            w1.a aVar = (w1.a) this.f3301e.get(view);
            if (aVar != null) {
                return aVar.b(view);
            }
            return super.b(view);
        }

        public final void c(View view, AccessibilityEvent accessibilityEvent) {
            w1.a aVar = (w1.a) this.f3301e.get(view);
            if (aVar != null) {
                aVar.c(view, accessibilityEvent);
            } else {
                super.c(view, accessibilityEvent);
            }
        }

        public final void d(@SuppressLint({"InvalidNullabilityOverride"}) View view, @SuppressLint({"InvalidNullabilityOverride"}) f fVar) {
            boolean z10;
            RecyclerView recyclerView = this.f3300d.f3298d;
            if (!recyclerView.C || recyclerView.L || recyclerView.f2969e.g()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 || this.f3300d.f3298d.getLayoutManager() == null) {
                this.f16280a.onInitializeAccessibilityNodeInfo(view, fVar.f16862a);
                return;
            }
            this.f3300d.f3298d.getLayoutManager().g0(view, fVar);
            w1.a aVar = (w1.a) this.f3301e.get(view);
            if (aVar != null) {
                aVar.d(view, fVar);
            } else {
                this.f16280a.onInitializeAccessibilityNodeInfo(view, fVar.f16862a);
            }
        }

        public final void e(View view, AccessibilityEvent accessibilityEvent) {
            w1.a aVar = (w1.a) this.f3301e.get(view);
            if (aVar != null) {
                aVar.e(view, accessibilityEvent);
            } else {
                super.e(view, accessibilityEvent);
            }
        }

        public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            w1.a aVar = (w1.a) this.f3301e.get(viewGroup);
            if (aVar != null) {
                return aVar.f(viewGroup, view, accessibilityEvent);
            }
            return super.f(viewGroup, view, accessibilityEvent);
        }

        public final boolean g(@SuppressLint({"InvalidNullabilityOverride"}) View view, int i10, @SuppressLint({"InvalidNullabilityOverride"}) Bundle bundle) {
            boolean z10;
            RecyclerView recyclerView = this.f3300d.f3298d;
            if (!recyclerView.C || recyclerView.L || recyclerView.f2969e.g()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 || this.f3300d.f3298d.getLayoutManager() == null) {
                return super.g(view, i10, bundle);
            }
            w1.a aVar = (w1.a) this.f3301e.get(view);
            if (aVar != null) {
                if (aVar.g(view, i10, bundle)) {
                    return true;
                }
            } else if (super.g(view, i10, bundle)) {
                return true;
            }
            RecyclerView.s sVar = this.f3300d.f3298d.getLayoutManager().f3047b.f2965c;
            return false;
        }

        public final void h(View view, int i10) {
            w1.a aVar = (w1.a) this.f3301e.get(view);
            if (aVar != null) {
                aVar.h(view, i10);
            } else {
                super.h(view, i10);
            }
        }

        public final void i(View view, AccessibilityEvent accessibilityEvent) {
            w1.a aVar = (w1.a) this.f3301e.get(view);
            if (aVar != null) {
                aVar.i(view, accessibilityEvent);
            } else {
                super.i(view, accessibilityEvent);
            }
        }
    }

    public u(RecyclerView recyclerView) {
        this.f3298d = recyclerView;
        a aVar = this.f3299e;
        if (aVar != null) {
            this.f3299e = aVar;
        } else {
            this.f3299e = new a(this);
        }
    }

    public final void c(@SuppressLint({"InvalidNullabilityOverride"}) View view, @SuppressLint({"InvalidNullabilityOverride"}) AccessibilityEvent accessibilityEvent) {
        boolean z10;
        super.c(view, accessibilityEvent);
        if (view instanceof RecyclerView) {
            RecyclerView recyclerView = this.f3298d;
            if (!recyclerView.C || recyclerView.L || recyclerView.f2969e.g()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                RecyclerView recyclerView2 = (RecyclerView) view;
                if (recyclerView2.getLayoutManager() != null) {
                    recyclerView2.getLayoutManager().e0(accessibilityEvent);
                }
            }
        }
    }

    public void d(@SuppressLint({"InvalidNullabilityOverride"}) View view, @SuppressLint({"InvalidNullabilityOverride"}) f fVar) {
        boolean z10;
        this.f16280a.onInitializeAccessibilityNodeInfo(view, fVar.f16862a);
        RecyclerView recyclerView = this.f3298d;
        if (!recyclerView.C || recyclerView.L || recyclerView.f2969e.g()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && this.f3298d.getLayoutManager() != null) {
            RecyclerView.m layoutManager = this.f3298d.getLayoutManager();
            RecyclerView recyclerView2 = layoutManager.f3047b;
            layoutManager.f0(recyclerView2.f2965c, recyclerView2.f2985p0, fVar);
        }
    }

    public final boolean g(@SuppressLint({"InvalidNullabilityOverride"}) View view, int i10, @SuppressLint({"InvalidNullabilityOverride"}) Bundle bundle) {
        boolean z10 = true;
        if (super.g(view, i10, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f3298d;
        if (recyclerView.C && !recyclerView.L && !recyclerView.f2969e.g()) {
            z10 = false;
        }
        if (z10 || this.f3298d.getLayoutManager() == null) {
            return false;
        }
        RecyclerView.m layoutManager = this.f3298d.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f3047b;
        return layoutManager.u0(recyclerView2.f2965c, recyclerView2.f2985p0, i10, bundle);
    }
}
