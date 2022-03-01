
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Human {
	// ToDo 1: Make this class a child of Human
	
	// ToDo 2: Fix the resulting errors
	
	// ToDo 3: Add a field for GPA and create setter and getter
	
    public int GPA;
    
    public Student(String name, short age) {
        super(name, age);
    }
        
        // Getter
        public int GPA(){
        return GPA;
        }

        // Setter
        public void setGPA(int newGPA) {
        this.GPA = newGPA;
        }

        
	// ToDo 4: Add comments to your code

    @Override
    public String getAddress() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setAddress(String address) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}