package u3;

import android.os.Build;
import sk.j;
import t3.c;
import v3.f;
import x3.s;

/* compiled from: ContraintControllers.kt */
public final class h extends d<c> {

    /* renamed from: b  reason: collision with root package name */
    public final int f15090b = 7;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(f<c> fVar) {
        super(fVar);
        j.f(fVar, "tracker");
    }

    public final int a() {
        return this.f15090b;
    }

    public final boolean b(s sVar) {
        int i10 = sVar.f17028j.f13666a;
        if (i10 == 3 || (Build.VERSION.SDK_INT >= 30 && i10 == 6)) {
            return true;
        }
        return false;
    }

    public final boolean c(Object obj) {
        c cVar = (c) obj;
        j.f(cVar, "value");
        if (!cVar.f14805a || cVar.f14807c) {
            return true;
        }
        return false;
    }
}
