package cb20033_lt4;

public class ComputerFactory{
    
    public Computer getComputer(String computer){
        
        Computer obj = null;
        
        if(computer.toLowerCase().equals("laptop")){
            obj = new Laptop(null, null, 0);}
        
        else if(computer.toLowerCase().equals("desktop")){
            obj = new Desktop(new Monitor());}
        
        else{
            System.out.println("Invalid Input!");}
        
        return obj;
    }
    
}
