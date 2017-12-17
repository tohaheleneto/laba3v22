import java.io.*;
import java.util.Scanner;
public class Program
{    public static void main(String[] args)
    {
        Strings a =new Strings();
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        try
        {
            FileInputStream fstream = new FileInputStream("C:/string/a.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String strLine;
            while ((strLine = br.readLine()) != null)
            {
            a.trytofind(strLine,s);

            }
        }
        catch (IOException e)
        {
            System.out.println("Ошибка");
        }
        try
        {
            FileInputStream fstream = new FileInputStream("C:/string/a.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String strLine;
            while ((strLine = br.readLine()) != null)
            {
                a.textchange(strLine);

            }
        }
        catch (IOException e)
        {
            System.out.println("Ошибка");
        }

    }
}