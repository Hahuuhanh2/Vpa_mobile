package android.support.v4.media;

import android.content.Context;
import android.media.browse.MediaBrowser;
import android.media.session.MediaSession;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.b;
import android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.b;
import android.support.v4.media.session.e;
import android.view.KeyEvent;
import androidx.media.session.MediaButtonReceiver;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import s1.d;

/* compiled from: MediaBrowserCompatApi21 */
public final class c<T extends b> extends MediaBrowser.ConnectionCallback {

    /* renamed from: a  reason: collision with root package name */
    public final T f223a;

    public c(MediaBrowserCompat.b.C0005b bVar) {
        this.f223a = bVar;
    }

    public final void onConnected() {
        MediaControllerCompat$MediaControllerImplApi21 mediaControllerCompat$MediaControllerImplApi21;
        MediaSessionCompat.Token token;
        MediaBrowserCompat.b.C0005b bVar = (MediaBrowserCompat.b.C0005b) this.f223a;
        MediaBrowserCompat.b.a aVar = MediaBrowserCompat.b.this.f195b;
        MediaSessionCompat.Token token2 = null;
        if (aVar != null) {
            MediaBrowserCompat.c cVar = (MediaBrowserCompat.c) aVar;
            Bundle extras = cVar.f198b.getExtras();
            if (extras != null) {
                extras.getInt("extra_service_version", 0);
                IBinder a10 = d.a(extras, "extra_messenger");
                if (a10 != null) {
                    cVar.f202f = new MediaBrowserCompat.g(a10, cVar.f199c);
                    Messenger messenger = new Messenger(cVar.f200d);
                    cVar.f203g = messenger;
                    MediaBrowserCompat.a aVar2 = cVar.f200d;
                    aVar2.getClass();
                    aVar2.f193b = new WeakReference<>(messenger);
                    try {
                        MediaBrowserCompat.g gVar = cVar.f202f;
                        Context context = cVar.f197a;
                        Messenger messenger2 = cVar.f203g;
                        gVar.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putString("data_package_name", context.getPackageName());
                        bundle.putBundle("data_root_hints", gVar.f206b);
                        gVar.a(6, bundle, messenger2);
                    } catch (RemoteException unused) {
                    }
                }
                android.support.v4.media.session.b m10 = b.a.m(d.a(extras, "extra_session_binder"));
                if (m10 != null) {
                    MediaSession.Token sessionToken = cVar.f198b.getSessionToken();
                    if (sessionToken != null) {
                        token = new MediaSessionCompat.Token(sessionToken, m10);
                    } else {
                        token = null;
                    }
                    cVar.f204h = token;
                }
            }
        }
        MediaButtonReceiver.a aVar3 = (MediaButtonReceiver.a) MediaBrowserCompat.b.this;
        aVar3.getClass();
        try {
            Context context2 = aVar3.f2904c;
            MediaBrowserCompat.d dVar = aVar3.f2907f.f189a;
            if (dVar.f204h == null) {
                MediaSession.Token sessionToken2 = dVar.f198b.getSessionToken();
                if (sessionToken2 != null) {
                    token2 = new MediaSessionCompat.Token(sessionToken2, (android.support.v4.media.session.b) null);
                }
                dVar.f204h = token2;
            }
            MediaSessionCompat.Token token3 = dVar.f204h;
            new HashSet();
            if (token3 != null) {
                if (Build.VERSION.SDK_INT >= 24) {
                    mediaControllerCompat$MediaControllerImplApi21 = new e(context2, token3);
                } else {
                    mediaControllerCompat$MediaControllerImplApi21 = new android.support.v4.media.session.d(context2, token3);
                }
                KeyEvent keyEvent = (KeyEvent) aVar3.f2905d.getParcelableExtra("android.intent.extra.KEY_EVENT");
                if (keyEvent != null) {
                    mediaControllerCompat$MediaControllerImplApi21.f225a.dispatchMediaButtonEvent(keyEvent);
                    aVar3.a();
                    return;
                }
                throw new IllegalArgumentException("KeyEvent may not be null");
            }
            throw new IllegalArgumentException("sessionToken must not be null");
        } catch (RemoteException unused2) {
        }
    }

    public final void onConnectionFailed() {
        MediaBrowserCompat.b bVar = MediaBrowserCompat.b.this;
        MediaBrowserCompat.b.a aVar = bVar.f195b;
        ((MediaButtonReceiver.a) bVar).a();
    }

    public final void onConnectionSuspended() {
        MediaBrowserCompat.b.C0005b bVar = (MediaBrowserCompat.b.C0005b) this.f223a;
        MediaBrowserCompat.b.a aVar = MediaBrowserCompat.b.this.f195b;
        if (aVar != null) {
            MediaBrowserCompat.c cVar = (MediaBrowserCompat.c) aVar;
            cVar.f202f = null;
            cVar.f203g = null;
            cVar.f204h = null;
            MediaBrowserCompat.a aVar2 = cVar.f200d;
            aVar2.getClass();
            aVar2.f193b = new WeakReference<>((Object) null);
        }
        ((MediaButtonReceiver.a) MediaBrowserCompat.b.this).a();
    }
}
