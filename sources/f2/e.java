package f2;

import f2.g;
import ik.d;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kk.c;

@kk.e(c = "androidx.datastore.core.DataMigrationInitializer$Companion", f = "DataMigrationInitializer.kt", l = {42, 57}, m = "runMigrations")
/* compiled from: DataMigrationInitializer.kt */
public final class e<T> extends c {

    /* renamed from: a  reason: collision with root package name */
    public Serializable f9780a;

    /* renamed from: b  reason: collision with root package name */
    public Iterator f9781b;

    /* renamed from: c  reason: collision with root package name */
    public /* synthetic */ Object f9782c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ g.a f9783d;

    /* renamed from: e  reason: collision with root package name */
    public int f9784e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(g.a aVar, d<? super e> dVar) {
        super(dVar);
        this.f9783d = aVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.f9782c = obj;
        this.f9784e |= Integer.MIN_VALUE;
        return g.a.a(this.f9783d, (List) null, (j) null, this);
    }
}
