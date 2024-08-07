package f0;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: AutoValue_CameraThreadConfig */
public final class a extends u {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f9514a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f9515b;

    public a(Executor executor, Handler handler) {
        if (executor != null) {
            this.f9514a = executor;
            if (handler != null) {
                this.f9515b = handler;
                return;
            }
            throw new NullPointerException("Null schedulerHandler");
        }
        throw new NullPointerException("Null cameraExecutor");
    }

    public final Executor a() {
        return this.f9514a;
    }

    public final Handler b() {
        return this.f9515b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (!this.f9514a.equals(uVar.a()) || !this.f9515b.equals(uVar.b())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f9514a.hashCode() ^ 1000003) * 1000003) ^ this.f9515b.hashCode();
    }

    public final String toString() {
        StringBuilder q10 = android.support.v4.media.a.q("CameraThreadConfig{cameraExecutor=");
        q10.append(this.f9514a);
        q10.append(", schedulerHandler=");
        q10.append(this.f9515b);
        q10.append("}");
        return q10.toString();
    }
}
