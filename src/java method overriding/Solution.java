 
import java.util.*;

    class sports {
        String getName() {
            return "generic sports";
        }

        void getNumberOfTeamMembers() {
            System.out.println("Each Team has n players in " + getName());
        }
    }

    class Soccer extends sports {
        @Override
        String getName() {
            return "Soccer Class";
        }
        @Override
        void getNumberOfTeamMembers() {
            System.out.println("Each team has 112 players in " + getName());
        }
    }



public class Solution {
    public static void main(String[] arg) {
        sports c1 = new sports();
        sports c2 = new Soccer();
        System.out.println(c1.getName());
        c1.getNumberOfTeamMembers();
        System.out.println(c2.getName());
        c2.getNumberOfTeamMembers();
    }
}