package day37_Inheritance.scrumTask;

public class AmazonInc {

    public static void main(String[] args) {
        String company = "Amazon Inc";

        ProductOwner po = new ProductOwner("Taha",25,'M',1,16000, company);
        BusinessAnalyst ba = new BusinessAnalyst("Jiya",26,'F',2,17000,company);
        ScrumMaster sm = new ScrumMaster("Anel",28,'F',3,14500,company);


Tester tester1 = new Tester("Rabia",32,'F',"SDET",1245,14500,company);
Tester tester2 = new Tester("Nehal",26,'F',"QA",1246,14570,company);
Tester tester3 = new Tester("Kamal",37,'M',"QA",1345,1500,company);
Tester tester4 = new Tester("Irteza",24,'F',"QA",1670,1700,company);

Tester[] testers = {tester1,tester2,tester3,tester4};
        
Developer developer1 = new Developer("Daniela",27,'F',"Java developer",1234,1500,company);

ScrumTeam scrumTeam = new ScrumTeam(po,ba,sm );
scrumTeam.addDeveloper(developer1);
scrumTeam.addTesters(testers);

        System.out.println(scrumTeam);



        // print name of all  tester , apply

        for(Tester tester: scrumTeam.testers){
            System.out.println(tester.name+":"+tester.salary);
        }


    }






}
