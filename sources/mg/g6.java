package mg;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import d2.l;
import qh.b;

/* compiled from: ItemNewsHomeBinding */
public abstract class g6 extends l {

    /* renamed from: w  reason: collision with root package name */
    public final LinearLayout f21084w;

    /* renamed from: x  reason: collision with root package name */
    public final ImageView f21085x;

    /* renamed from: y  reason: collision with root package name */
    public final TextView f21086y;

    /* renamed from: z  reason: collision with root package name */
    public b f21087z;

    public g6(Object obj, View view, LinearLayout linearLayout, ImageView imageView, TextView textView) {
        super(0, view, obj);
        this.f21084w = linearLayout;
        this.f21085x = imageView;
        this.f21086y = textView;
    }

    public abstract void v(b bVar);
}
