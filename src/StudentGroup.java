import src.*;
import java.io.*;

import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private  Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	public Student[] getStudents() {
            
            
                
		// Add your implementation here
		return students;
	}

	public void setStudents(Student[] students) {
		// Add your implementation here
                this.students=students;
	}

	public Student getStudent(int index) {
		// Add your implementation here
		return this.students[index];
	}

	public void setStudent(Student student, int index) {
		// Add your implementation here
                students[index]=student;
	}

	public void addFirst(Student student) {
		// Add your implementation here
                students[1]=student;
                
	}

	public void addLast(Student student) {
            int j=0;
            for(Student i:students){
                j=j+1;
            }
            students[j]=student;
		// Add your implementation here
                
                
	}

	public void add(Student student, int index) {
		// Add your implementation here
                students[index]=student;
	}

	public void remove(int index) {
            
		// Add your implementation here
                int j=0;
                for(Student i:students){
                   
                j=j+1;
                }
                for(int k=index;k<j-1;k++)
                {
                students[k]=students[k+1];}
                    
                    }

	@Override
	public void remove(Student student) {
		// Add your implementation here
	int j=0;
        for(Student i: students){
            j++;
        if(i==student){
            remove(j);
            
            }
            }}

	@Override
	public void removeFromIndex(int index) {
            
            Student[] students1 = null;
        
            System.arraycopy(students, 0, students1, 0, index);
		// Add your implementation here
            System.arraycopy(students1, 0, students, 0, index);
        }   

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
                int j=0;
        for(Student i: students){
            j++;}
        int k=j-index;
        int s=0;
        for(int i=k;i<=j;i++)
        {students[s]=students[i];
        s=s+1;
        }
        
	}

	@Override
	public void removeToElement(Student student) {
            int j=0,index=0;
        for(Student i: students){
        if(i==student)
        {
            index=j;
            break;
        }
            j++;
        }
        int k=j-index;
        int s=0;
        for(int i=k;i<=j;i++)
        {students[s]=students[i];
        s=s+1;
        }
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
            int j=0;
            Student temp;
        for(Student i: students){
            j++;}
        for(int i=0;i<j-1;i++)
        {
            for(int k=0;k<j;k++)
            {
            if(students[i].compareTo(students[j])>0)
            {
                temp=students[i];
                students[i]=students[j];
                students[j]=temp;
            }}
            
        }
            
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
                int j=0;
                for(Student i:students)
                {
                    j++;
                    if(i==student){
                    break;}
                    
                }
		return students[j+1];
	}
}
