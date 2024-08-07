package w6;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
public interface g {
    void c(String str, LifecycleCallback lifecycleCallback);

    LifecycleCallback e(Class cls, String str);

    Activity h();

    void startActivityForResult(Intent intent, int i10);
}
