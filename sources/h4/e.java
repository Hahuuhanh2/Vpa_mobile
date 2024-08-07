package h4;

import e4.a;
import e4.i;
import java.util.ArrayList;
import java.util.List;

/* compiled from: AnimatablePathValue */
public final class e implements h {

    /* renamed from: a  reason: collision with root package name */
    public final List f10547a;

    public /* synthetic */ e() {
        this.f10547a = new ArrayList();
    }

    public final a a() {
        if (((o4.a) this.f10547a.get(0)).c()) {
            return new e4.e(1, this.f10547a);
        }
        return new i(this.f10547a);
    }

    public final List b() {
        return this.f10547a;
    }

    public final boolean c() {
        if (this.f10547a.size() != 1 || !((o4.a) this.f10547a.get(0)).c()) {
            return false;
        }
        return true;
    }

    public /* synthetic */ e(ArrayList arrayList) {
        this.f10547a = arrayList;
    }
}
