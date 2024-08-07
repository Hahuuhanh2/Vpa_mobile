package mg;

import android.view.View;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel;
import d2.l;

/* compiled from: DemoInputViewBinding */
public abstract class i2 extends l {

    /* renamed from: w  reason: collision with root package name */
    public final MaterialButton f21108w;

    /* renamed from: x  reason: collision with root package name */
    public final RelativeLayout f21109x;

    /* renamed from: y  reason: collision with root package name */
    public final RecyclerView f21110y;

    public i2(Object obj, View view, MaterialButton materialButton, RelativeLayout relativeLayout, RecyclerView recyclerView) {
        super(0, view, obj);
        this.f21108w = materialButton;
        this.f21109x = relativeLayout;
        this.f21110y = recyclerView;
    }

    public abstract void v(LoginViewModel loginViewModel);
}
