package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import c0.q0;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.EnhancedIntentService;
import com.google.firebase.messaging.c;
import java.util.concurrent.Executor;
import v.i;

/* compiled from: WithinAppServiceBinder */
public final class b extends Binder {

    /* renamed from: a  reason: collision with root package name */
    public final a f7614a;

    /* compiled from: WithinAppServiceBinder */
    public interface a {
    }

    public b(EnhancedIntentService.a aVar) {
        this.f7614a = aVar;
    }

    public final void a(c.a aVar) {
        if (Binder.getCallingUid() == Process.myUid()) {
            Log.isLoggable("FirebaseMessaging", 3);
            a aVar2 = this.f7614a;
            Intent intent = aVar.f7621a;
            EnhancedIntentService enhancedIntentService = EnhancedIntentService.this;
            int i10 = EnhancedIntentService.f7575f;
            enhancedIntentService.getClass();
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            enhancedIntentService.f7576a.execute(new i(6, enhancedIntentService, intent, taskCompletionSource));
            taskCompletionSource.getTask().addOnCompleteListener((Executor) new n.a(4), new q0(aVar, 0));
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
