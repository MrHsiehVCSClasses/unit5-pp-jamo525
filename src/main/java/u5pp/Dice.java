package u5pp;

/**
constructors create dice object with attributes numSides, currentSide, and color
Accessors return attributes
Mutators change attributes
*/
public class Dice 
{
  private int numSides = 6;
  private int currentSide = 1;
  private String color = "green";
  
  /**
  default constructor
  */
  public Dice ()
  {
  }
  /**
  @param numSides- number of sides
  initializes object's numSides to parameter numSides
  */
  public Dice (int numSides)
  {
    this.numSides = numSides;
  }
  /**
  @param numSides- number of sides & currentSide- current side
  initializes object's numSides to parameter numSides
  runs object changeSide for parameter currentSide
  */
  public Dice (int numSides, int currentSide)
  {
    this.numSides = numSides;
    this.changeSide(currentSide);
    color = "green";
  }
  /**
  @param numSides= number of sides & currentSide- current side & color- color of dice
  initializes object's numSides to parameter numSides
  runs object changeSide for parameter currentSide
  initializes object's color to parameter color
  */
  public Dice (int numSides, int currentSide, String color)
  {
    this.numSides = numSides;
    this.changeSide(currentSide);
    this.color = color;
  }

  /**
  @return numSides- number of sides
  */
  public int getSides()
  {
    return this.numSides;
  }
  /**
  @return currentSide- current side
  */
  public int getCurrentSide()
  {
    return this.currentSide;
  }
  /**
  @return color- color of dice
  */
  public String getColor()
  {
    return this.color;
  }
  /**
  @return String version of object color, numSides, and currentSide
  */
  public String toString()
  {
    return "The " + this.color + " " + this.numSides + "-sided dice is showing " + this.currentSide;
  }
  /**
  @param d- object to compare to
  @return if object currentside equals paramater's current side
  */
  public boolean equals(Dice d)
  {
    if (this.currentSide == d.currentSide)
      return true;
    else
      return false;
  }

  /**
  set object's current side to random number 1-numSides
  @return object's currentSide- current side
  */
  public int roll()
  {
    this.currentSide = (int)(Math.random() * this.numSides) + 1;
    return this.currentSide;
  }
  /**
  @param num- integer
  if number is between 1 and object's numSides inclusive, set object's currentSide to parameter currentSide
  */
  public void changeSide(int num)
  {
    if ((1 <= num) && (num <= this.numSides))
      this.currentSide = num;
  }
  /**
  @param color
  set object's color to parameter color
  */
  public void changeColor(String color)
  {
    this.color = color;
  }
  /**
  @param num
  set object's numSides to parameter num
  */
  public void changeNumSides(int num)
  {
    this.numSides = num;
  }
}