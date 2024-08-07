package com.google.android.material.tabs;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.vpa.daugia.module.cart.ui.CartManagerActivity;
import com.vpa.daugia.module.payment.ui.activity.PaymentActivity;
import java.lang.ref.WeakReference;
import lf.j;

/* compiled from: TabLayoutMediator */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final TabLayout f6940a;

    /* renamed from: b  reason: collision with root package name */
    public final ViewPager2 f6941b;

    /* renamed from: c  reason: collision with root package name */
    public final b f6942c;

    /* renamed from: d  reason: collision with root package name */
    public RecyclerView.e<?> f6943d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f6944e;

    /* compiled from: TabLayoutMediator */
    public class a extends RecyclerView.g {
        public a() {
        }

        public final void a() {
            c.this.b();
        }

        public final void b() {
            c.this.b();
        }

        public final void c(int i10, int i11) {
            c.this.b();
        }

        public final void d(int i10, int i11) {
            c.this.b();
        }
    }

    /* compiled from: TabLayoutMediator */
    public interface b {
    }

    /* renamed from: com.google.android.material.tabs.c$c  reason: collision with other inner class name */
    /* compiled from: TabLayoutMediator */
    public static class C0067c extends ViewPager2.g {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<TabLayout> f6946a;

        /* renamed from: b  reason: collision with root package name */
        public int f6947b = 0;

        /* renamed from: c  reason: collision with root package name */
        public int f6948c = 0;

        public C0067c(TabLayout tabLayout) {
            this.f6946a = new WeakReference<>(tabLayout);
        }

        public final void a(int i10) {
            this.f6947b = this.f6948c;
            this.f6948c = i10;
            TabLayout tabLayout = this.f6946a.get();
            if (tabLayout != null) {
                tabLayout.f6887e0 = this.f6948c;
            }
        }

        public final void b(float f10, int i10, int i11) {
            boolean z10;
            boolean z11;
            TabLayout tabLayout = this.f6946a.get();
            if (tabLayout != null) {
                int i12 = this.f6948c;
                if (i12 != 2 || this.f6947b == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i12 == 2 && this.f6947b == 0) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                tabLayout.n(i10, f10, z10, z11, false);
            }
        }

        public final void c(int i10) {
            boolean z10;
            TabLayout tabLayout = this.f6946a.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i10 && i10 < tabLayout.getTabCount()) {
                int i11 = this.f6948c;
                if (i11 == 0 || (i11 == 2 && this.f6947b == 0)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                tabLayout.l(tabLayout.h(i10), z10);
            }
        }
    }

    /* compiled from: TabLayoutMediator */
    public static class d implements TabLayout.d {

        /* renamed from: a  reason: collision with root package name */
        public final ViewPager2 f6949a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f6950b;

        public d(ViewPager2 viewPager2, boolean z10) {
            this.f6949a = viewPager2;
            this.f6950b = z10;
        }

        public final void a() {
        }

        public final void b(TabLayout.g gVar) {
            this.f6949a.setCurrentItem(gVar.f6928d, this.f6950b);
        }

        public final void c() {
        }
    }

    public c(TabLayout tabLayout, ViewPager2 viewPager2, dh.a aVar) {
        this.f6940a = tabLayout;
        this.f6941b = viewPager2;
        this.f6942c = aVar;
    }

    public final void a() {
        if (!this.f6944e) {
            RecyclerView.e<?> adapter = this.f6941b.getAdapter();
            this.f6943d = adapter;
            if (adapter != null) {
                this.f6944e = true;
                this.f6941b.f3593c.f3627a.add(new C0067c(this.f6940a));
                d dVar = new d(this.f6941b, true);
                TabLayout tabLayout = this.f6940a;
                if (!tabLayout.S.contains(dVar)) {
                    tabLayout.S.add(dVar);
                }
                this.f6943d.q(new a());
                b();
                this.f6940a.setScrollPosition(this.f6941b.getCurrentItem(), 0.0f, true);
                return;
            }
            throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        throw new IllegalStateException("TabLayoutMediator is already attached");
    }

    public final void b() {
        int min;
        this.f6940a.k();
        RecyclerView.e<?> eVar = this.f6943d;
        if (eVar != null) {
            int c10 = eVar.c();
            for (int i10 = 0; i10 < c10; i10++) {
                TabLayout.g i11 = this.f6940a.i();
                dh.a aVar = (dh.a) this.f6942c;
                switch (aVar.f19928a) {
                    case 0:
                        j jVar = aVar.f19929b;
                        int i12 = CartManagerActivity.W;
                        sk.j.f(jVar, "$contentAdapter");
                        String str = jVar.f13003u.get(i10);
                        sk.j.e(str, "get(...)");
                        i11.a(str);
                        break;
                    default:
                        j jVar2 = aVar.f19929b;
                        String str2 = PaymentActivity.S;
                        sk.j.f(jVar2, "$contentAdapter");
                        String str3 = jVar2.f13003u.get(i10);
                        sk.j.e(str3, "get(...)");
                        i11.a(str3);
                        break;
                }
                this.f6940a.a(i11, false);
            }
            if (c10 > 0 && (min = Math.min(this.f6941b.getCurrentItem(), this.f6940a.getTabCount() - 1)) != this.f6940a.getSelectedTabPosition()) {
                TabLayout tabLayout = this.f6940a;
                tabLayout.l(tabLayout.h(min), true);
            }
        }
    }
}
