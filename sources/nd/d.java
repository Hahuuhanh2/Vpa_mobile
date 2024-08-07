package nd;

import cd.a;
import com.google.zxing.NotFoundException;

/* compiled from: AI01393xDecoder */
public final class d extends g {
    public d(a aVar) {
        super(aVar);
    }

    public final String a() {
        if (this.f13572a.f4688b >= 48) {
            StringBuilder sb2 = new StringBuilder();
            b(8, sb2);
            int c10 = this.f13573b.c(48, 2);
            sb2.append("(393");
            sb2.append(c10);
            sb2.append(')');
            int c11 = this.f13573b.c(50, 10);
            if (c11 / 100 == 0) {
                sb2.append('0');
            }
            if (c11 / 10 == 0) {
                sb2.append('0');
            }
            sb2.append(c11);
            sb2.append(this.f13573b.b(60, (String) null).f13577b);
            return sb2.toString();
        }
        throw NotFoundException.f7967c;
    }
}
