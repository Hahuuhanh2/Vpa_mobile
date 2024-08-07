package com.google.android.gms.common.images;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import com.google.android.gms.common.annotation.KeepName;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class ImageManager {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f5375a = new Object();

    @KeepName
    /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
    public final class ImageReceiver extends ResultReceiver {
        public final void onReceiveResult(int i10, Bundle bundle) {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) bundle.getParcelable("com.google.android.gms.extra.fileDescriptor");
            Object obj = ImageManager.f5375a;
            throw null;
        }
    }

    static {
        new HashSet();
    }
}
