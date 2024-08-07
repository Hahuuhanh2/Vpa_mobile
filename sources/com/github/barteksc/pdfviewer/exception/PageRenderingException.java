package com.github.barteksc.pdfviewer.exception;

public class PageRenderingException extends Exception {

    /* renamed from: a  reason: collision with root package name */
    public final int f5096a;

    public PageRenderingException(int i10, Exception exc) {
        super(exc);
        this.f5096a = i10;
    }
}
