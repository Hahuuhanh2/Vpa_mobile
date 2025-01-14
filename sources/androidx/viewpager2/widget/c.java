package androidx.viewpager2.widget;

import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* compiled from: CompositeOnPageChangeCallback */
public final class c extends ViewPager2.g {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f3627a = new ArrayList(3);

    public final void a(int i10) {
        try {
            Iterator it = this.f3627a.iterator();
            while (it.hasNext()) {
                ((ViewPager2.g) it.next()).a(i10);
            }
        } catch (ConcurrentModificationException e10) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e10);
        }
    }

    public final void b(float f10, int i10, int i11) {
        try {
            Iterator it = this.f3627a.iterator();
            while (it.hasNext()) {
                ((ViewPager2.g) it.next()).b(f10, i10, i11);
            }
        } catch (ConcurrentModificationException e10) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e10);
        }
    }

    public final void c(int i10) {
        try {
            Iterator it = this.f3627a.iterator();
            while (it.hasNext()) {
                ((ViewPager2.g) it.next()).c(i10);
            }
        } catch (ConcurrentModificationException e10) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e10);
        }
    }
}
