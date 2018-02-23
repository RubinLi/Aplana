package com.Ivlev;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<Candy> TypeCandy = new ArrayList();
       // TypeCandy = {}

	CandyGroup Candy                = new CandyGroup(1,1,1, "Candy");
	CandyGroup Jevebean = new CandyGroup(1,1,1, "j");


	Gift gift =  new Gift();
	//Добавить элемент в кару
	gift.AddGroup(Candy,Candy.getName());
	gift.AddGroup(Jevebean,Jevebean.getName());
        System.out.println(Candy.getName());
       System.out.println(gift.GetGroup(Candy.getName()));

        System.out.println(gift.GetGroup("Candy"));
       gift.GetKey();
        //Iterator<ArrayList> iter = gift.getList().iterator();
      //  while(iter.hasNext()){


//действия с ключом
        }
//
        }


