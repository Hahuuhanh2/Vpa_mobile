package org.threeten.bp.zone;

import org.threeten.bp.DateTimeException;

public class ZoneRulesException extends DateTimeException {
    public ZoneRulesException(String str) {
        super(str);
    }

    public ZoneRulesException(String str, Exception exc) {
        super(str, exc);
    }
}
