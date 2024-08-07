package wb;

import ab.c;
import android.content.Context;
import com.google.firebase.remoteconfig.internal.b;
import com.google.firebase.remoteconfig.internal.d;
import java.util.LinkedHashSet;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: ConfigRealtimeHandler */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashSet f16782a;

    /* renamed from: b  reason: collision with root package name */
    public final d f16783b;

    /* renamed from: c  reason: collision with root package name */
    public final c f16784c;

    public g(m9.d dVar, c cVar, b bVar, c cVar2, Context context, String str, com.google.firebase.remoteconfig.internal.c cVar3, ScheduledExecutorService scheduledExecutorService) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f16782a = linkedHashSet;
        this.f16783b = new d(dVar, cVar, bVar, cVar2, context, str, linkedHashSet, cVar3, scheduledExecutorService);
        this.f16784c = cVar;
    }
}
