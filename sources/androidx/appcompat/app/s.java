package androidx.appcompat.app;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatDelegateImpl;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.p0;
import java.util.ArrayList;
import java.util.WeakHashMap;
import w1.d0;
import w1.q0;

/* compiled from: ToolbarActionBar */
public final class s extends ActionBar {

    /* renamed from: a  reason: collision with root package name */
    public final p0 f473a;

    /* renamed from: b  reason: collision with root package name */
    public final Window.Callback f474b;

    /* renamed from: c  reason: collision with root package name */
    public final e f475c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f476d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f477e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f478f;

    /* renamed from: g  reason: collision with root package name */
    public ArrayList<ActionBar.a> f479g = new ArrayList<>();

    /* renamed from: h  reason: collision with root package name */
    public final a f480h = new a();

    /* compiled from: ToolbarActionBar */
    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            f fVar;
            s sVar = s.this;
            Menu r10 = sVar.r();
            if (r10 instanceof f) {
                fVar = (f) r10;
            } else {
                fVar = null;
            }
            if (fVar != null) {
                fVar.y();
            }
            try {
                r10.clear();
                if (!sVar.f474b.onCreatePanelMenu(0, r10) || !sVar.f474b.onPreparePanel(0, (View) null, r10)) {
                    r10.clear();
                }
            } finally {
                if (fVar != null) {
                    fVar.x();
                }
            }
        }
    }

    /* compiled from: ToolbarActionBar */
    public class b implements Toolbar.g {
        public b() {
        }
    }

    /* compiled from: ToolbarActionBar */
    public final class c implements j.a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f483a;

        public c() {
        }

        public final void c(f fVar, boolean z10) {
            if (!this.f483a) {
                this.f483a = true;
                s.this.f473a.f();
                s.this.f474b.onPanelClosed(108, fVar);
                this.f483a = false;
            }
        }

        public final boolean d(f fVar) {
            s.this.f474b.onMenuOpened(108, fVar);
            return true;
        }
    }

    /* compiled from: ToolbarActionBar */
    public final class d implements f.a {
        public d() {
        }

        public final boolean a(f fVar, MenuItem menuItem) {
            return false;
        }

        public final void b(f fVar) {
            if (s.this.f473a.a()) {
                s.this.f474b.onPanelClosed(108, fVar);
            } else if (s.this.f474b.onPreparePanel(0, (View) null, fVar)) {
                s.this.f474b.onMenuOpened(108, fVar);
            }
        }
    }

    /* compiled from: ToolbarActionBar */
    public class e implements AppCompatDelegateImpl.b {
        public e() {
        }
    }

    public s(Toolbar toolbar, CharSequence charSequence, AppCompatDelegateImpl.j jVar) {
        b bVar = new b();
        toolbar.getClass();
        p0 p0Var = new p0(toolbar, false);
        this.f473a = p0Var;
        jVar.getClass();
        this.f474b = jVar;
        p0Var.f1191l = jVar;
        toolbar.setOnMenuItemClickListener(bVar);
        p0Var.setWindowTitle(charSequence);
        this.f475c = new e();
    }

    public final boolean a() {
        return this.f473a.d();
    }

    public final boolean b() {
        if (!this.f473a.h()) {
            return false;
        }
        this.f473a.collapseActionView();
        return true;
    }

    public final void c(boolean z10) {
        if (z10 != this.f478f) {
            this.f478f = z10;
            int size = this.f479g.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f479g.get(i10).a();
            }
        }
    }

    public final int d() {
        return this.f473a.f1181b;
    }

    public final Context e() {
        return this.f473a.getContext();
    }

    public final boolean f() {
        this.f473a.f1180a.removeCallbacks(this.f480h);
        Toolbar toolbar = this.f473a.f1180a;
        a aVar = this.f480h;
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        d0.d.m(toolbar, aVar);
        return true;
    }

    public final void g() {
    }

    public final void h() {
        this.f473a.f1180a.removeCallbacks(this.f480h);
    }

    public final boolean i(int i10, KeyEvent keyEvent) {
        int i11;
        Menu r10 = r();
        if (r10 == null) {
            return false;
        }
        if (keyEvent != null) {
            i11 = keyEvent.getDeviceId();
        } else {
            i11 = -1;
        }
        boolean z10 = true;
        if (KeyCharacterMap.load(i11).getKeyboardType() == 1) {
            z10 = false;
        }
        r10.setQwertyMode(z10);
        return r10.performShortcut(i10, keyEvent, 0);
    }

    public final boolean j(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            k();
        }
        return true;
    }

    public final boolean k() {
        return this.f473a.e();
    }

    public final void l(ColorDrawable colorDrawable) {
        Toolbar toolbar = this.f473a.f1180a;
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        d0.d.q(toolbar, colorDrawable);
    }

    public final void m(boolean z10) {
    }

    public final void n() {
        p0 p0Var = this.f473a;
        p0Var.i((p0Var.f1181b & -3) | 2);
    }

    public final void o(boolean z10) {
    }

    public final void p(CharSequence charSequence) {
        this.f473a.setWindowTitle(charSequence);
    }

    public final Menu r() {
        if (!this.f477e) {
            p0 p0Var = this.f473a;
            p0Var.f1180a.setMenuCallbacks(new c(), new d());
            this.f477e = true;
        }
        return this.f473a.f1180a.getMenu();
    }
}
