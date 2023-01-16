package tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TeamTest {

    @Test
    public void testForeignPlayerCount() throws IOException {
        // Given
        String teamJSON = "{\"name\":\"Royal Challengers Bangalore\",\"location\":\"Bangalore\",\"player\":[{\"name\":\"Faf Du Plessis\",\"country\":\"South Africa\",\"role\":\"Batsman\",\"price-in-crores\":\"7\"},{\"name\":\"Virat Kohli\",\"country\":\"India\",\"role\":\"Batsman\",\"price-in-crores\":\"15\"},{\"name\":\"Glenn Maxwell\",\"country\":\"Australia\",\"role\":\"Batsman\",\"price-in-crores\":\"11\"},{\"name\":\"Mohammad Siraj\",\"country\":\"India\",\"role\":\"Bowler\",\"price-in-crores\":\"7\"},{\"name\":\"Harshal Patel\",\"country\":\"India\",\"role\":\"Bowler\",\"price-in-crores\":\"10.75\"},{\"name\":\"Wanindu Hasaranga\",\"country\":\"Srilanka\",\"role\":\"Bowler\",\"price-in-crores\":\"10.75\"},{\"name\":\"Dinesh Karthik\",\"country\":\"India\",\"role\":\"Wicket-keeper\",\"price-in-crores\":\"5.5\"},{\"name\":\"Shahbaz Ahmed\",\"country\":\"India\",\"role\":\"All-Rounder\",\"price-in-crores\":\"2.4\"},{\"name\":\"Rajat Patidar\",\"country\":\"India\",\"role\":\"Batsman\",\"price-in-crores\":\"0.20\"},{\"name\":\"Josh Hazlewood\",\"country\":\"Australia\",\"role\":\"Bowler\",\"price-in-crores\":\"7.75\"},{\"name\":\"Mahipal Lomror\",\"country\":\"India\",\"role\":\"Bowler\",\"price-in-crores\":\"7.75\"}]}";
        Team team = new Team(teamJSON);
        
        // When
        int foreignPlayerCount = team.getForeignPlayerCount();
        
        // Then
        Assert.assertEquals(foreignPlayerCount, 4, "The team should have only 4 foreign players");
    }
    
    @Test
    public void testWicketKeeperExists() throws IOException {
       
    	String teamJSON = "{\"name\":\"Royal Challengers Bangalore\",\"location\":\"Bangalore\",\"player\":[{\"name\":\"Faf Du Plessis\",\"country\":\"South Africa\",\"role\":\"Batsman\",\"price-in-crores\":\"7\"},{\"name\":\"Virat Kohli\",\"country\":\"India\",\"role\":\"Batsman\",\"price-in-crores\":\"15\"},{\"name\":\"Glenn Maxwell\",\"country\":\"Australia\",\"role\":\"Batsman\",\"price-in-crores\":\"11\"},{\"name\":\"Mohammad Siraj\",\"country\":\"India\",\"role\":\"Bowler\",\"price-in-crores\":\"7\"},{\"name\":\"Harshal Patel\",\"country\":\"India\",\"role\":\"Bowler\",\"price-in-crores\":\"10.75\"},{\"name\":\"Wanindu Hasaranga\",\"country\":\"Srilanka\",\"role\":\"Bowler\",\"price-in-crores\":\"10.75\"},{\"name\":\"Dinesh Karthik\",\"country\":\"India\",\"role\":\"Wicket-keeper\",\"price-in-crores\":\"5.5\"},{\"name\":\"Shahbaz Ahmed\",\"country\":\"India\",\"role\":\"All-Rounder\",\"price-in-crores\":\"2.4\"},{\"name\":\"Rajat Patidar\",\"country\":\"India\",\"role\":\"Batsman\",\"price-in-crores\":\"0.20\"},{\"name\":\"Josh Hazlewood\",\"country\":\"Australia\",\"role\":\"Bowler\",\"price-in-crores\":\"7.75\"},{\"name\":\"Mahipal Lomror\",\"country\":\"India\",\"role\":\"Bowler\",\"price-in-crores\":\"7.75\"}]}";
        Team team = new Team(teamJSON);
        boolean wicketKeeperExists = false;
        for(Player player : team.getPlayers()) {
            if(player.getRole().equals("Wicket-keeper")) {
                wicketKeeperExists = true;
                break;
            }
        }
        Assert.assertTrue(wicketKeeperExists, "Wicket-keeper not found in team");
    }
}
