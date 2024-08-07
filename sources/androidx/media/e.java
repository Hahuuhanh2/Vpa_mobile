package androidx.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.os.ResultReceiver;
import androidx.media.MediaBrowserServiceCompat;

/* compiled from: MediaBrowserServiceCompat */
public final class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat.i f2883a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ResultReceiver f2884b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat.h f2885c;

    public e(MediaBrowserServiceCompat.h hVar, MediaBrowserServiceCompat.j jVar, String str, ResultReceiver resultReceiver) {
        this.f2885c = hVar;
        this.f2883a = jVar;
        this.f2884b = resultReceiver;
    }

    public final void run() {
        if (MediaBrowserServiceCompat.this.f2851b.getOrDefault(((MediaBrowserServiceCompat.j) this.f2883a).a(), null) != null) {
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            ResultReceiver resultReceiver = this.f2884b;
            mediaBrowserServiceCompat.getClass();
            if (true && true) {
                resultReceiver.d(-1, (Bundle) null);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("media_item", (Parcelable) null);
            resultReceiver.d(0, bundle);
        }
    }
}
