import java.io.*;
class MatrixAdd
{
 int x[][],r,c;
MatrixAdd(int r,int c)
{
 this.r=r;
 this.c=c;
x=new int[r][c];
} 
void input()throws IOException
{
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 for(int i=0;i<r;i++)
 for(int j=0;j<c;j++)
{
 System.out.println("enter ele:");
 x[i][j]=Integer.parseInt(br.readLine());
}
}
void output()
{
 for(int i=0;i<r;i++)
{
 for(int j=0;j<c;j++)
System.out.println("\t"+x[i][j]);
System.out.println(" ");
}
}
void process(MatrixAdd a,MatrixAdd b)
{
for(int i=0;i<r;i++)
 for(int j=0;j<c;j++)
 x[i][j]=a.x[i][j]+b.x[i][j];
} 
}
class MAmain
{
public static void main(String arg[])throws IOException
{ 
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("enter r & c");
 int  r=Integer.parseInt(br.readLine());
  int c=Integer.parseInt(br.readLine());
  MatrixAdd a=new MatrixAdd(r,c);
  MatrixAdd b=new MatrixAdd(r,c);
  MatrixAdd d=new MatrixAdd(r,c);
   a.input();
   b.input();
   d.process(a,b);
   d.output();
}
} 

 