package androidx.media;

import android.os.Bundle;
import android.support.v4.os.ResultReceiver;
import androidx.media.MediaBrowserServiceCompat;
import java.util.Objects;

/* compiled from: MediaBrowserServiceCompat */
public final class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat.i f2896a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Bundle f2897b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ResultReceiver f2898c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat.h f2899d;

    public i(MediaBrowserServiceCompat.h hVar, MediaBrowserServiceCompat.j jVar, String str, Bundle bundle, ResultReceiver resultReceiver) {
        this.f2899d = hVar;
        this.f2896a = jVar;
        this.f2897b = bundle;
        this.f2898c = resultReceiver;
    }

    public final void run() {
        if (MediaBrowserServiceCompat.this.f2851b.getOrDefault(((MediaBrowserServiceCompat.j) this.f2896a).a(), null) == null) {
            Objects.toString(this.f2897b);
            return;
        }
        MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
        ResultReceiver resultReceiver = this.f2898c;
        mediaBrowserServiceCompat.getClass();
        resultReceiver.d(-1, (Bundle) null);
    }
}
