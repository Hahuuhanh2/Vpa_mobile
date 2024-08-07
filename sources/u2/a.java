package u2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: LocalBroadcastManager */
public final class a {

    /* renamed from: f  reason: collision with root package name */
    public static final Object f15064f = new Object();

    /* renamed from: g  reason: collision with root package name */
    public static a f15065g;

    /* renamed from: a  reason: collision with root package name */
    public final Context f15066a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap<BroadcastReceiver, ArrayList<c>> f15067b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap<String, ArrayList<c>> f15068c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList<b> f15069d = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    public final C0202a f15070e;

    /* renamed from: u2.a$a  reason: collision with other inner class name */
    /* compiled from: LocalBroadcastManager */
    public class C0202a extends Handler {
        public C0202a(Looper looper) {
            super(looper);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
            r3 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
            if (r3 >= r1) goto L_0x000b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0029, code lost:
            r4 = r2[r3];
            r5 = r4.f15073b.size();
            r6 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0032, code lost:
            if (r6 >= r5) goto L_0x004b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0034, code lost:
            r7 = r4.f15073b.get(r6);
            r7.getClass();
            r7.f15075b.onReceive(r11.f15066a, r4.f15072a);
            r6 = r6 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x004b, code lost:
            r3 = r3 + 1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void handleMessage(android.os.Message r11) {
            /*
                r10 = this;
                int r0 = r11.what
                r1 = 1
                if (r0 == r1) goto L_0x0009
                super.handleMessage(r11)
                goto L_0x0017
            L_0x0009:
                u2.a r11 = u2.a.this
            L_0x000b:
                java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<u2.a$c>> r0 = r11.f15067b
                monitor-enter(r0)
                java.util.ArrayList<u2.a$b> r1 = r11.f15069d     // Catch:{ all -> 0x004e }
                int r1 = r1.size()     // Catch:{ all -> 0x004e }
                if (r1 > 0) goto L_0x0018
                monitor-exit(r0)     // Catch:{ all -> 0x004e }
            L_0x0017:
                return
            L_0x0018:
                u2.a$b[] r2 = new u2.a.b[r1]     // Catch:{ all -> 0x004e }
                java.util.ArrayList<u2.a$b> r3 = r11.f15069d     // Catch:{ all -> 0x004e }
                r3.toArray(r2)     // Catch:{ all -> 0x004e }
                java.util.ArrayList<u2.a$b> r3 = r11.f15069d     // Catch:{ all -> 0x004e }
                r3.clear()     // Catch:{ all -> 0x004e }
                monitor-exit(r0)     // Catch:{ all -> 0x004e }
                r0 = 0
                r3 = r0
            L_0x0027:
                if (r3 >= r1) goto L_0x000b
                r4 = r2[r3]
                java.util.ArrayList<u2.a$c> r5 = r4.f15073b
                int r5 = r5.size()
                r6 = r0
            L_0x0032:
                if (r6 >= r5) goto L_0x004b
                java.util.ArrayList<u2.a$c> r7 = r4.f15073b
                java.lang.Object r7 = r7.get(r6)
                u2.a$c r7 = (u2.a.c) r7
                r7.getClass()
                android.content.BroadcastReceiver r7 = r7.f15075b
                android.content.Context r8 = r11.f15066a
                android.content.Intent r9 = r4.f15072a
                r7.onReceive(r8, r9)
                int r6 = r6 + 1
                goto L_0x0032
            L_0x004b:
                int r3 = r3 + 1
                goto L_0x0027
            L_0x004e:
                r11 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x004e }
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: u2.a.C0202a.handleMessage(android.os.Message):void");
        }
    }

    /* compiled from: LocalBroadcastManager */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final Intent f15072a;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList<c> f15073b;

        public b(Intent intent, ArrayList<c> arrayList) {
            this.f15072a = intent;
            this.f15073b = arrayList;
        }
    }

    /* compiled from: LocalBroadcastManager */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final IntentFilter f15074a;

        /* renamed from: b  reason: collision with root package name */
        public final BroadcastReceiver f15075b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f15076c;

        public c(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
            this.f15074a = intentFilter;
            this.f15075b = broadcastReceiver;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder(128);
            sb2.append("Receiver{");
            sb2.append(this.f15075b);
            sb2.append(" filter=");
            sb2.append(this.f15074a);
            sb2.append("}");
            return sb2.toString();
        }
    }

    public a(Context context) {
        this.f15066a = context;
        this.f15070e = new C0202a(context.getMainLooper());
    }

    public static a a(Context context) {
        a aVar;
        synchronized (f15064f) {
            if (f15065g == null) {
                f15065g = new a(context.getApplicationContext());
            }
            aVar = f15065g;
        }
        return aVar;
    }

    public final void b(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f15067b) {
            c cVar = new c(broadcastReceiver, intentFilter);
            ArrayList arrayList = this.f15067b.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList(1);
                this.f15067b.put(broadcastReceiver, arrayList);
            }
            arrayList.add(cVar);
            for (int i10 = 0; i10 < intentFilter.countActions(); i10++) {
                String action = intentFilter.getAction(i10);
                ArrayList arrayList2 = this.f15068c.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList(1);
                    this.f15068c.put(action, arrayList2);
                }
                arrayList2.add(cVar);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d9, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00dc, code lost:
        return r11;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c(android.content.Intent r23) {
        /*
            r22 = this;
            r1 = r22
            r0 = r23
            java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<u2.a$c>> r2 = r1.f15067b
            monitor-enter(r2)
            java.lang.String r10 = r23.getAction()     // Catch:{ all -> 0x00dd }
            android.content.Context r3 = r1.f15066a     // Catch:{ all -> 0x00dd }
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch:{ all -> 0x00dd }
            java.lang.String r11 = r0.resolveTypeIfNeeded(r3)     // Catch:{ all -> 0x00dd }
            android.net.Uri r12 = r23.getData()     // Catch:{ all -> 0x00dd }
            java.lang.String r13 = r23.getScheme()     // Catch:{ all -> 0x00dd }
            java.util.Set r14 = r23.getCategories()     // Catch:{ all -> 0x00dd }
            int r3 = r23.getFlags()     // Catch:{ all -> 0x00dd }
            r3 = r3 & 8
            r9 = 0
            if (r3 == 0) goto L_0x002d
            r16 = 1
            goto L_0x002f
        L_0x002d:
            r16 = r9
        L_0x002f:
            if (r16 == 0) goto L_0x0034
            r23.toString()     // Catch:{ all -> 0x00dd }
        L_0x0034:
            java.util.HashMap<java.lang.String, java.util.ArrayList<u2.a$c>> r3 = r1.f15068c     // Catch:{ all -> 0x00dd }
            java.lang.String r4 = r23.getAction()     // Catch:{ all -> 0x00dd }
            java.lang.Object r3 = r3.get(r4)     // Catch:{ all -> 0x00dd }
            r8 = r3
            java.util.ArrayList r8 = (java.util.ArrayList) r8     // Catch:{ all -> 0x00dd }
            if (r8 == 0) goto L_0x00da
            if (r16 == 0) goto L_0x0048
            r8.toString()     // Catch:{ all -> 0x00dd }
        L_0x0048:
            r3 = 0
            r7 = r3
            r6 = r9
        L_0x004b:
            int r3 = r8.size()     // Catch:{ all -> 0x00dd }
            if (r6 >= r3) goto L_0x00aa
            java.lang.Object r3 = r8.get(r6)     // Catch:{ all -> 0x00dd }
            r5 = r3
            u2.a$c r5 = (u2.a.c) r5     // Catch:{ all -> 0x00dd }
            if (r16 == 0) goto L_0x005f
            android.content.IntentFilter r3 = r5.f15074a     // Catch:{ all -> 0x00dd }
            java.util.Objects.toString(r3)     // Catch:{ all -> 0x00dd }
        L_0x005f:
            boolean r3 = r5.f15076c     // Catch:{ all -> 0x00dd }
            if (r3 == 0) goto L_0x006e
            r18 = r6
            r20 = r8
            r19 = r10
            r21 = r11
            r10 = r7
            r11 = r9
            goto L_0x009f
        L_0x006e:
            android.content.IntentFilter r3 = r5.f15074a     // Catch:{ all -> 0x00dd }
            java.lang.String r17 = "LocalBroadcastManager"
            r4 = r10
            r15 = r5
            r5 = r11
            r18 = r6
            r6 = r13
            r19 = r10
            r10 = r7
            r7 = r12
            r20 = r8
            r8 = r14
            r21 = r11
            r11 = r9
            r9 = r17
            int r3 = r3.match(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x00dd }
            if (r3 < 0) goto L_0x009f
            if (r16 == 0) goto L_0x008f
            java.lang.Integer.toHexString(r3)     // Catch:{ all -> 0x00dd }
        L_0x008f:
            if (r10 != 0) goto L_0x0097
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x00dd }
            r7.<init>()     // Catch:{ all -> 0x00dd }
            goto L_0x0098
        L_0x0097:
            r7 = r10
        L_0x0098:
            r7.add(r15)     // Catch:{ all -> 0x00dd }
            r3 = 1
            r15.f15076c = r3     // Catch:{ all -> 0x00dd }
            goto L_0x00a0
        L_0x009f:
            r7 = r10
        L_0x00a0:
            int r6 = r18 + 1
            r9 = r11
            r10 = r19
            r8 = r20
            r11 = r21
            goto L_0x004b
        L_0x00aa:
            r10 = r7
            r11 = r9
            if (r10 == 0) goto L_0x00db
            r9 = r11
        L_0x00af:
            int r3 = r10.size()     // Catch:{ all -> 0x00dd }
            if (r9 >= r3) goto L_0x00c0
            java.lang.Object r3 = r10.get(r9)     // Catch:{ all -> 0x00dd }
            u2.a$c r3 = (u2.a.c) r3     // Catch:{ all -> 0x00dd }
            r3.f15076c = r11     // Catch:{ all -> 0x00dd }
            int r9 = r9 + 1
            goto L_0x00af
        L_0x00c0:
            java.util.ArrayList<u2.a$b> r3 = r1.f15069d     // Catch:{ all -> 0x00dd }
            u2.a$b r4 = new u2.a$b     // Catch:{ all -> 0x00dd }
            r4.<init>(r0, r10)     // Catch:{ all -> 0x00dd }
            r3.add(r4)     // Catch:{ all -> 0x00dd }
            u2.a$a r0 = r1.f15070e     // Catch:{ all -> 0x00dd }
            r3 = 1
            boolean r0 = r0.hasMessages(r3)     // Catch:{ all -> 0x00dd }
            if (r0 != 0) goto L_0x00d8
            u2.a$a r0 = r1.f15070e     // Catch:{ all -> 0x00dd }
            r0.sendEmptyMessage(r3)     // Catch:{ all -> 0x00dd }
        L_0x00d8:
            monitor-exit(r2)     // Catch:{ all -> 0x00dd }
            return r3
        L_0x00da:
            r11 = r9
        L_0x00db:
            monitor-exit(r2)     // Catch:{ all -> 0x00dd }
            return r11
        L_0x00dd:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00dd }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u2.a.c(android.content.Intent):boolean");
    }
}
