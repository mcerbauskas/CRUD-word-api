package io.marius.springboot;

import org.springframework.boot.SpringApplication;

//nereikia servlet container, serverio, ši klasė veikia tiesiog turint main metodą ir 
//paleidžiant kaip betkurią kitą java programą

import org.springframework.boot.autoconfigure.SpringBootApplication;;

//anotacija nurodo spring boot, kad cia yra sios aplikacijos starting point'as 
@SpringBootApplication 
public class WordApiApp {

	public static void main(String[] args) {
		SpringApplication.run(WordApiApp.class, args); //static classs, 1-as argumentas yra klase, kur main metodas, 2-as argumentas - argumentai, kurie perduodami main metodui
		

	}

}
