package finalcode.final_code.finalcode2;

import java.util.ArrayList;
import java.util.List;

public class Game
{
    private boolean win = false;
    private int a = 0;
    private int b = 0;
    private List<Integer> randomNumList = new ArrayList<>();
    private List<Integer> resultList = new ArrayList<>();

    public Game(List<Integer> randomNumList , List<Integer> resultList)
    {
        this.resultList = resultList;
        this.randomNumList= randomNumList;

        for (int i = 0; i < randomNumList.size(); i++) {
            if (resultList.get(i) == randomNumList.get(i)) {
                a++;
            } else {
                for (int j = 0; j < 4; j++) {
                    if (resultList.get(i) == randomNumList.get(j)) {
                        b++;
                    }
                }
            }
        }
        if (getA() == randomNumList.size()) {
            setWin(true);
        }
    }

    public boolean isWin() {
        return win;
    }

    public void setWin(boolean win) {
        this.win = win;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public List<Integer> getRandomNumList(int Num , int Arr) {
        return randomNumList;
    }

    public void setRandomNumList(List<Integer> randomNumList) {
        this.randomNumList = randomNumList;
    }

    public List<Integer> getResultList() {
        return resultList;
    }

    public void setResultList(List<Integer> resultList) {
        this.resultList = resultList;
    }

    public static List<Integer> list(int Num , int Arr)
    {
        List<Integer> RandomNumList = new ArrayList<>();

        int[] num = new int[Num];

        for(int i = 0 ; i<num.length ; i++)
        {
            num[i] = i + 1;
        }

        int[] arr = new int[Arr];
        int n;

        for(int i=0 ; i< arr.length ; i++)
        {
            n = (int) (Math.random()*(Num-i));
            arr[i] = num[n];
            for(int j = n; j < num.length-1 ; j++)
            {
                num[j] = num[j+1];
            }
        }
        for(int a = 0 ; a<Arr ; a++)
        {
            RandomNumList.add(arr[a]);
        }
        return RandomNumList;
    }
}
