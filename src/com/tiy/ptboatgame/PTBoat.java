package com.tiy.ptboatgame;

public class PTBoat 
{
	int location;


	public PTBoat(int location) 
	{
		this.location = location;
	}
	
	public boolean amIHit(int column)
	{
		return (column == location);
	}
}
