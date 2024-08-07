package wb;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.internal.b;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import vb.c;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ com.google.firebase.remoteconfig.internal.a f16750a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Task f16751b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Task f16752c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ long f16753d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f16754e;

    public /* synthetic */ a(com.google.firebase.remoteconfig.internal.a aVar, Task task, Task task2, long j10, int i10) {
        this.f16750a = aVar;
        this.f16751b = task;
        this.f16752c = task2;
        this.f16753d = j10;
        this.f16754e = i10;
    }

    public final Object then(Task task) {
        Boolean bool;
        com.google.firebase.remoteconfig.internal.a aVar = this.f16750a;
        Task task2 = this.f16751b;
        Task task3 = this.f16752c;
        long j10 = this.f16753d;
        int i10 = this.f16754e;
        aVar.getClass();
        if (!task2.isSuccessful()) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Failed to auto-fetch config update.", task2.getException()));
        }
        if (!task3.isSuccessful()) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Failed to get activated config for auto-fetch", task3.getException()));
        }
        b.a aVar2 = (b.a) task2.getResult();
        d dVar = (d) task3.getResult();
        d dVar2 = aVar2.f7696b;
        boolean z10 = false;
        if (dVar2 != null) {
            if (dVar2.f16770f >= j10) {
                z10 = true;
            }
            bool = Boolean.valueOf(z10);
        } else {
            if (aVar2.f7695a == 1) {
                z10 = true;
            }
            bool = Boolean.valueOf(z10);
        }
        if (!bool.booleanValue()) {
            aVar.a(i10, j10);
            return Tasks.forResult(null);
        } else if (aVar2.f7696b == null) {
            return Tasks.forResult(null);
        } else {
            if (dVar == null) {
                Date date = d.f16764g;
                dVar = new d(new JSONObject(), d.f16764g, new JSONArray(), new JSONObject(), 0);
            }
            d dVar3 = aVar2.f7696b;
            JSONObject jSONObject = d.a(new JSONObject(dVar3.f16765a.toString())).f16766b;
            HashSet hashSet = new HashSet();
            Iterator<String> keys = dVar.f16766b.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!dVar3.f16766b.has(next)) {
                    hashSet.add(next);
                } else if (!dVar.f16766b.get(next).equals(dVar3.f16766b.get(next))) {
                    hashSet.add(next);
                } else if ((dVar.f16769e.has(next) && !dVar3.f16769e.has(next)) || (!dVar.f16769e.has(next) && dVar3.f16769e.has(next))) {
                    hashSet.add(next);
                } else if (!dVar.f16769e.has(next) || !dVar3.f16769e.has(next) || dVar.f16769e.getJSONObject(next).toString().equals(dVar3.f16769e.getJSONObject(next).toString())) {
                    jSONObject.remove(next);
                } else {
                    hashSet.add(next);
                }
            }
            Iterator<String> keys2 = jSONObject.keys();
            while (keys2.hasNext()) {
                hashSet.add(keys2.next());
            }
            if (hashSet.isEmpty()) {
                return Tasks.forResult(null);
            }
            new vb.a(hashSet);
            synchronized (aVar) {
                for (c a10 : aVar.f7675a) {
                    a10.a();
                }
            }
            return Tasks.forResult(null);
        }
    }
}
