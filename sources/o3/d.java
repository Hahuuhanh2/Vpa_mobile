package o3;

import android.app.Notification;

/* compiled from: ForegroundInfo */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final int f13676a;

    /* renamed from: b  reason: collision with root package name */
    public final int f13677b;

    /* renamed from: c  reason: collision with root package name */
    public final Notification f13678c;

    public d(int i10, int i11, Notification notification) {
        this.f13676a = i10;
        this.f13678c = notification;
        this.f13677b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f13676a == dVar.f13676a && this.f13677b == dVar.f13677b) {
            return this.f13678c.equals(dVar.f13678c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13678c.hashCode() + (((this.f13676a * 31) + this.f13677b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{" + "mNotificationId=" + this.f13676a + ", mForegroundServiceType=" + this.f13677b + ", mNotification=" + this.f13678c + '}';
    }
}
