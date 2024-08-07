package m3;

import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

/* compiled from: FragmentStateAdapter */
public final class b extends FragmentManager.k {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Fragment f13109a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ FrameLayout f13110b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ a f13111c;

    public b(a aVar, Fragment fragment, FrameLayout frameLayout) {
        this.f13111c = aVar;
        this.f13109a = fragment;
        this.f13110b = frameLayout;
    }

    public final void c(FragmentManager fragmentManager, Fragment fragment, View view) {
        if (fragment == this.f13109a) {
            fragmentManager.f0(this);
            a aVar = this.f13111c;
            FrameLayout frameLayout = this.f13110b;
            aVar.getClass();
            a.t(view, frameLayout);
        }
    }
}
