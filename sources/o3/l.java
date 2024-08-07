package o3;

import android.os.Build;
import androidx.work.c;
import java.util.UUID;
import o3.q;
import sk.j;
import x3.s;

/* compiled from: OneTimeWorkRequest.kt */
public final class l extends q {

    /* compiled from: OneTimeWorkRequest.kt */
    public static final class a extends q.a<a, l> {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(a aVar) {
        super(aVar.f13699a, aVar.f13700b, aVar.f13701c);
        j.f(aVar, "builder");
    }

    public static final l a() {
        boolean z10;
        a aVar = new a();
        l lVar = new l(aVar);
        c cVar = aVar.f13700b.f17028j;
        boolean z11 = false;
        if ((Build.VERSION.SDK_INT < 24 || !cVar.a()) && !cVar.f13669d && !cVar.f13667b && !cVar.f13668c) {
            z10 = false;
        } else {
            z10 = true;
        }
        s sVar = aVar.f13700b;
        if (sVar.f17035q) {
            if (!z10) {
                if (sVar.f17025g <= 0) {
                    z11 = true;
                }
                if (!z11) {
                    throw new IllegalArgumentException("Expedited jobs cannot be delayed".toString());
                }
            } else {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints".toString());
            }
        }
        UUID randomUUID = UUID.randomUUID();
        j.e(randomUUID, "randomUUID()");
        aVar.f13699a = randomUUID;
        String uuid = randomUUID.toString();
        String str = uuid;
        j.e(uuid, "id.toString()");
        s sVar2 = aVar.f13700b;
        j.f(sVar2, "other");
        String str2 = sVar2.f17021c;
        o oVar = sVar2.f17020b;
        String str3 = sVar2.f17022d;
        c cVar2 = r10;
        c cVar3 = new c(sVar2.f17023e);
        c cVar4 = r11;
        c cVar5 = new c(sVar2.f17024f);
        long j10 = sVar2.f17025g;
        long j11 = sVar2.f17026h;
        a aVar2 = aVar;
        l lVar2 = lVar;
        long j12 = sVar2.f17027i;
        c cVar6 = r0;
        c cVar7 = new c(sVar2.f17028j);
        aVar2.f13700b = new s(str, oVar, str2, str3, cVar2, cVar4, j10, j11, j12, cVar6, sVar2.f17029k, sVar2.f17030l, sVar2.f17031m, sVar2.f17032n, sVar2.f17033o, sVar2.f17034p, sVar2.f17035q, sVar2.f17036r, sVar2.f17037s, sVar2.f17039u, sVar2.f17040v, sVar2.f17041w, 524288);
        return lVar2;
    }
}
