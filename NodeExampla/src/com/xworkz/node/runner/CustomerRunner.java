package com.xworkz.node.runner;

import com.xworkz.node.dto.CompanyDto;
import com.xworkz.node.dto.CustomerDto;

import java.util.ArrayList;
import java.util.List;

public class CustomerRunner {
    public static void main(String[] args) {
        List<CustomerDto> customerDtos = new ArrayList<>();

        CustomerDto customerDto1 = new CustomerDto("John", 9876543210L, "john@gmail.com", "New York");
        CustomerDto customerDto2 = new CustomerDto("Alice", 9876543211L, "alice@gmail.com", "California");
        CustomerDto customerDto3 = new CustomerDto( "Bob", 9876543212L, "bob02@gmail.com", "Texas");
        CustomerDto customerDto4 = new CustomerDto("Carol", 9876543213L, "carol02@gmail.com", "Florida");
        CustomerDto customerDto5 = new CustomerDto("David", 9876543214L, "david02@gmail.com", "Ohio");
        CustomerDto customerDto6 = new CustomerDto("Emma", 9876543215L, "emma02@gmail.com", "Illinois");
        CustomerDto customerDto7 = new CustomerDto("Frank",9876543216L, "frank01@gmail.com", "Nevada");
        CustomerDto customerDto8 = new CustomerDto("Grace", 9876543217L, "grace02@gmail.com", "Georgia");
        CustomerDto customerDto9 = new CustomerDto("Harry", 9876543218L, "harry78@gmail.com", "Arizona");
        CustomerDto customerDto10 = new CustomerDto("Ivy", 9876543219L, "ivy256@gmail.com", "Oregon");
        CustomerDto customerDto11 = new CustomerDto("Jack", 9876543220L, "jack09@gmail.com", "Washington");
        CustomerDto customerDto12 = new CustomerDto("Kim", 9876543221L, "kim245@gmail.com", "Alaska");
        CustomerDto customerDto13 = new CustomerDto("Leo", 9876543222L, "leo456@gmail.com", "Colorado");
        CustomerDto customerDto14 = new CustomerDto("Marry", 9876543223L, "marry@gmail.com", "Utah");
        CustomerDto customerDto15 = new CustomerDto("Noah", 9876543224L, "noah23@gmail.com", "Montana");
        CustomerDto customerDto16 = new CustomerDto("Olivia", 9876543225L, "olivia@gmail.com", "Wyoming");
        CustomerDto customerDto17 = new CustomerDto("Paul", 9876543226L, "paul234@gmail.com", "Idaho");
        CustomerDto customerDto18 = new CustomerDto("Quinn", 9876543227L, "quinn34@gmail.com", "New Mexico");
        CustomerDto customerDto19 = new CustomerDto("Rita", 9876543228L, "rita76@gmail.com", "Kansas");
        CustomerDto customerDto20 = new CustomerDto("Steve", 9876543229L, "steve78@gmail.com", "Nebraska");
        CustomerDto customerDto21 = new CustomerDto("Tina", 9876543230L, "tina@gmail.com", "Missouri");
        CustomerDto customerDto22 = new CustomerDto("Uma", 9876543231L, "uma29@gmail.com", "Iowa");
        CustomerDto customerDto23 = new CustomerDto("Victor", 9876543232L, "victor@gmail.com", "Minnesota");
        CustomerDto customerDto24 = new CustomerDto("Wendy", 9876543233L, "wendy@gmail.com", "Wisconsin");
        CustomerDto customerDto25 = new CustomerDto("Xander", 9876543234L, "xander@gmail.com", "Michigan");
        CustomerDto customerDto26 = new CustomerDto("Yara", 9876543235L, "yara@gmail.com", "Bengaluru");
        CustomerDto customerDto27 = new CustomerDto("Zack", 9876543236L, "zack@gmail.com", "Kentucky");
        CustomerDto customerDto28 = new CustomerDto("Aarav", 9876543237L, "arav@gmail.com", "Delhi");
        CustomerDto customerDto29 = new CustomerDto("Bhavya", 9876543238L, "bhavya@gmail.com", "Bangalore");
        CustomerDto customerDto30 = new CustomerDto("Charan", 9876543239L, "charan@gmail.com", "Hyderabad");


        CompanyDto companyDto1 = new CompanyDto("Amazon","Product Based","Bengaluru",1997);
        CompanyDto companyDto2 = new CompanyDto("Google","Technology","USA",1898);
        CompanyDto companyDto3 = new CompanyDto("Wipro","Service Based","India",1998);
        CompanyDto companyDto4 = new CompanyDto("Infosys","PRoduct Based","Bengaluru",1997);
        CompanyDto companyDto5 = new CompanyDto("Deloitte","PRoduct Based","Bengaluru",1997);
        CompanyDto companyDto6 = new CompanyDto("Accenture","PRoduct Based","Ireland",1997);
        CompanyDto companyDto7 = new CompanyDto("Concentrix","PRoduct Based","Bengaluru",1997);
        CompanyDto companyDto8 = new CompanyDto("Congnizant","PRoduct Based","Bengaluru",1997);
        CompanyDto companyDto9 = new CompanyDto("HCL","PRoduct Based","India",1997);
        CompanyDto companyDto10 = new CompanyDto("Capgemini","PRoduct Based","Bengaluru",1997);
        CompanyDto companyDto11 = new CompanyDto("EY","PRoduct Based","Bengaluru",1997);
        CompanyDto companyDto12 = new CompanyDto("Tata","PRoduct Based","Bengaluru",1997);
        CompanyDto companyDto13 = new CompanyDto("LG","PRoduct Based","Bengaluru",1997);
        CompanyDto companyDto14 = new CompanyDto("Sony","PRoduct Based","Bengaluru",1997);
        CompanyDto companyDto15 = new CompanyDto("Alibaba","PRoduct Based","Bengaluru",1997);
        CompanyDto companyDto16 = new CompanyDto("Tencent","PRoduct Based","Bengaluru",1997);
        CompanyDto companyDto17 = new CompanyDto("KPMG","PRoduct Based","Bengaluru",1997);
        CompanyDto companyDto18 = new CompanyDto("Microsoft","PRoduct Based","Bengaluru",1997);
        CompanyDto companyDto19 = new CompanyDto("Intel","PRoduct Based","Bengaluru",1997);
        CompanyDto companyDto20 = new CompanyDto("Oracle","PRoduct Based","Bengaluru",1997);

        customerDtos.forEach(System.out::println);
    }
}
