package com.google.protobuf;

import j7.a;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import tc.c;

/* compiled from: MessageLiteToString */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f7938a;

    static {
        char[] cArr = new char[80];
        f7938a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(int i10, StringBuilder sb2) {
        while (i10 > 0) {
            char[] cArr = f7938a;
            int i11 = 80;
            if (i10 <= 80) {
                i11 = i10;
            }
            sb2.append(cArr, 0, i11);
            i10 -= i11;
        }
    }

    public static void b(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj instanceof List) {
            for (Object b10 : (List) obj) {
                b(sb2, i10, str, b10);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry b11 : ((Map) obj).entrySet()) {
                b(sb2, i10, str, b11);
            }
        } else {
            sb2.append(10);
            a(i10, sb2);
            if (!str.isEmpty()) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(Character.toLowerCase(str.charAt(0)));
                for (int i11 = 1; i11 < str.length(); i11++) {
                    char charAt = str.charAt(i11);
                    if (Character.isUpperCase(charAt)) {
                        sb3.append("_");
                    }
                    sb3.append(Character.toLowerCase(charAt));
                }
                str = sb3.toString();
            }
            sb2.append(str);
            if (obj instanceof String) {
                sb2.append(": \"");
                c.e eVar = c.f14960b;
                sb2.append(a.C(new c.e(((String) obj).getBytes(k.f7917a))));
                sb2.append('\"');
            } else if (obj instanceof c) {
                sb2.append(": \"");
                sb2.append(a.C((c) obj));
                sb2.append('\"');
            } else if (obj instanceof i) {
                sb2.append(" {");
                c((i) obj, sb2, i10 + 2);
                sb2.append("\n");
                a(i10, sb2);
                sb2.append("}");
            } else if (obj instanceof Map.Entry) {
                sb2.append(" {");
                Map.Entry entry = (Map.Entry) obj;
                int i12 = i10 + 2;
                b(sb2, i12, "key", entry.getKey());
                b(sb2, i12, "value", entry.getValue());
                sb2.append("\n");
                a(i10, sb2);
                sb2.append("}");
            } else {
                sb2.append(": ");
                sb2.append(obj);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01ad, code lost:
        if (((java.lang.Integer) r7).intValue() == 0) goto L_0x0209;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01bf, code lost:
        if (java.lang.Float.floatToRawIntBits(((java.lang.Float) r7).floatValue()) == 0) goto L_0x0209;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01d5, code lost:
        if (java.lang.Double.doubleToRawLongBits(((java.lang.Double) r7).doubleValue()) == 0) goto L_0x0209;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void c(com.google.protobuf.u r19, java.lang.StringBuilder r20, int r21) {
        /*
            r0 = r19
            r1 = r20
            r2 = r21
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.util.TreeMap r5 = new java.util.TreeMap
            r5.<init>()
            java.lang.Class r6 = r19.getClass()
            java.lang.reflect.Method[] r6 = r6.getDeclaredMethods()
            int r7 = r6.length
            r8 = 0
            r9 = r8
        L_0x0020:
            java.lang.String r10 = "get"
            java.lang.String r11 = "has"
            java.lang.String r12 = "set"
            r13 = 3
            if (r9 >= r7) goto L_0x008c
            r14 = r6[r9]
            int r15 = r14.getModifiers()
            boolean r15 = java.lang.reflect.Modifier.isStatic(r15)
            if (r15 == 0) goto L_0x0036
            goto L_0x0089
        L_0x0036:
            java.lang.String r15 = r14.getName()
            int r15 = r15.length()
            if (r15 >= r13) goto L_0x0041
            goto L_0x0089
        L_0x0041:
            java.lang.String r13 = r14.getName()
            boolean r12 = r13.startsWith(r12)
            if (r12 == 0) goto L_0x0053
            java.lang.String r10 = r14.getName()
            r3.add(r10)
            goto L_0x0089
        L_0x0053:
            int r12 = r14.getModifiers()
            boolean r12 = java.lang.reflect.Modifier.isPublic(r12)
            if (r12 != 0) goto L_0x005e
            goto L_0x0089
        L_0x005e:
            java.lang.Class[] r12 = r14.getParameterTypes()
            int r12 = r12.length
            if (r12 == 0) goto L_0x0066
            goto L_0x0089
        L_0x0066:
            java.lang.String r12 = r14.getName()
            boolean r11 = r12.startsWith(r11)
            if (r11 == 0) goto L_0x0078
            java.lang.String r10 = r14.getName()
            r4.put(r10, r14)
            goto L_0x0089
        L_0x0078:
            java.lang.String r11 = r14.getName()
            boolean r10 = r11.startsWith(r10)
            if (r10 == 0) goto L_0x0089
            java.lang.String r10 = r14.getName()
            r5.put(r10, r14)
        L_0x0089:
            int r9 = r9 + 1
            goto L_0x0020
        L_0x008c:
            java.util.Set r6 = r5.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L_0x0094:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0225
            java.lang.Object r7 = r6.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r9 = r7.getKey()
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r9 = r9.substring(r13)
            java.lang.String r13 = "List"
            boolean r14 = r9.endsWith(r13)
            if (r14 == 0) goto L_0x00e9
            java.lang.String r14 = "OrBuilderList"
            boolean r14 = r9.endsWith(r14)
            if (r14 != 0) goto L_0x00e9
            boolean r13 = r9.equals(r13)
            if (r13 != 0) goto L_0x00e9
            java.lang.Object r13 = r7.getValue()
            java.lang.reflect.Method r13 = (java.lang.reflect.Method) r13
            if (r13 == 0) goto L_0x00e9
            java.lang.Class r14 = r13.getReturnType()
            java.lang.Class<java.util.List> r15 = java.util.List.class
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x00e9
            int r7 = r9.length()
            int r7 = r7 + -4
            java.lang.String r7 = r9.substring(r8, r7)
            java.lang.Object[] r9 = new java.lang.Object[r8]
            java.lang.Object r9 = com.google.protobuf.i.z(r13, r0, r9)
            b(r1, r2, r7, r9)
            goto L_0x0222
        L_0x00e9:
            java.lang.String r13 = "Map"
            boolean r14 = r9.endsWith(r13)
            if (r14 == 0) goto L_0x0132
            boolean r13 = r9.equals(r13)
            if (r13 != 0) goto L_0x0132
            java.lang.Object r13 = r7.getValue()
            java.lang.reflect.Method r13 = (java.lang.reflect.Method) r13
            if (r13 == 0) goto L_0x0132
            java.lang.Class r14 = r13.getReturnType()
            java.lang.Class<java.util.Map> r15 = java.util.Map.class
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x0132
            java.lang.Class<java.lang.Deprecated> r14 = java.lang.Deprecated.class
            boolean r14 = r13.isAnnotationPresent(r14)
            if (r14 != 0) goto L_0x0132
            int r14 = r13.getModifiers()
            boolean r14 = java.lang.reflect.Modifier.isPublic(r14)
            if (r14 == 0) goto L_0x0132
            int r7 = r9.length()
            int r7 = r7 + -3
            java.lang.String r7 = r9.substring(r8, r7)
            java.lang.Object[] r9 = new java.lang.Object[r8]
            java.lang.Object r9 = com.google.protobuf.i.z(r13, r0, r9)
            b(r1, r2, r7, r9)
            goto L_0x0222
        L_0x0132:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r12)
            r13.append(r9)
            java.lang.String r13 = r13.toString()
            boolean r13 = r3.contains(r13)
            if (r13 != 0) goto L_0x0149
            goto L_0x0222
        L_0x0149:
            java.lang.String r13 = "Bytes"
            boolean r13 = r9.endsWith(r13)
            if (r13 == 0) goto L_0x016e
            java.lang.StringBuilder r13 = android.support.v4.media.a.q(r10)
            int r14 = r9.length()
            int r14 = r14 + -5
            java.lang.String r14 = r9.substring(r8, r14)
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            boolean r13 = r5.containsKey(r13)
            if (r13 == 0) goto L_0x016e
            goto L_0x0222
        L_0x016e:
            java.lang.Object r7 = r7.getValue()
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r11)
            r13.append(r9)
            java.lang.String r13 = r13.toString()
            java.lang.Object r13 = r4.get(r13)
            java.lang.reflect.Method r13 = (java.lang.reflect.Method) r13
            if (r7 == 0) goto L_0x0222
            java.lang.Object[] r14 = new java.lang.Object[r8]
            java.lang.Object r7 = com.google.protobuf.i.z(r7, r0, r14)
            r14 = 1
            if (r13 != 0) goto L_0x0211
            boolean r13 = r7 instanceof java.lang.Boolean
            if (r13 == 0) goto L_0x01a2
            r13 = r7
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            r13 = r13 ^ r14
            goto L_0x020c
        L_0x01a2:
            boolean r13 = r7 instanceof java.lang.Integer
            if (r13 == 0) goto L_0x01b0
            r13 = r7
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            if (r13 != 0) goto L_0x020b
            goto L_0x0209
        L_0x01b0:
            boolean r13 = r7 instanceof java.lang.Float
            if (r13 == 0) goto L_0x01c2
            r13 = r7
            java.lang.Float r13 = (java.lang.Float) r13
            float r13 = r13.floatValue()
            int r13 = java.lang.Float.floatToRawIntBits(r13)
            if (r13 != 0) goto L_0x020b
            goto L_0x0209
        L_0x01c2:
            boolean r13 = r7 instanceof java.lang.Double
            if (r13 == 0) goto L_0x01d8
            r13 = r7
            java.lang.Double r13 = (java.lang.Double) r13
            double r15 = r13.doubleValue()
            long r15 = java.lang.Double.doubleToRawLongBits(r15)
            r17 = 0
            int r13 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r13 != 0) goto L_0x020b
            goto L_0x0209
        L_0x01d8:
            boolean r13 = r7 instanceof java.lang.String
            if (r13 == 0) goto L_0x01e3
            java.lang.String r13 = ""
            boolean r13 = r7.equals(r13)
            goto L_0x020c
        L_0x01e3:
            boolean r13 = r7 instanceof tc.c
            if (r13 == 0) goto L_0x01ee
            tc.c$e r13 = tc.c.f14960b
            boolean r13 = r7.equals(r13)
            goto L_0x020c
        L_0x01ee:
            boolean r13 = r7 instanceof com.google.protobuf.u
            if (r13 == 0) goto L_0x01fc
            r13 = r7
            com.google.protobuf.u r13 = (com.google.protobuf.u) r13
            com.google.protobuf.i r13 = r13.g()
            if (r7 != r13) goto L_0x020b
            goto L_0x0209
        L_0x01fc:
            boolean r13 = r7 instanceof java.lang.Enum
            if (r13 == 0) goto L_0x020b
            r13 = r7
            java.lang.Enum r13 = (java.lang.Enum) r13
            int r13 = r13.ordinal()
            if (r13 != 0) goto L_0x020b
        L_0x0209:
            r13 = r14
            goto L_0x020c
        L_0x020b:
            r13 = r8
        L_0x020c:
            if (r13 != 0) goto L_0x020f
            goto L_0x021d
        L_0x020f:
            r14 = r8
            goto L_0x021d
        L_0x0211:
            java.lang.Object[] r14 = new java.lang.Object[r8]
            java.lang.Object r13 = com.google.protobuf.i.z(r13, r0, r14)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r14 = r13.booleanValue()
        L_0x021d:
            if (r14 == 0) goto L_0x0222
            b(r1, r2, r9, r7)
        L_0x0222:
            r13 = 3
            goto L_0x0094
        L_0x0225:
            boolean r3 = r0 instanceof com.google.protobuf.i.c
            if (r3 == 0) goto L_0x0251
            r3 = r0
            com.google.protobuf.i$c r3 = (com.google.protobuf.i.c) r3
            com.google.protobuf.h<com.google.protobuf.i$d> r3 = r3.extensions
            java.util.Iterator r3 = r3.k()
        L_0x0232:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0251
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            com.google.protobuf.i$d r5 = (com.google.protobuf.i.d) r5
            r5.getClass()
            java.lang.Object r4 = r4.getValue()
            java.lang.String r5 = "[0]"
            b(r1, r2, r5, r4)
            goto L_0x0232
        L_0x0251:
            com.google.protobuf.i r0 = (com.google.protobuf.i) r0
            com.google.protobuf.d0 r0 = r0.unknownFields
            if (r0 == 0) goto L_0x026f
        L_0x0257:
            int r3 = r0.f7894a
            if (r8 >= r3) goto L_0x026f
            int[] r3 = r0.f7895b
            r3 = r3[r8]
            int r3 = r3 >>> 3
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.Object[] r4 = r0.f7896c
            r4 = r4[r8]
            b(r1, r2, r3, r4)
            int r8 = r8 + 1
            goto L_0x0257
        L_0x026f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.v.c(com.google.protobuf.u, java.lang.StringBuilder, int):void");
    }
}
