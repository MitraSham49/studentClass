package studentarray.example.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class MainCourse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Course newCourse;
        ArrayList<Course> Courses = new ArrayList<>();
        boolean done =false;
        String again= "";
     //   for (int i = 1; i < 5; i++)
        do {
            newCourse = new Course();
            System.out.println("Enter Course Number:");
            newCourse.setCourseNumber(scan.nextLine());
            System.out.println("Enter Course Name:");
            newCourse.setCourseName(scan.nextLine());
            System.out.println("Enter Room Number");
            newCourse.setRoomNumber(scan.nextLine());
            System.out.println("Enter Semester:");
            newCourse.setSemester(scan.nextLine());
            System.out.println("Enter Year:");
            newCourse.setYear(scan.nextLine());
            Courses.add(newCourse);
            System.out.println(newCourse);
            System.out.println("Do you want continue?(Y/N)");
            again = scan.nextLine();
            if (again.equalsIgnoreCase("y")) {
                done = true;
            }else{done =false;}

            //System.out.println("my done" + done);
        }while (done);
        for (Course eachCourse : Courses){
            System.out.println("------------------------");
            System.out.println( " For year:"+eachCourse.getYear() + "   The Semester" + eachCourse.getSemester());
            System.out.println("The  information was record:" + eachCourse.toString());


        }

    }
}
