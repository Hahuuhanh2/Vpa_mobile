package com.google.android.gms.common.api;

import com.google.android.gms.common.Feature;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
public final class UnsupportedApiCallException extends UnsupportedOperationException {

    /* renamed from: a  reason: collision with root package name */
    public final Feature f5349a;

    public UnsupportedApiCallException(Feature feature) {
        this.f5349a = feature;
    }

    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.f5349a));
    }
}
