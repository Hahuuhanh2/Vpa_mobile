package okhttp3.internal.concurrent;

import sk.j;

/* compiled from: Task.kt */
public abstract class Task {

    /* renamed from: a  reason: collision with root package name */
    public final String f22191a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f22192b;

    /* renamed from: c  reason: collision with root package name */
    public TaskQueue f22193c;

    /* renamed from: d  reason: collision with root package name */
    public long f22194d = -1;

    public Task(String str, boolean z10) {
        j.f(str, "name");
        this.f22191a = str;
        this.f22192b = z10;
    }

    public abstract long a();

    public final String toString() {
        return this.f22191a;
    }
}
