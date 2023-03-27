package src.applitoolscourse.polymorphism;

public class Zoo {

    public static void feed(Animal animal){

        if(animal instanceof Dog){
            System.out.println("Here's your dog food");
        }

        else if(animal instanceof Cat){
            System.out.println("Here's your cat food");
        }

    }

    public static void main(String args[]){

        Dog rocky = new Dog();
        rocky.fetch();
        // This line will call the
        // overriding method makeSound()
        // from the child class dog
        // eventhough it's also defined in the parent class Animal
        // because the object is of type dog. This is called compile time polymorphism
        // or static binding.               
        rocky.makeSound();
        // This line passes an object of dog class in the feed()
        // method eventhough it accepts the object of Animal class as an argument.
        // This is possible because of polymorphism and inheritance. 
        // As animal is class is parent to both dog and cat, we could
        // pass in the Objects of parent and all of it's sub-classes in feed()
        // method's argument.
        feed(rocky);

        // This line depicts run time polymorphism or dynamic binding
        // in JAVA where we created an object reference from parent class
        // but it's poiting to the child class Object.
        // So, if we have to translate below line in Simple English
        // We will say "sasha is an Object of type dog".
        Animal sasha = new Dog();
        // At the run time JVM will decide which makeSound()
        // to call and will eventually end up chosing/calling the one
        // from child class Dog and prints the result.
        sasha.makeSound();
        feed(sasha);   
        
        sasha = new Cat();
        sasha.makeSound();
        // This line shows how we can typecast 
        // an object reference of a parent class (Animal)
        // to the one belonging to child class (Cat). So, that we can call
        // methods from the child class (Cat) via Object reference of type parent (Animal).
        ((Cat)sasha).scratch();
        feed(sasha);

// Note: In this program "sasha" is an object reference which has been 
//       implemented in multiple(2) forms one is cat and other one is Dog
//       So, we can say that "sasha" is a polymorphic object.       
    }
}
