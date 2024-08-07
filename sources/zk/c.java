package zk;

import java.util.concurrent.TimeUnit;
import p3.l0;

/* compiled from: DurationUnitJvm.kt */
public enum c {
    NANOSECONDS(TimeUnit.NANOSECONDS),
    MILLISECONDS(TimeUnit.MILLISECONDS),
    SECONDS(TimeUnit.SECONDS),
    MINUTES(TimeUnit.MINUTES),
    HOURS(TimeUnit.HOURS),
    DAYS(TimeUnit.DAYS);
    

    /* renamed from: a  reason: collision with root package name */
    public final TimeUnit f23795a;

    /* access modifiers changed from: public */
    static {
        c[] cVarArr;
        l0.K(cVarArr);
    }

    /* access modifiers changed from: public */
    c(TimeUnit timeUnit) {
        this.f23795a = timeUnit;
    }
}
