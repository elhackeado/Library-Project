/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mr. Thakur
 */
public class item {
    String id;
    String text;
    
    item(String i,String t)
    {
        id = i;
        text = t;
    }
    public String toString()
    {
        return text;
    }
    public static void main(String args[])
    {
    item i = new item("11","Mathematics");
    
    }
    
}
