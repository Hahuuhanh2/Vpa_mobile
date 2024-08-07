package z2;

import android.annotation.SuppressLint;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import sk.j;
import yk.h;
import yk.l;

/* compiled from: TableInfo.kt */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f17813a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, C0244a> f17814b;

    /* renamed from: c  reason: collision with root package name */
    public final Set<b> f17815c;

    /* renamed from: d  reason: collision with root package name */
    public final Set<d> f17816d;

    /* renamed from: z2.a$a  reason: collision with other inner class name */
    /* compiled from: TableInfo.kt */
    public static final class C0244a {

        /* renamed from: a  reason: collision with root package name */
        public final String f17817a;

        /* renamed from: b  reason: collision with root package name */
        public final String f17818b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f17819c;

        /* renamed from: d  reason: collision with root package name */
        public final int f17820d;

        /* renamed from: e  reason: collision with root package name */
        public final String f17821e;

        /* renamed from: f  reason: collision with root package name */
        public final int f17822f;

        /* renamed from: g  reason: collision with root package name */
        public final int f17823g;

        /* renamed from: z2.a$a$a  reason: collision with other inner class name */
        /* compiled from: TableInfo.kt */
        public static final class C0245a {
            @SuppressLint({"SyntheticAccessor"})
            public static boolean a(String str, String str2) {
                boolean z10;
                boolean z11;
                j.f(str, "current");
                if (j.a(str, str2)) {
                    return true;
                }
                if (str.length() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    int i10 = 0;
                    int i11 = 0;
                    int i12 = 0;
                    while (true) {
                        if (i10 < str.length()) {
                            char charAt = str.charAt(i10);
                            int i13 = i12 + 1;
                            if (i12 == 0 && charAt != '(') {
                                break;
                            }
                            if (charAt != '(') {
                                if (charAt == ')' && i11 - 1 == 0 && i12 != str.length() - 1) {
                                    break;
                                }
                            } else {
                                i11++;
                            }
                            i10++;
                            i12 = i13;
                        } else if (i11 == 0) {
                            z11 = true;
                        }
                    }
                }
                z11 = false;
                if (!z11) {
                    return false;
                }
                String substring = str.substring(1, str.length() - 1);
                j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                return j.a(l.k1(substring).toString(), str2);
            }
        }

        public C0244a(String str, String str2, boolean z10, int i10, String str3, int i11) {
            int i12;
            this.f17817a = str;
            this.f17818b = str2;
            this.f17819c = z10;
            this.f17820d = i10;
            this.f17821e = str3;
            this.f17822f = i11;
            Locale locale = Locale.US;
            j.e(locale, "US");
            String upperCase = str2.toUpperCase(locale);
            j.e(upperCase, "this as java.lang.String).toUpperCase(locale)");
            if (l.N0(upperCase, "INT")) {
                i12 = 3;
            } else if (l.N0(upperCase, "CHAR") || l.N0(upperCase, "CLOB") || l.N0(upperCase, "TEXT")) {
                i12 = 2;
            } else if (l.N0(upperCase, "BLOB")) {
                i12 = 5;
            } else if (l.N0(upperCase, "REAL") || l.N0(upperCase, "FLOA") || l.N0(upperCase, "DOUB")) {
                i12 = 4;
            } else {
                i12 = 1;
            }
            this.f17823g = i12;
        }

        public final boolean equals(Object obj) {
            String str;
            boolean z10;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0244a)) {
                return false;
            }
            C0244a aVar = (C0244a) obj;
            if (this.f17820d != aVar.f17820d || !j.a(this.f17817a, aVar.f17817a) || this.f17819c != aVar.f17819c) {
                return false;
            }
            if (this.f17822f == 1 && aVar.f17822f == 2 && (str3 = this.f17821e) != null && !C0245a.a(str3, aVar.f17821e)) {
                return false;
            }
            if (this.f17822f == 2 && aVar.f17822f == 1 && (str2 = aVar.f17821e) != null && !C0245a.a(str2, this.f17821e)) {
                return false;
            }
            int i10 = this.f17822f;
            if (i10 != 0 && i10 == aVar.f17822f) {
                if ((str = this.f17821e) == null ? aVar.f17821e == null : C0245a.a(str, aVar.f17821e)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    return false;
                }
            }
            if (this.f17823g == aVar.f17823g) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int i10;
            int hashCode = ((this.f17817a.hashCode() * 31) + this.f17823g) * 31;
            if (this.f17819c) {
                i10 = 1231;
            } else {
                i10 = 1237;
            }
            return ((hashCode + i10) * 31) + this.f17820d;
        }

        public final String toString() {
            StringBuilder q10 = android.support.v4.media.a.q("Column{name='");
            q10.append(this.f17817a);
            q10.append("', type='");
            q10.append(this.f17818b);
            q10.append("', affinity='");
            q10.append(this.f17823g);
            q10.append("', notNull=");
            q10.append(this.f17819c);
            q10.append(", primaryKeyPosition=");
            q10.append(this.f17820d);
            q10.append(", defaultValue='");
            String str = this.f17821e;
            if (str == null) {
                str = "undefined";
            }
            return android.support.v4.media.a.o(q10, str, "'}");
        }
    }

    /* compiled from: TableInfo.kt */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f17824a;

        /* renamed from: b  reason: collision with root package name */
        public final String f17825b;

        /* renamed from: c  reason: collision with root package name */
        public final String f17826c;

        /* renamed from: d  reason: collision with root package name */
        public final List<String> f17827d;

        /* renamed from: e  reason: collision with root package name */
        public final List<String> f17828e;

        public b(String str, String str2, String str3, List<String> list, List<String> list2) {
            j.f(list, "columnNames");
            j.f(list2, "referenceColumnNames");
            this.f17824a = str;
            this.f17825b = str2;
            this.f17826c = str3;
            this.f17827d = list;
            this.f17828e = list2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (j.a(this.f17824a, bVar.f17824a) && j.a(this.f17825b, bVar.f17825b) && j.a(this.f17826c, bVar.f17826c) && j.a(this.f17827d, bVar.f17827d)) {
                return j.a(this.f17828e, bVar.f17828e);
            }
            return false;
        }

        public final int hashCode() {
            int f10 = n0.l.f(this.f17826c, n0.l.f(this.f17825b, this.f17824a.hashCode() * 31, 31), 31);
            return this.f17828e.hashCode() + ((this.f17827d.hashCode() + f10) * 31);
        }

        public final String toString() {
            StringBuilder q10 = android.support.v4.media.a.q("ForeignKey{referenceTable='");
            q10.append(this.f17824a);
            q10.append("', onDelete='");
            q10.append(this.f17825b);
            q10.append(" +', onUpdate='");
            q10.append(this.f17826c);
            q10.append("', columnNames=");
            q10.append(this.f17827d);
            q10.append(", referenceColumnNames=");
            q10.append(this.f17828e);
            q10.append('}');
            return q10.toString();
        }
    }

    /* compiled from: TableInfo.kt */
    public static final class c implements Comparable<c> {

        /* renamed from: a  reason: collision with root package name */
        public final int f17829a;

        /* renamed from: b  reason: collision with root package name */
        public final int f17830b;

        /* renamed from: c  reason: collision with root package name */
        public final String f17831c;

        /* renamed from: d  reason: collision with root package name */
        public final String f17832d;

        public c(String str, int i10, int i11, String str2) {
            this.f17829a = i10;
            this.f17830b = i11;
            this.f17831c = str;
            this.f17832d = str2;
        }

        public final int compareTo(Object obj) {
            c cVar = (c) obj;
            j.f(cVar, "other");
            int i10 = this.f17829a - cVar.f17829a;
            if (i10 == 0) {
                return this.f17830b - cVar.f17830b;
            }
            return i10;
        }
    }

    /* compiled from: TableInfo.kt */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final String f17833a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f17834b;

        /* renamed from: c  reason: collision with root package name */
        public final List<String> f17835c;

        /* renamed from: d  reason: collision with root package name */
        public List<String> f17836d;

        public d(String str, boolean z10, List<String> list, List<String> list2) {
            j.f(list, "columns");
            j.f(list2, "orders");
            this.f17833a = str;
            this.f17834b = z10;
            this.f17835c = list;
            this.f17836d = list2;
            boolean isEmpty = list2.isEmpty();
            ArrayList arrayList = list2;
            if (isEmpty) {
                int size = list.size();
                ArrayList arrayList2 = new ArrayList(size);
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList2.add("ASC");
                }
                arrayList = arrayList2;
            }
            this.f17836d = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f17834b != dVar.f17834b || !j.a(this.f17835c, dVar.f17835c) || !j.a(this.f17836d, dVar.f17836d)) {
                return false;
            }
            if (h.L0(this.f17833a, "index_", false)) {
                return h.L0(dVar.f17833a, "index_", false);
            }
            return j.a(this.f17833a, dVar.f17833a);
        }

        public final int hashCode() {
            int i10;
            if (h.L0(this.f17833a, "index_", false)) {
                i10 = -1184239155;
            } else {
                i10 = this.f17833a.hashCode();
            }
            int hashCode = this.f17835c.hashCode();
            return this.f17836d.hashCode() + ((hashCode + (((i10 * 31) + (this.f17834b ? 1 : 0)) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder q10 = android.support.v4.media.a.q("Index{name='");
            q10.append(this.f17833a);
            q10.append("', unique=");
            q10.append(this.f17834b);
            q10.append(", columns=");
            q10.append(this.f17835c);
            q10.append(", orders=");
            q10.append(this.f17836d);
            q10.append("'}");
            return q10.toString();
        }
    }

    public a(String str, Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        j.f(abstractSet, "foreignKeys");
        this.f17813a = str;
        this.f17814b = map;
        this.f17815c = abstractSet;
        this.f17816d = abstractSet2;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0334 A[SYNTHETIC, Splitter:B:102:0x0334] */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x032f A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final z2.a a(d3.c r30, java.lang.String r31) {
        /*
            r0 = r30
            r1 = r31
            java.lang.String r2 = "seq"
            java.lang.String r3 = "id"
            java.lang.String r4 = "type"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "PRAGMA table_info(`"
            r5.append(r6)
            r5.append(r1)
            java.lang.String r6 = "`)"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            android.database.Cursor r5 = r0.q(r5)
            int r7 = r5.getColumnCount()     // Catch:{ all -> 0x0376 }
            java.lang.String r8 = "name"
            r11 = 0
            if (r7 > 0) goto L_0x0034
            fk.s r4 = fk.s.f20214a     // Catch:{ all -> 0x0376 }
            p3.l0.u(r5, r11)
            goto L_0x00a7
        L_0x0034:
            int r7 = r5.getColumnIndex(r8)     // Catch:{ all -> 0x0376 }
            int r12 = r5.getColumnIndex(r4)     // Catch:{ all -> 0x0376 }
            java.lang.String r13 = "notnull"
            int r13 = r5.getColumnIndex(r13)     // Catch:{ all -> 0x0376 }
            java.lang.String r14 = "pk"
            int r14 = r5.getColumnIndex(r14)     // Catch:{ all -> 0x0376 }
            java.lang.String r15 = "dflt_value"
            int r15 = r5.getColumnIndex(r15)     // Catch:{ all -> 0x0376 }
            gk.b r9 = new gk.b     // Catch:{ all -> 0x0376 }
            r9.<init>()     // Catch:{ all -> 0x0376 }
        L_0x0053:
            boolean r16 = r5.moveToNext()     // Catch:{ all -> 0x0376 }
            if (r16 == 0) goto L_0x0090
            java.lang.String r11 = r5.getString(r7)     // Catch:{ all -> 0x0376 }
            java.lang.String r10 = r5.getString(r12)     // Catch:{ all -> 0x0376 }
            int r17 = r5.getInt(r13)     // Catch:{ all -> 0x0376 }
            if (r17 == 0) goto L_0x006a
            r20 = 1
            goto L_0x006c
        L_0x006a:
            r20 = 0
        L_0x006c:
            int r21 = r5.getInt(r14)     // Catch:{ all -> 0x0376 }
            java.lang.String r22 = r5.getString(r15)     // Catch:{ all -> 0x0376 }
            sk.j.e(r11, r8)     // Catch:{ all -> 0x0376 }
            r24 = r7
            z2.a$a r7 = new z2.a$a     // Catch:{ all -> 0x0376 }
            sk.j.e(r10, r4)     // Catch:{ all -> 0x0376 }
            r23 = 2
            r17 = r7
            r18 = r11
            r19 = r10
            r17.<init>(r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x0376 }
            r9.put(r11, r7)     // Catch:{ all -> 0x0376 }
            r7 = r24
            r11 = 0
            goto L_0x0053
        L_0x0090:
            r9.c()     // Catch:{ all -> 0x0376 }
            r4 = 1
            r9.f20449s = r4     // Catch:{ all -> 0x0376 }
            int r4 = r9.f20445o     // Catch:{ all -> 0x0376 }
            if (r4 <= 0) goto L_0x009c
            r4 = r9
            goto L_0x00a3
        L_0x009c:
            gk.b r4 = gk.b.f20437t     // Catch:{ all -> 0x0376 }
            java.lang.String r7 = "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>"
            sk.j.d(r4, r7)     // Catch:{ all -> 0x0376 }
        L_0x00a3:
            r7 = 0
            p3.l0.u(r5, r7)
        L_0x00a7:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "PRAGMA foreign_key_list(`"
            r5.append(r7)
            r5.append(r1)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            android.database.Cursor r5 = r0.q(r5)
            int r7 = r5.getColumnIndex(r3)     // Catch:{ all -> 0x036d }
            int r9 = r5.getColumnIndex(r2)     // Catch:{ all -> 0x036d }
            java.lang.String r10 = "table"
            int r10 = r5.getColumnIndex(r10)     // Catch:{ all -> 0x036d }
            java.lang.String r11 = "on_delete"
            int r11 = r5.getColumnIndex(r11)     // Catch:{ all -> 0x036d }
            java.lang.String r12 = "on_update"
            int r12 = r5.getColumnIndex(r12)     // Catch:{ all -> 0x036d }
            int r3 = r5.getColumnIndex(r3)     // Catch:{ all -> 0x036d }
            int r2 = r5.getColumnIndex(r2)     // Catch:{ all -> 0x036d }
            java.lang.String r13 = "from"
            int r13 = r5.getColumnIndex(r13)     // Catch:{ all -> 0x036d }
            java.lang.String r14 = "to"
            int r14 = r5.getColumnIndex(r14)     // Catch:{ all -> 0x036d }
            gk.a r15 = new gk.a     // Catch:{ all -> 0x036d }
            r15.<init>()     // Catch:{ all -> 0x036d }
        L_0x00f2:
            boolean r17 = r5.moveToNext()     // Catch:{ all -> 0x036d }
            if (r17 == 0) goto L_0x0133
            r17 = r4
            z2.a$c r4 = new z2.a$c     // Catch:{ all -> 0x036d }
            r18 = r8
            int r8 = r5.getInt(r3)     // Catch:{ all -> 0x036d }
            r19 = r3
            int r3 = r5.getInt(r2)     // Catch:{ all -> 0x036d }
            r20 = r2
            java.lang.String r2 = r5.getString(r13)     // Catch:{ all -> 0x036d }
            r21 = r13
            java.lang.String r13 = "cursor.getString(fromColumnIndex)"
            sk.j.e(r2, r13)     // Catch:{ all -> 0x036d }
            java.lang.String r13 = r5.getString(r14)     // Catch:{ all -> 0x036d }
            r22 = r14
            java.lang.String r14 = "cursor.getString(toColumnIndex)"
            sk.j.e(r13, r14)     // Catch:{ all -> 0x036d }
            r4.<init>(r2, r8, r3, r13)     // Catch:{ all -> 0x036d }
            r15.add(r4)     // Catch:{ all -> 0x036d }
            r4 = r17
            r8 = r18
            r3 = r19
            r2 = r20
            r13 = r21
            r14 = r22
            goto L_0x00f2
        L_0x0133:
            r17 = r4
            r18 = r8
            gk.a r2 = j7.a.j(r15)     // Catch:{ all -> 0x036d }
            java.lang.String r3 = "<this>"
            sk.j.f(r2, r3)     // Catch:{ all -> 0x036d }
            int r3 = r2.g()     // Catch:{ all -> 0x036d }
            r4 = 1
            if (r3 > r4) goto L_0x014d
            java.util.List r2 = fk.p.Z0(r2)     // Catch:{ all -> 0x036d }
            r4 = 0
            goto L_0x0162
        L_0x014d:
            r4 = 0
            java.lang.Comparable[] r3 = new java.lang.Comparable[r4]     // Catch:{ all -> 0x036d }
            java.lang.Object[] r2 = r2.toArray(r3)     // Catch:{ all -> 0x036d }
            r3 = r2
            java.lang.Comparable[] r3 = (java.lang.Comparable[]) r3     // Catch:{ all -> 0x036d }
            int r8 = r3.length     // Catch:{ all -> 0x036d }
            r13 = 1
            if (r8 <= r13) goto L_0x015e
            java.util.Arrays.sort(r3)     // Catch:{ all -> 0x036d }
        L_0x015e:
            java.util.List r2 = fk.h.l0(r2)     // Catch:{ all -> 0x036d }
        L_0x0162:
            r3 = -1
            r5.moveToPosition(r3)     // Catch:{ all -> 0x036d }
            gk.f r8 = new gk.f     // Catch:{ all -> 0x036d }
            r8.<init>()     // Catch:{ all -> 0x036d }
        L_0x016b:
            boolean r13 = r5.moveToNext()     // Catch:{ all -> 0x036d }
            if (r13 == 0) goto L_0x0204
            int r13 = r5.getInt(r9)     // Catch:{ all -> 0x036d }
            if (r13 == 0) goto L_0x0178
            goto L_0x016b
        L_0x0178:
            int r13 = r5.getInt(r7)     // Catch:{ all -> 0x036d }
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ all -> 0x036d }
            r14.<init>()     // Catch:{ all -> 0x036d }
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ all -> 0x036d }
            r15.<init>()     // Catch:{ all -> 0x036d }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x036d }
            r4.<init>()     // Catch:{ all -> 0x036d }
            java.util.Iterator r19 = r2.iterator()     // Catch:{ all -> 0x036d }
        L_0x018f:
            boolean r20 = r19.hasNext()     // Catch:{ all -> 0x036d }
            if (r20 == 0) goto L_0x01ae
            java.lang.Object r3 = r19.next()     // Catch:{ all -> 0x036d }
            r21 = r2
            r2 = r3
            z2.a$c r2 = (z2.a.c) r2     // Catch:{ all -> 0x036d }
            int r2 = r2.f17829a     // Catch:{ all -> 0x036d }
            if (r2 != r13) goto L_0x01a4
            r2 = 1
            goto L_0x01a5
        L_0x01a4:
            r2 = 0
        L_0x01a5:
            if (r2 == 0) goto L_0x01aa
            r4.add(r3)     // Catch:{ all -> 0x036d }
        L_0x01aa:
            r2 = r21
            r3 = -1
            goto L_0x018f
        L_0x01ae:
            r21 = r2
            java.util.Iterator r2 = r4.iterator()     // Catch:{ all -> 0x036d }
        L_0x01b4:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x036d }
            if (r3 == 0) goto L_0x01cb
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x036d }
            z2.a$c r3 = (z2.a.c) r3     // Catch:{ all -> 0x036d }
            java.lang.String r4 = r3.f17831c     // Catch:{ all -> 0x036d }
            r14.add(r4)     // Catch:{ all -> 0x036d }
            java.lang.String r3 = r3.f17832d     // Catch:{ all -> 0x036d }
            r15.add(r3)     // Catch:{ all -> 0x036d }
            goto L_0x01b4
        L_0x01cb:
            z2.a$b r2 = new z2.a$b     // Catch:{ all -> 0x036d }
            java.lang.String r3 = r5.getString(r10)     // Catch:{ all -> 0x036d }
            java.lang.String r4 = "cursor.getString(tableColumnIndex)"
            sk.j.e(r3, r4)     // Catch:{ all -> 0x036d }
            java.lang.String r4 = r5.getString(r11)     // Catch:{ all -> 0x036d }
            java.lang.String r13 = "cursor.getString(onDeleteColumnIndex)"
            sk.j.e(r4, r13)     // Catch:{ all -> 0x036d }
            java.lang.String r13 = r5.getString(r12)     // Catch:{ all -> 0x036d }
            r19 = r7
            java.lang.String r7 = "cursor.getString(onUpdateColumnIndex)"
            sk.j.e(r13, r7)     // Catch:{ all -> 0x036d }
            r24 = r2
            r25 = r3
            r26 = r4
            r27 = r13
            r28 = r14
            r29 = r15
            r24.<init>(r25, r26, r27, r28, r29)     // Catch:{ all -> 0x036d }
            r8.add(r2)     // Catch:{ all -> 0x036d }
            r7 = r19
            r2 = r21
            r3 = -1
            r4 = 0
            goto L_0x016b
        L_0x0204:
            gk.f r2 = al.g0.v(r8)     // Catch:{ all -> 0x036d }
            r3 = 0
            p3.l0.u(r5, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "PRAGMA index_list(`"
            r3.append(r4)
            r3.append(r1)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            android.database.Cursor r3 = r0.q(r3)
            r4 = r18
            int r5 = r3.getColumnIndex(r4)     // Catch:{ all -> 0x0364 }
            java.lang.String r7 = "origin"
            int r7 = r3.getColumnIndex(r7)     // Catch:{ all -> 0x0364 }
            java.lang.String r8 = "unique"
            int r8 = r3.getColumnIndex(r8)     // Catch:{ all -> 0x0364 }
            r9 = -1
            if (r5 == r9) goto L_0x0357
            if (r7 == r9) goto L_0x0357
            if (r8 != r9) goto L_0x023f
            goto L_0x0357
        L_0x023f:
            gk.f r9 = new gk.f     // Catch:{ all -> 0x0364 }
            r9.<init>()     // Catch:{ all -> 0x0364 }
        L_0x0244:
            boolean r10 = r3.moveToNext()     // Catch:{ all -> 0x0364 }
            if (r10 == 0) goto L_0x034e
            java.lang.String r10 = r3.getString(r7)     // Catch:{ all -> 0x0364 }
            java.lang.String r11 = "c"
            boolean r10 = sk.j.a(r11, r10)     // Catch:{ all -> 0x0364 }
            if (r10 != 0) goto L_0x0257
            goto L_0x0244
        L_0x0257:
            java.lang.String r10 = r3.getString(r5)     // Catch:{ all -> 0x0364 }
            int r11 = r3.getInt(r8)     // Catch:{ all -> 0x0364 }
            r12 = 1
            if (r11 != r12) goto L_0x0264
            r11 = r12
            goto L_0x0265
        L_0x0264:
            r11 = 0
        L_0x0265:
            sk.j.e(r10, r4)     // Catch:{ all -> 0x0364 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x0364 }
            r13.<init>()     // Catch:{ all -> 0x0364 }
            java.lang.String r14 = "PRAGMA index_xinfo(`"
            r13.append(r14)     // Catch:{ all -> 0x0364 }
            r13.append(r10)     // Catch:{ all -> 0x0364 }
            r13.append(r6)     // Catch:{ all -> 0x0364 }
            java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x0364 }
            android.database.Cursor r13 = r0.q(r13)     // Catch:{ all -> 0x0364 }
            java.lang.String r14 = "seqno"
            int r14 = r13.getColumnIndex(r14)     // Catch:{ all -> 0x0345 }
            java.lang.String r15 = "cid"
            int r15 = r13.getColumnIndex(r15)     // Catch:{ all -> 0x0345 }
            int r12 = r13.getColumnIndex(r4)     // Catch:{ all -> 0x0345 }
            java.lang.String r0 = "desc"
            int r0 = r13.getColumnIndex(r0)     // Catch:{ all -> 0x0345 }
            r18 = r4
            r4 = -1
            if (r14 == r4) goto L_0x0320
            if (r15 == r4) goto L_0x0320
            if (r12 == r4) goto L_0x0320
            if (r0 != r4) goto L_0x02a3
            goto L_0x0320
        L_0x02a3:
            java.util.TreeMap r4 = new java.util.TreeMap     // Catch:{ all -> 0x0345 }
            r4.<init>()     // Catch:{ all -> 0x0345 }
            r19 = r5
            java.util.TreeMap r5 = new java.util.TreeMap     // Catch:{ all -> 0x0345 }
            r5.<init>()     // Catch:{ all -> 0x0345 }
        L_0x02af:
            boolean r21 = r13.moveToNext()     // Catch:{ all -> 0x0345 }
            if (r21 == 0) goto L_0x02f5
            int r21 = r13.getInt(r15)     // Catch:{ all -> 0x0345 }
            if (r21 >= 0) goto L_0x02bc
            goto L_0x02af
        L_0x02bc:
            int r21 = r13.getInt(r14)     // Catch:{ all -> 0x0345 }
            r22 = r6
            java.lang.String r6 = r13.getString(r12)     // Catch:{ all -> 0x0345 }
            int r23 = r13.getInt(r0)     // Catch:{ all -> 0x0345 }
            if (r23 <= 0) goto L_0x02cf
            java.lang.String r23 = "DESC"
            goto L_0x02d1
        L_0x02cf:
            java.lang.String r23 = "ASC"
        L_0x02d1:
            r24 = r0
            r0 = r23
            r23 = r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r21)     // Catch:{ all -> 0x0345 }
            r25 = r8
            java.lang.String r8 = "columnName"
            sk.j.e(r6, r8)     // Catch:{ all -> 0x0345 }
            r4.put(r7, r6)     // Catch:{ all -> 0x0345 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r21)     // Catch:{ all -> 0x0345 }
            r5.put(r6, r0)     // Catch:{ all -> 0x0345 }
            r6 = r22
            r7 = r23
            r0 = r24
            r8 = r25
            goto L_0x02af
        L_0x02f5:
            r22 = r6
            r23 = r7
            r25 = r8
            java.util.Collection r0 = r4.values()     // Catch:{ all -> 0x0345 }
            java.lang.String r4 = "columnsMap.values"
            sk.j.e(r0, r4)     // Catch:{ all -> 0x0345 }
            java.util.List r0 = fk.p.Z0(r0)     // Catch:{ all -> 0x0345 }
            java.util.Collection r4 = r5.values()     // Catch:{ all -> 0x0345 }
            java.lang.String r5 = "ordersMap.values"
            sk.j.e(r4, r5)     // Catch:{ all -> 0x0345 }
            java.util.List r4 = fk.p.Z0(r4)     // Catch:{ all -> 0x0345 }
            z2.a$d r5 = new z2.a$d     // Catch:{ all -> 0x0345 }
            r5.<init>(r10, r11, r0, r4)     // Catch:{ all -> 0x0345 }
            r0 = 0
            p3.l0.u(r13, r0)     // Catch:{ all -> 0x0364 }
            r0 = 0
            goto L_0x032d
        L_0x0320:
            r19 = r5
            r22 = r6
            r23 = r7
            r25 = r8
            r0 = 0
            p3.l0.u(r13, r0)     // Catch:{ all -> 0x0364 }
            r5 = r0
        L_0x032d:
            if (r5 != 0) goto L_0x0334
            p3.l0.u(r3, r0)
            r11 = 0
            goto L_0x035c
        L_0x0334:
            r9.add(r5)     // Catch:{ all -> 0x0364 }
            r0 = r30
            r4 = r18
            r5 = r19
            r6 = r22
            r7 = r23
            r8 = r25
            goto L_0x0244
        L_0x0345:
            r0 = move-exception
            r1 = r0
            throw r1     // Catch:{ all -> 0x0348 }
        L_0x0348:
            r0 = move-exception
            r2 = r0
            p3.l0.u(r13, r1)     // Catch:{ all -> 0x0364 }
            throw r2     // Catch:{ all -> 0x0364 }
        L_0x034e:
            gk.f r0 = al.g0.v(r9)     // Catch:{ all -> 0x0364 }
            r4 = 0
            p3.l0.u(r3, r4)
            goto L_0x035b
        L_0x0357:
            r0 = 0
            p3.l0.u(r3, r0)
        L_0x035b:
            r11 = r0
        L_0x035c:
            z2.a r0 = new z2.a
            r4 = r17
            r0.<init>(r1, r4, r2, r11)
            return r0
        L_0x0364:
            r0 = move-exception
            r1 = r0
            throw r1     // Catch:{ all -> 0x0367 }
        L_0x0367:
            r0 = move-exception
            r2 = r0
            p3.l0.u(r3, r1)
            throw r2
        L_0x036d:
            r0 = move-exception
            r1 = r0
            throw r1     // Catch:{ all -> 0x0370 }
        L_0x0370:
            r0 = move-exception
            r2 = r0
            p3.l0.u(r5, r1)
            throw r2
        L_0x0376:
            r0 = move-exception
            r1 = r0
            throw r1     // Catch:{ all -> 0x0379 }
        L_0x0379:
            r0 = move-exception
            r2 = r0
            p3.l0.u(r5, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: z2.a.a(d3.c, java.lang.String):z2.a");
    }

    public final boolean equals(Object obj) {
        Set<d> set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!j.a(this.f17813a, aVar.f17813a) || !j.a(this.f17814b, aVar.f17814b) || !j.a(this.f17815c, aVar.f17815c)) {
            return false;
        }
        Set<d> set2 = this.f17816d;
        if (set2 == null || (set = aVar.f17816d) == null) {
            return true;
        }
        return j.a(set2, set);
    }

    public final int hashCode() {
        int hashCode = this.f17814b.hashCode();
        return this.f17815c.hashCode() + ((hashCode + (this.f17813a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder q10 = android.support.v4.media.a.q("TableInfo{name='");
        q10.append(this.f17813a);
        q10.append("', columns=");
        q10.append(this.f17814b);
        q10.append(", foreignKeys=");
        q10.append(this.f17815c);
        q10.append(", indices=");
        q10.append(this.f17816d);
        q10.append('}');
        return q10.toString();
    }
}
