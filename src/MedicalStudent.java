class MedicalStudent extends Student {



    public MedicalStudent(int id,String name,String date) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = date;
    }
    public void Hospital(){
        System.out.println("Hospital property called.");
    }

    public void submitResearch(String research) {
        System.out.println("Your research:" + research);
        System.out.println("\nSubmited successfully!!");
    }
}