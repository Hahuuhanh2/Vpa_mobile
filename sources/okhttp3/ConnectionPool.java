package okhttp3;

import java.util.concurrent.TimeUnit;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RealConnectionPool;
import sk.j;

/* compiled from: ConnectionPool.kt */
public final class ConnectionPool {

    /* renamed from: a  reason: collision with root package name */
    public final RealConnectionPool f21952a;

    public ConnectionPool() {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        j.f(timeUnit, "timeUnit");
        this.f21952a = new RealConnectionPool(TaskRunner.f22204i, timeUnit);
    }
}
