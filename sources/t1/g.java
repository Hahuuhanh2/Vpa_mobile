package t1;

import android.content.Context;
import java.util.concurrent.Callable;
import t1.k;

/* compiled from: FontRequestWorker */
public final class g implements Callable<k.a> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f14768a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f14769b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ f f14770c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f14771d;

    public g(String str, Context context, f fVar, int i10) {
        this.f14768a = str;
        this.f14769b = context;
        this.f14770c = fVar;
        this.f14771d = i10;
    }

    public final Object call() {
        return k.a(this.f14768a, this.f14769b, this.f14770c, this.f14771d);
    }
}
