package lf;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.w;
import ef.g;
import java.util.ArrayList;
import m3.a;

/* compiled from: ViewPagerAdapter.kt */
public final class j extends a {

    /* renamed from: t  reason: collision with root package name */
    public final ArrayList<Fragment> f13002t = new ArrayList<>();

    /* renamed from: u  reason: collision with root package name */
    public final ArrayList<String> f13003u = new ArrayList<>();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(w wVar, FragmentActivity fragmentActivity) {
        super(wVar, fragmentActivity.f270d);
        sk.j.f(fragmentActivity, "fragmentActivity");
    }

    public final void A(g gVar, String str) {
        this.f13002t.add(gVar);
        this.f13003u.add(str);
    }

    public final int c() {
        return this.f13002t.size();
    }

    public final Fragment v(int i10) {
        Fragment fragment = this.f13002t.get(i10);
        sk.j.e(fragment, "get(...)");
        return fragment;
    }
}
