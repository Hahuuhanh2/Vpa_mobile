package v;

import android.database.sqlite.SQLiteDatabase;
import androidx.camera.core.impl.g;
import c0.d1;
import c0.q0;
import c6.d;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import f6.h;
import f6.s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import m6.j;
import m6.o;
import n6.a;
import v.c0;
import z0.b;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class f0 implements b.c, a.C0164a, o.a, Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15671a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f15672b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f15673c;

    public /* synthetic */ f0(int i10, Object obj, Object obj2) {
        this.f15671a = i10;
        this.f15672b = obj;
        this.f15673c = obj2;
    }

    public final Object apply(Object obj) {
        o oVar = (o) this.f15672b;
        s sVar = (s) this.f15673c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ArrayList z10 = oVar.z(sQLiteDatabase, sVar, oVar.f13168d.c());
        for (d dVar : d.values()) {
            if (dVar != sVar.d()) {
                int c10 = oVar.f13168d.c() - z10.size();
                if (c10 <= 0) {
                    break;
                }
                z10.addAll(oVar.z(sQLiteDatabase, sVar.e(dVar), c10));
            }
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i10 = 0; i10 < z10.size(); i10++) {
            sb2.append(((j) z10.get(i10)).b());
            if (i10 < z10.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        o.K(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb2.toString(), (String[]) null, (String) null, (String) null, (String) null), new q0(hashMap, 9));
        ListIterator listIterator = z10.listIterator();
        while (listIterator.hasNext()) {
            j jVar = (j) listIterator.next();
            if (hashMap.containsKey(Long.valueOf(jVar.b()))) {
                h.a i11 = jVar.a().i();
                for (o.b bVar : (Set) hashMap.get(Long.valueOf(jVar.b()))) {
                    i11.a(bVar.f13170a, bVar.f13171b);
                }
                listIterator.set(new m6.b(jVar.b(), jVar.c(), i11.b()));
            }
        }
        return z10;
    }

    public final Object d() {
        switch (this.f15671a) {
            case 2:
                return Boolean.valueOf(((l6.j) this.f15672b).f12745c.x0((s) this.f15673c));
            default:
                ((l6.j) this.f15672b).f12745c.m((Iterable) this.f15673c);
                return null;
        }
    }

    public final String e(b.a aVar) {
        switch (this.f15671a) {
            case 0:
                ((c0.c) this.f15672b).getClass();
                ((g.a) this.f15673c).b(new h0(aVar));
                return "submitStillCapture";
            default:
                int i10 = d1.f4212m;
                ((AtomicReference) this.f15672b).set(aVar);
                return ((String) this.f15673c) + "-Surface";
        }
    }

    public final Object then(Task task) {
        int[] iArr = com.google.firebase.remoteconfig.internal.b.f7686j;
        return ((com.google.firebase.remoteconfig.internal.b) this.f15672b).b(0, task, (Map) this.f15673c);
    }
}
