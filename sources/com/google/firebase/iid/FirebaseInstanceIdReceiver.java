package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.cloudmessaging.CloudMessagingReceiver;
import com.google.android.gms.tasks.Tasks;
import fb.j;
import fb.p;
import java.util.concurrent.ExecutionException;

public final class FirebaseInstanceIdReceiver extends CloudMessagingReceiver {
    public final int a(Context context, CloudMessage cloudMessage) {
        try {
            return ((Integer) Tasks.await(new j(context).b(cloudMessage.f5316a))).intValue();
        } catch (InterruptedException | ExecutionException unused) {
            return 500;
        }
    }

    public final void b(Bundle bundle) {
        Intent putExtras = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(bundle);
        if (p.b(putExtras)) {
            p.a(putExtras.getExtras(), "_nd");
        }
    }
}
