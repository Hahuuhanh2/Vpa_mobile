package w6;

import android.app.Activity;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final Activity f16594a;

    public f(Activity activity) {
        if (activity != null) {
            this.f16594a = activity;
            return;
        }
        throw new NullPointerException("Activity must not be null");
    }
}
