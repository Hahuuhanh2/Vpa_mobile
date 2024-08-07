package ec;

import j$.util.DesugarTimeZone;
import java.util.TimeZone;

/* compiled from: ISO8601Utils */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final TimeZone f9338a = DesugarTimeZone.getTimeZone("UTC");

    public static boolean a(String str, int i10, char c10) {
        if (i10 >= str.length() || str.charAt(i10) != c10) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x00e5 A[Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01d4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01cc A[Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01d4 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Date b(java.lang.String r17, java.text.ParsePosition r18) {
        /*
            r1 = r17
            r2 = r18
            int r0 = r18.getIndex()     // Catch:{ IndexOutOfBoundsException -> 0x01d8, NumberFormatException -> 0x01d6, IllegalArgumentException -> 0x01d4 }
            int r3 = r0 + 4
            int r0 = c(r0, r3, r1)     // Catch:{ IndexOutOfBoundsException -> 0x01d8, NumberFormatException -> 0x01d6, IllegalArgumentException -> 0x01d4 }
            r4 = 45
            boolean r5 = a(r1, r3, r4)     // Catch:{ IndexOutOfBoundsException -> 0x01d8, NumberFormatException -> 0x01d6, IllegalArgumentException -> 0x01d4 }
            if (r5 == 0) goto L_0x0018
            int r3 = r3 + 1
        L_0x0018:
            int r5 = r3 + 2
            int r3 = c(r3, r5, r1)     // Catch:{ IndexOutOfBoundsException -> 0x01d8, NumberFormatException -> 0x01d6, IllegalArgumentException -> 0x01d4 }
            boolean r6 = a(r1, r5, r4)     // Catch:{ IndexOutOfBoundsException -> 0x01d8, NumberFormatException -> 0x01d6, IllegalArgumentException -> 0x01d4 }
            if (r6 == 0) goto L_0x0026
            int r5 = r5 + 1
        L_0x0026:
            int r6 = r5 + 2
            int r5 = c(r5, r6, r1)     // Catch:{ IndexOutOfBoundsException -> 0x01d8, NumberFormatException -> 0x01d6, IllegalArgumentException -> 0x01d4 }
            r7 = 84
            boolean r7 = a(r1, r6, r7)     // Catch:{ IndexOutOfBoundsException -> 0x01d8, NumberFormatException -> 0x01d6, IllegalArgumentException -> 0x01d4 }
            r8 = 0
            r9 = 1
            if (r7 != 0) goto L_0x004d
            int r10 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x01d8, NumberFormatException -> 0x01d6, IllegalArgumentException -> 0x01d4 }
            if (r10 > r6) goto L_0x004d
            java.util.GregorianCalendar r4 = new java.util.GregorianCalendar     // Catch:{ IndexOutOfBoundsException -> 0x01d8, NumberFormatException -> 0x01d6, IllegalArgumentException -> 0x01d4 }
            int r3 = r3 - r9
            r4.<init>(r0, r3, r5)     // Catch:{ IndexOutOfBoundsException -> 0x01d8, NumberFormatException -> 0x01d6, IllegalArgumentException -> 0x01d4 }
            r4.setLenient(r8)     // Catch:{ IndexOutOfBoundsException -> 0x01d8, NumberFormatException -> 0x01d6, IllegalArgumentException -> 0x01d4 }
            r2.setIndex(r6)     // Catch:{ IndexOutOfBoundsException -> 0x01d8, NumberFormatException -> 0x01d6, IllegalArgumentException -> 0x01d4 }
            java.util.Date r0 = r4.getTime()     // Catch:{ IndexOutOfBoundsException -> 0x01d8, NumberFormatException -> 0x01d6, IllegalArgumentException -> 0x01d4 }
            return r0
        L_0x004d:
            r8 = 43
            r10 = 90
            r11 = 2
            if (r7 == 0) goto L_0x00d6
            int r6 = r6 + 1
            int r7 = r6 + 2
            int r6 = c(r6, r7, r1)     // Catch:{ IndexOutOfBoundsException -> 0x01d8, NumberFormatException -> 0x01d6, IllegalArgumentException -> 0x01d4 }
            r12 = 58
            boolean r13 = a(r1, r7, r12)     // Catch:{ IndexOutOfBoundsException -> 0x01d8, NumberFormatException -> 0x01d6, IllegalArgumentException -> 0x01d4 }
            if (r13 == 0) goto L_0x0066
            int r7 = r7 + 1
        L_0x0066:
            int r13 = r7 + 2
            int r7 = c(r7, r13, r1)     // Catch:{ IndexOutOfBoundsException -> 0x01d8, NumberFormatException -> 0x01d6, IllegalArgumentException -> 0x01d4 }
            boolean r12 = a(r1, r13, r12)     // Catch:{ IndexOutOfBoundsException -> 0x01d8, NumberFormatException -> 0x01d6, IllegalArgumentException -> 0x01d4 }
            if (r12 == 0) goto L_0x0074
            int r13 = r13 + 1
        L_0x0074:
            int r12 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x01d8, NumberFormatException -> 0x01d6, IllegalArgumentException -> 0x01d4 }
            if (r12 <= r13) goto L_0x00d3
            char r12 = r1.charAt(r13)     // Catch:{ IndexOutOfBoundsException -> 0x01d8, NumberFormatException -> 0x01d6, IllegalArgumentException -> 0x01d4 }
            if (r12 == r10) goto L_0x00d3
            if (r12 == r8) goto L_0x00d3
            if (r12 == r4) goto L_0x00d3
            int r4 = r13 + 2
            int r12 = c(r13, r4, r1)     // Catch:{ IndexOutOfBoundsException -> 0x01d8, NumberFormatException -> 0x01d6, IllegalArgumentException -> 0x01d4 }
            r13 = 59
            if (r12 <= r13) goto L_0x0094
            r13 = 63
            if (r12 >= r13) goto L_0x0094
            r12 = 59
        L_0x0094:
            r13 = 46
            boolean r13 = a(r1, r4, r13)     // Catch:{ IndexOutOfBoundsException -> 0x01d8, NumberFormatException -> 0x01d6, IllegalArgumentException -> 0x01d4 }
            if (r13 == 0) goto L_0x00d1
            int r4 = r4 + 1
            int r13 = r4 + 1
        L_0x00a0:
            int r14 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x01d8, NumberFormatException -> 0x01d6, IllegalArgumentException -> 0x01d4 }
            if (r13 >= r14) goto L_0x00b6
            char r14 = r1.charAt(r13)     // Catch:{ IndexOutOfBoundsException -> 0x01d8, NumberFormatException -> 0x01d6, IllegalArgumentException -> 0x01d4 }
            r15 = 48
            if (r14 < r15) goto L_0x00ba
            r15 = 57
            if (r14 <= r15) goto L_0x00b3
            goto L_0x00ba
        L_0x00b3:
            int r13 = r13 + 1
            goto L_0x00a0
        L_0x00b6:
            int r13 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x01d8, NumberFormatException -> 0x01d6, IllegalArgumentException -> 0x01d4 }
        L_0x00ba:
            int r14 = r4 + 3
            int r14 = java.lang.Math.min(r13, r14)     // Catch:{ IndexOutOfBoundsException -> 0x01d8, NumberFormatException -> 0x01d6, IllegalArgumentException -> 0x01d4 }
            int r15 = c(r4, r14, r1)     // Catch:{ IndexOutOfBoundsException -> 0x01d8, NumberFormatException -> 0x01d6, IllegalArgumentException -> 0x01d4 }
            int r14 = r14 - r4
            if (r14 == r9) goto L_0x00cd
            if (r14 == r11) goto L_0x00ca
            goto L_0x00cf
        L_0x00ca:
            int r15 = r15 * 10
            goto L_0x00cf
        L_0x00cd:
            int r15 = r15 * 100
        L_0x00cf:
            r4 = r13
            goto L_0x00df
        L_0x00d1:
            r15 = 0
            goto L_0x00df
        L_0x00d3:
            r4 = r6
            r6 = r13
            goto L_0x00d8
        L_0x00d6:
            r4 = 0
            r7 = 0
        L_0x00d8:
            r15 = 0
            r12 = 0
            r16 = r6
            r6 = r4
            r4 = r16
        L_0x00df:
            int r11 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x01d8, NumberFormatException -> 0x01d6, IllegalArgumentException -> 0x01d4 }
            if (r11 <= r4) goto L_0x01cc
            char r11 = r1.charAt(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01d8, NumberFormatException -> 0x01d6, IllegalArgumentException -> 0x01d4 }
            r13 = 5
            if (r11 != r10) goto L_0x00f1
            java.util.TimeZone r8 = f9338a     // Catch:{ IndexOutOfBoundsException -> 0x01d8, NumberFormatException -> 0x01d6, IllegalArgumentException -> 0x01d4 }
            int r4 = r4 + r9
            goto L_0x019b
        L_0x00f1:
            if (r11 == r8) goto L_0x0114
            r8 = 45
            if (r11 != r8) goto L_0x00f8
            goto L_0x0114
        L_0x00f8:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException     // Catch:{ IndexOutOfBoundsException -> 0x01d8, NumberFormatException -> 0x01d6, IllegalArgumentException -> 0x01d4 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x01d8, NumberFormatException -> 0x01d6, IllegalArgumentException -> 0x01d4 }
            r3.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x01d8, NumberFormatException -> 0x01d6, IllegalArgumentException -> 0x01d4 }
            java.lang.String r4 = "Invalid time zone indicator '"
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01d8, NumberFormatException -> 0x01d6, IllegalArgumentException -> 0x01d4 }
            r3.append(r11)     // Catch:{ IndexOutOfBoundsException -> 0x01d8, NumberFormatException -> 0x01d6, IllegalArgumentException -> 0x01d4 }
            java.lang.String r4 = "'"
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01d8, NumberFormatException -> 0x01d6, IllegalArgumentException -> 0x01d4 }
            java.lang.String r3 = r3.toString()     // Catch:{ IndexOutOfBoundsException -> 0x01d8, NumberFormatException -> 0x01d6, IllegalArgumentException -> 0x01d4 }
            r0.<init>(r3)     // Catch:{ IndexOutOfBoundsException -> 0x01d8, NumberFormatException -> 0x01d6, IllegalArgumentException -> 0x01d4 }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x01d8, NumberFormatException -> 0x01d6, IllegalArgumentException -> 0x01d4 }
        L_0x0114:
            java.lang.String r8 = r1.substring(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01d8, NumberFormatException -> 0x01d6, IllegalArgumentException -> 0x01d4 }
            int r10 = r8.length()     // Catch:{ IndexOutOfBoundsException -> 0x01d8, NumberFormatException -> 0x01d6, IllegalArgumentException -> 0x01d4 }
            if (r10 < r13) goto L_0x011f
            goto L_0x0130
        L_0x011f:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x01d8, NumberFormatException -> 0x01d6, IllegalArgumentException -> 0x01d4 }
            r10.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x01d8, NumberFormatException -> 0x01d6, IllegalArgumentException -> 0x01d4 }
            r10.append(r8)     // Catch:{ IndexOutOfBoundsException -> 0x01d8, NumberFormatException -> 0x01d6, IllegalArgumentException -> 0x01d4 }
            java.lang.String r8 = "00"
            r10.append(r8)     // Catch:{ IndexOutOfBoundsException -> 0x01d8, NumberFormatException -> 0x01d6, IllegalArgumentException -> 0x01d4 }
            java.lang.String r8 = r10.toString()     // Catch:{ IndexOutOfBoundsException -> 0x01d8, NumberFormatException -> 0x01d6, IllegalArgumentException -> 0x01d4 }
        L_0x0130:
            int r10 = r8.length()     // Catch:{ IndexOutOfBoundsException -> 0x01d8, NumberFormatException -> 0x01d6, IllegalArgumentException -> 0x01d4 }
            int r4 = r4 + r10
            java.lang.String r10 = "+0000"
            boolean r10 = r10.equals(r8)     // Catch:{ IndexOutOfBoundsException -> 0x01d8, NumberFormatException -> 0x01d6, IllegalArgumentException -> 0x01d4 }
            if (r10 != 0) goto L_0x0199
            java.lang.String r10 = "+00:00"
            boolean r10 = r10.equals(r8)     // Catch:{ IndexOutOfBoundsException -> 0x01d8, NumberFormatException -> 0x01d6, IllegalArgumentException -> 0x01d4 }
            if (r10 == 0) goto L_0x0146
            goto L_0x0199
        L_0x0146:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x01d8, NumberFormatException -> 0x01d6, IllegalArgumentException -> 0x01d4 }
            r10.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x01d8, NumberFormatException -> 0x01d6, IllegalArgumentException -> 0x01d4 }
            java.lang.String r11 = "GMT"
            r10.append(r11)     // Catch:{ IndexOutOfBoundsException -> 0x01d8, NumberFormatException -> 0x01d6, IllegalArgumentException -> 0x01d4 }
            r10.append(r8)     // Catch:{ IndexOutOfBoundsException -> 0x01d8, NumberFormatException -> 0x01d6, IllegalArgumentException -> 0x01d4 }
            java.lang.String r8 = r10.toString()     // Catch:{ IndexOutOfBoundsException -> 0x01d8, NumberFormatException -> 0x01d6, IllegalArgumentException -> 0x01d4 }
            java.util.TimeZone r10 = j$.util.DesugarTimeZone.getTimeZone(r8)     // Catch:{ IndexOutOfBoundsException -> 0x01d8, NumberFormatException -> 0x01d6, IllegalArgumentException -> 0x01d4 }
            java.lang.String r11 = r10.getID()     // Catch:{ IndexOutOfBoundsException -> 0x01d8, NumberFormatException -> 0x01d6, IllegalArgumentException -> 0x01d4 }
            boolean r13 = r11.equals(r8)     // Catch:{ IndexOutOfBoundsException -> 0x01d8, NumberFormatException -> 0x01d6, IllegalArgumentException -> 0x01d4 }
            if (r13 != 0) goto L_0x0197
            java.lang.String r13 = ":"
            java.lang.String r14 = ""
            java.lang.String r11 = r11.replace(r13, r14)     // Catch:{ IndexOutOfBoundsException -> 0x01d8, NumberFormatException -> 0x01d6, IllegalArgumentException -> 0x01d4 }
            boolean r11 = r11.equals(r8)     // Catch:{ IndexOutOfBoundsException -> 0x01d8, NumberFormatException -> 0x01d6, IllegalArgumentException -> 0x01d4 }
            if (r11 == 0) goto L_0x0174
            goto L_0x0197
        L_0x0174:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException     // Catch:{ IndexOutOfBoundsException -> 0x01d8, NumberFormatException -> 0x01d6, IllegalArgumentException -> 0x01d4 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x01d8, NumberFormatException -> 0x01d6, IllegalArgumentException -> 0x01d4 }
            r3.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x01d8, NumberFormatException -> 0x01d6, IllegalArgumentException -> 0x01d4 }
            java.lang.String r4 = "Mismatching time zone indicator: "
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01d8, NumberFormatException -> 0x01d6, IllegalArgumentException -> 0x01d4 }
            r3.append(r8)     // Catch:{ IndexOutOfBoundsException -> 0x01d8, NumberFormatException -> 0x01d6, IllegalArgumentException -> 0x01d4 }
            java.lang.String r4 = " given, resolves to "
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01d8, NumberFormatException -> 0x01d6, IllegalArgumentException -> 0x01d4 }
            java.lang.String r4 = r10.getID()     // Catch:{ IndexOutOfBoundsException -> 0x01d8, NumberFormatException -> 0x01d6, IllegalArgumentException -> 0x01d4 }
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01d8, NumberFormatException -> 0x01d6, IllegalArgumentException -> 0x01d4 }
            java.lang.String r3 = r3.toString()     // Catch:{ IndexOutOfBoundsException -> 0x01d8, NumberFormatException -> 0x01d6, IllegalArgumentException -> 0x01d4 }
            r0.<init>(r3)     // Catch:{ IndexOutOfBoundsException -> 0x01d8, NumberFormatException -> 0x01d6, IllegalArgumentException -> 0x01d4 }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x01d8, NumberFormatException -> 0x01d6, IllegalArgumentException -> 0x01d4 }
        L_0x0197:
            r8 = r10
            goto L_0x019b
        L_0x0199:
            java.util.TimeZone r8 = f9338a     // Catch:{ IndexOutOfBoundsException -> 0x01d8, NumberFormatException -> 0x01d6, IllegalArgumentException -> 0x01d4 }
        L_0x019b:
            java.util.GregorianCalendar r10 = new java.util.GregorianCalendar     // Catch:{ IndexOutOfBoundsException -> 0x01d8, NumberFormatException -> 0x01d6, IllegalArgumentException -> 0x01d4 }
            r10.<init>(r8)     // Catch:{ IndexOutOfBoundsException -> 0x01d8, NumberFormatException -> 0x01d6, IllegalArgumentException -> 0x01d4 }
            r8 = 0
            r10.setLenient(r8)     // Catch:{ IndexOutOfBoundsException -> 0x01d8, NumberFormatException -> 0x01d6, IllegalArgumentException -> 0x01d4 }
            r10.set(r9, r0)     // Catch:{ IndexOutOfBoundsException -> 0x01d8, NumberFormatException -> 0x01d6, IllegalArgumentException -> 0x01d4 }
            int r3 = r3 - r9
            r0 = 2
            r10.set(r0, r3)     // Catch:{ IndexOutOfBoundsException -> 0x01d8, NumberFormatException -> 0x01d6, IllegalArgumentException -> 0x01d4 }
            r0 = 5
            r10.set(r0, r5)     // Catch:{ IndexOutOfBoundsException -> 0x01d8, NumberFormatException -> 0x01d6, IllegalArgumentException -> 0x01d4 }
            r0 = 11
            r10.set(r0, r6)     // Catch:{ IndexOutOfBoundsException -> 0x01d8, NumberFormatException -> 0x01d6, IllegalArgumentException -> 0x01d4 }
            r0 = 12
            r10.set(r0, r7)     // Catch:{ IndexOutOfBoundsException -> 0x01d8, NumberFormatException -> 0x01d6, IllegalArgumentException -> 0x01d4 }
            r0 = 13
            r10.set(r0, r12)     // Catch:{ IndexOutOfBoundsException -> 0x01d8, NumberFormatException -> 0x01d6, IllegalArgumentException -> 0x01d4 }
            r0 = 14
            r10.set(r0, r15)     // Catch:{ IndexOutOfBoundsException -> 0x01d8, NumberFormatException -> 0x01d6, IllegalArgumentException -> 0x01d4 }
            r2.setIndex(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01d8, NumberFormatException -> 0x01d6, IllegalArgumentException -> 0x01d4 }
            java.util.Date r0 = r10.getTime()     // Catch:{ IndexOutOfBoundsException -> 0x01d8, NumberFormatException -> 0x01d6, IllegalArgumentException -> 0x01d4 }
            return r0
        L_0x01cc:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IndexOutOfBoundsException -> 0x01d8, NumberFormatException -> 0x01d6, IllegalArgumentException -> 0x01d4 }
            java.lang.String r3 = "No time zone indicator"
            r0.<init>(r3)     // Catch:{ IndexOutOfBoundsException -> 0x01d8, NumberFormatException -> 0x01d6, IllegalArgumentException -> 0x01d4 }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x01d8, NumberFormatException -> 0x01d6, IllegalArgumentException -> 0x01d4 }
        L_0x01d4:
            r0 = move-exception
            goto L_0x01d9
        L_0x01d6:
            r0 = move-exception
            goto L_0x01d9
        L_0x01d8:
            r0 = move-exception
        L_0x01d9:
            if (r1 != 0) goto L_0x01dd
            r1 = 0
            goto L_0x01f1
        L_0x01dd:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = 34
            r3.append(r4)
            r3.append(r1)
            r3.append(r4)
            java.lang.String r1 = r3.toString()
        L_0x01f1:
            java.lang.String r3 = r0.getMessage()
            if (r3 == 0) goto L_0x01fd
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x0217
        L_0x01fd:
            java.lang.String r3 = "("
            java.lang.StringBuilder r3 = android.support.v4.media.a.q(r3)
            java.lang.Class r4 = r0.getClass()
            java.lang.String r4 = r4.getName()
            r3.append(r4)
            java.lang.String r4 = ")"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
        L_0x0217:
            java.text.ParseException r4 = new java.text.ParseException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Failed to parse date ["
            r5.append(r6)
            r5.append(r1)
            java.lang.String r1 = "]: "
            r5.append(r1)
            r5.append(r3)
            java.lang.String r1 = r5.toString()
            int r2 = r18.getIndex()
            r4.<init>(r1, r2)
            r4.initCause(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.a.b(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    public static int c(int i10, int i11, String str) {
        int i12;
        int i13;
        if (i10 < 0 || i11 > str.length() || i10 > i11) {
            throw new NumberFormatException(str);
        }
        if (i10 < i11) {
            i13 = i10 + 1;
            int digit = Character.digit(str.charAt(i10), 10);
            if (digit >= 0) {
                i12 = -digit;
            } else {
                StringBuilder q10 = android.support.v4.media.a.q("Invalid number: ");
                q10.append(str.substring(i10, i11));
                throw new NumberFormatException(q10.toString());
            }
        } else {
            i12 = 0;
            i13 = i10;
        }
        while (i13 < i11) {
            int i14 = i13 + 1;
            int digit2 = Character.digit(str.charAt(i13), 10);
            if (digit2 >= 0) {
                i12 = (i12 * 10) - digit2;
                i13 = i14;
            } else {
                StringBuilder q11 = android.support.v4.media.a.q("Invalid number: ");
                q11.append(str.substring(i10, i11));
                throw new NumberFormatException(q11.toString());
            }
        }
        return -i12;
    }
}
