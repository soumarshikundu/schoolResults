/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.HashMap;
import java.util.ArrayList;

class Class{
    //creating a arraylist of student object
    ArrayList<Student>al=new ArrayList<Student>();
    //for a particular class we can add multiple students
    void addStudent(Student S1){
        al.add(S1);
    }
    //finding details of particular student S
    void findStudentDetails(Student S){
        for(Student s:al){
            if(s==S){
                HashMap<String,Integer>hm=s.getResults();
                System.out.println(hm);
            }
        }
    }
}
class Student{
    int age;
    String name;
    HashMap<String,Integer>hm=new HashMap<String,Integer>();
    Student(String name,int age,HashMap<String,Integer>hm){
        this.name=name;
        this.age=age;
        this.hm=hm;
    }
    HashMap<String,Integer> getResults(){
        return this.hm;
    }
    
}
class Main{
    public static void main(String[] args){
        //creating class
        Class c1=new Class();
        HashMap<String,Integer>hm=new HashMap<String,Integer>();
        hm.put("maths",100);
        hm.put("Science",90);
        Student s1=new Student("soum",2,hm);
        c1.addStudent(s1);
        c1.findStudentDetails(s1);
        
        
        //creating class
        Class c2=new Class();
        HashMap<String,Integer>hm1=new HashMap<String,Integer>();
        hm1.put("maths",100);
        hm1.put("Science",900);
        //creating students
        Student s2=new Student("soum1",22,hm1);
        c2.addStudent(s2);
        c2.findStudentDetails(s2);
    }
}