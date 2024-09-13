interface interfaceExample {
    void print();
}

public class interfaceAndClass {

    public static void main(String[] args) {
        // interfaceExample eex = new interfaceExample(){
        //     public void print() {
        //         System.out.println("method and class works!");
        //     };
        // };

        
        interfaceExample eex = ()->{ // => arrow function in javascript
            System.out.println("method and class works using lambda ex!");
        };

        eex.print();
    }
}