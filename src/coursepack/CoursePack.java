/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursepack;

import java.util.Scanner;

/**
 *
 * @author Enubs
 */
public class CoursePack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        char response;
        SubjectsList subjectsList = new SubjectsList();

        while (true) {
            System.out.print("Do you want to add a subject? (Y/N)");
            response = in.nextLine().charAt(0);
            if (response == 'N') {
                break;
            }

            System.out.print("Please input Subject Description: ");
            String subjectDescription = in.nextLine();
            System.out.print("Input number of units: ");
            int units = Integer.parseInt(in.nextLine());
            System.out.print("Input subject code: ");
            int subjectCode = Integer.parseInt(in.nextLine());

            Subjects subject = new Subjects(subjectDescription, units, subjectCode);
            subjectsList.addSubject(subject);
        }

        while (true) {
            System.out.print("Are finished with the subject? (Y/N) ");
            char response2 = in.nextLine().charAt(0);
            if (response2 == 'Y') {
                System.out.println("You finished " + subjectsList.finishedSubject().getDescription());
            }
            
            System.out.print("Do you want to quit the applicaton? (Y/N) ");
            if(in.nextLine().charAt(0) == 'Y'){
                break;
            }
        }
    }

}
