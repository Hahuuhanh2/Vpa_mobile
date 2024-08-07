package androidx.media;

import androidx.media.MediaBrowserServiceCompat;

/* compiled from: MediaBrowserServiceCompat */
public final class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat.i f2872a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat.h f2873b;

    public b(MediaBrowserServiceCompat.h hVar, MediaBrowserServiceCompat.j jVar) {
        this.f2873b = hVar;
        this.f2872a = jVar;
    }

    public final void run() {
        MediaBrowserServiceCompat.b remove = MediaBrowserServiceCompat.this.f2851b.remove(((MediaBrowserServiceCompat.j) this.f2872a).a());
        if (remove != null) {
            ((MediaBrowserServiceCompat.j) remove.f2854b).a().unlinkToDeath(remove, 0);
        }
    }
}
