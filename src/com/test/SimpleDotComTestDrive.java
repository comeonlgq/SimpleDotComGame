package com.test;

/**
 * Created with IntelliJ IDEA
 * User: Liugongqin
 * Date: 2017/3/12
 * Time: 19:01
 */
public class SimpleDotComTestDrive
{
    public static void main(String [] args)
    {
//        ==================================
//        示例代码一：
//
//        ==================================
//        SimpleDotCom dot = new SimpleDotCom();
//
//        int[] locations = {2,3,4};
//
//        dot.setLocationCells(locations);
//
//        String userGuess = "2";
//        String result = dot.checkYourself(userGuess);
//        String testResult = "failed";
//
//        if(result.equals("hit"))
//        {
//            testResult = "passed";
//        }
//        System.out.println(testResult);

//        ==================================
//        示例代码二：
//
//        ==================================
        int numOfGuess = 0;//记录玩家猜测次数的变量
        GameHelper helper = new GameHelper();
        SimpleDotCom theDotCom = new SimpleDotCom();
        int randomNum = (int )(Math.random()*5);

        int [] locations ={randomNum,randomNum+1,randomNum+2};
        theDotCom.setLocationCells(locations);
        boolean isAlive = true;

        while(isAlive == true)
        {
            String guess = helper.getUserInput("Enter a number");
            String result = theDotCom.checkYourself(guess);
            numOfGuess++;

            if(result.equals("kill"))
            {
                isAlive = false;
                System.out.println("You took "+numOfGuess+" guesses");
            }
        }

    }

}

