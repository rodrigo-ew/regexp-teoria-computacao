package edu.ufpa.regexp.validator;

import lombok.RequiredArgsConstructor;

import java.util.regex.Pattern;

@RequiredArgsConstructor
public class RegexValidatorQ2 {

    private final Pattern patternA = Pattern.compile("[(HM)(MH)][([hm]*m[hm]*m[hm]*)([hm]*h[hm]*)((?=m*hm*h[hm]*)[hm]{3}[hm]*)]]");

    private final Pattern patternB = Pattern.compile("[(HM)(MH)]h*m(h*mh*m)*h*");

    private final Pattern patternC = Pattern.compile("[(HM)(MH)]m[hm]*h");

    private final Pattern patternD = Pattern.compile("[(HH)(MM)][(hm)(mh)][hm]{2}[hm]*[(hm)(mh)]]");

    private final Pattern patternE = Pattern.compile("[(HH)(MM)][((hm)*h?)((mh)*m?)]");

    private final Pattern patternF = Pattern.compile("[(HH)(MM)]]");

    private final Pattern patternG;
}
