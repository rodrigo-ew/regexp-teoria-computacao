package edu.ufpa.regexp.validator;

import lombok.RequiredArgsConstructor;

import java.util.regex.*;

@RequiredArgsConstructor
public class RegexValidatorQ1 {

    private final Pattern namePattern = Pattern.compile("([A-Z][a-z]+\\s)([A-Z][a-z]+\\s)?([A-Z][a-z]+)");
    private final Pattern mailPattern = Pattern.compile("[a-z]+@[a-z]+(\\.com\\.br|\\.br)");
    private final Pattern passwordPattern = Pattern.compile("(?=.*[0-9])(?=.*[A-Z])[A-Za-z0-9]{8}");
    private final Pattern realNumber = Pattern.compile("^[+\\-]?[0-9]+(\\.[0-9]+)?$");
    private final Pattern CPFPattern = Pattern.compile("([0-9]{3}\\.){2}[0-9]{3}\\-[0-9]{2}");
    private final Pattern phonePattern = Pattern.compile("(\\([0-9]{2}\\)\\s9[0-9]{4}\\-?[0-9]{4})|([0-9]{2}\\s9[0-9]{8})");
    private final Pattern dateTimePattern = Pattern.compile("[0-9]{2}\\/[0-9]{2}\\/[0-9]{4}\\s[0-9]{2}\\:[0-9]{2}\\:[0-9]{2}");

    public Boolean matchesName(String string) {
        return namePattern.matcher(string).matches();
    }

    public Boolean matchesMail(String string) {
        return mailPattern.matcher(string).matches();
    }

    public Boolean matchesDateTime(String string) {return dateTimePattern.matcher(string).matches(); }
    public Boolean matchesRealNumber(String string) { return realNumber.matcher(string).matches(); }

    public Boolean matchesPassword(String string) {
        return passwordPattern.matcher(string).matches();
    }

    public Boolean matchesCPF(String string) {
        return CPFPattern.matcher(string).matches();
    }

    public Boolean matchesPhone(String string) {
        return phonePattern.matcher(string).matches();
    }
}


