package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: SubMenuBuilder */
public class m extends f implements SubMenu {
    public h A;

    /* renamed from: z  reason: collision with root package name */
    public f f702z;

    public m(Context context, f fVar, h hVar) {
        super(context);
        this.f702z = fVar;
        this.A = hVar;
    }

    public final boolean d(h hVar) {
        return this.f702z.d(hVar);
    }

    public final boolean e(f fVar, MenuItem menuItem) {
        if (super.e(fVar, menuItem) || this.f702z.e(fVar, menuItem)) {
            return true;
        }
        return false;
    }

    public final boolean f(h hVar) {
        return this.f702z.f(hVar);
    }

    public final MenuItem getItem() {
        return this.A;
    }

    public final String j() {
        int i10;
        h hVar = this.A;
        if (hVar != null) {
            i10 = hVar.f642a;
        } else {
            i10 = 0;
        }
        if (i10 == 0) {
            return null;
        }
        return "android:menu:actionviewstates" + ":" + i10;
    }

    public final f k() {
        return this.f702z.k();
    }

    public final boolean m() {
        return this.f702z.m();
    }

    public final boolean n() {
        return this.f702z.n();
    }

    public final boolean o() {
        return this.f702z.o();
    }

    public final void setGroupDividerEnabled(boolean z10) {
        this.f702z.setGroupDividerEnabled(z10);
    }

    public final SubMenu setHeaderIcon(Drawable drawable) {
        w(0, (CharSequence) null, 0, drawable, (View) null);
        return this;
    }

    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        w(0, charSequence, 0, (Drawable) null, (View) null);
        return this;
    }

    public final SubMenu setHeaderView(View view) {
        w(0, (CharSequence) null, 0, (Drawable) null, view);
        return this;
    }

    public final SubMenu setIcon(Drawable drawable) {
        this.A.setIcon(drawable);
        return this;
    }

    public final void setQwertyMode(boolean z10) {
        this.f702z.setQwertyMode(z10);
    }

    public final SubMenu setHeaderIcon(int i10) {
        w(0, (CharSequence) null, i10, (Drawable) null, (View) null);
        return this;
    }

    public final SubMenu setHeaderTitle(int i10) {
        w(i10, (CharSequence) null, 0, (Drawable) null, (View) null);
        return this;
    }

    public final SubMenu setIcon(int i10) {
        this.A.setIcon(i10);
        return this;
    }
}
