import java.util.Scanner;

public class Driver5Class {


    public static void main(String args[])
    {

        Scanner sc=new Scanner(System.in);

        System.out.println("Reading lines from user to check exception");


        try
        {

            String ch =new String();
            ch =sc.nextLine();

            String[] words = ch.split(" ");

            for(String word:words)
            {
                int length = find_length(word);

                int num = check(length);

                if (num == 0)
                {
                    throw new ExceptionShort("The input "+word+" is too short");

                }
                else if (num == 2)
                {
                    throw new ExceptionLong("The input "+word+" is too long");

                }

                else
                {
                    System.out.println("The input "+word+" is neither too long nor too short");
                }

            }
        }
        catch (ExceptionShort e)
        {
            System.out.println(e);
        }
        catch (ExceptionLong e)
        {
            System.out.println(e);
        }


    }
    public static int find_length(String word)
    {
        char[] a=word.toCharArray();
        int length=0;

        for(char ch:a)
        {
            length++;
        }
        return length;
    }

    public static int check(int length)
    {
        if(length<5)
        {
            return 0;
        }
        else if (length>10)
        {
            return 2;
        }
        else
        {
            return 1;
        }
    }
}
