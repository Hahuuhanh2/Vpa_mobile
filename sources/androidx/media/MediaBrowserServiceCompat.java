package androidx.media;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import androidx.media.o;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public abstract class MediaBrowserServiceCompat extends Service {

    /* renamed from: a  reason: collision with root package name */
    public e f2850a;

    /* renamed from: b  reason: collision with root package name */
    public final v0.b<IBinder, b> f2851b = new v0.b<>();

    /* renamed from: c  reason: collision with root package name */
    public final k f2852c = new k(this);

    public static final class a {
    }

    public class b implements IBinder.DeathRecipient {

        /* renamed from: a  reason: collision with root package name */
        public final String f2853a;

        /* renamed from: b  reason: collision with root package name */
        public final i f2854b;

        /* renamed from: c  reason: collision with root package name */
        public final HashMap<String, List<v1.c<IBinder, Bundle>>> f2855c = new HashMap<>();

        public class a implements Runnable {
            public a() {
            }

            public final void run() {
                b bVar = b.this;
                MediaBrowserServiceCompat.this.f2851b.remove(((j) bVar.f2854b).a());
            }
        }

        public b(String str, int i10, int i11, i iVar) {
            this.f2853a = str;
            if (Build.VERSION.SDK_INT >= 28) {
                new p(str, i10, i11);
            }
            this.f2854b = iVar;
        }

        public final void binderDied() {
            MediaBrowserServiceCompat.this.f2852c.post(new a());
        }
    }

    public interface c {
        void a();
    }

    public class d implements c, l {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList f2858a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public j f2859b;

        /* renamed from: c  reason: collision with root package name */
        public Messenger f2860c;

        public d() {
        }

        public final void c(String str, k<List<Parcel>> kVar) {
            MediaBrowserServiceCompat.this.b();
        }

        public final void d(String str, int i10, Bundle bundle) {
            if (!(bundle == null || bundle.getInt("extra_client_version", 0) == 0)) {
                bundle.remove("extra_client_version");
                this.f2860c = new Messenger(MediaBrowserServiceCompat.this.f2852c);
                Bundle bundle2 = new Bundle();
                bundle2.putInt("extra_service_version", 2);
                s1.d.b(bundle2, "extra_messenger", this.f2860c.getBinder());
                MediaBrowserServiceCompat.this.getClass();
                this.f2858a.add(bundle2);
            }
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            new HashMap();
            if (Build.VERSION.SDK_INT >= 28) {
                new p(str, -1, i10);
            }
            mediaBrowserServiceCompat.getClass();
            MediaBrowserServiceCompat.this.a();
            MediaBrowserServiceCompat.this.getClass();
        }
    }

    public class e extends d implements n {
        public e() {
            super();
        }

        public void a() {
            m mVar = new m(MediaBrowserServiceCompat.this, this);
            this.f2859b = mVar;
            mVar.onCreate();
        }

        public final void e(k kVar) {
            MediaBrowserServiceCompat.this.getClass();
            kVar.a(null);
        }
    }

    public class f extends e implements o.c {
        public f() {
            super();
        }

        public final void a() {
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            int i10 = o.f2902a;
            o.a aVar = new o.a(mediaBrowserServiceCompat, this);
            this.f2859b = aVar;
            aVar.onCreate();
        }

        public final void b(String str, o.b bVar) {
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat.getClass();
            mediaBrowserServiceCompat.b();
        }
    }

    public class g extends f {
        public g(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
            super();
        }
    }

    public class h {
        public h() {
        }
    }

    public interface i {
    }

    public static class j implements i {

        /* renamed from: a  reason: collision with root package name */
        public final Messenger f2865a;

        public j(Messenger messenger) {
            this.f2865a = messenger;
        }

        public final IBinder a() {
            return this.f2865a.getBinder();
        }
    }

    public final class k extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public final h f2866a;

        public k(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
            this.f2866a = new h();
        }

        public final void a(Runnable runnable) {
            if (Thread.currentThread() == getLooper().getThread()) {
                runnable.run();
            } else {
                post(runnable);
            }
        }

        public final void handleMessage(Message message) {
            Message message2 = message;
            Bundle data = message.getData();
            switch (message2.what) {
                case 1:
                    Bundle bundle = data.getBundle("data_root_hints");
                    MediaSessionCompat.a(bundle);
                    h hVar = this.f2866a;
                    String string = data.getString("data_package_name");
                    int i10 = data.getInt("data_calling_pid");
                    int i11 = data.getInt("data_calling_uid");
                    j jVar = new j(message2.replyTo);
                    MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
                    boolean z10 = false;
                    if (string == null) {
                        mediaBrowserServiceCompat.getClass();
                    } else {
                        String[] packagesForUid = mediaBrowserServiceCompat.getPackageManager().getPackagesForUid(i11);
                        int length = packagesForUid.length;
                        int i12 = 0;
                        while (true) {
                            if (i12 < length) {
                                if (packagesForUid[i12].equals(string)) {
                                    z10 = true;
                                } else {
                                    i12++;
                                }
                            }
                        }
                    }
                    if (z10) {
                        MediaBrowserServiceCompat.this.f2852c.a(new a(hVar, jVar, string, i10, i11, bundle));
                        return;
                    }
                    throw new IllegalArgumentException("Package/uid mismatch: uid=" + i11 + " package=" + string);
                case 2:
                    h hVar2 = this.f2866a;
                    MediaBrowserServiceCompat.this.f2852c.a(new b(hVar2, new j(message2.replyTo)));
                    return;
                case 3:
                    Bundle bundle2 = data.getBundle("data_options");
                    MediaSessionCompat.a(bundle2);
                    h hVar3 = this.f2866a;
                    MediaBrowserServiceCompat.this.f2852c.a(new c(hVar3, new j(message2.replyTo), data.getString("data_media_item_id"), s1.d.a(data, "data_callback_token"), bundle2));
                    return;
                case 4:
                    h hVar4 = this.f2866a;
                    MediaBrowserServiceCompat.this.f2852c.a(new d(hVar4, new j(message2.replyTo), data.getString("data_media_item_id"), s1.d.a(data, "data_callback_token")));
                    return;
                case 5:
                    h hVar5 = this.f2866a;
                    String string2 = data.getString("data_media_item_id");
                    ResultReceiver resultReceiver = (ResultReceiver) data.getParcelable("data_result_receiver");
                    j jVar2 = new j(message2.replyTo);
                    hVar5.getClass();
                    if (!TextUtils.isEmpty(string2) && resultReceiver != null) {
                        MediaBrowserServiceCompat.this.f2852c.a(new e(hVar5, jVar2, string2, resultReceiver));
                        return;
                    }
                    return;
                case 6:
                    Bundle bundle3 = data.getBundle("data_root_hints");
                    MediaSessionCompat.a(bundle3);
                    h hVar6 = this.f2866a;
                    MediaBrowserServiceCompat.this.f2852c.a(new f(hVar6, new j(message2.replyTo), data.getString("data_package_name"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid"), bundle3));
                    return;
                case 7:
                    h hVar7 = this.f2866a;
                    MediaBrowserServiceCompat.this.f2852c.a(new g(hVar7, new j(message2.replyTo)));
                    return;
                case 8:
                    Bundle bundle4 = data.getBundle("data_search_extras");
                    MediaSessionCompat.a(bundle4);
                    h hVar8 = this.f2866a;
                    String string3 = data.getString("data_search_query");
                    ResultReceiver resultReceiver2 = (ResultReceiver) data.getParcelable("data_result_receiver");
                    j jVar3 = new j(message2.replyTo);
                    hVar8.getClass();
                    if (!TextUtils.isEmpty(string3) && resultReceiver2 != null) {
                        MediaBrowserServiceCompat.this.f2852c.a(new h(hVar8, jVar3, string3, bundle4, resultReceiver2));
                        return;
                    }
                    return;
                case 9:
                    Bundle bundle5 = data.getBundle("data_custom_action_extras");
                    MediaSessionCompat.a(bundle5);
                    h hVar9 = this.f2866a;
                    String string4 = data.getString("data_custom_action");
                    ResultReceiver resultReceiver3 = (ResultReceiver) data.getParcelable("data_result_receiver");
                    j jVar4 = new j(message2.replyTo);
                    hVar9.getClass();
                    if (!TextUtils.isEmpty(string4) && resultReceiver3 != null) {
                        MediaBrowserServiceCompat.this.f2852c.a(new i(hVar9, jVar4, string4, bundle5, resultReceiver3));
                        return;
                    }
                    return;
                default:
                    message.toString();
                    return;
            }
        }

        public final boolean sendMessageAtTime(Message message, long j10) {
            Bundle data = message.getData();
            data.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            data.putInt("data_calling_uid", Binder.getCallingUid());
            data.putInt("data_calling_pid", Binder.getCallingPid());
            return super.sendMessageAtTime(message, j10);
        }
    }

    static {
        Log.isLoggable("MBServiceCompat", 3);
    }

    public abstract a a();

    public abstract void b();

    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public final IBinder onBind(Intent intent) {
        return this.f2850a.f2859b.onBind(intent);
    }

    public final void onCreate() {
        super.onCreate();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            this.f2850a = new g(this);
        } else if (i10 >= 26) {
            this.f2850a = new f();
        } else {
            this.f2850a = new e();
        }
        this.f2850a.a();
    }
}
