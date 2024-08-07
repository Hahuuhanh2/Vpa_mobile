package g9;

import java.util.List;
import java.util.Objects;
import w8.g;

/* compiled from: MonitoringKeysetInfo */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final a f10400a;

    /* renamed from: b  reason: collision with root package name */
    public final List<a> f10401b;

    /* renamed from: c  reason: collision with root package name */
    public final Integer f10402c;

    /* compiled from: MonitoringKeysetInfo */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final g f10403a;

        /* renamed from: b  reason: collision with root package name */
        public final int f10404b;

        /* renamed from: c  reason: collision with root package name */
        public final String f10405c;

        /* renamed from: d  reason: collision with root package name */
        public final String f10406d;

        public a(g gVar, int i10, String str, String str2) {
            this.f10403a = gVar;
            this.f10404b = i10;
            this.f10405c = str;
            this.f10406d = str2;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f10403a != aVar.f10403a || this.f10404b != aVar.f10404b || !this.f10405c.equals(aVar.f10405c) || !this.f10406d.equals(aVar.f10406d)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return Objects.hash(new Object[]{this.f10403a, Integer.valueOf(this.f10404b), this.f10405c, this.f10406d});
        }

        public final String toString() {
            return String.format("(status=%s, keyId=%s, keyType='%s', keyPrefix='%s')", new Object[]{this.f10403a, Integer.valueOf(this.f10404b), this.f10405c, this.f10406d});
        }
    }

    public c() {
        throw null;
    }

    public c(a aVar, List list, Integer num) {
        this.f10400a = aVar;
        this.f10401b = list;
        this.f10402c = num;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!this.f10400a.equals(cVar.f10400a) || !this.f10401b.equals(cVar.f10401b) || !Objects.equals(this.f10402c, cVar.f10402c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f10400a, this.f10401b});
    }

    public final String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", new Object[]{this.f10400a, this.f10401b, this.f10402c});
    }
}
