package bloodbankms;

abstract public class User{
    
    protected String id;
    protected String password;
    protected String name;
    protected String gender;
    protected int age;
    protected float weight;
    protected String bloodGroup;
    protected Hospital hospital;
    
    public User(String id, String password, String name, String gender, int age, float weight, String bloodGroup, Hospital hospital){
        this.id=id;
        this.password=password;
        this.name=name;
        this.gender=gender;
        this.age=age;
        this.weight=weight;
        this.bloodGroup=bloodGroup;
        this.hospital=hospital;}

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

    public String getGender(){
        return gender;}

    public void setGender(String gender){
        this.gender = gender;}
    
    public int getAge(){
        return age;}

    public void setAge(int age){
        this.age = age;}

    public float getWeight(){
        return weight;}

    public void setWeight(float weight){
        this.weight = weight;}

    public String getBloodGroup(){
        return bloodGroup;}

    public void setBloodGroup(String bloodGroup){
        this.bloodGroup = bloodGroup;}

    public Hospital getHospital(){
        return hospital;}

    public void setHospital(Hospital hospital){
        this.hospital = hospital;}
    
}
