
package ohtu;

public class Player {
    private String name;
    private String nationality;
    private int assists;
    private int goals;
    // private int penalties;
    private String team;
    // private int games;

    @Override
    public String toString() {
        return name + " team " + team + " goals " + goals + " assists " + assists;
    }

    // methods for name
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // methods for nationality
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getNationality() {
        return nationality;
    }

    // methods for assists
    public void setAssists(int assists) {
        this.assists = assists;
    }
    
    public int getAssists() {
        return assists;
    }
    
    // methods for goals
    public void setGoals(int goals) {
        this.goals = goals;
    }
    
    public int getGoals() {
        return goals;
    }

    // methods for team
    public void setTeam(String team) {
        this.team = team;
    }
    
    public String getTeam() {
        return team;
    }
      
}
