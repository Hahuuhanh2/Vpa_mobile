package xd;

import h4.i;
import uc.c;
import uc.e;
import uc.f;
import vl.d;

/* compiled from: MixedDecoder */
public final class j extends e {

    /* renamed from: c  reason: collision with root package name */
    public boolean f17304c = true;

    public j(e eVar) {
        super(eVar);
    }

    public final d b(f fVar) {
        if (this.f17304c) {
            this.f17304c = false;
            return new d((i) new cd.f(new c(fVar)));
        }
        this.f17304c = true;
        return new d((i) new cd.f(fVar));
    }
}
