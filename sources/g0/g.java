package g0;

import al.g0;
import c0.p0;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import v.v;

/* compiled from: ExifData */
public final class g {

    /* renamed from: c  reason: collision with root package name */
    public static final j[] f10235c = {new j("SubIFDPointer", 330, 4), new j("ExifIFDPointer", 34665, 4), new j("GPSInfoIFDPointer", 34853, 4), new j("InteroperabilityIFDPointer", 40965, 4)};

    /* renamed from: d  reason: collision with root package name */
    public static final j[][] f10236d;

    /* renamed from: e  reason: collision with root package name */
    public static final HashSet<String> f10237e = new HashSet<>(Arrays.asList(new String[]{"FNumber", "ExposureTime", "GPSTimeStamp"}));

    /* renamed from: a  reason: collision with root package name */
    public final List<Map<String, f>> f10238a;

    /* renamed from: b  reason: collision with root package name */
    public final ByteOrder f10239b;

    /* compiled from: ExifData */
    public static final class a {

        /* renamed from: c  reason: collision with root package name */
        public static final Pattern f10240c = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");

        /* renamed from: d  reason: collision with root package name */
        public static final Pattern f10241d = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

        /* renamed from: e  reason: collision with root package name */
        public static final Pattern f10242e = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

        /* renamed from: f  reason: collision with root package name */
        public static final ArrayList f10243f = Collections.list(new C0110a());

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList f10244a = Collections.list(new b());

        /* renamed from: b  reason: collision with root package name */
        public final ByteOrder f10245b;

        /* renamed from: g0.g$a$a  reason: collision with other inner class name */
        /* compiled from: ExifData */
        public class C0110a implements Enumeration<HashMap<String, j>> {

            /* renamed from: a  reason: collision with root package name */
            public int f10246a = 0;

            public final boolean hasMoreElements() {
                int i10 = this.f10246a;
                j[] jVarArr = g.f10235c;
                if (i10 < 4) {
                    return true;
                }
                return false;
            }

            public final Object nextElement() {
                HashMap hashMap = new HashMap();
                for (j jVar : g.f10236d[this.f10246a]) {
                    hashMap.put(jVar.f10257b, jVar);
                }
                this.f10246a++;
                return hashMap;
            }
        }

        /* compiled from: ExifData */
        public class b implements Enumeration<Map<String, f>> {

            /* renamed from: a  reason: collision with root package name */
            public int f10247a = 0;

            public final boolean hasMoreElements() {
                int i10 = this.f10247a;
                j[] jVarArr = g.f10235c;
                if (i10 < 4) {
                    return true;
                }
                return false;
            }

            public final Object nextElement() {
                this.f10247a++;
                return new HashMap();
            }
        }

        public a(ByteOrder byteOrder) {
            this.f10245b = byteOrder;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(3:67|68|69) */
        /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
            java.lang.Double.parseDouble(r10);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:69:0x014a, code lost:
            return new android.util.Pair<>(12, -1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:0x0150, code lost:
            return new android.util.Pair<>(2, -1);
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x013c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static android.util.Pair<java.lang.Integer, java.lang.Integer> a(java.lang.String r10) {
            /*
                java.lang.String r0 = ","
                boolean r1 = r10.contains(r0)
                r2 = 0
                r3 = 1
                r4 = 2
                java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
                r6 = -1
                java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
                if (r1 == 0) goto L_0x00a6
                java.lang.String[] r10 = r10.split(r0, r6)
                r0 = r10[r2]
                android.util.Pair r0 = a(r0)
                java.lang.Object r1 = r0.first
                java.lang.Integer r1 = (java.lang.Integer) r1
                int r1 = r1.intValue()
                if (r1 != r4) goto L_0x0029
                return r0
            L_0x0029:
                int r1 = r10.length
                if (r3 >= r1) goto L_0x00a5
                r1 = r10[r3]
                android.util.Pair r1 = a(r1)
                java.lang.Object r2 = r1.first
                java.lang.Integer r2 = (java.lang.Integer) r2
                java.lang.Object r4 = r0.first
                boolean r2 = r2.equals(r4)
                if (r2 != 0) goto L_0x004d
                java.lang.Object r2 = r1.second
                java.lang.Integer r2 = (java.lang.Integer) r2
                java.lang.Object r4 = r0.first
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x004b
                goto L_0x004d
            L_0x004b:
                r2 = r6
                goto L_0x0055
            L_0x004d:
                java.lang.Object r2 = r0.first
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
            L_0x0055:
                java.lang.Object r4 = r0.second
                java.lang.Integer r4 = (java.lang.Integer) r4
                int r4 = r4.intValue()
                if (r4 == r6) goto L_0x0080
                java.lang.Object r4 = r1.first
                java.lang.Integer r4 = (java.lang.Integer) r4
                java.lang.Object r8 = r0.second
                boolean r4 = r4.equals(r8)
                if (r4 != 0) goto L_0x0077
                java.lang.Object r1 = r1.second
                java.lang.Integer r1 = (java.lang.Integer) r1
                java.lang.Object r4 = r0.second
                boolean r1 = r1.equals(r4)
                if (r1 == 0) goto L_0x0080
            L_0x0077:
                java.lang.Object r1 = r0.second
                java.lang.Integer r1 = (java.lang.Integer) r1
                int r1 = r1.intValue()
                goto L_0x0081
            L_0x0080:
                r1 = r6
            L_0x0081:
                if (r2 != r6) goto L_0x008b
                if (r1 != r6) goto L_0x008b
                android.util.Pair r10 = new android.util.Pair
                r10.<init>(r5, r7)
                return r10
            L_0x008b:
                if (r2 != r6) goto L_0x0097
                android.util.Pair r0 = new android.util.Pair
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0.<init>(r1, r7)
                goto L_0x00a2
            L_0x0097:
                if (r1 != r6) goto L_0x00a2
                android.util.Pair r0 = new android.util.Pair
                java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
                r0.<init>(r1, r7)
            L_0x00a2:
                int r3 = r3 + 1
                goto L_0x0029
            L_0x00a5:
                return r0
            L_0x00a6:
                java.lang.String r0 = "/"
                boolean r1 = r10.contains(r0)
                r8 = 0
                if (r1 == 0) goto L_0x0105
                java.lang.String[] r10 = r10.split(r0, r6)
                int r0 = r10.length
                if (r0 != r4) goto L_0x00ff
                r0 = r10[r2]     // Catch:{ NumberFormatException -> 0x00ff }
                double r0 = java.lang.Double.parseDouble(r0)     // Catch:{ NumberFormatException -> 0x00ff }
                long r0 = (long) r0     // Catch:{ NumberFormatException -> 0x00ff }
                r10 = r10[r3]     // Catch:{ NumberFormatException -> 0x00ff }
                double r2 = java.lang.Double.parseDouble(r10)     // Catch:{ NumberFormatException -> 0x00ff }
                long r2 = (long) r2     // Catch:{ NumberFormatException -> 0x00ff }
                int r10 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
                r4 = 10
                if (r10 < 0) goto L_0x00f5
                int r10 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
                if (r10 >= 0) goto L_0x00d0
                goto L_0x00f5
            L_0x00d0:
                r8 = 2147483647(0x7fffffff, double:1.060997895E-314)
                int r10 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
                r0 = 5
                if (r10 > 0) goto L_0x00eb
                int r10 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
                if (r10 <= 0) goto L_0x00dd
                goto L_0x00eb
            L_0x00dd:
                android.util.Pair r10 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x00ff }
                java.lang.Integer r1 = java.lang.Integer.valueOf(r4)     // Catch:{ NumberFormatException -> 0x00ff }
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x00ff }
                r10.<init>(r1, r0)     // Catch:{ NumberFormatException -> 0x00ff }
                return r10
            L_0x00eb:
                android.util.Pair r10 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x00ff }
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x00ff }
                r10.<init>(r0, r7)     // Catch:{ NumberFormatException -> 0x00ff }
                return r10
            L_0x00f5:
                android.util.Pair r10 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x00ff }
                java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ NumberFormatException -> 0x00ff }
                r10.<init>(r0, r7)     // Catch:{ NumberFormatException -> 0x00ff }
                return r10
            L_0x00ff:
                android.util.Pair r10 = new android.util.Pair
                r10.<init>(r5, r7)
                return r10
            L_0x0105:
                long r0 = java.lang.Long.parseLong(r10)     // Catch:{ NumberFormatException -> 0x013c }
                int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
                r3 = 4
                if (r2 < 0) goto L_0x0124
                r8 = 65535(0xffff, double:3.23786E-319)
                int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
                if (r0 > 0) goto L_0x0124
                android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x013c }
                r1 = 3
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x013c }
                java.lang.Integer r2 = java.lang.Integer.valueOf(r3)     // Catch:{ NumberFormatException -> 0x013c }
                r0.<init>(r1, r2)     // Catch:{ NumberFormatException -> 0x013c }
                return r0
            L_0x0124:
                if (r2 >= 0) goto L_0x0132
                android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x013c }
                r1 = 9
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x013c }
                r0.<init>(r1, r7)     // Catch:{ NumberFormatException -> 0x013c }
                return r0
            L_0x0132:
                android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x013c }
                java.lang.Integer r1 = java.lang.Integer.valueOf(r3)     // Catch:{ NumberFormatException -> 0x013c }
                r0.<init>(r1, r7)     // Catch:{ NumberFormatException -> 0x013c }
                return r0
            L_0x013c:
                java.lang.Double.parseDouble(r10)     // Catch:{ NumberFormatException -> 0x014b }
                android.util.Pair r10 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x014b }
                r0 = 12
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x014b }
                r10.<init>(r0, r7)     // Catch:{ NumberFormatException -> 0x014b }
                return r10
            L_0x014b:
                android.util.Pair r10 = new android.util.Pair
                r10.<init>(r5, r7)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: g0.g.a.a(java.lang.String):android.util.Pair");
        }

        public final void b(String str, String str2, ArrayList arrayList) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((Map) it.next()).containsKey(str)) {
                    return;
                }
            }
            c(str, str2, arrayList);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:108:0x034a, code lost:
            r5 = 0;
            r7 = 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x0150, code lost:
            if (r10 != r5) goto L_0x03bf;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:68:0x01a8, code lost:
            r11 = 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:85:0x025e, code lost:
            r6 = r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:99:0x0300, code lost:
            r10 = 3;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void c(java.lang.String r19, java.lang.String r20, java.util.ArrayList r21) {
            /*
                r18 = this;
                r0 = r19
                r1 = r20
                r2 = r21
                java.lang.String r3 = "DateTime"
                boolean r3 = r3.equals(r0)
                java.lang.String r4 = "ExifData"
                if (r3 != 0) goto L_0x0020
                java.lang.String r3 = "DateTimeOriginal"
                boolean r3 = r3.equals(r0)
                if (r3 != 0) goto L_0x0020
                java.lang.String r3 = "DateTimeDigitized"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x0052
            L_0x0020:
                if (r1 == 0) goto L_0x0052
                java.util.regex.Pattern r3 = f10241d
                java.util.regex.Matcher r3 = r3.matcher(r1)
                boolean r3 = r3.find()
                java.util.regex.Pattern r5 = f10242e
                java.util.regex.Matcher r5 = r5.matcher(r1)
                boolean r5 = r5.find()
                int r6 = r20.length()
                r7 = 19
                if (r6 != r7) goto L_0x004e
                if (r3 != 0) goto L_0x0043
                if (r5 != 0) goto L_0x0043
                goto L_0x004e
            L_0x0043:
                if (r5 == 0) goto L_0x0052
                java.lang.String r3 = "-"
                java.lang.String r5 = ":"
                java.lang.String r1 = r1.replaceAll(r3, r5)
                goto L_0x0052
            L_0x004e:
                c0.p0.g(r4)
                return
            L_0x0052:
                java.lang.String r3 = "ISOSpeedRatings"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x005c
                java.lang.String r0 = "PhotographicSensitivity"
            L_0x005c:
                java.lang.String r3 = "/"
                r5 = 2
                r6 = 3
                r7 = 1
                if (r1 == 0) goto L_0x00e8
                java.util.HashSet<java.lang.String> r8 = g0.g.f10237e
                boolean r8 = r8.contains(r0)
                if (r8 == 0) goto L_0x00e8
                java.lang.String r8 = "GPSTimeStamp"
                boolean r8 = r0.equals(r8)
                if (r8 == 0) goto L_0x00c4
                java.util.regex.Pattern r8 = f10240c
                java.util.regex.Matcher r1 = r8.matcher(r1)
                boolean r8 = r1.find()
                if (r8 != 0) goto L_0x0083
                c0.p0.g(r4)
                return
            L_0x0083:
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r8 = r1.group(r7)
                r8.getClass()
                int r8 = java.lang.Integer.parseInt(r8)
                r4.append(r8)
                java.lang.String r8 = "/1,"
                r4.append(r8)
                java.lang.String r9 = r1.group(r5)
                r9.getClass()
                int r9 = java.lang.Integer.parseInt(r9)
                r4.append(r9)
                r4.append(r8)
                java.lang.String r1 = r1.group(r6)
                r1.getClass()
                int r1 = java.lang.Integer.parseInt(r1)
                r4.append(r1)
                java.lang.String r1 = "/1"
                r4.append(r1)
                java.lang.String r1 = r4.toString()
                goto L_0x00e8
            L_0x00c4:
                double r8 = java.lang.Double.parseDouble(r1)     // Catch:{ NumberFormatException -> 0x00e4 }
                r10 = 4666723172467343360(0x40c3880000000000, double:10000.0)
                double r8 = r8 * r10
                long r8 = (long) r8     // Catch:{ NumberFormatException -> 0x00e4 }
                r10 = 10000(0x2710, double:4.9407E-320)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x00e4 }
                r1.<init>()     // Catch:{ NumberFormatException -> 0x00e4 }
                r1.append(r8)     // Catch:{ NumberFormatException -> 0x00e4 }
                r1.append(r3)     // Catch:{ NumberFormatException -> 0x00e4 }
                r1.append(r10)     // Catch:{ NumberFormatException -> 0x00e4 }
                java.lang.String r1 = r1.toString()     // Catch:{ NumberFormatException -> 0x00e4 }
                goto L_0x00e8
            L_0x00e4:
                c0.p0.h(r4)
                return
            L_0x00e8:
                r4 = 0
                r9 = r18
                r8 = r4
            L_0x00ec:
                g0.j[] r10 = g0.g.f10235c
                r10 = 4
                if (r8 >= r10) goto L_0x03ca
                java.util.ArrayList r10 = f10243f
                java.lang.Object r10 = r10.get(r8)
                java.util.HashMap r10 = (java.util.HashMap) r10
                java.lang.Object r10 = r10.get(r0)
                g0.j r10 = (g0.j) r10
                if (r10 == 0) goto L_0x03bf
                if (r1 != 0) goto L_0x010e
                java.lang.Object r10 = r2.get(r8)
                java.util.Map r10 = (java.util.Map) r10
                r10.remove(r0)
                goto L_0x03bf
            L_0x010e:
                android.util.Pair r11 = a(r1)
                int r12 = r10.f10258c
                java.lang.Object r13 = r11.first
                java.lang.Integer r13 = (java.lang.Integer) r13
                int r13 = r13.intValue()
                r14 = -1
                if (r12 == r13) goto L_0x0153
                int r12 = r10.f10258c
                java.lang.Object r13 = r11.second
                java.lang.Integer r13 = (java.lang.Integer) r13
                int r13 = r13.intValue()
                if (r12 != r13) goto L_0x012c
                goto L_0x0153
            L_0x012c:
                int r12 = r10.f10259d
                if (r12 == r14) goto L_0x0149
                java.lang.Object r13 = r11.first
                java.lang.Integer r13 = (java.lang.Integer) r13
                int r13 = r13.intValue()
                if (r12 == r13) goto L_0x0146
                int r12 = r10.f10259d
                java.lang.Object r11 = r11.second
                java.lang.Integer r11 = (java.lang.Integer) r11
                int r11 = r11.intValue()
                if (r12 != r11) goto L_0x0149
            L_0x0146:
                int r10 = r10.f10259d
                goto L_0x0155
            L_0x0149:
                int r10 = r10.f10258c
                if (r10 == r7) goto L_0x0155
                r11 = 7
                if (r10 == r11) goto L_0x0155
                if (r10 != r5) goto L_0x03bf
                goto L_0x0155
            L_0x0153:
                int r10 = r10.f10258c
            L_0x0155:
                java.lang.String r11 = ","
                switch(r10) {
                    case 1: goto L_0x037b;
                    case 2: goto L_0x034e;
                    case 3: goto L_0x0302;
                    case 4: goto L_0x02d6;
                    case 5: goto L_0x0261;
                    case 6: goto L_0x015a;
                    case 7: goto L_0x034e;
                    case 8: goto L_0x015a;
                    case 9: goto L_0x0216;
                    case 10: goto L_0x01ab;
                    case 11: goto L_0x015a;
                    case 12: goto L_0x015c;
                    default: goto L_0x015a;
                }
            L_0x015a:
                goto L_0x03bf
            L_0x015c:
                java.lang.String[] r10 = r1.split(r11, r14)
                int r11 = r10.length
                double[] r12 = new double[r11]
                r13 = r4
            L_0x0164:
                int r14 = r10.length
                if (r13 >= r14) goto L_0x0172
                r14 = r10[r13]
                double r14 = java.lang.Double.parseDouble(r14)
                r12[r13] = r14
                int r13 = r13 + 1
                goto L_0x0164
            L_0x0172:
                java.lang.Object r10 = r2.get(r8)
                java.util.Map r10 = (java.util.Map) r10
                java.nio.ByteOrder r9 = r9.f10245b
                int[] r13 = g0.f.f10231f
                r14 = 12
                r13 = r13[r14]
                int r13 = r13 * r11
                byte[] r13 = new byte[r13]
                java.nio.ByteBuffer r13 = java.nio.ByteBuffer.wrap(r13)
                r13.order(r9)
                r9 = r4
            L_0x018b:
                if (r9 >= r11) goto L_0x0197
                r5 = r12[r9]
                r13.putDouble(r5)
                int r9 = r9 + 1
                r5 = 2
                r6 = 3
                goto L_0x018b
            L_0x0197:
                g0.f r5 = new g0.f
                byte[] r6 = r13.array()
                r5.<init>(r6, r14, r11)
                r10.put(r0, r5)
                r9 = r18
                r5 = r4
                r6 = r8
                r10 = 3
            L_0x01a8:
                r11 = 2
                goto L_0x03c3
            L_0x01ab:
                java.lang.String[] r5 = r1.split(r11, r14)
                int r6 = r5.length
                g0.k[] r9 = new g0.k[r6]
                r10 = r4
            L_0x01b3:
                int r11 = r5.length
                if (r10 >= r11) goto L_0x01da
                r11 = r5[r10]
                java.lang.String[] r11 = r11.split(r3, r14)
                g0.k r12 = new g0.k
                r13 = r11[r4]
                r16 = r5
                double r4 = java.lang.Double.parseDouble(r13)
                long r4 = (long) r4
                r11 = r11[r7]
                double r14 = java.lang.Double.parseDouble(r11)
                long r14 = (long) r14
                r12.<init>(r4, r14)
                r9[r10] = r12
                int r10 = r10 + 1
                r5 = r16
                r4 = 0
                r14 = -1
                goto L_0x01b3
            L_0x01da:
                java.lang.Object r4 = r2.get(r8)
                java.util.Map r4 = (java.util.Map) r4
                r5 = r18
                java.nio.ByteOrder r10 = r5.f10245b
                int[] r11 = g0.f.f10231f
                r12 = 10
                r11 = r11[r12]
                int r11 = r11 * r6
                byte[] r11 = new byte[r11]
                java.nio.ByteBuffer r11 = java.nio.ByteBuffer.wrap(r11)
                r11.order(r10)
                r15 = 0
            L_0x01f5:
                if (r15 >= r6) goto L_0x0208
                r10 = r9[r15]
                long r13 = r10.f10260a
                int r13 = (int) r13
                r11.putInt(r13)
                long r13 = r10.f10261b
                int r10 = (int) r13
                r11.putInt(r10)
                int r15 = r15 + 1
                goto L_0x01f5
            L_0x0208:
                g0.f r9 = new g0.f
                byte[] r10 = r11.array()
                r9.<init>(r10, r12, r6)
                r4.put(r0, r9)
                r9 = r5
                goto L_0x025e
            L_0x0216:
                r5 = r18
                r4 = r14
                java.lang.String[] r4 = r1.split(r11, r4)
                int r6 = r4.length
                int[] r10 = new int[r6]
                r15 = 0
            L_0x0221:
                int r11 = r4.length
                if (r15 >= r11) goto L_0x022f
                r11 = r4[r15]
                int r11 = java.lang.Integer.parseInt(r11)
                r10[r15] = r11
                int r15 = r15 + 1
                goto L_0x0221
            L_0x022f:
                java.lang.Object r4 = r2.get(r8)
                java.util.Map r4 = (java.util.Map) r4
                java.nio.ByteOrder r11 = r9.f10245b
                int[] r12 = g0.f.f10231f
                r13 = 9
                r12 = r12[r13]
                int r12 = r12 * r6
                byte[] r12 = new byte[r12]
                java.nio.ByteBuffer r12 = java.nio.ByteBuffer.wrap(r12)
                r12.order(r11)
                r15 = 0
            L_0x0248:
                if (r15 >= r6) goto L_0x0252
                r11 = r10[r15]
                r12.putInt(r11)
                int r15 = r15 + 1
                goto L_0x0248
            L_0x0252:
                g0.f r10 = new g0.f
                byte[] r11 = r12.array()
                r10.<init>(r11, r13, r6)
                r4.put(r0, r10)
            L_0x025e:
                r6 = r8
                goto L_0x0300
            L_0x0261:
                r5 = r18
                r4 = r14
                java.lang.String[] r6 = r1.split(r11, r4)
                int r10 = r6.length
                g0.k[] r11 = new g0.k[r10]
                r12 = 0
            L_0x026c:
                int r13 = r6.length
                if (r12 >= r13) goto L_0x0295
                r13 = r6[r12]
                java.lang.String[] r14 = r13.split(r3, r4)
                g0.k r4 = new g0.k
                r15 = 0
                r16 = r14[r15]
                r17 = r6
                double r5 = java.lang.Double.parseDouble(r16)
                long r5 = (long) r5
                r14 = r14[r7]
                double r13 = java.lang.Double.parseDouble(r14)
                long r13 = (long) r13
                r4.<init>(r5, r13)
                r11[r12] = r4
                int r12 = r12 + 1
                r4 = -1
                r5 = r18
                r6 = r17
                goto L_0x026c
            L_0x0295:
                java.lang.Object r4 = r2.get(r8)
                java.util.Map r4 = (java.util.Map) r4
                java.nio.ByteOrder r5 = r9.f10245b
                int[] r6 = g0.f.f10231f
                r12 = 5
                r6 = r6[r12]
                int r6 = r6 * r10
                byte[] r6 = new byte[r6]
                java.nio.ByteBuffer r6 = java.nio.ByteBuffer.wrap(r6)
                r6.order(r5)
                r5 = 0
            L_0x02ad:
                if (r5 >= r10) goto L_0x02c5
                r13 = r11[r5]
                r16 = r8
                long r7 = r13.f10260a
                int r7 = (int) r7
                r6.putInt(r7)
                long r7 = r13.f10261b
                int r7 = (int) r7
                r6.putInt(r7)
                int r5 = r5 + 1
                r8 = r16
                r7 = 1
                goto L_0x02ad
            L_0x02c5:
                r16 = r8
                g0.f r5 = new g0.f
                byte[] r6 = r6.array()
                r5.<init>(r6, r12, r10)
                r4.put(r0, r5)
                r6 = r16
                goto L_0x0300
            L_0x02d6:
                r16 = r8
                r4 = r14
                java.lang.String[] r4 = r1.split(r11, r4)
                int r5 = r4.length
                long[] r5 = new long[r5]
                r6 = 0
            L_0x02e1:
                int r7 = r4.length
                if (r6 >= r7) goto L_0x02ef
                r7 = r4[r6]
                long r7 = java.lang.Long.parseLong(r7)
                r5[r6] = r7
                int r6 = r6 + 1
                goto L_0x02e1
            L_0x02ef:
                r6 = r16
                java.lang.Object r4 = r2.get(r6)
                java.util.Map r4 = (java.util.Map) r4
                java.nio.ByteOrder r7 = r9.f10245b
                g0.f r5 = g0.f.b(r5, r7)
                r4.put(r0, r5)
            L_0x0300:
                r10 = 3
                goto L_0x034a
            L_0x0302:
                r6 = r8
                r4 = r14
                java.lang.String[] r4 = r1.split(r11, r4)
                int r5 = r4.length
                int[] r7 = new int[r5]
                r8 = 0
            L_0x030c:
                int r10 = r4.length
                if (r8 >= r10) goto L_0x031a
                r10 = r4[r8]
                int r10 = java.lang.Integer.parseInt(r10)
                r7[r8] = r10
                int r8 = r8 + 1
                goto L_0x030c
            L_0x031a:
                java.lang.Object r4 = r2.get(r6)
                java.util.Map r4 = (java.util.Map) r4
                java.nio.ByteOrder r8 = r9.f10245b
                int[] r10 = g0.f.f10231f
                r11 = 3
                r10 = r10[r11]
                int r10 = r10 * r5
                byte[] r10 = new byte[r10]
                java.nio.ByteBuffer r10 = java.nio.ByteBuffer.wrap(r10)
                r10.order(r8)
                r8 = 0
            L_0x0332:
                if (r8 >= r5) goto L_0x033d
                r11 = r7[r8]
                short r11 = (short) r11
                r10.putShort(r11)
                int r8 = r8 + 1
                goto L_0x0332
            L_0x033d:
                g0.f r7 = new g0.f
                byte[] r8 = r10.array()
                r10 = 3
                r7.<init>(r8, r10, r5)
                r4.put(r0, r7)
            L_0x034a:
                r5 = 0
                r7 = 1
                goto L_0x01a8
            L_0x034e:
                r10 = r6
                r6 = r8
                java.lang.Object r4 = r2.get(r6)
                java.util.Map r4 = (java.util.Map) r4
                java.nio.charset.Charset r5 = g0.f.f10229d
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r5.append(r1)
                r7 = 0
                r5.append(r7)
                java.lang.String r5 = r5.toString()
                java.nio.charset.Charset r7 = g0.f.f10229d
                byte[] r5 = r5.getBytes(r7)
                g0.f r7 = new g0.f
                int r8 = r5.length
                r11 = 2
                r7.<init>(r5, r11, r8)
                r4.put(r0, r7)
                r5 = 0
                r7 = 1
                goto L_0x03c3
            L_0x037b:
                r11 = r5
                r10 = r6
                r6 = r8
                java.lang.Object r4 = r2.get(r6)
                java.util.Map r4 = (java.util.Map) r4
                java.nio.charset.Charset r5 = g0.f.f10229d
                int r5 = r1.length()
                r7 = 1
                if (r5 != r7) goto L_0x03ae
                r5 = 0
                char r8 = r1.charAt(r5)
                r12 = 48
                if (r8 < r12) goto L_0x03af
                char r8 = r1.charAt(r5)
                r13 = 49
                if (r8 > r13) goto L_0x03af
                byte[] r8 = new byte[r7]
                char r13 = r1.charAt(r5)
                int r13 = r13 - r12
                byte r12 = (byte) r13
                r8[r5] = r12
                g0.f r12 = new g0.f
                r12.<init>(r8, r7, r7)
                goto L_0x03bb
            L_0x03ae:
                r5 = 0
            L_0x03af:
                java.nio.charset.Charset r8 = g0.f.f10229d
                byte[] r8 = r1.getBytes(r8)
                g0.f r12 = new g0.f
                int r13 = r8.length
                r12.<init>(r8, r7, r13)
            L_0x03bb:
                r4.put(r0, r12)
                goto L_0x03c3
            L_0x03bf:
                r11 = r5
                r10 = r6
                r6 = r8
                r5 = r4
            L_0x03c3:
                int r8 = r6 + 1
                r4 = r5
                r6 = r10
                r5 = r11
                goto L_0x00ec
            L_0x03ca:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: g0.g.a.c(java.lang.String, java.lang.String, java.util.ArrayList):void");
        }

        public final void d(int i10) {
            int i11;
            if (i10 == 0) {
                i11 = 1;
            } else if (i10 == 90) {
                i11 = 6;
            } else if (i10 == 180) {
                i11 = 3;
            } else if (i10 != 270) {
                p0.g("ExifData");
                i11 = 0;
            } else {
                i11 = 8;
            }
            c("Orientation", String.valueOf(i11), this.f10244a);
        }
    }

    static {
        j[] jVarArr = {new j(256, 3, 4, "ImageWidth"), new j(257, 3, 4, "ImageLength"), new j("Make", 271, 2), new j("Model", 272, 2), new j("Orientation", 274, 3), new j("XResolution", 282, 5), new j("YResolution", 283, 5), new j("ResolutionUnit", 296, 3), new j("Software", 305, 2), new j("DateTime", 306, 2), new j("YCbCrPositioning", 531, 3), new j("SubIFDPointer", 330, 4), new j("ExifIFDPointer", 34665, 4), new j("GPSInfoIFDPointer", 34853, 4)};
        j[] jVarArr2 = {new j("ExposureTime", 33434, 5), new j("FNumber", 33437, 5), new j("ExposureProgram", 34850, 3), new j("PhotographicSensitivity", 34855, 3), new j("SensitivityType", 34864, 3), new j("ExifVersion", 36864, 2), new j("DateTimeOriginal", 36867, 2), new j("DateTimeDigitized", 36868, 2), new j("ComponentsConfiguration", 37121, 7), new j("ShutterSpeedValue", 37377, 10), new j("ApertureValue", 37378, 5), new j("BrightnessValue", 37379, 10), new j("ExposureBiasValue", 37380, 10), new j("MaxApertureValue", 37381, 5), new j("MeteringMode", 37383, 3), new j("LightSource", 37384, 3), new j("Flash", 37385, 3), new j("FocalLength", 37386, 5), new j("SubSecTime", 37520, 2), new j("SubSecTimeOriginal", 37521, 2), new j("SubSecTimeDigitized", 37522, 2), new j("FlashpixVersion", 40960, 7), new j("ColorSpace", 40961, 3), new j(40962, 3, 4, "PixelXDimension"), new j(40963, 3, 4, "PixelYDimension"), new j("InteroperabilityIFDPointer", 40965, 4), new j("FocalPlaneResolutionUnit", 41488, 3), new j("SensingMethod", 41495, 3), new j("FileSource", 41728, 7), new j("SceneType", 41729, 7), new j("CustomRendered", 41985, 3), new j("ExposureMode", 41986, 3), new j("WhiteBalance", 41987, 3), new j("SceneCaptureType", 41990, 3), new j("Contrast", 41992, 3), new j("Saturation", 41993, 3), new j("Sharpness", 41994, 3)};
        j[] jVarArr3 = {new j("GPSVersionID", 0, 1), new j("GPSLatitudeRef", 1, 2), new j(2, 5, 10, "GPSLatitude"), new j("GPSLongitudeRef", 3, 2), new j(4, 5, 10, "GPSLongitude"), new j("GPSAltitudeRef", 5, 1), new j("GPSAltitude", 6, 5), new j("GPSTimeStamp", 7, 5), new j("GPSSpeedRef", 12, 2), new j("GPSTrackRef", 14, 2), new j("GPSImgDirectionRef", 16, 2), new j("GPSDestBearingRef", 23, 2), new j("GPSDestDistanceRef", 25, 2)};
        f10236d = new j[][]{jVarArr, jVarArr2, jVarArr3, new j[]{new j("InteroperabilityIndex", 1, 2)}};
    }

    public g(ByteOrder byteOrder, ArrayList arrayList) {
        boolean z10;
        if (arrayList.size() == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        g0.E("Malformed attributes list. Number of IFDs mismatch.", z10);
        this.f10239b = byteOrder;
        this.f10238a = arrayList;
    }

    public final Map<String, f> a(int i10) {
        g0.A(i10, 0, 4, v.d("Invalid IFD index: ", i10, ". Index should be between [0, EXIF_TAGS.length] "));
        return this.f10238a.get(i10);
    }
}
