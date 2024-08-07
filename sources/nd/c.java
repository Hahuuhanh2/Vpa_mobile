package nd;

import cd.a;
import com.google.zxing.NotFoundException;

/* compiled from: AI01392xDecoder */
public final class c extends g {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f13569c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i10, a aVar) {
        super(aVar);
        this.f13569c = i10;
    }

    public final String a() {
        switch (this.f13569c) {
            case 0:
                if (this.f13572a.f4688b >= 48) {
                    StringBuilder sb2 = new StringBuilder();
                    b(8, sb2);
                    int c10 = this.f13573b.c(48, 2);
                    sb2.append("(392");
                    sb2.append(c10);
                    sb2.append(')');
                    sb2.append(this.f13573b.b(50, (String) null).f13577b);
                    return sb2.toString();
                }
                throw NotFoundException.f7967c;
            default:
                StringBuilder q10 = android.support.v4.media.a.q("(01)");
                int length = q10.length();
                q10.append(this.f13573b.c(4, 4));
                c(q10, 8, length);
                return this.f13573b.a(48, q10);
        }
    }
}
