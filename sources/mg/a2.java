package mg;

import android.view.View;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import d2.l;
import h1.a;

/* compiled from: ActivityWebViewBinding */
public abstract class a2 extends l {
    public final WebView A;

    /* renamed from: w  reason: collision with root package name */
    public final RelativeLayout f20936w;

    /* renamed from: x  reason: collision with root package name */
    public final LinearLayout f20937x;

    /* renamed from: y  reason: collision with root package name */
    public final TextView f20938y;

    /* renamed from: z  reason: collision with root package name */
    public final a f20939z;

    public a2(Object obj, View view, RelativeLayout relativeLayout, LinearLayout linearLayout, TextView textView, a aVar, WebView webView) {
        super(0, view, obj);
        this.f20936w = relativeLayout;
        this.f20937x = linearLayout;
        this.f20938y = textView;
        this.f20939z = aVar;
        this.A = webView;
    }
}
