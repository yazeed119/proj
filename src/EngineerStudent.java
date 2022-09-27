class EngineerStudent extends Student {

    public EngineerStudent(int id,String name,String date) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = date;
    }

    public  void submitLapReport(String lapReport) {
        System.out.println("Your lap report:" + lapReport);
        System.out.println("\nSubmited successfully!!");
    }
}
