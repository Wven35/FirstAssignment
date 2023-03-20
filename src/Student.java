/////
// Created by Will Venable, textbook sample
// This class tracks student information
//
public class Student {
    private String name;
    private double average;

    // Constructor!
    public Student(String name, double average){
        this.name = name;

        // Only allow numbers from 0 to 100.
        // Allow numbers: (0, 100].
        //
        if ( average > 0.0){
            if ( average <= 100){
                this.average = average; // This assigns a value to the instance variable.
            }
        }
    } // End: Constructor.

    //////////////////////////////////////////
    public void setName(String name) {
        this.name = name;
    }

    //////////////////////////////////////////
    public String getName() {
        return name;
    }

    //////////////////////////////////////////
    public void setAverage(double average) {

        // Allow numbers: (0, 100].
        //
        if ( average > 0.0){
            if ( average <= 100){
                this.average = average; // This assigns a value to the instance variable.
            } // End IF
        } // End IF
    } // End setAverage.

    //////////////////////////////////////////
    public double getAverage() {
        return average;
    }

    public String getLetterGrade(){
        String letterGrade = "";

        if ( average >= 90.0){
            letterGrade = "A";
        }
        else if ( average >= 80.0){
            letterGrade = "B";
        }
        else if (average >= 70.0){
            letterGrade = "C";
        }
        else if (average >= 60.0){
          letterGrade = "D";
        } else

        }
    }
} // End: Student Class.
