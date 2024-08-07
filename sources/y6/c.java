package y6;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import w6.j;
import y6.a;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public abstract class c<T extends IInterface> extends a<T> implements a.f {
    private static volatile Executor zaa;
    private final b zab;
    private final Set zac;
    private final Account zad;

    @VisibleForTesting
    public c(Context context, Handler handler, int i10, b bVar) {
        super(context, handler, d.a(context), u6.a.f15288d, i10, (a.C0234a) null, (a.b) null);
        j.f(bVar);
        this.zab = bVar;
        this.zad = bVar.f17534a;
        this.zac = zaa(bVar.f17536c);
    }

    private final Set zaa(Set set) {
        Set<Scope> validateScopes = validateScopes(set);
        for (Scope contains : validateScopes) {
            if (!set.contains(contains)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return validateScopes;
    }

    public final Account getAccount() {
        return this.zad;
    }

    public final Executor getBindServiceExecutor() {
        return null;
    }

    public final b getClientSettings() {
        return this.zab;
    }

    public Feature[] getRequiredFeatures() {
        return new Feature[0];
    }

    public final Set<Scope> getScopes() {
        return this.zac;
    }

    public Set<Scope> getScopesForConnectionlessNonSignIn() {
        if (requiresSignIn()) {
            return this.zac;
        }
        return Collections.emptySet();
    }

    public Set<Scope> validateScopes(Set<Scope> set) {
        return set;
    }

    public c(Context context, Looper looper, int i10, b bVar) {
        this(context, looper, d.a(context), u6.a.f15288d, i10, bVar, (w6.c) null, (j) null);
    }

    @Deprecated
    public c(Context context, Looper looper, int i10, b bVar, c.a aVar, c.b bVar2) {
        this(context, looper, i10, bVar, (w6.c) aVar, (j) bVar2);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c(android.content.Context r10, android.os.Looper r11, int r12, y6.b r13, w6.c r14, w6.j r15) {
        /*
            r9 = this;
            y6.x0 r3 = y6.d.a(r10)
            u6.a r4 = u6.a.f15288d
            y6.j.f(r14)
            y6.j.f(r15)
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
        throw new UnsupportedOperationException("Method not decompiled: y6.c.<init>(android.content.Context, android.os.Looper, int, y6.b, w6.c, w6.j):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @com.google.android.gms.common.util.VisibleForTesting
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c(android.content.Context r12, android.os.Looper r13, y6.d r14, u6.a r15, int r16, y6.b r17, w6.c r18, w6.j r19) {
        /*
            r11 = this;
            r9 = r11
            r10 = r17
            r0 = r18
            r1 = r19
            r2 = 0
            if (r0 != 0) goto L_0x000c
            r6 = r2
            goto L_0x0012
        L_0x000c:
            y6.u r3 = new y6.u
            r3.<init>(r0)
            r6 = r3
        L_0x0012:
            if (r1 != 0) goto L_0x0016
            r7 = r2
            goto L_0x001c
        L_0x0016:
            y6.v r0 = new y6.v
            r0.<init>(r1)
            r7 = r0
        L_0x001c:
            java.lang.String r8 = r10.f17539f
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.zab = r10
            android.accounts.Account r0 = r10.f17534a
            r9.zad = r0
            java.util.Set r0 = r10.f17536c
            java.util.Set r0 = r11.zaa(r0)
            r9.zac = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y6.c.<init>(android.content.Context, android.os.Looper, y6.d, u6.a, int, y6.b, w6.c, w6.j):void");
    }
}
