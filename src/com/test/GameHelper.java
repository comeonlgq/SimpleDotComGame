package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created with IntelliJ IDEA
 * User: Liugongqin
 * Date: 2017/3/12
 * Time: 19:32
 */
public class GameHelper
{

    public String getUserInput(String s)
    {
        String inputLine = null;
        System.out.println(s+"   ");
        try
        {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine=is.readLine();
        }catch (IOException e)
        {
            System.out.println("IOException:"+e);
        }

        return inputLine;
    }
}
