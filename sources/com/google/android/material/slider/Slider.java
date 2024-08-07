package com.google.android.material.slider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.google.android.material.R$attr;

public class Slider extends BaseSlider<Slider, Object, Object> {
    public Slider(Context context) {
        this(context, (AttributeSet) null);
    }

    public /* bridge */ /* synthetic */ CharSequence getAccessibilityClassName() {
        return super.getAccessibilityClassName();
    }

    public /* bridge */ /* synthetic */ int getActiveThumbIndex() {
        return super.getActiveThumbIndex();
    }

    public /* bridge */ /* synthetic */ int getFocusedThumbIndex() {
        return super.getFocusedThumbIndex();
    }

    public /* bridge */ /* synthetic */ int getHaloRadius() {
        return super.getHaloRadius();
    }

    public /* bridge */ /* synthetic */ ColorStateList getHaloTintList() {
        return super.getHaloTintList();
    }

    public /* bridge */ /* synthetic */ int getLabelBehavior() {
        return super.getLabelBehavior();
    }

    public /* bridge */ /* synthetic */ float getStepSize() {
        return super.getStepSize();
    }

    public /* bridge */ /* synthetic */ float getThumbElevation() {
        return super.getThumbElevation();
    }

    public /* bridge */ /* synthetic */ int getThumbRadius() {
        return super.getThumbRadius();
    }

    public /* bridge */ /* synthetic */ ColorStateList getThumbStrokeColor() {
        return super.getThumbStrokeColor();
    }

    public /* bridge */ /* synthetic */ float getThumbStrokeWidth() {
        return super.getThumbStrokeWidth();
    }

    public /* bridge */ /* synthetic */ ColorStateList getThumbTintList() {
        return super.getThumbTintList();
    }

    public /* bridge */ /* synthetic */ int getTickActiveRadius() {
        return super.getTickActiveRadius();
    }

    public /* bridge */ /* synthetic */ ColorStateList getTickActiveTintList() {
        return super.getTickActiveTintList();
    }

    public /* bridge */ /* synthetic */ int getTickInactiveRadius() {
        return super.getTickInactiveRadius();
    }

    public /* bridge */ /* synthetic */ ColorStateList getTickInactiveTintList() {
        return super.getTickInactiveTintList();
    }

    public /* bridge */ /* synthetic */ ColorStateList getTickTintList() {
        return super.getTickTintList();
    }

    public /* bridge */ /* synthetic */ ColorStateList getTrackActiveTintList() {
        return super.getTrackActiveTintList();
    }

    public /* bridge */ /* synthetic */ int getTrackHeight() {
        return super.getTrackHeight();
    }

    public /* bridge */ /* synthetic */ ColorStateList getTrackInactiveTintList() {
        return super.getTrackInactiveTintList();
    }

    public /* bridge */ /* synthetic */ int getTrackSidePadding() {
        return super.getTrackSidePadding();
    }

    public /* bridge */ /* synthetic */ ColorStateList getTrackTintList() {
        return super.getTrackTintList();
    }

    public /* bridge */ /* synthetic */ int getTrackWidth() {
        return super.getTrackWidth();
    }

    public float getValue() {
        return getValues().get(0).floatValue();
    }

    public /* bridge */ /* synthetic */ float getValueFrom() {
        return super.getValueFrom();
    }

    public /* bridge */ /* synthetic */ float getValueTo() {
        return super.getValueTo();
    }

    public final boolean o() {
        if (getActiveThumbIndex() != -1) {
            return true;
        }
        setActiveThumbIndex(0);
        return true;
    }

    public void setCustomThumbDrawable(int i10) {
        super.setCustomThumbDrawable(i10);
    }

    public /* bridge */ /* synthetic */ void setEnabled(boolean z10) {
        super.setEnabled(z10);
    }

    public /* bridge */ /* synthetic */ void setFocusedThumbIndex(int i10) {
        super.setFocusedThumbIndex(i10);
    }

    public /* bridge */ /* synthetic */ void setHaloRadius(int i10) {
        super.setHaloRadius(i10);
    }

    public /* bridge */ /* synthetic */ void setHaloRadiusResource(int i10) {
        super.setHaloRadiusResource(i10);
    }

    public /* bridge */ /* synthetic */ void setHaloTintList(ColorStateList colorStateList) {
        super.setHaloTintList(colorStateList);
    }

    public /* bridge */ /* synthetic */ void setLabelBehavior(int i10) {
        super.setLabelBehavior(i10);
    }

    public /* bridge */ /* synthetic */ void setLabelFormatter(d dVar) {
        super.setLabelFormatter(dVar);
    }

    public /* bridge */ /* synthetic */ void setStepSize(float f10) {
        super.setStepSize(f10);
    }

    public /* bridge */ /* synthetic */ void setThumbElevation(float f10) {
        super.setThumbElevation(f10);
    }

    public /* bridge */ /* synthetic */ void setThumbElevationResource(int i10) {
        super.setThumbElevationResource(i10);
    }

    public /* bridge */ /* synthetic */ void setThumbRadius(int i10) {
        super.setThumbRadius(i10);
    }

    public /* bridge */ /* synthetic */ void setThumbRadiusResource(int i10) {
        super.setThumbRadiusResource(i10);
    }

    public /* bridge */ /* synthetic */ void setThumbStrokeColor(ColorStateList colorStateList) {
        super.setThumbStrokeColor(colorStateList);
    }

    public /* bridge */ /* synthetic */ void setThumbStrokeColorResource(int i10) {
        super.setThumbStrokeColorResource(i10);
    }

    public /* bridge */ /* synthetic */ void setThumbStrokeWidth(float f10) {
        super.setThumbStrokeWidth(f10);
    }

    public /* bridge */ /* synthetic */ void setThumbStrokeWidthResource(int i10) {
        super.setThumbStrokeWidthResource(i10);
    }

    public /* bridge */ /* synthetic */ void setThumbTintList(ColorStateList colorStateList) {
        super.setThumbTintList(colorStateList);
    }

    public /* bridge */ /* synthetic */ void setTickActiveRadius(int i10) {
        super.setTickActiveRadius(i10);
    }

    public /* bridge */ /* synthetic */ void setTickActiveTintList(ColorStateList colorStateList) {
        super.setTickActiveTintList(colorStateList);
    }

    public /* bridge */ /* synthetic */ void setTickInactiveRadius(int i10) {
        super.setTickInactiveRadius(i10);
    }

    public /* bridge */ /* synthetic */ void setTickInactiveTintList(ColorStateList colorStateList) {
        super.setTickInactiveTintList(colorStateList);
    }

    public /* bridge */ /* synthetic */ void setTickTintList(ColorStateList colorStateList) {
        super.setTickTintList(colorStateList);
    }

    public /* bridge */ /* synthetic */ void setTickVisible(boolean z10) {
        super.setTickVisible(z10);
    }

    public /* bridge */ /* synthetic */ void setTrackActiveTintList(ColorStateList colorStateList) {
        super.setTrackActiveTintList(colorStateList);
    }

    public /* bridge */ /* synthetic */ void setTrackHeight(int i10) {
        super.setTrackHeight(i10);
    }

    public /* bridge */ /* synthetic */ void setTrackInactiveTintList(ColorStateList colorStateList) {
        super.setTrackInactiveTintList(colorStateList);
    }

    public /* bridge */ /* synthetic */ void setTrackTintList(ColorStateList colorStateList) {
        super.setTrackTintList(colorStateList);
    }

    public void setValue(float f10) {
        setValues(Float.valueOf(f10));
    }

    public /* bridge */ /* synthetic */ void setValueFrom(float f10) {
        super.setValueFrom(f10);
    }

    public /* bridge */ /* synthetic */ void setValueTo(float f10) {
        super.setValueTo(f10);
    }

    public Slider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.sliderStyle);
    }

    public void setCustomThumbDrawable(Drawable drawable) {
        super.setCustomThumbDrawable(drawable);
    }

    public Slider(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842788});
        if (obtainStyledAttributes.hasValue(0)) {
            setValue(obtainStyledAttributes.getFloat(0, 0.0f));
        }
        obtainStyledAttributes.recycle();
    }
}