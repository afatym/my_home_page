package hamoi.tower.afatym.game;

 class GameStartMenuRule extends AbstractGameMenuItem{
    protected GameStartMenuRule(String id, String name) {
        super(id, name);
    }

    @Override
    protected void doItem() {
        System.out.println("Даны три стержня, на один из которых нанизаны кольца, которые отличаются размером и лежат меньшее на большем.\n" +
                "Задача состоит в том, чтобы перенести пирамиду из колец за наименьшее число ходов на третий стержень.\n" +
                "За один раз разрешается переносить только одно кольцо, причём нельзя класть большее кольцо на меньшее.");
    }

}
