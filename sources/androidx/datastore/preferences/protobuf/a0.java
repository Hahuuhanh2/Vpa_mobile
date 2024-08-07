package androidx.datastore.preferences.protobuf;

import j2.c;
import j7.a;
import java.util.List;
import java.util.Map;

/* compiled from: MessageLiteToString */
public final class a0 {
    public static final String a(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (Character.isUpperCase(charAt)) {
                sb2.append("_");
            }
            sb2.append(Character.toLowerCase(charAt));
        }
        return sb2.toString();
    }

    public static final void b(StringBuilder sb2, int i10, String str, Object obj) {
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
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                sb2.append(' ');
            }
            sb2.append(str);
            if (obj instanceof String) {
                sb2.append(": \"");
                c.e eVar = c.f11484b;
                sb2.append(a.B(new c.e(((String) obj).getBytes(p.f2318a))));
                sb2.append('\"');
            } else if (obj instanceof c) {
                sb2.append(": \"");
                sb2.append(a.B((c) obj));
                sb2.append('\"');
            } else if (obj instanceof n) {
                sb2.append(" {");
                c((n) obj, sb2, i10 + 2);
                sb2.append("\n");
                while (i11 < i10) {
                    sb2.append(' ');
                    i11++;
                }
                sb2.append("}");
            } else if (obj instanceof Map.Entry) {
                sb2.append(" {");
                Map.Entry entry = (Map.Entry) obj;
                int i13 = i10 + 2;
                b(sb2, i13, "key", entry.getKey());
                b(sb2, i13, "value", entry.getValue());
                sb2.append("\n");
                while (i11 < i10) {
                    sb2.append(' ');
                    i11++;
                }
                sb2.append("}");
            } else {
                sb2.append(": ");
                sb2.append(obj.toString());
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01cd, code lost:
        if (((java.lang.Integer) r11).intValue() == 0) goto L_0x0222;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01de, code lost:
        if (((java.lang.Float) r11).floatValue() == 0.0f) goto L_0x0222;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01f0, code lost:
        if (((java.lang.Double) r11).doubleValue() == 0.0d) goto L_0x0222;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void c(androidx.datastore.preferences.protobuf.z r18, java.lang.StringBuilder r19, int r20) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.util.TreeSet r5 = new java.util.TreeSet
            r5.<init>()
            java.lang.Class r6 = r18.getClass()
            java.lang.reflect.Method[] r6 = r6.getDeclaredMethods()
            int r7 = r6.length
            r8 = 0
            r9 = r8
        L_0x0020:
            java.lang.String r10 = "get"
            if (r9 >= r7) goto L_0x004f
            r11 = r6[r9]
            java.lang.String r12 = r11.getName()
            r4.put(r12, r11)
            java.lang.Class[] r12 = r11.getParameterTypes()
            int r12 = r12.length
            if (r12 != 0) goto L_0x004c
            java.lang.String r12 = r11.getName()
            r3.put(r12, r11)
            java.lang.String r12 = r11.getName()
            boolean r10 = r12.startsWith(r10)
            if (r10 == 0) goto L_0x004c
            java.lang.String r10 = r11.getName()
            r5.add(r10)
        L_0x004c:
            int r9 = r9 + 1
            goto L_0x0020
        L_0x004f:
            java.util.Iterator r5 = r5.iterator()
        L_0x0053:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0241
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = ""
            java.lang.String r9 = r6.replaceFirst(r10, r7)
            java.lang.String r11 = "List"
            boolean r12 = r9.endsWith(r11)
            r13 = 1
            if (r12 == 0) goto L_0x00bf
            java.lang.String r12 = "OrBuilderList"
            boolean r12 = r9.endsWith(r12)
            if (r12 != 0) goto L_0x00bf
            boolean r11 = r9.equals(r11)
            if (r11 != 0) goto L_0x00bf
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = r9.substring(r8, r13)
            java.lang.String r12 = r12.toLowerCase()
            r11.append(r12)
            int r12 = r9.length()
            int r12 = r12 + -4
            java.lang.String r12 = r9.substring(r13, r12)
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            java.lang.Object r12 = r3.get(r6)
            java.lang.reflect.Method r12 = (java.lang.reflect.Method) r12
            if (r12 == 0) goto L_0x00bf
            java.lang.Class r14 = r12.getReturnType()
            java.lang.Class<java.util.List> r15 = java.util.List.class
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x00bf
            java.lang.String r6 = a(r11)
            java.lang.Object[] r7 = new java.lang.Object[r8]
            java.lang.Object r7 = androidx.datastore.preferences.protobuf.n.m(r12, r0, r7)
            b(r1, r2, r6, r7)
            goto L_0x0053
        L_0x00bf:
            java.lang.String r11 = "Map"
            boolean r12 = r9.endsWith(r11)
            if (r12 == 0) goto L_0x0123
            boolean r11 = r9.equals(r11)
            if (r11 != 0) goto L_0x0123
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = r9.substring(r8, r13)
            java.lang.String r12 = r12.toLowerCase()
            r11.append(r12)
            int r12 = r9.length()
            int r12 = r12 + -3
            java.lang.String r12 = r9.substring(r13, r12)
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            java.lang.Object r6 = r3.get(r6)
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            if (r6 == 0) goto L_0x0123
            java.lang.Class r12 = r6.getReturnType()
            java.lang.Class<java.util.Map> r14 = java.util.Map.class
            boolean r12 = r12.equals(r14)
            if (r12 == 0) goto L_0x0123
            java.lang.Class<java.lang.Deprecated> r12 = java.lang.Deprecated.class
            boolean r12 = r6.isAnnotationPresent(r12)
            if (r12 != 0) goto L_0x0123
            int r12 = r6.getModifiers()
            boolean r12 = java.lang.reflect.Modifier.isPublic(r12)
            if (r12 == 0) goto L_0x0123
            java.lang.String r7 = a(r11)
            java.lang.Object[] r9 = new java.lang.Object[r8]
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.n.m(r6, r0, r9)
            b(r1, r2, r7, r6)
            goto L_0x0053
        L_0x0123:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r11 = "set"
            r6.append(r11)
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            java.lang.Object r6 = r4.get(r6)
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            if (r6 != 0) goto L_0x013e
            goto L_0x0053
        L_0x013e:
            java.lang.String r6 = "Bytes"
            boolean r6 = r9.endsWith(r6)
            if (r6 == 0) goto L_0x0163
            java.lang.StringBuilder r6 = android.support.v4.media.a.q(r10)
            int r11 = r9.length()
            int r11 = r11 + -5
            java.lang.String r11 = r9.substring(r8, r11)
            r6.append(r11)
            java.lang.String r6 = r6.toString()
            boolean r6 = r3.containsKey(r6)
            if (r6 == 0) goto L_0x0163
            goto L_0x0053
        L_0x0163:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r11 = r9.substring(r8, r13)
            java.lang.String r11 = r11.toLowerCase()
            r6.append(r11)
            java.lang.String r11 = r9.substring(r13)
            r6.append(r11)
            java.lang.String r6 = r6.toString()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r10)
            r11.append(r9)
            java.lang.String r11 = r11.toString()
            java.lang.Object r11 = r3.get(r11)
            java.lang.reflect.Method r11 = (java.lang.reflect.Method) r11
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r14 = "has"
            r12.append(r14)
            r12.append(r9)
            java.lang.String r9 = r12.toString()
            java.lang.Object r9 = r3.get(r9)
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9
            if (r11 == 0) goto L_0x0053
            java.lang.Object[] r12 = new java.lang.Object[r8]
            java.lang.Object r11 = androidx.datastore.preferences.protobuf.n.m(r11, r0, r12)
            if (r9 != 0) goto L_0x022a
            boolean r9 = r11 instanceof java.lang.Boolean
            if (r9 == 0) goto L_0x01c2
            r7 = r11
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            r7 = r7 ^ r13
            goto L_0x0225
        L_0x01c2:
            boolean r9 = r11 instanceof java.lang.Integer
            if (r9 == 0) goto L_0x01d0
            r7 = r11
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            if (r7 != 0) goto L_0x0224
            goto L_0x0222
        L_0x01d0:
            boolean r9 = r11 instanceof java.lang.Float
            if (r9 == 0) goto L_0x01e1
            r7 = r11
            java.lang.Float r7 = (java.lang.Float) r7
            float r7 = r7.floatValue()
            r9 = 0
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 != 0) goto L_0x0224
            goto L_0x0222
        L_0x01e1:
            boolean r9 = r11 instanceof java.lang.Double
            if (r9 == 0) goto L_0x01f3
            r7 = r11
            java.lang.Double r7 = (java.lang.Double) r7
            double r14 = r7.doubleValue()
            r16 = 0
            int r7 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r7 != 0) goto L_0x0224
            goto L_0x0222
        L_0x01f3:
            boolean r9 = r11 instanceof java.lang.String
            if (r9 == 0) goto L_0x01fc
            boolean r7 = r11.equals(r7)
            goto L_0x0225
        L_0x01fc:
            boolean r7 = r11 instanceof j2.c
            if (r7 == 0) goto L_0x0207
            j2.c$e r7 = j2.c.f11484b
            boolean r7 = r11.equals(r7)
            goto L_0x0225
        L_0x0207:
            boolean r7 = r11 instanceof androidx.datastore.preferences.protobuf.z
            if (r7 == 0) goto L_0x0215
            r7 = r11
            androidx.datastore.preferences.protobuf.z r7 = (androidx.datastore.preferences.protobuf.z) r7
            androidx.datastore.preferences.protobuf.n r7 = r7.g()
            if (r11 != r7) goto L_0x0224
            goto L_0x0222
        L_0x0215:
            boolean r7 = r11 instanceof java.lang.Enum
            if (r7 == 0) goto L_0x0224
            r7 = r11
            java.lang.Enum r7 = (java.lang.Enum) r7
            int r7 = r7.ordinal()
            if (r7 != 0) goto L_0x0224
        L_0x0222:
            r7 = r13
            goto L_0x0225
        L_0x0224:
            r7 = r8
        L_0x0225:
            if (r7 != 0) goto L_0x0228
            goto L_0x0236
        L_0x0228:
            r13 = r8
            goto L_0x0236
        L_0x022a:
            java.lang.Object[] r7 = new java.lang.Object[r8]
            java.lang.Object r7 = androidx.datastore.preferences.protobuf.n.m(r9, r0, r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r13 = r7.booleanValue()
        L_0x0236:
            if (r13 == 0) goto L_0x0053
            java.lang.String r6 = a(r6)
            b(r1, r2, r6, r11)
            goto L_0x0053
        L_0x0241:
            boolean r3 = r0 instanceof androidx.datastore.preferences.protobuf.n.c
            if (r3 == 0) goto L_0x026d
            r3 = r0
            androidx.datastore.preferences.protobuf.n$c r3 = (androidx.datastore.preferences.protobuf.n.c) r3
            androidx.datastore.preferences.protobuf.l<androidx.datastore.preferences.protobuf.n$d> r3 = r3.extensions
            java.util.Iterator r3 = r3.k()
        L_0x024e:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x026d
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            androidx.datastore.preferences.protobuf.n$d r5 = (androidx.datastore.preferences.protobuf.n.d) r5
            r5.getClass()
            java.lang.Object r4 = r4.getValue()
            java.lang.String r5 = "[0]"
            b(r1, r2, r5, r4)
            goto L_0x024e
        L_0x026d:
            androidx.datastore.preferences.protobuf.n r0 = (androidx.datastore.preferences.protobuf.n) r0
            androidx.datastore.preferences.protobuf.k0 r0 = r0.unknownFields
            if (r0 == 0) goto L_0x028b
        L_0x0273:
            int r3 = r0.f2294a
            if (r8 >= r3) goto L_0x028b
            int[] r3 = r0.f2295b
            r3 = r3[r8]
            int r3 = r3 >>> 3
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.Object[] r4 = r0.f2296c
            r4 = r4[r8]
            b(r1, r2, r3, r4)
            int r8 = r8 + 1
            goto L_0x0273
        L_0x028b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.a0.c(androidx.datastore.preferences.protobuf.z, java.lang.StringBuilder, int):void");
    }
}
