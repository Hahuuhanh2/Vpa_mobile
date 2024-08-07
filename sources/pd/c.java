package pd;

import cd.b;
import com.google.zxing.NotFoundException;
import uc.j;

/* compiled from: BoundingBox */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final b f14146a;

    /* renamed from: b  reason: collision with root package name */
    public final j f14147b;

    /* renamed from: c  reason: collision with root package name */
    public final j f14148c;

    /* renamed from: d  reason: collision with root package name */
    public final j f14149d;

    /* renamed from: e  reason: collision with root package name */
    public final j f14150e;

    /* renamed from: f  reason: collision with root package name */
    public final int f14151f;

    /* renamed from: g  reason: collision with root package name */
    public final int f14152g;

    /* renamed from: h  reason: collision with root package name */
    public final int f14153h;

    /* renamed from: i  reason: collision with root package name */
    public final int f14154i;

    public c(b bVar, j jVar, j jVar2, j jVar3, j jVar4) {
        boolean z10 = false;
        boolean z11 = jVar == null || jVar2 == null;
        z10 = (jVar3 == null || jVar4 == null) ? true : z10;
        if (!z11 || !z10) {
            if (z11) {
                jVar = new j(0.0f, jVar3.f15489b);
                jVar2 = new j(0.0f, jVar4.f15489b);
            } else if (z10) {
                int i10 = bVar.f4689a;
                jVar3 = new j((float) (i10 - 1), jVar.f15489b);
                jVar4 = new j((float) (i10 - 1), jVar2.f15489b);
            }
            this.f14146a = bVar;
            this.f14147b = jVar;
            this.f14148c = jVar2;
            this.f14149d = jVar3;
            this.f14150e = jVar4;
            this.f14151f = (int) Math.min(jVar.f15488a, jVar2.f15488a);
            this.f14152g = (int) Math.max(jVar3.f15488a, jVar4.f15488a);
            this.f14153h = (int) Math.min(jVar.f15489b, jVar3.f15489b);
            this.f14154i = (int) Math.max(jVar2.f15489b, jVar4.f15489b);
            return;
        }
        throw NotFoundException.f7967c;
    }

    public c(c cVar) {
        this.f14146a = cVar.f14146a;
        this.f14147b = cVar.f14147b;
        this.f14148c = cVar.f14148c;
        this.f14149d = cVar.f14149d;
        this.f14150e = cVar.f14150e;
        this.f14151f = cVar.f14151f;
        this.f14152g = cVar.f14152g;
        this.f14153h = cVar.f14153h;
        this.f14154i = cVar.f14154i;
    }
}
