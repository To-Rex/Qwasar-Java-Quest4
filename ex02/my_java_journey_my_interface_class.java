// class Executor {
//   public static void main(String[] args) {
//     Bicycle bicycle = new Bicycle();
//     bicycle.changeGear(2);
//     bicycle.speedUp(3);
//     bicycle.applyBrakes(1);
      
//     System.out.println("Bicycle state:");
//     bicycle.printStates();
      
//     Bike bike = new Bike();
//     bike.changeGear(1);
//     bike.speedUp(4);
//     bike.applyBrakes(3);
      
//     System.out.println("Bike state:");
//     bike.printStates();
//   }
// }

// interface Vehicle {
//     void changeGear(int gear);
//     void speedUp(int speed);
//     void applyBrakes(int break);
// }

// Input: 
// Output: Bicycle state:
// speed: 2 gear: 2
// Bike state:
// speed: 1 gear: 1

// Return Value: nil

class Bicycle implements Vehicle {
    int speed = 0;
    int gear = 1;
    
    public void changeGear(int gear) {
        this.gear = gear;
    }
    
    public void speedUp(int increment) {
        this.speed += increment;
    }
    
    public void applyBrakes(int decrement) {
        this.speed -= decrement;
    }
    
    public void printStates() {
        System.out.println("speed: " + this.speed + " gear: " + this.gear);
    }
}

class Bike implements Vehicle {
    int speed = 0;
    int gear = 1;
    
    public void changeGear(int gear) {
        this.gear = gear;
    }
    
    public void speedUp(int increment) {
        this.speed += increment;
    }
    
    public void applyBrakes(int decrement) {
        this.speed -= decrement;
    }
    
    public void printStates() {
        System.out.println("speed: " + this.speed + " gear: " + this.gear);
    }
}

class Index {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        bicycle.changeGear(2);
        bicycle.speedUp(3);
        bicycle.applyBrakes(1);
        
        System.out.println("Bicycle state:");
        bicycle.printStates();
        
        Bike bike = new Bike();
        bike.changeGear(1);
        bike.speedUp(4);
        bike.applyBrakes(3);
        
        System.out.println("Bike state:");
        bike.printStates();
    }
}

