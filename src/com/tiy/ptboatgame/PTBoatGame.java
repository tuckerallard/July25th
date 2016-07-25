package com.tiy.ptboatgame;

public class PTBoatGame 
{
	private PTBoat[] boats = new PTBoat[6];
	private int numberOfBoats = 0;

	public void addBoat (int location)
	{
		boats [numberOfBoats] = new PTBoat(location);
		numberOfBoats++;
	}
	
	public boolean guess(int location)
	{
		for(int i = 0; i < boats.length; i++)
		{
			if(boats[i].location == location)
			{
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) 
	{
		PTBoatGame gameOne = new PTBoatGame();
		gameOne.addBoat(4);
		gameOne.addBoat(3);
		gameOne.addBoat(1);
		gameOne.addBoat(12);
		gameOne.addBoat(9);
		gameOne.addBoat(8);
		
		if(gameOne.guess(3))
		{
			System.out.println("Hit");
		}
		else
		{
			System.out.println("Miss");
		}
	}
}

