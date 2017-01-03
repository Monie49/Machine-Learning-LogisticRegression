
import java.util.ArrayList;
import java.util.Scanner;

public class LogisticRegressionMain {
             public static void main(String[] args){
            	 LogisticRegression  lr = new LogisticRegression();
            	 ArrayList<String> att = new ArrayList<String>();
             	 ArrayList<String> data1 = new ArrayList<String>();
             	 ArrayList<String> data2 = new ArrayList<String>();
             	 
            	 lr.get_att(att, data1, data2);
            	
            	 lr.calculate_wi(att);
            	 
                 System.out.println("please input the address of test ham file");
            	 int a[] = lr.Class(att);
            	 System.out.println("please input the address of test spam file");
            	 int b[] = lr.Class(att);
            	 System.out.println((b[1] + a[1])*1.0/(b[0] + a[0]));
             }
}

