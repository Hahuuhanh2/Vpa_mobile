package com.google.android.flexbox;

import android.view.View;
import java.util.List;

/* compiled from: FlexContainer */
public interface a {
    void b(View view, int i10, int i11, b bVar);

    void c(b bVar);

    View d(int i10);

    int e(int i10, int i11, int i12);

    void f(int i10, View view);

    View g(int i10);

    int getAlignContent();

    int getAlignItems();

    int getFlexDirection();

    int getFlexItemCount();

    List<b> getFlexLinesInternal();

    int getFlexWrap();

    int getLargestMainSize();

    int getMaxLine();

    int getPaddingBottom();

    int getPaddingEnd();

    int getPaddingLeft();

    int getPaddingRight();

    int getPaddingStart();

    int getPaddingTop();

    int getSumOfCrossSize();

    int h(View view, int i10, int i11);

    int i(int i10, int i11, int i12);

    boolean j();

    int k(View view);

    void setFlexLines(List<b> list);
}
