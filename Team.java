class Team{
	private String teamName;
	private int rank;
	private String playerName;

	public Team(String teamName);
		this.teamName = teamName;
        this.rank = 0; 
        this.playerName = ""
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
