package mg;

import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.SearchView;
import com.ots.core.base.BaseRecyclerView;
import d2.l;
import h1.a;

/* compiled from: ActivityAuctionResultBinding */
public abstract class m extends l {
    public final a A;

    /* renamed from: w  reason: collision with root package name */
    public final ImageButton f21179w;

    /* renamed from: x  reason: collision with root package name */
    public final RelativeLayout f21180x;

    /* renamed from: y  reason: collision with root package name */
    public final BaseRecyclerView f21181y;

    /* renamed from: z  reason: collision with root package name */
    public final SearchView f21182z;

    public m(Object obj, View view, ImageButton imageButton, RelativeLayout relativeLayout, BaseRecyclerView baseRecyclerView, SearchView searchView, a aVar) {
        super(0, view, obj);
        this.f21179w = imageButton;
        this.f21180x = relativeLayout;
        this.f21181y = baseRecyclerView;
        this.f21182z = searchView;
        this.A = aVar;
    }
}
