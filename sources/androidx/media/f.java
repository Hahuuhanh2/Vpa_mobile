package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.media.MediaBrowserServiceCompat;

/* compiled from: MediaBrowserServiceCompat */
public final class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat.i f2886a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f2887b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f2888c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f2889d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat.h f2890e;

    public f(MediaBrowserServiceCompat.h hVar, MediaBrowserServiceCompat.j jVar, String str, int i10, int i11, Bundle bundle) {
        this.f2890e = hVar;
        this.f2886a = jVar;
        this.f2887b = str;
        this.f2888c = i10;
        this.f2889d = i11;
    }

    public final void run() {
        IBinder a10 = ((MediaBrowserServiceCompat.j) this.f2886a).a();
        MediaBrowserServiceCompat.this.f2851b.remove(a10);
        MediaBrowserServiceCompat.b bVar = new MediaBrowserServiceCompat.b(this.f2887b, this.f2888c, this.f2889d, this.f2886a);
        MediaBrowserServiceCompat.this.f2851b.put(a10, bVar);
        try {
            a10.linkToDeath(bVar, 0);
        } catch (RemoteException unused) {
        }
    }
}
