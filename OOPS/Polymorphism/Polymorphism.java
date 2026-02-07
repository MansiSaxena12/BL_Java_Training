// Polymorphism means "many forms", and it occurs when we have many classes that 
// are related to each other by inheritance.
package OOPS.Polymorphism;


    class Animal{
        public void animalSound(){
            System.out.println("The animal makes a sound");
        }
    }
    class Pig extends Animal {
        public void animalSound(){
            System.out.println("Snort");
        }
    }
    class Dog extends Animal{
        public void animalSound(){
            System.out.println("Bark");
        }
    }
    class Polymorphism{
        public static void main(String[] args) {
            Animal animal=new Animal();
            Animal Pig= new Pig();
            Animal Dog= new Dog();
            animal.animalSound();
            Pig.animalSound();
            Dog.animalSound();
    }
    }

