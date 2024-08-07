package mg;

import android.view.View;
import android.widget.LinearLayout;
import androidx.viewpager2.widget.ViewPager2;
import bi.a;
import com.google.android.material.tabs.TabLayout;
import d2.l;

/* compiled from: ActivityPaymentBinding */
public abstract class q0 extends l {
    public a A;

    /* renamed from: w  reason: collision with root package name */
    public final LinearLayout f21300w;

    /* renamed from: x  reason: collision with root package name */
    public final TabLayout f21301x;

    /* renamed from: y  reason: collision with root package name */
    public final h1.a f21302y;

    /* renamed from: z  reason: collision with root package name */
    public final ViewPager2 f21303z;

    public q0(Object obj, View view, LinearLayout linearLayout, TabLayout tabLayout, h1.a aVar, ViewPager2 viewPager2) {
        super(0, view, obj);
        this.f21300w = linearLayout;
        this.f21301x = tabLayout;
        this.f21302y = aVar;
        this.f21303z = viewPager2;
    }

    public abstract void v(a aVar);
}
