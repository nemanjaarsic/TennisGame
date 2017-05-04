public class TennisGame 
{	
	private int player1Points;
	private int player2Points;
	private boolean gameEnded;
	
	public TennisGame() 
	{
		this.player1Points = 0;
		this.player2Points = 0;
	}

	public void player1Scored() throws TennisGameException 
	{
		this.player1Points++;
	}

	public void player2Scored() throws TennisGameException 
	{
		this.player2Points++;
	}
	
	private void checkGameEnded()
	{
		if(this.player1Points == 4 && this.player2Points < 2)
			this.gameEnded = true;
		if(this.player2Points == 4 && this.player1Points < 2)
			this.gameEnded = true;
	}

	private String getScore(int points) 
	{
		String x = null;
		if(points == 0)
			x = Integer.toString(points);
		else if(points == 1)
			x = Integer.toString(points+14);
		else if(points == 2)
			x = Integer.toString(points+28);
		else
			x = Integer.toString(points+37);
		return x;
	}
	
	public String getScore() 
	{
		//System.out.println("player1Score - player2Score");
		// Scores format: "player1Score - player2Score"
		// "0 - 0"
		// "15 - 15"
		// "30 - 30"
		// "deuce"
		// "15 - 0", "0 - 15"
		// "30 - 0", "0 - 30"
		// "40 - 0", "0 - 40"
		// "30 - 15", "15 - 30"
		// "40 - 15", "15 - 40"
		// "advantage player1"
		// "advantage player2"
		// "game player1"
		// "game player2"

		// TO BE IMPLEMENTED
		String x = null;
		if(player1Points > 2 && player2Points > 2 && player1Points == player2Points)
			x = "deuce";
		else if(player1Points > 2 && player2Points > 2 && player1Points > player2Points)
			x = "advantage igrac 1";
		else if(player2Points > 2 && player1Points > 2 && player2Points > player1Points)
			x = "advantage igrac 2";
		else
			x = getScore(player1Points) + " - " + getScore(player2Points);
		return x;
	}
}
