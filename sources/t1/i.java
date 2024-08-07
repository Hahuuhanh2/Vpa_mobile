package t1;

import android.content.Context;
import java.util.concurrent.Callable;
import t1.k;

/* compiled from: FontRequestWorker */
public final class i implements Callable<k.a> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f14773a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f14774b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ f f14775c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f14776d;

    public i(String str, Context context, f fVar, int i10) {
        this.f14773a = str;
        this.f14774b = context;
        this.f14775c = fVar;
        this.f14776d = i10;
    }

    public final Object call() {
        try {
            return k.a(this.f14773a, this.f14774b, this.f14775c, this.f14776d);
        } catch (Throwable unused) {
            return new k.a(-3);
        }
    }
}
