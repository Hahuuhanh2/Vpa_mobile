package io.reactivex.rxjava3.exceptions;

public final class OnErrorNotImplementedException extends RuntimeException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OnErrorNotImplementedException(Throwable th2) {
        super("The exception was not handled due to missing onError handler in the subscribe() method call. Further reading: https://github.com/ReactiveX/RxJava/wiki/Error-Handling | " + th2, th2 == null ? new NullPointerException() : th2);
    }
}
