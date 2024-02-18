# Application de Console Java pour Poupées Russes

Ce projet est une application Java console qui simule l'emboîtement et l'interaction des poupées russes de différentes tailles. Chaque poupée peut être ouverte ou fermée, peut contenir une autre poupée et peut être contenue dans une autre poupée. Il est divisé en deux parties : La partie 1 se concentre sur les concepts OOP de Java, tandis que la partie 2 se penche sur les principes de conception UML.

## Partie 1: Java OOP

Dans cette section, les classes fondamentales de la hiérarchie des poupées russes sont développées.

### Classe de Base: Poupee

- Représente la base de la hiérarchie des poupées.
- Encapsule les propriétés communes à toutes les poupées : taille et si la poupée est ouverte.
- Possède un constructeur pour initialiser une poupée avec une taille donnée.
- Les propriétés sont encapsulées et accessibles via des méthodes.
- Doit avoir les méthodes abstraites suivantes :

    1. `void ouvrir()`: Ouvre la poupée.
    2. `void fermer()`: Ferme la poupée.
    3. `void placerDans(Poupee p)`: Place la poupée courante dans la poupée `p`.
    4. `void sortirDe(Poupee p)`: Retire la poupée courante de la poupée `p`.

### Classe Concrète: PoupéeRusse

- Hérite de la classe de base Poupee et implémente les méthodes spécifiques.
- Le constructeur de PoupéeRusse doit appeler le constructeur de la classe de base.
- Les méthodes `ouvrir`, `fermer`, `placerDans` et `sortirDe` doivent être implémentées selon les spécifications de la classe de base.

## Partie 2: Conception UML

Dans cette section, un modèle UML est développé pour gérer la collection de poupées russes.

### Diagramme de Classes:

- **Collectionneur**: Représente un collectionneur de poupées russes. Il a des attributs tels que nom, adresse et nombre de poupées dans la collection. Il possède également des méthodes comme ajouterPoupée() et supprimerPoupée().
- **PoupéeRusse**: Représente une poupée russe dans la collection. Contient des attributs comme taille, couleur et année de fabrication. Il a des méthodes comme ouvrir(), fermer() et vérifierContenu().
- **Collection**: Représente la collection de poupées russes du collectionneur. Il possède des attributs comme nombreTotal et des méthodes comme ajouterPoupée(), supprimerPoupée() et afficherCollection().

### Diagramme de Cas d'Utilisation:

- **Ajouter une Poupée**: Le collectionneur peut ajouter une nouvelle poupée russe à sa collection.
- **Supprimer une Poupée**: Le collectionneur peut retirer une poupée russe de sa collection.
- **Vérifier le Contenu**: Le collectionneur peut vérifier si une poupée russe donnée contient une autre poupée.
- **Afficher la Collection**: Le collectionneur peut voir toutes les poupées russes de sa collection.

### Diagramme de Séquence:

- Le Collectionneur ajoute une nouvelle poupée russe à sa collection.
- Le système vérifie si la poupée russe est déjà présente dans la collection.
- Si non, la poupée russe est ajoutée à la collection.
- Le système confirme l'ajout au Collectionneur.

## Comment exécuter

1. Cloner le dépôt : `git clone https://github.com/ChaimaaLachhab/PoupesRusses.git`
2. Ouvrir un terminal et naviguer vers le répertoire du projet.
3. Compiler les fichiers Java : `javac Main.java`.
4. Exécuter l'application : `java Main`.

## Auteur

- **CHAIMAA LACHHAB** - [Chaimaa Lachhab](https://github.com/ChaimaaLachhab, sous la supervision de l'école ENAA Béni Mellal.
