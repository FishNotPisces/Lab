package Tools;

public class Meth {
    public static int numberOfDigits(int num) {
        int digits;
        if (num >= 1000_000L /* 6 zeri */) {
            if (num >= 100_000_000L /* 8 zeri */) {
                if (num >= 1000_000_000L /* 9 zeri */) {
                    if (num >= 10_000_000_000L /* 10 zeri */) {
                        digits = 10;
                    }
                    else {
                        digits = 9;
                    }
                }
                else {
                    digits = 8;
                }
            }
            else if (num >= 1000_000L /* 6 zeri */) {
                digits = 7;
            }
            else {
                digits = 6;
            } 
        }
        else if (num >= 1000L /* 3 zeri */) {
            if (num >= 10_000L /* 4 zeri */) {
                digits = 5;
            }
            else {
                digits = 4;
            }
        }
        else if (num >= 10L /* 1 zero */) {
            if (num >= 100L /* 2 zero */) {
                digits = 3;
            }
            else {
                digits = 2;
            }
        }
        else {
            digits = 1;
        }
        return digits;
    }

    public static int numberOfDigits(long num) {
        int digits;
        if (num >= 10_000_000_000L /* 10 zeri */) {
            if (num >= 1000_000_000_000_000L /* 15 zeri */) {
                if (num >= 100_000_000_000_000_000L /* 17 zeri */) {
                    if (num >= 1000_000_000_000_000_000L /* 18 zeri */) {
                        digits = 19;
                    }
                    else {
                        digits = 18;
                    }
                }
                else if (num >= 10_000_000_000_000_000L /* 16 zeri */) {
                    digits = 17;
                }
                else {
                    digits = 16;
                } 
            }
            else if (num >= 1000_000_000_000L /* 12 zeri */) {
                if (num >= 10_000_000_000_000L /* 13 zeri */) {
                    if (num >= 100_000_000_000_000L /* 14 zeri */) {
                        digits = 15;
                    }
                    else {
                        digits = 14;
                    }
                }
                else {
                    digits = 13;
                }
            }
            else if (num >= 100_000_000_000L /* 11 zeri */) {
                digits = 12;
            }
            else {
                digits = 11;
            }
        }
        else if (num >= 100_000L /* 5 zeri */) {
            if (num >= 10_000_000L /* 7 zeri */) {
                if (num >= 100_000_000L /* 8 zeri */) {
                    if (num >= 1000_000_000L /* 9 zeri */) {
                        digits = 10;
                    }
                    else {
                        digits = 9;
                    }
                }
                else {
                    digits = 8;
                }
            }
            else if (num >= 1000_000L /* 6 zeri */) {
                digits = 7;
            }
            else {
                digits = 6;
            } 
        }
        else if (num >= 1000L /* 3 zeri */) {
            if (num >= 10_000L /* 4 zeri */) {
                digits = 5;
            }
            else {
                digits = 4;
            }
        }
        else if (num >= 10L /* 1 zero */) {
            if (num >= 100L /* 2 zero */) {
                digits = 3;
            }
            else {
                digits = 2;
            }
        }
        else {
            digits = 1;
        }
        return digits;
    }
}
