package mg;

import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.appcompat.widget.SearchView;
import com.ots.core.base.BaseRecyclerView;
import com.ots.core.utils.customview.textview.AppTextView;
import d2.l;
import h1.a;

/* compiled from: ActivityAuctionHistoryBinding */
public abstract class e extends l {
    public final a A;
    public final AppTextView B;

    /* renamed from: w  reason: collision with root package name */
    public final ImageButton f21030w;

    /* renamed from: x  reason: collision with root package name */
    public final LinearLayout f21031x;

    /* renamed from: y  reason: collision with root package name */
    public final BaseRecyclerView f21032y;

    /* renamed from: z  reason: collision with root package name */
    public final SearchView f21033z;

    public e(View view, ImageButton imageButton, LinearLayout linearLayout, SearchView searchView, a aVar, BaseRecyclerView baseRecyclerView, AppTextView appTextView, Object obj) {
        super(0, view, obj);
        this.f21030w = imageButton;
        this.f21031x = linearLayout;
        this.f21032y = baseRecyclerView;
        this.f21033z = searchView;
        this.A = aVar;
        this.B = appTextView;
    }
}
