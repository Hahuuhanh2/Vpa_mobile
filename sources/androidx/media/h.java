package androidx.media;

import android.os.Bundle;
import android.support.v4.os.ResultReceiver;
import androidx.media.MediaBrowserServiceCompat;

/* compiled from: MediaBrowserServiceCompat */
public final class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat.i f2893a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ResultReceiver f2894b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat.h f2895c;

    public h(MediaBrowserServiceCompat.h hVar, MediaBrowserServiceCompat.j jVar, String str, Bundle bundle, ResultReceiver resultReceiver) {
        this.f2895c = hVar;
        this.f2893a = jVar;
        this.f2894b = resultReceiver;
    }

    public final void run() {
        if (MediaBrowserServiceCompat.this.f2851b.getOrDefault(((MediaBrowserServiceCompat.j) this.f2893a).a(), null) != null) {
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            ResultReceiver resultReceiver = this.f2894b;
            mediaBrowserServiceCompat.getClass();
            resultReceiver.d(-1, (Bundle) null);
        }
    }
}
