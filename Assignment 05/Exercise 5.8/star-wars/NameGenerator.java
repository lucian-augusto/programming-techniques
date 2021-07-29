
/**
 * Write a description of class NameGenerator here.
 *
 * @author Lucian Augusto
 * @version 1.0
 */
public class NameGenerator
{
    public String generateStarWarsName(String firstName, String lastName,
        String mothersMaidenName, String birthCity) {
        String jediFirstName = firstName.substring(0, 3) + lastName.substring(0, 2);
        String jediLastName = mothersMaidenName.substring(0, 2) + birthCity.substring(0, 3);
        
        return jediFirstName + " " + jediLastName;            
    } 
}
