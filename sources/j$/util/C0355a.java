package j$.util;

import j$.util.function.Function;
import j$.util.function.ToDoubleFunction;
import j$.util.function.ToIntFunction;
import j$.util.function.ToLongFunction;
import java.io.Serializable;
import java.util.Comparator;

/* renamed from: j$.util.a  reason: case insensitive filesystem */
public final /* synthetic */ class C0355a implements Comparator, Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f18378a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f18379b;

    public /* synthetic */ C0355a(int i10, Object obj) {
        this.f18378a = i10;
        this.f18379b = obj;
    }

    public final int compare(Object obj, Object obj2) {
        switch (this.f18378a) {
            case 0:
                ToDoubleFunction toDoubleFunction = (ToDoubleFunction) this.f18379b;
                return Double.compare(toDoubleFunction.applyAsDouble(obj), toDoubleFunction.applyAsDouble(obj2));
            case 1:
                ToIntFunction toIntFunction = (ToIntFunction) this.f18379b;
                return Integer.compare(toIntFunction.applyAsInt(obj), toIntFunction.applyAsInt(obj2));
            case 2:
                ToLongFunction toLongFunction = (ToLongFunction) this.f18379b;
                return Long.compare(toLongFunction.applyAsLong(obj), toLongFunction.applyAsLong(obj2));
            default:
                Function function = (Function) this.f18379b;
                return ((Comparable) function.apply(obj)).compareTo(function.apply(obj2));
        }
    }
}
