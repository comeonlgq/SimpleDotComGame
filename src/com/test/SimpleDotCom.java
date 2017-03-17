package com.test;

/**
 * Created with IntelliJ IDEA
 * User: Liugongqin
 * Date: 2017/3/12
 * Time: 19:08
 */
public class SimpleDotCom
{

    int[] locationCells;
    int numOfHits =0;

    public void setLocationCells(int[] locations)
    {
        locationCells = locations;
    }

    //玩家的猜测
    public String checkYourself(String userGuess)
    {
        int guess = Integer.parseInt(userGuess);
        String result = "miss";

        int i=0;
        //对每个格子重复
        for(int cell:locationCells)
        {
            if(guess==cell)//如果猜中
            {
                result ="hit";
                numOfHits++;//递增命中次数
                break;
            }
            i=i+1;
        }

        if (result.equals("hit"))
        {
            locationCells[i]=-1;
        }

        //如果命中次数为3，返回击沉信息
        if(numOfHits == locationCells.length)
        {
            result = "kill";
        }
        System.out.println(result);//将结果显示出来
        return result;
    }
}
