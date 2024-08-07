package mg;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.google.android.material.button.MaterialButton;
import d2.l;

/* compiled from: ActivityVerifyBinding */
public abstract class y1 extends l {
    public final ImageView A;
    public final ImageView B;
    public final LinearLayout C;
    public final RelativeLayout D;

    /* renamed from: w  reason: collision with root package name */
    public final LinearLayout f21487w;

    /* renamed from: x  reason: collision with root package name */
    public final ImageButton f21488x;

    /* renamed from: y  reason: collision with root package name */
    public final ImageButton f21489y;

    /* renamed from: z  reason: collision with root package name */
    public final MaterialButton f21490z;

    public y1(Object obj, View view, LinearLayout linearLayout, ImageButton imageButton, ImageButton imageButton2, MaterialButton materialButton, ImageView imageView, ImageView imageView2, LinearLayout linearLayout2, RelativeLayout relativeLayout) {
        super(0, view, obj);
        this.f21487w = linearLayout;
        this.f21488x = imageButton;
        this.f21489y = imageButton2;
        this.f21490z = materialButton;
        this.A = imageView;
        this.B = imageView2;
        this.C = linearLayout2;
        this.D = relativeLayout;
    }
}
