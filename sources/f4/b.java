package f4;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import com.airbnb.lottie.d0;
import java.util.HashMap;
import java.util.Map;
import n4.c;

/* compiled from: ImageAssetManager */
public final class b {

    /* renamed from: d  reason: collision with root package name */
    public static final Object f9911d = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Context f9912a;

    /* renamed from: b  reason: collision with root package name */
    public final String f9913b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, d0> f9914c;

    public b(Drawable.Callback callback, String str, com.airbnb.lottie.b bVar, Map<String, d0> map) {
        if (TextUtils.isEmpty(str) || str.charAt(str.length() - 1) == '/') {
            this.f9913b = str;
        } else {
            this.f9913b = str + '/';
        }
        if (!(callback instanceof View)) {
            c.b("LottieDrawable must be inside of a view for images to work.");
            this.f9914c = new HashMap();
            this.f9912a = null;
            return;
        }
        this.f9912a = ((View) callback).getContext();
        this.f9914c = map;
    }

    public final void a(String str, Bitmap bitmap) {
        synchronized (f9911d) {
            this.f9914c.get(str).f4797d = bitmap;
        }
    }
}
