package ee;

import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.text.TextUtils;
import androidx.activity.ComponentActivity;
import g.a;

/* compiled from: PictureSelectorSystemFragment */
public final class e0 extends a<String, Uri> {
    public final Intent a(ComponentActivity componentActivity, Object obj) {
        String str = (String) obj;
        if (TextUtils.equals("video/*", str)) {
            return new Intent("android.intent.action.PICK", MediaStore.Video.Media.EXTERNAL_CONTENT_URI);
        }
        if (TextUtils.equals("audio/*", str)) {
            return new Intent("android.intent.action.PICK", MediaStore.Audio.Media.EXTERNAL_CONTENT_URI);
        }
        return new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
    }

    public final Object c(Intent intent, int i10) {
        if (intent == null) {
            return null;
        }
        return intent.getData();
    }
}
