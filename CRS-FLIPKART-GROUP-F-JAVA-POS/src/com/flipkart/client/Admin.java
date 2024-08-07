package com.flipkart.client;

import com.flipkart.utils.CourseCatalogue;
import com.flipkart.utils.Courses;

public class Admin {
    public static boolean addCourse(Courses temp){
        CourseCatalogue.addCourse(temp);
        return true;
    }
    public static boolean removeCourse(Courses temp){
        System.out.println("removed course"+temp.getName());
        return true;
    }
    public static void maintainCourseCatalogue(){
        System.out.println("maintaining courses catalogue");
    }
}
