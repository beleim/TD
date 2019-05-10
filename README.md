# Exercice  : du polymorphisme dans une facture
La société établit des factures numérotées (en partant de 1) et datées, comprenant le nom du client, le prix total de la commande et, pour chaque article commandé, sa référence, son prix unitaire, le nombre d'articles commandés et le prix total pour cet article. 
Pour simplifier, un client ne sera qu'un simple nom dans la facture (pas de classe Client).
Ajoutez les classes pour représenter ces factures.

Vous écrirez une classe test qui affiche 1 facture pour

10 stylos (choisissez ses caractéristiques)
15 ramettes de papier
2 lots de 5 stylos (différents des 10 stylos)
et une autre facture pour
3 stylos
2 ramettes
pour 2 clients différents. 
Le programme créera tous les objets nécessaires à l'affichage des 2 factures. 
Une facture s'affichera sur le modèle suivant (on ne demande pas d'affiner davantage le format d'affichage mais si vous pouvez faire mieux, n'hésitez pas !) : 
--------------------------------------------------------------------- 
Facture 125  Client: Toto  Date: 10 novembre 1999
Quant.  Ref.    Nom             Marque      PU      PT 
10        s1      Stylo Jade       Watertruc       500.0  5000.0 
15        r1      Ramette haute qualité  Clairefont    95.0    1425.0 
2        l1       Lot de 5 Stylo or    Marker 4500.0  9000.0

Prix total facture : 15425.0 F 
---------------------------------------------------------------------

Si vous le souhaitez, vous pouvez utiliser cette classe TestFacture. 
