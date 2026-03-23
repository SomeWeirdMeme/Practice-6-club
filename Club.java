import java.util.ArrayList;
/**
 * Write a description of class Club here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Club
{
    // instance variables - replace the example below with your own
    private ArrayList<String> club;

    /**
     * Constructor for objects of class Club
     */
    public Club()
    {
        club = new ArrayList<String>();
        
    }

    public void AddToClub(String member){
        club.add(member);
    }
        
    public int numberOfMembers(){
        return club.size();
    }
    
    
    public void getPerson(int e){
        if(e >= 0 && e < club.size()){
            String member = club.get(e);
            System.out.println(member);
        }
    }
        
}