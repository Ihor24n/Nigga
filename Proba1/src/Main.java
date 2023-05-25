public class Main {
    public static void main(String[] args) {
        ////////////////////////////////////////////////
        //Player
    /*Player user1 = new Player("Ihor",18,"Forward");
    Player user2 = new Player("Andriy",22,"defence");

    user1.infoPlayers();
        System.out.println();
    user2.infoPlayers();
        System.out.println();

    user1.performAction("celebrate");
        System.out.println();
    user2.performAction("score");
        System.out.println();

    user1.numberOfPlayers();
    //////////////////////////////////////////////////////////////
        //Stadium
    System.out.println();
    Stadium stadium = new Stadium("Camp Nou","Barcelona",99000,50000);
    stadium.displayStadiumInfo();
    System.out.println();
    stadium.checkAviability(60000);*/
    ///////////////////////////////////////////////////////////////////////////////////////////
        //Coach
    System.out.println();
    Coach coach = new Coach("Andriy", 55);
    coach.experienceAge();
    System.out.println();
    coach.displayCoachInfo(1.75,67);
    System.out.println();
    coach.numberOfYearsUntilRetirement();
        System.out.println();
    ////////////////////////////////////////////////

    AssistantCoach ascoach1 = new AssistantCoach("Ihor",18);
    ascoach1.displayCoachInfo(1.76,55);
    ascoach1.experienceAge();
    ascoach1.numberOfYearsUntilRetirement();
    System.out.println();
    ////////////////////////////////////////////////////
    /*FootballDoctor doctor1 = new FootballDoctor("Bodya",12,"Barcelona");
    System.out.println(doctor1.getDoctorInfo());
    System.out.println();
    doctor1.performMedicalExamination(user1.getName());*/




/////////////////////////////////////////////////////////////
    /*Tournament tournament = new Tournament("Askelad","Ukraine");
    tournament.numberTeams();*/
    }
}
