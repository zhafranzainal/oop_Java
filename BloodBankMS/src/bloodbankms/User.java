package bloodbankms;

public class User{
    
    protected String id;
    protected String password;
    protected String name;
    protected int age;
    protected int weight;
    protected String bloodGroup;
    
    public User(String id, String password, String name, int age, int weight, String bloodGroup){
        this.id=id;
        this.password=password;
        this.name=name;
        this.age=age;
        this.weight=weight;
        this.bloodGroup=bloodGroup;}

    public String getId(){
        return id;}

    public void setId(String id){
        this.id = id;}

    public String getPassword(){
        return password;}

    public void setPassword(String password){
        this.password = password;}

    public String getName(){
        return name;}

    public void setName(String name){
        this.name = name;}

    public int getAge(){
        return age;}

    public void setAge(int age){
        this.age = age;}

    public int getWeight(){
        return weight;}

    public void setWeight(int weight){
        this.weight = weight;}

    public String getBloodGroup(){
        return bloodGroup;}

    public void setBloodGroup(String bloodGroup){
        this.bloodGroup = bloodGroup;}
    
}
