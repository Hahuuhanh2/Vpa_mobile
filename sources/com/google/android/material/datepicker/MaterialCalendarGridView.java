package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.google.android.material.R$attr;
import com.google.android.material.R$id;
import com.google.android.material.internal.x;
import java.util.Calendar;
import java.util.Iterator;
import v1.c;
import w1.d0;
import x1.f;

final class MaterialCalendarGridView extends GridView {

    /* renamed from: a  reason: collision with root package name */
    public final Calendar f6095a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f6096b;

    public class a extends w1.a {
        public final void d(View view, f fVar) {
            this.f16280a.onInitializeAccessibilityNodeInfo(view, fVar.f16862a);
            fVar.f16862a.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) null);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final v getAdapter() {
        return (v) super.getAdapter();
    }

    public final View b(int i10) {
        return getChildAt(i10 - getFirstVisiblePosition());
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    public final void onDraw(Canvas canvas) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z11;
        boolean z12;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        v a10 = getAdapter();
        DateSelector<?> dateSelector = a10.f6216b;
        b bVar = a10.f6218d;
        int max = Math.max(a10.b(), getFirstVisiblePosition());
        int min = Math.min((a10.b() + a10.f6215a.f6101e) - 1, getLastVisiblePosition());
        Long c10 = a10.getItem(max);
        Long c11 = a10.getItem(min);
        Iterator it = dateSelector.s().iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            F f10 = cVar.f16012a;
            if (f10 == null) {
                materialCalendarGridView = this;
            } else if (cVar.f16013b != null) {
                long longValue = ((Long) f10).longValue();
                long longValue2 = ((Long) cVar.f16013b).longValue();
                Long valueOf = Long.valueOf(longValue);
                Long valueOf2 = Long.valueOf(longValue2);
                if (c10 == null || c11 == null || valueOf == null || valueOf2 == null || valueOf.longValue() > c11.longValue() || valueOf2.longValue() < c10.longValue()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    boolean g2 = x.g(this);
                    if (longValue < c10.longValue()) {
                        if (max % a10.f6215a.f6100d == 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            i11 = 0;
                        } else if (!g2) {
                            i11 = materialCalendarGridView.b(max - 1).getRight();
                        } else {
                            i11 = materialCalendarGridView.b(max - 1).getLeft();
                        }
                        i10 = max;
                    } else {
                        materialCalendarGridView.f6095a.setTimeInMillis(longValue);
                        i10 = a10.b() + (materialCalendarGridView.f6095a.get(5) - 1);
                        View b10 = materialCalendarGridView.b(i10);
                        i11 = (b10.getWidth() / 2) + b10.getLeft();
                    }
                    if (longValue2 > c11.longValue()) {
                        if ((min + 1) % a10.f6215a.f6100d == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            i13 = getWidth();
                        } else if (!g2) {
                            i13 = materialCalendarGridView.b(min).getRight();
                        } else {
                            i13 = materialCalendarGridView.b(min).getLeft();
                        }
                        i12 = min;
                    } else {
                        materialCalendarGridView.f6095a.setTimeInMillis(longValue2);
                        i12 = a10.b() + (materialCalendarGridView.f6095a.get(5) - 1);
                        View b11 = materialCalendarGridView.b(i12);
                        i13 = (b11.getWidth() / 2) + b11.getLeft();
                    }
                    int itemId = (int) a10.getItemId(i10);
                    int i18 = max;
                    int i19 = min;
                    int itemId2 = (int) a10.getItemId(i12);
                    while (itemId <= itemId2) {
                        int numColumns = getNumColumns() * itemId;
                        int numColumns2 = (getNumColumns() + numColumns) - 1;
                        View b12 = materialCalendarGridView.b(numColumns);
                        int top = b12.getTop() + ((a) bVar.f6120a).f6110a.top;
                        v vVar = a10;
                        int bottom = b12.getBottom() - ((a) bVar.f6120a).f6110a.bottom;
                        if (!g2) {
                            if (numColumns > i10) {
                                i15 = 0;
                            } else {
                                i15 = i11;
                            }
                            if (i12 > numColumns2) {
                                i14 = getWidth();
                            } else {
                                i14 = i13;
                            }
                        } else {
                            if (i12 > numColumns2) {
                                i16 = 0;
                            } else {
                                i16 = i13;
                            }
                            if (numColumns > i10) {
                                i17 = getWidth();
                            } else {
                                i17 = i11;
                            }
                            int i20 = i16;
                            i14 = i17;
                            i15 = i20;
                        }
                        canvas.drawRect((float) i15, (float) top, (float) i14, (float) bottom, (Paint) bVar.f6127h);
                        itemId++;
                        materialCalendarGridView = this;
                        it = it;
                        a10 = vVar;
                    }
                    materialCalendarGridView = this;
                    max = i18;
                    min = i19;
                }
            }
        }
    }

    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        if (!z10) {
            super.onFocusChanged(false, i10, rect);
        } else if (i10 == 33) {
            v a10 = getAdapter();
            setSelection((a10.b() + a10.f6215a.f6101e) - 1);
        } else if (i10 == 130) {
            setSelection(getAdapter().b());
        } else {
            super.onFocusChanged(true, i10, rect);
        }
    }

    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (!super.onKeyDown(i10, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().b()) {
            return true;
        }
        if (19 != i10) {
            return false;
        }
        setSelection(getAdapter().b());
        return true;
    }

    public final void onMeasure(int i10, int i11) {
        if (this.f6096b) {
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        super.onMeasure(i10, i11);
    }

    public final void setSelection(int i10) {
        if (i10 < getAdapter().b()) {
            super.setSelection(getAdapter().b());
        } else {
            super.setSelection(i10);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f6095a = f0.i((Calendar) null);
        if (r.q0(getContext())) {
            setNextFocusLeftId(R$id.cancel_button);
            setNextFocusRightId(R$id.confirm_button);
        }
        this.f6096b = r.r0(getContext(), R$attr.nestedScrollable);
        d0.o(this, new a());
    }

    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof v) {
            super.setAdapter(listAdapter);
        } else {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", new Object[]{MaterialCalendarGridView.class.getCanonicalName(), v.class.getCanonicalName()}));
        }
    }
}
