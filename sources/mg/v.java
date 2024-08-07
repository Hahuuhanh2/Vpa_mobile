package mg;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.SearchView;
import com.ots.core.base.BaseRecyclerView;
import d2.l;
import ug.a;

/* compiled from: ActivityDetailAuctionResultBinding */
public abstract class v extends l {
    public a A;

    /* renamed from: w  reason: collision with root package name */
    public final LinearLayout f21393w;

    /* renamed from: x  reason: collision with root package name */
    public final BaseRecyclerView f21394x;

    /* renamed from: y  reason: collision with root package name */
    public final SearchView f21395y;

    /* renamed from: z  reason: collision with root package name */
    public final h1.a f21396z;

    public v(Object obj, View view, LinearLayout linearLayout, BaseRecyclerView baseRecyclerView, SearchView searchView, h1.a aVar) {
        super(0, view, obj);
        this.f21393w = linearLayout;
        this.f21394x = baseRecyclerView;
        this.f21395y = searchView;
        this.f21396z = aVar;
    }

    public abstract void v(a aVar);
}
