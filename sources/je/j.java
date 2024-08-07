package je;

import android.media.MediaScannerConnection;
import android.net.Uri;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;

/* compiled from: PictureMediaScannerConnection */
public final class j implements MediaScannerConnection.MediaScannerConnectionClient {

    /* renamed from: a  reason: collision with root package name */
    public final MediaScannerConnection f11883a;

    /* renamed from: b  reason: collision with root package name */
    public final String f11884b;

    public j(FragmentActivity fragmentActivity, String str) {
        this.f11884b = str;
        MediaScannerConnection mediaScannerConnection = new MediaScannerConnection(fragmentActivity.getApplicationContext(), this);
        this.f11883a = mediaScannerConnection;
        mediaScannerConnection.connect();
    }

    public final void onMediaScannerConnected() {
        if (!TextUtils.isEmpty(this.f11884b)) {
            this.f11883a.scanFile(this.f11884b, (String) null);
        }
    }

    public final void onScanCompleted(String str, Uri uri) {
        this.f11883a.disconnect();
    }
}
