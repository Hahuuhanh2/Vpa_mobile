package android.support.v4.media;

import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.f;
import android.support.v4.media.session.MediaSessionCompat;
import java.util.List;

/* compiled from: MediaBrowserCompatApi26 */
public final class g<T extends f> extends e<T> {
    public g(MediaBrowserCompat.i.b bVar) {
        super(bVar);
    }

    public final void onChildrenLoaded(String str, List<MediaBrowser.MediaItem> list, Bundle bundle) {
        MediaSessionCompat.a(bundle);
        ((f) this.f224a).c(list);
    }

    public final void onError(String str, Bundle bundle) {
        MediaSessionCompat.a(bundle);
        ((f) this.f224a).d();
    }
}
