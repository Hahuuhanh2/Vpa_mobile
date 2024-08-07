package xk;

import com.ots.base.utils.customview.bottomnavigationbar.CurvedBottomNavigationView;
import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;
import rk.l;
import w1.j0;

/* compiled from: Sequences.kt */
public final class d<T> implements e<T> {

    /* renamed from: a  reason: collision with root package name */
    public final e<T> f23487a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f23488b = true;

    /* renamed from: c  reason: collision with root package name */
    public final l<T, Boolean> f23489c;

    /* compiled from: Sequences.kt */
    public static final class a implements Iterator<T>, j$.util.Iterator {

        /* renamed from: a  reason: collision with root package name */
        public final Iterator<T> f23490a;

        /* renamed from: b  reason: collision with root package name */
        public int f23491b = -1;

        /* renamed from: c  reason: collision with root package name */
        public T f23492c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ d<T> f23493d;

        public a(d<T> dVar) {
            this.f23493d = dVar;
            this.f23490a = dVar.f23487a.iterator();
        }

        public final void a() {
            while (this.f23490a.hasNext()) {
                T next = this.f23490a.next();
                if (this.f23493d.f23489c.invoke(next).booleanValue() == this.f23493d.f23488b) {
                    this.f23492c = next;
                    this.f23491b = 1;
                    return;
                }
            }
            this.f23491b = 0;
        }

        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        public final boolean hasNext() {
            if (this.f23491b == -1) {
                a();
            }
            if (this.f23491b == 1) {
                return true;
            }
            return false;
        }

        public final T next() {
            if (this.f23491b == -1) {
                a();
            }
            if (this.f23491b != 0) {
                T t10 = this.f23492c;
                this.f23492c = null;
                this.f23491b = -1;
                return t10;
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public d(j0 j0Var, CurvedBottomNavigationView.a aVar) {
        this.f23487a = j0Var;
        this.f23489c = aVar;
    }

    public final java.util.Iterator<T> iterator() {
        return new a(this);
    }
}
