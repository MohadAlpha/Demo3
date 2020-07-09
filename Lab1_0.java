import java.util.Scanner;
class task1

{
    double Base , Height;
    task1()
    {
    	Base  = 0;
    	Height = 0;
    }
    task1(double Base , double Height)
    {
        this.Base  = Base ;
        this.Height = Height;
       
    }
    double area=(Base*Height)/2;
    
task1(task1 x)
    {
        this(x.Base,x.Height);
    }

public double toDouble()
{
    return area;
}     
}


/




public class Lab1_0 {


	
	
	public static void main(String[] args) {
		
		task1 tre = new task1();
        tre.Base = 5; 
        tre.Height = 9; 
        System.out.println(tre);

	}

}
