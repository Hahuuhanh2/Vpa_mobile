package f;

import androidx.activity.result.ActivityResult;
import androidx.lifecycle.i;
import androidx.lifecycle.n;
import f.f;
import g.a;
import r2.l;

/* compiled from: ActivityResultRegistry */
public final class c implements n {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f9493a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a f9494b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ a f9495c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ f f9496d;

    public c(f fVar, String str, a aVar, a aVar2) {
        this.f9496d = fVar;
        this.f9493a = str;
        this.f9494b = aVar;
        this.f9495c = aVar2;
    }

    public final void q(l lVar, i.a aVar) {
        if (i.a.ON_START.equals(aVar)) {
            this.f9496d.f9507e.put(this.f9493a, new f.a(this.f9494b, this.f9495c));
            if (this.f9496d.f9508f.containsKey(this.f9493a)) {
                Object obj = this.f9496d.f9508f.get(this.f9493a);
                this.f9496d.f9508f.remove(this.f9493a);
                this.f9494b.b(obj);
            }
            ActivityResult activityResult = (ActivityResult) this.f9496d.f9509g.getParcelable(this.f9493a);
            if (activityResult != null) {
                this.f9496d.f9509g.remove(this.f9493a);
                this.f9494b.b(this.f9495c.c(activityResult.f304b, activityResult.f303a));
            }
        } else if (i.a.ON_STOP.equals(aVar)) {
            this.f9496d.f9507e.remove(this.f9493a);
        } else if (i.a.ON_DESTROY.equals(aVar)) {
            this.f9496d.f(this.f9493a);
        }
    }
}
