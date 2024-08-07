package w6;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.internal.GenericIdpActivity;
import com.google.firebase.auth.internal.RecaptchaActivity;
import java.util.List;
import k1.a;
import s1.d;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class r implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16650a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f16651b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f16652c;

    public /* synthetic */ r(FragmentActivity fragmentActivity, String str, int i10) {
        this.f16650a = i10;
        this.f16651b = fragmentActivity;
        this.f16652c = str;
    }

    public final void onComplete(Task task) {
        switch (this.f16650a) {
            case 0:
                ((s) this.f16652c).f16655b.remove((TaskCompletionSource) this.f16651b);
                return;
            case 1:
                Intent intent = new Intent("android.intent.action.VIEW");
                GenericIdpActivity genericIdpActivity = (GenericIdpActivity) this.f16651b;
                ResolveInfo resolveActivity = genericIdpActivity.getPackageManager().resolveActivity(intent, 0);
                String str = (String) this.f16652c;
                if (resolveActivity != null) {
                    List<ResolveInfo> queryIntentServices = genericIdpActivity.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
                    if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                        Intent intent2 = new Intent("android.intent.action.VIEW", (Uri) task.getResult());
                        intent2.putExtra("com.android.browser.application_id", str);
                        intent2.addFlags(1073741824);
                        intent2.addFlags(268435456);
                        genericIdpActivity.startActivity(intent2);
                        return;
                    }
                    Intent intent3 = new Intent("android.intent.action.VIEW");
                    if (!intent3.hasExtra("android.support.customtabs.extra.SESSION")) {
                        Bundle bundle = new Bundle();
                        d.b(bundle, "android.support.customtabs.extra.SESSION", (IBinder) null);
                        intent3.putExtras(bundle);
                    }
                    intent3.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
                    intent3.putExtras(new Bundle());
                    intent3.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
                    intent3.setData((Uri) task.getResult());
                    a.startActivity(genericIdpActivity, intent3, (Bundle) null);
                    return;
                }
                genericIdpActivity.zze(str, (Status) null);
                return;
            default:
                RecaptchaActivity recaptchaActivity = (RecaptchaActivity) this.f16651b;
                String str2 = (String) this.f16652c;
                recaptchaActivity.getClass();
                if (recaptchaActivity.getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW"), 0) != null) {
                    List<ResolveInfo> queryIntentServices2 = recaptchaActivity.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
                    if (queryIntentServices2 == null || queryIntentServices2.isEmpty()) {
                        Intent intent4 = new Intent("android.intent.action.VIEW", (Uri) task.getResult());
                        intent4.putExtra("com.android.browser.application_id", str2);
                        intent4.addFlags(1073741824);
                        intent4.addFlags(268435456);
                        recaptchaActivity.startActivity(intent4);
                        return;
                    }
                    Intent intent5 = new Intent("android.intent.action.VIEW");
                    if (!intent5.hasExtra("android.support.customtabs.extra.SESSION")) {
                        Bundle bundle2 = new Bundle();
                        d.b(bundle2, "android.support.customtabs.extra.SESSION", (IBinder) null);
                        intent5.putExtras(bundle2);
                    }
                    intent5.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
                    intent5.putExtras(new Bundle());
                    intent5.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
                    intent5.addFlags(1073741824);
                    intent5.addFlags(268435456);
                    intent5.setData((Uri) task.getResult());
                    a.startActivity(recaptchaActivity, intent5, (Bundle) null);
                    return;
                }
                recaptchaActivity.zze(str2, (Status) null);
                return;
        }
    }

    public r(s sVar, TaskCompletionSource taskCompletionSource) {
        this.f16650a = 0;
        this.f16652c = sVar;
        this.f16651b = taskCompletionSource;
    }
}
