class Animal {
    public int age;
    public String gender;

    public boolean isMammal() {
        System.out.println("This is the isMammal method from class Animal");
        
        return true; 
    }

    public void mate() {
        System.out.println("This is the mate method from class Animal");
    }

    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        
        new Fish();
        Zebra myZebra = new Zebra();

       
        myAnimal.isMammal();
        myAnimal.mate();

        
        myZebra.isMammal();
        myZebra.mate();
        myZebra.run();
    }
}

class Fish extends Animal {
    private int sizeInFeet;

    private void canEat() {
        System.out.println("This is a private method canEat() from class Fish");
    }

    public int getSizeInFeet() {
        return sizeInFeet;
    }

    public void setSizeInFeet(int sizeInFeet) {
        this.sizeInFeet = sizeInFeet;
    }

    
    public void feed() {
        canEat();
    }
}

class Zebra extends Animal {
    public boolean is_wild;

    public void run() {
        System.out.println("This is the run method from class Zebra");
    }
}
