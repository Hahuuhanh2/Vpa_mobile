package y3;

import a4.b;
import android.annotation.SuppressLint;
import androidx.work.impl.WorkDatabase;
import o3.e;
import o3.j;
import w3.a;
import x3.t;

/* compiled from: WorkForegroundUpdater */
public final class x implements e {

    /* renamed from: a  reason: collision with root package name */
    public final b f17435a;

    /* renamed from: b  reason: collision with root package name */
    public final a f17436b;

    /* renamed from: c  reason: collision with root package name */
    public final t f17437c;

    static {
        j.b("WMFgUpdater");
    }

    @SuppressLint({"LambdaLast"})
    public x(WorkDatabase workDatabase, a aVar, b bVar) {
        this.f17436b = aVar;
        this.f17435a = bVar;
        this.f17437c = workDatabase.u();
    }
}
