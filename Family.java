package sws;

/**
 * Represents a family. 
 *
 */
public interface Family {
    
    /**
     * Add a person to this family. 
     * @param member   person to add
     */
    public void addPerson(Person member);
    
    /**
     * Remove a person from this family. 
     * @param member   person to remove
     */
    public void removePerson(Person member);
    
    /**
     * @return person that is the closest match to the person the data created. 
     * @param data    data gathered form sensors
     */
    public Person getClosestMatch(Person data);
    
    /**
     * @resturn probability that the person who passed through door frame is the familyMember
     * @param data    data gathered form sensors
     * @param familyMember   family member to compare data to
     */
    public double getProbOfMatch(Person data, Person familyMember);
    
}
