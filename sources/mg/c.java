package mg;

import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.appcompat.widget.SearchView;
import com.ots.core.base.BaseRecyclerView;
import d2.l;
import h1.a;

/* compiled from: ActivityAuctionDocumentBinding */
public abstract class c extends l {
    public final a A;

    /* renamed from: w  reason: collision with root package name */
    public final ImageButton f20995w;

    /* renamed from: x  reason: collision with root package name */
    public final LinearLayout f20996x;

    /* renamed from: y  reason: collision with root package name */
    public final BaseRecyclerView f20997y;

    /* renamed from: z  reason: collision with root package name */
    public final SearchView f20998z;

    public c(Object obj, View view, ImageButton imageButton, LinearLayout linearLayout, BaseRecyclerView baseRecyclerView, SearchView searchView, a aVar) {
        super(0, view, obj);
        this.f20995w = imageButton;
        this.f20996x = linearLayout;
        this.f20997y = baseRecyclerView;
        this.f20998z = searchView;
        this.A = aVar;
    }
}
