package m6;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import c6.b;
import com.google.android.gms.tasks.Continuation;
import f6.h;
import f6.m;
import f6.n;
import f6.s;
import i6.a;
import i6.c;
import i6.d;
import i6.e;
import i6.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import m6.o;
import p6.a;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class k implements o.a, Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13155a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f13156b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f13157c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f13158d;

    public /* synthetic */ k(int i10, Object obj, Object obj2, Object obj3) {
        this.f13155a = i10;
        this.f13156b = obj;
        this.f13158d = obj2;
        this.f13157c = obj3;
    }

    /* JADX INFO: finally extract failed */
    public final Object apply(Object obj) {
        String str;
        c.a aVar;
        boolean z10;
        long j10;
        boolean z11;
        byte[] bArr;
        boolean z12;
        b bVar;
        b bVar2;
        c.a aVar2 = c.a.CACHE_FULL;
        int i10 = 3;
        String str2 = "PRAGMA page_size";
        int i11 = 4;
        int i12 = 2;
        switch (this.f13155a) {
            case 0:
                o oVar = (o) this.f13156b;
                n nVar = (n) this.f13158d;
                s sVar = (s) this.f13157c;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                if (oVar.s().compileStatement(str2).simpleQueryForLong() * oVar.s().compileStatement("PRAGMA page_count").simpleQueryForLong() >= oVar.f13168d.e()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    oVar.d(1, aVar2, nVar.g());
                    return -1L;
                }
                Long v2 = o.v(sQLiteDatabase, sVar);
                if (v2 != null) {
                    j10 = v2.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", sVar.b());
                    contentValues.put("priority", Integer.valueOf(a.a(sVar.d())));
                    contentValues.put("next_request_ms", 0);
                    if (sVar.c() != null) {
                        contentValues.put("extras", Base64.encodeToString(sVar.c(), 0));
                    }
                    j10 = sQLiteDatabase.insert("transport_contexts", (String) null, contentValues);
                }
                int d10 = oVar.f13168d.d();
                byte[] bArr2 = nVar.d().f10016b;
                if (bArr2.length <= d10) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(j10));
                contentValues2.put("transport_name", nVar.g());
                contentValues2.put("timestamp_ms", Long.valueOf(nVar.e()));
                contentValues2.put("uptime_ms", Long.valueOf(nVar.h()));
                contentValues2.put("payload_encoding", nVar.d().f10015a.f4566a);
                contentValues2.put("code", nVar.c());
                contentValues2.put("num_attempts", 0);
                contentValues2.put("inline", Boolean.valueOf(z11));
                if (z11) {
                    bArr = bArr2;
                } else {
                    bArr = new byte[0];
                }
                contentValues2.put("payload", bArr);
                long insert = sQLiteDatabase.insert("events", (String) null, contentValues2);
                if (!z11) {
                    int ceil = (int) Math.ceil(((double) bArr2.length) / ((double) d10));
                    for (int i13 = 1; i13 <= ceil; i13++) {
                        byte[] copyOfRange = Arrays.copyOfRange(bArr2, (i13 - 1) * d10, Math.min(i13 * d10, bArr2.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(insert));
                        contentValues3.put("sequence_num", Integer.valueOf(i13));
                        contentValues3.put("bytes", copyOfRange);
                        sQLiteDatabase.insert("event_payloads", (String) null, contentValues3);
                    }
                }
                for (Map.Entry next : Collections.unmodifiableMap(nVar.b()).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(insert));
                    contentValues4.put("name", (String) next.getKey());
                    contentValues4.put("value", (String) next.getValue());
                    sQLiteDatabase.insert("event_metadata", (String) null, contentValues4);
                }
                return Long.valueOf(insert);
            case 1:
                o oVar2 = (o) this.f13156b;
                List list = (List) this.f13158d;
                s sVar2 = (s) this.f13157c;
                Cursor cursor = (Cursor) obj;
                oVar2.getClass();
                while (cursor.moveToNext()) {
                    long j11 = cursor.getLong(0);
                    if (cursor.getInt(7) != 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    h.a aVar3 = new h.a();
                    aVar3.f9996f = new HashMap();
                    aVar3.d(cursor.getString(1));
                    aVar3.f9994d = Long.valueOf(cursor.getLong(i12));
                    aVar3.f9995e = Long.valueOf(cursor.getLong(i10));
                    if (z12) {
                        String string = cursor.getString(i11);
                        if (string == null) {
                            bVar2 = o.f13164f;
                        } else {
                            bVar2 = new b(string);
                        }
                        aVar3.c(new m(bVar2, cursor.getBlob(5)));
                    } else {
                        String string2 = cursor.getString(i11);
                        if (string2 == null) {
                            bVar = o.f13164f;
                        } else {
                            bVar = new b(string2);
                        }
                        aVar3.c(new m(bVar, (byte[]) o.K(oVar2.s().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j11)}, (String) null, (String) null, "sequence_num"), new kh.h(10))));
                    }
                    if (!cursor.isNull(6)) {
                        aVar3.f9992b = Integer.valueOf(cursor.getInt(6));
                    }
                    list.add(new b(j11, sVar2, aVar3.b()));
                    i10 = 3;
                    i11 = 4;
                    i12 = 2;
                }
                return null;
            default:
                o oVar3 = (o) this.f13156b;
                Map map = (Map) this.f13158d;
                a.C0123a aVar4 = (a.C0123a) this.f13157c;
                Cursor cursor2 = (Cursor) obj;
                oVar3.getClass();
                c.a aVar5 = c.a.REASON_UNKNOWN;
                while (cursor2.moveToNext()) {
                    String string3 = cursor2.getString(0);
                    int i14 = cursor2.getInt(1);
                    if (i14 == 0) {
                        str = str2;
                        aVar = aVar5;
                    } else {
                        aVar = c.a.MESSAGE_TOO_OLD;
                        if (i14 != 1) {
                            if (i14 == 2) {
                                aVar = aVar2;
                            } else {
                                aVar = c.a.PAYLOAD_TOO_BIG;
                                if (i14 != 3) {
                                    aVar = c.a.MAX_RETRIES_REACHED;
                                    if (i14 != 4) {
                                        aVar = c.a.INVALID_PAYLOD;
                                        if (i14 != 5) {
                                            aVar = c.a.SERVER_ERROR;
                                            if (i14 != 6) {
                                                j6.a.a("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i14));
                                                str = str2;
                                                aVar = aVar5;
                                            }
                                        }
                                    }
                                }
                                str = str2;
                            }
                        }
                        str = str2;
                    }
                    long j12 = cursor2.getLong(2);
                    if (!map.containsKey(string3)) {
                        map.put(string3, new ArrayList());
                    }
                    ((List) map.get(string3)).add(new c(j12, aVar));
                    str2 = str;
                }
                String str3 = str2;
                for (Map.Entry entry : map.entrySet()) {
                    int i15 = d.f11181c;
                    new ArrayList();
                    aVar4.f11166b.add(new d((String) entry.getKey(), Collections.unmodifiableList((List) entry.getValue())));
                }
                long a10 = oVar3.f13166b.a();
                SQLiteDatabase s10 = oVar3.s();
                s10.beginTransaction();
                try {
                    f fVar = (f) o.K(s10.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new n(a10));
                    s10.setTransactionSuccessful();
                    s10.endTransaction();
                    aVar4.f11165a = fVar;
                    aVar4.f11167c = new i6.b(new e(oVar3.s().compileStatement(str3).simpleQueryForLong() * oVar3.s().compileStatement("PRAGMA page_count").simpleQueryForLong(), e.f13150a.f13142b));
                    aVar4.f11168d = oVar3.f13169e.get();
                    return new i6.a(aVar4.f11165a, Collections.unmodifiableList(aVar4.f11166b), aVar4.f11167c, aVar4.f11168d);
                } catch (Throwable th2) {
                    s10.endTransaction();
                    throw th2;
                }
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0073 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object then(com.google.android.gms.tasks.Task r10) {
        /*
            r9 = this;
            java.lang.Object r10 = r9.f13156b
            com.google.firebase.remoteconfig.internal.d r10 = (com.google.firebase.remoteconfig.internal.d) r10
            java.lang.Object r0 = r9.f13158d
            com.google.android.gms.tasks.Task r0 = (com.google.android.gms.tasks.Task) r0
            java.lang.Object r1 = r9.f13157c
            com.google.android.gms.tasks.Task r1 = (com.google.android.gms.tasks.Task) r1
            int[] r2 = com.google.firebase.remoteconfig.internal.d.f7708p
            r10.getClass()
            boolean r2 = r0.isSuccessful()
            if (r2 != 0) goto L_0x0028
            com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException r10 = new com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException
            java.lang.Exception r0 = r0.getException()
            java.lang.String r1 = "Firebase Installations failed to get installation auth token for config update listener connection."
            r10.<init>(r1, r0)
            com.google.android.gms.tasks.Task r10 = com.google.android.gms.tasks.Tasks.forException(r10)
            goto L_0x009c
        L_0x0028:
            boolean r2 = r1.isSuccessful()
            if (r2 != 0) goto L_0x003e
            com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException r10 = new com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException
            java.lang.Exception r0 = r1.getException()
            java.lang.String r1 = "Firebase Installations failed to get installation ID for config update listener connection."
            r10.<init>(r1, r0)
            com.google.android.gms.tasks.Task r10 = com.google.android.gms.tasks.Tasks.forException(r10)
            goto L_0x009c
        L_0x003e:
            r2 = 0
            java.net.URL r3 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0073 }
            java.lang.String r4 = r10.f7721l     // Catch:{ MalformedURLException -> 0x0073 }
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ MalformedURLException -> 0x0073 }
            m9.d r6 = r10.f7717h     // Catch:{ MalformedURLException -> 0x0073 }
            r6.a()     // Catch:{ MalformedURLException -> 0x0073 }
            m9.e r6 = r6.f13220c     // Catch:{ MalformedURLException -> 0x0073 }
            java.lang.String r6 = r6.f13232b     // Catch:{ MalformedURLException -> 0x0073 }
            java.util.regex.Pattern r7 = com.google.firebase.remoteconfig.internal.d.f7709q     // Catch:{ MalformedURLException -> 0x0073 }
            java.util.regex.Matcher r6 = r7.matcher(r6)     // Catch:{ MalformedURLException -> 0x0073 }
            boolean r7 = r6.matches()     // Catch:{ MalformedURLException -> 0x0073 }
            r8 = 1
            if (r7 == 0) goto L_0x0063
            java.lang.String r6 = r6.group(r8)     // Catch:{ MalformedURLException -> 0x0073 }
            goto L_0x0064
        L_0x0061:
            r10 = move-exception
            goto L_0x0091
        L_0x0063:
            r6 = r2
        L_0x0064:
            r7 = 0
            r5[r7] = r6     // Catch:{ MalformedURLException -> 0x0073 }
            r5[r8] = r4     // Catch:{ MalformedURLException -> 0x0073 }
            java.lang.String r4 = "https://firebaseremoteconfigrealtime.googleapis.com/v1/projects/%s/namespaces/%s:streamFetchInvalidations"
            java.lang.String r4 = java.lang.String.format(r4, r5)     // Catch:{ MalformedURLException -> 0x0073 }
            r3.<init>(r4)     // Catch:{ MalformedURLException -> 0x0073 }
            r2 = r3
        L_0x0073:
            java.net.URLConnection r2 = r2.openConnection()     // Catch:{ IOException -> 0x0061 }
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch:{ IOException -> 0x0061 }
            java.lang.Object r0 = r0.getResult()     // Catch:{ IOException -> 0x0061 }
            ab.f r0 = (ab.f) r0     // Catch:{ IOException -> 0x0061 }
            java.lang.String r0 = r0.a()     // Catch:{ IOException -> 0x0061 }
            java.lang.Object r1 = r1.getResult()     // Catch:{ IOException -> 0x0061 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ IOException -> 0x0061 }
            r10.h(r2, r1, r0)     // Catch:{ IOException -> 0x0061 }
            com.google.android.gms.tasks.Task r10 = com.google.android.gms.tasks.Tasks.forResult(r2)
            goto L_0x009c
        L_0x0091:
            com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException r0 = new com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException
            java.lang.String r1 = "Failed to open HTTP stream connection"
            r0.<init>(r1, r10)
            com.google.android.gms.tasks.Task r10 = com.google.android.gms.tasks.Tasks.forException(r0)
        L_0x009c:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: m6.k.then(com.google.android.gms.tasks.Task):java.lang.Object");
    }
}
