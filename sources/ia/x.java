package ia;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* compiled from: CrashlyticsController */
public final class x implements Callable<Void> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f11391a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ t f11392b;

    public x(t tVar, long j10) {
        this.f11392b = tVar;
        this.f11391a = j10;
    }

    public final Object call() {
        Bundle bundle = new Bundle();
        bundle.putInt("fatal", 1);
        bundle.putLong("timestamp", this.f11391a);
        this.f11392b.f11373k.c(bundle);
        return null;
    }
}
