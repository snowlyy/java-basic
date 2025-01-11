public class Dog {

  static int idCounter = 0;
  static final boolean isMammal = true;

  int id;
  String breed;
  String color;
  int age;
  String name;
  boolean hasOwner;

  public Dog() {
    this("unkown", "unknown", "Morzsi", 0);

  }

  public Dog(String breed, String color) {
    this(breed, color, "Morzsi", 0);
  }

  public Dog(String breed, String color, String name, int age) {
    this.breed = breed;
    this.color = color;
    this.age = age;
    this.name = name;
    this.id = ++idCounter;
  }

  public String vau() {
    return "Vau " + this.name;
  }

  @Override
  public boolean equals(Object otherDog) {
    return this.name.equals(((Dog) otherDog).name)
            && this.color.equals(((Dog) otherDog).color)
            && this.age == ((Dog) otherDog).age
            && this.breed.equals(((Dog) otherDog).breed)
            && this.hasOwner == ((Dog) otherDog).hasOwner;
  }

  @Override
  public String toString() {
    return "Dog [" + this.id + "]: " + this.name;
  }
}