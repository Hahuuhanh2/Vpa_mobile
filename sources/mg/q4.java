package mg;

import android.view.View;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.ots.core.utils.customview.textview.AppTextView;
import com.ots.core.utils.customview.textview.AppTitleTextView;
import d2.l;
import qh.d;

/* compiled from: ItemAnnouncementPlateBinding */
public abstract class q4 extends l {
    public final AppTextView A;
    public d B;

    /* renamed from: w  reason: collision with root package name */
    public final MaterialButton f21311w;

    /* renamed from: x  reason: collision with root package name */
    public final TextView f21312x;

    /* renamed from: y  reason: collision with root package name */
    public final AppTitleTextView f21313y;

    /* renamed from: z  reason: collision with root package name */
    public final AppTextView f21314z;

    public q4(Object obj, View view, MaterialButton materialButton, TextView textView, AppTitleTextView appTitleTextView, AppTextView appTextView, AppTextView appTextView2) {
        super(0, view, obj);
        this.f21311w = materialButton;
        this.f21312x = textView;
        this.f21313y = appTitleTextView;
        this.f21314z = appTextView;
        this.A = appTextView2;
    }

    public abstract void v(d dVar);
}
