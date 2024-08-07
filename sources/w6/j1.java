package w6;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.base.zau;
import java.util.concurrent.atomic.AtomicReference;
import u6.a;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public abstract class j1 extends LifecycleCallback implements DialogInterface.OnCancelListener {

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f16614a;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicReference f16615b = new AtomicReference((Object) null);

    /* renamed from: c  reason: collision with root package name */
    public final zau f16616c = new zau(Looper.getMainLooper());

    /* renamed from: d  reason: collision with root package name */
    public final a f16617d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @VisibleForTesting
    public j1(g gVar) {
        super(gVar);
        a aVar = a.f15288d;
        this.f16617d = aVar;
    }

    public final void a(ConnectionResult connectionResult, int i10) {
        this.f16615b.set((Object) null);
        ((t) this).f16657f.i(connectionResult, i10);
    }

    public final void onActivityResult(int i10, int i11, Intent intent) {
        g1 g1Var = (g1) this.f16615b.get();
        if (i10 != 1) {
            if (i10 == 2) {
                int b10 = this.f16617d.b(getActivity());
                if (b10 == 0) {
                    this.f16615b.set((Object) null);
                    zau zau = ((t) this).f16657f.f16582n;
                    zau.sendMessage(zau.obtainMessage(3));
                    return;
                } else if (g1Var != null) {
                    if (g1Var.f16597b.f5321b == 18 && b10 == 18) {
                        return;
                    }
                } else {
                    return;
                }
            }
        } else if (i11 == -1) {
            this.f16615b.set((Object) null);
            zau zau2 = ((t) this).f16657f.f16582n;
            zau2.sendMessage(zau2.obtainMessage(3));
            return;
        } else if (i11 == 0) {
            if (g1Var != null) {
                int i12 = 13;
                if (intent != null) {
                    i12 = intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13);
                }
                a(new ConnectionResult(1, i12, (PendingIntent) null, g1Var.f16597b.toString()), g1Var.f16596a);
                return;
            }
            return;
        }
        if (g1Var != null) {
            a(g1Var.f16597b, g1Var.f16596a);
        }
    }

    public final void onCancel(DialogInterface dialogInterface) {
        int i10;
        ConnectionResult connectionResult = new ConnectionResult(13, (PendingIntent) null);
        g1 g1Var = (g1) this.f16615b.get();
        if (g1Var == null) {
            i10 = -1;
        } else {
            i10 = g1Var.f16596a;
        }
        a(connectionResult, i10);
    }

    public final void onCreate(Bundle bundle) {
        g1 g1Var;
        super.onCreate(bundle);
        if (bundle != null) {
            AtomicReference atomicReference = this.f16615b;
            if (bundle.getBoolean("resolving_error", false)) {
                g1Var = new g1(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1));
            } else {
                g1Var = null;
            }
            atomicReference.set(g1Var);
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        g1 g1Var = (g1) this.f16615b.get();
        if (g1Var != null) {
            bundle.putBoolean("resolving_error", true);
            bundle.putInt("failed_client_id", g1Var.f16596a);
            bundle.putInt("failed_status", g1Var.f16597b.f5321b);
            bundle.putParcelable("failed_resolution", g1Var.f16597b.f5322c);
        }
    }

    public void onStart() {
        super.onStart();
        this.f16614a = true;
    }

    public void onStop() {
        super.onStop();
        this.f16614a = false;
    }
}
