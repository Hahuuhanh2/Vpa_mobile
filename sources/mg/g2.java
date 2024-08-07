package mg;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.ots.core.utils.customview.textview.AppTitleTextView;
import d2.l;

/* compiled from: BottomSheetSelectDialogBinding */
public abstract class g2 extends l {

    /* renamed from: w  reason: collision with root package name */
    public final View f21071w;

    /* renamed from: x  reason: collision with root package name */
    public final View f21072x;

    /* renamed from: y  reason: collision with root package name */
    public final View f21073y;

    /* renamed from: z  reason: collision with root package name */
    public TextView f21074z;

    public /* synthetic */ g2(Object obj, View view, MaterialButton materialButton, LinearLayout linearLayout, RecyclerView recyclerView, TextView textView) {
        super(0, view, obj);
        this.f21071w = materialButton;
        this.f21072x = linearLayout;
        this.f21073y = recyclerView;
        this.f21074z = textView;
    }

    public /* synthetic */ g2(Object obj, View view, MaterialCardView materialCardView, ImageView imageView, AppTitleTextView appTitleTextView) {
        super(0, view, obj);
        this.f21071w = materialCardView;
        this.f21072x = imageView;
        this.f21073y = appTitleTextView;
    }
}
