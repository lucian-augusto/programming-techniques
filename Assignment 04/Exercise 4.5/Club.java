import java.util.ArrayList;

/**
 * Store details of club memberships.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Club
{
    // Fields
    private ArrayList<Membership> members;
    
    /**
     * Constructor for objects of class Club
     */
    public Club() {
        this.members = new ArrayList();
    }

    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     */
    public void join(Membership member)
    {
    }

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers()
    {
        if (members != null) {
            return members.size();
        }
        return 0;
    }
}
