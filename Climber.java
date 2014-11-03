// André Purits (2/11/14)
import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
   public class Climber extends Athlete		         
   {
      public Climber()
      {
         super();
      }
      public Climber(int x)
      {
         super(x, 1, Display.NORTH, 1);
}
public void climbUpRight()
{
move();
turnRight();
move();
turnLeft();
}
public void climbUpLeft()
{
move();
turnLeft();
move();
turnRight();
}
public void climbDownRight()
{
turnAround();
move();
turnLeft();
move();
turnLeft();
}
public void climbDownLeft()
{
turnAround();
move();
turnRight();
move();
turnRight();
} 
}