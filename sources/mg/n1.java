package mg;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.ots.base.utils.customview.GradientTextView;
import com.ots.core.utils.customview.textview.AppTextView;
import com.vpa.daugia.module.auction.ui.viewmodel.AuctionRoomViewModel;
import d2.l;
import ug.f;

/* compiled from: ActivitySessionAuctionBinding */
public abstract class n1 extends l {
    public final LinearLayout A;
    public final RecyclerView B;
    public final RecyclerView C;
    public final AppTextView D;
    public final AppTextView E;
    public final AppTextView F;
    public final AppTextView G;
    public final GradientTextView H;
    public AuctionRoomViewModel I;
    public f J;

    /* renamed from: w  reason: collision with root package name */
    public final MaterialButton f21241w;

    /* renamed from: x  reason: collision with root package name */
    public final ImageButton f21242x;

    /* renamed from: y  reason: collision with root package name */
    public final ImageView f21243y;

    /* renamed from: z  reason: collision with root package name */
    public final ImageView f21244z;

    public n1(Object obj, View view, MaterialButton materialButton, ImageButton imageButton, ImageView imageView, ImageView imageView2, LinearLayout linearLayout, RecyclerView recyclerView, RecyclerView recyclerView2, AppTextView appTextView, AppTextView appTextView2, AppTextView appTextView3, AppTextView appTextView4, GradientTextView gradientTextView) {
        super(4, view, obj);
        this.f21241w = materialButton;
        this.f21242x = imageButton;
        this.f21243y = imageView;
        this.f21244z = imageView2;
        this.A = linearLayout;
        this.B = recyclerView;
        this.C = recyclerView2;
        this.D = appTextView;
        this.E = appTextView2;
        this.F = appTextView3;
        this.G = appTextView4;
        this.H = gradientTextView;
    }

    public abstract void v(f fVar);

    public abstract void w(AuctionRoomViewModel auctionRoomViewModel);
}
