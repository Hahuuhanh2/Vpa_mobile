package androidx.media;

import android.os.IBinder;
import androidx.media.MediaBrowserServiceCompat;

/* compiled from: MediaBrowserServiceCompat */
public final class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat.i f2891a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat.h f2892b;

    public g(MediaBrowserServiceCompat.h hVar, MediaBrowserServiceCompat.j jVar) {
        this.f2892b = hVar;
        this.f2891a = jVar;
    }

    public final void run() {
        IBinder a10 = ((MediaBrowserServiceCompat.j) this.f2891a).a();
        MediaBrowserServiceCompat.b remove = MediaBrowserServiceCompat.this.f2851b.remove(a10);
        if (remove != null) {
            a10.unlinkToDeath(remove, 0);
        }
    }
}
