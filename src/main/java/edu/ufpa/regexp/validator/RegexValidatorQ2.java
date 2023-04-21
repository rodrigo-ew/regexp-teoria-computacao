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

    private final Pattern patternF = Pattern.compile("[(HH)(MM)]]m*h?(m+h?)*");

    private final Pattern patternG = Pattern.compile("(?!.*hhh)[HM]+[hm]*");

    public Boolean matchesPatternA(String string) { return patternA.matcher(string).matches(); }

    public Boolean matchesPatternB(String string) { return patternB.matcher(string).matches(); }

    public Boolean matchesPatternC(String string) { return patternC.matcher(string).matches(); }

    public Boolean matchesPatternD(String string) { return patternD.matcher(string).matches(); }

    public Boolean matchesPatternE(String string) { return patternE.matcher(string).matches(); }

    public Boolean matchesPatternF(String string) { return patternF.matcher(string).matches(); }

    public Boolean matchesPatternG(String string) { return patternG.matcher(string).matches(); }
}
