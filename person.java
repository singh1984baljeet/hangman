class person {
    private String name;

    public person (String name ) {
        this.name = name;
    }

    public int hashcode() {
        return name.hashCode();
       
    }
public String toString () {
    return "Person{name='" + name + "'}";

}
     
        public static void main(String[] args) {
            person person1 = new person("sam doe");
            person person2 = new person ("lisa smith");
            person person3 = new person ("john smith");
            person person4 = new person ("sandra doe");


            System.out.println(person1 + " -> HashCode: " + person1.hashCode());
            System.out.println(person2 + " -> HashCode: " + person2.hashCode());
            System.out.println(person3 + " -> HashCode: " + person3.hashCode());
            System.out.println(person4 + " -> HashCode: " + person4.hashCode());
    
    

}



}