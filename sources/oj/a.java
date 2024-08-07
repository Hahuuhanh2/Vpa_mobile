package oj;

import f0.b0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import n0.l;
import p3.l0;
import sk.j;

/* compiled from: QRContent.kt */
public abstract class a {

    /* renamed from: oj.a$a  reason: collision with other inner class name */
    /* compiled from: QRContent.kt */
    public static final class C0294a extends a {

        /* renamed from: a  reason: collision with root package name */
        public final byte[] f21820a;

        /* renamed from: b  reason: collision with root package name */
        public final String f21821b;

        /* renamed from: c  reason: collision with root package name */
        public final String f21822c;

        /* renamed from: d  reason: collision with root package name */
        public final C0295a f21823d;

        /* renamed from: e  reason: collision with root package name */
        public final String f21824e;

        /* renamed from: f  reason: collision with root package name */
        public final String f21825f;

        /* renamed from: g  reason: collision with root package name */
        public final C0295a f21826g;

        /* renamed from: h  reason: collision with root package name */
        public final String f21827h;

        /* renamed from: i  reason: collision with root package name */
        public final String f21828i;

        /* renamed from: oj.a$a$a  reason: collision with other inner class name */
        /* compiled from: QRContent.kt */
        public static final class C0295a {

            /* renamed from: a  reason: collision with root package name */
            public final int f21829a;

            /* renamed from: b  reason: collision with root package name */
            public final int f21830b;

            /* renamed from: c  reason: collision with root package name */
            public final int f21831c;

            /* renamed from: d  reason: collision with root package name */
            public final int f21832d;

            /* renamed from: e  reason: collision with root package name */
            public final int f21833e;

            /* renamed from: f  reason: collision with root package name */
            public final int f21834f;

            /* renamed from: g  reason: collision with root package name */
            public final boolean f21835g;

            public C0295a(int i10, int i11, int i12, int i13, int i14, int i15, boolean z10) {
                this.f21829a = i10;
                this.f21830b = i11;
                this.f21831c = i12;
                this.f21832d = i13;
                this.f21833e = i14;
                this.f21834f = i15;
                this.f21835g = z10;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0295a)) {
                    return false;
                }
                C0295a aVar = (C0295a) obj;
                return this.f21829a == aVar.f21829a && this.f21830b == aVar.f21830b && this.f21831c == aVar.f21831c && this.f21832d == aVar.f21832d && this.f21833e == aVar.f21833e && this.f21834f == aVar.f21834f && this.f21835g == aVar.f21835g;
            }

            public final int hashCode() {
                int i10 = ((((((((((this.f21829a * 31) + this.f21830b) * 31) + this.f21831c) * 31) + this.f21832d) * 31) + this.f21833e) * 31) + this.f21834f) * 31;
                boolean z10 = this.f21835g;
                if (z10) {
                    z10 = true;
                }
                return i10 + (z10 ? 1 : 0);
            }

            public final String toString() {
                int i10 = this.f21829a;
                int i11 = this.f21830b;
                int i12 = this.f21831c;
                int i13 = this.f21832d;
                int i14 = this.f21833e;
                int i15 = this.f21834f;
                boolean z10 = this.f21835g;
                StringBuilder u10 = b0.u("CalendarDateTime(day=", i10, ", hours=", i11, ", minutes=");
                u10.append(i12);
                u10.append(", month=");
                u10.append(i13);
                u10.append(", seconds=");
                u10.append(i14);
                u10.append(", year=");
                u10.append(i15);
                u10.append(", utc=");
                u10.append(z10);
                u10.append(")");
                return u10.toString();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0294a(byte[] bArr, String str, String str2, C0295a aVar, String str3, String str4, C0295a aVar2, String str5, String str6) {
            super(str);
            j.f(str2, "description");
            j.f(str3, "location");
            j.f(str4, "organizer");
            j.f(str5, "status");
            j.f(str6, "summary");
            this.f21820a = bArr;
            this.f21821b = str;
            this.f21822c = str2;
            this.f21823d = aVar;
            this.f21824e = str3;
            this.f21825f = str4;
            this.f21826g = aVar2;
            this.f21827h = str5;
            this.f21828i = str6;
        }

        public final String a() {
            return this.f21821b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0294a)) {
                return false;
            }
            C0294a aVar = (C0294a) obj;
            return j.a(this.f21820a, aVar.f21820a) && j.a(this.f21821b, aVar.f21821b) && j.a(this.f21822c, aVar.f21822c) && j.a(this.f21823d, aVar.f21823d) && j.a(this.f21824e, aVar.f21824e) && j.a(this.f21825f, aVar.f21825f) && j.a(this.f21826g, aVar.f21826g) && j.a(this.f21827h, aVar.f21827h) && j.a(this.f21828i, aVar.f21828i);
        }

        public final int hashCode() {
            int i10;
            byte[] bArr = this.f21820a;
            int i11 = 0;
            if (bArr == null) {
                i10 = 0;
            } else {
                i10 = Arrays.hashCode(bArr);
            }
            int i12 = i10 * 31;
            String str = this.f21821b;
            if (str != null) {
                i11 = str.hashCode();
            }
            return this.f21828i.hashCode() + l.f(this.f21827h, (this.f21826g.hashCode() + l.f(this.f21825f, l.f(this.f21824e, (this.f21823d.hashCode() + l.f(this.f21822c, (i12 + i11) * 31, 31)) * 31, 31), 31)) * 31, 31);
        }

        public final String toString() {
            String arrays = Arrays.toString(this.f21820a);
            String str = this.f21821b;
            String str2 = this.f21822c;
            C0295a aVar = this.f21823d;
            String str3 = this.f21824e;
            String str4 = this.f21825f;
            C0295a aVar2 = this.f21826g;
            String str5 = this.f21827h;
            String str6 = this.f21828i;
            StringBuilder r10 = android.support.v4.media.a.r("CalendarEvent(rawBytes=", arrays, ", rawValue=", str, ", description=");
            r10.append(str2);
            r10.append(", end=");
            r10.append(aVar);
            r10.append(", location=");
            r10.append(str3);
            r10.append(", organizer=");
            r10.append(str4);
            r10.append(", start=");
            r10.append(aVar2);
            r10.append(", status=");
            r10.append(str5);
            r10.append(", summary=");
            return android.support.v4.media.a.o(r10, str6, ")");
        }
    }

    /* compiled from: QRContent.kt */
    public static final class b extends a {

        /* renamed from: a  reason: collision with root package name */
        public final byte[] f21836a;

        /* renamed from: b  reason: collision with root package name */
        public final String f21837b;

        /* renamed from: c  reason: collision with root package name */
        public final List<C0296a> f21838c;

        /* renamed from: d  reason: collision with root package name */
        public final List<c> f21839d;

        /* renamed from: e  reason: collision with root package name */
        public final C0298b f21840e;

        /* renamed from: f  reason: collision with root package name */
        public final String f21841f;

        /* renamed from: g  reason: collision with root package name */
        public final List<e> f21842g;

        /* renamed from: h  reason: collision with root package name */
        public final String f21843h;

        /* renamed from: i  reason: collision with root package name */
        public final List<String> f21844i;

        /* renamed from: oj.a$b$a  reason: collision with other inner class name */
        /* compiled from: QRContent.kt */
        public static final class C0296a {

            /* renamed from: a  reason: collision with root package name */
            public final List<String> f21845a;

            /* renamed from: b  reason: collision with root package name */
            public final C0297a f21846b;

            /* renamed from: oj.a$b$a$a  reason: collision with other inner class name */
            /* compiled from: QRContent.kt */
            public enum C0297a {
                UNKNOWN;

                /* access modifiers changed from: public */
                static {
                    C0297a[] aVarArr;
                    f21849c = l0.K(aVarArr);
                }
            }

            public C0296a(List<String> list, C0297a aVar) {
                j.f(list, "addressLines");
                j.f(aVar, "type");
                this.f21845a = list;
                this.f21846b = aVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0296a)) {
                    return false;
                }
                C0296a aVar = (C0296a) obj;
                return j.a(this.f21845a, aVar.f21845a) && this.f21846b == aVar.f21846b;
            }

            public final int hashCode() {
                return this.f21846b.hashCode() + (this.f21845a.hashCode() * 31);
            }

            public final String toString() {
                List<String> list = this.f21845a;
                C0297a aVar = this.f21846b;
                return "Address(addressLines=" + list + ", type=" + aVar + ")";
            }
        }

        /* renamed from: oj.a$b$b  reason: collision with other inner class name */
        /* compiled from: QRContent.kt */
        public static final class C0298b {

            /* renamed from: a  reason: collision with root package name */
            public final String f21850a;

            /* renamed from: b  reason: collision with root package name */
            public final String f21851b;

            /* renamed from: c  reason: collision with root package name */
            public final String f21852c;

            /* renamed from: d  reason: collision with root package name */
            public final String f21853d;

            /* renamed from: e  reason: collision with root package name */
            public final String f21854e;

            /* renamed from: f  reason: collision with root package name */
            public final String f21855f;

            /* renamed from: g  reason: collision with root package name */
            public final String f21856g;

            public C0298b(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
                j.f(str, "first");
                j.f(str2, "formattedName");
                j.f(str3, "last");
                j.f(str4, "middle");
                j.f(str5, "prefix");
                j.f(str6, "pronunciation");
                j.f(str7, "suffix");
                this.f21850a = str;
                this.f21851b = str2;
                this.f21852c = str3;
                this.f21853d = str4;
                this.f21854e = str5;
                this.f21855f = str6;
                this.f21856g = str7;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0298b)) {
                    return false;
                }
                C0298b bVar = (C0298b) obj;
                return j.a(this.f21850a, bVar.f21850a) && j.a(this.f21851b, bVar.f21851b) && j.a(this.f21852c, bVar.f21852c) && j.a(this.f21853d, bVar.f21853d) && j.a(this.f21854e, bVar.f21854e) && j.a(this.f21855f, bVar.f21855f) && j.a(this.f21856g, bVar.f21856g);
            }

            public final int hashCode() {
                return this.f21856g.hashCode() + l.f(this.f21855f, l.f(this.f21854e, l.f(this.f21853d, l.f(this.f21852c, l.f(this.f21851b, this.f21850a.hashCode() * 31, 31), 31), 31), 31), 31);
            }

            public final String toString() {
                String str = this.f21850a;
                String str2 = this.f21851b;
                String str3 = this.f21852c;
                String str4 = this.f21853d;
                String str5 = this.f21854e;
                String str6 = this.f21855f;
                String str7 = this.f21856g;
                StringBuilder r10 = android.support.v4.media.a.r("PersonName(first=", str, ", formattedName=", str2, ", last=");
                r10.append(str3);
                r10.append(", middle=");
                r10.append(str4);
                r10.append(", prefix=");
                r10.append(str5);
                r10.append(", pronunciation=");
                r10.append(str6);
                r10.append(", suffix=");
                return android.support.v4.media.a.o(r10, str7, ")");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(byte[] bArr, String str, ArrayList arrayList, ArrayList arrayList2, C0298b bVar, String str2, ArrayList arrayList3, String str3, List list) {
            super(str);
            j.f(str2, "organization");
            j.f(str3, "title");
            j.f(list, "urls");
            this.f21836a = bArr;
            this.f21837b = str;
            this.f21838c = arrayList;
            this.f21839d = arrayList2;
            this.f21840e = bVar;
            this.f21841f = str2;
            this.f21842g = arrayList3;
            this.f21843h = str3;
            this.f21844i = list;
        }

        public final String a() {
            return this.f21837b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return j.a(this.f21836a, bVar.f21836a) && j.a(this.f21837b, bVar.f21837b) && j.a(this.f21838c, bVar.f21838c) && j.a(this.f21839d, bVar.f21839d) && j.a(this.f21840e, bVar.f21840e) && j.a(this.f21841f, bVar.f21841f) && j.a(this.f21842g, bVar.f21842g) && j.a(this.f21843h, bVar.f21843h) && j.a(this.f21844i, bVar.f21844i);
        }

        public final int hashCode() {
            int i10;
            byte[] bArr = this.f21836a;
            int i11 = 0;
            if (bArr == null) {
                i10 = 0;
            } else {
                i10 = Arrays.hashCode(bArr);
            }
            int i12 = i10 * 31;
            String str = this.f21837b;
            if (str != null) {
                i11 = str.hashCode();
            }
            int hashCode = this.f21838c.hashCode();
            int hashCode2 = this.f21839d.hashCode();
            return this.f21844i.hashCode() + l.f(this.f21843h, (this.f21842g.hashCode() + l.f(this.f21841f, (this.f21840e.hashCode() + ((hashCode2 + ((hashCode + ((i12 + i11) * 31)) * 31)) * 31)) * 31, 31)) * 31, 31);
        }

        public final String toString() {
            String arrays = Arrays.toString(this.f21836a);
            String str = this.f21837b;
            List<C0296a> list = this.f21838c;
            List<c> list2 = this.f21839d;
            C0298b bVar = this.f21840e;
            String str2 = this.f21841f;
            List<e> list3 = this.f21842g;
            String str3 = this.f21843h;
            List<String> list4 = this.f21844i;
            StringBuilder r10 = android.support.v4.media.a.r("ContactInfo(rawBytes=", arrays, ", rawValue=", str, ", addresses=");
            r10.append(list);
            r10.append(", emails=");
            r10.append(list2);
            r10.append(", name=");
            r10.append(bVar);
            r10.append(", organization=");
            r10.append(str2);
            r10.append(", phones=");
            r10.append(list3);
            r10.append(", title=");
            r10.append(str3);
            r10.append(", urls=");
            r10.append(list4);
            r10.append(")");
            return r10.toString();
        }
    }

    /* compiled from: QRContent.kt */
    public static final class c extends a {

        /* renamed from: a  reason: collision with root package name */
        public final byte[] f21857a;

        /* renamed from: b  reason: collision with root package name */
        public final String f21858b;

        /* renamed from: c  reason: collision with root package name */
        public final String f21859c;

        /* renamed from: d  reason: collision with root package name */
        public final String f21860d;

        /* renamed from: e  reason: collision with root package name */
        public final String f21861e;

        /* renamed from: f  reason: collision with root package name */
        public final C0299a f21862f;

        /* renamed from: oj.a$c$a  reason: collision with other inner class name */
        /* compiled from: QRContent.kt */
        public enum C0299a {
            UNKNOWN;

            /* access modifiers changed from: public */
            static {
                C0299a[] aVarArr;
                f21865c = l0.K(aVarArr);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(byte[] bArr, String str, String str2, String str3, String str4, C0299a aVar) {
            super(str);
            j.f(str2, "address");
            j.f(str3, "body");
            j.f(str4, "subject");
            j.f(aVar, "type");
            this.f21857a = bArr;
            this.f21858b = str;
            this.f21859c = str2;
            this.f21860d = str3;
            this.f21861e = str4;
            this.f21862f = aVar;
        }

        public final String a() {
            return this.f21858b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return j.a(this.f21857a, cVar.f21857a) && j.a(this.f21858b, cVar.f21858b) && j.a(this.f21859c, cVar.f21859c) && j.a(this.f21860d, cVar.f21860d) && j.a(this.f21861e, cVar.f21861e) && this.f21862f == cVar.f21862f;
        }

        public final int hashCode() {
            int i10;
            byte[] bArr = this.f21857a;
            int i11 = 0;
            if (bArr == null) {
                i10 = 0;
            } else {
                i10 = Arrays.hashCode(bArr);
            }
            int i12 = i10 * 31;
            String str = this.f21858b;
            if (str != null) {
                i11 = str.hashCode();
            }
            return this.f21862f.hashCode() + l.f(this.f21861e, l.f(this.f21860d, l.f(this.f21859c, (i12 + i11) * 31, 31), 31), 31);
        }

        public final String toString() {
            String arrays = Arrays.toString(this.f21857a);
            String str = this.f21858b;
            String str2 = this.f21859c;
            String str3 = this.f21860d;
            String str4 = this.f21861e;
            C0299a aVar = this.f21862f;
            StringBuilder r10 = android.support.v4.media.a.r("Email(rawBytes=", arrays, ", rawValue=", str, ", address=");
            r10.append(str2);
            r10.append(", body=");
            r10.append(str3);
            r10.append(", subject=");
            r10.append(str4);
            r10.append(", type=");
            r10.append(aVar);
            r10.append(")");
            return r10.toString();
        }
    }

    /* compiled from: QRContent.kt */
    public static final class d extends a {

        /* renamed from: a  reason: collision with root package name */
        public final byte[] f21866a;

        /* renamed from: b  reason: collision with root package name */
        public final String f21867b;

        /* renamed from: c  reason: collision with root package name */
        public final double f21868c;

        /* renamed from: d  reason: collision with root package name */
        public final double f21869d;

        public d(byte[] bArr, String str, double d10, double d11) {
            super(str);
            this.f21866a = bArr;
            this.f21867b = str;
            this.f21868c = d10;
            this.f21869d = d11;
        }

        public final String a() {
            return this.f21867b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return j.a(this.f21866a, dVar.f21866a) && j.a(this.f21867b, dVar.f21867b) && Double.compare(this.f21868c, dVar.f21868c) == 0 && Double.compare(this.f21869d, dVar.f21869d) == 0;
        }

        public final int hashCode() {
            byte[] bArr = this.f21866a;
            int i10 = 0;
            int hashCode = (bArr == null ? 0 : Arrays.hashCode(bArr)) * 31;
            String str = this.f21867b;
            if (str != null) {
                i10 = str.hashCode();
            }
            long doubleToLongBits = Double.doubleToLongBits(this.f21868c);
            long doubleToLongBits2 = Double.doubleToLongBits(this.f21869d);
            return ((((hashCode + i10) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
        }

        public final String toString() {
            String arrays = Arrays.toString(this.f21866a);
            String str = this.f21867b;
            double d10 = this.f21868c;
            double d11 = this.f21869d;
            StringBuilder r10 = android.support.v4.media.a.r("GeoPoint(rawBytes=", arrays, ", rawValue=", str, ", lat=");
            r10.append(d10);
            r10.append(", lng=");
            r10.append(d11);
            r10.append(")");
            return r10.toString();
        }
    }

    /* compiled from: QRContent.kt */
    public static final class e extends a {

        /* renamed from: a  reason: collision with root package name */
        public final byte[] f21870a;

        /* renamed from: b  reason: collision with root package name */
        public final String f21871b;

        /* renamed from: c  reason: collision with root package name */
        public final String f21872c;

        /* renamed from: d  reason: collision with root package name */
        public final C0300a f21873d;

        /* renamed from: oj.a$e$a  reason: collision with other inner class name */
        /* compiled from: QRContent.kt */
        public enum C0300a {
            UNKNOWN;

            /* access modifiers changed from: public */
            static {
                C0300a[] aVarArr;
                f21876c = l0.K(aVarArr);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(byte[] bArr, String str, String str2, C0300a aVar) {
            super(str);
            j.f(str2, "number");
            j.f(aVar, "type");
            this.f21870a = bArr;
            this.f21871b = str;
            this.f21872c = str2;
            this.f21873d = aVar;
        }

        public final String a() {
            return this.f21871b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return j.a(this.f21870a, eVar.f21870a) && j.a(this.f21871b, eVar.f21871b) && j.a(this.f21872c, eVar.f21872c) && this.f21873d == eVar.f21873d;
        }

        public final int hashCode() {
            int i10;
            byte[] bArr = this.f21870a;
            int i11 = 0;
            if (bArr == null) {
                i10 = 0;
            } else {
                i10 = Arrays.hashCode(bArr);
            }
            int i12 = i10 * 31;
            String str = this.f21871b;
            if (str != null) {
                i11 = str.hashCode();
            }
            return this.f21873d.hashCode() + l.f(this.f21872c, (i12 + i11) * 31, 31);
        }

        public final String toString() {
            String arrays = Arrays.toString(this.f21870a);
            String str = this.f21871b;
            String str2 = this.f21872c;
            C0300a aVar = this.f21873d;
            StringBuilder r10 = android.support.v4.media.a.r("Phone(rawBytes=", arrays, ", rawValue=", str, ", number=");
            r10.append(str2);
            r10.append(", type=");
            r10.append(aVar);
            r10.append(")");
            return r10.toString();
        }
    }

    /* compiled from: QRContent.kt */
    public static final class f extends a {

        /* renamed from: a  reason: collision with root package name */
        public final byte[] f21877a;

        /* renamed from: b  reason: collision with root package name */
        public final String f21878b;

        public f(byte[] bArr, String str) {
            super(str);
            this.f21877a = bArr;
            this.f21878b = str;
        }

        public final String a() {
            return this.f21878b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return j.a(this.f21877a, fVar.f21877a) && j.a(this.f21878b, fVar.f21878b);
        }

        public final int hashCode() {
            byte[] bArr = this.f21877a;
            int i10 = 0;
            int hashCode = (bArr == null ? 0 : Arrays.hashCode(bArr)) * 31;
            String str = this.f21878b;
            if (str != null) {
                i10 = str.hashCode();
            }
            return hashCode + i10;
        }

        public final String toString() {
            String arrays = Arrays.toString(this.f21877a);
            String str = this.f21878b;
            return "Plain(rawBytes=" + arrays + ", rawValue=" + str + ")";
        }
    }

    /* compiled from: QRContent.kt */
    public static final class g extends a {

        /* renamed from: a  reason: collision with root package name */
        public final byte[] f21879a;

        /* renamed from: b  reason: collision with root package name */
        public final String f21880b;

        /* renamed from: c  reason: collision with root package name */
        public final String f21881c;

        /* renamed from: d  reason: collision with root package name */
        public final String f21882d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(byte[] bArr, String str, String str2, String str3) {
            super(str);
            j.f(str2, "message");
            j.f(str3, "phoneNumber");
            this.f21879a = bArr;
            this.f21880b = str;
            this.f21881c = str2;
            this.f21882d = str3;
        }

        public final String a() {
            return this.f21880b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return j.a(this.f21879a, gVar.f21879a) && j.a(this.f21880b, gVar.f21880b) && j.a(this.f21881c, gVar.f21881c) && j.a(this.f21882d, gVar.f21882d);
        }

        public final int hashCode() {
            int i10;
            byte[] bArr = this.f21879a;
            int i11 = 0;
            if (bArr == null) {
                i10 = 0;
            } else {
                i10 = Arrays.hashCode(bArr);
            }
            int i12 = i10 * 31;
            String str = this.f21880b;
            if (str != null) {
                i11 = str.hashCode();
            }
            return this.f21882d.hashCode() + l.f(this.f21881c, (i12 + i11) * 31, 31);
        }

        public final String toString() {
            String arrays = Arrays.toString(this.f21879a);
            String str = this.f21880b;
            String str2 = this.f21881c;
            String str3 = this.f21882d;
            StringBuilder r10 = android.support.v4.media.a.r("Sms(rawBytes=", arrays, ", rawValue=", str, ", message=");
            r10.append(str2);
            r10.append(", phoneNumber=");
            r10.append(str3);
            r10.append(")");
            return r10.toString();
        }
    }

    /* compiled from: QRContent.kt */
    public static final class h extends a {

        /* renamed from: a  reason: collision with root package name */
        public final byte[] f21883a;

        /* renamed from: b  reason: collision with root package name */
        public final String f21884b;

        /* renamed from: c  reason: collision with root package name */
        public final String f21885c;

        /* renamed from: d  reason: collision with root package name */
        public final String f21886d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(byte[] bArr, String str, String str2, String str3) {
            super(str);
            j.f(str2, "title");
            j.f(str3, "url");
            this.f21883a = bArr;
            this.f21884b = str;
            this.f21885c = str2;
            this.f21886d = str3;
        }

        public final String a() {
            return this.f21884b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return j.a(this.f21883a, hVar.f21883a) && j.a(this.f21884b, hVar.f21884b) && j.a(this.f21885c, hVar.f21885c) && j.a(this.f21886d, hVar.f21886d);
        }

        public final int hashCode() {
            int i10;
            byte[] bArr = this.f21883a;
            int i11 = 0;
            if (bArr == null) {
                i10 = 0;
            } else {
                i10 = Arrays.hashCode(bArr);
            }
            int i12 = i10 * 31;
            String str = this.f21884b;
            if (str != null) {
                i11 = str.hashCode();
            }
            return this.f21886d.hashCode() + l.f(this.f21885c, (i12 + i11) * 31, 31);
        }

        public final String toString() {
            String arrays = Arrays.toString(this.f21883a);
            String str = this.f21884b;
            String str2 = this.f21885c;
            String str3 = this.f21886d;
            StringBuilder r10 = android.support.v4.media.a.r("Url(rawBytes=", arrays, ", rawValue=", str, ", title=");
            r10.append(str2);
            r10.append(", url=");
            r10.append(str3);
            r10.append(")");
            return r10.toString();
        }
    }

    /* compiled from: QRContent.kt */
    public static final class i extends a {

        /* renamed from: a  reason: collision with root package name */
        public final byte[] f21887a;

        /* renamed from: b  reason: collision with root package name */
        public final String f21888b;

        /* renamed from: c  reason: collision with root package name */
        public final int f21889c;

        /* renamed from: d  reason: collision with root package name */
        public final String f21890d;

        /* renamed from: e  reason: collision with root package name */
        public final String f21891e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(byte[] bArr, String str, int i10, String str2, String str3) {
            super(str);
            j.f(str2, "password");
            j.f(str3, "ssid");
            this.f21887a = bArr;
            this.f21888b = str;
            this.f21889c = i10;
            this.f21890d = str2;
            this.f21891e = str3;
        }

        public final String a() {
            return this.f21888b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return j.a(this.f21887a, iVar.f21887a) && j.a(this.f21888b, iVar.f21888b) && this.f21889c == iVar.f21889c && j.a(this.f21890d, iVar.f21890d) && j.a(this.f21891e, iVar.f21891e);
        }

        public final int hashCode() {
            int i10;
            byte[] bArr = this.f21887a;
            int i11 = 0;
            if (bArr == null) {
                i10 = 0;
            } else {
                i10 = Arrays.hashCode(bArr);
            }
            int i12 = i10 * 31;
            String str = this.f21888b;
            if (str != null) {
                i11 = str.hashCode();
            }
            return this.f21891e.hashCode() + l.f(this.f21890d, (((i12 + i11) * 31) + this.f21889c) * 31, 31);
        }

        public final String toString() {
            String arrays = Arrays.toString(this.f21887a);
            String str = this.f21888b;
            int i10 = this.f21889c;
            String str2 = this.f21890d;
            String str3 = this.f21891e;
            StringBuilder r10 = android.support.v4.media.a.r("Wifi(rawBytes=", arrays, ", rawValue=", str, ", encryptionType=");
            r10.append(i10);
            r10.append(", password=");
            r10.append(str2);
            r10.append(", ssid=");
            return android.support.v4.media.a.o(r10, str3, ")");
        }
    }

    public a(String str) {
    }

    public abstract String a();
}
