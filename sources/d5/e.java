package d5;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.util.List;
import s4.h;
import s4.j;
import u4.u;

/* compiled from: ResourceDrawableDecoder */
public final class e implements j<Uri, Drawable> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f8749a;

    public e(Context context) {
        this.f8749a = context.getApplicationContext();
    }

    public final /* bridge */ /* synthetic */ u a(Object obj, int i10, int i11, h hVar) {
        return c((Uri) obj);
    }

    public final boolean b(Object obj, h hVar) {
        return ((Uri) obj).getScheme().equals("android.resource");
    }

    public final u c(Uri uri) {
        Context context;
        int i10;
        String authority = uri.getAuthority();
        if (authority.equals(this.f8749a.getPackageName())) {
            context = this.f8749a;
        } else {
            try {
                context = this.f8749a.createPackageContext(authority, 0);
            } catch (PackageManager.NameNotFoundException e10) {
                if (authority.contains(this.f8749a.getPackageName())) {
                    context = this.f8749a;
                } else {
                    throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e10);
                }
            }
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            List<String> pathSegments2 = uri.getPathSegments();
            String authority2 = uri.getAuthority();
            String str = pathSegments2.get(0);
            String str2 = pathSegments2.get(1);
            i10 = context.getResources().getIdentifier(str2, str, authority2);
            if (i10 == 0) {
                i10 = Resources.getSystem().getIdentifier(str2, str, "android");
            }
            if (i10 == 0) {
                throw new IllegalArgumentException("Failed to find resource id for: " + uri);
            }
        } else if (pathSegments.size() == 1) {
            try {
                i10 = Integer.parseInt(uri.getPathSegments().get(0));
            } catch (NumberFormatException e11) {
                throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e11);
            }
        } else {
            throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
        }
        Drawable a10 = b.a(this.f8749a, context, i10, (Resources.Theme) null);
        if (a10 != null) {
            return new d(a10);
        }
        return null;
    }
}
