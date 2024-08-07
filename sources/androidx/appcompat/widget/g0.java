package androidx.appcompat.widget;

import android.view.View;

/* compiled from: ScrollingTabContainerView */
public final class g0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f1112a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ScrollingTabContainerView f1113b;

    public g0(ScrollingTabContainerView scrollingTabContainerView, View view) {
        this.f1113b = scrollingTabContainerView;
        this.f1112a = view;
    }

    public final void run() {
        this.f1113b.smoothScrollTo(this.f1112a.getLeft() - ((this.f1113b.getWidth() - this.f1112a.getWidth()) / 2), 0);
        this.f1113b.f920a = null;
    }
}
