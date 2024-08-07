package l;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.f;
import java.util.ArrayList;
import l.a;
import m.c;
import q1.b;
import v0.h;

/* compiled from: SupportActionModeWrapper */
public final class e extends ActionMode {

    /* renamed from: a  reason: collision with root package name */
    public final Context f12577a;

    /* renamed from: b  reason: collision with root package name */
    public final a f12578b;

    /* compiled from: SupportActionModeWrapper */
    public static class a implements a.C0154a {

        /* renamed from: a  reason: collision with root package name */
        public final ActionMode.Callback f12579a;

        /* renamed from: b  reason: collision with root package name */
        public final Context f12580b;

        /* renamed from: c  reason: collision with root package name */
        public final ArrayList<e> f12581c = new ArrayList<>();

        /* renamed from: d  reason: collision with root package name */
        public final h<Menu, Menu> f12582d = new h<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f12580b = context;
            this.f12579a = callback;
        }

        public final void a(a aVar) {
            this.f12579a.onDestroyActionMode(e(aVar));
        }

        public final boolean b(a aVar, MenuItem menuItem) {
            return this.f12579a.onActionItemClicked(e(aVar), new c(this.f12580b, (b) menuItem));
        }

        public final boolean c(a aVar, f fVar) {
            ActionMode.Callback callback = this.f12579a;
            e e10 = e(aVar);
            Menu orDefault = this.f12582d.getOrDefault(fVar, null);
            if (orDefault == null) {
                orDefault = new m.e(this.f12580b, fVar);
                this.f12582d.put(fVar, orDefault);
            }
            return callback.onPrepareActionMode(e10, orDefault);
        }

        public final boolean d(a aVar, f fVar) {
            ActionMode.Callback callback = this.f12579a;
            e e10 = e(aVar);
            Menu orDefault = this.f12582d.getOrDefault(fVar, null);
            if (orDefault == null) {
                orDefault = new m.e(this.f12580b, fVar);
                this.f12582d.put(fVar, orDefault);
            }
            return callback.onCreateActionMode(e10, orDefault);
        }

        public final e e(a aVar) {
            int size = this.f12581c.size();
            for (int i10 = 0; i10 < size; i10++) {
                e eVar = this.f12581c.get(i10);
                if (eVar != null && eVar.f12578b == aVar) {
                    return eVar;
                }
            }
            e eVar2 = new e(this.f12580b, aVar);
            this.f12581c.add(eVar2);
            return eVar2;
        }
    }

    public e(Context context, a aVar) {
        this.f12577a = context;
        this.f12578b = aVar;
    }

    public final void finish() {
        this.f12578b.c();
    }

    public final View getCustomView() {
        return this.f12578b.d();
    }

    public final Menu getMenu() {
        return new m.e(this.f12577a, this.f12578b.e());
    }

    public final MenuInflater getMenuInflater() {
        return this.f12578b.f();
    }

    public final CharSequence getSubtitle() {
        return this.f12578b.g();
    }

    public final Object getTag() {
        return this.f12578b.f12563a;
    }

    public final CharSequence getTitle() {
        return this.f12578b.h();
    }

    public final boolean getTitleOptionalHint() {
        return this.f12578b.f12564b;
    }

    public final void invalidate() {
        this.f12578b.i();
    }

    public final boolean isTitleOptional() {
        return this.f12578b.j();
    }

    public final void setCustomView(View view) {
        this.f12578b.k(view);
    }

    public final void setSubtitle(CharSequence charSequence) {
        this.f12578b.m(charSequence);
    }

    public final void setTag(Object obj) {
        this.f12578b.f12563a = obj;
    }

    public final void setTitle(CharSequence charSequence) {
        this.f12578b.o(charSequence);
    }

    public final void setTitleOptionalHint(boolean z10) {
        this.f12578b.p(z10);
    }

    public final void setSubtitle(int i10) {
        this.f12578b.l(i10);
    }

    public final void setTitle(int i10) {
        this.f12578b.n(i10);
    }
}
