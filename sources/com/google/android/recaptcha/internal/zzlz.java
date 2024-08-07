package com.google.android.recaptcha.internal;

import f0.b0;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import v.v;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
final class zzlz {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static String zza(zzlx zzlx, String str) {
        StringBuilder v2 = b0.v("# ", str);
        zzd(zzlx, v2, 0);
        return v2.toString();
    }

    public static void zzb(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj instanceof List) {
            for (Object zzb : (List) obj) {
                zzb(sb2, i10, str, zzb);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry zzb2 : ((Map) obj).entrySet()) {
                zzb(sb2, i10, str, zzb2);
            }
        } else {
            sb2.append(10);
            zzc(i10, sb2);
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
                sb2.append(zzmw.zza(new zziu(((String) obj).getBytes(zzla.zza))));
                sb2.append('\"');
            } else if (obj instanceof zziv) {
                sb2.append(": \"");
                sb2.append(zzmw.zza((zziv) obj));
                sb2.append('\"');
            } else if (obj instanceof zzks) {
                sb2.append(" {");
                zzd((zzks) obj, sb2, i10 + 2);
                sb2.append("\n");
                zzc(i10, sb2);
                sb2.append("}");
            } else if (obj instanceof Map.Entry) {
                int i12 = i10 + 2;
                sb2.append(" {");
                Map.Entry entry = (Map.Entry) obj;
                zzb(sb2, i12, "key", entry.getKey());
                zzb(sb2, i12, "value", entry.getValue());
                sb2.append("\n");
                zzc(i10, sb2);
                sb2.append("}");
            } else {
                sb2.append(": ");
                sb2.append(obj);
            }
        }
    }

    private static void zzc(int i10, StringBuilder sb2) {
        while (i10 > 0) {
            int i11 = 80;
            if (i10 <= 80) {
                i11 = i10;
            }
            sb2.append(zza, 0, i11);
            i10 -= i11;
        }
    }

    private static void zzd(zzlx zzlx, StringBuilder sb2, int i10) {
        int i11;
        boolean z10;
        Method method;
        Method method2;
        zzlx zzlx2 = zzlx;
        StringBuilder sb3 = sb2;
        int i12 = i10;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzlx.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i13 = 0;
        while (true) {
            i11 = 3;
            if (i13 >= length) {
                break;
            }
            Method method3 = declaredMethods[i13];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i13++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i11);
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                zzb(sb3, i12, substring.substring(0, substring.length() - 4), zzks.zzB(method2, zzlx2, new Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                zzb(sb3, i12, substring.substring(0, substring.length() - 3), zzks.zzB(method, zzlx2, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object zzB = zzks.zzB(method4, zzlx2, new Object[0]);
                    if (method5 == null) {
                        if (zzB instanceof Boolean) {
                            if (!((Boolean) zzB).booleanValue()) {
                            }
                        } else if (zzB instanceof Integer) {
                            if (((Integer) zzB).intValue() == 0) {
                            }
                        } else if (zzB instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) zzB).floatValue()) == 0) {
                            }
                        } else if (!(zzB instanceof Double)) {
                            if (zzB instanceof String) {
                                z10 = zzB.equals("");
                            } else if (zzB instanceof zziv) {
                                z10 = zzB.equals(zziv.zzb);
                            } else if (zzB instanceof zzlx) {
                                if (zzB == ((zzlx) zzB).zzac()) {
                                }
                            } else if ((zzB instanceof Enum) && ((Enum) zzB).ordinal() == 0) {
                            }
                            if (z10) {
                            }
                        } else if (Double.doubleToRawLongBits(((Double) zzB).doubleValue()) == 0) {
                        }
                    } else if (!((Boolean) zzks.zzB(method5, zzlx2, new Object[0])).booleanValue()) {
                    }
                    zzb(sb3, i12, substring, zzB);
                }
            }
            i11 = 3;
        }
        if (zzlx2 instanceof zzko) {
            Iterator zzf = ((zzko) zzlx2).zzb.zzf();
            while (zzf.hasNext()) {
                Map.Entry entry2 = (Map.Entry) zzf.next();
                zzb(sb3, i12, v.d("[", ((zzkp) entry2.getKey()).zza, "]"), entry2.getValue());
            }
        }
        zznc zznc = ((zzks) zzlx2).zzc;
        if (zznc != null) {
            zznc.zzi(sb3, i12);
        }
    }
}
