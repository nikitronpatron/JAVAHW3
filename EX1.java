// 1. Пусть дан произвольный список целых чисел, удалить из него четные числа.

import java.util.ArrayList;
import java.util.Random;

public class EX1
{
    public static void main(String[] args)
    {
        ArrayList<Integer> randList = new ArrayList<Integer>();
        Random rand = new Random();
        for(int i = 0; i < 10; i++)
        {
            int temp = rand.nextInt(100);
            randList.add(temp);
        }
        System.out.println(randList);
        for (int i = 0; i < randList.size(); i++)
        {
            if(randList.get(i) % 2 == 0)
            {
                randList.remove(i);
            }
        }
        System.out.println(randList);
    }
}