import java.io.*;
class fileio
{
public static void main(String args[])throws IOException
{
System.out.println("enter something\n");
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String str;
str=br.readLine();
System.out.println("you entered "+str);
}
}