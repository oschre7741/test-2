
/**
 * Test 2 corrections
 *
 * @author Olivia Schreiner
 * @version 10-23-2018
 */
public class Test2
{
    public static boolean oddRight(int n) {
        boolean flag = false;
        while (n != 0) {
            if ((n % 10) % 2 == 0) {
                flag = true;
            }
            else if ((n % 10) % 2 != 0 && flag) {
                return false;
            } 
            n = n/10;
        }
        return true;
    }
    
    public static double gpa(String grades) {
        double grade = 0;
        for (int i=0; i<grades.length(); i++) {
            String letter = grades.substring(i, i+1);
            if (letter.equals("A")) {
                grade += 4.0;
            }
            else if (letter.equals("B")) {
                grade += 3.0;
            }
            else if (letter.equals("C")) {
                grade += 2.0;
            }
            else if (letter.equals("D")){
                grade += 1.0;
            }
        }
        return grade / grades.length();
    }
    
    public static void main(String args[]) {
        System.out.println(oddRight(2461357));
        System.out.println(oddRight(24981357));
        
        System.out.println(gpa("BBABAAF"));
    }
}
