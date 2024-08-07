package te;

import android.content.Context;
import android.os.Build;

/* compiled from: PermissionConfig */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static String[] f15023a = new String[0];

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f15024b = {"android.permission.CAMERA"};

    public static String[] a(Context context, int i10) {
        boolean z10;
        if (Build.VERSION.SDK_INT >= 33) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"};
        }
        int i11 = context.getApplicationInfo().targetSdkVersion;
        if (i10 == 1) {
            if (i11 >= 33) {
                return new String[]{"android.permission.READ_MEDIA_IMAGES"};
            }
            return new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_EXTERNAL_STORAGE"};
        } else if (i10 == 2) {
            if (i11 >= 33) {
                return new String[]{"android.permission.READ_MEDIA_VIDEO"};
            }
            return new String[]{"android.permission.READ_MEDIA_VIDEO", "android.permission.READ_EXTERNAL_STORAGE"};
        } else if (i10 == 3) {
            if (i11 >= 33) {
                return new String[]{"android.permission.READ_MEDIA_AUDIO"};
            }
            return new String[]{"android.permission.READ_MEDIA_AUDIO", "android.permission.READ_EXTERNAL_STORAGE"};
        } else if (i11 >= 33) {
            return new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"};
        } else {
            return new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO", "android.permission.READ_EXTERNAL_STORAGE"};
        }
    }
}
