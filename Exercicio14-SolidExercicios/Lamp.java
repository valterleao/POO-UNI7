public class Lamp implements Equipment {

  private int color;

  public int getColor() {
    return color;
  }

  public void setColor(int color) {
    this.color = color;
  }

  public void turnOn() {
    System.out.println("Lamp turned on");
  }

  public void turnOff() {
    System.out.println("Lamp turned off");
  }

}