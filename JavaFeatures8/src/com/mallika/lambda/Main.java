package com.mallika.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Fruit> list = new ArrayList();
		// List<Fruit>l=new ArrayList();
		list.add(new Fruit("apple", 70, 20, "red"));
		list.add(new Fruit("Orange", 300, 10, "yellow"));
		list.add(new Fruit("mango", 50, 10, "yellow"));
		// l=list.stream().filter(fruit->fruit.getCalories()<100).collect(Collectors.toList());
		// forEach(System.out.println(fruit->fruit.getName()));
		// l.stream().map(fruit->fruit.getName());
		// System.out.println(l);
		list.stream().filter(fruit -> fruit.getCalories() < 100)
				.sorted(Comparator.comparing(Fruit::getName).reversed())
				.forEach(System.out::println);
		System.out.println("-----------------------");

		list.stream().sorted(Comparator.comparing(Fruit::getColor))
				.forEach(System.out::println);
		System.out.println("-----------------------");

		list.stream().filter(fruit -> fruit.getColor() == "red")
				.sorted(Comparator.comparing(Fruit::getPrice))
				.map(fruit -> fruit.getName() + ":" + fruit.getColor())
				.forEach(System.out::println);
		System.out.println("-----------------------");

		 List<News> list1 = new ArrayList();
		 // List<Fruit>l=new ArrayList();
		 list1.add(new News(1, "good", "mallika", "avg"));
		 list1.add(new News(2,"good","harini","budget good"));
		 list1.add(new News(3,"nice" ,"sunitha","budget bad"));
		long count= list1.stream()
	     .filter(news->news.comment.contains("budget"))
		 .count();
		
		 System.out.println(count);
		 System.out.println("-----------------------");
		List<Trader> list2 = new ArrayList();
		// List<Fruit>l=new ArrayList();
		list2.add(new Trader("yallika", "bangalore"));
		list2.add(new Trader("santhi", "kuda"));
		list2.add(new Trader("prasad", "kuda"));
		// list2.stream().distinct(news->news.getCity()).forEach(System.out::println);
		// list2.filter(distinct(Trader::getCity()));

		list2.stream().map(trader -> trader.getCity()).distinct()
				.forEach(System.out::println);
		System.out.println("-----------------------");
		list2.stream().filter(trader -> trader.getCity() == "kuda")
				.sorted(Comparator.comparing(Trader::getName))
				.map(trader -> trader.getName() + ":" + trader.getCity())
				.forEach(System.out::println);
		System.out.println("-----------------------");

		list2.stream().sorted(Comparator.comparing(Trader::getName))
				.map(trader -> trader.getName() + ":" + trader.getCity())
				.forEach(System.out::println);
		System.out.println("-----------------------");

		boolean exit = list2.stream().anyMatch(
				trader -> trader.getCity().equals("indore"));
		System.out.println(exit);
		System.out.println("-----------------------");
		List<Transcation> list3 = new ArrayList();
		Trader t1 = new Trader("mallika", "bang");
		Trader t2 = new Trader("santhi", "bang");
		Trader t3 = new Trader("prasad", "bang");
		Trader t4 = new Trader("rath", "bang");
		list3.add(new Transcation(t1, 1996, 2089));
		list3.add(new Transcation(t2, 1997, 67879));
		list3.add(new Transcation(t3, 2011, 79));
		list3.add(new Transcation(t4, 2011, 56));
		list3.stream()
				.filter(trans -> trans.getTrader().getCity() == "bang")
				.map(trans -> trans.getTrader().getCity() + ":"
						+ trans.getYear()).forEach(System.out::println);
		System.out.println("-----------------------");
		Transcation max = list3.stream()
				.max(Comparator.comparing(Transcation::getValue)).get();
		System.out.println(max);
		System.out.println("-----------------------");

		Transcation min = list3.stream()
				.min(Comparator.comparing(Transcation::getValue)).get();
		System.out.println(min);
		System.out.println("-----------------------");
		list3.stream().filter(trans->trans.getYear()==2011)
		.sorted(Comparator.comparing(Transcation::getValue))
        .map(trans->trans.getYear()+":"+trans.getValue())
        .forEach(System.out::println);
	}
}