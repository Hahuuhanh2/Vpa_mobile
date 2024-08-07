package nd;

import cd.a;
import com.google.zxing.NotFoundException;

/* compiled from: AI013x0xDecoder */
public abstract class f extends h {
    public f(a aVar) {
        super(aVar);
    }

    public final String a() {
        if (this.f13572a.f4688b == 60) {
            StringBuilder sb2 = new StringBuilder();
            b(5, sb2);
            f(sb2, 45, 15);
            return sb2.toString();
        }
        throw NotFoundException.f7967c;
    }
}
