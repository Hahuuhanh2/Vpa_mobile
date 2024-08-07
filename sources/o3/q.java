package o3;

import al.g0;
import androidx.work.c;
import androidx.work.impl.workers.DiagnosticsWorker;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;
import sk.j;
import x3.s;

/* compiled from: WorkRequest.kt */
public abstract class q {

    /* renamed from: a  reason: collision with root package name */
    public final UUID f13696a;

    /* renamed from: b  reason: collision with root package name */
    public final s f13697b;

    /* renamed from: c  reason: collision with root package name */
    public final Set<String> f13698c;

    /* compiled from: WorkRequest.kt */
    public static abstract class a<B extends a<B, ?>, W extends q> {

        /* renamed from: a  reason: collision with root package name */
        public UUID f13699a;

        /* renamed from: b  reason: collision with root package name */
        public s f13700b;

        /* renamed from: c  reason: collision with root package name */
        public final LinkedHashSet f13701c;

        public a() {
            Class<DiagnosticsWorker> cls = DiagnosticsWorker.class;
            UUID randomUUID = UUID.randomUUID();
            j.e(randomUUID, "randomUUID()");
            this.f13699a = randomUUID;
            String uuid = this.f13699a.toString();
            j.e(uuid, "id.toString()");
            this.f13700b = new s(uuid, (o) null, cls.getName(), (String) null, (c) null, (c) null, 0, 0, 0, (c) null, 0, 0, 0, 0, 0, 0, false, 0, 0, 0, 0, 0, 8388602);
            String[] strArr = {cls.getName()};
            LinkedHashSet linkedHashSet = new LinkedHashSet(g0.d0(1));
            for (int i10 = 0; i10 < 1; i10++) {
                linkedHashSet.add(strArr[i10]);
            }
            this.f13701c = linkedHashSet;
        }
    }

    public q(UUID uuid, s sVar, LinkedHashSet linkedHashSet) {
        j.f(uuid, "id");
        j.f(sVar, "workSpec");
        j.f(linkedHashSet, "tags");
        this.f13696a = uuid;
        this.f13697b = sVar;
        this.f13698c = linkedHashSet;
    }
}
