package mg;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.RecyclerView;
import com.ots.base.utils.customview.EmptyView;
import d2.l;

/* compiled from: AddressSelectDialogBinding */
public abstract class e2 extends l {
    public static final /* synthetic */ int A = 0;

    /* renamed from: w  reason: collision with root package name */
    public final EmptyView f21038w;

    /* renamed from: x  reason: collision with root package name */
    public final RecyclerView f21039x;

    /* renamed from: y  reason: collision with root package name */
    public final SearchView f21040y;

    /* renamed from: z  reason: collision with root package name */
    public final TextView f21041z;

    public e2(Object obj, View view, EmptyView emptyView, RecyclerView recyclerView, SearchView searchView, TextView textView) {
        super(0, view, obj);
        this.f21038w = emptyView;
        this.f21039x = recyclerView;
        this.f21040y = searchView;
        this.f21041z = textView;
    }
}
