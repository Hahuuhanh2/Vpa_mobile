package d4;

import android.graphics.Path;
import com.airbnb.lottie.c0;
import e4.a;
import e4.k;
import i4.o;
import j4.b;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ShapeContent */
public final class r implements m, a.C0097a {

    /* renamed from: a  reason: collision with root package name */
    public final Path f8725a = new Path();

    /* renamed from: b  reason: collision with root package name */
    public final boolean f8726b;

    /* renamed from: c  reason: collision with root package name */
    public final c0 f8727c;

    /* renamed from: d  reason: collision with root package name */
    public final k f8728d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f8729e;

    /* renamed from: f  reason: collision with root package name */
    public final b f8730f = new b();

    public r(c0 c0Var, b bVar, o oVar) {
        oVar.getClass();
        this.f8726b = oVar.f11144d;
        this.f8727c = c0Var;
        k kVar = new k((List) oVar.f11143c.f10560b);
        this.f8728d = kVar;
        bVar.e(kVar);
        kVar.a(this);
    }

    public final void a() {
        this.f8729e = false;
        this.f8727c.invalidateSelf();
    }

    public final void b(List<c> list, List<c> list2) {
        ArrayList arrayList = null;
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = (ArrayList) list;
            if (i10 < arrayList2.size()) {
                c cVar = (c) arrayList2.get(i10);
                if (cVar instanceof u) {
                    u uVar = (u) cVar;
                    if (uVar.f8738c == 1) {
                        this.f8730f.f8618a.add(uVar);
                        uVar.e(this);
                        i10++;
                    }
                }
                if (cVar instanceof s) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((s) cVar);
                }
                i10++;
            } else {
                this.f8728d.f9127k = arrayList;
                return;
            }
        }
    }

    public final Path g() {
        if (this.f8729e) {
            return this.f8725a;
        }
        this.f8725a.reset();
        if (this.f8726b) {
            this.f8729e = true;
            return this.f8725a;
        }
        Path path = (Path) this.f8728d.f();
        if (path == null) {
            return this.f8725a;
        }
        this.f8725a.set(path);
        this.f8725a.setFillType(Path.FillType.EVEN_ODD);
        this.f8730f.a(this.f8725a);
        this.f8729e = true;
        return this.f8725a;
    }
}
