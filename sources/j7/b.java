package j7;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Context f11719a;

    public b(Context context) {
        this.f11719a = context;
    }

    @ResultIgnorabilityUnspecified
    public final PackageInfo a(int i10, String str) {
        return this.f11719a.getPackageManager().getPackageInfo(str, i10);
    }
}
