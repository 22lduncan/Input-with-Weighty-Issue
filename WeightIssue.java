/*22lduncan
 * 12/16/20, 2:28 PM */

import java.util.Scanner;

class WeightyIssue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number in pounds: ");
        double pounds = input.nextDouble();

        double kilograms = pounds * 0.454;
        System.out.print(pounds + " pounds is " + kilograms + " kilograms");
    }
}