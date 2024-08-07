package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import w6.j;
import y6.a;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class a<O extends d> {

    /* renamed from: a  reason: collision with root package name */
    public final C0058a f5350a;

    /* renamed from: b  reason: collision with root package name */
    public final g f5351b;

    /* renamed from: c  reason: collision with root package name */
    public final String f5352c;

    @VisibleForTesting
    /* renamed from: com.google.android.gms.common.api.a$a  reason: collision with other inner class name */
    /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
    public static abstract class C0058a<T extends f, O> extends e<T, O> {
        @Deprecated
        public T buildClient(Context context, Looper looper, y6.b bVar, O o10, c.a aVar, c.b bVar2) {
            return buildClient(context, looper, bVar, o10, (w6.c) aVar, (j) bVar2);
        }

        public T buildClient(Context context, Looper looper, y6.b bVar, O o10, w6.c cVar, j jVar) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
    public interface b {
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
    public static class c<C extends b> {
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
    public interface d {

        /* renamed from: j  reason: collision with root package name */
        public static final c f5353j = new c(0);

        /* renamed from: com.google.android.gms.common.api.a$d$a  reason: collision with other inner class name */
        /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
        public interface C0059a extends d {
            Account e0();
        }

        /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
        public interface b extends d {
            GoogleSignInAccount U();
        }

        /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
        public static final class c implements d {
            public c() {
            }

            public /* synthetic */ c(int i10) {
            }
        }
    }

    @VisibleForTesting
    /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
    public static abstract class e<T extends b, O> {
        public static final int API_PRIORITY_GAMES = 1;
        public static final int API_PRIORITY_OTHER = Integer.MAX_VALUE;
        public static final int API_PRIORITY_PLUS = 2;

        public List<Scope> getImpliedScopes(O o10) {
            return Collections.emptyList();
        }

        public int getPriority() {
            return Integer.MAX_VALUE;
        }
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
    public interface f extends b {
        void connect(a.c cVar);

        void disconnect(String str);

        Feature[] getAvailableFeatures();

        String getEndpointPackageName();

        String getLastDisconnectMessage();

        int getMinApkVersion();

        void getRemoteService(com.google.android.gms.common.internal.b bVar, Set<Scope> set);

        Set<Scope> getScopesForConnectionlessNonSignIn();

        boolean isConnected();

        boolean isConnecting();

        void onUserSignOut(a.e eVar);

        boolean requiresGooglePlayServices();

        boolean requiresSignIn();
    }

    @VisibleForTesting
    /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
    public static final class g<C extends f> extends c<C> {
    }

    public <C extends f> a(String str, C0058a<C, O> aVar, g<C> gVar) {
        this.f5352c = str;
        this.f5350a = aVar;
        this.f5351b = gVar;
    }
}
