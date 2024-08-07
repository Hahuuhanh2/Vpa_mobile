package androidx.media;

import android.os.IBinder;
import androidx.media.MediaBrowserServiceCompat;
import java.util.Iterator;
import java.util.List;
import v1.c;

/* compiled from: MediaBrowserServiceCompat */
public final class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat.i f2879a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f2880b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ IBinder f2881c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat.h f2882d;

    public d(MediaBrowserServiceCompat.h hVar, MediaBrowserServiceCompat.j jVar, String str, IBinder iBinder) {
        this.f2882d = hVar;
        this.f2879a = jVar;
        this.f2880b = str;
        this.f2881c = iBinder;
    }

    public final void run() {
        MediaBrowserServiceCompat.b orDefault = MediaBrowserServiceCompat.this.f2851b.getOrDefault(((MediaBrowserServiceCompat.j) this.f2879a).a(), null);
        if (orDefault != null) {
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            String str = this.f2880b;
            F f10 = this.f2881c;
            mediaBrowserServiceCompat.getClass();
            if (f10 == null) {
                orDefault.f2855c.remove(str);
                return;
            }
            List list = orDefault.f2855c.get(str);
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (f10 == ((c) it.next()).f16012a) {
                        it.remove();
                    }
                }
                if (list.size() == 0) {
                    orDefault.f2855c.remove(str);
                }
            }
        }
    }
}
