package android.support.v4.media;

import android.media.browse.MediaBrowser;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.d;
import java.util.List;

/* compiled from: MediaBrowserCompatApi21 */
public class e<T extends d> extends MediaBrowser.SubscriptionCallback {

    /* renamed from: a  reason: collision with root package name */
    public final T f224a;

    public e(MediaBrowserCompat.i.a aVar) {
        this.f224a = aVar;
    }

    public final void onChildrenLoaded(String str, List<MediaBrowser.MediaItem> list) {
        this.f224a.b(list);
    }

    public final void onError(String str) {
        this.f224a.a();
    }
}
