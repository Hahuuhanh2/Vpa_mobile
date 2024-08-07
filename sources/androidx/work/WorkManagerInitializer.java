package androidx.work;

import android.content.Context;
import androidx.work.a;
import f3.b;
import java.util.Collections;
import java.util.List;
import o3.j;
import o3.p;
import p3.j0;

public final class WorkManagerInitializer implements b<p> {
    static {
        j.b("WrkMgrInitializer");
    }

    public final List<Class<? extends b<?>>> a() {
        return Collections.emptyList();
    }

    public final Object b(Context context) {
        j.a().getClass();
        j0.c(context, new a(new a.C0035a()));
        return j0.b(context);
    }
}
