package androidx.media;

import android.media.browse.MediaBrowser;
import android.service.media.MediaBrowserService;

/* compiled from: MediaBrowserServiceCompatApi23 */
public class m extends j {
    public m(MediaBrowserServiceCompat mediaBrowserServiceCompat, n nVar) {
        super(mediaBrowserServiceCompat, nVar);
    }

    public final void onLoadItem(String str, MediaBrowserService.Result<MediaBrowser.MediaItem> result) {
        ((n) this.f2900a).e(new k(result));
    }
}
