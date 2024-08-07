package ef;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.util.List;
import m3.a;
import sk.j;

/* compiled from: PagerAdapter.kt */
public final class m extends a {

    /* renamed from: t  reason: collision with root package name */
    public final List<Fragment> f9477t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(FragmentActivity fragmentActivity, List<? extends Fragment> list) {
        super(fragmentActivity.G(), fragmentActivity.f270d);
        j.f(fragmentActivity, "fragmentActivity");
        this.f9477t = list;
    }

    public final int c() {
        return this.f9477t.size();
    }

    public final long d(int i10) {
        return (long) i10;
    }

    public final Fragment v(int i10) {
        return this.f9477t.get(i10);
    }
}
