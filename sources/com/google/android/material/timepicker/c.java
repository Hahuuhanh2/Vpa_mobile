package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: TimePickerView */
public final class c extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TimePickerView f7154a;

    public c(TimePickerView timePickerView) {
        this.f7154a = timePickerView;
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        TimePickerView timePickerView = this.f7154a;
        int i10 = TimePickerView.f7149y;
        timePickerView.getClass();
        return false;
    }
}
