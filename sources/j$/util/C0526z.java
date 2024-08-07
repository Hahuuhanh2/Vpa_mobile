package j$.util;

import java.util.Collection;
import java.util.Comparator;
import java.util.SortedSet;

/* renamed from: j$.util.z  reason: case insensitive filesystem */
final class C0526z extends Z {

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ SortedSet f18950f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0526z(SortedSet sortedSet, Collection collection) {
        super(collection, 21);
        this.f18950f = sortedSet;
    }

    public final Comparator getComparator() {
        return this.f18950f.comparator();
    }
}
