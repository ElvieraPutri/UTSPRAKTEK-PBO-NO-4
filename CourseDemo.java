/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTSPBONoMer4;

/**
 *
 * @author User
 */
public class CourseDemo {

    public static void main(String[] args) {
       Instructor myInstructor = new Instructor("Poernomo", "Arnold", "FF134E\n");
       
       TextBook myTextBook = new TextBook("Cintailah Masakanmu", "Renatta Moeloek", "Coconut Books\n");
       
       Course myCourse = new Course("Membuat Masakan Cita Rasa Tinggi dengan Sentuhan Keajaiban\n", myInstructor, myTextBook);
       
       System.out.println(myCourse);
    }
    
}