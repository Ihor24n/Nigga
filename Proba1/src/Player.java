public class Player {
    private String name;
    private  int age;
    private String position;
    /////////////////////////
    public static int countPlayer;
    public  Player(String name, int age, String position){
        this.name = name;
        this.age = age;
        this.position = position;
        countPlayer++;
    }

    public void infoPlayers(){
        System.out.println("Name : " +name);
        System.out.println("Age : "+age);
        System.out.println("Position : "+position);
    }


    public void performAction(String action) {
        switch (action) {
            case "score":
                scoreGoal();
                break;
            case "celebrate":
                celebrateBirthday();
                break;
            case "changePosition":
                changePosition();
                break;
            default:
                System.out.println("Invalid action.");
        }
    }
    private void scoreGoal() {
        System.out.println(name + " scored a goal!");
    }

    private void celebrateBirthday() {
        age++;
        System.out.println("Happy birthday, " + name + "! You are now " + age + " years old.");
    }

    private void changePosition() {
        System.out.println("Enter the new position for " + name + ":");
        // Отримання нової позиції від користувача або іншим способом
        String newPosition = "Midfielder"; // Приклад, встановлення нової позиції як "Півзахисник"
        position = newPosition;
        System.out.println(name + " changed position to " + position);
    }
    public void numberOfPlayers(){
        System.out.println("Number of player is "+ countPlayer);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public static int getCountPlayer() {
        return countPlayer;
    }

    public static void setCountPlayer(int countPlayer) {
        Player.countPlayer = countPlayer;
    }
}
