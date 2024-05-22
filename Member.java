import java.util.Scanner;
class Date {
    private int day;
    private String month;
    private int year;
    public Date(int day, String month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public int getYear() {
        return year;
    }

    public String getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public static Date getDateFromUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter date in DD MM YYYY format");
        int day = sc.nextInt();
        String month = sc.next();
        int year = sc.nextInt();
        return new Date(day, month, year);
    }
    public static boolean compareDate(Date d1) {
        // Create a reference date object for August 7, 2009
        Date referenceDate = new Date(7, "Apr", 2009);

        // Compare the year first
        if (d1.year < referenceDate.year) {
            return true;
        } else if (d1.year > referenceDate.year) {
            return false;
        }

        // If years are equal, compare the months
        if (getMonthAsInt(d1.month) < getMonthAsInt(referenceDate.month)) {
            return true;
        } else if (getMonthAsInt(d1.month) > getMonthAsInt(referenceDate.month)) {
            return false;
        }

        // If months are equal, compare the days
        return d1.day < referenceDate.day;
    }

    // Helper method to convert month string to integer
    private static int getMonthAsInt(String month) {
        return switch (month.substring(0,4)) {
            case "Jan" -> 1;
            case "Feb" -> 2;
            case "Mar" -> 3;
            case "Apr" -> 4;
            case "May" -> 5;
            case "Jun" -> 6;
            case "Jul" -> 7;
            case "Aug" -> 8;
            case "Sept" -> 9;
            case "Oct" -> 10;
            case "Nov" -> 11;
            case "Dec" -> 12;
            default -> throw new IllegalArgumentException("Invalid month");
        };
    }
}

 public class Member {
    private int memberID;
    private String lastName;
    private String firstName;
    private int handicap;
    private char gender;
    private String team="";
    private String memberType;
    private int coach;
    private long phone;
    private Date joinDate;

   Member(int memberID, String lastName, String firstName, int handicap, char gender, String team, String memberType, int coach, long phone, Date joinDate) {
        this.memberID = memberID;
        this.lastName = lastName;
        this.firstName = firstName;
        this.handicap = handicap;
        this.gender = gender;
        this.team = team;
        this.memberType = memberType;
        this.coach = coach;
        this.phone = phone;
        this.joinDate = joinDate;
    }

    public void display() {
        System.out.printf("%-10d %-15s %-15s %-10d %-10c %-15s %-15s %-10d %-12d %02d-%s-%d%n",
                memberID, lastName, firstName, handicap, gender, team, memberType, coach, phone,
                joinDate.getDay(), joinDate.getMonth(), joinDate.getYear());
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of members");
        int n = sc.nextInt();
        Member[] members = new Member[n];


        for (int i = 0; i < n; i++) {
            System.out.println("Enter MemberID, LastName, FirstName, Handicap, Gender, Team, MemberType, Coach, Phone");
            members[i] = new Member(sc.nextInt(), sc.next(), sc.next(), sc.nextInt(), sc.next().charAt(0),
                    sc.next(), sc.next(), sc.nextInt(), sc.nextLong(), Date.getDateFromUserInput());
        }

        // Printing Records......
        System.out.println("----------------------------------- Records Of Members Of The Club -----------------------------------------------------------------");
        System.out.printf("%-10s %-15s %-15s %-10s %-10s %-15s %-15s %-10s %-12s %-12s %n",
                "MemberID", "LastName", "FirstName", "Handicap", "Gender", "Team", "MemberType", "Coach", "Phone", "JoinDate");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < n; i++) {
            members[i].display();
        }

        /* Task 1 Display records whose join date is earlier than 07 Apr 2009 */
        System.out.println("\n----------------------------------Members who joined earlier than 7 Apr 2009 ---------------------------------------------------------");

        int c=0;
        for (int i=0;i<n;i++){

            if (Date.compareDate(members[i].joinDate)) {
                members[i].display();c++;
            }
        }
        if(c==0)
            System.out.println("No such records found!!");

        //Task2 Display records of senior members having handicap score less than 12
        System.out.println("\n-------------------------------------Senior Members with Handicap Score less than 12------------------------------------------------------");

        c=0;
        for(int i=0;i<n;i++){
            if(members[i].memberType.equalsIgnoreCase("Senior")&& members[i].handicap<12){
                members[i].display();c++;}
        }
        if(c==0)
            System.out.println("No such records found");

        //Task3  Display the records of all the female senior members who are part of TeamB.
        System.out.println("\n----------------------------------------Female Players Who Are Part Of Team B --------------------------------------------------------------");
        c=0;
        for(int i=0;i<n;i++){
           if ((members[i].gender=='F'|| members[i].gender=='f')&& members[i].team.equalsIgnoreCase("TeamB")){
               members[i].display();c++;
           }
        }
        if(c==0)
            System.out.println(" No such records found");
    }
}