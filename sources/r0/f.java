package r0;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import androidx.camera.view.PreviewView;
import androidx.camera.view.c;
import c0.q0;
import c6.b;
import ck.a;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.a;
import f0.g0;
import f0.r;
import fb.q;
import i0.d;
import java.util.concurrent.atomic.AtomicReference;
import m6.o;
import org.json.JSONException;
import org.json.JSONObject;
import sk.j;
import t5.b;
import tj.a;
import v.n;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class f implements c.a, a, o.a, SuccessContinuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f14461a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f14462b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f14463c;

    public /* synthetic */ f(Object obj, Object obj2, Object obj3) {
        this.f14461a = obj;
        this.f14462b = obj2;
        this.f14463c = obj3;
    }

    public final void a() {
        boolean z10;
        androidx.camera.view.a aVar = (androidx.camera.view.a) this.f14462b;
        r rVar = (r) this.f14463c;
        AtomicReference<androidx.camera.view.a> atomicReference = PreviewView.this.f1459f;
        while (true) {
            if (!atomicReference.compareAndSet(aVar, (Object) null)) {
                if (atomicReference.get() != aVar) {
                    z10 = false;
                    break;
                }
            } else {
                z10 = true;
                break;
            }
        }
        if (z10) {
            aVar.a(PreviewView.g.IDLE);
        }
        d dVar = aVar.f1485e;
        if (dVar != null) {
            dVar.cancel(false);
            aVar.f1485e = null;
        }
        g0 g0Var = (g0) rVar.g();
        synchronized (g0Var.f9534b) {
            g0.a aVar2 = (g0.a) g0Var.f9534b.remove(aVar);
            if (aVar2 != null) {
                aVar2.f9535a.set(false);
                j7.a.f0().execute(new n(13, g0Var, aVar2));
            }
        }
    }

    public final Object apply(Object obj) {
        o oVar = (o) this.f14461a;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        b bVar = o.f13164f;
        oVar.getClass();
        sQLiteDatabase.compileStatement((String) this.f14462b).execute();
        o.K(sQLiteDatabase.rawQuery((String) this.f14463c, (String[]) null), new q0(oVar, 10));
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    public final void run() {
        boolean z10;
        t5.b bVar = (t5.b) this.f14462b;
        b.a aVar = (b.a) this.f14463c;
        j.f(bVar, "$this_observe");
        j.f(aVar, "$listener");
        if (((a.C0258a[]) ((ck.a) this.f14461a).f19203a.get()).length != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            bVar.b(aVar);
        }
    }

    public final Task then(Object obj) {
        com.google.firebase.messaging.a aVar;
        String str;
        String str2;
        String str3;
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f14461a;
        String str4 = (String) this.f14462b;
        a.C0070a aVar2 = (a.C0070a) this.f14463c;
        String str5 = (String) obj;
        Context context = firebaseMessaging.f7589d;
        synchronized (FirebaseMessaging.class) {
            if (FirebaseMessaging.f7583m == null) {
                FirebaseMessaging.f7583m = new com.google.firebase.messaging.a(context);
            }
            aVar = FirebaseMessaging.f7583m;
        }
        m9.d dVar = firebaseMessaging.f7586a;
        dVar.a();
        if ("[DEFAULT]".equals(dVar.f13219b)) {
            str = "";
        } else {
            str = firebaseMessaging.f7586a.f();
        }
        q qVar = firebaseMessaging.f7595j;
        synchronized (qVar) {
            if (qVar.f10159b == null) {
                qVar.c();
            }
            str2 = qVar.f10159b;
        }
        synchronized (aVar) {
            long currentTimeMillis = System.currentTimeMillis();
            int i10 = a.C0070a.f7610e;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str5);
                jSONObject.put("appVersion", str2);
                jSONObject.put("timestamp", currentTimeMillis);
                str3 = jSONObject.toString();
            } catch (JSONException e10) {
                e10.toString();
                str3 = null;
            }
            if (str3 != null) {
                SharedPreferences.Editor edit = aVar.f7608a.edit();
                edit.putString(com.google.firebase.messaging.a.a(str, str4), str3);
                edit.commit();
            }
        }
        if (aVar2 == null || !str5.equals(aVar2.f7611a)) {
            m9.d dVar2 = firebaseMessaging.f7586a;
            dVar2.a();
            if ("[DEFAULT]".equals(dVar2.f13219b)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    firebaseMessaging.f7586a.a();
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", str5);
                new fb.j(firebaseMessaging.f7589d).b(intent);
            }
        }
        return Tasks.forResult(str5);
    }
}
