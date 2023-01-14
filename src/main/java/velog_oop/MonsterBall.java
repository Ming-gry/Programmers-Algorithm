package velog_oop;

public class MonsterBall {

    private String ballName;
    private Pokemon pokemon;

    public void capturePokemon(Pokemon pokemon){
        this.pokemon = pokemon;
        this.ballName = pokemon.getName() + "ball";
    }

    public String getBallName(){
        return ballName;
    }

    public Pokemon getPokemon(){
        return pokemon;
    }

    public static void main(String[] args) {
        MonsterBall monsterBall = new MonsterBall();

        Pichu pichu = new Pichu("chu", 1, "10k");
        System.out.println(pichu.getName() + "발사! " + pichu.attack());
        System.out.println(pichu.getName() + "꼬리 누르기! " + pichu.tailPress());
        System.out.println(pichu.getName() + "썬더 스톰! " + pichu.thunderStorm());
        System.out.println("---------------------------------------------------");

        pichu = new Pikachu("pika", 4, "100k");
        System.out.println(pichu.getName() + "발사! " + pichu.attack());
        System.out.println(pichu.getName() + "꼬리 누르기! " + pichu.tailPress());
        System.out.println(pichu.getName() + "썬더 스톰! " + pichu.thunderStorm());
        System.out.println("---------------------------------------------------");

        pichu = new Raichu("Rai", 8, "1000k");
        System.out.println(pichu.getName() + "발사! " + pichu.attack());
        System.out.println(pichu.getName() + "꼬리 누르기! " + pichu.tailPress());
        System.out.println(pichu.getName() + "썬더 스톰! " + pichu.thunderStorm());
        System.out.println("---------------------------------------------------");

        monsterBall.capturePokemon(pichu);
        System.out.println(monsterBall.getBallName());
        System.out.println(monsterBall.pokemon + "의 꼬리 길이는 " + monsterBall.pokemon.getLengthOfTail());
        System.out.println("---------------------------------------------------");

        Pichu myPichu = (Pichu) monsterBall.getPokemon();
        System.out.println(myPichu.getName() + "발사! " + myPichu.attack());
        System.out.println(myPichu.getName() + "꼬리 누르기! " + myPichu.tailPress());
        System.out.println(myPichu.getName() + "썬더 스톰! " + myPichu.thunderStorm());
    }
}
