// Encapsulation mean Binding a data and method together restricting a direct acess using a private variables. 

class Encapsulation{
    private String name;

    //SETTER METHOD
    public void setName(String name){
        this.name = name;
    }
    //GETTER METHOD
    public String getName(){
        return name;
    }
}
 class Main{
    public static void main(String [] args){
        Encapsulation  s = new Encapsulation();
        s.setName("Rahul");
        System.out.println(s.getName());
    }
}

class Encapsulation {
    private String name;
    //setter method 

    public void setName(String name){
        this.name=name;
    }
  //getter method

  public string getName(){
    return name;
  }
}