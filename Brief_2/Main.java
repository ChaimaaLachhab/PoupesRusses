import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PoupeeRusse doll1 = new PoupeeRusse("Doll 1", false, 2);
        PoupeeRusse doll2 = new PoupeeRusse("Doll 2", false, 4);
        PoupeeRusse doll3 = new PoupeeRusse("Doll 3", false, 6);

        int Choix;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println();
            System.out.println("+------------------------------------+Bienvenue dans Le jeu Poupée Russe+------------------------------------+");
            System.out.println("|                                                                                                            |");
            System.out.println("|                                      1. Afficher les poupée.                                               |");
            System.out.println("|                                      2. Commencer le jeu.                                                  |");
            System.out.println("|                                      3. Quitter le jeu.                                                    |");
            System.out.println("|                                                                                                            |");
            System.out.println("+------------------------------------------------------------------------------------------------------------+");
            System.out.print("          Entrez un choix : ");
            Choix = scanner.nextInt();
            switch (Choix) {
                case 1:
                    System.out.println();
                    System.out.println("+------------------------------------+La liste des poupées disponible+------------------------------------+");
                    System.out.println();
                    System.out.println("|+------    Poupée Russe 1 :");
                    System.out.println("|NOM : " + doll1.getName() + "  |  isOpen : " + doll1.isOpen() + "  |  Taille : " + doll1.getTaille());
                    System.out.println();
                    System.out.println("|+------    Poupée Russe 2 :");
                    System.out.println("|NOM : " + doll2.getName() + "  |  isOpen : " + doll2.isOpen() + "  |  Taille : " + doll2.getTaille());
                    System.out.println();
                    System.out.println("|+------    Poupée Russe 3 :");
                    System.out.println("|NOM : " + doll3.getName() + "  |  isOpen : " + doll3.isOpen() + "  |  Taille : " + doll3.getTaille());
                    System.out.println();
                    System.out.println("+---------------------------------------------------------------------------------------------------------+");
                    System.out.println();
                    break;
                case 2:
                    int ChoixGame;
                    do {
                        Scanner g = new Scanner(System.in);
                        System.out.println();
                        System.out.println("+------------------------------------+Aller, jouer poupée russe+------------------------------------+");
                        System.out.println("|                                                                                                   |");
                        System.out.println("|                                    1. Ouvrir une poupée.                                          |");
                        System.out.println("|                                    2. Fermer une poupée.                                          |");
                        System.out.println("|                                    3. Placer dans.                                                |");
                        System.out.println("|                                    4. Sortir de.                                                  |");
                        System.out.println("|                                    5. Retourner au menu.                                          |");
                        System.out.println("|                                                                                                   |");
                        System.out.println("+---------------------------------------------------------------------------------------------------+");
                        System.out.print("          Entrez un choix : ");
                        ChoixGame = g.nextInt();
                        switch (ChoixGame) {
                            case 1:
                                int ChoixOpen;
                                System.out.println();
                                System.out.println("+------------------------------------+ouvrir une Poupée Russe+------------------------------------+");
                                System.out.println("|                                                                                                 |");
                                System.out.println("|                               choisir la poupée a ouvrir 1,2 ou 3                               |");
                                System.out.println("|                                                                                                 |");
                                System.out.println("+-------------------------------------------------------------------------------------------------+");
                                System.out.print("          Entrez un choix : ");
                                ChoixOpen = g.nextInt();
                                switch (ChoixOpen) {
                                    case 1:
                                        doll1.open();
                                        break;
                                    case 2:
                                        doll2.open();
                                        break;
                                    case 3:
                                        doll3.open();
                                        break;
                                    default:
                                        System.out.println("|                                    Entrez un choix valid !                                      |");
                                        break;
                                }
                                break;
                            case 2:
                                int ChoixClose;
                                System.out.println();
                                System.out.println("+------------------------------------+fermer une Poupée Russe+------------------------------------+");
                                System.out.println("|                                                                                                 |");
                                System.out.println("|                              choisir la poupée a fermer 1,2 ou 3                                |");
                                System.out.println("|                                                                                                 |");
                                System.out.println("+-------------------------------------------------------------------------------------------------+");
                                System.out.print("          Entrez un choix : ");
                                ChoixClose = g.nextInt();
                                switch (ChoixClose) {
                                    case 1:
                                        doll1.close();
                                        break;
                                    case 2:
                                        doll2.close();
                                        break;
                                    case 3:
                                        doll3.close();
                                        break;
                                    default:
                                        System.out.println("|                                    Entrez un choix valid !                                      |");
                                        break;
                                }
                                break;
                            case 3:
                                int ChoixPlaceIn;
                                System.out.println();
                                System.out.println("+------------------------------------+Placer une Poupée Russe+------------------------------------+");
                                System.out.println("|                                                                                                 |");
                                System.out.println("|                                 1. Placer poupée 1 dans poupée 2.                               |");
                                System.out.println("|                                 2. Placer poupée 1 dans poupée 3.                               |");
                                System.out.println("|                                 3. Placer poupée 2 dans poupée 1.                               |");
                                System.out.println("|                                 4. Placer poupée 2 dans poupée 3.                               |");
                                System.out.println("|                                 5. Placer poupée 3 dans poupée 1.                               |");
                                System.out.println("|                                 6. Placer poupée 3 dans poupée 2.                               |");
                                System.out.println("|                                                                                                 |");
                                System.out.println("+-------------------------------------------------------------------------------------------------+");
                                System.out.print("          Entrez un choix : ");
                                ChoixPlaceIn = g.nextInt();
                                switch (ChoixPlaceIn) {
                                    case 1:
                                        doll1.placeIn(doll2);
                                        break;
                                    case 2:
                                        doll1.placeIn(doll3);
                                        break;
                                    case 3:
                                        doll2.placeIn(doll1);
                                        break;
                                    case 4:
                                        doll2.placeIn(doll3);
                                        break;
                                    case 5:
                                        doll3.placeIn(doll1);
                                        break;
                                    case 6:
                                        doll3.placeIn(doll2);
                                        break;
                                    default:
                                        System.out.println("|                                    Entrez un choix valid !                                      |");
                                        break;
                                }
                                break;
                            case 4:
                                int ChoixLeave;
                                System.out.println();
                                System.out.println("+------------------------------------+Sortir une Poupée Russe+------------------------------------+");
                                System.out.println("|                                                                                                 |");
                                System.out.println("|                                  1. Sortir poupée 1 dans poupée 2.                              |");
                                System.out.println("|                                  2. Sortir poupée 1 dans poupée 3.                              |");
                                System.out.println("|                                  3. Sortir poupée 2 dans poupée 1.                              |");
                                System.out.println("|                                  4. Sortir poupée 2 dans poupée 3.                              |");
                                System.out.println("|                                  5. Sortir poupée 3 dans poupée 1.                              |");
                                System.out.println("|                                  6. Sortir poupée 3 dans poupée 2.                              |");
                                System.out.println("|                                                                                                 |");
                                System.out.println("+-------------------------------------------------------------------------------------------------+");
                                System.out.print("          Entrez un choix : ");
                                ChoixLeave = g.nextInt();
                                switch (ChoixLeave) {
                                    case 1:
                                        doll1.getOutOf(doll2);
                                        break;
                                    case 2:
                                        doll1.getOutOf(doll3);
                                        break;
                                    case 3:
                                        doll2.getOutOf(doll1);
                                        break;
                                    case 4:
                                        doll2.getOutOf(doll3);
                                        break;
                                    case 5:
                                        doll3.getOutOf(doll1);
                                        break;
                                    case 6:
                                        doll3.getOutOf(doll2);
                                        break;
                                    default:
                                        System.out.println("|                                    Entrez un choix valid !                                      |");
                                        break;
                                }
                                break;
                            case 5:
                                System.out.println("return à Menu principal");
                                break;
                            default:
                                System.out.println("|                                    Entrez un choix valid !                                      |");
                                break;
                        }
                    } while (ChoixGame != 5);
                    break;
                case 3:
                    System.out.println();
                    System.out.println("+------------------------------------+Vous avez quitté le jeu, à bientot+------------------------------------+");
                    System.out.println();
                    break;
                default:
                    System.out.println("|                                    Entrez un choix valid !                                      |");
                    break;
            }
        } while (Choix != 3);

    }

}

