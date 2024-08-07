package androidx.work;

import a4.b;
import android.net.Uri;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import o3.e;
import o3.r;
import o3.s;
import y3.x;

public final class WorkerParameters {

    /* renamed from: a  reason: collision with root package name */
    public UUID f3733a;

    /* renamed from: b  reason: collision with root package name */
    public c f3734b;

    /* renamed from: c  reason: collision with root package name */
    public Executor f3735c;

    /* renamed from: d  reason: collision with root package name */
    public b f3736d;

    /* renamed from: e  reason: collision with root package name */
    public s f3737e;

    /* renamed from: f  reason: collision with root package name */
    public e f3738f;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public List<String> f3739a = Collections.emptyList();

        /* renamed from: b  reason: collision with root package name */
        public List<Uri> f3740b = Collections.emptyList();
    }

    public WorkerParameters(UUID uuid, c cVar, List list, ExecutorService executorService, b bVar, r rVar, x xVar) {
        this.f3733a = uuid;
        this.f3734b = cVar;
        new HashSet(list);
        this.f3735c = executorService;
        this.f3736d = bVar;
        this.f3737e = rVar;
        this.f3738f = xVar;
    }
}
