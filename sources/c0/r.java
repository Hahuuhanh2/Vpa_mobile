package c0;

import android.animation.Animator;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.SystemClock;
import android.view.Surface;
import androidx.camera.view.f;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.l0;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException;
import e0.b0;
import f6.s;
import i6.c;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import l6.j;
import m6.o;
import n6.a;
import s1.e;
import xb.y;
import z0.b;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class r implements b.c, e.b, a.C0164a, o.a, Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4317a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f4318b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f4319c;

    public /* synthetic */ r(int i10, Object obj, Object obj2) {
        this.f4317a = i10;
        this.f4318b = obj;
        this.f4319c = obj2;
    }

    public /* synthetic */ r(Context context, y yVar) {
        this.f4317a = 8;
        this.f4319c = context;
        this.f4318b = yVar;
    }

    public final Object apply(Object obj) {
        o oVar = (o) this.f4318b;
        c6.b bVar = o.f13164f;
        oVar.getClass();
        Long v2 = o.v((SQLiteDatabase) obj, (s) this.f4319c);
        if (v2 == null) {
            return Boolean.FALSE;
        }
        return (Boolean) o.K(oVar.s().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{v2.toString()}), new i0(5));
    }

    public final Object d() {
        j jVar = (j) this.f4318b;
        jVar.getClass();
        for (Map.Entry entry : ((Map) this.f4319c).entrySet()) {
            jVar.f12751i.d((long) ((Integer) entry.getValue()).intValue(), c.a.INVALID_PAYLOD, (String) entry.getKey());
        }
        return null;
    }

    public final String e(b.a aVar) {
        switch (this.f4317a) {
            case 0:
                u uVar = (u) this.f4318b;
                Executor executor = uVar.f4349d;
                executor.execute(new s(uVar, (Context) this.f4319c, executor, aVar, SystemClock.elapsedRealtime()));
                return "CameraX initInternal";
            case 1:
                int i10 = d1.f4212m;
                ((AtomicReference) this.f4318b).set(aVar);
                return ((String) this.f4319c) + "-status";
            case 2:
                android.support.v4.media.a.s(this.f4318b);
                throw null;
            default:
                f fVar = (f) this.f4318b;
                Surface surface = (Surface) this.f4319c;
                fVar.getClass();
                p0.a("TextureViewImpl");
                fVar.f1515h.a(surface, j7.a.x(), new b0(aVar, 1));
                return "provideSurface[request=" + fVar.f1515h + " surface=" + surface + "]";
        }
    }

    public final void onCancel() {
        l0.b bVar = (l0.b) this.f4319c;
        sk.j.f(bVar, "$operation");
        ((Animator) this.f4318b).end();
        if (FragmentManager.J(2)) {
            bVar.toString();
        }
    }

    public final Object then(Task task) {
        com.google.firebase.remoteconfig.internal.b bVar = (com.google.firebase.remoteconfig.internal.b) this.f4318b;
        Date date = (Date) this.f4319c;
        int[] iArr = com.google.firebase.remoteconfig.internal.b.f7686j;
        bVar.getClass();
        if (task.isSuccessful()) {
            com.google.firebase.remoteconfig.internal.c cVar = bVar.f7693g;
            synchronized (cVar.f7701b) {
                cVar.f7700a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
            }
        } else {
            Exception exception = task.getException();
            if (exception != null) {
                if (exception instanceof FirebaseRemoteConfigFetchThrottledException) {
                    com.google.firebase.remoteconfig.internal.c cVar2 = bVar.f7693g;
                    synchronized (cVar2.f7701b) {
                        cVar2.f7700a.edit().putInt("last_fetch_status", 2).apply();
                    }
                } else {
                    com.google.firebase.remoteconfig.internal.c cVar3 = bVar.f7693g;
                    synchronized (cVar3.f7701b) {
                        cVar3.f7700a.edit().putInt("last_fetch_status", 1).apply();
                    }
                }
            }
        }
        return task;
    }
}
