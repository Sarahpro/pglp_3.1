# pglp_3.1

#Question 1: Cette classe respecte_t_elle SRP ? Pourquoi ?

La classe Employe ne respecte pas SRP car elle possède deux responsabilités:
- calculSalaire()
-afficheCoordonnees()
Par conséquent un changement de l'une de ses responsabilités peut perturber le service de l'autre. Ces deux responsabilités étant indépendante d'une de l'autre ( le calcule du salaire ne dois pas perturber l'affichage des coordonnées de l'employer et vis-versa) la classe ne respecte pas SRP.

#Question 2: Que se passe-t-il si la méthode du salaire change?

Si la méthode du salaire change le service de l'affichage des coordonnees sera perturbé.

#Question 3:Que se passe-t-il si l'affichage est remplacé par le stockage dans un fichier CSV?


#Question 4: Proposer une solution en respectant la SRP.

Afin de respecter la SRP, il faut utiliser une classe possédant la méthode afficheCoordonnees() 

