class Animal:
  def sound(self):
    return None

class Dog(Animal):
  def sound(self):
    return "Woof"

dog = Dog()
print("Dog sounds", dog.sound())
