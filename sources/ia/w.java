package ia;

import java.util.concurrent.Callable;

/* compiled from: CrashlyticsController */
public final class w implements Callable<Void> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f11389a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ t f11390b;

    public w(t tVar, String str) {
        this.f11390b = tVar;
        this.f11389a = str;
    }

    public final Object call() {
        t.a(this.f11390b, this.f11389a);
        return null;
    }
}
