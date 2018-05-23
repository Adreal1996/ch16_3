package ch16;

/*
Write a java method that could be added to the Linked list class to move the first element of the list to the end of the list.
If the list is empty or has just one element, its contents should not be modified.
 */

public class opg3
{
    public static void main(String[] args)
    {

        LinkedIntList liste = new LinkedIntList();
        liste.add(1);
        liste.add(5);
        liste.add(3);
        liste.add(2);
        liste.firstToLast();
        System.out.println(liste);

    }
}
