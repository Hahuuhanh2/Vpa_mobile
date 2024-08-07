package y3;

import androidx.work.impl.WorkDatabase;
import java.util.concurrent.Callable;
import x3.d;
import z.j;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class h implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j f17401a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f17402b = 0;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f17403c;

    public /* synthetic */ h(j jVar, int i10) {
        this.f17401a = jVar;
        this.f17403c = i10;
    }

    public final Object call() {
        boolean z10;
        j jVar = this.f17401a;
        int i10 = this.f17402b;
        int i11 = this.f17403c;
        sk.j.f(jVar, "this$0");
        int a10 = i.a((WorkDatabase) jVar.f17753b, "next_job_scheduler_id");
        if (i10 > a10 || a10 > i11) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            ((WorkDatabase) jVar.f17753b).q().b(new d("next_job_scheduler_id", Long.valueOf((long) (i10 + 1))));
        } else {
            i10 = a10;
        }
        return Integer.valueOf(i10);
    }
}
