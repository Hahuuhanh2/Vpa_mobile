package com.google.android.material.bottomappbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* compiled from: BottomAppBar */
public final class b extends FloatingActionButton.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5787a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f5788b;

    /* compiled from: BottomAppBar */
    public class a extends FloatingActionButton.a {
        public a() {
        }

        public final void b() {
            BottomAppBar bottomAppBar = b.this.f5788b;
            int i10 = BottomAppBar.C0;
            bottomAppBar.getClass();
        }
    }

    public b(BottomAppBar bottomAppBar, int i10) {
        this.f5788b = bottomAppBar;
        this.f5787a = i10;
    }

    public final void a(FloatingActionButton floatingActionButton) {
        BottomAppBar bottomAppBar = this.f5788b;
        int i10 = this.f5787a;
        int i11 = BottomAppBar.C0;
        floatingActionButton.setTranslationX(bottomAppBar.D(i10));
        floatingActionButton.m(new a(), true);
    }
}
