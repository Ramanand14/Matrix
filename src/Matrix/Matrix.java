/*
 *
 * This is the coding in Java to solve the different Matrix Operations
 * such as type of matrix, determinant, normal form, eigen vector and so on.
 * 
 */
package Matrix;

import java.util.*;
import java.util.Scanner;

/**
 *
 * @author Ramanand Anand Mohare
 * 
 **/

public class Matrix {
    
    public static void main(String args[]){
        int option;
        Scanner s = new Scanner(System.in);
        
        //Repeating loop until the user chooses option 8 to exit through program:
        do{
        System.out.println("=========== Menu Bar ==========");
        System.out.println(" ");
        System.out.println("1.Type Of Matrix");
        System.out.println("2.Determinant");
        System.out.println("3.Gauss Jordan Method");
        System.out.println("4.Normal Form");
        System.out.println("5.Echelon Form");
        System.out.println("6.Cayley Hamilton Equation");
        System.out.println("7.Eigen Values");
        System.out.println("8.Exit");
        System.out.print("Enter your choice to perform the operation: ");
        
        option = s.nextInt();
        
            switch(option){
                case 1:
                    //Calling TypeOfMatrix function:
                    Matrix obj1 = new Matrix();
                    obj1.TypeOfMatrix();
                    break;
                
                case 2:
                    //Calling DeterminantOfMatrix function:
                    Matrix obj2 = new Matrix();
                    obj2.DeterminanatOfMatrix();
                    break;
                
                case 3:
                    //Calling GaussJordanMethod function:
                    Matrix obj3 = new Matrix();
                    obj3.GaussJordanMethod();
                    break;
                
                case 4:
                    //Calling NormalForm function:
                    Matrix obj4 = new Matrix();
                    obj4.NormalForm();
                    break;
                
                case 5:
                    //Calling EchelonForm function:
                    Matrix obj5 = new Matrix();
                    obj5.EchelonForm();
                    break;
                
                case 6:
                    //Calling CayleyHamiltonEquation function:
                    Matrix obj6 = new Matrix();
                    obj6.CayleyHamiltonEquation();
                    break;
                
                case 7:
                    //Calling EigenValues function:
                    Matrix obj7 = new Matrix();
                    obj7.EigenValues();
                    break;
                
                case 8:
                    //Calling Exit function:
                    Matrix obj8 = new Matrix();
                    obj8.Exit();
                    break;
                    
            }
        }while(option!=8);
    }
    
    public void TypeOfMatrix(){
        int a[][] = new int[3][3];
        Scanner s = new Scanner(System.in);
        
        //Matrix Calling:
        System.out.println("Enter the matrix elements: ");
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                a[i][j] = s.nextInt();
            }
        }
        
        //Display Of result:
        System.out.println("The Entered matrix: ");
       
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(" "+a[i][j]);
            }
             System.out.println(" ");
        }
        
        System.out.println(" ");
        
        //Null Matrix:
        if(a[0][0]==0 && a[0][1]==0 && a[0][2]==0 && a[1][0]==0 && a[1][2]==0 && a[1][1]==0 && a[2][0]==0 && a[2][1]==0 && a[2][2]==0){
            System.out.print("Type Of Matrix: Null Matrix");
        }
        
        //Unit Matrix:
        else if(a[0][0]==1 && a[0][1]==1 && a[0][2]==1 && a[1][0]==1 && a[1][1]==1 && a[1][2]==1 && a[2][0]==1 && a[2][1]==1 && a[2][2]==1){
            System.out.print("Type Of Matrix: Unit/Identity Matrix");
        }
        
        //Upper-triangular Matrix:
        else if((a[1][0] + a[2][0] + a[2][1] == 0) && (a[0][0]>0 && a[0][1]>0 && a[0][2]>0 && a[1][1]>0 && a[1][2]>0 && a[2][2]>0)){
            System.out.print("Type Of Matrix: Upper-triangular Matrix");
        }
        
        //Lower-triangular Matrix:
        else if((a[0][1] + a[0][2] + a[1][2] == 0) && (a[0][0]>0 && a[1][1]>0 && a[2][2]>0 && a[1][0]>0 && a[2][0]>0 && a[2][2]>0)){
            System.out.print("Type Of MAtrix: Lower-triangular Matrix");
        }
        
        //Diagonal & Scalar Matrix:
        else if(a[0][0]>0 && a[0][1]==0 && a[0][2]==0 && a[1][0]==0 && a[1][1]>0 && a[1][2]==0 && a[2][0]==0 && a[2][1]==0 && a[2][2]>0){
            int k=a[0][0];
            
            if(a[0][0]/k==1 && a[1][1]/k==1 && a[2][2]/k==1){
                System.out.print("Type Of Matrix: Scalar Matrix");              
            }
            
            else{
                System.out.print("Type Of Matrix: Diagonal Matrix");
            }
        }
        
        //General MAtrix:
        else{
            System.out.print("Type Of Matrix: General Matrix");
        }
        
    }
    
    public void DeterminanatOfMatrix(){
        int a[][] = new int[3][3];
        Scanner s = new Scanner(System.in);
        
        //Matrix Calling:
        System.out.println("Enter the matrix elements: ");
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                a[i][j] = s.nextInt();
            }
        }

        //Calculate Determinanat:
        int det = a[0][0]*(a[1][1]*a[2][2] - a[1][2]*a[2][1]) - a[0][1]*(a[1][0]*a[2][2] - a[1][2]*a[2][0]) + a[0][2]*(a[1][0]*a[2][1] - a[1][1]*a[2][0]);
        
        //Display Of result:
        System.out.println("The Entered matrix: ");
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(" "+a[i][j]);
            }
             System.out.println(" ");
        }
        
        System.out.println(" ");
        
        System.out.println("Determinant: " +det);
    }
    
    public void GaussJordanMethod(){
        int a[][] = new int[3][3];
        int[][] b = new int[3][3];
        int[][] c = new int[3][3];
        int[][] d = new int[3][3];
        int[][] e = new int[3][3];
        int[][] t = new int[3][3];
        int i,j,x; 
        Scanner s = new Scanner(System.in);
        
        //Matrix Calling:
        System.out.println("Enter the matrix elements: ");
        
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++){
                a[i][j] = s.nextInt();
            }
        }
        
        //Display Of matrix:
        System.out.println("The Entered matrix: ");
        
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++){
                System.out.print(" "+a[i][j]);
            }
             System.out.println(" ");
        }  
        
        //Unit Matrix:
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++){
                if(i==j){
                    c[i][j] = 1;
                }
                else{
                    c[i][j] = 0;
                }
            }
        }
        
        //Begining of Gauss-Jordan Method :
        //For 1st Γ :
        if (a[0][0]==0)
        {
            if(a[1][0]!=0)
            {
                //Row Interchange R1<->R2 :
                for(i=0,x=1;i<=1 && x>=0;i++,x--)
                {
                    for(j=0;j<3;j++)
                    {
                        t[i][j]=a[x][j];
                        e[i][j]=c[x][j];
                    }
                }
                for(i=0;i<=1;i++)
                {
                    for(j=0;j<3;j++)
                    {
                        a[i][j]=t[i][j];
                        c[i][j]=e[i][j];
                    }
                }

                //Matrix Transfer :
                for(i=0;i<3;i++)
                {
                    for(j=0;j<3;j++)
                    {
                        b[i][j]=a[i][j];
                        d[i][j]=c[i][j];
                    }
                }

                //Column Calculations :
                for(i=0;i<=1;i++)
                {
                    for(j=0;j<3;j++)
                    {
                       c[i+1][j]=((d[i+1][j]*a[0][0]) - (d[0][j]*a[i+1][0]));
                    }
                }
                for(i=0;i<=1;i++)
                {
                    for(j=0;j<3;j++)
                    {
                       a[i+1][j]=((b[i+1][j]*b[0][0]) - (b[0][j]*b[i+1][0]));
                    }
                }
            }

            else if(a[2][0]!=0)
            {
                //Row Interchange R1<->R3 :
                for(i=0,x=2;i<=1 && x>=0;i++,x--)
                {
                    for(j=0;j<3;j++)
                    {
                        t[i][j]=a[x][j];
                        e[i][j]=c[x][j];
                    }
                    i++;
                    x--;
                }

                for(i=0;i<=2;i++)
                {
                    for(j=0;j<3;j++)
                    {
                        a[i][j]=t[i][j];
                        c[i][j]=e[i][j];
                    }
                    i++;
                }

                //Matrix Transfer :
                for(i=0;i<3;i++)
                {
                    for(j=0;j<3;j++)
                    {
                        b[i][j]=a[i][j];
                        d[i][j]=c[i][j];
                    }
                }

                //Column Calculations :
                for(i=0;i<=1;i++)
                {
                    for(j=0;j<3;j++)
                    {
                        c[i+1][j]=((d[i+1][j]*a[0][0]) - (d[0][j]*a[i+1][0]));
                    }
                }
                for(i=0;i<=1;i++)
                {  
                  for(j=0;j<3;j++)
                  {
                     a[i+1][j]=((b[i+1][j]*b[0][0]) - (b[0][j]*b[i+1][0]));
                  } 
                }
            }
        }

        else
        {
            //Matrix Transfer :
            for(i=0;i<3;i++)
            {
                for(j=0;j<3;j++)
                {
                    b[i][j]=a[i][j];
                    d[i][j]=c[i][j];
                }
            }

            //Column Calculations :
            for(i=0;i<=1;i++)
            {
                for(j=0;j<3;j++)
                {
                    c[i+1][j]=((d[i+1][j]*a[0][0]) - (d[0][j]*a[i+1][0]));
                }
            }
            for(i=0;i<=1;i++)
            {            
                for(j=0;j<3;j++)
                {
                  a[i+1][j]=((b[i+1][j]*b[0][0]) - (b[0][j]*b[i+1][0]));
                }              
            }
        }
        
        //For 2nd Γ :
        if(a[1][1]==0)
        {
            if(a[2][1]!=0)
            {
                //Row Interchange R2<->R3 :
                for(i=1,x=2;i<=2 && x>=0;i++,x--)
                {
                    for(j=1;j<=1;j++)
                    {
                        t[i][j]=a[x][j];
                        e[i][j]=c[x][j];
                    }
                }

                for(i=1;i<=2;i++)
                {
                    for(j=1;j<=1;j++)
                    {
                        a[i][j]=t[i][j];
                        c[i][j]=e[i][j];
                    }
                }

                //Matrix Transfer :
                for(i=0;i<3;i++)
                {
                    for(j=0;j<3;j++)
                    {
                        b[i][j]=a[i][j];
                        d[i][j]=c[i][j];
                    }
                }

                //Column Calculations :
                for(i=0;i<1;i++)
                {
                    for(j=0;j<3;j++)
                    {
                        c[i][j]=((d[i][j]*a[1][1]) - (d[1][j]*a[0][j]));
                    }
                }
                for(i=2;i<=2;i++)
                {
                    for(j=0;j<3;j++)
                    {
                        c[i][j]=((d[i][j]*a[1][1]) - (d[1][j]*a[2][1]));
                    }
                }
                for(i=0;i<1;i++)
                {
                   for(j=0;j<3;j++)
                   {
                       a[i][j]=((b[i][j]*b[1][1]) - (b[1][j]*b[0][1]));
                   }
                }
                for(i=2;i<=2;i++)
                {
                   for(j=0;j<3;j++)
                   {
                       a[i][j]=((b[i][j]*b[1][1]) - (b[1][j]*b[2][1]));
                   }
                }
            }
        }

            else
            {
                //Matrix Transfer :
                for(i=0;i<3;i++)
                {
                    for(j=0;j<3;j++)
                    {
                        b[i][j]=a[i][j];
                        d[i][j]=c[i][j];
                    }
                }

                //Column Calculations :
                for(i=0;i<1;i++)
                {
                    for(j=0;j<3;j++)
                    {
                        c[i][j]=((d[i][j]*a[1][1]) - (d[1][j]*a[0][1]));
                    }
                }
                for(i=2;i<=2;i++)
                {
                    for(j=0;j<3;j++)
                    {
                        c[i][j]=((d[i][j]*a[1][1]) - (d[1][j]*a[2][1]));
                    }
                }
                for(i=0;i<1;i++)
                {
                    for(j=0;j<3;j++)
                    {
                        a[i][j]=((b[i][j]*b[1][1]) - (b[1][j]*b[0][1]));
                    }
                }
                for(i=2;i<=2;i++)
                {
                    for(j=0;j<3;j++)
                    {
                        a[i][j]=((b[i][j]*b[1][1]) - (b[1][j]*b[2][1]));
                    }
                }
            }
        
        //For 3rd Γ :
        //Matrix Transfer :
        
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                b[i][j]=a[i][j];
                d[i][j]=c[i][j];
            }
        }
                
        //Column Calculation :
        for(i=0;i<1;i++)
        {
            for(j=0;j<3;j++)
            {
                c[i][j]=((d[i][j]*a[2][2]) - (d[2][j]*a[0][2]));
            }
        }
        
        for(i=1;i<2;i++)
        {
            for(j=0;j<3;j++)
            {
                c[i][j]=((d[i][j]*a[2][2]) - (d[2][j]*a[1][2]));
            }
        }
        for(i=0;i<1;i++)
        {
            for(j=0;j<3;j++)
            {
                a[i][j]=((b[i][j]*b[2][2]) - (b[2][j]*b[0][2]));
            }
        }
        
        for(i=1;i<2;i++)
        {
            for(j=0;j<3;j++)
            {
                a[i][j]=((b[i][j]*b[2][2]) - (b[2][j]*b[1][2]));
            }
        }
       
        //Row 1 :
        for(i=0;i<1;i++)
        {
            for(j=0;j<3;j++)
            {
                c[i][j] = c[i][j]/a[0][0];
            }
        }
        //Row 2 :
        for(i=1;i<2;i++)
        {
            for(j=0;j<3;j++)
            {
                c[i][j] = c[i][j]/a[1][1];
            }
        }
        //Row 3 :
        for(i=2;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                c[i][j] = c[i][j]/a[2][2];
            }
        }
        //End of Gauss-Jordan methode
        
        //Display Of result:
        System.out.println(" ");
        System.out.println("Aˉ¹ : ");
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++){
                System.out.print(" "+c[i][j]);
            }
             System.out.println(" ");
        }  
    }
    
    public void NormalForm(){
        int a[][] = new int[3][3];
        int[][] t = new int[3][3];
        int[][] b = new int[3][3];
        int i,j,x;
        Scanner s = new Scanner(System.in);
        
        //Matrix Calling:
        System.out.println("Enter the matrix elements: ");
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++){
                a[i][j] = s.nextInt();
            }
        }
        
        //Display Of matrix:
        System.out.println("The Entered matrix: ");
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++){
                System.out.print(" "+a[i][j]);
            }
             System.out.println(" ");
        }  
        
        //Begining of Normal Form Method :
        
        //For 1st Γ :
        if (a[0][0]==0)
        {
           if(a[1][0]!=0)
           {
            //Row Interchange R1<->R2 :
            for (i=0,x=1;i<=1 && x>=0;i++,x--)
	    {
	      for(j=0;j<3;j++)
	      {
		t[i][j]=a[x][j];
	      }
	    }
	    for (i=0;i<=1;i++)
	    {
	      for(j=0;j<3;j++)
	      {
		a[i][j]=t[i][j];
	      }
	    }
            
            //Matrix Transfer :
            for (i = 0; i < 3; i++) 
            {
              for (j = 0; j < 3; j++)
              {
                 b[i][j]=a[i][j];
              }
            } 
            
            //Column Calculations :
            for (i = 0; i<=1; i++)
            {             
                for (j = 0; j < 3; j++)
                {
                  a[i+1][j]=((b[i+1][j]*b[0][0]) - (b[0][j]*b[i+1][0]));
                }
            }
            
            //Row Calculations :
            for (i = 0; i<=1; i++)
            {
                for (j = 0; j < 3; j++)
                {
                  a[j][i+1]=((b[j][i+1]*b[0][0]) - (b[0][i]*b[j][i+1]));
                } 
            }
            
            a[0][0] = a[0][0]/a[0][0];
           }
           
           else if(a[2][0]!=0)
           {
            //Row Interchange R1<->R3 :
            for (i=0, x=2 ; i<=1 && x>=0; i++ , x--)
	    {
	      for(j=0;j<3;j++)
	    {
		t[i][j]=a[x][j];
	    }
	    i++;                    
	    x--;
	    }
            
            for (i=0;i<=2;i++)
	    {
	      for(j=0;j<3;j++)
              {
		a[i][j]=t[i][j];
	      }
	      i++;                           
	    }
            
            //Matrix Transfer :
            for (i = 0; i < 3; i++) 
            {
              for (j = 0; j < 3; j++)
              {
                 b[i][j]=a[i][j];
              }
            } 
            
            //Column Calculations :
            for (i = 0; i<=1; i++)
            {  
                for (j = 0; j < 3; j++)
                {
                  a[i+1][j]=((b[i+1][j]*b[0][0]) - (b[0][j]*b[i+1][0]));
                } 
            }
            
            //Row Calculations :
            for (i = 0; i<=1; i++)
            {
                for (j = 0; j < 3; j++)
                {
                  a[j][i+1]=((b[j][i+1]*b[0][0]) - (b[0][i]*b[j][i+1]));
                }
            }
            
            a[0][0] = a[0][0]/a[0][0];
           }
           
           else if(a[0][1]!=0)
           {
            //Column Interchange C1<->C2 :
            for (i=0, x=1 ; i<=1 && x>=0; i++,x--)
	    {
	      for(j=0;j<3;j++)
              {
		t[j][i]=a[j][x];
	      }
	    }
            
            for (i=0;i<=1;i++)
	    {
	      for(j=0;j<3;j++)
              {
		a[j][i]=t[j][i];
	      }
	    }
            
            //Matrix Transfer :
            for (i = 0; i < 3; i++) 
            {
              for (j = 0; j < 3; j++)
              {
                 b[i][j]=a[i][j];
              }
            } 
            
            //Column Calculations :
            for (i = 0; i<=1; i++)
            {           
                for (j = 0; j < 3; j++)
                {
                  a[i+1][j]=((b[i+1][j]*b[0][0]) - (b[0][j]*b[i+1][0]));
                }              
            }
            
            //Row Calculations :
            for (i = 0; i<=1; i++)
            {             
                for (j = 0; j < 3; j++)
                {
                  a[j][i+1]=((b[j][i+1]*b[0][0]) - (b[0][i]*b[j][i+1]));
                }              
            }
            
            a[0][0] = a[0][0]/a[0][0];
           }
           
           else if(a[0][2]!=0)
           {
             //Column Interchange C1<->C3 :
            for (i=0, x=2 ; i<=2 && x>=0; i++ , x--)
	    {
	      for(j=0;j<3;j++)
	    {
		t[j][i]=a[j][x];
	    }      
            i++;
	    x--;
	    }
            
            for (i=0;i<=2;i++)
	    {
	      for(j=0;j<3;j++)
              {
		a[j][i]=t[j][i];
	      }
	      i++;            
	    }  
            
            //Matrix Transfer :
            for (i = 0; i < 3; i++) 
            {
              for (j = 0; j < 3; j++)
              {
                 b[i][j]=a[i][j];
              }
            } 
            
            //Column Calculations :
            for (i = 0; i<=1; i++)
            {             
                for (j = 0; j < 3; j++)
                {
                  a[i+1][j]=((b[i+1][j]*b[0][0]) - (b[0][j]*b[i+1][0]));
                }              
            }
            
            //Row Calculations :
            for (i = 0; i<=1; i++)
            {              
                for (j = 0; j < 3; j++)
                {
                  a[j][i+1]=((b[j][i+1]*b[0][0]) - (b[0][i]*b[j][i+1]));
                }              
            }
            a[0][0] = a[0][0]/a[0][0];
           }
        }
        else
        {
            //Matrix Transfer :
            for (i = 0; i < 3; i++) 
            {
              for (j = 0; j < 3; j++)
              {
                 b[i][j]=a[i][j];
              }
            } 
            
            //Column Calculations :
            for (i = 0; i<=1; i++)
            {            
                for (j = 0; j < 3; j++)
                {
                  a[i+1][j]=((b[i+1][j]*b[0][0]) - (b[0][j]*b[i+1][0]));
                }              
            }
            
            //Row Calculations :
            for (i = 0; i<=1; i++)
            {
                for (j = 0; j < 3; j++)
                {
                  a[j][i+1]=((b[j][i+1]*b[0][0]) - (b[0][i]*b[j][i+1]));
                }              
            }
            a[0][0] = a[0][0]/a[0][0];
        }
        
        //For 2nd Γ :
        if(a[1][1]==0)
        {
            if(a[2][1]!=0)
            {
             //Row Interchange R2<->R3 :
             for (i=1,x=2;i<=2 && x>=0;i++,x--)
	     {
	       for(j=1;j<=1;j++)
	       {
		 t[i][j]=a[x][j];
	       }
	     }
             
	     for (i=1;i<=2;i++)
	     {
	      for(j=1;j<=1;j++)
	      {
		a[i][j]=t[i][j];
	      }
	     } 
             
             //Matrix Transfer :
             for (i = 0; i < 3; i++) 
             {
              for (j = 0; j < 3; j++)
              {
                 b[i][j]=a[i][j];
              }
             } 
            
             //Column Calculations :
             for(i=2;i<=2;i++)
             {
                 for(j=1;j<=1;j++)
                 {
                     a[i][j]=((b[i][j]*b[1][1]) - (b[1][j]*b[i][j]));
                 }
             }
             
             //Row Calculations :
             for(i=1;i<=1;i++)
             {
                 for(j=1;j<=1;j++)
                 {
                     a[i][j+1]=((b[i][j+1]*b[1][1]) - (b[1][j]*b[i][j+1]));
                 }
             }
             
             a[1][1] = a[1][1]/a[1][1];
            }
            
            else if(a[1][2]!=0) 
            {
              //Column Interchange C1<->C3 :
              for (i=1, x=2 ; i<=2 && x>0; i++ , x--)
	      {
	       for(j=1;j<=1;j--)
	       {
		 t[j][i]=a[j][x];
	       }
	      }
              
              for (i=1;i<=2;i++)
	      {
	       for(j=1;j<3;j++)
               {
		 a[j][i]=t[j][i];
	       }
	      }
              
              //Matrix Transfer :
              for (i = 0; i < 3; i++) 
              {
               for (j = 0; j < 3; j++)
               {
                  b[i][j]=a[i][j];
               }
              } 
            
              //Column Calculations :
              for(i=2;i<=2;i++)
              {
                 for(j=1;j<=1;j++)
                 {
                     a[i][j]=((b[i][j]*b[1][1]) - (b[1][j]*b[i][j]));
                 }
              }
              
              //Row Calculations :
              for(i=1;i<=1;i++)
              {
                  for(j=1;j<=1;j++)
                  {
                      a[i][j+1]=((b[i][j+1]*b[1][1]) - (b[1][j]*b[i][j+1]));
                  }
              }
              
              a[1][1] = a[1][1]/a[1][1];
            }
            
            else if(a[2][2]==0)
            {
                a[2][2] = a[2][2];
            }
        }
            
            else
            {
              //Matrix Transfer :
              for (i = 0; i < 3; i++) 
              {
               for (j = 0; j < 3; j++)
               {
                  b[i][j]=a[i][j];
               }
              }   
            
             //Column Calculations :   
             for(i=2;i<=2;i++)
             {
                 for(j=1;j<=1;j++)
                 {
                     a[i][j]=((b[i][j]*b[1][1]) - (b[1][j]*b[i][j]));
                 }
             }
             
             //Row Calculations :
             for(i=1;i<=1;i++)
             {
                 for(j=1;j<=1;j++)
                 {
                     a[i][j+1]=((b[i][j+1]*b[1][1]) - (b[1][j]*b[i][j+1]));
                 }
             }
             
             a[1][1] = a[1][1]/a[1][1];
            }
        
            //For 3rd Γ :
            if(a[2][2]!=0)
            {
                a[2][2] = a[2][2]/a[2][2];
                a[2][2] = a[2][2];
            }
            else
            {
                
                a[2][2] = a[2][2];
            }
            
            //End Of Normal Form Method.
            
            //Display Of result: 
            System.out.println("Normal Form Of Matrix: ");
            for(i = 0; i < 3; i++){
                for(j = 0; j < 3; j++){
                   System.out.print(" "+a[i][j]);
               }
               System.out.println(" ");
            }
            
            //Rank finding :
            if(a[0][0]==1 && a[1][1]==1 && a[2][2]==1)
            {
                System.out.print("Rank Of Matrix: 3");
            }
            else if(a[0][0]==1 && a[1][1]==1)
            {
                System.out.print("Rank Of Matrix: 2");
            }
            else
            {
                System.out.print("Rank Of Matrix: 1");
            }
    }
    
    public void EchelonForm(){
        int[][] a = new int[3][3];
        int[][] t = new int[3][3];
        int[][] b = new int[3][3];
        int i,j,x;
        Scanner s = new Scanner(System.in);
        
        //Matrix Calling:
        System.out.println("Enter the matrix elements: ");
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++){
                a[i][j] = s.nextInt();
            }
        }
        
        //Display Of matrix:
        System.out.println("The Entered matrix: ");
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++){
                System.out.print(" "+a[i][j]);
            }
             System.out.println(" ");
        }  
        
        //Echelon method start :
        
        for (i = 0; i < 3; i++){
             for (j = 0; j < 3; j++){
                b[i][j]=a[i][j];
            }
        }
        
        for (i=0 ;i<3;i++){
            
          if (a[0][0]==0){
              
            if(a[1][0]!=0){
                
                //Row-1 interchange with Row-2:
                for (i=0, x=1 ; i<=1 && x>=0; i++,x--){
                    
                    for(j=0;j<3;j++){
                        t[i][j]=a[x][j];
                    }
                }
            
                for (i = 0; i<=1; i++){
                    
                    for(j = 0; j<3; j++){
                        a[i][j]=t[i][j];
                    }
                }
            }
           
            else if(a[2][0]!=0){
                
                //Row-1 interchange with Row-3:
                for (i=0, x=2 ; i<=2 && x>=0; i++ , x--){
                    
                    for(j=0; j<3; j++){
                        t[i][j]=a[x][j];
                    }
                    i++;
                    x--;
                }
                
                for (i=0; i<=2; i++){
                    
                    for(j=0;j<3;j++){
                        a[i][j]=t[i][j];
                    }
                    i++;
                }
            }
        }
          
        if(a[1][0]==0&&a[1][1]==0&&a[2][0]==0&&a[2][1]!=0){
            
            //Row-2 interchange with Row-3:
            for (i=1, x=2 ; i<=2 && x>0; i++,x--){
                
		for(j=0; j<3; j++){
                    t[i][j]=a[x][j];
		}
            }
            
            for (i=1; i<3; i++){
                
		for(j=0; j<3; j++){
                    a[i][j]=t[i][j];
		}
            }
        }
         
        if(a[1][0]==0&&a[1][1]==0&&a[2][0]!=0&&a[2][1]!=0){
            
            //Row-2 interchange with Row-3:
            for (i=1, x=2 ; i<=2 && x>0; i++,x--){
                
		for(j=0; j<3; j++){
                    t[i][j]=a[x][j];
		}
            }
            
            for (i=1; i<3; i++){
                
		for(j=0; j<3; j++){
                    a[i][j]=t[i][j];
		}
            }
        }
    }
        
    //Updating Matrix:
    for (i = 0; i < 3; i++){
         for (j = 0; j < 3; j++){
            b[i][j]=a[i][j];
        }
    }
   
    //row2:
    /*Updating Matrix
    for (i = 0; i < 3; i++){
        for (j = 0; j < 3; j++){
            b[i][j]=a[i][j];
        }
    }*/
    
    if(a[1][0]!=0)
    {
        for (i = 0; i < 1; i++){
            if((b[i][0]>0 && b[i+1][0]>0)||(b[i][0]<0 && b[i+1][0]<0)){
                
                for (j = 0; j < 3; j++){   
                    a[i+1][j]=((b[i+1][j] * b[0][0]) - (b[0][j]*b[i+1][0]));
                }
            }
            
            else{
                for (j = 0; j < 3; j++){  
                    a[i+1][j]=((b[i+1][j] * b[0][0]) + (b[0][j]*b[i+1][0]));
                }
            }
        }
    }
    
    //Updating Matrix:
    for (i = 0; i < 3; i++){
        for (j = 0; j < 3; j++){
            b[i][j]=a[i][j];
        }   
    }
    
    if (a[0][0]==0){
        
        if(a[1][0]!=0){
    
            //Row-1 interchange with Row-2:
            for (i=0, x=1; i<=1 && x>=0; i++,x--){
                for(j=0; j<3; j++){
                    t[i][j]=a[x][j];
                }
            }
            
            for (i=0; i<=1; i++){
                
                for(j=0; j<3; j++){
                    a[i][j]=t[i][j];
              	}
            }
        }
        
        else if(a[2][0]!=0){
            
            //Row-1 interchange Row-3:
            for (i=0, x=2 ; i<=2 && x>=0; i++ , x--){
                for(j=0; j<3; j++){
                    t[i][j]=a[x][j];
                }
                i++;
                x--;
            }
        
            for (i=0; i<=2; i++){   
                for(j=0;j<3;j++){
                    a[i][j]=t[i][j];
                }
                i++;
            }
        }
    }
    
    if(a[1][0]==0&&a[1][1]==0&&a[2][0]==0&&a[2][1]!=0){
        
        //Row-2 interchange with Row-3:
        for (i=1, x=2 ; i<=2 && x>0; i++,x--){
            for(j=0; j<3; j++){
               	t[i][j]=a[x][j];
            }
        }
        
        for (i=1; i<3; i++){
            for(j=0; j<3; j++){
                a[i][j]=t[i][j];
            }
        }   
    }
    
    if(a[1][0]==0&&a[1][1]==0&&a[2][0]!=0&&a[2][1]!=0){

        //Row-2 interchange with Row-3:
        for (i=1, x=2 ; i<=2 && x>0; i++,x--){   
            for(j=0; j<3; j++){
                t[i][j]=a[x][j];
            }
        }
        
        for (i=1; i<3; i++){
            for(j=0; j<3; j++){
               	a[i][j]=t[i][j];
            }
        }
    }
  
    if(a[2][0]!=0){
        for (i = 0; i < 1; i++){
            if((b[i][0]>0 && b[i+2][0]>0)||(b[i][0]<0 && b[i+2][0]<0)){
                        
                for (j = 0; j < 3; j++){
                    a[i+2][j]=((b[i+2][j] * b[0][0]) - (b[0][j]*b[i+2][0]));
                }
            }
            
            else{
                for (j = 0; j < 3; j++){
                    a[i+2][j]=((b[i+2][j] * b[0][0]) + (b[0][j]*b[i+2][0]));
                }
            }
        }
    } 
    
    //Updating Matrix:
    for (i = 0; i < 3; i++) {
        for (j = 0; j < 3; j++){
            b[i][j]=a[i][j];
        }
    }
    
    if (a[0][0]==0){
        if(a[1][0]!=0){
            
            //Row-1 interchange with Row-2:
            for (i=0, x=1 ; i<=1 && x>=0; i++,x--){
                
                for(j=0; j<3; j++){
                    t[i][j]=a[x][j];
                }
            }
            
            for (i=0; i<=1; i++){
                
                for(j=0; j<3; j++){
                    a[i][j]=t[i][j];
                }
            }
        }
        
        else if(a[2][0]!=0){

            //Row-1 interchange with Row-3:
            for (i=0, x=2 ; i<=2 && x>=0; i++ , x--){   
    
                for(j=0; j<3; j++){
                    t[i][j]=a[x][j];
                }
                i++;
                x--;
            }
            
            for (i=0; i<=2; i++){
                for(j=0; j<3; j++){
                    a[i][j]=t[i][j];
                }
                i++;
            }
        }
    }
    
    if(a[1][0]==0&&a[1][1]==0&&a[2][0]==0&&a[2][1]!=0){
        
        //Row-2 interchange with Row-3:
        for (i=1, x=2 ; i<=2 && x>0; i++,x--){
            for(j=0;j<3;j++){
		t[i][j]=a[x][j];
            }
	}
        
	for (i=1; i<3; i++){
            for(j=0; j<3; j++){
		a[i][j]=t[i][j];
            }
	}
    }
    
    if(a[1][0]==0&&a[1][1]==0&&a[2][0]!=0&&a[2][1]!=0){
        
        //Row-2 interchange with Row-3:
        for (i=1, x=2 ; i<=2 && x>0; i++,x--){
            for(j=0; j<3; j++){
		t[i][j]=a[x][j];
            }
	}
        
	for (i=1; i<3; i++){
            for(j=0; j<3; j++){
                a[i][j]=t[i][j];
            }
	}
    }

    //row3:
    
    //Updating Matrix:
    for (i = 0; i < 3; i++){
        for (j = 0; j < 3; j++){
            b[i][j]=a[i][j];
        }
    }
    
    if(a[2][1]!=0){
    
        for (i = 1; i < 2; i++){
            if((b[i][1]>0 && b[i+1][1]>0)||(b[i][1]<0 && b[i+1][1]<0)){
                for (j = 0; j < 3; j++){
                    a[i+1][j]=((b[i+1][j] * b[1][1]) - (b[i][j]*b[2][1]));
                }
            }
        
            else{
                for (j = 0; j < 3; j++){
                    a[i+1][j]=((b[i+1][j] * b[1][1]) + (b[i][j]*b[2][1]));
                }
            }
        }
    }
    
    //Updating Matrix:
    for (i = 0; i < 3; i++){
        for (j = 0; j < 3; j++){
            b[i][j]=a[i][j];
        }
    }
    
    if (a[0][0]==0){
            if(a[1][0]!=0){
                
                //Row-1 interchange with Row-2:
                for (i=0, x=1 ; i<=1 && x>=0; i++,x--){
                    for(j=0; j<3; j++){
                        t[i][j]=a[x][j];
                    }
                }
	
                for (i=0; i<=1; i++){
                    for(j=0; j<3; j++){
                        a[i][j]=t[i][j];
                    }
                }
           }
            
            else if(a[2][0]!=0){
                
                //Row-1 interchange with Row-3:
                for (i=0, x=2 ; i<=2 && x>=0; i++ , x--){
                    for(j=0; j<3; j++){
			t[i][j]=a[x][j];
                	}
                    i++;
                    x--;
                }
            
                for (i=0; i<=2; i++){
                    for(j=0; j<3; j++){
			a[i][j]=t[i][j];
                    }
                    i++;
                }   
            }
        }
    
       if(a[1][0]==0&&a[1][1]==0&&a[2][0]==0&&a[2][1]!=0){
           
            //Row-2 interchange with Row-3:
            for (i=1, x=2 ; i<=2 && x>0; i++,x--){
                for(j=0; j<3; j++){
                    t[i][j]=a[x][j];
		}
            }
	
            for (i=1; i<3; i++){
		for(j=0; j<3; j++){
                    a[i][j]=t[i][j];
		}
            }
        }
       
        if(a[1][0]==0&&a[1][1]==0&&a[2][0]!=0&&a[2][1]!=0){
            
            //Row-2 interchange with Row-3:
            for (i=1, x=2 ; i<=2 && x>0; i++,x--){
		for(j=0; j<3; j++){
                    t[i][j]=a[x][j];
		}
            }
	
            for (i=1; i<3; i++){
		for(j=0; j<3; j++){
                    a[i][j]=t[i][j];
		}
            }
        }
    
        if(a[1][0]==0&&a[1][1]!=0&&a[1][2]!=0&&a[2][0]!=0&&a[2][1]==0&&a[2][2]!=0){
            
            //Row-2 interchange with Row-3:
            for (i=1, x=2 ; i<=2 && x>0; i++,x--){
		for(j=0; j<3; j++){
                    t[i][j]=a[x][j];
		}
            }
            
            for (i=1; i<3; i++){
		for(j=0; j<3; j++){
                    a[i][j]=t[i][j];
		}
            }
        }
            if(a[1][0]!=0){
            
            //Goto row-2:
            //Updating Matrix:
            for (i = 0; i < 3; i++){
                for (j = 0; j < 3; j++){
                    b[i][j]=a[i][j];
            }
        }
    
        if(a[1][0]!=0){
            for (i = 0; i < 1; i++){
                if((b[i][0]>0 && b[i+1][0]>0)||(b[i][0]<0 && b[i+1][0]<0)){
                
                    for (j = 0; j < 3; j++){   
                        a[i+1][j]=((b[i+1][j] * b[0][0]) - (b[0][j]*b[i+1][0]));
                    }
                }
            
                else{
                    for (j = 0; j < 3; j++){  
                        a[i+1][j]=((b[i+1][j] * b[0][0]) + (b[0][j]*b[i+1][0]));
                    }
                }
            }
        }
    
        //Updating Matrix:
        for (i = 0; i < 3; i++){
            for (j = 0; j < 3; j++){
                b[i][j]=a[i][j];
            }   
        }
        
        if (a[0][0]==0){
            
            if(a[1][0]!=0){
                
                //Row-1 interchange with Row-2:
                for (i=0, x=1; i<=1 && x>=0; i++,x--){
                    for(j=0; j<3; j++){
                        t[i][j]=a[x][j];
                    }
                }
            
                for (i=0; i<=1; i++){
                
                    for(j=0; j<3; j++){
                        a[i][j]=t[i][j];
                    }
                }
            }
        
            else if(a[2][0]!=0){
            
                //Row-1 interchange Row-3:
                for (i=0, x=2 ; i<=2 && x>=0; i++ , x--){
                    for(j=0; j<3; j++){
                        t[i][j]=a[x][j];
                    }
                    i++;
                    x--;
                }
        
                for (i=0; i<=2; i++){   
                    for(j=0;j<3;j++){
                        a[i][j]=t[i][j];
                    }
                    i++;
                }
            }
        }
    
        if(a[1][0]==0&&a[1][1]==0&&a[2][0]==0&&a[2][1]!=0){
        
            //Row-2 interchange with Row-3:
            for (i=1, x=2 ; i<=2 && x>0; i++,x--){
                for(j=0; j<3; j++){
                    t[i][j]=a[x][j];
                }
            }
        
            for (i=1; i<3; i++){
                for(j=0; j<3; j++){
                    a[i][j]=t[i][j];
                }
            }   
        }
    
        if(a[1][0]==0&&a[1][1]==0&&a[2][0]!=0&&a[2][1]!=0){

            //Row-2 interchange with Row-3:
            for (i=1, x=2 ; i<=2 && x>0; i++,x--){   
                for(j=0; j<3; j++){
                    t[i][j]=a[x][j];
                }
            }
        
            for (i=1; i<3; i++){
                for(j=0; j<3; j++){
                    a[i][j]=t[i][j];
                }
            }
        }
  
        if(a[2][0]!=0){
            for (i = 0; i < 1; i++){
                if((b[i][0]>0 && b[i+2][0]>0)||(b[i][0]<0 && b[i+2][0]<0)){
                        
                    for (j = 0; j < 3; j++){
                        a[i+2][j]=((b[i+2][j] * b[0][0]) - (b[0][j]*b[i+2][0]));
                    }
                }
            
                else{
                    for (j = 0; j < 3; j++){
                        a[i+2][j]=((b[i+2][j] * b[0][0]) + (b[0][j]*b[i+2][0]));
                    }
                }
            }
        }    
    
        //Updating Matrix:
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++){
                b[i][j]=a[i][j];
            }
        }
    
        if (a[0][0]==0){
            if(a[1][0]!=0){
            
                //Row-1 interchange with Row-2:
                for (i=0, x=1 ; i<=1 && x>=0; i++,x--){
                
                    for(j=0; j<3; j++){
                        t[i][j]=a[x][j];
                    }
                }
            
                for (i=0; i<=1; i++){
                
                    for(j=0; j<3; j++){
                        a[i][j]=t[i][j];
                    }
                }
            }
        
            else if(a[2][0]!=0){

                //Row-1 interchange with Row-3:
                for (i=0, x=2 ; i<=2 && x>=0; i++ , x--){   
    
                    for(j=0; j<3; j++){
                        t[i][j]=a[x][j];
                    }
                    i++;
                    x--;
                }
                
                for (i=0; i<=2; i++){
                    for(j=0; j<3; j++){
                        a[i][j]=t[i][j];
                    }
                    i++;
                }
            }
        }
    
        if(a[1][0]==0&&a[1][1]==0&&a[2][0]==0&&a[2][1]!=0){
        
            //Row-2 interchange with Row-3:
            for (i=1, x=2 ; i<=2 && x>0; i++,x--){
                for(j=0;j<3;j++){
                    t[i][j]=a[x][j];
                }
            }
        
            for (i=1; i<3; i++){
                for(j=0; j<3; j++){
                    a[i][j]=t[i][j];
                }
            }
        }
    
        if(a[1][0]==0&&a[1][1]==0&&a[2][0]!=0&&a[2][1]!=0){
        
            //Row-2 interchange with Row-3:
            for (i=1, x=2 ; i<=2 && x>0; i++,x--){
                for(j=0; j<3; j++){
                    t[i][j]=a[x][j];
                }
            }
        
            for (i=1; i<3; i++){
                for(j=0; j<3; j++){
                    a[i][j]=t[i][j];
                }
            }
        }
        //Check start 
        //Goto row-3:
    //Updating Matrix:
    for (i = 0; i < 3; i++){
        for (j = 0; j < 3; j++){
            b[i][j]=a[i][j];
        }
    }
    
    if(a[2][1]!=0){
    
        for (i = 1; i < 2; i++){
            if((b[i][1]>0 && b[i+1][1]>0)||(b[i][1]<0 && b[i+1][1]<0)){
                for (j = 0; j < 3; j++){
                    a[i+1][j]=((b[i+1][j] * b[1][1]) - (b[i][j]*b[2][1]));
                }
            }
        
            else{
                for (j = 0; j < 3; j++){
                    a[i+1][j]=((b[i+1][j] * b[1][1]) + (b[i][j]*b[2][1]));
                }
            }
        }
    }
    
    //Updating Matrix:
    for (i = 0; i < 3; i++){
        for (j = 0; j < 3; j++){
            b[i][j]=a[i][j];
        }
    }
    
    if (a[0][0]==0){
            if(a[1][0]!=0){
                
                //Row-1 interchange with Row-2:
                for (i=0, x=1 ; i<=1 && x>=0; i++,x--){
                    for(j=0; j<3; j++){
                        t[i][j]=a[x][j];
                    }
                }
	
                for (i=0; i<=1; i++){
                    for(j=0; j<3; j++){
                        a[i][j]=t[i][j];
                    }
                }
           }
            
            else if(a[2][0]!=0){
                
                //Row-1 interchange with Row-3:
                for (i=0, x=2 ; i<=2 && x>=0; i++ , x--){
                    for(j=0; j<3; j++){
			t[i][j]=a[x][j];
                	}
                    i++;
                    x--;
                }
            
                for (i=0; i<=2; i++){
                    for(j=0; j<3; j++){
			a[i][j]=t[i][j];
                    }
                    i++;
                }   
            }
            
            //Check
            if(a[1][0]==0&&a[1][1]==0&&a[2][0]==0&&a[2][1]!=0){
           
            //Row-2 interchange with Row-3:
            for (i=1, x=2 ; i<=2 && x>0; i++,x--){
                for(j=0; j<3; j++){
                    t[i][j]=a[x][j];
		}
            }
	
            for (i=1; i<3; i++){
		for(j=0; j<3; j++){
                    a[i][j]=t[i][j];
		}
            }
        }
       
        if(a[1][0]==0&&a[1][1]==0&&a[2][0]!=0&&a[2][1]!=0){
            
            //Row-2 interchange with Row-3:
            for (i=1, x=2 ; i<=2 && x>0; i++,x--){
		for(j=0; j<3; j++){
                    t[i][j]=a[x][j];
		}
            }
	
            for (i=1; i<3; i++){
		for(j=0; j<3; j++){
                    a[i][j]=t[i][j];
		}
            }
        }
    
        if(a[1][0]==0&&a[1][1]!=0&&a[1][2]!=0&&a[2][0]!=0&&a[2][1]==0&&a[2][2]!=0){
            
            //Row-2 interchange with Row-3:
            for (i=1, x=2 ; i<=2 && x>0; i++,x--){
		for(j=0; j<3; j++){
                    t[i][j]=a[x][j];
		}
            }
            
            for (i=1; i<3; i++){
		for(j=0; j<3; j++){
                    a[i][j]=t[i][j];
		}
            }
        }
        //Check end
        }
    //end of goto row-3
        //Check end
    }
        
    if(a[2][0]!=0 || a[2][1]!=0){
                
    //Goto row-3:
    //Updating Matrix:
    for (i = 0; i < 3; i++){
        for (j = 0; j < 3; j++){
            b[i][j]=a[i][j];
        }
    }
    
    if(a[2][1]!=0){
    
        for (i = 1; i < 2; i++){
            if((b[i][1]>0 && b[i+1][1]>0)||(b[i][1]<0 && b[i+1][1]<0)){
                for (j = 0; j < 3; j++){
                    a[i+1][j]=((b[i+1][j] * b[1][1]) - (b[i][j]*b[2][1]));
                }
            }
        
            else{
                for (j = 0; j < 3; j++){
                    a[i+1][j]=((b[i+1][j] * b[1][1]) + (b[i][j]*b[2][1]));
                }
            }
        }
    }
    
    //Updating Matrix:
    for (i = 0; i < 3; i++){
        for (j = 0; j < 3; j++){
            b[i][j]=a[i][j];
        }
    }
    
    if (a[0][0]==0){
            if(a[1][0]!=0){
                
                //Row-1 interchange with Row-2:
                for (i=0, x=1 ; i<=1 && x>=0; i++,x--){
                    for(j=0; j<3; j++){
                        t[i][j]=a[x][j];
                    }
                }
	
                for (i=0; i<=1; i++){
                    for(j=0; j<3; j++){
                        a[i][j]=t[i][j];
                    }
                }
           }
            
            else if(a[2][0]!=0){
                
                //Row-1 interchange with Row-3:
                for (i=0, x=2 ; i<=2 && x>=0; i++ , x--){
                    for(j=0; j<3; j++){
			t[i][j]=a[x][j];
                	}
                    i++;
                    x--;
                }
            
                for (i=0; i<=2; i++){
                    for(j=0; j<3; j++){
			a[i][j]=t[i][j];
                    }
                    i++;
                }   
            }
            
            //Check
            if(a[1][0]==0&&a[1][1]==0&&a[2][0]==0&&a[2][1]!=0){
           
            //Row-2 interchange with Row-3:
            for (i=1, x=2 ; i<=2 && x>0; i++,x--){
                for(j=0; j<3; j++){
                    t[i][j]=a[x][j];
		}
            }
	
            for (i=1; i<3; i++){
		for(j=0; j<3; j++){
                    a[i][j]=t[i][j];
		}
            }
        }
       
        if(a[1][0]==0&&a[1][1]==0&&a[2][0]!=0&&a[2][1]!=0){
            
            //Row-2 interchange with Row-3:
            for (i=1, x=2 ; i<=2 && x>0; i++,x--){
		for(j=0; j<3; j++){
                    t[i][j]=a[x][j];
		}
            }
	
            for (i=1; i<3; i++){
		for(j=0; j<3; j++){
                    a[i][j]=t[i][j];
		}
            }
        }
    
        if(a[1][0]==0&&a[1][1]!=0&&a[1][2]!=0&&a[2][0]!=0&&a[2][1]==0&&a[2][2]!=0){
            
            //Row-2 interchange with Row-3:
            for (i=1, x=2 ; i<=2 && x>0; i++,x--){
		for(j=0; j<3; j++){
                    t[i][j]=a[x][j];
		}
            }
            
            for (i=1; i<3; i++){
		for(j=0; j<3; j++){
                    a[i][j]=t[i][j];
		}
            }
        }
        //Check end
        }
    //end of goto row-3
    } 

    
        //End of echelon form 
    
        //Display Of result:
        System.out.println("Echelon Form: ");
        
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++){
                System.out.print(" "+a[i][j]);
            }
             System.out.println(" ");
        }
    }  
    
    public void CayleyHamiltonEquation(){
        int[][] a = new int[3][3];
        int i, j;
        Scanner s = new Scanner(System.in);
        
        //Matrix Calling:
        System.out.println("Enter the matrix elements: ");
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++){
                a[i][j] = s.nextInt();
            }
        }
        
        //Display Of matrix:
        System.out.println("The Entered matrix: ");
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++){
                System.out.print(" "+a[i][j]);
            }
             System.out.println(" ");
        }  
        
        //To find determinant :
        int det = (a[0][0]*(a[1][1]*a[2][2] - a[1][2]*a[2][1]) - a[0][1]*(a[1][0]*a[2][2] - a[1][2]*a[2][0]) + a[0][2]*(a[1][0]*a[2][1] - a[1][1]*a[2][0]));
        det = det*(-1);

        //To find S1 :
        int S1 = a[0][0]+a[1][1]+a[2][2];
        S1 = S1*(-1);

        //To find S2 :
        int S2 = (a[1][1]*a[2][2] - a[1][2]*a[2][1]) + (a[0][0]*a[2][2] - a[0][2]*a[2][0]) + (a[0][0]*a[1][1] - a[0][1]*a[1][0]);
        
        //Display Of result:
        System.out.println("Cayley Hamilton Equation : " + "λ³" + "("+S1+")"+"λ² + ("+S2+")"+"λ + ("+det+" ) "+"= 0 ");
    }
    
    public void EigenValues(){
        int[][] a = new int[3][3];
        int[][] t1 = new int[3][3];
        int[][] b = new int[3][3];
        int[][] b1 = new int[3][3];
        int [] v = new int[3];
        int i1,j1,y,w=0;
        double e,f,g,h,i,j,k,l,m,n,p,r,s,t,u,x1 = 0,x2 = 0,x3 = 0;
        Scanner s1 = new Scanner(System.in);
        
        //Matrix Calling:
        System.out.println("Enter the matrix elements: ");
        for(i1 = 0; i1 < 3; i1++){
            for(j1 = 0; j1 < 3; j1++){
                a[i1][j1] = s1.nextInt();
            }
        }
        
        //Display Of matrix:
        System.out.println("The Entered matrix: ");
        for(i1 = 0; i1 < 3; i1++){
            for(j1 = 0; j1 < 3; j1++){
                System.out.print(" "+a[i1][j1]);
            }
             System.out.println(" ");
        }  
        
        //To find determinant :
        double det = (a[0][0]*(a[1][1]*a[2][2] - a[1][2]*a[2][1]) - a[0][1]*(a[1][0]*a[2][2] - a[1][2]*a[2][0]) + a[0][2]*(a[1][0]*a[2][1] - a[1][1]*a[2][0]));
        det = det*(-1);

        //To find S1 :
        double S1 = a[0][0]+a[1][1]+a[2][2];
        S1 = S1*(-1);

        //To find S2 :
        double S2 = (a[1][1]*a[2][2] - a[1][2]*a[2][1]) + (a[0][0]*a[2][2] - a[0][2]*a[2][0]) + (a[0][0]*a[1][1] - a[0][1]*a[1][0]);
        
        //Finding roots :     
        e=2.7182818284590;
        f=((3*S2/1)-(S1*S1/(1*1)))/3; // ** bracketed (a*a)!
        g=((2*S1*S1*S1/(1*1*1))-(9*S1*S2/(1*1))+(27*det/1))/27; // ** brackets!
        h=(g*g/4)+(f*f*f/27);
        i=Math.sqrt(((g*g/4)-h));  
        j=Math.exp(Math.log10(i)/Math.log10(e)/3);
        k=Math.acos((-1)*(g/(2*i)));
        l=j*(-1);
        m=Math.cos(k/3);
        n=Math.sqrt(3)*Math.sin(k/3);
        p=(S1/3*1)*(-1);
        r=(-1)*(g/2)+Math.sqrt(h);
        s=Math.exp(Math.log10(r)/Math.log10(e)/3);
        t=(-1)*(g/2)-Math.sqrt(h);
        u=Math.exp(Math.log10(t)/Math.log10(e)/3);
 
        if (h>0)w=1;
        if (h<=0)w=3;
        if ((f==0) && (g==0) && (h==0))w=2;

        switch ( w )
        {
            case 1:
               x1=(s+u)-(S1/3*1);
               x2=(-1)*(s+u)/2-(S1/3*1);
               x3=(s-u)*Math.sqrt(3)/2;
               int R1 = (int) Math.round(x1);
               int R2 = (int) Math.round(x2);
               int R3 = (int) Math.round(x3);
               System.out.println("Eigen Values: " +R1+ "," +R2+ "," +R3);
               break;
            
            case 2:
                x1=Math.exp(Math.log10(det/1)/Math.log10(e)/3)*(-1);
                x2=0;
                x3=0;
                int R4 = (int) Math.round(x1);
                int R5 = (int) Math.round(x2);
                int R6 = (int) Math.round(x3);
                System.out.println("Eigen Values: "+R4+","+R5+","+R6);
                break;

            case 3:
                x1=2*j*Math.cos(k/3)-(S1/3*1);
                x2=l*(m+n)+p;
                x3=l*(m-n)+p;
                int R7 = (int) Math.round(x1);
                int R8 = (int) Math.round(x2);
                int R9 = (int) Math.round(x3);
                System.out.println("Eigen Values: "+R7+","+R8+","+R9);
                break;
        }        
        
        //Finding Eigen vectors:
        for(i1 = 0; i1 < 3; i1++){
            for(j1 = 0; j1 < 3; j1++){
                if(i1==j1){
                    System.out.println("Enter the Eigen Values again : ");
                    b[i1][j1] = s1.nextInt();
                }
                else{
                    b[i1][j1] = 0;
                }
            }
        }
        
        //Start:
        //Flushing vector array:
        for(i1 = 0 ; i1 < 3; i1++){
            v[i1] = 0;
        }
        
        for (i1 = 0; i1 < 3; i1++){
             for (j1 = 0; j1 < 3; j1++){
                 if(i1==j1){
                    a[i1][j1] = a[i1][j1] - b[0][0];
                 }
                else{
                    a[i1][j1] = a[i1][j1];
                }
                
            }
        }
        
        //Echelon method start :
        
        for (i1 = 0; i1 < 3; i1++){
             for (j1 = 0; j1 < 3; j1++){
                b1[i1][j1]=a[i1][j1];
            }
        }
        
        for (i1=0 ;i1<3;i1++){
            
          if (a[0][0]==0){
              
            if(a[1][0]!=0){
                
                //Row-1 interchange with Row-2:
                for (i1=0, y=1 ; i1<=1 && y>=0; i1++,y--){
                    
                    for(j1=0; j1<3; j1++){
                        t1[i1][j1]=a[y][j1];
                    }
                }
            
                for (i1 = 0; i1<=1; i1++){
                    
                    for(j1 = 0; j1<3; j1++){
                        a[i1][j1]=t1[i1][j1];
                    }
                }
            }
           
            else if(a[2][0]!=0){
                
                //Row-1 interchange with Row-3:
                for (i1=0, y=2 ; i1<=2 && y>=0; i1++ , y--){
                    
                    for(j1=0; j1<3; j1++){
                        t1[i1][j1]=a[y][j1];
                    }
                    i1++;
                    y--;
                }
                
                for (i1=0; i1<=2; i1++){
                    
                    for(j1=0; j1<3; j1++){
                        a[i1][j1]=t1[i1][j1];
                    }
                    i1++;
                }
            }
        }
          
        if(a[1][0]==0&&a[1][1]==0&&a[2][0]==0&&a[2][1]!=0){
            
            //Row-2 interchange with Row-3:
            for (i1=1, y=2 ; i1<=2 && y>0; i1++,y--){
                
		for(j1=0; j1<3; j1++){
                    t1[i1][j1]=a[y][j1];
		}
            }
            
            for (i1=1; i1<3; i1++){
                
		for(j1=0; j1<3; j1++){
                    a[i1][j1]=t1[i1][j1];
		}
            }
        }
         
        if(a[1][0]==0&&a[1][1]==0&&a[2][0]!=0&&a[2][1]!=0){
            
            //Row-2 interchange with Row-3:
            for (i1=1, y=2 ; i1<=2 && y>0; i1++,y--){
                
		for(j1=0; j1<3; j1++){
                    t1[i1][j1]=a[y][j1];
		}
            }
            
            for (i1=1; i1<3; i1++){
                
		for(j1=0; j1<3; j1++){
                    a[i1][j1]=t1[i1][j1];
		}
            }
        }
    }
        
    //Updating Matrix:
    for (i1 = 0; i1 < 3; i1++){
         for (j1 = 0; j1 < 3; j1++){
            b1[i1][j1]=a[i1][j1];
        }
    }
   
    //row2:
    
    if(a[1][0]!=0)
    {
        for (i1 = 0; i1 < 1; i1++){
            if((b1[i1][0]>0 && b[i1+1][0]>0)||(b[i1][0]<0 && b[i1+1][0]<0)){
                
                for (j1 = 0; j1 < 3; j1++){   
                    a[i1+1][j1]=((b1[i1+1][j1] * b1[0][0]) - (b1[0][j1]*b1[i1+1][0]));
                }
            }
            
            else{
                for (j1 = 0; j1 < 3; j1++){  
                    a[i1+1][j1]=((b1[i1+1][j1] * b1[0][0]) + (b1[0][j1]*b1[i1+1][0]));
                }
            }
        }
    }
    
    //Updating Matrix:
    for (i1 = 0; i1 < 3; i1++){
        for (j1 = 0; j1 < 3; j1++){
            b1[i1][j1]=a[i1][j1];
        }   
    }
    
    if (a[0][0]==0){
        
        if(a[1][0]!=0){
    
            //Row-1 interchange with Row-2:
            for (i1=0, y=1; i1<=1 && y>=0; i1++,y--){
                for(j1=0; j1<3; j1++){
                    t1[i1][j1]=a[y][j1];
                }
            }
            
            for (i1=0; i1<=1; i1++){
                
                for(j1=0; j1<3; j1++){
                    a[i1][j1]=t1[i1][j1];
              	}
            }
        }
        
        else if(a[2][0]!=0){
            
            //Row-1 interchange Row-3:
            for (i1=0, y=2 ; i1<=2 && y>=0; i1++ , y--){
                for(j1=0; j1<3; j1++){
                    t1[i1][j1]=a[y][j1];
                }
                i1++;
                y--;
            }
        
            for (i1=0; i1<=2; i1++){   
                for(j1=0; j1<3; j1++){
                    a[i1][j1]=t1[i1][j1];
                }
                i1++;
            }
        }
    }
    
    if(a[1][0]==0&&a[1][1]==0&&a[2][0]==0&&a[2][1]!=0){
        
        //Row-2 interchange with Row-3:
        for (i1=1, y=2 ; i1<=2 && y>0; i1++,y--){
            for(j1=0; j1<3; j1++){
               	t1[i1][j1]=a[y][j1];
            }
        }
        
        for (i1=1; i1<3; i1++){
            for(j1=0; j1<3; j1++){
                a[i1][j1]=t1[i1][j1];
            }
        }   
    }
    
    if(a[1][0]==0&&a[1][1]==0&&a[2][0]!=0&&a[2][1]!=0){

        //Row-2 interchange with Row-3:
        for (i1=1, y=2 ; i1<=2 && y>0; i1++,y--){   
            for(j1=0; j1<3; j1++){
                t1[i1][j1]=a[y][j1];
            }
        }
        
        for (i1=1; i1<3; i1++){
            for(j1=0; j1<3; j1++){
               	a[i1][j1]=t1[i1][j1];
            }
        }
    }
  
    if(a[2][0]!=0){
        for (i1 = 0; i1 < 1; i1++){
            if((b1[i1][0]>0 && b1[i1+2][0]>0)||(b1[i1][0]<0 && b1[i1+2][0]<0)){
                        
                for (j1 = 0; j1 < 3; j1++){
                    a[i1+2][j1]=((b1[i1+2][j1] * b1[0][0]) - (b1[0][j1]*b1[i1+2][0]));
                }
            }
            
            else{
                for (j1 = 0; j1 < 3; j1++){
                    a[i1+2][j1]=((b1[i1+2][j1] * b1[0][0]) + (b1[0][j1]*b1[i1+2][0]));
                }
            }
        }
    } 
    
    //Updating Matrix:
    for (i1 = 0; i1 < 3; i1++) {
        for (j1 = 0; j1 < 3; j1++){
            b1[i1][j1]=a[i1][j1];
        }
    }
    
    if (a[0][0]==0){
        if(a[1][0]!=0){
            
            //Row-1 interchange with Row-2:
            for (i1=0, y=1 ; i1<=1 && y>=0; i1++,y--){
                
                for(j1=0; j1<3; j1++){
                    t1[i1][j1]=a[y][j1];
                }
            }
            
            for (i1=0; i1<=1; i1++){
                
                for(j1=0; j1<3; j1++){
                    a[i1][j1]=t1[i1][j1];
                }
            }
        }
        
        else if(a[2][0]!=0){

            //Row-1 interchange with Row-3:
            for (i1=0, y=2 ; i1<=2 && y>=0; i1++ , y--){   
    
                for(j1=0; j1<3; j1++){
                    t1[i1][j1]=a[y][j1];
                }
                i1++;
                y--;
            }
            
            for (i1=0; i1<=2; i1++){
                for(j1=0; j1<3; j1++){
                    a[i1][j1]=t1[i1][j1];
                }
                i1++;
            }
        }
    }
    
    if(a[1][0]==0&&a[1][1]==0&&a[2][0]==0&&a[2][1]!=0){
        
        //Row-2 interchange with Row-3:
        for (i1=1, y=2 ; i1<=2 && y>0; i1++,y--){
            for(j1=0; j1<3; j1++){
		t1[i1][j1]=a[y][j1];
            }
	}
        
	for (i1=1; i1<3; i1++){
            for(j1=0; j1<3; j1++){
		a[i1][j1]=t1[i1][j1];
            }
	}
    }
    
    if(a[1][0]==0&&a[1][1]==0&&a[2][0]!=0&&a[2][1]!=0){
        
        //Row-2 interchange with Row-3:
        for (i1=1, y=2 ; i1<=2 && y>0; i1++,y--){
            for(j1=0; j1<3; j1++){
		t1[i1][j1]=a[y][j1];
            }
	}
        
	for (i1=1; i1<3; i1++){
            for(j1=0; j1<3; j1++){
                a[i1][j1]=t1[i1][j1];
            }
	}
    }

    //row3:
    
    //Updating Matrix:
    for (i1 = 0; i1 < 3; i1++){
        for (j1 = 0; j1 < 3; j1++){
            b1[i1][j1]=a[i1][j1];
        }
    }
    
    if(a[2][1]!=0){
    
        for (i1 = 1; i1 < 2; i1++){
            if((b1[i1][1]>0 && b1[i1+1][1]>0)||(b1[i1][1]<0 && b1[i1+1][1]<0)){
                for (j1 = 0; j1 < 3; j1++){
                    a[i1+1][j1]=((b1[i1+1][j1] * b1[1][1]) - (b1[i1][j1]*b1[2][1]));
                }
            }
        
            else{
                for (j1 = 0; j1 < 3; j1++){
                    a[i1+1][j1]=((b1[i1+1][j1] * b1[1][1]) + (b1[i1][j1]*b1[2][1]));
                }
            }
        }
    }
    
    //Updating Matrix:
    for (i1 = 0; i1 < 3; i1++){
        for (j1 = 0; j1 < 3; j1++){
            b1[i1][j1]=a[i1][j1];
        }
    }
    
    if (a[0][0]==0){
            if(a[1][0]!=0){
                
                //Row-1 interchange with Row-2:
                for (i1=0, y=1 ; i1<=1 && y>=0; i1++,y--){
                    for(j1=0; j1<3; j1++){
                        t1[i1][j1]=a[y][j1];
                    }
                }
	
                for (i1=0; i1<=1; i1++){
                    for(j1=0; j1<3; j1++){
                        a[i1][j1]=t1[i1][j1];
                    }
                }
           }
            
            else if(a[2][0]!=0){
                
                //Row-1 interchange with Row-3:
                for (i1=0, y=2 ; i1<=2 && y>=0; i1++ , y--){
                    for(j1=0; j1<3; j1++){
			t1[i1][j1]=a[y][j1];
                    }
                    i1++;
                    y--;
                }
            
                for (i1=0; i1<=2; i1++){
                    for(j1=0; j1<3; j1++){
			a[i1][j1]=t1[i1][j1];
                    }
                    i1++;
                }   
            }
        }
    
       if(a[1][0]==0&&a[1][1]==0&&a[2][0]==0&&a[2][1]!=0){
           
            //Row-2 interchange with Row-3:
            for (i1=1, y=2 ; i1<=2 && y>0; i1++,y--){
                for(j1=0; j1<3; j1++){
                    t1[i1][j1]=a[y][j1];
		}
            }
	
            for (i1=1; i1<3; i1++){
		for(j1=0; j1<3; j1++){
                    a[i1][j1]=t1[i1][j1];
		}
            }
        }
       
        if(a[1][0]==0&&a[1][1]==0&&a[2][0]!=0&&a[2][1]!=0){
            
            //Row-2 interchange with Row-3:
            for (i1=1, y=2 ; i1<=2 && y>0; i1++,y--){
		for(j1=0; j1<3; j1++){
                    t1[i1][j1]=a[y][j1];
		}
            }
	
            for (i1=1; i1<3; i1++){
		for(j1=0; j1<3; j1++){
                    a[i1][j1]=t1[i1][j1];
		}
            }
        }
    
        if(a[1][0]==0&&a[1][1]!=0&&a[1][2]!=0&&a[2][0]!=0&&a[2][1]==0&&a[2][2]!=0){
            
            //Row-2 interchange with Row-3:
            for (i1=1, y=2 ; i1<=2 && y>0; i1++,y--){
		for(j1=0; j1<3; j1++){
                    t1[i1][j1]=a[y][j1];
		}
            }
            
            for (i1=1; i1<3; i1++){
		for(j1=0; j1<3; j1++){
                    a[i1][j1]=t1[i1][j1];
		}
            }
        }
            if(a[1][0]!=0){
            
            //Goto row-2:
            //Updating Matrix:
            for (i1 = 0; i1 < 3; i1++){
                for (j1 = 0; j1 < 3; j1++){
                    b1[i1][j1]=a[i1][j1];
            }
        }
    
        if(a[1][0]!=0){
            for (i1 = 0; i1 < 1; i1++){
                if((b1[i1][0]>0 && b1[i1+1][0]>0)||(b1[i1][0]<0 && b1[i1+1][0]<0)){
                
                    for (j1 = 0; j1 < 3; j1++){   
                        a[i1+1][j1]=((b1[i1+1][j1] * b1[0][0]) - (b1[0][j1]*b1[i1+1][0]));
                    }
                }
            
                else{
                    for (j1 = 0; j1 < 3; j1++){  
                        a[i1+1][j1]=((b1[i1+1][j1] * b1[0][0]) + (b1[0][j1]*b1[i1+1][0]));
                    }
                }
            }
        }
    
        //Updating Matrix:
        for (i1 = 0; i1 < 3; i1++){
            for (j1 = 0; j1 < 3; j1++){
                b1[i1][j1]=a[i1][j1];
            }   
        }
        
        if (a[0][0]==0){
            
            if(a[1][0]!=0){
                
                //Row-1 interchange with Row-2:
                for (i1=0, y=1; i1<=1 && y>=0; i1++,y--){
                    for(j1=0; j1<3; j1++){
                        t1[i1][j1]=a[y][j1];
                    }
                }
            
                for (i1=0; i1<=1; i1++){
                
                    for(j1=0; j1<3; j1++){
                        a[i1][j1]=t1[i1][j1];
                    }
                }
            }
        
            else if(a[2][0]!=0){
            
                //Row-1 interchange Row-3:
                for (i1=0, y=2 ; i1<=2 && y>=0; i1++ , y--){
                    for(j1=0; j1<3; j1++){
                        t1[i1][j1]=a[y][j1];
                    }
                    i1++;
                    y--;
                }
        
                for (i1=0; i1<=2; i1++){   
                    for(j1=0; j1<3; j1++){
                        a[i1][j1]=t1[i1][j1];
                    }
                    i1++;
                }
            }
        }
    
        if(a[1][0]==0&&a[1][1]==0&&a[2][0]==0&&a[2][1]!=0){
        
            //Row-2 interchange with Row-3:
            for (i1=1, y=2 ; i1<=2 && y>0; i1++,y--){
                for(j1=0; j1<3; j1++){
                    t1[i1][j1]=a[y][j1];
                }
            }
        
            for (i1=1; i1<3; i1++){
                for(j1=0; j1<3; j1++){
                    a[i1][j1]=t1[i1][j1];
                }
            }   
        }
    
        if(a[1][0]==0&&a[1][1]==0&&a[2][0]!=0&&a[2][1]!=0){

            //Row-2 interchange with Row-3:
            for (i1=1, y=2 ; i1<=2 && y>0; i1++,y--){   
                for(j1=0; j1<3; j1++){
                    t1[i1][j1]=a[y][j1];
                }
            }
        
            for (i1=1; i1<3; i1++){
                for(j1=0; j1<3; j1++){
                    a[i1][j1]=t1[i1][j1];
                }
            }
        }
  
        if(a[2][0]!=0){
            for (i1 = 0; i1 < 1; i1++){
                if((b1[i1][0]>0 && b1[i1+2][0]>0)||(b1[i1][0]<0 && b1[i1+2][0]<0)){
                        
                    for (j1 = 0; j1 < 3; j1++){
                        a[i1+2][j1]=((b1[i1+2][j1] * b1[0][0]) - (b1[0][j1]*b1[i1+2][0]));
                    }
                }
            
                else{
                    for (j1 = 0; j1 < 3; j1++){
                        a[i1+2][j1]=((b1[i1+2][j1] * b1[0][0]) + (b1[0][j1]*b1[i1+2][0]));
                    }
                }
            }
        }    
    
        //Updating Matrix:
        for (i1 = 0; i1 < 3; i1++) {
            for (j1 = 0; j1 < 3; j1++){
                b1[i1][j1]=a[i1][j1];
            }
        }
    
        if (a[0][0]==0){
            if(a[1][0]!=0){
            
                //Row-1 interchange with Row-2:
                for (i1=0, y=1 ; i1<=1 && y>=0; i1++,y--){
                
                    for(j1=0; j1<3; j1++){
                        t1[i1][j1]=a[y][j1];
                    }
                }
            
                for (i1=0; i1<=1; i1++){
                
                    for(j1=0; j1<3; j1++){
                        a[i1][j1]=t1[i1][j1];
                    }
                }
            }
        
            else if(a[2][0]!=0){

                //Row-1 interchange with Row-3:
                for (i1=0, y=2 ; i1<=2 && y>=0; i1++ , y--){   
    
                    for(j1=0; j1<3; j1++){
                        t1[i1][j1]=a[y][j1];
                    }
                    i1++;
                    y--;
                }
                
                for (i1=0; i1<=2; i1++){
                    for(j1=0; j1<3; j1++){
                        a[i1][j1]=t1[i1][j1];
                    }
                    i1++;
                }
            }
        }
    
        if(a[1][0]==0&&a[1][1]==0&&a[2][0]==0&&a[2][1]!=0){
        
            //Row-2 interchange with Row-3:
            for (i1=1, y=2 ; i1<=2 && y>0; i1++,y--){
                for(j1=0; j1<3; j1++){
                    t1[i1][j1]=a[y][j1];
                }
            }
        
            for (i1=1; i1<3; i1++){
                for(j1=0; j1<3; j1++){
                    a[i1][j1]=t1[i1][j1];
                }
            }
        }
    
        if(a[1][0]==0&&a[1][1]==0&&a[2][0]!=0&&a[2][1]!=0){
        
            //Row-2 interchange with Row-3:
            for (i1=1, y=2 ; i1<=2 && y>0; i1++,y--){
                for(j1=0; j1<3; j1++){
                    t1[i1][j1]=a[y][j1];
                }
            }
        
            for (i1=1; i1<3; i1++){
                for(j1=0; j1<3; j1++){
                    a[i1][j1]=t1[i1][j1];
                }
            }
        }
        //Check start 
        //Goto row-3:
    //Updating Matrix:
    for (i1 = 0; i1 < 3; i1++){
        for (j1 = 0; j1 < 3; j1++){
            b1[i1][j1]=a[i1][j1];
        }
    }
    
    if(a[2][1]!=0){
    
        for (i1 = 1; i1 < 2; i1++){
            if((b1[i1][1]>0 && b1[i1+1][1]>0)||(b1[i1][1]<0 && b1[i1+1][1]<0)){
                for (j1 = 0; j1 < 3; j1++){
                    a[i1+1][j1]=((b1[i1+1][j1] * b1[1][1]) - (b1[i1][j1]*b1[2][1]));
                }
            }
        
            else{
                for (j1 = 0; j1 < 3; j1++){
                    a[i1+1][j1]=((b1[i1+1][j1] * b1[1][1]) + (b1[i1][j1]*b1[2][1]));
                }
            }
        }
    }
    
    //Updating Matrix:
    for (i1 = 0; i1 < 3; i1++){
        for (j1 = 0; j1 < 3; j1++){
            b1[i1][j1]=a[i1][j1];
        }
    }
    
    if (a[0][0]==0){
            if(a[1][0]!=0){
                
                //Row-1 interchange with Row-2:
                for (i1=0, y=1 ; i1<=1 && y>=0; i1++,y--){
                    for(j1=0; j1<3; j1++){
                        t1[i1][j1]=a[y][j1];
                    }
                }
	
                for (i1=0; i1<=1; i1++){
                    for(j1=0; j1<3; j1++){
                        a[i1][j1]=t1[i1][j1];
                    }
                }
           }
            
            else if(a[2][0]!=0){
                
                //Row-1 interchange with Row-3:
                for (i1=0, y=2 ; i1<=2 && y>=0; i1++ , y--){
                    for(j1=0; j1<3; j1++){
			t1[i1][j1]=a[y][j1];
                    }
                    i1++;
                    y--;
                }
            
                for (i1=0; i1<=2; i1++){
                    for(j1=0; j1<3; j1++){
			a[i1][j1]=t1[i1][j1];
                    }
                    i1++;
                }   
            }
            
            
            //Check
            if(a[1][0]==0&&a[1][1]==0&&a[2][0]==0&&a[2][1]!=0){
           
            //Row-2 interchange with Row-3:
            for (i1=1, y=2 ; i1<=2 && y>0; i1++,y--){
                for(j1=0; j1<3; j1++){
                    t1[i1][j1]=a[y][j1];
		}
            }
	
            for (i1=1; i1<3; i1++){
		for(j1=0; j1<3; j1++){
                    a[i1][j1]=t1[i1][j1];
		}
            }
        }
       
        if(a[1][0]==0&&a[1][1]==0&&a[2][0]!=0&&a[2][1]!=0){
            
            //Row-2 interchange with Row-3:
            for (i1=1, y=2 ; i1<=2 && y>0; i1++,y--){
		for(j1=0; j1<3; j1++){
                    t1[i1][j1]=a[y][j1];
		}
            }
	
            for (i1=1; i1<3; i1++){
		for(j1=0; j1<3; j1++){
                    a[i1][j1]=t1[i1][j1];
		}
            }
        }
    
        if(a[1][0]==0&&a[1][1]!=0&&a[1][2]!=0&&a[2][0]!=0&&a[2][1]==0&&a[2][2]!=0){
            
            //Row-2 interchange with Row-3:
            for (i1=1, y=2 ; i1<=2 && y>0; i1++,y--){
		for(j1=0; j1<3; j1++){
                    t1[i1][j1]=a[y][j1];
		}
            }
            
            for (i1=1; i1<3; i1++){
		for(j1=0; j1<3; j1++){
                    a[i1][j1]=t1[i1][j1];
		}
            }
        }
        //Check end
        }
    //end of goto row-3
        //Check end
    }
        
    if(a[2][0]!=0 || a[2][1]!=0){
                
    //Goto row-3:
    //Updating Matrix:
    for (i1 = 0; i1 < 3; i1++){
        for (j1 = 0; j1 < 3; j1++){
            b1[i1][j1]=a[i1][j1];
        }
    }
    
    if(a[2][1]!=0){
    
        for (i1 = 1; i1 < 2; i1++){
            if((b1[i1][1]>0 && b1[i1+1][1]>0)||(b1[i1][1]<0 && b1[i1+1][1]<0)){
                for (j1 = 0; j1 < 3; j1++){
                    a[i1+1][j1]=((b1[i1+1][j1] * b1[1][1]) - (b1[i1][j1]*b1[2][1]));
                }
            }
        
            else{
                for (j1 = 0; j1 < 3; j1++){
                    a[i1+1][j1]=((b1[i1+1][j1] * b1[1][1]) + (b1[i1][j1]*b1[2][1]));
                }
            }
        }
    }
    
    //Updating Matrix:
    for (i1 = 0; i1 < 3; i1++){
        for (j1 = 0; j1 < 3; j1++){
            b1[i1][j1]=a[i1][j1];
        }
    }
    
    if (a[0][0]==0){
            if(a[1][0]!=0){
                
                //Row-1 interchange with Row-2:
                for (i1=0, y=1 ; i1<=1 && y>=0; i1++,y--){
                    for(j1=0; j1<3; j1++){
                        t1[i1][j1]=a[y][j1];
                    }
                }
	
                for (i1=0; i1<=1; i1++){
                    for(j1=0; j1<3; j1++){
                        a[i1][j1]=t1[i1][j1];
                    }
                }
           }
            
            else if(a[2][0]!=0){
                
                //Row-1 interchange with Row-3:
                for (i1=0, y=2 ; i1<=2 && y>=0; i1++ , y--){
                    for(j1=0; j1<3; j1++){
			t1[i1][j1]=a[y][j1];
                	}
                    i1++;
                    y--;
                }
            
                for (i1=0; i1<=2; i1++){
                    for(j1=0; j1<3; j1++){
			a[i1][j1]=t1[i1][j1];
                    }
                    i1++;
                }   
            }
            
            //Check
            if(a[1][0]==0&&a[1][1]==0&&a[2][0]==0&&a[2][1]!=0){
           
            //Row-2 interchange with Row-3:
            for (i1=1, y=2 ; i1<=2 && y>0; i1++,y--){
                for(j1=0; j1<3; j1++){
                    t1[i1][j1]=a[y][j1];
		}
            }
	
            for (i1=1; i1<3; i1++){
		for(j1=0; j1<3; j1++){
                    a[i1][j1]=t1[i1][j1];
		}
            }
        }
       
        if(a[1][0]==0&&a[1][1]==0&&a[2][0]!=0&&a[2][1]!=0){
            
            //Row-2 interchange with Row-3:
            for (i1=1, y=2 ; i1<=2 && y>0; i1++,y--){
		for(j1=0; j1<3; j1++){
                    t1[i1][j1]=a[y][j1];
		}
            }
	
            for (i1=1; i1<3; i1++){
		for(j1=0; j1<3; j1++){
                    a[i1][j1]=t1[i1][j1];
		}
            }
        }
    
        if(a[1][0]==0&&a[1][1]!=0&&a[1][2]!=0&&a[2][0]!=0&&a[2][1]==0&&a[2][2]!=0){
            
            //Row-2 interchange with Row-3:
            for (i1=1, y=2 ; i1<=2 && y>0; i1++,y--){
		for(j1=0; j1<3; j1++){
                    t1[i1][j1]=a[y][j1];
		}
            }
            
            for (i1=1; i1<3; i1++){
		for(j1=0; j1<3; j1++){
                    a[i1][j1]=t1[i1][j1];
		}
            }
        }
        //Check end
        }
    //end of goto row-3
    } 
    //End of echelon form 
    
        System.out.println("Echelon form");
        for (i1=0; i1<3; i1++){
            for(j1=0; j1<3; j1++){
                System.out.print(" "+a[i1][j1]);
            }
            System.out.println(" ");
        }
        
        v[2] = a[2][2];
        v[1] = (a[1][2]*v[2])/a[1][1];
        v[0] = (a[0][1]*v[1] + a[0][2]*v[2])/a[0][0];
        
        System.out.println("Vector"+1+":");
        for(i1=0; i1<3; i1++){
            System.out.println(" "+v[i1]);
        }
    }
        
    public void Exit(){
        System.out.println("Thank You :) ");
    }
    
}