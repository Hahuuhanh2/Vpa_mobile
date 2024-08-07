package androidx.camera.core;

import v8.a;

public interface CameraControl {

    public static final class OperationCanceledException extends Exception {
        public OperationCanceledException(String str) {
            super(str);
        }
    }

    a<Void> f(boolean z10);
}
