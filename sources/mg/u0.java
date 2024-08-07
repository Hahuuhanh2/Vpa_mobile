package mg;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;
import com.ots.core.utils.customview.textview.AppTextView;
import d2.l;

/* compiled from: ActivityPolicyAndTermBinding */
public abstract class u0 extends l {
    public final LinearLayout A;
    public final AppTextView B;

    /* renamed from: w  reason: collision with root package name */
    public final ImageButton f21371w;

    /* renamed from: x  reason: collision with root package name */
    public final ImageButton f21372x;

    /* renamed from: y  reason: collision with root package name */
    public final MaterialButton f21373y;

    /* renamed from: z  reason: collision with root package name */
    public final CheckBox f21374z;

    public u0(Object obj, View view, ImageButton imageButton, ImageButton imageButton2, MaterialButton materialButton, CheckBox checkBox, LinearLayout linearLayout, AppTextView appTextView) {
        super(0, view, obj);
        this.f21371w = imageButton;
        this.f21372x = imageButton2;
        this.f21373y = materialButton;
        this.f21374z = checkBox;
        this.A = linearLayout;
        this.B = appTextView;
    }
}
