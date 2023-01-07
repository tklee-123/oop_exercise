package week06_homework.exercise1_3;

public class MyDate {
    private int year;
    private int month;
    private int day;

    private static final String[] MONTHS =
            {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    private static final int[] DAY_IN_MONTHS =
            {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public boolean isLeapYear(int year) {
        if (this.year % 4 == 0 && this.year%100 != 0 || this.year % 400 == 0) {
            return true;
        }
        return false;
    }

    public boolean isValidDate(int year, int month, int day) {
        if (1 > year && year > 9999) {
            return false;
        }
        if (month < 1 && month > 12) {
            return false;
        }
        if (isLeapYear(year)) {
            if (month == 2) {
                if (day < 1 || day > 29) {
                    return false;
                }
            }
        } else {
            if (day < 1 || day > DAY_IN_MONTHS[month - 1]) {
                return false;
            }
        }
        return true;
    }

    public int getDayOfWeek(int year, int month, int day) {
        int magicCenturyNumber = 6 - 2 * ((year / 100) % 4);
        int lastTwoDigitsOfYear = year % 100;
        int magicYearNumber = lastTwoDigitsOfYear / 4;
        int magicMonthNumber;

        int[] nonLeapYearNumber = {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
        int[] leapYearNumber = {6, 2, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};

        if (isLeapYear(year)) {
            magicMonthNumber = leapYearNumber[month - 1];
        } else {
            magicMonthNumber = nonLeapYearNumber[month - 1];
        }

        int magicDayNumber = day;
        int magicNumber = magicCenturyNumber + lastTwoDigitsOfYear + magicYearNumber + magicMonthNumber + magicDayNumber;

        return magicNumber % 7;
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void setDate(int year, int month, int day) {
        setYear(year);
        setMonth(month);
        setDay(day);
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setYear(int year) {
        if (year < 1 || year > 9999) {
            throw new IllegalArgumentException("Invalid year!");
        }
        this.year = year;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Invalid month!");
        }
        this.month = month;
    }

    public void setDay(int day) {
        if (isLeapYear(this.year)) {
            if (this.month == 2) {
                if (1 > day || day > 29) {
                    throw new IllegalArgumentException("Invalid day!");
                }
            } else {
                if (1 > day || day > DAY_IN_MONTHS[this.month - 1]) {
                    throw new IllegalArgumentException("Invalid day!");
                }
            }
        } else {
            if (1 > day || day > DAY_IN_MONTHS[this.month - 1]) {
                throw new IllegalArgumentException("Invalid day!");
            }
        }
        this.day = day;
    }

    @Override
    public String toString() {
        String[] dayOfWeek =
                {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        StringBuilder description = new StringBuilder();
        description.append(dayOfWeek[getDayOfWeek(this.year, this.month, this.day)])
                .append(" ")
                .append(this.day)
                .append(" ")
                .append(MONTHS[this.month - 1])
                .append(" ")
                .append(this.year);

        return description.toString();
    }

    public MyDate nextDay() {
        if (isLeapYear(this.year)) {
            if (this.month == 2) {
                if (this.day == 29) {
                    int newDay = 1;
                    setDate(year, this.month + 1, newDay);
                } else if (this.day == 28) {
                    setDate(this.year, this.month, this.day + 1);
                } else {
                    setDate(this.year, this.month, this.day + 1);
                }
            } else {
                if (this.day == DAY_IN_MONTHS[this.month - 1]) {
                    int newDay = 1;
                    if (this.month == 12) {
                        int newMonth = 1;
                        if (this.year == 9999) {
                            throw new IllegalArgumentException("Year out of range!");
                        } else {
                            setDate(year + 1, newMonth, newDay);
                        }
                    } else {
                        setDate(year, month + 1, newDay);
                    }
                } else {
                    setDate(year, month, day + 1);
                }
            }
        } else {
            if (this.day == DAY_IN_MONTHS[this.month - 1]) {
                int newDay = 1;
                if (this.month == 12) {
                    int newMonth = 1;
                    if (this.year == 9999) {
                        throw new IllegalArgumentException("Year out of range!");
                    } else {
                        setDate(year + 1, newMonth, newDay);
                    }
                } else {
                    setDate(year, month + 1, newDay);
                }
            } else {
                setDate(year, month, day + 1);
            }
        }
        return this;
    }

    public MyDate nextMonth() {
        if (isLeapYear(this.year)) {
            if (this.month == 1) {
                if (this.day > 29) {
                    setDate(year, month + 1, 29);
                } else {
                    setDate(year, month + 1, day);
                }
            } else {
                if (this.month == 12) {
                    int newMonth = 1;
                    if (this.year == 9999) {
                        throw new IllegalArgumentException("Year out of range!");
                    } else {
                        setDate(year, newMonth, day);
                    }
                } else {
                    if (this.day > DAY_IN_MONTHS[this.month]) {
                        setDate(year, month + 1, DAY_IN_MONTHS[this.month]);
                    } else {
                        setDate(year, month + 1, day);
                    }
                }
            }
        } else {
            if (this.month == 12) {
                int newMonth = 1;
                if (this.year == 9999) {
                    throw new IllegalArgumentException("Year out of range!");
                } else {
                    setDate(year, newMonth, day);
                }
            } else {
                if (this.day > DAY_IN_MONTHS[this.month]) {
                    setDate(year, month + 1, DAY_IN_MONTHS[this.month]);
                } else {
                    setDate(year, month + 1, day);
                }
            }
        }
        return this;
    }

    public MyDate nextYear() {
        if (isLeapYear(this.year)) {
            if (this.month == 2) {
                if (this.day == 29) {
                    setDate(year + 1, month, 28);
                } else {
                    setDate(year + 1, month, day);
                }
            } else {
                setDate(year + 1, month, day);
            }
        } else {
            setDate(year + 1, month, day);
        }
        return this;
    }

    public MyDate previousDay() {
        if (isLeapYear(this.year)) {
            if (this.month == 3) {
                if (this.day == 1) {
                    int newDay = 29;
                    setDate(year, this.month - 1, newDay);
                } else if (this.day == 29) {
                    setDate(this.year, this.month, this.day - 1);
                } else {
                    setDate(this.year, this.month, this.day - 1);
                }
            } else if (this.month == 1){
                int newMonth = 12;
                if (this.day == 1) {
                    int newDay = 31;
                    if (this.year == 0) {
                        throw new IllegalArgumentException("Year out of range!");
                    } else {
                        setDate(this.year - 1, newMonth, newDay);
                    }
                } else {
                    setDate(this.year, this.month, this.day - 1);
                }
            } else {
                if (this.day == 1) {
                    int newDay = DAY_IN_MONTHS[month - 2];
                    setDate(this.year, this.month - 1, newDay);
                } else {
                    setDate(this.year, this.month, this.day - 1);
                }
            }
        } else {
            if (this.month == 1){
                int newMonth = 12;
                if (this.day == 1) {
                    int newDay = 31;
                    if (this.year == 0) {
                        throw new IllegalArgumentException("Year out of range!");
                    } else {
                        setDate(this.year - 1, newMonth, newDay);
                    }
                } else {
                    setDate(this.year, this.month, this.day - 1);
                }
            } else {
                if (this.day == 1) {
                    int newDay = DAY_IN_MONTHS[month - 2];
                    setDate(this.year, this.month - 1, newDay);
                } else {
                    setDate(this.year, this.month, this.day - 1);
                }
            }
        }
        return this;
    }

    public MyDate previousMonth() {
        if (isLeapYear(this.year)) {
            if (this.month == 3) {
                if (this.day > 29) {
                    setDate(year, month - 1, 29);
                } else {
                    setDate(year, month - 1, day);
                }
            } else if (this.month == 1) {
                int newMonth = 12;
                if (this.year == 1) {
                    throw new IllegalArgumentException("Year out of range!");
                } else {
                    setDate(this.year - 1, newMonth, this.day);
                }
            } else {
                if (this.day > DAY_IN_MONTHS[this.month - 2]) {
                    setDate(year, month - 1, DAY_IN_MONTHS[this.month - 2]);
                } else {
                    setDate(year, month - 1, day);
                }
            }
        } else {
            if (this.month == 1) {
                int newMonth = 12;
                if (this.year == 1) {
                    throw new IllegalArgumentException("Year out of range!");
                } else {
                    setDate(this.year - 1, newMonth, this.day);
                }
            } else {
                if (this.day > DAY_IN_MONTHS[this.month - 2]) {
                    setDate(year, month - 1, DAY_IN_MONTHS[this.month - 2]);
                } else {
                    setDate(year, month - 1, day);
                }
            }
        }
        return this;
    }

    public MyDate previousYear() {
        if (isLeapYear(this.year)) {
            if (this.month == 2) {
                if (this.day == 29) {
                    setDate(year - 1, month, 28);
                } else {
                    setDate(year - 1, month, day);
                }
            } else {
                setDate(year - 1, month, day);
            }
        } else {
            setDate(year - 1, month, day);
        }
        return this;
    }

}
