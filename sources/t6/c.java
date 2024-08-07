package t6;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.cloudmessaging.zzd;
import com.google.android.gms.internal.cloudmessaging.zzf;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.regex.Matcher;
import v0.h;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
public final class c extends zzf {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f14845a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(a aVar, Looper looper) {
        super(looper);
        this.f14845a = aVar;
    }

    public final void handleMessage(Message message) {
        a aVar = this.f14845a;
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new e());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof zzd) {
                        aVar.f14844g = (zzd) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        aVar.f14843f = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if ("com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                    String stringExtra = intent2.getStringExtra("registration_id");
                    if (stringExtra == null) {
                        stringExtra = intent2.getStringExtra("unregistered");
                    }
                    if (stringExtra == null) {
                        String stringExtra2 = intent2.getStringExtra("error");
                        if (stringExtra2 == null) {
                            new StringBuilder(String.valueOf(intent2.getExtras()).length() + 49);
                            return;
                        }
                        if (Log.isLoggable("Rpc", 3) && stringExtra2.length() != 0) {
                            "Received InstanceID error ".concat(stringExtra2);
                        }
                        if (stringExtra2.startsWith("|")) {
                            String[] split = stringExtra2.split("\\|");
                            if (split.length > 2 && "ID".equals(split[1])) {
                                String str = split[2];
                                String str2 = split[3];
                                if (str2.startsWith(":")) {
                                    str2 = str2.substring(1);
                                }
                                aVar.b(intent2.putExtra("error", str2).getExtras(), str);
                            } else if (stringExtra2.length() != 0) {
                                "Unexpected structured response ".concat(stringExtra2);
                            }
                        } else {
                            synchronized (aVar.f14838a) {
                                int i10 = 0;
                                while (true) {
                                    h<String, TaskCompletionSource<Bundle>> hVar = aVar.f14838a;
                                    if (i10 < hVar.f16007c) {
                                        aVar.b(intent2.getExtras(), hVar.i(i10));
                                        i10++;
                                    }
                                }
                            }
                        }
                    } else {
                        Matcher matcher = a.f14837j.matcher(stringExtra);
                        if (matcher.matches()) {
                            String group = matcher.group(1);
                            String group2 = matcher.group(2);
                            if (group != null) {
                                Bundle extras = intent2.getExtras();
                                extras.putString("registration_id", group2);
                                aVar.b(extras, group);
                            }
                        } else if (Log.isLoggable("Rpc", 3) && stringExtra.length() != 0) {
                            "Unexpected response string: ".concat(stringExtra);
                        }
                    }
                } else if (Log.isLoggable("Rpc", 3)) {
                    String valueOf = String.valueOf(action);
                    if (valueOf.length() != 0) {
                        "Unexpected response action: ".concat(valueOf);
                    }
                }
            }
        }
    }
}
