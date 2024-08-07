package i3;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.transition.R$id;
import java.util.ArrayList;
import z.d;

@SuppressLint({"ViewConstructor"})
/* compiled from: GhostViewHolder */
public final class f extends FrameLayout {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f11035c = 0;

    /* renamed from: a  reason: collision with root package name */
    public ViewGroup f11036a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f11037b = true;

    public f(ViewGroup viewGroup) {
        super(viewGroup.getContext());
        setClipChildren(false);
        this.f11036a = viewGroup;
        viewGroup.setTag(R$id.ghost_view_holder, this);
        ((ViewGroupOverlay) new d(this.f11036a).f17746a).add(this);
    }

    public static void a(View view, ArrayList<View> arrayList) {
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            a((View) parent, arrayList);
        }
        arrayList.add(view);
    }

    public final void onViewAdded(View view) {
        if (this.f11037b) {
            super.onViewAdded(view);
            return;
        }
        throw new IllegalStateException("This GhostViewHolder is detached!");
    }

    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if ((getChildCount() == 1 && getChildAt(0) == view) || getChildCount() == 0) {
            this.f11036a.setTag(R$id.ghost_view_holder, (Object) null);
            ((ViewGroupOverlay) new d(this.f11036a).f17746a).remove(this);
            this.f11037b = false;
        }
    }
}
