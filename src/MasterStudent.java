class MasterStudent extends Student {

    enum BADegree {

    };
    public MasterStudent(int id,String name,String date) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = date;
    }

    public  void submitResearch(String research) {
        System.out.println("Your research:" + research);
        System.out.println("\nSubmited successfully!!");
    }

    public void getSupervisor() {
        System.out.println("Getting supervisor method.");
    }
}
