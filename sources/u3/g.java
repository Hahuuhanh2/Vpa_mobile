package u3;

import android.os.Build;
import sk.j;
import t3.c;
import v3.f;
import x3.s;

/* compiled from: ContraintControllers.kt */
public final class g extends d<c> {

    /* renamed from: b  reason: collision with root package name */
    public final int f15089b = 7;

    static {
        j.e(o3.j.b("NetworkNotRoamingCtrlr"), "tagWithPrefix(\"NetworkNotRoamingCtrlr\")");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(f<c> fVar) {
        super(fVar);
        j.f(fVar, "tracker");
    }

    public final int a() {
        return this.f15089b;
    }

    public final boolean b(s sVar) {
        if (sVar.f17028j.f13666a == 4) {
            return true;
        }
        return false;
    }

    public final boolean c(Object obj) {
        c cVar = (c) obj;
        j.f(cVar, "value");
        if (Build.VERSION.SDK_INT < 24) {
            o3.j.a().getClass();
            if (cVar.f14805a) {
                return false;
            }
        } else if (cVar.f14805a && cVar.f14808d) {
            return false;
        }
        return true;
    }
}
