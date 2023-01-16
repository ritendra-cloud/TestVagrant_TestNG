package tests;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;



public class Team {

    private String name;
    private String location;
    private List<Player> players;

    public Team(String json) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Team team = mapper.readValue(json, Team.class);
        this.name = team.getName();
        this.location = team.getLocation();
        this.players = team.getPlayers();
    }
    
    @JsonCreator
    public Team(@JsonProperty("name") String name, @JsonProperty("location") String location, @JsonProperty("player") List<Player> players) {
        this.name = name;
        this.location = location;
        this.players = players;
    }


    public int getForeignPlayerCount() {
        int foreignPlayerCount = 0;
        for (Player player : players) {
            if (!player.getCountry().equals("India")) {
                foreignPlayerCount++;
            }
        }
        return foreignPlayerCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Player> getPlayers() {
        return players;
}

    public void setPlayers(List<Player> players) {
        this.players = players;
}

}


class Player {
    private String name;
    private String country;
    private String role;
    private String priceInCrores;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
    @JsonProperty("price-in-crores")
    public String getPriceInCrores() {
        return priceInCrores;
    }
    
    @JsonProperty("price-in-crores")
    public void setPriceInCrores(String priceInCrores) {
        this.priceInCrores = priceInCrores;
    }
}




