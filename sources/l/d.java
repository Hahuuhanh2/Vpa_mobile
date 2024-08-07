package l;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionMenuPresenter;
import java.lang.ref.WeakReference;
import l.a;

/* compiled from: StandaloneActionMode */
public final class d extends a implements f.a {

    /* renamed from: c  reason: collision with root package name */
    public Context f12571c;

    /* renamed from: d  reason: collision with root package name */
    public ActionBarContextView f12572d;

    /* renamed from: e  reason: collision with root package name */
    public a.C0154a f12573e;

    /* renamed from: f  reason: collision with root package name */
    public WeakReference<View> f12574f;

    /* renamed from: n  reason: collision with root package name */
    public boolean f12575n;

    /* renamed from: o  reason: collision with root package name */
    public f f12576o;

    public d(Context context, ActionBarContextView actionBarContextView, a.C0154a aVar) {
        this.f12571c = context;
        this.f12572d = actionBarContextView;
        this.f12573e = aVar;
        f fVar = new f(actionBarContextView.getContext());
        fVar.f626l = 1;
        this.f12576o = fVar;
        fVar.f619e = this;
    }

    public final boolean a(f fVar, MenuItem menuItem) {
        return this.f12573e.b(this, menuItem);
    }

    public final void b(f fVar) {
        i();
        ActionMenuPresenter actionMenuPresenter = this.f12572d.f1046d;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.o();
        }
    }

    public final void c() {
        if (!this.f12575n) {
            this.f12575n = true;
            this.f12573e.a(this);
        }
    }

    public final View d() {
        WeakReference<View> weakReference = this.f12574f;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final f e() {
        return this.f12576o;
    }

    public final MenuInflater f() {
        return new f(this.f12572d.getContext());
    }

    public final CharSequence g() {
        return this.f12572d.getSubtitle();
    }

    public final CharSequence h() {
        return this.f12572d.getTitle();
    }

    public final void i() {
        this.f12573e.c(this, this.f12576o);
    }

    public final boolean j() {
        return this.f12572d.f723z;
    }

    public final void k(View view) {
        WeakReference<View> weakReference;
        this.f12572d.setCustomView(view);
        if (view != null) {
            weakReference = new WeakReference<>(view);
        } else {
            weakReference = null;
        }
        this.f12574f = weakReference;
    }

    public final void l(int i10) {
        m(this.f12571c.getString(i10));
    }

    public final void m(CharSequence charSequence) {
        this.f12572d.setSubtitle(charSequence);
    }

    public final void n(int i10) {
        o(this.f12571c.getString(i10));
    }

    public final void o(CharSequence charSequence) {
        this.f12572d.setTitle(charSequence);
    }

    public final void p(boolean z10) {
        this.f12564b = z10;
        this.f12572d.setTitleOptional(z10);
    }
}
