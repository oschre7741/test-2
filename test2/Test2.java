
/**
 * Test 2 corrections
 *
 * @author Olivia Schreiner
 * @version 10-23-2018
 */
public class Test2
{
    public static boolean afterOdd(int n) {
        for (int i=0; i<=n; i++) {
            if ((i + 1) % 2 == 0 && i % 2 != 0 && (1 + 2) % 2 != 2) {
                return false;
            }
        }
        return true;
    }
    
    public static double gpa(String grades) {
        double grade = 0;
        for (int i=0; i<grades.length(); i++) {
            if (grades.charAt(i) == 'A') {
                grade += 4.0;
            }
            else if (grades.charAt(i) == 'B') {
                grade += 3.0;
            }
            else if (grades.charAt(i) == 'C') {
                grade += 2.0;
            }
            else if (grades.charAt(i) == 'D'){
                grade += 1.0;
            }
        }
        return grade / 7.0;
    }
    
    public static void main(String args[]) {
        System.out.println(gpa("BBABAAF"));
        
        System.out.println(afterOdd(135246));
        System.out.println(afterOdd(132546));
    }
}
