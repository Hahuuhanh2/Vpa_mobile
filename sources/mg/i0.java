package mg;

import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.appcompat.widget.SearchView;
import com.ots.core.base.BaseRecyclerView;
import com.ots.core.utils.customview.textview.AppTextView;
import d2.l;
import h1.a;

/* compiled from: ActivityMyDocumentBinding */
public abstract class i0 extends l {
    public final a A;
    public final AppTextView B;

    /* renamed from: w  reason: collision with root package name */
    public final ImageButton f21102w;

    /* renamed from: x  reason: collision with root package name */
    public final LinearLayout f21103x;

    /* renamed from: y  reason: collision with root package name */
    public final BaseRecyclerView f21104y;

    /* renamed from: z  reason: collision with root package name */
    public final SearchView f21105z;

    public i0(View view, ImageButton imageButton, LinearLayout linearLayout, SearchView searchView, a aVar, BaseRecyclerView baseRecyclerView, AppTextView appTextView, Object obj) {
        super(0, view, obj);
        this.f21102w = imageButton;
        this.f21103x = linearLayout;
        this.f21104y = baseRecyclerView;
        this.f21105z = searchView;
        this.A = aVar;
        this.B = appTextView;
    }
}
