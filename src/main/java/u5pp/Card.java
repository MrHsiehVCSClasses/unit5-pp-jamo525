package u5pp;

/**
Constructer creates Card object with attributes value and suit
Attribute returns attributes
Mutators change attributes 
*/
public class Card
{
  public String value = "2";
  public String suit = "clubs";

  /**
  default constructor
  */
  public Card()
  {
  }
  /**
  @param suit
  initializes object's suit to parameter suit
  */
  public Card(String suit)
  {
    this.suit = suit;
  }
  /**
  @param suit & value
  initializes object's suit to parameter suit
  initializes object's suit to parameter value
  */
  public Card(String suit, String value)
  {
    this.value = value;
    this.suit = suit;
  }

  /**
  @return value
  */
  public String getValue()
  {
    return this.value;
  }
  /**
  @return suit
  */
  public String getSuit()
  {
    return this.suit;
  }
  /**
  @return String version of object's value and suit
  */
  public String toString()
  {
    return "The " + this.value + " of " + this.suit;
  }
  /**
  @param c- object to compare
  @return if object's value and suit equals parameter's value and suit
  */
  public boolean equals(Card c)
  {
    if ((this.value.equals(c.value))&&(this.suit.equals(c.suit)))
      return true;
    else
      return false;
  }

  /**
  @param suit
  set object's suit to parameter suit if parameter suit is a valid suit
  */
  public void changeSuit(String suit)
  {
    String refinedSuit = suit.toLowerCase();
    if (refinedSuit.equals("clubs") || refinedSuit.equals("hearts") || refinedSuit.equals("diamonds") || refinedSuit.equals("spades"))
      this.suit = refinedSuit;
  }
  /**
  @param value
  set object's value to parameter value if parameter value is a valid value
  */
  public void changeValue(String value)
  {
    //how to solve for incorrect values
    String refinedValue = value.toLowerCase();
    if (refinedValue.equals("2") || refinedValue.equals("3") || refinedValue.equals("4") || refinedValue.equals("5") || refinedValue.equals("6") || refinedValue.equals("7") || refinedValue.equals("8") || refinedValue.equals("9") || refinedValue.equals("10") || refinedValue.equals("jack") || refinedValue.equals("queen") || refinedValue.equals("king") || refinedValue.equals("ace"))
    {
      this.value = refinedValue;
    }
  }
}