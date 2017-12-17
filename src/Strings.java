public class Strings {

    public void trytofind(String a, String find)
    {

        char[] Mass = a.toCharArray();
        char[] Find = find.toCharArray();
        int i = 0, j, k = 0;
        boolean temp;
        while (i < Mass.length)
        {
            temp = true;
            j = 0;

            while ((temp) && (j < Find.length))
            {
                temp = Mass[i] == Find[j];
                i++;
                j++;
            }
            if (temp) {

                k++;
            }
        }
        i = 0;
        while (i < Mass.length)
        {
            System.out.print(Mass[i]);
            i++;

        }
        System.out.println("     the word occurred " + k + " times");

    }

    public void textchange(String a) {
        char[] Mass = a.toCharArray();
        int i = 0, temp = 0;
        boolean r=false;
        if (Mass.length % 2 == 1) r=true;

        while (i < Mass.length)
        {

            if (temp!=2)
            {
                System.out.print(Mass[i]);
            }
            if ((r)&&(Mass[i]==' '))
            {
                temp++;
            }
            i++;
        }
        System.out.println();

    }

}