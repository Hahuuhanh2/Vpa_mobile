package w6;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.zabx;
import com.google.android.gms.internal.base.zao;
import com.google.android.gms.internal.base.zau;
import u6.a;
import u6.d;
import y6.j;
import y6.q;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class i1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final g1 f16607a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ j1 f16608b;

    public i1(t tVar, g1 g1Var) {
        this.f16608b = tVar;
        this.f16607a = g1Var;
    }

    public final void run() {
        boolean z10;
        if (this.f16608b.f16614a) {
            ConnectionResult connectionResult = this.f16607a.f16597b;
            if (connectionResult.f5321b == 0 || connectionResult.f5322c == null) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                j1 j1Var = this.f16608b;
                g gVar = j1Var.mLifecycleFragment;
                Activity activity = j1Var.getActivity();
                PendingIntent pendingIntent = connectionResult.f5322c;
                j.f(pendingIntent);
                int i10 = this.f16607a.f16596a;
                int i11 = GoogleApiActivity.f5336b;
                Intent intent = new Intent(activity, GoogleApiActivity.class);
                intent.putExtra("pending_intent", pendingIntent);
                intent.putExtra("failing_client_id", i10);
                intent.putExtra("notify_manager", false);
                gVar.startActivityForResult(intent, 1);
                return;
            }
            j1 j1Var2 = this.f16608b;
            if (j1Var2.f16617d.a(connectionResult.f5321b, j1Var2.getActivity(), (String) null) != null) {
                j1 j1Var3 = this.f16608b;
                a aVar = j1Var3.f16617d;
                Activity activity2 = j1Var3.getActivity();
                j1 j1Var4 = this.f16608b;
                aVar.i(activity2, j1Var4.mLifecycleFragment, connectionResult.f5321b, j1Var4);
            } else if (connectionResult.f5321b == 18) {
                j1 j1Var5 = this.f16608b;
                a aVar2 = j1Var5.f16617d;
                Activity activity3 = j1Var5.getActivity();
                j1 j1Var6 = this.f16608b;
                aVar2.getClass();
                ProgressBar progressBar = new ProgressBar(activity3, (AttributeSet) null, 16842874);
                progressBar.setIndeterminate(true);
                progressBar.setVisibility(0);
                AlertDialog.Builder builder = new AlertDialog.Builder(activity3);
                builder.setView(progressBar);
                builder.setMessage(q.b(activity3, 18));
                builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
                AlertDialog create = builder.create();
                a.g(activity3, create, "GooglePlayServicesUpdatingDialog", j1Var6);
                j1 j1Var7 = this.f16608b;
                a aVar3 = j1Var7.f16617d;
                Context applicationContext = j1Var7.getActivity().getApplicationContext();
                h1 h1Var = new h1(this, create);
                aVar3.getClass();
                IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
                intentFilter.addDataScheme("package");
                zabx zabx = new zabx(h1Var);
                zao.zaa(applicationContext, zabx, intentFilter);
                zabx.f5357a = applicationContext;
                if (!d.a(applicationContext)) {
                    j1 j1Var8 = this.f16608b;
                    j1Var8.f16615b.set((Object) null);
                    zau zau = ((t) j1Var8).f16657f.f16582n;
                    zau.sendMessage(zau.obtainMessage(3));
                    if (create.isShowing()) {
                        create.dismiss();
                    }
                    synchronized (zabx) {
                        Context context = zabx.f5357a;
                        if (context != null) {
                            context.unregisterReceiver(zabx);
                        }
                        zabx.f5357a = null;
                    }
                }
            } else {
                this.f16608b.a(connectionResult, this.f16607a.f16596a);
            }
        }
    }
}
