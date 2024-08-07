package m;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import com.google.android.material.progressindicator.BaseProgressIndicator;
import q1.c;
import v0.h;

/* compiled from: BaseMenuWrapper */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public Object f13020a;

    /* renamed from: b  reason: collision with root package name */
    public Object f13021b;

    /* renamed from: c  reason: collision with root package name */
    public Object f13022c;

    public /* synthetic */ b(Context context) {
        this.f13020a = context;
    }

    public abstract void c();

    public final MenuItem d(MenuItem menuItem) {
        if (!(menuItem instanceof q1.b)) {
            return menuItem;
        }
        q1.b bVar = (q1.b) menuItem;
        if (((h) this.f13021b) == null) {
            this.f13021b = new h();
        }
        MenuItem menuItem2 = (MenuItem) ((h) this.f13021b).getOrDefault(bVar, null);
        if (menuItem2 != null) {
            return menuItem2;
        }
        c cVar = new c((Context) this.f13020a, bVar);
        ((h) this.f13021b).put(bVar, cVar);
        return cVar;
    }

    public final SubMenu e(SubMenu subMenu) {
        if (!(subMenu instanceof c)) {
            return subMenu;
        }
        c cVar = (c) subMenu;
        if (((h) this.f13022c) == null) {
            this.f13022c = new h();
        }
        SubMenu subMenu2 = (SubMenu) ((h) this.f13022c).getOrDefault(cVar, null);
        if (subMenu2 != null) {
            return subMenu2;
        }
        g gVar = new g((Context) this.f13020a, cVar);
        ((h) this.f13022c).put(cVar, gVar);
        return gVar;
    }

    public abstract void f();

    public abstract void g(BaseProgressIndicator.c cVar);

    public abstract void h();

    public abstract void i();

    public abstract void j();

    public /* synthetic */ b(int i10) {
        this.f13021b = new float[(i10 * 2)];
        this.f13022c = new int[i10];
    }
}
