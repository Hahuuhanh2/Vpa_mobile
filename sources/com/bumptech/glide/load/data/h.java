package com.bumptech.glide.load.data;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;

/* compiled from: FileDescriptorAssetPathFetcher */
public final class h extends b<AssetFileDescriptor> {
    public h(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    public final Class<AssetFileDescriptor> a() {
        return AssetFileDescriptor.class;
    }

    public final void c(Object obj) {
        ((AssetFileDescriptor) obj).close();
    }

    public final Object f(AssetManager assetManager, String str) {
        return assetManager.openFd(str);
    }
}
