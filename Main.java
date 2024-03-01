class Main{
	
	public static void main(String [] args){

		Team team = new Team();

team1.setRank(1);
        team1.setPlayerName("Player 1");

        // Accessing and printing team information
        System.out.println("Team Name: " + team1.getTeamName());
        System.out.println("Rank: " + team1.getRank());
        System.out.println("Player Name: " + team1.getPlayerName());
    }

    @Override
    public String toString() {
        return "Hold: " + teamName + " Rang: " + rank;
    }
}

	