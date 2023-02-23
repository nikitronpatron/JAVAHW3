// 2. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.

import java.util.ArrayList;
import java.util.Random;

public class EX2
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
        int min = randList.get(0);
        int max = randList.get(0);
        int average = 0;
        for(int i : randList)
        {
            if(i < min)
            {
                min = i;
            }
            if(i > max)
            {
                max = i;
            }
            average += i;
        }
        average = average / 10;
        System.out.printf("Max = %d, min = %d, average = %d.", max, min, average);
    }
}