package ig;

import sk.j;
import v.v;

/* compiled from: TimeModel.kt */
public abstract class h {

    /* compiled from: TimeModel.kt */
    public static final class a extends h implements eg.a {

        /* renamed from: a  reason: collision with root package name */
        public final int f20555a;

        /* renamed from: b  reason: collision with root package name */
        public final String f20556b;

        /* renamed from: c  reason: collision with root package name */
        public final int f20557c;

        public a(int i10, int i11, String str) {
            this.f20555a = i10;
            this.f20556b = str;
            this.f20557c = i11;
        }

        public final String a() {
            return this.f20556b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f20555a == aVar.f20555a && j.a(this.f20556b, aVar.f20556b) && this.f20557c == aVar.f20557c) {
                return true;
            }
            return false;
        }

        public final int getIndex() {
            return this.f20555a;
        }

        public final int hashCode() {
            int i10;
            int i11 = this.f20555a * 31;
            String str = this.f20556b;
            if (str != null) {
                i10 = str.hashCode();
            } else {
                i10 = 0;
            }
            return ((i11 + i10) * 31) + this.f20557c;
        }

        public final String toString() {
            StringBuilder q10 = android.support.v4.media.a.q("Hour(index=");
            q10.append(this.f20555a);
            q10.append(", displayValue=");
            q10.append(this.f20556b);
            q10.append(", hour=");
            return v.e(q10, this.f20557c, ")");
        }
    }

    /* compiled from: TimeModel.kt */
    public static final class b extends h implements eg.a {

        /* renamed from: a  reason: collision with root package name */
        public final int f20558a;

        /* renamed from: b  reason: collision with root package name */
        public final String f20559b;

        /* renamed from: c  reason: collision with root package name */
        public final int f20560c;

        public b(int i10, int i11, String str) {
            this.f20558a = i10;
            this.f20559b = str;
            this.f20560c = i11;
        }

        public final String a() {
            return this.f20559b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f20558a == bVar.f20558a && j.a(this.f20559b, bVar.f20559b) && this.f20560c == bVar.f20560c) {
                return true;
            }
            return false;
        }

        public final int getIndex() {
            return this.f20558a;
        }

        public final int hashCode() {
            int i10;
            int i11 = this.f20558a * 31;
            String str = this.f20559b;
            if (str != null) {
                i10 = str.hashCode();
            } else {
                i10 = 0;
            }
            return ((i11 + i10) * 31) + this.f20560c;
        }

        public final String toString() {
            StringBuilder q10 = android.support.v4.media.a.q("Minute(index=");
            q10.append(this.f20558a);
            q10.append(", displayValue=");
            q10.append(this.f20559b);
            q10.append(", minute=");
            return v.e(q10, this.f20560c, ")");
        }
    }

    /* compiled from: TimeModel.kt */
    public static final class c extends h implements eg.a {

        /* renamed from: a  reason: collision with root package name */
        public final int f20561a;

        /* renamed from: b  reason: collision with root package name */
        public final String f20562b;

        /* renamed from: c  reason: collision with root package name */
        public final int f20563c;

        public c(int i10, int i11, String str) {
            j.f(str, "displayValue");
            this.f20561a = i10;
            this.f20562b = str;
            this.f20563c = i11;
        }

        public final String a() {
            return this.f20562b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (this.f20561a == cVar.f20561a && j.a(this.f20562b, cVar.f20562b) && this.f20563c == cVar.f20563c) {
                return true;
            }
            return false;
        }

        public final int getIndex() {
            return this.f20561a;
        }

        public final int hashCode() {
            int i10;
            int i11 = this.f20561a * 31;
            String str = this.f20562b;
            if (str != null) {
                i10 = str.hashCode();
            } else {
                i10 = 0;
            }
            return ((i11 + i10) * 31) + this.f20563c;
        }

        public final String toString() {
            StringBuilder q10 = android.support.v4.media.a.q("TimePeriod(index=");
            q10.append(this.f20561a);
            q10.append(", displayValue=");
            q10.append(this.f20562b);
            q10.append(", timePeriod=");
            return v.e(q10, this.f20563c, ")");
        }
    }
}
