package u3;

import android.os.Build;
import sk.j;
import t3.c;
import v3.f;
import x3.s;

/* compiled from: ContraintControllers.kt */
public final class e extends d<c> {

    /* renamed from: b  reason: collision with root package name */
    public final int f15087b = 7;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(f<c> fVar) {
        super(fVar);
        j.f(fVar, "tracker");
    }

    public final int a() {
        return this.f15087b;
    }

    public final boolean b(s sVar) {
        if (sVar.f17028j.f13666a == 2) {
            return true;
        }
        return false;
    }

    public final boolean c(Object obj) {
        c cVar = (c) obj;
        j.f(cVar, "value");
        if (Build.VERSION.SDK_INT >= 26) {
            if (!cVar.f14805a || !cVar.f14806b) {
                return true;
            }
        } else if (!cVar.f14805a) {
            return true;
        }
        return false;
    }
}
