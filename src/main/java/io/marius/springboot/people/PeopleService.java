package io.marius.springboot.people;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

//sukuriame business service'a (kai aplikacija pasileidzia, spring'as sukuria sio serviso instance'a ir laiko atminties registre)

//tells Spring that this is a business service
@Service
public class PeopleService {
	
	// sis metodas grazins objektus, kurie bus konvertuoti i JSON formata automatiskai
	private List<Person> people = new ArrayList<>(Arrays.asList(   //new ArrayList<>() padaro Lista "mutable"    
			//Person klasei kvieciamas konstruktorius
			new Person("1", "Petras", "Grazulis"),
			new Person("2", "Audrius", "Audraitis"),
			new Person("3", "Jonas", "Banys")
						)); 
	
	public List<Person> getAllPeople() 
	{
		// returns a list of people
		return people;  
	}
		
	// metodas getPerson grazina objekta is List saraso kurio id sutampa su request'intu id
	public Person getPerson(String id) 
	{
		// (1.compare the id of the topic to the id that's requested) and then (2.get the very first topic element (using find))
		return people.stream().filter(t -> t.getId().equals(id)).findFirst().get();   
	}

	public void addPerson(Person person) {
		people.add(person);
		
	}

	public void updatePerson(String id, Person person) 
	{
		// a "for" loop to loop through the list of topics and get the matched id
		for(int i = 0; i < people.size(); i++ ) 
		{
			Person p = people.get(i); //for each person in that list
			if (p.getId().equals(id)) //comparing id with the input id
			{
				people.set(i, person); //matched person info is updated
				return;
			}
		}
				
	}

	public void deletePerson(String id) 
	{
		people.removeIf(p -> p.getId().equals(id)); //removes all people in the List where the predicate is true
		
	}

	/*
	//metodas grazinantis visus palindromus
	public List<Person> getPalindromePeople() 
	{
		
	}
	
	//metodas palindromui identifikuoti
	public static boolean istPalindrom(char[] word) 
	{
    int i1 = 0;
    int i2 = word.length - 1;
    while (i2 > i1) {
        if (word[i1] != word[i2]) {
            return false;
        }
        ++i1;
        --i2;
    }
    return true;
	}
	
	*/

}
