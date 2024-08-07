package mg;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import d2.l;
import h1.a;

/* compiled from: ActivityFilterBinding */
public abstract class z extends l {
    public final RelativeLayout A;
    public final RecyclerView B;
    public final RecyclerView C;
    public final RecyclerView D;
    public final NestedScrollView E;
    public final SearchView F;
    public final a G;
    public final TextView H;
    public final TextView I;

    /* renamed from: w  reason: collision with root package name */
    public final MaterialButton f21506w;

    /* renamed from: x  reason: collision with root package name */
    public final MaterialButton f21507x;

    /* renamed from: y  reason: collision with root package name */
    public final LinearLayout f21508y;

    /* renamed from: z  reason: collision with root package name */
    public final LinearLayout f21509z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z(Object obj, View view, MaterialButton materialButton, MaterialButton materialButton2, LinearLayout linearLayout, LinearLayout linearLayout2, RelativeLayout relativeLayout, RecyclerView recyclerView, RecyclerView recyclerView2, RecyclerView recyclerView3, NestedScrollView nestedScrollView, SearchView searchView, a aVar, TextView textView, TextView textView2) {
        super(0, view, obj);
        Object obj2 = obj;
        View view2 = view;
        this.f21506w = materialButton;
        this.f21507x = materialButton2;
        this.f21508y = linearLayout;
        this.f21509z = linearLayout2;
        this.A = relativeLayout;
        this.B = recyclerView;
        this.C = recyclerView2;
        this.D = recyclerView3;
        this.E = nestedScrollView;
        this.F = searchView;
        this.G = aVar;
        this.H = textView;
        this.I = textView2;
    }
}
