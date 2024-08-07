package kl;

import java.util.concurrent.ThreadFactory;
import okhttp3.internal.Util;
import sk.j;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f20844a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f20845b;

    public /* synthetic */ a(String str, boolean z10) {
        this.f20844a = str;
        this.f20845b = z10;
    }

    public final Thread newThread(Runnable runnable) {
        String str = this.f20844a;
        boolean z10 = this.f20845b;
        byte[] bArr = Util.f22171a;
        j.f(str, "$name");
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(z10);
        return thread;
    }
}
