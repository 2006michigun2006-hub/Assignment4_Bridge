public class Main {
    public static void main(String[] args) {
        OrganImplementation bioImpl = new BiologicalHeart();
        OrganImplementation mechImpl = new MechanicalHeart();

        Heart bioHeart = new Heart("Red", "Dimash", 5, 1337228, bioImpl);
        Heart mechHeart = new Heart("Grey", "RoboBeka", 10, 1488228, mechImpl);

        bioHeart.votHeart();
        bioHeart.operate();
        mechHeart.votHeart();
        mechHeart.operate();
    }
}