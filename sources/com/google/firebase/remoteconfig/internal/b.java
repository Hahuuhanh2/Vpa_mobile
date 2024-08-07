package com.google.firebase.remoteconfig.internal;

import ab.c;
import android.text.format.DateUtils;
import c0.r;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.internal.c;
import f0.b0;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import n0.l;
import v.f0;
import wb.d;
import wb.e;

/* compiled from: ConfigFetchHandler */
public final class b {

    /* renamed from: i  reason: collision with root package name */
    public static final long f7685i = TimeUnit.HOURS.toSeconds(12);

    /* renamed from: j  reason: collision with root package name */
    public static final int[] f7686j = {2, 4, 8, 16, 32, 64, 128, 256};

    /* renamed from: a  reason: collision with root package name */
    public final c f7687a;

    /* renamed from: b  reason: collision with root package name */
    public final za.b<p9.a> f7688b;

    /* renamed from: c  reason: collision with root package name */
    public final Executor f7689c;

    /* renamed from: d  reason: collision with root package name */
    public final Random f7690d;

    /* renamed from: e  reason: collision with root package name */
    public final wb.c f7691e;

    /* renamed from: f  reason: collision with root package name */
    public final ConfigFetchHttpClient f7692f;

    /* renamed from: g  reason: collision with root package name */
    public final c f7693g;

    /* renamed from: h  reason: collision with root package name */
    public final Map<String, String> f7694h;

    /* compiled from: ConfigFetchHandler */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f7695a;

        /* renamed from: b  reason: collision with root package name */
        public final d f7696b;

        /* renamed from: c  reason: collision with root package name */
        public final String f7697c;

        public a(int i10, d dVar, String str) {
            this.f7695a = i10;
            this.f7696b = dVar;
            this.f7697c = str;
        }
    }

    public b(c cVar, za.b bVar, ScheduledExecutorService scheduledExecutorService, Random random, wb.c cVar2, ConfigFetchHttpClient configFetchHttpClient, c cVar3, HashMap hashMap) {
        this.f7687a = cVar;
        this.f7688b = bVar;
        this.f7689c = scheduledExecutorService;
        this.f7690d = random;
        this.f7691e = cVar2;
        this.f7692f = configFetchHttpClient;
        this.f7693g = cVar3;
        this.f7694h = hashMap;
    }

    public final a a(String str, String str2, Date date, Map<String, String> map) {
        boolean z10;
        String str3;
        Long l10;
        boolean z11 = false;
        try {
            HttpURLConnection b10 = this.f7692f.b();
            ConfigFetchHttpClient configFetchHttpClient = this.f7692f;
            HashMap d10 = d();
            String string = this.f7693g.f7700a.getString("last_fetch_etag", (String) null);
            p9.a aVar = this.f7688b.get();
            if (aVar == null) {
                l10 = null;
            } else {
                l10 = (Long) aVar.a(true).get("_fot");
            }
            a fetch = configFetchHttpClient.fetch(b10, str, str2, d10, string, map, l10, date);
            d dVar = fetch.f7696b;
            if (dVar != null) {
                c cVar = this.f7693g;
                long j10 = dVar.f16770f;
                synchronized (cVar.f7701b) {
                    cVar.f7700a.edit().putLong("last_template_version", j10).apply();
                }
            }
            String str4 = fetch.f7697c;
            if (str4 != null) {
                c cVar2 = this.f7693g;
                synchronized (cVar2.f7701b) {
                    cVar2.f7700a.edit().putString("last_fetch_etag", str4).apply();
                }
            }
            this.f7693g.c(0, c.f7699f);
            return fetch;
        } catch (FirebaseRemoteConfigServerException e10) {
            int i10 = e10.f7666a;
            if (i10 == 429 || i10 == 502 || i10 == 503 || i10 == 504) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                int i11 = this.f7693g.a().f7704a + 1;
                TimeUnit timeUnit = TimeUnit.MINUTES;
                int[] iArr = f7686j;
                long millis = timeUnit.toMillis((long) iArr[Math.min(i11, iArr.length) - 1]);
                this.f7693g.c(i11, new Date(date.getTime() + (millis / 2) + ((long) this.f7690d.nextInt((int) millis))));
            }
            c.a a10 = this.f7693g.a();
            int i12 = e10.f7666a;
            if (a10.f7704a > 1 || i12 == 429) {
                z11 = true;
            }
            if (!z11) {
                if (i12 == 401) {
                    str3 = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
                } else if (i12 == 403) {
                    str3 = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
                } else if (i12 == 429) {
                    throw new FirebaseRemoteConfigClientException("The throttled response from the server was not handled correctly by the FRC SDK.");
                } else if (i12 != 500) {
                    switch (i12) {
                        case 502:
                        case 503:
                        case 504:
                            str3 = "The server is unavailable. Please try again later.";
                            break;
                        default:
                            str3 = "The server returned an unexpected error.";
                            break;
                    }
                } else {
                    str3 = "There was an internal server error.";
                }
                throw new FirebaseRemoteConfigServerException(e10.f7666a, b0.r("Fetch failed: ", str3), e10);
            }
            a10.f7705b.getTime();
            throw new FirebaseRemoteConfigFetchThrottledException();
        }
    }

    public final Task b(long j10, Task task, Map map) {
        Task<TContinuationResult> task2;
        boolean z10;
        Date date = new Date(System.currentTimeMillis());
        Date date2 = null;
        if (task.isSuccessful()) {
            c cVar = this.f7693g;
            cVar.getClass();
            Date date3 = new Date(cVar.f7700a.getLong("last_fetch_time_in_millis", -1));
            if (date3.equals(c.f7698e)) {
                z10 = false;
            } else {
                z10 = date.before(new Date(TimeUnit.SECONDS.toMillis(j10) + date3.getTime()));
            }
            if (z10) {
                return Tasks.forResult(new a(2, (d) null, (String) null));
            }
        }
        Date date4 = this.f7693g.a().f7705b;
        if (date.before(date4)) {
            date2 = date4;
        }
        if (date2 != null) {
            String format = String.format("Fetch is throttled. Please wait before calling fetch again: %s", new Object[]{DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(date2.getTime() - date.getTime()))});
            date2.getTime();
            task2 = Tasks.forException(new FirebaseRemoteConfigFetchThrottledException(format));
        } else {
            Task<String> id2 = this.f7687a.getId();
            Task a10 = this.f7687a.a();
            task2 = Tasks.whenAllComplete((Task<?>[]) new Task[]{id2, a10}).continueWithTask(this.f7689c, new e(this, id2, a10, date, map));
        }
        return task2.continueWithTask(this.f7689c, new r(7, this, date));
    }

    public final Task c(int i10) {
        HashMap hashMap = new HashMap(this.f7694h);
        hashMap.put("X-Firebase-RC-Fetch-Type", l.e(2) + "/" + i10);
        return this.f7691e.b().continueWithTask(this.f7689c, new f0(5, this, hashMap));
    }

    public final HashMap d() {
        HashMap hashMap = new HashMap();
        p9.a aVar = this.f7688b.get();
        if (aVar == null) {
            return hashMap;
        }
        for (Map.Entry next : aVar.a(false).entrySet()) {
            hashMap.put((String) next.getKey(), next.getValue().toString());
        }
        return hashMap;
    }
}
