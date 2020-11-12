package com.syntax.repl_It;

public class R125 {

    String country;
    String capital;
    int population;

    public String geography() {
        return "The capital of " + country + " is " + capital + " and population is " + population;
    }
    R125(String country, String capital, int population){
    this.country = country;
    this.capital = capital;
    this.population = population;
    }

    public static void main(String[] args) {
//       t125 a = new t125();//создаю новый обьект.
//        a.country = "usa";
//        a.capital = "Washington DC";
//        a.population = 330000000;
        R125 a = new R125("usa", "Washington DC", 330000000);
        R125 b = new R125("Kazakhstan", "Astana", 18500000);
        System.out.println(a.geography());
        System.out.println(b.geography());

    }
}
