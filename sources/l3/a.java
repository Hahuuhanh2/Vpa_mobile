package l3;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;

/* compiled from: PagerAdapter */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public final DataSetObservable f12648a = new DataSetObservable();

    public void a() {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    public void b() {
    }

    public abstract void c();

    public int d() {
        return -1;
    }

    public CharSequence e() {
        return null;
    }

    public float f() {
        return 1.0f;
    }

    public Object g() {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    public abstract boolean h();

    public void i(DataSetObserver dataSetObserver) {
        this.f12648a.registerObserver(dataSetObserver);
    }

    public void j() {
    }

    public Parcelable k() {
        return null;
    }

    public void l() {
    }

    public void m(DataSetObserver dataSetObserver) {
        synchronized (this) {
        }
    }

    public void n() {
    }

    public void o(DataSetObserver dataSetObserver) {
        this.f12648a.unregisterObserver(dataSetObserver);
    }
}
