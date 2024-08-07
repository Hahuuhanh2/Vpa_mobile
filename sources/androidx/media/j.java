package androidx.media;

import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.service.media.MediaBrowserService;
import android.support.v4.media.session.MediaSessionCompat;
import java.util.List;

/* compiled from: MediaBrowserServiceCompatApi21 */
public class j extends MediaBrowserService {

    /* renamed from: a  reason: collision with root package name */
    public final l f2900a;

    public j(MediaBrowserServiceCompat mediaBrowserServiceCompat, l lVar) {
        attachBaseContext(mediaBrowserServiceCompat);
        this.f2900a = lVar;
    }

    public final MediaBrowserService.BrowserRoot onGetRoot(String str, int i10, Bundle bundle) {
        Bundle bundle2;
        MediaSessionCompat.a(bundle);
        l lVar = this.f2900a;
        if (bundle == null) {
            bundle2 = null;
        } else {
            bundle2 = new Bundle(bundle);
        }
        lVar.d(str, i10, bundle2);
        return null;
    }

    public final void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result) {
        this.f2900a.c(str, new k(result));
    }
}
