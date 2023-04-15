package edu.ufpa.regexp.validator;

import lombok.RequiredArgsConstructor;

import java.util.regex.Pattern;

@RequiredArgsConstructor
public class RegexValidatorQ2 {

    private final Pattern pattern1 = Pattern.compile("[(HM)(MH)][([hm]*m[hm]*m[hm]*)([hm]*h[hm]*)((?=m*hm*h[hm]*)[hm]{3}[hm]*)]]");
}
