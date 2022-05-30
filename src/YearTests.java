public class YearTests {
    private int year;

    public YearTests(int year) {
        this.year = year;
    }

    public void setYear(int year){
        this.year = year;
    }

    /*  If the year is evenly divisible by 4, go to step 2. ...
        If the year is evenly divisible by 100, go to step 3. ...
        If the year is evenly divisible by 400, go to step 4. ...
        The year is a leap year (it has 366 days).
        The year is not a leap year (it has 365 days).  */
    public boolean isLeapYear(){
        if(this.year % 4 == 0){

            if(this.year % 100 == 0){

                if(this.year % 400 == 0){
                    return true;
                }
                return true;
            }
            return true;
        }
        return false;
    }
}
