package androidx.media.session;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.v4.media.MediaBrowserCompat;
import f0.b0;
import java.util.List;
import java.util.Objects;

public class MediaButtonReceiver extends BroadcastReceiver {

    public static class a extends MediaBrowserCompat.b {

        /* renamed from: c  reason: collision with root package name */
        public final Context f2904c;

        /* renamed from: d  reason: collision with root package name */
        public final Intent f2905d;

        /* renamed from: e  reason: collision with root package name */
        public final BroadcastReceiver.PendingResult f2906e;

        /* renamed from: f  reason: collision with root package name */
        public MediaBrowserCompat f2907f;

        public a(Context context, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
            this.f2904c = context;
            this.f2905d = intent;
            this.f2906e = pendingResult;
        }

        public final void a() {
            Messenger messenger;
            MediaBrowserCompat.d dVar = this.f2907f.f189a;
            MediaBrowserCompat.g gVar = dVar.f202f;
            if (!(gVar == null || (messenger = dVar.f203g) == null)) {
                try {
                    gVar.a(7, (Bundle) null, messenger);
                } catch (RemoteException unused) {
                }
            }
            dVar.f198b.disconnect();
            this.f2906e.finish();
        }
    }

    public static ComponentName a(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices.size() == 1) {
            ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
            return new ComponentName(serviceInfo.packageName, serviceInfo.name);
        } else if (queryIntentServices.isEmpty()) {
            return null;
        } else {
            StringBuilder w9 = b0.w("Expected 1 service that handles ", str, ", found ");
            w9.append(queryIntentServices.size());
            throw new IllegalStateException(w9.toString());
        }
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            Objects.toString(intent);
            return;
        }
        ComponentName a10 = a(context, "android.intent.action.MEDIA_BUTTON");
        if (a10 != null) {
            intent.setComponent(a10);
            if (Build.VERSION.SDK_INT >= 26) {
                context.startForegroundService(intent);
            } else {
                context.startService(intent);
            }
        } else {
            ComponentName a11 = a(context, "android.media.browse.MediaBrowserService");
            if (a11 != null) {
                BroadcastReceiver.PendingResult goAsync = goAsync();
                Context applicationContext = context.getApplicationContext();
                a aVar = new a(applicationContext, intent, goAsync);
                MediaBrowserCompat mediaBrowserCompat = new MediaBrowserCompat(applicationContext, a11, aVar);
                aVar.f2907f = mediaBrowserCompat;
                mediaBrowserCompat.f189a.f198b.connect();
                return;
            }
            throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
        }
    }
}
