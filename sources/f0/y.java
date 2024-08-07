package f0;

import android.view.Surface;
import i0.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import z0.b;

/* compiled from: DeferrableSurfaces */
public final class y implements c<List<Surface>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f9614a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b.a f9615b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ScheduledFuture f9616c;

    public y(boolean z10, b.a aVar, ScheduledFuture scheduledFuture) {
        this.f9614a = z10;
        this.f9615b = aVar;
        this.f9616c = scheduledFuture;
    }

    public final void a(Throwable th2) {
        this.f9615b.a(Collections.unmodifiableList(Collections.emptyList()));
        this.f9616c.cancel(true);
    }

    public final void onSuccess(Object obj) {
        ArrayList arrayList = new ArrayList((List) obj);
        if (this.f9614a) {
            arrayList.removeAll(Collections.singleton((Object) null));
        }
        this.f9615b.a(arrayList);
        this.f9616c.cancel(true);
    }
}
