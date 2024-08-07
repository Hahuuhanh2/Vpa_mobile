package f8;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.material.search.SearchBar;

/* compiled from: MaterialMainContainerBackHelper */
public final class f extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f10055a;

    public f(SearchBar searchBar) {
        this.f10055a = searchBar;
    }

    public final void onAnimationEnd(Animator animator) {
        View view = this.f10055a;
        if (view != null) {
            view.setVisibility(0);
        }
    }
}
