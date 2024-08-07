package androidx.media;

import android.media.browse.MediaBrowser;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MediaBrowserServiceCompatApi21 */
public final class k<T> {

    /* renamed from: a  reason: collision with root package name */
    public MediaBrowserService.Result f2901a;

    public k(MediaBrowserService.Result result) {
        this.f2901a = result;
    }

    public final void a(T t10) {
        ArrayList arrayList = null;
        if (t10 instanceof List) {
            MediaBrowserService.Result result = this.f2901a;
            List<Parcel> list = (List) t10;
            if (list != null) {
                arrayList = new ArrayList();
                for (Parcel parcel : list) {
                    parcel.setDataPosition(0);
                    arrayList.add(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
                    parcel.recycle();
                }
            }
            result.sendResult(arrayList);
        } else if (t10 instanceof Parcel) {
            Parcel parcel2 = (Parcel) t10;
            parcel2.setDataPosition(0);
            this.f2901a.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel2));
            parcel2.recycle();
        } else {
            this.f2901a.sendResult((Object) null);
        }
    }
}
