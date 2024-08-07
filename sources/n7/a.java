package n7;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.common.R$string;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
public final class a {
    public static String a(Context context) {
        try {
            return context.getResources().getResourcePackageName(R$string.common_google_play_services_unknown_issue);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }
}
