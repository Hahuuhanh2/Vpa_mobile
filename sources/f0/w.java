package f0;

import java.util.concurrent.TimeoutException;
import n0.l;
import v8.a;
import z0.b;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class w implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f9606a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b.a f9607b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f9608c;

    public /* synthetic */ w(a aVar, b.a aVar2, long j10) {
        this.f9606a = aVar;
        this.f9607b = aVar2;
        this.f9608c = j10;
    }

    public final void run() {
        a aVar = this.f9606a;
        b.a aVar2 = this.f9607b;
        long j10 = this.f9608c;
        if (!aVar.isDone()) {
            aVar2.b(new TimeoutException(l.i("Cannot complete surfaceList within ", j10)));
            aVar.cancel(true);
        }
    }
}
