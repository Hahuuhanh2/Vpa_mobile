package j$.util;

import j$.util.function.Function;
import java.io.Serializable;
import java.util.Comparator;

/* renamed from: j$.util.b  reason: case insensitive filesystem */
public final /* synthetic */ class C0356b implements Comparator, Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f18384a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Comparator f18385b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f18386c;

    public /* synthetic */ C0356b(Comparator comparator, Object obj, int i10) {
        this.f18384a = i10;
        this.f18385b = comparator;
        this.f18386c = obj;
    }

    public final int compare(Object obj, Object obj2) {
        switch (this.f18384a) {
            case 0:
                Comparator comparator = this.f18385b;
                Comparator comparator2 = (Comparator) this.f18386c;
                int compare = comparator.compare(obj, obj2);
                return compare != 0 ? compare : comparator2.compare(obj, obj2);
            default:
                Comparator comparator3 = this.f18385b;
                Function function = (Function) this.f18386c;
                return comparator3.compare(function.apply(obj), function.apply(obj2));
        }
    }
}
