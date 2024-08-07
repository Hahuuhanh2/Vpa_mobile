package f;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import androidx.lifecycle.i;
import androidx.lifecycle.n;
import androidx.lifecycle.o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import r2.l;
import tk.c;

/* compiled from: ActivityResultRegistry */
public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f9503a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f9504b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f9505c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public ArrayList<String> f9506d = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    public final transient HashMap f9507e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    public final HashMap f9508f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    public final Bundle f9509g = new Bundle();

    /* compiled from: ActivityResultRegistry */
    public static class a<O> {

        /* renamed from: a  reason: collision with root package name */
        public final a<O> f9510a;

        /* renamed from: b  reason: collision with root package name */
        public final g.a<?, O> f9511b;

        public a(a<O> aVar, g.a<?, O> aVar2) {
            this.f9510a = aVar;
            this.f9511b = aVar2;
        }
    }

    /* compiled from: ActivityResultRegistry */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final i f9512a;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList<n> f9513b = new ArrayList<>();

        public b(i iVar) {
            this.f9512a = iVar;
        }
    }

    public final boolean a(int i10, int i11, Intent intent) {
        String str = (String) this.f9503a.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        a aVar = (a) this.f9507e.get(str);
        if (aVar == null || aVar.f9510a == null || !this.f9506d.contains(str)) {
            this.f9508f.remove(str);
            this.f9509g.putParcelable(str, new ActivityResult(intent, i11));
            return true;
        }
        aVar.f9510a.b(aVar.f9511b.c(intent, i11));
        this.f9506d.remove(str);
        return true;
    }

    public abstract void b(int i10, g.a aVar, @SuppressLint({"UnknownNullness"}) Object obj);

    public final d c(String str, l lVar, g.a aVar, a aVar2) {
        boolean z10;
        o B = lVar.B();
        if (B.f2785d.compareTo(i.b.STARTED) >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            e(str);
            b bVar = (b) this.f9505c.get(str);
            if (bVar == null) {
                bVar = new b(B);
            }
            c cVar = new c(this, str, aVar2, aVar);
            bVar.f9512a.a(cVar);
            bVar.f9513b.add(cVar);
            this.f9505c.put(str, bVar);
            return new d(this, str, aVar);
        }
        throw new IllegalStateException("LifecycleOwner " + lVar + " is attempting to register while current state is " + B.f2785d + ". LifecycleOwners must call register before they are STARTED.");
    }

    public final e d(String str, g.a aVar, a aVar2) {
        e(str);
        this.f9507e.put(str, new a(aVar2, aVar));
        if (this.f9508f.containsKey(str)) {
            Object obj = this.f9508f.get(str);
            this.f9508f.remove(str);
            aVar2.b(obj);
        }
        ActivityResult activityResult = (ActivityResult) this.f9509g.getParcelable(str);
        if (activityResult != null) {
            this.f9509g.remove(str);
            aVar2.b(aVar.c(activityResult.f304b, activityResult.f303a));
        }
        return new e(this, str, aVar);
    }

    public final void e(String str) {
        if (((Integer) this.f9504b.get(str)) == null) {
            c.f23024a.getClass();
            int nextInt = c.f23025b.d().nextInt(2147418112);
            while (true) {
                int i10 = nextInt + 65536;
                if (this.f9503a.containsKey(Integer.valueOf(i10))) {
                    c.f23024a.getClass();
                    nextInt = c.f23025b.d().nextInt(2147418112);
                } else {
                    this.f9503a.put(Integer.valueOf(i10), str);
                    this.f9504b.put(str, Integer.valueOf(i10));
                    return;
                }
            }
        }
    }

    public final void f(String str) {
        Integer num;
        if (!this.f9506d.contains(str) && (num = (Integer) this.f9504b.remove(str)) != null) {
            this.f9503a.remove(num);
        }
        this.f9507e.remove(str);
        if (this.f9508f.containsKey(str)) {
            Objects.toString(this.f9508f.get(str));
            this.f9508f.remove(str);
        }
        if (this.f9509g.containsKey(str)) {
            Objects.toString(this.f9509g.getParcelable(str));
            this.f9509g.remove(str);
        }
        b bVar = (b) this.f9505c.get(str);
        if (bVar != null) {
            Iterator<n> it = bVar.f9513b.iterator();
            while (it.hasNext()) {
                bVar.f9512a.c(it.next());
            }
            bVar.f9513b.clear();
            this.f9505c.remove(str);
        }
    }
}
