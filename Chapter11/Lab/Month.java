package Chapter11.Lab;
//Created by Safeeullah Saifuddin
//Java 26B
//Chapter 11 Lab
public class Month {

    private int monthNumber;
    private String monthName;

    public Month(int monthNum) throws InvalidMonthException {
        this.monthNumber = monthNum;

        switch (monthNum) {
            case 1:
                this.monthName = "January";
                System.out.println(monthName);

                break;
            case 2:
                this.monthName = "February";
                System.out.println(monthName);

                break;
            case 3:
                this.monthName = "March";
                System.out.println(monthName);

                break;
            case 4:
                this.monthName = "April";
                System.out.println(monthName);

                break;
            case 5:
                this.monthName = "May";
                System.out.println(monthName);

                break;
            case 6:
                this.monthName = "June";
                System.out.println(monthName);

                break;
            case 7:
                this.monthName = "July";
                System.out.println(monthName);

                break;
            case 8:
                this.monthName = "August";
                System.out.println(monthName);

                break;
            case 9:
                this.monthName = "September";
                System.out.println(monthName);

                break;
            case 10:
                this.monthName = "October";
                System.out.println(monthName);

                break;
            case 11:
                this.monthName = "November";
                System.out.println(monthName);

                break;
            case 12:
                this.monthName = "December";
                System.out.println(monthName);

                break;
            default:
                throw new InvalidMonthException(monthNum);



        }
    }
}
