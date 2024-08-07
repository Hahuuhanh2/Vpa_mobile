package hg;

import sk.j;
import v.v;

/* compiled from: DateModel.kt */
public abstract class a {

    /* renamed from: hg.a$a  reason: collision with other inner class name */
    /* compiled from: DateModel.kt */
    public static final class C0287a extends a implements eg.a {

        /* renamed from: a  reason: collision with root package name */
        public final int f20503a;

        /* renamed from: b  reason: collision with root package name */
        public final String f20504b;

        /* renamed from: c  reason: collision with root package name */
        public final int f20505c;

        public C0287a(int i10, int i11, String str) {
            this.f20503a = i10;
            this.f20504b = str;
            this.f20505c = i11;
        }

        public final String a() {
            return this.f20504b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0287a)) {
                return false;
            }
            C0287a aVar = (C0287a) obj;
            if (this.f20503a == aVar.f20503a && j.a(this.f20504b, aVar.f20504b) && this.f20505c == aVar.f20505c) {
                return true;
            }
            return false;
        }

        public final int getIndex() {
            return this.f20503a;
        }

        public final int hashCode() {
            int i10;
            int i11 = this.f20503a * 31;
            String str = this.f20504b;
            if (str != null) {
                i10 = str.hashCode();
            } else {
                i10 = 0;
            }
            return ((i11 + i10) * 31) + this.f20505c;
        }

        public final String toString() {
            StringBuilder q10 = android.support.v4.media.a.q("Day(index=");
            q10.append(this.f20503a);
            q10.append(", displayValue=");
            q10.append(this.f20504b);
            q10.append(", day=");
            return v.e(q10, this.f20505c, ")");
        }
    }

    /* compiled from: DateModel.kt */
    public static final class b extends a implements eg.a {

        /* renamed from: a  reason: collision with root package name */
        public final int f20506a;

        /* renamed from: b  reason: collision with root package name */
        public final String f20507b;

        /* renamed from: c  reason: collision with root package name */
        public final int f20508c;

        public b(int i10, int i11, String str) {
            this.f20506a = i10;
            this.f20507b = str;
            this.f20508c = i11;
        }

        public final String a() {
            return this.f20507b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f20506a == bVar.f20506a && j.a(this.f20507b, bVar.f20507b) && this.f20508c == bVar.f20508c) {
                return true;
            }
            return false;
        }

        public final int getIndex() {
            return this.f20506a;
        }

        public final int hashCode() {
            int i10;
            int i11 = this.f20506a * 31;
            String str = this.f20507b;
            if (str != null) {
                i10 = str.hashCode();
            } else {
                i10 = 0;
            }
            return ((i11 + i10) * 31) + this.f20508c;
        }

        public final String toString() {
            StringBuilder q10 = android.support.v4.media.a.q("Month(index=");
            q10.append(this.f20506a);
            q10.append(", displayValue=");
            q10.append(this.f20507b);
            q10.append(", month=");
            return v.e(q10, this.f20508c, ")");
        }
    }

    /* compiled from: DateModel.kt */
    public static final class c extends a implements eg.a {

        /* renamed from: a  reason: collision with root package name */
        public final int f20509a;

        /* renamed from: b  reason: collision with root package name */
        public final String f20510b;

        /* renamed from: c  reason: collision with root package name */
        public final int f20511c;

        public c(int i10, int i11, String str) {
            this.f20509a = i10;
            this.f20510b = str;
            this.f20511c = i11;
        }

        public final String a() {
            return this.f20510b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (this.f20509a == cVar.f20509a && j.a(this.f20510b, cVar.f20510b) && this.f20511c == cVar.f20511c) {
                return true;
            }
            return false;
        }

        public final int getIndex() {
            return this.f20509a;
        }

        public final int hashCode() {
            int i10;
            int i11 = this.f20509a * 31;
            String str = this.f20510b;
            if (str != null) {
                i10 = str.hashCode();
            } else {
                i10 = 0;
            }
            return ((i11 + i10) * 31) + this.f20511c;
        }

        public final String toString() {
            StringBuilder q10 = android.support.v4.media.a.q("Year(index=");
            q10.append(this.f20509a);
            q10.append(", displayValue=");
            q10.append(this.f20510b);
            q10.append(", year=");
            return v.e(q10, this.f20511c, ")");
        }
    }
}
