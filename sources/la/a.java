package la;

import android.util.JsonReader;
import c0.i0;
import f0.b0;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import ka.b;
import ka.c;
import ka.c0;
import ka.p;
import ka.s;
import ua.d;
import ua.e;
import v.g0;

/* compiled from: CrashlyticsReportJsonTransform */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final d f12898a;

    /* renamed from: la.a$a  reason: collision with other inner class name */
    /* compiled from: CrashlyticsReportJsonTransform */
    public interface C0157a<T> {
        T c(JsonReader jsonReader);
    }

    static {
        e eVar = new e();
        ka.a.f12110a.configure(eVar);
        eVar.f15414d = true;
        f12898a = new d(eVar);
    }

    public static s a(JsonReader jsonReader) {
        s.a aVar = new s.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1019779949:
                    if (nextName.equals("offset")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -887523944:
                    if (nextName.equals("symbol")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 3571:
                    if (nextName.equals("pc")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 3143036:
                    if (nextName.equals("file")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c10 = 4;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    aVar.f12407d = Long.valueOf(jsonReader.nextLong());
                    break;
                case 1:
                    String nextString = jsonReader.nextString();
                    if (nextString != null) {
                        aVar.f12405b = nextString;
                        break;
                    } else {
                        throw new NullPointerException("Null symbol");
                    }
                case 2:
                    aVar.f12404a = Long.valueOf(jsonReader.nextLong());
                    break;
                case 3:
                    aVar.f12406c = jsonReader.nextString();
                    break;
                case 4:
                    aVar.f12408e = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVar.a();
    }

    public static ka.e b(JsonReader jsonReader) {
        String str;
        jsonReader.beginObject();
        String str2 = null;
        String str3 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            if (nextName.equals("key")) {
                str2 = jsonReader.nextString();
                if (str2 == null) {
                    throw new NullPointerException("Null key");
                }
            } else if (!nextName.equals("value")) {
                jsonReader.skipValue();
            } else {
                str3 = jsonReader.nextString();
                if (str3 == null) {
                    throw new NullPointerException("Null value");
                }
            }
        }
        jsonReader.endObject();
        if (str2 == null) {
            str = " key";
        } else {
            str = "";
        }
        if (str3 == null) {
            str = b0.r(str, " value");
        }
        if (str.isEmpty()) {
            return new ka.e(str2, str3);
        }
        throw new IllegalStateException(b0.r("Missing required properties:", str));
    }

    public static c c(JsonReader jsonReader) {
        c.a aVar = new c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1516200806:
                    if (nextName.equals("buildIdMappingForArch")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 110987:
                    if (nextName.equals("pid")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 111312:
                    if (nextName.equals("pss")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 113234:
                    if (nextName.equals("rss")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 55126294:
                    if (nextName.equals("timestamp")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 202325402:
                    if (nextName.equals("processName")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 722137681:
                    if (nextName.equals("reasonCode")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 723857505:
                    if (nextName.equals("traceFile")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c10 = 8;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    aVar.f12281i = d(jsonReader, new g0(22));
                    break;
                case 1:
                    aVar.f12273a = Integer.valueOf(jsonReader.nextInt());
                    break;
                case 2:
                    aVar.f12277e = Long.valueOf(jsonReader.nextLong());
                    break;
                case 3:
                    aVar.f12278f = Long.valueOf(jsonReader.nextLong());
                    break;
                case 4:
                    aVar.f12279g = Long.valueOf(jsonReader.nextLong());
                    break;
                case 5:
                    String nextString = jsonReader.nextString();
                    if (nextString != null) {
                        aVar.f12274b = nextString;
                        break;
                    } else {
                        throw new NullPointerException("Null processName");
                    }
                case 6:
                    aVar.f12275c = Integer.valueOf(jsonReader.nextInt());
                    break;
                case 7:
                    aVar.f12280h = jsonReader.nextString();
                    break;
                case 8:
                    aVar.f12276d = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVar.a();
    }

    public static <T> c0<T> d(JsonReader jsonReader, C0157a<T> aVar) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(aVar.c(jsonReader));
        }
        jsonReader.endArray();
        return new c0<>(arrayList);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003f, code lost:
        if (r2.equals("log") == false) goto L_0x0058;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static ka.l e(android.util.JsonReader r19) {
        /*
            r0 = r19
            ka.l$a r1 = new ka.l$a
            r1.<init>()
            r19.beginObject()
        L_0x000a:
            boolean r2 = r19.hasNext()
            if (r2 == 0) goto L_0x036a
            java.lang.String r2 = r19.nextName()
            r2.getClass()
            int r3 = r2.hashCode()
            r4 = 2
            r5 = 1
            r6 = 0
            r7 = -1
            switch(r3) {
                case -1335157162: goto L_0x004d;
                case 96801: goto L_0x0042;
                case 107332: goto L_0x0039;
                case 3575610: goto L_0x002e;
                case 55126294: goto L_0x0023;
                default: goto L_0x0022;
            }
        L_0x0022:
            goto L_0x0058
        L_0x0023:
            java.lang.String r3 = "timestamp"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x002c
            goto L_0x0058
        L_0x002c:
            r4 = 4
            goto L_0x0059
        L_0x002e:
            java.lang.String r3 = "type"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0037
            goto L_0x0058
        L_0x0037:
            r4 = 3
            goto L_0x0059
        L_0x0039:
            java.lang.String r3 = "log"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0059
            goto L_0x0058
        L_0x0042:
            java.lang.String r3 = "app"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x004b
            goto L_0x0058
        L_0x004b:
            r4 = r5
            goto L_0x0059
        L_0x004d:
            java.lang.String r3 = "device"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0056
            goto L_0x0058
        L_0x0056:
            r4 = r6
            goto L_0x0059
        L_0x0058:
            r4 = r7
        L_0x0059:
            java.lang.String r2 = "Missing required properties:"
            java.lang.String r3 = ""
            switch(r4) {
                case 0: goto L_0x02b0;
                case 1: goto L_0x00cc;
                case 2: goto L_0x0080;
                case 3: goto L_0x006f;
                case 4: goto L_0x0064;
                default: goto L_0x0060;
            }
        L_0x0060:
            r19.skipValue()
            goto L_0x000a
        L_0x0064:
            long r2 = r19.nextLong()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r1.f12349a = r2
            goto L_0x000a
        L_0x006f:
            java.lang.String r2 = r19.nextString()
            if (r2 == 0) goto L_0x0078
            r1.f12350b = r2
            goto L_0x000a
        L_0x0078:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null type"
            r0.<init>(r1)
            throw r0
        L_0x0080:
            r19.beginObject()
            r5 = 0
        L_0x0084:
            boolean r4 = r19.hasNext()
            if (r4 == 0) goto L_0x00ac
            java.lang.String r4 = r19.nextName()
            r4.getClass()
            java.lang.String r6 = "content"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L_0x009d
            r19.skipValue()
            goto L_0x0084
        L_0x009d:
            java.lang.String r5 = r19.nextString()
            if (r5 == 0) goto L_0x00a4
            goto L_0x0084
        L_0x00a4:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null content"
            r0.<init>(r1)
            throw r0
        L_0x00ac:
            r19.endObject()
            if (r5 != 0) goto L_0x00b3
            java.lang.String r3 = " content"
        L_0x00b3:
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x00c2
            ka.u r2 = new ka.u
            r2.<init>(r5)
            r1.f12353e = r2
            goto L_0x000a
        L_0x00c2:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = f0.b0.r(r2, r3)
            r0.<init>(r1)
            throw r0
        L_0x00cc:
            r19.beginObject()
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
        L_0x00d4:
            boolean r10 = r19.hasNext()
            if (r10 == 0) goto L_0x027e
            java.lang.String r10 = r19.nextName()
            r10.getClass()
            r10.hashCode()
            r11 = -1
            int r12 = r10.hashCode()
            switch(r12) {
                case -1332194002: goto L_0x0119;
                case -1090974952: goto L_0x010e;
                case -80231855: goto L_0x0103;
                case 555169704: goto L_0x00f8;
                case 928737948: goto L_0x00ed;
                default: goto L_0x00ec;
            }
        L_0x00ec:
            goto L_0x0123
        L_0x00ed:
            java.lang.String r12 = "uiOrientation"
            boolean r10 = r10.equals(r12)
            if (r10 != 0) goto L_0x00f6
            goto L_0x0123
        L_0x00f6:
            r11 = 4
            goto L_0x0123
        L_0x00f8:
            java.lang.String r12 = "customAttributes"
            boolean r10 = r10.equals(r12)
            if (r10 != 0) goto L_0x0101
            goto L_0x0123
        L_0x0101:
            r11 = 3
            goto L_0x0123
        L_0x0103:
            java.lang.String r12 = "internalKeys"
            boolean r10 = r10.equals(r12)
            if (r10 != 0) goto L_0x010c
            goto L_0x0123
        L_0x010c:
            r11 = 2
            goto L_0x0123
        L_0x010e:
            java.lang.String r12 = "execution"
            boolean r10 = r10.equals(r12)
            if (r10 != 0) goto L_0x0117
            goto L_0x0123
        L_0x0117:
            r11 = 1
            goto L_0x0123
        L_0x0119:
            java.lang.String r12 = "background"
            boolean r10 = r10.equals(r12)
            if (r10 != 0) goto L_0x0122
            goto L_0x0123
        L_0x0122:
            r11 = 0
        L_0x0123:
            switch(r11) {
                case 0: goto L_0x0274;
                case 1: goto L_0x014b;
                case 2: goto L_0x013f;
                case 3: goto L_0x0133;
                case 4: goto L_0x012a;
                default: goto L_0x0126;
            }
        L_0x0126:
            r19.skipValue()
            goto L_0x00d4
        L_0x012a:
            int r9 = r19.nextInt()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            goto L_0x00d4
        L_0x0133:
            c0.i0 r6 = new c0.i0
            r10 = 22
            r6.<init>(r10)
            ka.c0 r6 = d(r0, r6)
            goto L_0x00d4
        L_0x013f:
            kh.h r7 = new kh.h
            r10 = 26
            r7.<init>(r10)
            ka.c0 r7 = d(r0, r7)
            goto L_0x00d4
        L_0x014b:
            r19.beginObject()
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
        L_0x0153:
            boolean r4 = r19.hasNext()
            if (r4 == 0) goto L_0x024b
            java.lang.String r4 = r19.nextName()
            r4.getClass()
            r4.hashCode()
            r10 = -1
            int r16 = r4.hashCode()
            switch(r16) {
                case -1375141843: goto L_0x0198;
                case -1337936983: goto L_0x018d;
                case -902467928: goto L_0x0182;
                case 937615455: goto L_0x0177;
                case 1481625679: goto L_0x016c;
                default: goto L_0x016b;
            }
        L_0x016b:
            goto L_0x01a2
        L_0x016c:
            java.lang.String r5 = "exception"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0175
            goto L_0x01a2
        L_0x0175:
            r10 = 4
            goto L_0x01a2
        L_0x0177:
            java.lang.String r5 = "binaries"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0180
            goto L_0x01a2
        L_0x0180:
            r10 = 3
            goto L_0x01a2
        L_0x0182:
            java.lang.String r5 = "signal"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x018b
            goto L_0x01a2
        L_0x018b:
            r10 = 2
            goto L_0x01a2
        L_0x018d:
            java.lang.String r5 = "threads"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0196
            goto L_0x01a2
        L_0x0196:
            r10 = 1
            goto L_0x01a2
        L_0x0198:
            java.lang.String r5 = "appExitInfo"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x01a1
            goto L_0x01a2
        L_0x01a1:
            r10 = 0
        L_0x01a2:
            switch(r10) {
                case 0: goto L_0x0245;
                case 1: goto L_0x0238;
                case 2: goto L_0x01ba;
                case 3: goto L_0x01ae;
                case 4: goto L_0x01a9;
                default: goto L_0x01a5;
            }
        L_0x01a5:
            r19.skipValue()
            goto L_0x0153
        L_0x01a9:
            ka.p r12 = f(r19)
            goto L_0x0153
        L_0x01ae:
            kh.h r4 = new kh.h
            r5 = 27
            r4.<init>(r5)
            ka.c0 r15 = d(r0, r4)
            goto L_0x0153
        L_0x01ba:
            ka.q$a r4 = new ka.q$a
            r4.<init>()
            r19.beginObject()
        L_0x01c2:
            boolean r5 = r19.hasNext()
            if (r5 == 0) goto L_0x022f
            java.lang.String r5 = r19.nextName()
            r5.getClass()
            r5.hashCode()
            r10 = -1
            int r14 = r5.hashCode()
            switch(r14) {
                case -1147692044: goto L_0x01f1;
                case 3059181: goto L_0x01e6;
                case 3373707: goto L_0x01db;
                default: goto L_0x01da;
            }
        L_0x01da:
            goto L_0x01fb
        L_0x01db:
            java.lang.String r14 = "name"
            boolean r5 = r5.equals(r14)
            if (r5 != 0) goto L_0x01e4
            goto L_0x01fb
        L_0x01e4:
            r10 = 2
            goto L_0x01fb
        L_0x01e6:
            java.lang.String r14 = "code"
            boolean r5 = r5.equals(r14)
            if (r5 != 0) goto L_0x01ef
            goto L_0x01fb
        L_0x01ef:
            r10 = 1
            goto L_0x01fb
        L_0x01f1:
            java.lang.String r14 = "address"
            boolean r5 = r5.equals(r14)
            if (r5 != 0) goto L_0x01fa
            goto L_0x01fb
        L_0x01fa:
            r10 = 0
        L_0x01fb:
            switch(r10) {
                case 0: goto L_0x0224;
                case 1: goto L_0x0213;
                case 2: goto L_0x0202;
                default: goto L_0x01fe;
            }
        L_0x01fe:
            r19.skipValue()
            goto L_0x01c2
        L_0x0202:
            java.lang.String r5 = r19.nextString()
            if (r5 == 0) goto L_0x020b
            r4.f12390a = r5
            goto L_0x01c2
        L_0x020b:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null name"
            r0.<init>(r1)
            throw r0
        L_0x0213:
            java.lang.String r5 = r19.nextString()
            if (r5 == 0) goto L_0x021c
            r4.f12391b = r5
            goto L_0x01c2
        L_0x021c:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null code"
            r0.<init>(r1)
            throw r0
        L_0x0224:
            long r17 = r19.nextLong()
            java.lang.Long r5 = java.lang.Long.valueOf(r17)
            r4.f12392c = r5
            goto L_0x01c2
        L_0x022f:
            r19.endObject()
            ka.q r14 = r4.a()
            goto L_0x0153
        L_0x0238:
            c0.i0 r4 = new c0.i0
            r5 = 23
            r4.<init>(r5)
            ka.c0 r11 = d(r0, r4)
            goto L_0x0153
        L_0x0245:
            ka.c r13 = c(r19)
            goto L_0x0153
        L_0x024b:
            r19.endObject()
            if (r14 != 0) goto L_0x0253
            java.lang.String r4 = " signal"
            goto L_0x0254
        L_0x0253:
            r4 = r3
        L_0x0254:
            if (r15 != 0) goto L_0x025c
            java.lang.String r5 = " binaries"
            java.lang.String r4 = f0.b0.r(r4, r5)
        L_0x025c:
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L_0x026a
            ka.n r4 = new ka.n
            r10 = r4
            r10.<init>(r11, r12, r13, r14, r15)
            goto L_0x00d4
        L_0x026a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = f0.b0.r(r2, r4)
            r0.<init>(r1)
            throw r0
        L_0x0274:
            boolean r5 = r19.nextBoolean()
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r5)
            goto L_0x00d4
        L_0x027e:
            r19.endObject()
            if (r4 != 0) goto L_0x0285
            java.lang.String r3 = " execution"
        L_0x0285:
            if (r9 != 0) goto L_0x028d
            java.lang.String r5 = " uiOrientation"
            java.lang.String r3 = f0.b0.r(r3, r5)
        L_0x028d:
            boolean r5 = r3.isEmpty()
            if (r5 == 0) goto L_0x02a6
            ka.m r10 = new ka.m
            int r9 = r9.intValue()
            r2 = r10
            r3 = r4
            r4 = r6
            r5 = r7
            r6 = r8
            r7 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            r1.f12351c = r10
            goto L_0x000a
        L_0x02a6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = f0.b0.r(r2, r3)
            r0.<init>(r1)
            throw r0
        L_0x02b0:
            ka.t$a r2 = new ka.t$a
            r2.<init>()
            r19.beginObject()
        L_0x02b8:
            boolean r3 = r19.hasNext()
            if (r3 == 0) goto L_0x035f
            java.lang.String r3 = r19.nextName()
            r3.getClass()
            r3.hashCode()
            r4 = -1
            int r5 = r3.hashCode()
            switch(r5) {
                case -1708606089: goto L_0x0308;
                case -1455558134: goto L_0x02fd;
                case -1439500848: goto L_0x02f2;
                case 279795450: goto L_0x02e7;
                case 976541947: goto L_0x02dc;
                case 1516795582: goto L_0x02d1;
                default: goto L_0x02d0;
            }
        L_0x02d0:
            goto L_0x0312
        L_0x02d1:
            java.lang.String r5 = "proximityOn"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x02da
            goto L_0x0312
        L_0x02da:
            r4 = 5
            goto L_0x0312
        L_0x02dc:
            java.lang.String r5 = "ramUsed"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x02e5
            goto L_0x0312
        L_0x02e5:
            r4 = 4
            goto L_0x0312
        L_0x02e7:
            java.lang.String r5 = "diskUsed"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x02f0
            goto L_0x0312
        L_0x02f0:
            r4 = 3
            goto L_0x0312
        L_0x02f2:
            java.lang.String r5 = "orientation"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x02fb
            goto L_0x0312
        L_0x02fb:
            r4 = 2
            goto L_0x0312
        L_0x02fd:
            java.lang.String r5 = "batteryVelocity"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0306
            goto L_0x0312
        L_0x0306:
            r4 = 1
            goto L_0x0312
        L_0x0308:
            java.lang.String r5 = "batteryLevel"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0311
            goto L_0x0312
        L_0x0311:
            r4 = 0
        L_0x0312:
            switch(r4) {
                case 0: goto L_0x0353;
                case 1: goto L_0x0347;
                case 2: goto L_0x033b;
                case 3: goto L_0x032f;
                case 4: goto L_0x0324;
                case 5: goto L_0x0319;
                default: goto L_0x0315;
            }
        L_0x0315:
            r19.skipValue()
            goto L_0x02b8
        L_0x0319:
            boolean r3 = r19.nextBoolean()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r2.f12417c = r3
            goto L_0x02b8
        L_0x0324:
            long r3 = r19.nextLong()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r2.f12419e = r3
            goto L_0x02b8
        L_0x032f:
            long r3 = r19.nextLong()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r2.f12420f = r3
            goto L_0x02b8
        L_0x033b:
            int r3 = r19.nextInt()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.f12418d = r3
            goto L_0x02b8
        L_0x0347:
            int r3 = r19.nextInt()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.f12416b = r3
            goto L_0x02b8
        L_0x0353:
            double r3 = r19.nextDouble()
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            r2.f12415a = r3
            goto L_0x02b8
        L_0x035f:
            r19.endObject()
            ka.t r2 = r2.a()
            r1.f12352d = r2
            goto L_0x000a
        L_0x036a:
            r19.endObject()
            ka.l r0 = r1.a()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: la.a.e(android.util.JsonReader):ka.l");
    }

    public static p f(JsonReader jsonReader) {
        p.a aVar = new p.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1266514778:
                    if (nextName.equals("frames")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -934964668:
                    if (nextName.equals("reason")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 3575610:
                    if (nextName.equals("type")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 91997906:
                    if (nextName.equals("causedBy")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 581754413:
                    if (nextName.equals("overflowCount")) {
                        c10 = 4;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    aVar.f12384c = d(jsonReader, new i0(24));
                    break;
                case 1:
                    aVar.f12383b = jsonReader.nextString();
                    break;
                case 2:
                    String nextString = jsonReader.nextString();
                    if (nextString != null) {
                        aVar.f12382a = nextString;
                        break;
                    } else {
                        throw new NullPointerException("Null type");
                    }
                case 3:
                    aVar.f12385d = f(jsonReader);
                    break;
                case 4:
                    aVar.f12386e = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVar.a();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static ka.b g(android.util.JsonReader r23) {
        /*
            r0 = r23
            java.nio.charset.Charset r1 = ka.b0.f12263a
            ka.b$a r1 = new ka.b$a
            r1.<init>()
            r23.beginObject()
        L_0x000c:
            boolean r2 = r23.hasNext()
            if (r2 == 0) goto L_0x0583
            java.lang.String r2 = r23.nextName()
            r2.getClass()
            int r3 = r2.hashCode()
            java.lang.String r4 = "appQualitySessionId"
            java.lang.String r5 = "buildVersion"
            java.lang.String r6 = "installationUuid"
            java.lang.String r7 = "platform"
            java.lang.String r8 = "displayVersion"
            r10 = -1
            r11 = 0
            r12 = 1
            r13 = 2
            r14 = 3
            switch(r3) {
                case -2118372775: goto L_0x009e;
                case -1962630338: goto L_0x0093;
                case -1907185581: goto L_0x008a;
                case -1375141843: goto L_0x007f;
                case -911706486: goto L_0x0076;
                case 344431858: goto L_0x006b;
                case 719853845: goto L_0x0062;
                case 1047652060: goto L_0x0057;
                case 1874684019: goto L_0x004b;
                case 1975623094: goto L_0x003f;
                case 1984987798: goto L_0x0031;
                default: goto L_0x002f;
            }
        L_0x002f:
            goto L_0x00a9
        L_0x0031:
            java.lang.String r3 = "session"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x003b
            goto L_0x00a9
        L_0x003b:
            r2 = 10
            goto L_0x00aa
        L_0x003f:
            boolean r2 = r2.equals(r8)
            if (r2 != 0) goto L_0x0047
            goto L_0x00a9
        L_0x0047:
            r2 = 9
            goto L_0x00aa
        L_0x004b:
            boolean r2 = r2.equals(r7)
            if (r2 != 0) goto L_0x0053
            goto L_0x00a9
        L_0x0053:
            r2 = 8
            goto L_0x00aa
        L_0x0057:
            java.lang.String r3 = "firebaseInstallationId"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0060
            goto L_0x00a9
        L_0x0060:
            r2 = 7
            goto L_0x00aa
        L_0x0062:
            boolean r2 = r2.equals(r6)
            if (r2 != 0) goto L_0x0069
            goto L_0x00a9
        L_0x0069:
            r2 = 6
            goto L_0x00aa
        L_0x006b:
            java.lang.String r3 = "gmpAppId"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0074
            goto L_0x00a9
        L_0x0074:
            r2 = 5
            goto L_0x00aa
        L_0x0076:
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L_0x007d
            goto L_0x00a9
        L_0x007d:
            r2 = 4
            goto L_0x00aa
        L_0x007f:
            java.lang.String r3 = "appExitInfo"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0088
            goto L_0x00a9
        L_0x0088:
            r2 = r14
            goto L_0x00aa
        L_0x008a:
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x0091
            goto L_0x00a9
        L_0x0091:
            r2 = r13
            goto L_0x00aa
        L_0x0093:
            java.lang.String r3 = "sdkVersion"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x009c
            goto L_0x00a9
        L_0x009c:
            r2 = r12
            goto L_0x00aa
        L_0x009e:
            java.lang.String r3 = "ndkPayload"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x00a7
            goto L_0x00a9
        L_0x00a7:
            r2 = r11
            goto L_0x00aa
        L_0x00a9:
            r2 = r10
        L_0x00aa:
            java.lang.String r3 = "Null buildVersion"
            java.lang.String r5 = ""
            java.lang.String r6 = "Missing required properties:"
            switch(r2) {
                case 0: goto L_0x052c;
                case 1: goto L_0x051a;
                case 2: goto L_0x0512;
                case 3: goto L_0x050a;
                case 4: goto L_0x04fa;
                case 5: goto L_0x04e8;
                case 6: goto L_0x04d6;
                case 7: goto L_0x04ce;
                case 8: goto L_0x04c2;
                case 9: goto L_0x04b0;
                case 10: goto L_0x00b8;
                default: goto L_0x00b3;
            }
        L_0x00b3:
            r23.skipValue()
            goto L_0x000c
        L_0x00b8:
            ka.h$a r2 = new ka.h$a
            r2.<init>()
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            r2.f12312f = r8
            r23.beginObject()
        L_0x00c4:
            boolean r8 = r23.hasNext()
            if (r8 == 0) goto L_0x04a5
            java.lang.String r8 = r23.nextName()
            r8.getClass()
            int r15 = r8.hashCode()
            java.lang.String r7 = "identifier"
            switch(r15) {
                case -2128794476: goto L_0x015d;
                case -1907185581: goto L_0x0154;
                case -1618432855: goto L_0x014b;
                case -1606742899: goto L_0x0140;
                case -1335157162: goto L_0x0135;
                case -1291329255: goto L_0x012a;
                case 3556: goto L_0x011f;
                case 96801: goto L_0x0114;
                case 3599307: goto L_0x0106;
                case 286956243: goto L_0x00f8;
                case 1025385094: goto L_0x00ea;
                case 2047016109: goto L_0x00dc;
                default: goto L_0x00da;
            }
        L_0x00da:
            goto L_0x0168
        L_0x00dc:
            java.lang.String r15 = "generatorType"
            boolean r8 = r8.equals(r15)
            if (r8 != 0) goto L_0x00e6
            goto L_0x0168
        L_0x00e6:
            r8 = 11
            goto L_0x0169
        L_0x00ea:
            java.lang.String r15 = "crashed"
            boolean r8 = r8.equals(r15)
            if (r8 != 0) goto L_0x00f4
            goto L_0x0168
        L_0x00f4:
            r8 = 10
            goto L_0x0169
        L_0x00f8:
            java.lang.String r15 = "generator"
            boolean r8 = r8.equals(r15)
            if (r8 != 0) goto L_0x0102
            goto L_0x0168
        L_0x0102:
            r8 = 9
            goto L_0x0169
        L_0x0106:
            java.lang.String r15 = "user"
            boolean r8 = r8.equals(r15)
            if (r8 != 0) goto L_0x0110
            goto L_0x0168
        L_0x0110:
            r8 = 8
            goto L_0x0169
        L_0x0114:
            java.lang.String r15 = "app"
            boolean r8 = r8.equals(r15)
            if (r8 != 0) goto L_0x011d
            goto L_0x0168
        L_0x011d:
            r8 = 7
            goto L_0x0169
        L_0x011f:
            java.lang.String r15 = "os"
            boolean r8 = r8.equals(r15)
            if (r8 != 0) goto L_0x0128
            goto L_0x0168
        L_0x0128:
            r8 = 6
            goto L_0x0169
        L_0x012a:
            java.lang.String r15 = "events"
            boolean r8 = r8.equals(r15)
            if (r8 != 0) goto L_0x0133
            goto L_0x0168
        L_0x0133:
            r8 = 5
            goto L_0x0169
        L_0x0135:
            java.lang.String r15 = "device"
            boolean r8 = r8.equals(r15)
            if (r8 != 0) goto L_0x013e
            goto L_0x0168
        L_0x013e:
            r8 = 4
            goto L_0x0169
        L_0x0140:
            java.lang.String r15 = "endedAt"
            boolean r8 = r8.equals(r15)
            if (r8 != 0) goto L_0x0149
            goto L_0x0168
        L_0x0149:
            r8 = r14
            goto L_0x0169
        L_0x014b:
            boolean r8 = r8.equals(r7)
            if (r8 != 0) goto L_0x0152
            goto L_0x0168
        L_0x0152:
            r8 = r13
            goto L_0x0169
        L_0x0154:
            boolean r8 = r8.equals(r4)
            if (r8 != 0) goto L_0x015b
            goto L_0x0168
        L_0x015b:
            r8 = r12
            goto L_0x0169
        L_0x015d:
            java.lang.String r15 = "startedAt"
            boolean r8 = r8.equals(r15)
            if (r8 != 0) goto L_0x0166
            goto L_0x0168
        L_0x0166:
            r8 = r11
            goto L_0x0169
        L_0x0168:
            r8 = r10
        L_0x0169:
            switch(r8) {
                case 0: goto L_0x0499;
                case 1: goto L_0x0491;
                case 2: goto L_0x047e;
                case 3: goto L_0x0472;
                case 4: goto L_0x035a;
                case 5: goto L_0x034b;
                case 6: goto L_0x02b7;
                case 7: goto L_0x01e7;
                case 8: goto L_0x019b;
                case 9: goto L_0x0189;
                case 10: goto L_0x017d;
                case 11: goto L_0x0171;
                default: goto L_0x016c;
            }
        L_0x016c:
            r23.skipValue()
            goto L_0x00c4
        L_0x0171:
            int r7 = r23.nextInt()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r2.f12318l = r7
            goto L_0x00c4
        L_0x017d:
            boolean r7 = r23.nextBoolean()
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r2.f12312f = r7
            goto L_0x00c4
        L_0x0189:
            java.lang.String r7 = r23.nextString()
            if (r7 == 0) goto L_0x0193
            r2.f12307a = r7
            goto L_0x00c4
        L_0x0193:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null generator"
            r0.<init>(r1)
            throw r0
        L_0x019b:
            r23.beginObject()
            r8 = 0
        L_0x019f:
            boolean r15 = r23.hasNext()
            if (r15 == 0) goto L_0x01c5
            java.lang.String r15 = r23.nextName()
            r15.getClass()
            boolean r15 = r15.equals(r7)
            if (r15 != 0) goto L_0x01b6
            r23.skipValue()
            goto L_0x019f
        L_0x01b6:
            java.lang.String r8 = r23.nextString()
            if (r8 == 0) goto L_0x01bd
            goto L_0x019f
        L_0x01bd:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null identifier"
            r0.<init>(r1)
            throw r0
        L_0x01c5:
            r23.endObject()
            if (r8 != 0) goto L_0x01cd
            java.lang.String r7 = " identifier"
            goto L_0x01ce
        L_0x01cd:
            r7 = r5
        L_0x01ce:
            boolean r15 = r7.isEmpty()
            if (r15 == 0) goto L_0x01dd
            ka.w r7 = new ka.w
            r7.<init>(r8)
            r2.f12314h = r7
            goto L_0x00c4
        L_0x01dd:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = f0.b0.r(r6, r7)
            r0.<init>(r1)
            throw r0
        L_0x01e7:
            r23.beginObject()
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
        L_0x01f6:
            boolean r7 = r23.hasNext()
            if (r7 == 0) goto L_0x028b
            java.lang.String r7 = r23.nextName()
            r7.getClass()
            r7.hashCode()
            r8 = -1
            int r15 = r7.hashCode()
            switch(r15) {
                case -1618432855: goto L_0x0246;
                case -519438642: goto L_0x023b;
                case 213652010: goto L_0x0230;
                case 351608024: goto L_0x0225;
                case 719853845: goto L_0x021a;
                case 1975623094: goto L_0x020f;
                default: goto L_0x020e;
            }
        L_0x020e:
            goto L_0x0250
        L_0x020f:
            java.lang.String r15 = "displayVersion"
            boolean r7 = r7.equals(r15)
            if (r7 != 0) goto L_0x0218
            goto L_0x0250
        L_0x0218:
            r8 = 5
            goto L_0x0250
        L_0x021a:
            java.lang.String r15 = "installationUuid"
            boolean r7 = r7.equals(r15)
            if (r7 != 0) goto L_0x0223
            goto L_0x0250
        L_0x0223:
            r8 = 4
            goto L_0x0250
        L_0x0225:
            java.lang.String r15 = "version"
            boolean r7 = r7.equals(r15)
            if (r7 != 0) goto L_0x022e
            goto L_0x0250
        L_0x022e:
            r8 = 3
            goto L_0x0250
        L_0x0230:
            java.lang.String r15 = "developmentPlatformVersion"
            boolean r7 = r7.equals(r15)
            if (r7 != 0) goto L_0x0239
            goto L_0x0250
        L_0x0239:
            r8 = 2
            goto L_0x0250
        L_0x023b:
            java.lang.String r15 = "developmentPlatform"
            boolean r7 = r7.equals(r15)
            if (r7 != 0) goto L_0x0244
            goto L_0x0250
        L_0x0244:
            r8 = 1
            goto L_0x0250
        L_0x0246:
            java.lang.String r15 = "identifier"
            boolean r7 = r7.equals(r15)
            if (r7 != 0) goto L_0x024f
            goto L_0x0250
        L_0x024f:
            r8 = 0
        L_0x0250:
            switch(r8) {
                case 0: goto L_0x027b;
                case 1: goto L_0x0275;
                case 2: goto L_0x0270;
                case 3: goto L_0x0261;
                case 4: goto L_0x025c;
                case 5: goto L_0x0257;
                default: goto L_0x0253;
            }
        L_0x0253:
            r23.skipValue()
            goto L_0x01f6
        L_0x0257:
            java.lang.String r19 = r23.nextString()
            goto L_0x01f6
        L_0x025c:
            java.lang.String r20 = r23.nextString()
            goto L_0x01f6
        L_0x0261:
            java.lang.String r18 = r23.nextString()
            if (r18 == 0) goto L_0x0268
            goto L_0x01f6
        L_0x0268:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null version"
            r0.<init>(r1)
            throw r0
        L_0x0270:
            java.lang.String r22 = r23.nextString()
            goto L_0x01f6
        L_0x0275:
            java.lang.String r21 = r23.nextString()
            goto L_0x01f6
        L_0x027b:
            java.lang.String r17 = r23.nextString()
            if (r17 == 0) goto L_0x0283
            goto L_0x01f6
        L_0x0283:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null identifier"
            r0.<init>(r1)
            throw r0
        L_0x028b:
            r23.endObject()
            if (r17 != 0) goto L_0x0293
            java.lang.String r7 = " identifier"
            goto L_0x0294
        L_0x0293:
            r7 = r5
        L_0x0294:
            if (r18 != 0) goto L_0x029c
            java.lang.String r8 = " version"
            java.lang.String r7 = f0.b0.r(r7, r8)
        L_0x029c:
            boolean r8 = r7.isEmpty()
            if (r8 == 0) goto L_0x02ad
            ka.i r7 = new ka.i
            r16 = r7
            r16.<init>(r17, r18, r19, r20, r21, r22)
            r2.f12313g = r7
            goto L_0x00c4
        L_0x02ad:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = f0.b0.r(r6, r7)
            r0.<init>(r1)
            throw r0
        L_0x02b7:
            ka.v$a r7 = new ka.v$a
            r7.<init>()
            r23.beginObject()
        L_0x02bf:
            boolean r8 = r23.hasNext()
            if (r8 == 0) goto L_0x0340
            java.lang.String r8 = r23.nextName()
            r8.getClass()
            r8.hashCode()
            r15 = -1
            int r16 = r8.hashCode()
            switch(r16) {
                case -911706486: goto L_0x02f9;
                case -293026577: goto L_0x02ee;
                case 351608024: goto L_0x02e3;
                case 1874684019: goto L_0x02d8;
                default: goto L_0x02d7;
            }
        L_0x02d7:
            goto L_0x0303
        L_0x02d8:
            java.lang.String r9 = "platform"
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L_0x02e1
            goto L_0x0303
        L_0x02e1:
            r15 = 3
            goto L_0x0303
        L_0x02e3:
            java.lang.String r9 = "version"
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L_0x02ec
            goto L_0x0303
        L_0x02ec:
            r15 = 2
            goto L_0x0303
        L_0x02ee:
            java.lang.String r9 = "jailbroken"
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L_0x02f7
            goto L_0x0303
        L_0x02f7:
            r15 = 1
            goto L_0x0303
        L_0x02f9:
            java.lang.String r9 = "buildVersion"
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L_0x0302
            goto L_0x0303
        L_0x0302:
            r15 = 0
        L_0x0303:
            switch(r15) {
                case 0: goto L_0x0331;
                case 1: goto L_0x0326;
                case 2: goto L_0x0315;
                case 3: goto L_0x030a;
                default: goto L_0x0306;
            }
        L_0x0306:
            r23.skipValue()
            goto L_0x02bf
        L_0x030a:
            int r8 = r23.nextInt()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r7.f12426a = r8
            goto L_0x02bf
        L_0x0315:
            java.lang.String r8 = r23.nextString()
            if (r8 == 0) goto L_0x031e
            r7.f12427b = r8
            goto L_0x02bf
        L_0x031e:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null version"
            r0.<init>(r1)
            throw r0
        L_0x0326:
            boolean r8 = r23.nextBoolean()
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r7.f12429d = r8
            goto L_0x02bf
        L_0x0331:
            java.lang.String r8 = r23.nextString()
            if (r8 == 0) goto L_0x033a
            r7.f12428c = r8
            goto L_0x02bf
        L_0x033a:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r3)
            throw r0
        L_0x0340:
            r23.endObject()
            ka.v r7 = r7.a()
            r2.f12315i = r7
            goto L_0x00c4
        L_0x034b:
            kh.h r7 = new kh.h
            r8 = 25
            r7.<init>(r8)
            ka.c0 r7 = d(r0, r7)
            r2.f12317k = r7
            goto L_0x00c4
        L_0x035a:
            ka.k$a r7 = new ka.k$a
            r7.<init>()
            r23.beginObject()
        L_0x0362:
            boolean r8 = r23.hasNext()
            if (r8 == 0) goto L_0x0467
            java.lang.String r8 = r23.nextName()
            r8.getClass()
            r8.hashCode()
            r9 = -1
            int r15 = r8.hashCode()
            switch(r15) {
                case -1981332476: goto L_0x03d7;
                case -1969347631: goto L_0x03cc;
                case 112670: goto L_0x03c1;
                case 3002454: goto L_0x03b6;
                case 81784169: goto L_0x03ab;
                case 94848180: goto L_0x03a0;
                case 104069929: goto L_0x0395;
                case 109757585: goto L_0x038a;
                case 2078953423: goto L_0x037c;
                default: goto L_0x037a;
            }
        L_0x037a:
            goto L_0x03e1
        L_0x037c:
            java.lang.String r15 = "modelClass"
            boolean r8 = r8.equals(r15)
            if (r8 != 0) goto L_0x0386
            goto L_0x03e1
        L_0x0386:
            r9 = 8
            goto L_0x03e1
        L_0x038a:
            java.lang.String r15 = "state"
            boolean r8 = r8.equals(r15)
            if (r8 != 0) goto L_0x0393
            goto L_0x03e1
        L_0x0393:
            r9 = 7
            goto L_0x03e1
        L_0x0395:
            java.lang.String r15 = "model"
            boolean r8 = r8.equals(r15)
            if (r8 != 0) goto L_0x039e
            goto L_0x03e1
        L_0x039e:
            r9 = 6
            goto L_0x03e1
        L_0x03a0:
            java.lang.String r15 = "cores"
            boolean r8 = r8.equals(r15)
            if (r8 != 0) goto L_0x03a9
            goto L_0x03e1
        L_0x03a9:
            r9 = 5
            goto L_0x03e1
        L_0x03ab:
            java.lang.String r15 = "diskSpace"
            boolean r8 = r8.equals(r15)
            if (r8 != 0) goto L_0x03b4
            goto L_0x03e1
        L_0x03b4:
            r9 = 4
            goto L_0x03e1
        L_0x03b6:
            java.lang.String r15 = "arch"
            boolean r8 = r8.equals(r15)
            if (r8 != 0) goto L_0x03bf
            goto L_0x03e1
        L_0x03bf:
            r9 = 3
            goto L_0x03e1
        L_0x03c1:
            java.lang.String r15 = "ram"
            boolean r8 = r8.equals(r15)
            if (r8 != 0) goto L_0x03ca
            goto L_0x03e1
        L_0x03ca:
            r9 = 2
            goto L_0x03e1
        L_0x03cc:
            java.lang.String r15 = "manufacturer"
            boolean r8 = r8.equals(r15)
            if (r8 != 0) goto L_0x03d5
            goto L_0x03e1
        L_0x03d5:
            r9 = 1
            goto L_0x03e1
        L_0x03d7:
            java.lang.String r15 = "simulator"
            boolean r8 = r8.equals(r15)
            if (r8 != 0) goto L_0x03e0
            goto L_0x03e1
        L_0x03e0:
            r9 = 0
        L_0x03e1:
            switch(r9) {
                case 0: goto L_0x045b;
                case 1: goto L_0x0449;
                case 2: goto L_0x043d;
                case 3: goto L_0x0431;
                case 4: goto L_0x0425;
                case 5: goto L_0x0419;
                case 6: goto L_0x0407;
                case 7: goto L_0x03fb;
                case 8: goto L_0x03e9;
                default: goto L_0x03e4;
            }
        L_0x03e4:
            r23.skipValue()
            goto L_0x0362
        L_0x03e9:
            java.lang.String r8 = r23.nextString()
            if (r8 == 0) goto L_0x03f3
            r7.f12343i = r8
            goto L_0x0362
        L_0x03f3:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null modelClass"
            r0.<init>(r1)
            throw r0
        L_0x03fb:
            int r8 = r23.nextInt()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r7.f12341g = r8
            goto L_0x0362
        L_0x0407:
            java.lang.String r8 = r23.nextString()
            if (r8 == 0) goto L_0x0411
            r7.f12336b = r8
            goto L_0x0362
        L_0x0411:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null model"
            r0.<init>(r1)
            throw r0
        L_0x0419:
            int r8 = r23.nextInt()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r7.f12337c = r8
            goto L_0x0362
        L_0x0425:
            long r8 = r23.nextLong()
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r7.f12339e = r8
            goto L_0x0362
        L_0x0431:
            int r8 = r23.nextInt()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r7.f12335a = r8
            goto L_0x0362
        L_0x043d:
            long r8 = r23.nextLong()
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r7.f12338d = r8
            goto L_0x0362
        L_0x0449:
            java.lang.String r8 = r23.nextString()
            if (r8 == 0) goto L_0x0453
            r7.f12342h = r8
            goto L_0x0362
        L_0x0453:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null manufacturer"
            r0.<init>(r1)
            throw r0
        L_0x045b:
            boolean r8 = r23.nextBoolean()
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r7.f12340f = r8
            goto L_0x0362
        L_0x0467:
            r23.endObject()
            ka.k r7 = r7.a()
            r2.f12316j = r7
            goto L_0x00c4
        L_0x0472:
            long r7 = r23.nextLong()
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r2.f12311e = r7
            goto L_0x00c4
        L_0x047e:
            java.lang.String r7 = r23.nextString()
            byte[] r7 = android.util.Base64.decode(r7, r13)
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = ka.b0.f12263a
            r8.<init>(r7, r9)
            r2.f12308b = r8
            goto L_0x00c4
        L_0x0491:
            java.lang.String r7 = r23.nextString()
            r2.f12309c = r7
            goto L_0x00c4
        L_0x0499:
            long r7 = r23.nextLong()
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r2.f12310d = r7
            goto L_0x00c4
        L_0x04a5:
            r23.endObject()
            ka.h r2 = r2.a()
            r1.f12260i = r2
            goto L_0x000c
        L_0x04b0:
            java.lang.String r2 = r23.nextString()
            if (r2 == 0) goto L_0x04ba
            r1.f12259h = r2
            goto L_0x000c
        L_0x04ba:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null displayVersion"
            r0.<init>(r1)
            throw r0
        L_0x04c2:
            int r2 = r23.nextInt()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.f12254c = r2
            goto L_0x000c
        L_0x04ce:
            java.lang.String r2 = r23.nextString()
            r1.f12256e = r2
            goto L_0x000c
        L_0x04d6:
            java.lang.String r2 = r23.nextString()
            if (r2 == 0) goto L_0x04e0
            r1.f12255d = r2
            goto L_0x000c
        L_0x04e0:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null installationUuid"
            r0.<init>(r1)
            throw r0
        L_0x04e8:
            java.lang.String r2 = r23.nextString()
            if (r2 == 0) goto L_0x04f2
            r1.f12253b = r2
            goto L_0x000c
        L_0x04f2:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null gmpAppId"
            r0.<init>(r1)
            throw r0
        L_0x04fa:
            java.lang.String r2 = r23.nextString()
            if (r2 == 0) goto L_0x0504
            r1.f12258g = r2
            goto L_0x000c
        L_0x0504:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r3)
            throw r0
        L_0x050a:
            ka.c r2 = c(r23)
            r1.f12262k = r2
            goto L_0x000c
        L_0x0512:
            java.lang.String r2 = r23.nextString()
            r1.f12257f = r2
            goto L_0x000c
        L_0x051a:
            java.lang.String r2 = r23.nextString()
            if (r2 == 0) goto L_0x0524
            r1.f12252a = r2
            goto L_0x000c
        L_0x0524:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null sdkVersion"
            r0.<init>(r1)
            throw r0
        L_0x052c:
            r23.beginObject()
            r2 = 0
            r7 = 0
        L_0x0531:
            boolean r3 = r23.hasNext()
            if (r3 == 0) goto L_0x0563
            java.lang.String r3 = r23.nextName()
            r3.getClass()
            java.lang.String r4 = "files"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L_0x0557
            java.lang.String r4 = "orgId"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0552
            r23.skipValue()
            goto L_0x0531
        L_0x0552:
            java.lang.String r2 = r23.nextString()
            goto L_0x0531
        L_0x0557:
            v.g0 r3 = new v.g0
            r4 = 21
            r3.<init>(r4)
            ka.c0 r7 = d(r0, r3)
            goto L_0x0531
        L_0x0563:
            r23.endObject()
            if (r7 != 0) goto L_0x056a
            java.lang.String r5 = " files"
        L_0x056a:
            boolean r3 = r5.isEmpty()
            if (r3 == 0) goto L_0x0579
            ka.f r3 = new ka.f
            r3.<init>(r7, r2)
            r1.f12261j = r3
            goto L_0x000c
        L_0x0579:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = f0.b0.r(r6, r5)
            r0.<init>(r1)
            throw r0
        L_0x0583:
            r23.endObject()
            ka.b r0 = r1.a()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: la.a.g(android.util.JsonReader):ka.b");
    }

    public static b h(String str) {
        JsonReader jsonReader;
        try {
            jsonReader = new JsonReader(new StringReader(str));
            b g2 = g(jsonReader);
            jsonReader.close();
            return g2;
        } catch (IllegalStateException e10) {
            throw new IOException(e10);
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }
}
