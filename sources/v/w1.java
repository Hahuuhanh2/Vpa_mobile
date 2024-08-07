package v;

import al.g0;
import android.database.sqlite.SQLiteDatabase;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.j;
import i6.a;
import java.util.List;
import java.util.Map;
import m6.k;
import m6.o;
import w.u;
import x.l;
import z0.b;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class w1 implements b.c, o.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f15906a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f15907b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f15908c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f15909d;

    public /* synthetic */ w1(Object obj, Object obj2, u uVar, Object obj3) {
        this.f15906a = obj;
        this.f15907b = obj2;
        this.f15908c = uVar;
        this.f15909d = obj3;
    }

    public final Object apply(Object obj) {
        o oVar = (o) this.f15906a;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        c6.b bVar = o.f13164f;
        oVar.getClass();
        return (a) o.K(sQLiteDatabase.rawQuery((String) this.f15907b, new String[0]), new k(2, oVar, (Map) this.f15908c, (a.C0123a) this.f15909d));
    }

    public final String e(b.a aVar) {
        boolean z10;
        String str;
        x1 x1Var = (x1) this.f15906a;
        List<DeferrableSurface> list = (List) this.f15907b;
        u uVar = (u) this.f15908c;
        l lVar = (l) this.f15909d;
        synchronized (x1Var.f15924a) {
            synchronized (x1Var.f15924a) {
                x1Var.t();
                j.b(list);
                x1Var.f15934k = list;
            }
            if (x1Var.f15932i == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            g0.E("The openCaptureSessionCompleter can only set once!", z10);
            x1Var.f15932i = aVar;
            uVar.f16253a.a(lVar);
            str = "openCaptureSession[session=" + x1Var + "]";
        }
        return str;
    }
}
