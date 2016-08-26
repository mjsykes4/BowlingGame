package ssa;

public class SimulatedBowling {
	
	  static java.util.Random randomRoll = new java.util.Random((new java.util.Date()).getTime());
	  
		int bowlingScores[][] = new int[3][10];
		
		  int totalGameScore1;
		  int totalGameScore2;
		  int totalGameScore3;

		
			 private int pinsKnockedDown() {
		  int numberOfPins =  randomRoll.nextInt(11);

		  int ballRoll1 = numberOfPins;
		  int ballRoll2 = 0;
		  int frameTotal = ballRoll1 + ballRoll2;

		  if (ballRoll1 < 10); {
			  ballRoll2 = numberOfPins;
		  }
		  if(frameTotal >= 10) {
			  return 10;
		  } else {
		  } return frameTotal;
		  }
	  private String displayGame1() {
		  String gameScore = "Game 1|		";
		  for(int game = 0; game < bowlingScores[0].length; game++) {
			  totalGameScore1 += bowlingScores[0][game];
		//	  gameScore += bowlingScores[0][game] + "\t";
			  
			  String c = String.format("%02d", bowlingScores[0][game]);        
			  c = c.replaceFirst("^0+(?!$)", " ");
			  
			  gameScore += c + "\t";
			  
		  }
		  return gameScore + totalGameScore1;
	  }
		  private String displayGame2() {
			  String gameScore = "Game 2|		";
			  for(int game = 0; game < bowlingScores[1].length; game++) {
				  totalGameScore2 += bowlingScores[1][game];
	//			  gameScore += bowlingScores[1][game] + "\t";
				  
				  String c = String.format("%02d", bowlingScores[1][game]);        
				  c = c.replaceFirst("^0+(?!$)", " ");
				  
				  gameScore += c + "\t";
			  }
			  return gameScore + totalGameScore2;
		  }
			  private String displayGame3() {
				  String gameScore = "Game 3|		";
				  for(int game = 0; game < bowlingScores[2].length; game++) {
					  totalGameScore3 += bowlingScores[2][game];
				//	  gameScore += bowlingScores[2][game] + "\t";
					  
					  String c = String.format("%02d", bowlingScores[2][game]);        
					  c = c.replaceFirst("^0+(?!$)", " ");
					  
					  gameScore += c + "\t";
				  }
				  return gameScore + totalGameScore3;
			  }
				private String printTotal() {
					String totalScore = "Total Series										       ";
							return totalScore + (totalGameScore1 + totalGameScore2 + totalGameScore3);
				}
			private String print() {
				return "Frames|  	 1  	 2	 3	 4	 5	 6	 7	 8	 9      10   Total " + "\n" + displayGame1() + "\n"
						+ displayGame2() + "\n" + displayGame3() + "\n" + printTotal();
			}
		  
		 public void bowl() {
			 //System.out.println("Frames|	1	2	3	4	5	6	7	8	9	10	Total ");
			// System.out.println(displayGame1() + "\n" + displayGame2() + "\n" + displayGame3());
		for(int game = 0; game < bowlingScores.length; game++) {
			for(int frame =0; frame < bowlingScores[game].length; frame++) {
				bowlingScores[game][frame] = pinsKnockedDown();

			}

			//System.out.println("");
		}
		System.out.println(print());
	}

	}
