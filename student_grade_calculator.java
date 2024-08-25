import java.util.Scanner;
/**
 * NumberGame
 */
public class student_grade_calculator
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Student grade Calculator");
        int nS=sc.nextInt();
        int total=0;
        for(int i=0;i<nS;i++){
            System.out.println("Enter marks obtained in "+(i+1)+": ");
            int marks=sc.nextInt();
            total+=marks;

        }
        double averP=(double)total/nS;
    char grade;
    if(averP>=90){
        grade='o';
    }
    else if(averP>=80){
        grade='A';
    }
    else if(averP>70){
        grade='B';
    }
    else if(averP>60){
        grade='C';
    }
    else if(averP>50){
        grade='D';
    }
    else if(averP>40){
        grade='E';
    }
    else {
        grade='F';
    }
    System.out.println("total maeks Scored is"+total);
    System.out.println("Average percentage Gained is "+averP+"%");
    System.out.println("grade :"+grade);
    }

}

