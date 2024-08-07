package c0;

import androidx.camera.core.impl.h;
import f0.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: CaptureBundles */
public final class w implements v {

    /* renamed from: a  reason: collision with root package name */
    public final List<h> f4364a;

    public w(List<h> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("Cannot set an empty CaptureStage list.");
        }
        this.f4364a = Collections.unmodifiableList(new ArrayList(list));
    }

    public final List<h> a() {
        return this.f4364a;
    }
}
