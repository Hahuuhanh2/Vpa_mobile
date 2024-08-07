package android.support.v4.media;

import al.g0;
import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import androidx.media.session.MediaButtonReceiver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public final class MediaBrowserCompat {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f188b = 0;

    /* renamed from: a  reason: collision with root package name */
    public final d f189a;

    public static class CustomActionResultReceiver extends ResultReceiver {
        public final void a(int i10, Bundle bundle) {
        }
    }

    public static class ItemReceiver extends ResultReceiver {
        public final void a(int i10, Bundle bundle) {
            MediaSessionCompat.a(bundle);
            if (i10 != 0 || bundle == null || !bundle.containsKey("media_item")) {
                throw null;
            }
            Parcelable parcelable = bundle.getParcelable("media_item");
            if (parcelable == null || (parcelable instanceof MediaItem)) {
                MediaItem mediaItem = (MediaItem) parcelable;
                throw null;
            }
            throw null;
        }
    }

    public static class SearchResultReceiver extends ResultReceiver {
        public final void a(int i10, Bundle bundle) {
            MediaSessionCompat.a(bundle);
            if (i10 != 0 || bundle == null || !bundle.containsKey("search_results")) {
                throw null;
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
            if (parcelableArray != null) {
                ArrayList arrayList = new ArrayList();
                for (Parcelable parcelable : parcelableArray) {
                    arrayList.add((MediaItem) parcelable);
                }
            }
            throw null;
        }
    }

    public static class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<f> f192a;

        /* renamed from: b  reason: collision with root package name */
        public WeakReference<Messenger> f193b;

        public a(f fVar) {
            this.f192a = new WeakReference<>(fVar);
        }

        public final void handleMessage(Message message) {
            WeakReference<Messenger> weakReference = this.f193b;
            if (weakReference != null && weakReference.get() != null && this.f192a.get() != null) {
                Bundle data = message.getData();
                MediaSessionCompat.a(data);
                f fVar = this.f192a.get();
                Messenger messenger = this.f193b.get();
                try {
                    int i10 = message.what;
                    if (i10 == 1) {
                        MediaSessionCompat.a(data.getBundle("data_root_hints"));
                        data.getString("data_media_item_id");
                        MediaSessionCompat.Token token = (MediaSessionCompat.Token) data.getParcelable("data_media_session_token");
                        fVar.b();
                    } else if (i10 == 2) {
                        fVar.a();
                    } else if (i10 != 3) {
                        message.toString();
                    } else {
                        Bundle bundle = data.getBundle("data_options");
                        MediaSessionCompat.a(bundle);
                        MediaSessionCompat.a(data.getBundle("data_notify_children_changed_options"));
                        String string = data.getString("data_media_item_id");
                        data.getParcelableArrayList("data_media_item_list");
                        fVar.c(messenger, string, bundle);
                    }
                } catch (BadParcelableException unused) {
                    if (message.what == 1) {
                        fVar.a();
                    }
                }
            }
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final c f194a = new c(new C0005b());

        /* renamed from: b  reason: collision with root package name */
        public a f195b;

        public interface a {
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$b$b  reason: collision with other inner class name */
        public class C0005b implements b {
            public C0005b() {
            }
        }
    }

    public static class c implements f, b.a {

        /* renamed from: a  reason: collision with root package name */
        public final Context f197a;

        /* renamed from: b  reason: collision with root package name */
        public final MediaBrowser f198b;

        /* renamed from: c  reason: collision with root package name */
        public final Bundle f199c;

        /* renamed from: d  reason: collision with root package name */
        public final a f200d = new a(this);

        /* renamed from: e  reason: collision with root package name */
        public final v0.b<String, h> f201e = new v0.b<>();

        /* renamed from: f  reason: collision with root package name */
        public g f202f;

        /* renamed from: g  reason: collision with root package name */
        public Messenger f203g;

        /* renamed from: h  reason: collision with root package name */
        public MediaSessionCompat.Token f204h;

        public c(Context context, ComponentName componentName, MediaButtonReceiver.a aVar) {
            this.f197a = context;
            Bundle bundle = new Bundle();
            this.f199c = bundle;
            bundle.putInt("extra_client_version", 1);
            aVar.f195b = this;
            this.f198b = new MediaBrowser(context, componentName, aVar.f194a, bundle);
        }

        public final void a() {
        }

        public final void b() {
        }

        public final void c(Messenger messenger, String str, Bundle bundle) {
            if (this.f203g == messenger) {
                h orDefault = this.f201e.getOrDefault(str, null);
                if (orDefault == null) {
                    int i10 = MediaBrowserCompat.f188b;
                } else {
                    orDefault.a(bundle);
                }
            }
        }
    }

    public static class d extends c {
        public d(Context context, ComponentName componentName, MediaButtonReceiver.a aVar) {
            super(context, componentName, aVar);
        }
    }

    public static class e extends d {
        public e(Context context, ComponentName componentName, MediaButtonReceiver.a aVar) {
            super(context, componentName, aVar);
        }
    }

    public interface f {
        void a();

        void b();

        void c(Messenger messenger, String str, Bundle bundle);
    }

    public static class g {

        /* renamed from: a  reason: collision with root package name */
        public Messenger f205a;

        /* renamed from: b  reason: collision with root package name */
        public Bundle f206b;

        public g(IBinder iBinder, Bundle bundle) {
            this.f205a = new Messenger(iBinder);
            this.f206b = bundle;
        }

        public final void a(int i10, Bundle bundle, Messenger messenger) {
            Message obtain = Message.obtain();
            obtain.what = i10;
            obtain.arg1 = 1;
            obtain.setData(bundle);
            obtain.replyTo = messenger;
            this.f205a.send(obtain);
        }
    }

    public static class h {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList f207a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList f208b = new ArrayList();

        public final void a(Bundle bundle) {
            for (int i10 = 0; i10 < this.f208b.size(); i10++) {
                if (g0.u((Bundle) this.f208b.get(i10), bundle)) {
                    i iVar = (i) this.f207a.get(i10);
                    return;
                }
            }
        }
    }

    public static abstract class i {

        public class a implements d {
            public a() {
            }

            public final void a() {
                i.this.getClass();
            }

            public final void b(List list) {
                i.this.getClass();
                i iVar = i.this;
                MediaItem.a(list);
                iVar.getClass();
            }
        }

        public class b extends a implements f {
            public b() {
                super();
            }

            public final void c(List list) {
                i iVar = i.this;
                MediaItem.a(list);
                iVar.getClass();
            }

            public final void d() {
                i.this.getClass();
            }
        }

        public i() {
            new Binder();
            if (Build.VERSION.SDK_INT >= 26) {
                new g(new b());
            } else {
                new e(new a());
            }
        }
    }

    static {
        Log.isLoggable("MediaBrowserCompat", 3);
    }

    public MediaBrowserCompat(Context context, ComponentName componentName, MediaButtonReceiver.a aVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f189a = new e(context, componentName, aVar);
        } else {
            this.f189a = new d(context, componentName, aVar);
        }
    }

    public static class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public final int f190a;

        /* renamed from: b  reason: collision with root package name */
        public final MediaDescriptionCompat f191b;

        public static class a implements Parcelable.Creator<MediaItem> {
            public final Object createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }

            public final Object[] newArray(int i10) {
                return new MediaItem[i10];
            }
        }

        public MediaItem(MediaDescriptionCompat mediaDescriptionCompat, int i10) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("description cannot be null");
            } else if (!TextUtils.isEmpty(mediaDescriptionCompat.f211a)) {
                this.f190a = i10;
                this.f191b = mediaDescriptionCompat;
            } else {
                throw new IllegalArgumentException("description must have a non-empty media id");
            }
        }

        public static void a(List list) {
            MediaItem mediaItem;
            if (list != null) {
                ArrayList arrayList = new ArrayList(list.size());
                for (Object next : list) {
                    if (next != null) {
                        MediaBrowser.MediaItem mediaItem2 = (MediaBrowser.MediaItem) next;
                        mediaItem = new MediaItem(MediaDescriptionCompat.a(mediaItem2.getDescription()), mediaItem2.getFlags());
                    } else {
                        mediaItem = null;
                    }
                    arrayList.add(mediaItem);
                }
            }
        }

        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "MediaItem{" + "mFlags=" + this.f190a + ", mDescription=" + this.f191b + '}';
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f190a);
            this.f191b.writeToParcel(parcel, i10);
        }

        public MediaItem(Parcel parcel) {
            this.f190a = parcel.readInt();
            this.f191b = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }
    }
}
