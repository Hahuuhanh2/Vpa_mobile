package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
final class zzt implements Executor {
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
