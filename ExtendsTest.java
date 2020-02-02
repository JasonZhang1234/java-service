class Drink {
  public void sayDrink () {
    System.out.println("i am drink");
  }
}

class Cola extends Drink {
  public void sayCola () {
    System.out.println("i am cola");
  }
}

class Fanta extends Drink {
  public void sayDrink () {
    System.out.println("i am just fanta, not drink");
  }

  public void sayFanta () {
    System.out.println("i am fanta");
  }

  public void sayPrice (int price) {
    System.out.println("i am sold for " + price + " yuan");
  }
}

public class ExtendsTest {
  public static void main (String[] args) {
    Cola cola = new Cola();

    cola.sayDrink();
    cola.sayCola();

    System.out.println("------");

    Fanta fanta = new Fanta();

    fanta.sayDrink();
    fanta.sayFanta();
    fanta.sayPrice(3);
  }
}





