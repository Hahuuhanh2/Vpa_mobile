package c1;

import a1.g;
import d1.i;
import d1.o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: ConstraintAnchor */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public HashSet<d> f4401a = null;

    /* renamed from: b  reason: collision with root package name */
    public int f4402b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f4403c;

    /* renamed from: d  reason: collision with root package name */
    public final e f4404d;

    /* renamed from: e  reason: collision with root package name */
    public final a f4405e;

    /* renamed from: f  reason: collision with root package name */
    public d f4406f;

    /* renamed from: g  reason: collision with root package name */
    public int f4407g = 0;

    /* renamed from: h  reason: collision with root package name */
    public int f4408h = Integer.MIN_VALUE;

    /* renamed from: i  reason: collision with root package name */
    public g f4409i;

    /* compiled from: ConstraintAnchor */
    public enum a {
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public d(e eVar, a aVar) {
        this.f4404d = eVar;
        this.f4405e = aVar;
    }

    public final void a(d dVar, int i10) {
        b(dVar, i10, Integer.MIN_VALUE, false);
    }

    public final boolean b(d dVar, int i10, int i11, boolean z10) {
        if (dVar == null) {
            j();
            return true;
        } else if (!z10 && !i(dVar)) {
            return false;
        } else {
            this.f4406f = dVar;
            if (dVar.f4401a == null) {
                dVar.f4401a = new HashSet<>();
            }
            HashSet<d> hashSet = this.f4406f.f4401a;
            if (hashSet != null) {
                hashSet.add(this);
            }
            this.f4407g = i10;
            this.f4408h = i11;
            return true;
        }
    }

    public final void c(int i10, o oVar, ArrayList arrayList) {
        HashSet<d> hashSet = this.f4401a;
        if (hashSet != null) {
            Iterator<d> it = hashSet.iterator();
            while (it.hasNext()) {
                i.a(it.next().f4404d, i10, arrayList, oVar);
            }
        }
    }

    public final int d() {
        if (!this.f4403c) {
            return 0;
        }
        return this.f4402b;
    }

    public final int e() {
        d dVar;
        if (this.f4404d.f4438j0 == 8) {
            return 0;
        }
        int i10 = this.f4408h;
        if (i10 == Integer.MIN_VALUE || (dVar = this.f4406f) == null || dVar.f4404d.f4438j0 != 8) {
            return this.f4407g;
        }
        return i10;
    }

    public final d f() {
        switch (this.f4405e.ordinal()) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return this.f4404d.M;
            case 2:
                return this.f4404d.N;
            case 3:
                return this.f4404d.K;
            case 4:
                return this.f4404d.L;
            default:
                throw new AssertionError(this.f4405e.name());
        }
    }

    public final boolean g() {
        HashSet<d> hashSet = this.f4401a;
        if (hashSet == null) {
            return false;
        }
        Iterator<d> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        if (this.f4406f != null) {
            return true;
        }
        return false;
    }

    public final boolean i(d dVar) {
        boolean z10;
        boolean z11;
        a aVar = a.CENTER_Y;
        a aVar2 = a.RIGHT;
        a aVar3 = a.CENTER_X;
        a aVar4 = a.LEFT;
        a aVar5 = a.BASELINE;
        boolean z12 = false;
        if (dVar == null) {
            return false;
        }
        a aVar6 = dVar.f4405e;
        a aVar7 = this.f4405e;
        if (aVar6 != aVar7) {
            switch (aVar7.ordinal()) {
                case 0:
                case 7:
                case 8:
                    return false;
                case 1:
                case 3:
                    if (aVar6 == aVar4 || aVar6 == aVar2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!(dVar.f4404d instanceof h)) {
                        return z10;
                    }
                    if (z10 || aVar6 == aVar3) {
                        z12 = true;
                    }
                    return z12;
                case 2:
                case 4:
                    if (aVar6 == a.TOP || aVar6 == a.BOTTOM) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!(dVar.f4404d instanceof h)) {
                        return z11;
                    }
                    if (z11 || aVar6 == aVar) {
                        z12 = true;
                    }
                    return z12;
                case 5:
                    if (aVar6 == aVar4 || aVar6 == aVar2) {
                        return false;
                    }
                    return true;
                case 6:
                    if (aVar6 == aVar5 || aVar6 == aVar3 || aVar6 == aVar) {
                        return false;
                    }
                    return true;
                default:
                    throw new AssertionError(this.f4405e.name());
            }
        } else if (aVar7 != aVar5 || (dVar.f4404d.F && this.f4404d.F)) {
            return true;
        } else {
            return false;
        }
    }

    public final void j() {
        HashSet<d> hashSet;
        d dVar = this.f4406f;
        if (!(dVar == null || (hashSet = dVar.f4401a) == null)) {
            hashSet.remove(this);
            if (this.f4406f.f4401a.size() == 0) {
                this.f4406f.f4401a = null;
            }
        }
        this.f4401a = null;
        this.f4406f = null;
        this.f4407g = 0;
        this.f4408h = Integer.MIN_VALUE;
        this.f4403c = false;
        this.f4402b = 0;
    }

    public final void k() {
        g gVar = this.f4409i;
        if (gVar == null) {
            this.f4409i = new g(1);
        } else {
            gVar.i();
        }
    }

    public final void l(int i10) {
        this.f4402b = i10;
        this.f4403c = true;
    }

    public final String toString() {
        return this.f4404d.f4442l0 + ":" + this.f4405e.toString();
    }
}
