package m;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import q1.c;

/* compiled from: SubMenuWrapperICS */
public final class g extends e implements SubMenu {

    /* renamed from: e  reason: collision with root package name */
    public final c f13035e;

    public g(Context context, c cVar) {
        super(context, cVar);
        this.f13035e = cVar;
    }

    public final void clearHeader() {
        this.f13035e.clearHeader();
    }

    public final MenuItem getItem() {
        return d(this.f13035e.getItem());
    }

    public final SubMenu setHeaderIcon(int i10) {
        this.f13035e.setHeaderIcon(i10);
        return this;
    }

    public final SubMenu setHeaderTitle(int i10) {
        this.f13035e.setHeaderTitle(i10);
        return this;
    }

    public final SubMenu setHeaderView(View view) {
        this.f13035e.setHeaderView(view);
        return this;
    }

    public final SubMenu setIcon(int i10) {
        this.f13035e.setIcon(i10);
        return this;
    }

    public final SubMenu setHeaderIcon(Drawable drawable) {
        this.f13035e.setHeaderIcon(drawable);
        return this;
    }

    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f13035e.setHeaderTitle(charSequence);
        return this;
    }

    public final SubMenu setIcon(Drawable drawable) {
        this.f13035e.setIcon(drawable);
        return this;
    }
}
