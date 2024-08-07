package h4;

import e4.a;
import e4.f;
import e4.j;
import java.util.List;

/* compiled from: AnimatableIntegerValue */
public final class d extends i {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f10546c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i10, List list) {
        super(list, 0);
        this.f10546c = i10;
    }

    public final a a() {
        switch (this.f10546c) {
            case 0:
                return new f((List) this.f10560b);
            default:
                return new j((List) this.f10560b);
        }
    }
}
