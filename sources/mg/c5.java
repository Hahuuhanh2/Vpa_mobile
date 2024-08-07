package mg;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
import com.ots.core.utils.customview.textview.AppTextView;
import d2.l;
import ug.f;

/* compiled from: ItemAuctionRoomBinding */
public abstract class c5 extends l {
    public f A;

    /* renamed from: w  reason: collision with root package name */
    public final MaterialCardView f21012w;

    /* renamed from: x  reason: collision with root package name */
    public final ImageView f21013x;

    /* renamed from: y  reason: collision with root package name */
    public final AppTextView f21014y;

    /* renamed from: z  reason: collision with root package name */
    public final TextView f21015z;

    public c5(Object obj, View view, MaterialCardView materialCardView, ImageView imageView, AppTextView appTextView, TextView textView) {
        super(0, view, obj);
        this.f21012w = materialCardView;
        this.f21013x = imageView;
        this.f21014y = appTextView;
        this.f21015z = textView;
    }

    public abstract void v(f fVar);
}
