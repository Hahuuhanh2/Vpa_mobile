package nd;

import com.google.zxing.NotFoundException;
import f0.b0;

/* compiled from: FieldParser */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f13583a;

    /* renamed from: b  reason: collision with root package name */
    public static final Object[][] f13584b;

    /* renamed from: c  reason: collision with root package name */
    public static final Object[][] f13585c;

    /* renamed from: d  reason: collision with root package name */
    public static final Object[][] f13586d;

    /* renamed from: e  reason: collision with root package name */
    public static final Object[][] f13587e;

    static {
        Object obj = new Object();
        f13583a = obj;
        f13584b = new Object[][]{new Object[]{"00", 18}, new Object[]{"01", 14}, new Object[]{"02", 14}, new Object[]{"10", obj, 20}, new Object[]{"11", 6}, new Object[]{"12", 6}, new Object[]{"13", 6}, new Object[]{"15", 6}, new Object[]{"17", 6}, new Object[]{"20", 2}, new Object[]{"21", obj, 20}, new Object[]{"22", obj, 29}, new Object[]{"30", obj, 8}, new Object[]{"37", obj, 8}, new Object[]{"90", obj, 30}, new Object[]{"91", obj, 30}, new Object[]{"92", obj, 30}, new Object[]{"93", obj, 30}, new Object[]{"94", obj, 30}, new Object[]{"95", obj, 30}, new Object[]{"96", obj, 30}, new Object[]{"97", obj, 30}, new Object[]{"98", obj, 30}, new Object[]{"99", obj, 30}};
        f13585c = new Object[][]{new Object[]{"240", obj, 30}, new Object[]{"241", obj, 30}, new Object[]{"242", obj, 6}, new Object[]{"250", obj, 30}, new Object[]{"251", obj, 30}, new Object[]{"253", obj, 17}, new Object[]{"254", obj, 20}, new Object[]{"400", obj, 30}, new Object[]{"401", obj, 30}, new Object[]{"402", 17}, new Object[]{"403", obj, 30}, new Object[]{"410", 13}, new Object[]{"411", 13}, new Object[]{"412", 13}, new Object[]{"413", 13}, new Object[]{"414", 13}, new Object[]{"420", obj, 20}, new Object[]{"421", obj, 15}, new Object[]{"422", 3}, new Object[]{"423", obj, 15}, new Object[]{"424", 3}, new Object[]{"425", 3}, new Object[]{"426", 3}};
        f13586d = new Object[][]{new Object[]{"310", 6}, new Object[]{"311", 6}, new Object[]{"312", 6}, new Object[]{"313", 6}, new Object[]{"314", 6}, new Object[]{"315", 6}, new Object[]{"316", 6}, new Object[]{"320", 6}, new Object[]{"321", 6}, new Object[]{"322", 6}, new Object[]{"323", 6}, new Object[]{"324", 6}, new Object[]{"325", 6}, new Object[]{"326", 6}, new Object[]{"327", 6}, new Object[]{"328", 6}, new Object[]{"329", 6}, new Object[]{"330", 6}, new Object[]{"331", 6}, new Object[]{"332", 6}, new Object[]{"333", 6}, new Object[]{"334", 6}, new Object[]{"335", 6}, new Object[]{"336", 6}, new Object[]{"340", 6}, new Object[]{"341", 6}, new Object[]{"342", 6}, new Object[]{"343", 6}, new Object[]{"344", 6}, new Object[]{"345", 6}, new Object[]{"346", 6}, new Object[]{"347", 6}, new Object[]{"348", 6}, new Object[]{"349", 6}, new Object[]{"350", 6}, new Object[]{"351", 6}, new Object[]{"352", 6}, new Object[]{"353", 6}, new Object[]{"354", 6}, new Object[]{"355", 6}, new Object[]{"356", 6}, new Object[]{"357", 6}, new Object[]{"360", 6}, new Object[]{"361", 6}, new Object[]{"362", 6}, new Object[]{"363", 6}, new Object[]{"364", 6}, new Object[]{"365", 6}, new Object[]{"366", 6}, new Object[]{"367", 6}, new Object[]{"368", 6}, new Object[]{"369", 6}, new Object[]{"390", obj, 15}, new Object[]{"391", obj, 18}, new Object[]{"392", obj, 15}, new Object[]{"393", obj, 18}, new Object[]{"703", obj, 30}};
        f13587e = new Object[][]{new Object[]{"7001", 13}, new Object[]{"7002", obj, 30}, new Object[]{"7003", 10}, new Object[]{"8001", 14}, new Object[]{"8002", obj, 20}, new Object[]{"8003", obj, 30}, new Object[]{"8004", obj, 30}, new Object[]{"8005", 6}, new Object[]{"8006", 18}, new Object[]{"8007", obj, 30}, new Object[]{"8008", obj, 12}, new Object[]{"8018", 18}, new Object[]{"8020", obj, 25}, new Object[]{"8100", 6}, new Object[]{"8101", 10}, new Object[]{"8102", 2}, new Object[]{"8110", obj, 70}, new Object[]{"8200", obj, 70}};
    }

    public static String a(String str) {
        if (str.isEmpty()) {
            return null;
        }
        if (str.length() >= 2) {
            String substring = str.substring(0, 2);
            Object[][] objArr = f13584b;
            for (int i10 = 0; i10 < 24; i10++) {
                Object[] objArr2 = objArr[i10];
                if (objArr2[0].equals(substring)) {
                    Object obj = objArr2[1];
                    if (obj == f13583a) {
                        return c(2, ((Integer) objArr2[2]).intValue(), str);
                    }
                    return b(2, ((Integer) obj).intValue(), str);
                }
            }
            if (str.length() >= 3) {
                String substring2 = str.substring(0, 3);
                Object[][] objArr3 = f13585c;
                for (int i11 = 0; i11 < 23; i11++) {
                    Object[] objArr4 = objArr3[i11];
                    if (objArr4[0].equals(substring2)) {
                        Object obj2 = objArr4[1];
                        if (obj2 == f13583a) {
                            return c(3, ((Integer) objArr4[2]).intValue(), str);
                        }
                        return b(3, ((Integer) obj2).intValue(), str);
                    }
                }
                Object[][] objArr5 = f13586d;
                for (int i12 = 0; i12 < 57; i12++) {
                    Object[] objArr6 = objArr5[i12];
                    if (objArr6[0].equals(substring2)) {
                        Object obj3 = objArr6[1];
                        if (obj3 == f13583a) {
                            return c(4, ((Integer) objArr6[2]).intValue(), str);
                        }
                        return b(4, ((Integer) obj3).intValue(), str);
                    }
                }
                if (str.length() >= 4) {
                    String substring3 = str.substring(0, 4);
                    Object[][] objArr7 = f13587e;
                    for (int i13 = 0; i13 < 18; i13++) {
                        Object[] objArr8 = objArr7[i13];
                        if (objArr8[0].equals(substring3)) {
                            Object obj4 = objArr8[1];
                            if (obj4 == f13583a) {
                                return c(4, ((Integer) objArr8[2]).intValue(), str);
                            }
                            return b(4, ((Integer) obj4).intValue(), str);
                        }
                    }
                    throw NotFoundException.f7967c;
                }
                throw NotFoundException.f7967c;
            }
            throw NotFoundException.f7967c;
        }
        throw NotFoundException.f7967c;
    }

    public static String b(int i10, int i11, String str) {
        if (str.length() >= i10) {
            String substring = str.substring(0, i10);
            int i12 = i11 + i10;
            if (str.length() >= i12) {
                String substring2 = str.substring(i10, i12);
                String str2 = "(" + substring + ')' + substring2;
                String a10 = a(str.substring(i12));
                if (a10 == null) {
                    return str2;
                }
                return b0.r(str2, a10);
            }
            throw NotFoundException.f7967c;
        }
        throw NotFoundException.f7967c;
    }

    public static String c(int i10, int i11, String str) {
        String substring = str.substring(0, i10);
        int min = Math.min(str.length(), i11 + i10);
        String substring2 = str.substring(i10, min);
        String str2 = "(" + substring + ')' + substring2;
        String a10 = a(str.substring(min));
        if (a10 == null) {
            return str2;
        }
        return b0.r(str2, a10);
    }
}
