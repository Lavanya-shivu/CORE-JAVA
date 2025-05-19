package dto;

public class LabDto {
    public String name;
    public String gender;
    public String contactNumber;
    public String age;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getGender(){
        return gender;
    }
    public void setGender(String gender){
        this.gender=gender;
    }
    public String getContactNumber(){
        return contactNumber;
    }
    public void setContactNumber(String contactNumber){
        this.contactNumber = contactNumber;
    }
    public String getAge(){
        return age;
    }
    public void setAge(String age){
        this.age=age;
    }
}
