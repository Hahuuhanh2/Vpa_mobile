package u6;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.TypedValue;
import androidx.core.graphics.drawable.IconCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.w;
import com.google.android.gms.base.R$drawable;
import com.google.android.gms.base.R$string;
import com.google.android.gms.common.ErrorDialogFragment;
import com.google.android.gms.internal.base.zad;
import com.google.android.gms.internal.base.zae;
import com.google.errorprone.annotations.RestrictedInheritance;
import h7.d;
import h7.g;
import i1.a0;
import i1.m;
import i1.o;
import i1.p;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import w6.j1;
import y6.j;
import y6.q;
import y6.r;
import y6.s;
import y6.t;

@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms.*", allowlistAnnotations = {zad.class, zae.class}, explanation = "Sub classing of GMS Core's APIs are restricted to GMS Core client libs and testing fakes.", link = "go/gmscore-restrictedinheritance")
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class a extends b {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f15287c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static final a f15288d = new a();

    public static AlertDialog f(Context context, int i10, t tVar, DialogInterface.OnCancelListener onCancelListener) {
        String str;
        AlertDialog.Builder builder = null;
        if (i10 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(q.b(context, i10));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = context.getResources();
        if (i10 == 1) {
            str = resources.getString(R$string.common_google_play_services_install_button);
        } else if (i10 == 2) {
            str = resources.getString(R$string.common_google_play_services_update_button);
        } else if (i10 != 3) {
            str = resources.getString(17039370);
        } else {
            str = resources.getString(R$string.common_google_play_services_enable_button);
        }
        if (str != null) {
            builder.setPositiveButton(str, tVar);
        }
        String c10 = q.c(context, i10);
        if (c10 != null) {
            builder.setTitle(c10);
        }
        String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", new Object[]{Integer.valueOf(i10)});
        new IllegalArgumentException();
        return builder.create();
    }

    public static void g(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof FragmentActivity) {
                w G = ((FragmentActivity) activity).G();
                f fVar = new f();
                if (alertDialog != null) {
                    alertDialog.setOnCancelListener((DialogInterface.OnCancelListener) null);
                    alertDialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
                    fVar.f15295u0 = alertDialog;
                    if (onCancelListener != null) {
                        fVar.f15296v0 = onCancelListener;
                    }
                    fVar.n0(G, str);
                    return;
                }
                throw new NullPointerException("Cannot display null dialog");
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        ErrorDialogFragment errorDialogFragment = new ErrorDialogFragment();
        if (alertDialog != null) {
            alertDialog.setOnCancelListener((DialogInterface.OnCancelListener) null);
            alertDialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
            errorDialogFragment.f5324a = alertDialog;
            if (onCancelListener != null) {
                errorDialogFragment.f5325b = onCancelListener;
            }
            errorDialogFragment.show(fragmentManager, str);
            return;
        }
        throw new NullPointerException("Cannot display null dialog");
    }

    public final Intent a(int i10, Context context, String str) {
        return super.a(i10, context, str);
    }

    public final int b(Context context) {
        return super.b(context);
    }

    public final int c(Context context, int i10) {
        return super.c(context, i10);
    }

    public final AlertDialog d(Activity activity, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        return f(activity, i10, new r(i11, activity, super.a(i10, activity, "d")), onCancelListener);
    }

    public final boolean e(int i10) {
        AtomicBoolean atomicBoolean = d.f15292a;
        if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 9) {
            return true;
        }
        return false;
    }

    @TargetApi(20)
    public final void h(Context context, int i10, PendingIntent pendingIntent) {
        String str;
        String str2;
        NotificationManager notificationManager;
        p pVar;
        int i11;
        NotificationManager notificationManager2;
        int i12;
        Context context2 = context;
        int i13 = i10;
        PendingIntent pendingIntent2 = pendingIntent;
        IconCompat iconCompat = null;
        String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", new Object[]{Integer.valueOf(i10), null});
        new IllegalArgumentException();
        if (i13 == 18) {
            new g(this, context2).sendEmptyMessageDelayed(1, 120000);
            return;
        }
        if (pendingIntent2 != null) {
            if (i13 == 6) {
                str = q.e(context2, "common_google_play_services_resolution_required_title");
            } else {
                str = q.c(context, i10);
            }
            if (str == null) {
                str = context.getResources().getString(R$string.common_google_play_services_notification_ticker);
            }
            if (i13 == 6 || i13 == 19) {
                str2 = q.d(context2, "common_google_play_services_resolution_required_text", q.a(context));
            } else {
                str2 = q.b(context, i10);
            }
            Resources resources = context.getResources();
            Object systemService = context2.getSystemService("notification");
            j.f(systemService);
            NotificationManager notificationManager3 = (NotificationManager) systemService;
            p pVar2 = new p(context2, (String) null);
            pVar2.f10985p = true;
            pVar2.c(16, true);
            pVar2.f10974e = p.b(str);
            o oVar = new o();
            oVar.f10969b = p.b(str2);
            pVar2.f(oVar);
            if (d.b(context)) {
                pVar2.f10992w.icon = context.getApplicationInfo().icon;
                pVar2.f10981l = 2;
                if (d.c(context)) {
                    int i14 = R$drawable.common_full_open_on_phone;
                    String string = resources.getString(R$string.common_open_on_phone);
                    ArrayList<m> arrayList = pVar2.f10971b;
                    if (i14 != 0) {
                        iconCompat = IconCompat.b((Resources) null, "", i14);
                    }
                    m mVar = r2;
                    notificationManager = notificationManager3;
                    i11 = 1;
                    m mVar2 = new m(iconCompat, string, pendingIntent, new Bundle(), (a0[]) null, (a0[]) null, true, 0, true, false, false);
                    arrayList.add(mVar);
                    pVar = pVar2;
                } else {
                    pVar = pVar2;
                    notificationManager = notificationManager3;
                    i11 = 1;
                    pVar.f10976g = pendingIntent2;
                }
            } else {
                pVar = pVar2;
                notificationManager = notificationManager3;
                i11 = 1;
                pVar.f10992w.icon = 17301642;
                pVar.f10992w.tickerText = p.b(resources.getString(R$string.common_google_play_services_notification_ticker));
                pVar.f10992w.when = System.currentTimeMillis();
                pVar.f10976g = pendingIntent2;
                pVar.f10975f = p.b(str2);
            }
            if (!g.a()) {
                notificationManager2 = notificationManager;
            } else {
                j.i(g.a());
                synchronized (f15287c) {
                }
                notificationManager2 = notificationManager;
                NotificationChannel notificationChannel = notificationManager2.getNotificationChannel("com.google.android.gms.availability");
                String string2 = context.getResources().getString(R$string.common_google_play_services_notification_channel_name);
                if (notificationChannel == null) {
                    notificationManager2.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string2, 4));
                } else if (!string2.contentEquals(notificationChannel.getName())) {
                    notificationChannel.setName(string2);
                    notificationManager2.createNotificationChannel(notificationChannel);
                }
                pVar.f10990u = "com.google.android.gms.availability";
            }
            Notification a10 = pVar.a();
            if (i13 == i11 || i13 == 2 || i13 == 3) {
                d.f15292a.set(false);
                i12 = 10436;
            } else {
                i12 = 39789;
            }
            notificationManager2.notify(i12, a10);
        }
    }

    public final void i(Activity activity, w6.g gVar, int i10, j1 j1Var) {
        AlertDialog f10 = f(activity, i10, new s(super.a(i10, activity, "d"), gVar), j1Var);
        if (f10 != null) {
            g(activity, f10, "GooglePlayServicesErrorDialog", j1Var);
        }
    }
}
