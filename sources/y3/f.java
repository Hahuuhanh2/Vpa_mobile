package y3;

import android.os.Build;
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import f0.b0;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import o3.q;
import p3.x;
import sk.j;
import v.v;

/* compiled from: EnqueueUtils.kt */
public final class f {
    public static final void a(WorkDatabase workDatabase, a aVar, x xVar) {
        int i10;
        j.f(aVar, "configuration");
        j.f(xVar, "continuation");
        if (Build.VERSION.SDK_INT >= 24) {
            ArrayList g02 = j7.a.g0(xVar);
            int i11 = 0;
            while (!g02.isEmpty()) {
                if (!g02.isEmpty()) {
                    x xVar2 = (x) g02.remove(j7.a.I(g02));
                    List<? extends q> list = xVar2.f14032e;
                    j.e(list, "current.work");
                    if (list.isEmpty()) {
                        i10 = 0;
                    } else {
                        i10 = 0;
                        for (q qVar : list) {
                            if (qVar.f13697b.f17028j.a() && (i10 = i10 + 1) < 0) {
                                throw new ArithmeticException("Count overflow has happened.");
                            }
                        }
                    }
                    i11 += i10;
                    List<x> list2 = xVar2.f14035o;
                    if (list2 != null) {
                        g02.addAll(list2);
                    }
                } else {
                    throw new NoSuchElementException("List is empty.");
                }
            }
            if (i11 != 0) {
                int y10 = workDatabase.u().y();
                int i12 = aVar.f3749i;
                if (y10 + i11 > i12) {
                    throw new IllegalArgumentException(v.e(b0.u("Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: ", i12, ";\nalready enqueued count: ", y10, ";\ncurrent enqueue operation count: "), i11, ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed."));
                }
            }
        }
    }
}
