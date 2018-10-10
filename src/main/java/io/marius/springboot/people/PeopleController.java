package io.marius.springboot.people;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class PeopleController 
{
	@Autowired //this annotation tells Spring to inject it
		private PeopleService peopleService; //sukuria PeopleController instance'a
	
	//GET ALL
	@RequestMapping("/people")
	public List <Person> getAllPeople() //getAllPeople - metodas, sukuriantis ir grazinantis List'a
	{
		return peopleService.getAllPeople(); //calling that method
	}
	
	//individual GET
	@RequestMapping("/people/{id}") // {id} is a variable portion
	public Person getPerson(@PathVariable String id) //metodas, grazinantis 1 zmogu, accept'ina id kaip input parametra
	{
		return peopleService.getPerson(id);
	} 
	
	//POST
	@RequestMapping(method=RequestMethod.POST, value="/people") //expanded way of telling to POST, can use the same with GET, but get is default so there's no need
	public void addPerson(@RequestBody Person person) //take request body and convert it to people instance, then pass it to the addPerson
	{
		//now we need to get that POST body and convert it to people instance and add it to the List
		peopleService.addPerson(person);
	}
	
	//PUT
	@RequestMapping(method=RequestMethod.PUT, value="/people/{id}") 
	public void updatePerson(@RequestBody Person person, @PathVariable String id) 
	{
		
		peopleService.updatePerson(id, person);
	}
	
	//DELETE
	@RequestMapping(method=RequestMethod.DELETE, value="/people/{id}")
	public void deletePerson(@PathVariable String id)  //doesn't return anything
	{
		peopleService.deletePerson(id);
	}
	
	/* GET request'as grazinantis List'e esancius palindromus
	//GET palindrome
	@RequestMapping("/people")
	public List <Person> getPalindromePeople() 
	{
		return peopleService.getPalindromePeople(); 
	}
	*/

}
