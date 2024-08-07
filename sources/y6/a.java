package y6;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.common.internal.zzk;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import n0.l;
import w6.a0;
import w6.z;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
public abstract class a<T extends IInterface> {
    public static final int CONNECT_STATE_CONNECTED = 4;
    public static final int CONNECT_STATE_DISCONNECTED = 1;
    public static final int CONNECT_STATE_DISCONNECTING = 5;
    public static final String DEFAULT_ACCOUNT = "<<default account>>";
    public static final String[] GOOGLE_PLUS_REQUIRED_FEATURES = {"service_esmobile", "service_googleme"};
    public static final String KEY_PENDING_INTENT = "pendingIntent";
    private static final Feature[] zze = new Feature[0];
    private volatile String zzA;
    /* access modifiers changed from: private */
    public ConnectionResult zzB;
    /* access modifiers changed from: private */
    public boolean zzC;
    private volatile zzk zzD;
    public z0 zza;
    public final Handler zzb;
    public c zzc;
    public AtomicInteger zzd;
    private int zzf;
    private long zzg;
    private long zzh;
    private int zzi;
    private long zzj;
    private volatile String zzk;
    private final Context zzl;
    private final Looper zzm;
    private final d zzn;
    private final u6.b zzo;
    private final Object zzp;
    /* access modifiers changed from: private */
    public final Object zzq;
    /* access modifiers changed from: private */
    public g zzr;
    private IInterface zzs;
    /* access modifiers changed from: private */
    public final ArrayList zzt;
    private n0 zzu;
    private int zzv;
    /* access modifiers changed from: private */
    public final C0234a zzw;
    /* access modifiers changed from: private */
    public final b zzx;
    private final int zzy;
    private final String zzz;

    /* renamed from: y6.a$a  reason: collision with other inner class name */
    /* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
    public interface C0234a {
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
    public interface b {
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
    public interface c {
        void a(ConnectionResult connectionResult);
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
    public class d implements c {
        public d() {
        }

        public final void a(ConnectionResult connectionResult) {
            boolean z10;
            if (connectionResult.f5321b == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                a aVar = a.this;
                aVar.getRemoteService((com.google.android.gms.common.internal.b) null, aVar.getScopes());
            } else if (a.this.zzx != null) {
                ((v) a.this.zzx).f17594a.r(connectionResult);
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
    public interface e {
    }

    public a(Context context, Handler handler, d dVar, u6.b bVar, int i10, C0234a aVar, b bVar2) {
        this.zzk = null;
        this.zzp = new Object();
        this.zzq = new Object();
        this.zzt = new ArrayList();
        this.zzv = 1;
        this.zzB = null;
        this.zzC = false;
        this.zzD = null;
        this.zzd = new AtomicInteger(0);
        if (context != null) {
            this.zzl = context;
            if (handler != null) {
                this.zzb = handler;
                this.zzm = handler.getLooper();
                if (dVar != null) {
                    this.zzn = dVar;
                    if (bVar != null) {
                        this.zzo = bVar;
                        this.zzy = i10;
                        this.zzw = aVar;
                        this.zzx = bVar2;
                        this.zzz = null;
                        return;
                    }
                    throw new NullPointerException("API availability must not be null");
                }
                throw new NullPointerException("Supervisor must not be null");
            }
            throw new NullPointerException("Handler must not be null");
        }
        throw new NullPointerException("Context must not be null");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0025, code lost:
        if (r0.f5414a >= r2.f5414a) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void zzj(y6.a r2, com.google.android.gms.common.internal.zzk r3) {
        /*
            r2.zzD = r3
            boolean r2 = r2.usesClientTelemetry()
            if (r2 == 0) goto L_0x002c
            com.google.android.gms.common.internal.ConnectionTelemetryConfiguration r2 = r3.f5440d
            y6.k r3 = y6.k.a()
            if (r2 != 0) goto L_0x0012
            r2 = 0
            goto L_0x0014
        L_0x0012:
            com.google.android.gms.common.internal.RootTelemetryConfiguration r2 = r2.f5383a
        L_0x0014:
            monitor-enter(r3)
            if (r2 != 0) goto L_0x001d
            com.google.android.gms.common.internal.RootTelemetryConfiguration r2 = y6.k.f17566c     // Catch:{ all -> 0x0029 }
        L_0x0019:
            r3.f17567a = r2     // Catch:{ all -> 0x0029 }
        L_0x001b:
            monitor-exit(r3)
            goto L_0x0028
        L_0x001d:
            com.google.android.gms.common.internal.RootTelemetryConfiguration r0 = r3.f17567a     // Catch:{ all -> 0x0029 }
            if (r0 == 0) goto L_0x0019
            int r0 = r0.f5414a     // Catch:{ all -> 0x0029 }
            int r1 = r2.f5414a     // Catch:{ all -> 0x0029 }
            if (r0 >= r1) goto L_0x001b
            goto L_0x0019
        L_0x0028:
            return
        L_0x0029:
            r2 = move-exception
            monitor-exit(r3)
            throw r2
        L_0x002c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y6.a.zzj(y6.a, com.google.android.gms.common.internal.zzk):void");
    }

    public static /* bridge */ /* synthetic */ void zzk(a aVar, int i10) {
        int i11;
        int i12;
        synchronized (aVar.zzp) {
            i11 = aVar.zzv;
        }
        if (i11 == 3) {
            aVar.zzC = true;
            i12 = 5;
        } else {
            i12 = 4;
        }
        Handler handler = aVar.zzb;
        handler.sendMessage(handler.obtainMessage(i12, aVar.zzd.get(), 16));
    }

    public static /* bridge */ /* synthetic */ boolean zzn(a aVar, int i10, int i11, IInterface iInterface) {
        synchronized (aVar.zzp) {
            if (aVar.zzv != i10) {
                return false;
            }
            aVar.zzp(i11, iInterface);
            return true;
        }
    }

    public static /* bridge */ /* synthetic */ boolean zzo(a aVar) {
        if (aVar.zzC || TextUtils.isEmpty(aVar.getServiceDescriptor()) || TextUtils.isEmpty(aVar.getLocalStartServiceAction())) {
            return false;
        }
        try {
            Class.forName(aVar.getServiceDescriptor());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    public final void zzp(int i10, IInterface iInterface) {
        boolean z10;
        boolean z11;
        boolean z12;
        z0 z0Var;
        z0 z0Var2;
        if (i10 != 4) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (iInterface == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z10 == z11) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            synchronized (this.zzp) {
                try {
                    this.zzv = i10;
                    this.zzs = iInterface;
                    if (i10 == 1) {
                        n0 n0Var = this.zzu;
                        if (n0Var != null) {
                            d dVar = this.zzn;
                            String str = this.zza.f17612a;
                            j.f(str);
                            String str2 = this.zza.f17613b;
                            zze();
                            dVar.b(str, str2, n0Var, this.zza.f17614c);
                            this.zzu = null;
                        }
                    } else if (i10 == 2 || i10 == 3) {
                        n0 n0Var2 = this.zzu;
                        if (!(n0Var2 == null || (z0Var2 = this.zza) == null)) {
                            d dVar2 = this.zzn;
                            String str3 = z0Var2.f17612a;
                            j.f(str3);
                            String str4 = this.zza.f17613b;
                            zze();
                            dVar2.b(str3, str4, n0Var2, this.zza.f17614c);
                            this.zzd.incrementAndGet();
                        }
                        n0 n0Var3 = new n0(this, this.zzd.get());
                        this.zzu = n0Var3;
                        if (this.zzv != 3 || getLocalStartServiceAction() == null) {
                            z0Var = new z0(getStartServicePackage(), getStartServiceAction(), getUseDynamicLookup());
                        } else {
                            z0Var = new z0(getContext().getPackageName(), getLocalStartServiceAction(), false);
                        }
                        this.zza = z0Var;
                        if (z0Var.f17614c) {
                            if (getMinApkVersion() < 17895000) {
                                throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.zza.f17612a)));
                            }
                        }
                        d dVar3 = this.zzn;
                        String str5 = this.zza.f17612a;
                        j.f(str5);
                        String str6 = this.zza.f17613b;
                        if (!dVar3.c(new u0(str5, str6, this.zza.f17614c), n0Var3, zze(), getBindServiceExecutor())) {
                            String str7 = this.zza.f17612a;
                            zzl(16, (Bundle) null, this.zzd.get());
                        }
                    } else if (i10 == 4) {
                        j.f(iInterface);
                        onConnectedLocked(iInterface);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public void checkAvailabilityAndConnect() {
        int c10 = this.zzo.c(this.zzl, getMinApkVersion());
        if (c10 != 0) {
            zzp(1, (IInterface) null);
            triggerNotAvailable(new d(), c10, (PendingIntent) null);
            return;
        }
        connect(new d());
    }

    public final void checkConnected() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public void connect(c cVar) {
        if (cVar != null) {
            this.zzc = cVar;
            zzp(2, (IInterface) null);
            return;
        }
        throw new NullPointerException("Connection progress callbacks cannot be null.");
    }

    public abstract T createServiceInterface(IBinder iBinder);

    public void disconnect() {
        this.zzd.incrementAndGet();
        synchronized (this.zzt) {
            try {
                int size = this.zzt.size();
                for (int i10 = 0; i10 < size; i10++) {
                    l0 l0Var = (l0) this.zzt.get(i10);
                    synchronized (l0Var) {
                        l0Var.f17569a = null;
                    }
                }
                this.zzt.clear();
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        synchronized (this.zzq) {
            this.zzr = null;
        }
        zzp(1, (IInterface) null);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i10;
        IInterface iInterface;
        g gVar;
        synchronized (this.zzp) {
            i10 = this.zzv;
            iInterface = this.zzs;
        }
        synchronized (this.zzq) {
            gVar = this.zzr;
        }
        printWriter.append(str).append("mConnectState=");
        if (i10 == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i10 == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i10 == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i10 == 4) {
            printWriter.print("CONNECTED");
        } else if (i10 != 5) {
            printWriter.print("UNKNOWN");
        } else {
            printWriter.print("DISCONNECTING");
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append(getServiceDescriptor()).append("@").append(Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (gVar == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(gVar.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.zzh > 0) {
            PrintWriter append = printWriter.append(str).append("lastConnectedTime=");
            long j10 = this.zzh;
            String h10 = l.h(j10, simpleDateFormat);
            append.println(j10 + " " + h10);
        }
        if (this.zzg > 0) {
            printWriter.append(str).append("lastSuspendedCause=");
            int i11 = this.zzf;
            if (i11 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i11 == 2) {
                printWriter.append("CAUSE_NETWORK_LOST");
            } else if (i11 != 3) {
                printWriter.append(String.valueOf(i11));
            } else {
                printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
            }
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j11 = this.zzg;
            String h11 = l.h(j11, simpleDateFormat);
            append2.println(j11 + " " + h11);
        }
        if (this.zzj > 0) {
            printWriter.append(str).append("lastFailedStatus=").append(v6.a.a(this.zzi));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j12 = this.zzj;
            String h12 = l.h(j12, simpleDateFormat);
            append3.println(j12 + " " + h12);
        }
    }

    public boolean enableLocalFallback() {
        return false;
    }

    public Account getAccount() {
        return null;
    }

    public Feature[] getApiFeatures() {
        return zze;
    }

    public final Feature[] getAvailableFeatures() {
        zzk zzk2 = this.zzD;
        if (zzk2 == null) {
            return null;
        }
        return zzk2.f5438b;
    }

    public Executor getBindServiceExecutor() {
        return null;
    }

    public Bundle getConnectionHint() {
        return null;
    }

    public final Context getContext() {
        return this.zzl;
    }

    public String getEndpointPackageName() {
        z0 z0Var;
        if (isConnected() && (z0Var = this.zza) != null) {
            return z0Var.f17613b;
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    public int getGCoreServiceId() {
        return this.zzy;
    }

    public Bundle getGetServiceRequestExtraArgs() {
        return new Bundle();
    }

    public String getLastDisconnectMessage() {
        return this.zzk;
    }

    public String getLocalStartServiceAction() {
        return null;
    }

    public final Looper getLooper() {
        return this.zzm;
    }

    public int getMinApkVersion() {
        return u6.b.f15289a;
    }

    public void getRemoteService(com.google.android.gms.common.internal.b bVar, Set<Scope> set) {
        Set<Scope> set2 = set;
        Bundle getServiceRequestExtraArgs = getGetServiceRequestExtraArgs();
        String str = this.zzA;
        int i10 = u6.b.f15289a;
        Scope[] scopeArr = GetServiceRequest.f5389v;
        Bundle bundle = new Bundle();
        int i11 = this.zzy;
        Feature[] featureArr = GetServiceRequest.f5390w;
        GetServiceRequest getServiceRequest = r3;
        GetServiceRequest getServiceRequest2 = new GetServiceRequest(6, i11, i10, (String) null, (IBinder) null, scopeArr, bundle, (Account) null, featureArr, featureArr, true, 0, false, str);
        GetServiceRequest getServiceRequest3 = getServiceRequest;
        getServiceRequest3.f5394d = this.zzl.getPackageName();
        getServiceRequest3.f5397n = getServiceRequestExtraArgs;
        if (set2 != null) {
            getServiceRequest3.f5396f = (Scope[]) set2.toArray(new Scope[0]);
        }
        if (requiresSignIn()) {
            Account account = getAccount();
            if (account == null) {
                account = new Account(DEFAULT_ACCOUNT, "com.google");
            }
            getServiceRequest3.f5398o = account;
            if (bVar != null) {
                getServiceRequest3.f5395e = bVar.asBinder();
            }
        } else if (requiresAccount()) {
            getServiceRequest3.f5398o = getAccount();
        }
        getServiceRequest3.f5399p = zze;
        getServiceRequest3.f5400q = getApiFeatures();
        if (usesClientTelemetry()) {
            getServiceRequest3.f5403t = true;
        }
        try {
            synchronized (this.zzq) {
                g gVar = this.zzr;
                if (gVar != null) {
                    gVar.n(new m0(this, this.zzd.get()), getServiceRequest3);
                }
            }
        } catch (DeadObjectException unused) {
            triggerConnectionSuspended(3);
        } catch (SecurityException e10) {
            throw e10;
        } catch (RemoteException | RuntimeException unused2) {
            onPostInitHandler(8, (IBinder) null, (Bundle) null, this.zzd.get());
        }
    }

    public Set<Scope> getScopes() {
        return Collections.emptySet();
    }

    public final T getService() {
        T t10;
        synchronized (this.zzp) {
            if (this.zzv != 5) {
                checkConnected();
                t10 = this.zzs;
                j.g(t10, "Client is connected but service is null");
            } else {
                throw new DeadObjectException();
            }
        }
        return t10;
    }

    public IBinder getServiceBrokerBinder() {
        synchronized (this.zzq) {
            g gVar = this.zzr;
            if (gVar == null) {
                return null;
            }
            IBinder asBinder = gVar.asBinder();
            return asBinder;
        }
    }

    public abstract String getServiceDescriptor();

    public Intent getSignInIntent() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    public abstract String getStartServiceAction();

    public String getStartServicePackage() {
        return "com.google.android.gms";
    }

    public ConnectionTelemetryConfiguration getTelemetryConfiguration() {
        zzk zzk2 = this.zzD;
        if (zzk2 == null) {
            return null;
        }
        return zzk2.f5440d;
    }

    public boolean getUseDynamicLookup() {
        if (getMinApkVersion() >= 211700000) {
            return true;
        }
        return false;
    }

    public boolean hasConnectionInfo() {
        return this.zzD != null;
    }

    public boolean isConnected() {
        boolean z10;
        synchronized (this.zzp) {
            if (this.zzv == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public boolean isConnecting() {
        boolean z10;
        synchronized (this.zzp) {
            int i10 = this.zzv;
            z10 = true;
            if (i10 != 2) {
                if (i10 != 3) {
                    z10 = false;
                }
            }
        }
        return z10;
    }

    public void onConnectedLocked(T t10) {
        this.zzh = System.currentTimeMillis();
    }

    public void onConnectionFailed(ConnectionResult connectionResult) {
        this.zzi = connectionResult.f5321b;
        this.zzj = System.currentTimeMillis();
    }

    public void onConnectionSuspended(int i10) {
        this.zzf = i10;
        this.zzg = System.currentTimeMillis();
    }

    public void onPostInitHandler(int i10, IBinder iBinder, Bundle bundle, int i11) {
        this.zzb.sendMessage(this.zzb.obtainMessage(1, i11, -1, new o0(this, i10, iBinder, bundle)));
    }

    public void onUserSignOut(e eVar) {
        a0 a0Var = (a0) eVar;
        a0Var.f16539a.f16558p.f16582n.post(new z(a0Var));
    }

    public boolean providesSignIn() {
        return false;
    }

    public boolean requiresAccount() {
        return false;
    }

    public boolean requiresGooglePlayServices() {
        return true;
    }

    public boolean requiresSignIn() {
        return false;
    }

    public void setAttributionTag(String str) {
        this.zzA = str;
    }

    public void triggerConnectionSuspended(int i10) {
        this.zzb.sendMessage(this.zzb.obtainMessage(6, this.zzd.get(), i10));
    }

    public void triggerNotAvailable(c cVar, int i10, PendingIntent pendingIntent) {
        if (cVar != null) {
            this.zzc = cVar;
            this.zzb.sendMessage(this.zzb.obtainMessage(3, this.zzd.get(), i10, pendingIntent));
            return;
        }
        throw new NullPointerException("Connection progress callbacks cannot be null.");
    }

    public boolean usesClientTelemetry() {
        return false;
    }

    public final String zze() {
        String str = this.zzz;
        if (str == null) {
            return this.zzl.getClass().getName();
        }
        return str;
    }

    public final void zzl(int i10, Bundle bundle, int i11) {
        this.zzb.sendMessage(this.zzb.obtainMessage(7, i11, -1, new p0(this, i10)));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(android.content.Context r10, android.os.Looper r11, int r12, y6.a.C0234a r13, y6.a.b r14, java.lang.String r15) {
        /*
            r9 = this;
            y6.x0 r3 = y6.d.a(r10)
            u6.b r4 = u6.b.f15290b
            y6.j.f(r13)
            y6.j.f(r14)
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y6.a.<init>(android.content.Context, android.os.Looper, int, y6.a$a, y6.a$b, java.lang.String):void");
    }

    public void disconnect(String str) {
        this.zzk = str;
        disconnect();
    }

    public a(Context context, Looper looper, d dVar, u6.b bVar, int i10, C0234a aVar, b bVar2, String str) {
        this.zzk = null;
        this.zzp = new Object();
        this.zzq = new Object();
        this.zzt = new ArrayList();
        this.zzv = 1;
        this.zzB = null;
        this.zzC = false;
        this.zzD = null;
        this.zzd = new AtomicInteger(0);
        if (context != null) {
            this.zzl = context;
            if (looper != null) {
                this.zzm = looper;
                if (dVar != null) {
                    this.zzn = dVar;
                    if (bVar != null) {
                        this.zzo = bVar;
                        this.zzb = new k0(this, looper);
                        this.zzy = i10;
                        this.zzw = aVar;
                        this.zzx = bVar2;
                        this.zzz = str;
                        return;
                    }
                    throw new NullPointerException("API availability must not be null");
                }
                throw new NullPointerException("Supervisor must not be null");
            }
            throw new NullPointerException("Looper must not be null");
        }
        throw new NullPointerException("Context must not be null");
    }
}
