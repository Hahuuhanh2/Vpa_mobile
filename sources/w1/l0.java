package w1;

import android.view.View;
import android.view.ViewGroup;
import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;

/* compiled from: ViewGroup.kt */
public final class l0 implements Iterator<View>, j$.util.Iterator {

    /* renamed from: a  reason: collision with root package name */
    public int f16334a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f16335b;

    public l0(ViewGroup viewGroup) {
        this.f16335b = viewGroup;
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    public final boolean hasNext() {
        if (this.f16334a < this.f16335b.getChildCount()) {
            return true;
        }
        return false;
    }

    public final Object next() {
        ViewGroup viewGroup = this.f16335b;
        int i10 = this.f16334a;
        this.f16334a = i10 + 1;
        View childAt = viewGroup.getChildAt(i10);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException();
    }

    public final void remove() {
        ViewGroup viewGroup = this.f16335b;
        int i10 = this.f16334a - 1;
        this.f16334a = i10;
        viewGroup.removeViewAt(i10);
    }
}
