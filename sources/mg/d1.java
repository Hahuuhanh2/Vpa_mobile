package mg;

import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import com.ots.core.base.BaseRecyclerView;
import d2.l;
import h1.a;

/* compiled from: ActivityRegisterAuctionListBinding */
public abstract class d1 extends l {
    public final a A;
    public final TextView B;

    /* renamed from: w  reason: collision with root package name */
    public final ImageButton f21019w;

    /* renamed from: x  reason: collision with root package name */
    public final LinearLayout f21020x;

    /* renamed from: y  reason: collision with root package name */
    public final BaseRecyclerView f21021y;

    /* renamed from: z  reason: collision with root package name */
    public final SearchView f21022z;

    public d1(Object obj, View view, ImageButton imageButton, LinearLayout linearLayout, BaseRecyclerView baseRecyclerView, SearchView searchView, a aVar, TextView textView) {
        super(0, view, obj);
        this.f21019w = imageButton;
        this.f21020x = linearLayout;
        this.f21021y = baseRecyclerView;
        this.f21022z = searchView;
        this.A = aVar;
        this.B = textView;
    }
}
