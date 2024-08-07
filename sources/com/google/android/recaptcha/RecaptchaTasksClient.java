package com.google.android.recaptcha;

import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public interface RecaptchaTasksClient {
    Task<String> executeTask(RecaptchaAction recaptchaAction);

    Task<String> executeTask(RecaptchaAction recaptchaAction, long j10);
}
