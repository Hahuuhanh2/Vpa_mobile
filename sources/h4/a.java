package h4;

import e4.b;
import e4.k;
import java.util.ArrayList;
import java.util.List;

/* compiled from: AnimatableColorValue */
public final class a extends i {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f10544c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i10, ArrayList arrayList) {
        super(arrayList, 0);
        this.f10544c = i10;
    }

    public final e4.a a() {
        switch (this.f10544c) {
            case 0:
                return new b((List) this.f10560b);
            default:
                return new k((List) this.f10560b);
        }
    }
}
