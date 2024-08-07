package f4;

import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashMap;
import n4.c;
import vl.d;

/* compiled from: FontAssetManager */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final d f9906a = new d(3);

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f9907b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f9908c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final AssetManager f9909d;

    /* renamed from: e  reason: collision with root package name */
    public String f9910e = ".ttf";

    public a(Drawable.Callback callback) {
        if (!(callback instanceof View)) {
            c.b("LottieDrawable must be inside of a view for images to work.");
            this.f9909d = null;
            return;
        }
        this.f9909d = ((View) callback).getContext().getAssets();
    }
}
