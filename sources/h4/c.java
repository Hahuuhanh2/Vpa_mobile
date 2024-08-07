package h4;

import e4.a;
import e4.e;
import e4.n;
import java.util.ArrayList;
import java.util.List;

/* compiled from: AnimatableGradientColorValue */
public final class c extends i {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f10545c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i10, ArrayList arrayList) {
        super(arrayList, 0);
        this.f10545c = i10;
    }

    public final a a() {
        switch (this.f10545c) {
            case 0:
                return new e(0, (List) this.f10560b);
            case 1:
                return new e(1, (List) this.f10560b);
            default:
                return new n((List) this.f10560b);
        }
    }
}
