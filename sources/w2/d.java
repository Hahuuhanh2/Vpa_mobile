package w2;

import android.support.v4.media.a;
import f0.b0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Map;
import java.util.TreeMap;
import n0.l;
import p3.l0;

/* compiled from: ProfileTranscoder */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f16440a = {112, 114, 111, 0};

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f16441b = {112, 114, 109, 0};

    public static byte[] a(a[] aVarArr, byte[] bArr) {
        int i10 = 0;
        int i11 = 0;
        for (a aVar : aVarArr) {
            i11 += (((((aVar.f16435g * 2) + 8) - 1) & -8) / 8) + (aVar.f16433e * 2) + b(aVar.f16429a, aVar.f16430b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + aVar.f16434f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i11);
        if (Arrays.equals(bArr, e.f16444c)) {
            int length = aVarArr.length;
            while (i10 < length) {
                a aVar2 = aVarArr[i10];
                l(byteArrayOutputStream, aVar2, b(aVar2.f16429a, aVar2.f16430b, bArr));
                n(byteArrayOutputStream, aVar2);
                k(byteArrayOutputStream, aVar2);
                m(byteArrayOutputStream, aVar2);
                i10++;
            }
        } else {
            for (a aVar3 : aVarArr) {
                l(byteArrayOutputStream, aVar3, b(aVar3.f16429a, aVar3.f16430b, bArr));
            }
            int length2 = aVarArr.length;
            while (i10 < length2) {
                a aVar4 = aVarArr[i10];
                n(byteArrayOutputStream, aVar4);
                k(byteArrayOutputStream, aVar4);
                m(byteArrayOutputStream, aVar4);
                i10++;
            }
        }
        if (byteArrayOutputStream.size() == i11) {
            return byteArrayOutputStream.toByteArray();
        }
        StringBuilder q10 = a.q("The bytes saved do not match expectation. actual=");
        q10.append(byteArrayOutputStream.size());
        q10.append(" expected=");
        q10.append(i11);
        throw new IllegalStateException(q10.toString());
    }

    public static String b(String str, String str2, byte[] bArr) {
        String str3;
        byte[] bArr2 = e.f16446e;
        String str4 = "!";
        if (!Arrays.equals(bArr, bArr2) && !Arrays.equals(bArr, e.f16445d)) {
            str3 = str4;
        } else {
            str3 = ":";
        }
        if (str.length() <= 0) {
            if (str4.equals(str3)) {
                return str2.replace(":", str4);
            }
            if (":".equals(str3)) {
                str2 = str2.replace(str4, ":");
            }
            return str2;
        } else if (str2.equals("classes.dex")) {
            return str;
        } else {
            if (str2.contains(str4) || str2.contains(":")) {
                if (str4.equals(str3)) {
                    return str2.replace(":", str4);
                }
                if (":".equals(str3)) {
                    str2 = str2.replace(str4, ":");
                }
                return str2;
            } else if (str2.endsWith(".apk")) {
                return str2;
            } else {
                StringBuilder q10 = a.q(str);
                if (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, e.f16445d)) {
                    str4 = ":";
                }
                return a.o(q10, str4, str2);
            }
        }
    }

    public static int c(int i10, int i11, int i12) {
        if (i10 == 1) {
            throw new IllegalStateException("HOT methods are not stored in the bitmap");
        } else if (i10 == 2) {
            return i11;
        } else {
            if (i10 == 4) {
                return i11 + i12;
            }
            throw new IllegalStateException(a.m("Unexpected flag: ", i10));
        }
    }

    public static int[] d(ByteArrayInputStream byteArrayInputStream, int i10) {
        int[] iArr = new int[i10];
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += l0.w0(byteArrayInputStream);
            iArr[i12] = i11;
        }
        return iArr;
    }

    public static a[] e(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, a[] aVarArr) {
        byte[] bArr3 = e.f16447f;
        if (Arrays.equals(bArr, bArr3)) {
            if (Arrays.equals(e.f16442a, bArr2)) {
                throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            } else if (Arrays.equals(bArr, bArr3)) {
                int v02 = (int) l0.v0(fileInputStream, 1);
                byte[] u02 = l0.u0(fileInputStream, (int) l0.v0(fileInputStream, 4), (int) l0.v0(fileInputStream, 4));
                if (fileInputStream.read() <= 0) {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(u02);
                    try {
                        a[] f10 = f(byteArrayInputStream, v02, aVarArr);
                        byteArrayInputStream.close();
                        return f10;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                } else {
                    throw new IllegalStateException("Content found after the end of file");
                }
            } else {
                throw new IllegalStateException("Unsupported meta version");
            }
        } else if (Arrays.equals(bArr, e.f16448g)) {
            int w02 = l0.w0(fileInputStream);
            byte[] u03 = l0.u0(fileInputStream, (int) l0.v0(fileInputStream, 4), (int) l0.v0(fileInputStream, 4));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(u03);
                try {
                    a[] g2 = g(byteArrayInputStream2, bArr2, w02, aVarArr);
                    byteArrayInputStream2.close();
                    return g2;
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
            } else {
                throw new IllegalStateException("Content found after the end of file");
            }
        } else {
            throw new IllegalStateException("Unsupported meta version");
        }
        throw th;
        throw th;
    }

    public static a[] f(ByteArrayInputStream byteArrayInputStream, int i10, a[] aVarArr) {
        int i11 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new a[0];
        }
        if (i10 == aVarArr.length) {
            String[] strArr = new String[i10];
            int[] iArr = new int[i10];
            for (int i12 = 0; i12 < i10; i12++) {
                int w02 = l0.w0(byteArrayInputStream);
                iArr[i12] = l0.w0(byteArrayInputStream);
                strArr[i12] = new String(l0.s0(byteArrayInputStream, w02), StandardCharsets.UTF_8);
            }
            while (i11 < i10) {
                a aVar = aVarArr[i11];
                if (aVar.f16430b.equals(strArr[i11])) {
                    int i13 = iArr[i11];
                    aVar.f16433e = i13;
                    aVar.f16436h = d(byteArrayInputStream, i13);
                    i11++;
                } else {
                    throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
                }
            }
            return aVarArr;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }

    public static a[] g(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i10, a[] aVarArr) {
        String str;
        if (byteArrayInputStream.available() == 0) {
            return new a[0];
        }
        if (i10 == aVarArr.length) {
            int i11 = 0;
            while (i11 < i10) {
                l0.w0(byteArrayInputStream);
                String str2 = new String(l0.s0(byteArrayInputStream, l0.w0(byteArrayInputStream)), StandardCharsets.UTF_8);
                long v02 = l0.v0(byteArrayInputStream, 4);
                int w02 = l0.w0(byteArrayInputStream);
                a aVar = null;
                if (aVarArr.length > 0) {
                    int indexOf = str2.indexOf("!");
                    if (indexOf < 0) {
                        indexOf = str2.indexOf(":");
                    }
                    if (indexOf > 0) {
                        str = str2.substring(indexOf + 1);
                    } else {
                        str = str2;
                    }
                    int i12 = 0;
                    while (true) {
                        if (i12 >= aVarArr.length) {
                            break;
                        } else if (aVarArr[i12].f16430b.equals(str)) {
                            aVar = aVarArr[i12];
                            break;
                        } else {
                            i12++;
                        }
                    }
                }
                if (aVar != null) {
                    aVar.f16432d = v02;
                    int[] d10 = d(byteArrayInputStream, w02);
                    if (Arrays.equals(bArr, e.f16446e)) {
                        aVar.f16433e = w02;
                        aVar.f16436h = d10;
                    }
                    i11++;
                } else {
                    throw new IllegalStateException(b0.r("Missing profile key: ", str2));
                }
            }
            return aVarArr;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }

    public static a[] h(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (Arrays.equals(bArr, e.f16443b)) {
            int v02 = (int) l0.v0(fileInputStream, 1);
            byte[] u02 = l0.u0(fileInputStream, (int) l0.v0(fileInputStream, 4), (int) l0.v0(fileInputStream, 4));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(u02);
                try {
                    a[] i10 = i(byteArrayInputStream, str, v02);
                    byteArrayInputStream.close();
                    return i10;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            } else {
                throw new IllegalStateException("Content found after the end of file");
            }
        } else {
            throw new IllegalStateException("Unsupported version");
        }
        throw th;
    }

    public static a[] i(ByteArrayInputStream byteArrayInputStream, String str, int i10) {
        int i11;
        ByteArrayInputStream byteArrayInputStream2 = byteArrayInputStream;
        int i12 = i10;
        if (byteArrayInputStream.available() == 0) {
            return new a[0];
        }
        a[] aVarArr = new a[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            int w02 = l0.w0(byteArrayInputStream);
            int w03 = l0.w0(byteArrayInputStream);
            long v02 = l0.v0(byteArrayInputStream2, 4);
            String str2 = str;
            aVarArr[i13] = new a(str2, new String(l0.s0(byteArrayInputStream2, w02), StandardCharsets.UTF_8), l0.v0(byteArrayInputStream2, 4), w03, (int) v02, (int) l0.v0(byteArrayInputStream2, 4), new int[w03], new TreeMap());
        }
        int i14 = 0;
        while (i14 < i12) {
            a aVar = aVarArr[i14];
            int available = byteArrayInputStream.available() - aVar.f16434f;
            int i15 = 0;
            while (byteArrayInputStream.available() > available) {
                i15 += l0.w0(byteArrayInputStream);
                aVar.f16437i.put(Integer.valueOf(i15), 1);
                for (int w04 = l0.w0(byteArrayInputStream); w04 > 0; w04--) {
                    l0.w0(byteArrayInputStream);
                    int v03 = (int) l0.v0(byteArrayInputStream2, 1);
                    if (!(v03 == 6 || v03 == 7)) {
                        while (v03 > 0) {
                            l0.v0(byteArrayInputStream2, 1);
                            for (int v04 = (int) l0.v0(byteArrayInputStream2, 1); v04 > 0; v04--) {
                                l0.w0(byteArrayInputStream);
                            }
                            v03--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() == available) {
                aVar.f16436h = d(byteArrayInputStream2, aVar.f16433e);
                BitSet valueOf = BitSet.valueOf(l0.s0(byteArrayInputStream2, ((((aVar.f16435g * 2) + 8) - 1) & -8) / 8));
                int i16 = 0;
                while (true) {
                    int i17 = aVar.f16435g;
                    if (i16 >= i17) {
                        break;
                    }
                    if (valueOf.get(c(2, i16, i17))) {
                        i11 = 2;
                    } else {
                        i11 = 0;
                    }
                    if (valueOf.get(c(4, i16, i17))) {
                        i11 |= 4;
                    }
                    if (i11 != 0) {
                        Integer num = aVar.f16437i.get(Integer.valueOf(i16));
                        if (num == null) {
                            num = 0;
                        }
                        aVar.f16437i.put(Integer.valueOf(i16), Integer.valueOf(num.intValue() | i11));
                    }
                    i16++;
                }
                i14++;
            } else {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
        }
        return aVarArr;
    }

    /* JADX INFO: finally extract failed */
    public static boolean j(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, a[] aVarArr) {
        Throwable th2;
        Throwable th3;
        ArrayList arrayList;
        int i10;
        ByteArrayOutputStream byteArrayOutputStream2;
        Throwable th4;
        ByteArrayOutputStream byteArrayOutputStream3;
        Throwable th5;
        ByteArrayOutputStream byteArrayOutputStream4 = byteArrayOutputStream;
        byte[] bArr2 = bArr;
        a[] aVarArr2 = aVarArr;
        int i11 = 0;
        if (Arrays.equals(bArr2, e.f16442a)) {
            ArrayList arrayList2 = new ArrayList(3);
            ArrayList arrayList3 = new ArrayList(3);
            ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
            try {
                l0.l1(byteArrayOutputStream5, aVarArr2.length);
                int i12 = 2;
                int i13 = 2;
                for (a aVar : aVarArr2) {
                    l0.k1(byteArrayOutputStream5, aVar.f16431c, 4);
                    l0.k1(byteArrayOutputStream5, aVar.f16432d, 4);
                    l0.k1(byteArrayOutputStream5, (long) aVar.f16435g, 4);
                    String b10 = b(aVar.f16429a, aVar.f16430b, e.f16442a);
                    int length = b10.getBytes(StandardCharsets.UTF_8).length;
                    l0.l1(byteArrayOutputStream5, length);
                    i13 = i13 + 4 + 4 + 4 + 2 + (length * 1);
                    byteArrayOutputStream5.write(b10.getBytes(StandardCharsets.UTF_8));
                }
                byte[] byteArray = byteArrayOutputStream5.toByteArray();
                if (i13 == byteArray.length) {
                    f fVar = new f(1, byteArray, false);
                    byteArrayOutputStream5.close();
                    arrayList2.add(fVar);
                    ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                    int i14 = 0;
                    int i15 = 0;
                    while (i14 < aVarArr2.length) {
                        try {
                            a aVar2 = aVarArr2[i14];
                            l0.l1(byteArrayOutputStream6, i14);
                            l0.l1(byteArrayOutputStream6, aVar2.f16433e);
                            i15 = i15 + 2 + 2 + (aVar2.f16433e * 2);
                            k(byteArrayOutputStream6, aVar2);
                            i14++;
                        } catch (Throwable th6) {
                            th3.addSuppressed(th6);
                        }
                    }
                    byte[] byteArray2 = byteArrayOutputStream6.toByteArray();
                    if (i15 == byteArray2.length) {
                        f fVar2 = new f(3, byteArray2, true);
                        byteArrayOutputStream6.close();
                        arrayList2.add(fVar2);
                        ByteArrayOutputStream byteArrayOutputStream7 = new ByteArrayOutputStream();
                        int i16 = 0;
                        int i17 = 0;
                        while (i16 < aVarArr2.length) {
                            try {
                                a aVar3 = aVarArr2[i16];
                                int i18 = i11;
                                for (Map.Entry<Integer, Integer> value : aVar3.f16437i.entrySet()) {
                                    i18 |= ((Integer) value.getValue()).intValue();
                                }
                                byteArrayOutputStream2 = new ByteArrayOutputStream();
                                m(byteArrayOutputStream2, aVar3);
                                byte[] byteArray3 = byteArrayOutputStream2.toByteArray();
                                byteArrayOutputStream2.close();
                                byteArrayOutputStream3 = new ByteArrayOutputStream();
                                n(byteArrayOutputStream3, aVar3);
                                byte[] byteArray4 = byteArrayOutputStream3.toByteArray();
                                byteArrayOutputStream3.close();
                                l0.l1(byteArrayOutputStream7, i16);
                                int length2 = byteArray3.length + i12 + byteArray4.length;
                                int i19 = i17 + 2 + 4;
                                ArrayList arrayList4 = arrayList3;
                                l0.k1(byteArrayOutputStream7, (long) length2, 4);
                                l0.l1(byteArrayOutputStream7, i18);
                                byteArrayOutputStream7.write(byteArray3);
                                byteArrayOutputStream7.write(byteArray4);
                                i17 = i19 + length2;
                                i16++;
                                arrayList3 = arrayList4;
                                i11 = 0;
                                i12 = 2;
                            } catch (Throwable th7) {
                                Throwable th8 = th7;
                                try {
                                    byteArrayOutputStream7.close();
                                } catch (Throwable th9) {
                                    th8.addSuppressed(th9);
                                }
                                throw th8;
                            }
                        }
                        ArrayList arrayList5 = arrayList3;
                        byte[] byteArray5 = byteArrayOutputStream7.toByteArray();
                        if (i17 == byteArray5.length) {
                            f fVar3 = new f(4, byteArray5, true);
                            byteArrayOutputStream7.close();
                            arrayList2.add(fVar3);
                            long j10 = (long) 4;
                            long size = j10 + j10 + 4 + ((long) (arrayList2.size() * 16));
                            l0.k1(byteArrayOutputStream4, (long) arrayList2.size(), 4);
                            int i20 = 0;
                            while (i20 < arrayList2.size()) {
                                f fVar4 = (f) arrayList2.get(i20);
                                l0.k1(byteArrayOutputStream4, l.d(fVar4.f16449a), 4);
                                l0.k1(byteArrayOutputStream4, size, 4);
                                if (fVar4.f16451c) {
                                    byte[] bArr3 = fVar4.f16450b;
                                    byte[] y10 = l0.y(bArr3);
                                    arrayList = arrayList5;
                                    arrayList.add(y10);
                                    l0.k1(byteArrayOutputStream4, (long) y10.length, 4);
                                    l0.k1(byteArrayOutputStream4, (long) bArr3.length, 4);
                                    i10 = y10.length;
                                } else {
                                    arrayList = arrayList5;
                                    arrayList.add(fVar4.f16450b);
                                    l0.k1(byteArrayOutputStream4, (long) fVar4.f16450b.length, 4);
                                    l0.k1(byteArrayOutputStream4, 0, 4);
                                    i10 = fVar4.f16450b.length;
                                }
                                size += (long) i10;
                                i20++;
                                arrayList5 = arrayList;
                            }
                            ArrayList arrayList6 = arrayList5;
                            for (int i21 = 0; i21 < arrayList6.size(); i21++) {
                                byteArrayOutputStream4.write((byte[]) arrayList6.get(i21));
                            }
                            return true;
                        }
                        throw new IllegalStateException("Expected size " + i17 + ", does not match actual size " + byteArray5.length);
                    }
                    throw new IllegalStateException("Expected size " + i15 + ", does not match actual size " + byteArray2.length);
                }
                throw new IllegalStateException("Expected size " + i13 + ", does not match actual size " + byteArray.length);
            } catch (Throwable th10) {
                th2.addSuppressed(th10);
            }
        } else {
            byte[] bArr4 = e.f16443b;
            if (Arrays.equals(bArr2, bArr4)) {
                byte[] a10 = a(aVarArr2, bArr4);
                l0.k1(byteArrayOutputStream4, (long) aVarArr2.length, 1);
                l0.k1(byteArrayOutputStream4, (long) a10.length, 4);
                byte[] y11 = l0.y(a10);
                l0.k1(byteArrayOutputStream4, (long) y11.length, 4);
                byteArrayOutputStream4.write(y11);
                return true;
            } else if (Arrays.equals(bArr2, e.f16445d)) {
                l0.k1(byteArrayOutputStream4, (long) aVarArr2.length, 1);
                for (a aVar4 : aVarArr2) {
                    String b11 = b(aVar4.f16429a, aVar4.f16430b, e.f16445d);
                    l0.l1(byteArrayOutputStream4, b11.getBytes(StandardCharsets.UTF_8).length);
                    l0.l1(byteArrayOutputStream4, aVar4.f16436h.length);
                    l0.k1(byteArrayOutputStream4, (long) (aVar4.f16437i.size() * 4), 4);
                    l0.k1(byteArrayOutputStream4, aVar4.f16431c, 4);
                    byteArrayOutputStream4.write(b11.getBytes(StandardCharsets.UTF_8));
                    for (Integer intValue : aVar4.f16437i.keySet()) {
                        l0.l1(byteArrayOutputStream4, intValue.intValue());
                        l0.l1(byteArrayOutputStream4, 0);
                    }
                    for (int l12 : aVar4.f16436h) {
                        l0.l1(byteArrayOutputStream4, l12);
                    }
                }
                return true;
            } else {
                byte[] bArr5 = e.f16444c;
                if (Arrays.equals(bArr2, bArr5)) {
                    byte[] a11 = a(aVarArr2, bArr5);
                    l0.k1(byteArrayOutputStream4, (long) aVarArr2.length, 1);
                    l0.k1(byteArrayOutputStream4, (long) a11.length, 4);
                    byte[] y12 = l0.y(a11);
                    l0.k1(byteArrayOutputStream4, (long) y12.length, 4);
                    byteArrayOutputStream4.write(y12);
                    return true;
                } else if (!Arrays.equals(bArr2, e.f16446e)) {
                    return false;
                } else {
                    l0.l1(byteArrayOutputStream4, aVarArr2.length);
                    for (a aVar5 : aVarArr2) {
                        String b12 = b(aVar5.f16429a, aVar5.f16430b, e.f16446e);
                        l0.l1(byteArrayOutputStream4, b12.getBytes(StandardCharsets.UTF_8).length);
                        l0.l1(byteArrayOutputStream4, aVar5.f16437i.size());
                        l0.l1(byteArrayOutputStream4, aVar5.f16436h.length);
                        l0.k1(byteArrayOutputStream4, aVar5.f16431c, 4);
                        byteArrayOutputStream4.write(b12.getBytes(StandardCharsets.UTF_8));
                        for (Integer intValue2 : aVar5.f16437i.keySet()) {
                            l0.l1(byteArrayOutputStream4, intValue2.intValue());
                        }
                        for (int l13 : aVar5.f16436h) {
                            l0.l1(byteArrayOutputStream4, l13);
                        }
                    }
                    return true;
                }
            }
        }
        throw th4;
        throw th3;
        throw th5;
        throw th2;
    }

    public static void k(ByteArrayOutputStream byteArrayOutputStream, a aVar) {
        int i10 = 0;
        for (int valueOf : aVar.f16436h) {
            Integer valueOf2 = Integer.valueOf(valueOf);
            l0.l1(byteArrayOutputStream, valueOf2.intValue() - i10);
            i10 = valueOf2.intValue();
        }
    }

    public static void l(ByteArrayOutputStream byteArrayOutputStream, a aVar, String str) {
        l0.l1(byteArrayOutputStream, str.getBytes(StandardCharsets.UTF_8).length);
        l0.l1(byteArrayOutputStream, aVar.f16433e);
        l0.k1(byteArrayOutputStream, (long) aVar.f16434f, 4);
        l0.k1(byteArrayOutputStream, aVar.f16431c, 4);
        l0.k1(byteArrayOutputStream, (long) aVar.f16435g, 4);
        byteArrayOutputStream.write(str.getBytes(StandardCharsets.UTF_8));
    }

    public static void m(ByteArrayOutputStream byteArrayOutputStream, a aVar) {
        byte[] bArr = new byte[(((((aVar.f16435g * 2) + 8) - 1) & -8) / 8)];
        for (Map.Entry next : aVar.f16437i.entrySet()) {
            int intValue = ((Integer) next.getKey()).intValue();
            int intValue2 = ((Integer) next.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int c10 = c(2, intValue, aVar.f16435g);
                int i10 = c10 / 8;
                bArr[i10] = (byte) ((1 << (c10 % 8)) | bArr[i10]);
            }
            if ((intValue2 & 4) != 0) {
                int c11 = c(4, intValue, aVar.f16435g);
                int i11 = c11 / 8;
                bArr[i11] = (byte) ((1 << (c11 % 8)) | bArr[i11]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void n(ByteArrayOutputStream byteArrayOutputStream, a aVar) {
        int i10 = 0;
        for (Map.Entry next : aVar.f16437i.entrySet()) {
            int intValue = ((Integer) next.getKey()).intValue();
            if ((((Integer) next.getValue()).intValue() & 1) != 0) {
                l0.l1(byteArrayOutputStream, intValue - i10);
                l0.l1(byteArrayOutputStream, 0);
                i10 = intValue;
            }
        }
    }
}
