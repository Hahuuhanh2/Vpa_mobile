package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.R$id;
import com.google.android.material.R$layout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;

class TimePickerView extends ConstraintLayout {

    /* renamed from: y  reason: collision with root package name */
    public static final /* synthetic */ int f7149y = 0;

    /* renamed from: x  reason: collision with root package name */
    public final Chip f7150x;

    public class a implements View.OnClickListener {
        public a() {
        }

        public final void onClick(View view) {
            TimePickerView timePickerView = TimePickerView.this;
            int i10 = TimePickerView.f7149y;
            timePickerView.getClass();
        }
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (view == this && i10 == 0) {
            this.f7150x.sendAccessibilityEvent(8);
        }
    }

    public TimePickerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a aVar = new a();
        LayoutInflater.from(context).inflate(R$layout.material_timepicker, this);
        ClockFaceView clockFaceView = (ClockFaceView) findViewById(R$id.material_clock_face);
        ((MaterialButtonToggleGroup) findViewById(R$id.material_clock_period_toggle)).f5899c.add(new b(this));
        Chip chip = (Chip) findViewById(R$id.material_minute_tv);
        Chip chip2 = (Chip) findViewById(R$id.material_hour_tv);
        this.f7150x = chip2;
        ClockHandView clockHandView = (ClockHandView) findViewById(R$id.material_clock_hand);
        d dVar = new d(new GestureDetector(getContext(), new c(this)));
        chip.setOnTouchListener(dVar);
        chip2.setOnTouchListener(dVar);
        int i11 = R$id.selection_type;
        chip.setTag(i11, 12);
        chip2.setTag(i11, 10);
        chip.setOnClickListener(aVar);
        chip2.setOnClickListener(aVar);
        chip.setAccessibilityClassName("android.view.View");
        chip2.setAccessibilityClassName("android.view.View");
    }
}
