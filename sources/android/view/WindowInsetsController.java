package android.view;

import android.annotation.NonNull;

public /* synthetic */ interface WindowInsetsController {

    public /* synthetic */ interface OnControllableInsetsChangedListener {
        static {
            throw new NoClassDefFoundError();
        }
    }

    static {
        throw new NoClassDefFoundError();
    }

    /* synthetic */ void addOnControllableInsetsChangedListener(@NonNull OnControllableInsetsChangedListener onControllableInsetsChangedListener);

    /* synthetic */ int getSystemBarsAppearance();

    /* synthetic */ void hide(int i10);

    /* synthetic */ void removeOnControllableInsetsChangedListener(@NonNull OnControllableInsetsChangedListener onControllableInsetsChangedListener);

    /* synthetic */ void setSystemBarsAppearance(int i10, int i11);

    /* synthetic */ void show(int i10);
}
