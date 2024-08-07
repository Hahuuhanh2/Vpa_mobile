package com.bumptech.glide;

import com.bumptech.glide.m;
import m5.c;
import m5.e;

/* compiled from: TransitionOptions */
public abstract class m<CHILD extends m<CHILD, TranscodeType>, TranscodeType> implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    public e<? super TranscodeType> f5004a = c.f13141b;

    /* renamed from: a */
    public final CHILD clone() {
        try {
            return (m) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }
}
