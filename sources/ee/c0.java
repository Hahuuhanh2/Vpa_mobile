package ee;

import android.content.Intent;
import android.net.Uri;
import androidx.activity.ComponentActivity;
import g.a;

/* compiled from: PictureSelectorSystemFragment */
public final class c0 extends a<String, Uri> {
    public final Intent a(ComponentActivity componentActivity, Object obj) {
        Intent intent = new Intent("android.intent.action.PICK");
        intent.setType((String) obj);
        return intent;
    }

    public final Object c(Intent intent, int i10) {
        if (intent == null) {
            return null;
        }
        return intent.getData();
    }
}
