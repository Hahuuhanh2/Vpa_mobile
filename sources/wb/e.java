package wb;

import ab.f;
import c0.q0;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.internal.b;
import java.util.Date;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class e implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f16771a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Task f16772b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Task f16773c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Date f16774d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Map f16775e;

    public /* synthetic */ e(b bVar, Task task, Task task2, Date date, Map map) {
        this.f16771a = bVar;
        this.f16772b = task;
        this.f16773c = task2;
        this.f16774d = date;
        this.f16775e = map;
    }

    public final Object then(Task task) {
        b bVar = this.f16771a;
        Task task2 = this.f16772b;
        Task task3 = this.f16773c;
        Date date = this.f16774d;
        Map map = this.f16775e;
        bVar.getClass();
        if (!task2.isSuccessful()) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation ID for fetch.", task2.getException()));
        }
        if (!task3.isSuccessful()) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation auth token for fetch.", task3.getException()));
        }
        try {
            b.a a10 = bVar.a((String) task2.getResult(), ((f) task3.getResult()).a(), date, map);
            if (a10.f7695a != 0) {
                return Tasks.forResult(a10);
            }
            return bVar.f7691e.c(a10.f7696b).onSuccessTask(bVar.f7689c, new q0(a10, 15));
        } catch (FirebaseRemoteConfigException e10) {
            return Tasks.forException(e10);
        }
    }
}
