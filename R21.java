import quizes.q2.luka_khelashvili_2.tape.A21;
import quizes.q2.luka_khelashvili_2.book.A22;

public class R21 {
    
    public static void main(String[] args) {
        int area = A21.hei * A21.len;
        System.out.println("Area: " + area);
        
        int remainder = A22.month / 12;
        String monthName = getMonthName(remainder);
        System.out.println("Month Name: " + monthName);
    }

    public static String getMonthName(int remainder) {
        switch (remainder) {
            case 0: return "December";
            case 1: return "January";
            case 2: return "February";
            case 3: return "March";
            case 4: return "April";
            case 5: return "May";
            case 6: return "June";
            case 7: return "July";
            case 8: return "August";
            case 9: return "September";
            case 10: return "October";
            case 11: return "November";
            default: return "Invalid month";
        }
    }
}
