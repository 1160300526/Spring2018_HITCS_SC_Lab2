package P2;

public class Person {
	private String name;

    
    /**
     * Class constructor specifying the name/identifier of the
     * Person.
     *
     * @param name
     *            identifier of the Person
     */
    public Person(String name) {
        this.name = name;
    }
    
    /**
     * getName function can return the name of a person.
     *
     * @param null
     * 
     * @return name
     *            the name of the person
     */
    public String getName(){
    	return name;
    }
}