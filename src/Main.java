public class Main {

    public static void main(String[] args) {
        FcBarcelona fcbarcelona = new FcBarcelona("FC Barcelona");
        RealMadrid realMadrid =new RealMadrid("Real Madrid");
        Zimbru zimbru = new Zimbru("Zimbru");
        Dacia dacia = new Dacia("Dacia");

        BotanicaBascketballTeam botanicaBascketballTeam = new BotanicaBascketballTeam("Botanica Bascketball Team");
        CiocanaBascketballTeam ciocanaBascketballTeam = new CiocanaBascketballTeam("Ciocana Bascketball Team");
        RiscaniBscketballTeam riscaniBscketballTeam = new RiscaniBscketballTeam("Riscani Bascketball Team");
        CentruBascketballTeam centruBascketballTeam =new CentruBascketballTeam("Centru Bascketball Team");

        League<Football> footballLeague = new League("Football");
        footballLeague.addTeamToLeague(fcbarcelona);
        footballLeague.addTeamToLeague(realMadrid);
        footballLeague.addTeamToLeague(zimbru);
        footballLeague.addTeamToLeague(dacia);
        footballLeague.displayLeague();

        League<BascketBall> bascketBallLeague= new League("Bascketball");
        bascketBallLeague.addTeamToLeague(botanicaBascketballTeam);
        bascketBallLeague.addTeamToLeague(ciocanaBascketballTeam);
        bascketBallLeague.addTeamToLeague(riscaniBscketballTeam);
        bascketBallLeague.addTeamToLeague(centruBascketballTeam);
        bascketBallLeague.displayLeague();
    }
}
