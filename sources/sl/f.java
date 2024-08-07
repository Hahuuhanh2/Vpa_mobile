package sl;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import nl.d;
import nl.k;

/* compiled from: ZoneRules */
public abstract class f {

    /* compiled from: ZoneRules */
    public static final class a extends f implements Serializable {

        /* renamed from: a  reason: collision with root package name */
        public final k f22960a;

        public a(k kVar) {
            this.f22960a = kVar;
        }

        public final k a(d dVar) {
            return this.f22960a;
        }

        public final d b(nl.f fVar) {
            return null;
        }

        public final List<k> c(nl.f fVar) {
            return Collections.singletonList(this.f22960a);
        }

        public final boolean d() {
            return true;
        }

        public final boolean e(nl.f fVar, k kVar) {
            return this.f22960a.equals(kVar);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                return this.f22960a.equals(((a) obj).f22960a);
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (!bVar.d() || !this.f22960a.equals(bVar.a(d.f21749c))) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            int i10 = this.f22960a.f21779b;
            return ((i10 + 31) ^ (((i10 + 31) ^ 1) ^ 1)) ^ 1;
        }

        public final String toString() {
            StringBuilder q10 = android.support.v4.media.a.q("FixedRules:");
            q10.append(this.f22960a);
            return q10.toString();
        }
    }

    public abstract k a(d dVar);

    public abstract d b(nl.f fVar);

    public abstract List<k> c(nl.f fVar);

    public abstract boolean d();

    public abstract boolean e(nl.f fVar, k kVar);
}
