package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.datepicker.u;
import java.util.ArrayList;

public interface DateSelector<S> extends Parcelable {
    void F0(long j10);

    int S();

    String c0(Context context);

    int g0(Context context);

    boolean o0();

    String q(Context context);

    ArrayList s();

    ArrayList s0();

    S v0();

    View z(LayoutInflater layoutInflater, ViewGroup viewGroup, CalendarConstraints calendarConstraints, u.a aVar);
}
