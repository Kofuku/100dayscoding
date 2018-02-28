package Day_2;


import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class AgeInSeconds {
    public static void main(String[] args) {
        Date userDate = getUserDate();
        Timestamp userTime = new Timestamp(userDate.getTime());
        Timestamp presentTime = new Timestamp(System.currentTimeMillis());

        long ageMiliseconds = presentTime.getTime() - userTime.getTime();
        long ageSeconds = ageMiliseconds / 1000;

        System.out.println("You are " + ageSeconds + " seconds old.");
    }

    private static Date getUserDate() {
        Scanner reader = new Scanner(System.in);

        String dateFormat = "yyyy/MM/dd";
        System.out.println("Enter your birth date: " + dateFormat);

        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        sdf.setLenient(false);

        while (true) {
            try {
                String birthDate = reader.nextLine();
                Date date = sdf.parse(birthDate);
                return date;
            } catch (ParseException e) {
                System.out.println("Wrong date format. Enter your birth date: " + dateFormat);
            }
        }
    }

}
